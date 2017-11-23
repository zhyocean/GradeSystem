package com.Jpa;

import com.Model.MarkModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: ZhangOcean
 * @Description:
 * @Date: Created in 15:36 2017/11/19
 */
public interface MarkRepository extends JpaRepository<MarkModel,Integer> {



}
