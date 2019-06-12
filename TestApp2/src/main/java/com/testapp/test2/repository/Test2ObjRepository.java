package com.testapp.test2.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapp.test2.model.Test2Obj;


@Repository
public interface Test2ObjRepository extends JpaRepository<Test2Obj, Long> {

   

}
