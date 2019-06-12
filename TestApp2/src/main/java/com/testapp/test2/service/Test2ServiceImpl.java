package com.testapp.test2.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testapp.test2.model.Test2Obj;
import com.testapp.test2.repository.Test2ObjRepository;



@Service
public class Test2ServiceImpl implements Test2Service {

   @Autowired
   private Test2ObjRepository test2ObjRepository;

   public void setTest2ObjRepository(Test2ObjRepository objRepository) {
      this.test2ObjRepository = objRepository;
   }

   public List<Test2Obj> retrieveObjs() {
      List<Test2Obj> objs = test2ObjRepository.findAll();
      return objs;
   }

   public Test2Obj getObj(Long id) {
      Optional<Test2Obj> optEmp = test2ObjRepository.findById(id);
      if(optEmp != null && optEmp.isPresent() ) return optEmp.get();
      else return null;
      
   }

   public Test2Obj saveObj(Test2Obj obj) {
      return test2ObjRepository.save(obj);
   }

   public void deleteObj(Long id) {
      test2ObjRepository.deleteById(id);
   }

   public void updateObj(Test2Obj obj) {
      test2ObjRepository.save(obj);
   }


}