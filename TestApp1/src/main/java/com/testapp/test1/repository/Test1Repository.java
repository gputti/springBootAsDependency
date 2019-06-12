package com.testapp.test1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testapp.test1.model.Test1Obj;

/**
 * @author Gopikrishna Putti
 * Apr 4, 2019
 *
 *
 */
public interface Test1Repository extends JpaRepository<Test1Obj, Long> {

}
