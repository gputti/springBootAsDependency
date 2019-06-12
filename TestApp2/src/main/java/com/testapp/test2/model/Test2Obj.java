package com.testapp.test2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEST2_TABLE")
public class Test2Obj {

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
   
   public static Test2Obj getMeAnObj() {
	   Test2Obj sc = new Test2Obj( );
	   sc.name = "some name";
	   sc.duration = 10;
	   sc.summary = "test2 app db entity object";
	   String timeStamp = new java.text.SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
	   sc.title = "test2 title - " + timeStamp ;
	   
	   return sc;
   }
   
   public String toString( ) {
	   return  id + ", " + title ; 
   }
   
}