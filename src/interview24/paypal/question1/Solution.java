package interview24.paypal.question1;

import java.util.Arrays;

public class Solution {

    //RestController class
    // @GetMapping("/employee/{id}")
    // Employee getEmployeeID(@PathVariable int id) {
    //   return service.someBusinessLogic(id);
    //}
    public static void main(String[] args) {
        String[] a = new String[]{"One", "Two"};
        HelloConsumer hc = System.out::println;
        Arrays.stream(a).forEach(hc);

    }
}
