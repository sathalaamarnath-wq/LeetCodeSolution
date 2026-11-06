package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
// calling the twosumvalues class
        TwoSumValues twoSumValues = new TwoSumValues();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSumValues.new Solution().twoSum(nums, target);
        if (result.length == 2) {
            System.out.printf("Indices: %d, %d%n", result[0], result[1]);
        }
    }

}