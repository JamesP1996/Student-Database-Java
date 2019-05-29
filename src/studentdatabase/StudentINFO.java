/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;
import java.sql.*;
import java.util.Date;


/**
 *
 * @author IceFox
 */
public class StudentINFO {
    
    
    
   private String StuID;
   private String StuName ;
   private String StuAdd ;
   private String StuDOB ;
   private String StuPhone ;
   private String StuGroup;
   private String StuCourse ;
   
   
    public void setStuID(String StuID) {
       
        
        this.StuID = StuID;
        
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public void setStuAdd(String StuAdd) {
        this.StuAdd = StuAdd;
    }

    public void setStuDOB(String StuDOB) {
        this.StuDOB = StuDOB;
    }

    public void setStuPhone(String StuPhone) {
        this.StuPhone = StuPhone;
    }

    public void setStuGroup(String StuGroup) {
        this.StuGroup = StuGroup;
    }

    public void setStuCourse(String StuCourse) {
        this.StuCourse = StuCourse;
    }
   
    

    public String getStuID() {
        return StuID;
    }

    public String getStuName() {
        return StuName;
    }

    public String getStuAdd() {
        return StuAdd;
    }

    public String getStuDOB() {
        return StuDOB;
    }

    public String getStuPhone() {
        return StuPhone;
    }

    public String getStuGroup() {
        return StuGroup;
    }

    public String getStuCourse() {
        return StuCourse;
    }

   
   
   
   
   
   
   
   
   
}


