/**
 *
 */
package com.workOrderOpener;

/**
 *
 */
public class Main {

    /**1
     * @param args
     */
    public static void main(String[] args) {

        Model model = new Model();

        System.out.println(Functions.isValidWorkOrder("19121-01"));
	// TODO Auto-generated method stub
	System.out.println(user());

    }

    public static String user() {
    String username = System.getProperty("user.name");
    
    return username;
    }

    public static void openFile() {

    }

}
