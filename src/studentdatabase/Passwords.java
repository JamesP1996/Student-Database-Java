/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

/**
 *
 * @author IceFox
 */
public  class  Passwords {
    
    public static class Pass{
    
    private static String AdminPass = "GTIAdmin";
    private static String TeachPass = "GTITeacher";
    

    public static void setTeachPass(String TeachPass) {
        Pass.TeachPass = TeachPass;
    }
    public static void setAdminPass(String AdminPass) {
        Pass.AdminPass = AdminPass;
    }
    public static String getAdminPass() {
        return AdminPass;
    }
       public static String getTeachPass() {
        return TeachPass;
    }
 
}
}