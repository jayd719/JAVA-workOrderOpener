package com.workOrderOpener;

public class Functions {

    public static Boolean isValidWorkOrder(String workOrder) {
        Boolean isValid = false;

        if ((workOrder.length() == 8) && (workOrder.charAt(5) == '-')) {
            try {
                Integer.parseInt(workOrder.substring(0, 4));
                Integer.parseInt(workOrder.substring(6, 8));
                isValid = true;
            } catch (NumberFormatException e) {
                
            }

        }

        return isValid;
    }

}
