package com.Repository;

/**
 * @Author: ZhangOcean
 * @Description:
 * @Date: Created in 18:43 2017/11/18
 */
//@Repository
//public class MarksDao {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

//    public void add(MarkModel MarkModel) throws SQLException {
//        Connection conn = DBUtil.getConn();
//
//        String sql = " insert MarksStatistics(projectName, markMax, markMin, markFinal) values(?,?,?,?) ";
//        PreparedStatement psmt = conn.prepareStatement(sql);
//        psmt.setString(1, MarkModel.getProjectName());
//        psmt.setFloat(2,MarkModel.getMarkMax());
//        psmt.setFloat(3,MarkModel.getMarkMin());
//        psmt.setFloat(4,MarkModel.getMarkFinal());
//
//        psmt.execute();
//    }
//
//    public List queryAll() throws SQLException {
//        Connection conn = DBUtil.getConn();
//        String sql = " select * from MarksStatistics ";
//        PreparedStatement psmt = conn.prepareStatement(sql);
//
//        ResultSet rs = psmt.executeQuery();
//
//        List markInfos = new ArrayList();
//        MarkModel MarkModel = null;
//        while(rs.next()) {
//            MarkModel = new MarkModel();
//            MarkModel.setProjectName(rs.getString("projectName"));
//            MarkModel.setMarkMax(rs.getFloat("markMax"));
//            MarkModel.setMarkMin(rs.getFloat("markMin"));
//            MarkModel.setMarkFinal(rs.getFloat("markFinal"));
//            markInfos.add(MarkModel);
//        }
//        return markInfos;
//    }



//}
