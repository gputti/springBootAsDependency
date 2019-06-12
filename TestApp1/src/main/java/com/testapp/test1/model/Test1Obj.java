package com.testapp.test1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.testapp.test2.model.Test2Obj;

@Entity
@Table(name = "TEST1_TABLE")
public class Test1Obj {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "NAME")
   private String name;

   @Column(name = "TITLE")
   private String title;

   @Column(name = "SUMMARY")
   private String summary;

   @Column(name = "DURATION")
   private int duration;


   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getDuration() {
      return duration;
   }

   public void setDuration(int duration) {
      this.duration = duration;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return summary;
   }

   public void setDescription(String description) {
      this.summary = description;
   }
   
   public static Test1Obj getMeAnObj() {
	   Test1Obj obj = new Test1Obj( );
	   obj.name = "test1 project";
	   obj.duration = 10;
	   obj.summary = "test1 app db entity object";
	   String timeStamp = new java.text.SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	   obj.title = "test1 title - " + timeStamp ;
	   
	   return obj;
   }

   
   public String toString( ) {
	   return  id + ", " + title ; 
   }
}