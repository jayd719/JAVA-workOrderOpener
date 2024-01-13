/**
 *
 */
package com.workOrderOpener;

/**
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println(user());

    }

    public static String user() {
	String splittedData[] = System.getProperty("user.dir").split("/", 4);

	return splittedData[2];
    }

    public static void openFile() {

    }

}
