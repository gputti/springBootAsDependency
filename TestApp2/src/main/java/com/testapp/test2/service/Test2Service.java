package com.testapp.test2.service;

import java.util.List;

import com.testapp.test2.model.Test2Obj;


public interface Test2Service {
   public List<Test2Obj> retrieveObjs();

   public Test2Obj getObj(Long id);

   public Test2Obj saveObj(Test2Obj obj);

   public void deleteObj(Long id);

   public void updateObj(Test2Obj obj);
   
   
}