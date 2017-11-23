package com.Controller;

import com.Jpa.MarkRepository;
import com.Model.MarkModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: ZhangOcean
 * @Description:
 * @Date: Created in 15:29 2017/11/17
 */

@Controller
public class MarkingSystem {

    @Autowired
    private MarkRepository markRepository;

    @RequestMapping("/")
    public String index() {

        return "welcome";
    }

    @RequestMapping("/submit")
    public String getMarks(HttpServletRequest request, Model model) {

        String projectName = request.getParameter("projectName");
        List marksArray = new ArrayList();
        List<MarkModel> marksInDB = new ArrayList<>();

//        MarksDao markDao = new MarksDao();

        float group11 = Float.parseFloat(request.getParameter("group11"));
        float group12 = Float.parseFloat(request.getParameter("group12"));
        float group13 = Float.parseFloat(request.getParameter("group13"));
        float group14 = Float.parseFloat(request.getParameter("group14"));
        float sum1 = group11 + group12 +group13 +group14;
        marksArray.add(sum1);

        float group21 = Float.parseFloat(request.getParameter("group21"));
        float group22 = Float.parseFloat(request.getParameter("group22"));
        float group23 = Float.parseFloat(request.getParameter("group23"));
        float group24 = Float.parseFloat(request.getParameter("group24"));
        float sum2 = group21 + group22 +group23 +group24;
        marksArray.add(sum2);

        float group31 = Float.parseFloat(request.getParameter("group31"));
        float group32 = Float.parseFloat(request.getParameter("group32"));
        float group33 = Float.parseFloat(request.getParameter("group33"));
        float group34 = Float.parseFloat(request.getParameter("group34"));
        float sum3 = group31 + group32 +group33 +group34;
        marksArray.add(sum3);

        float group41 = Float.parseFloat(request.getParameter("group41"));
        float group42 = Float.parseFloat(request.getParameter("group42"));
        float group43 = Float.parseFloat(request.getParameter("group43"));
        float group44 = Float.parseFloat(request.getParameter("group44"));
        float sum4 = group41 + group42 +group43 +group44;
        marksArray.add(sum4);

        float group51 = Float.parseFloat(request.getParameter("group51"));
        float group52 = Float.parseFloat(request.getParameter("group52"));
        float group53 = Float.parseFloat(request.getParameter("group53"));
        float group54 = Float.parseFloat(request.getParameter("group54"));
        float sum5 = group51 + group52 +group53 +group54;
        marksArray.add(sum5);

        float group61 = Float.parseFloat(request.getParameter("group61"));
        float group62 = Float.parseFloat(request.getParameter("group62"));
        float group63 = Float.parseFloat(request.getParameter("group63"));
        float group64 = Float.parseFloat(request.getParameter("group64"));
        float sum6 = group61 + group62 +group63 +group64;
        marksArray.add(sum6);

        float group71 = Float.parseFloat(request.getParameter("group71"));
        float group72 = Float.parseFloat(request.getParameter("group72"));
        float group73 = Float.parseFloat(request.getParameter("group73"));
        float group74 = Float.parseFloat(request.getParameter("group74"));
        float sum7 = group71 + group72 +group73 +group74;
        marksArray.add(sum7);

        float group81 = Float.parseFloat(request.getParameter("group81"));
        float group82 = Float.parseFloat(request.getParameter("group82"));
        float group83 = Float.parseFloat(request.getParameter("group83"));
        float group84 = Float.parseFloat(request.getParameter("group84"));
        float sum8 = group81 + group82 +group83 +group84;
        marksArray.add(sum8);

        System.out.println(marksArray);
        Collections.sort(marksArray);
        System.out.println(marksArray);

        for(int i=0;i<marksArray.size();i++) {
            if(i == 0 || i == marksArray.size()-1) {
                marksArray.remove(i);
            } else {
                continue;
            }
        }
        System.out.println(marksArray);

        DecimalFormat df = new DecimalFormat("#.00");
        float markMax = Float.parseFloat(df.format((float) Collections.max(marksArray)));
        float markMin = Float.parseFloat(df.format((float) Collections.min(marksArray)));
        System.out.println(markMax);
        System.out.println(markMin);
        Iterator iterator = marksArray.iterator();
        float sum=0;
        float average;
        while (iterator.hasNext()) {
            float i = (float)iterator.next();
            sum += i;
        }
        average = Float.parseFloat(df.format(sum /marksArray.size()));
        System.out.println(average);

        MarkModel MarkModel = new MarkModel(projectName,markMax,markMin,average);
        markRepository.save(MarkModel);
        marksInDB = markRepository.findAll();

        model.addAttribute("MarkModel",MarkModel);
        model.addAttribute("marksInDB",marksInDB);
//        request.getSession().setAttribute("markModel",MarkModel);
//        request.getSession().setAttribute("marksInDB",marksInDB);

        return "marksView";
    }

    @RequestMapping("/check")
    public String checkMarks(Model model) {
        List<MarkModel> marksInDB = markRepository.findAll();
        model.addAttribute("marksInDB",marksInDB);
        return "marks";
    }

}
