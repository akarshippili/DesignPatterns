package com.akarsh.designpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        array1=[1,1,2,3,3,4,5,5,6]
//        array2=[1,1,2,3,3,4,5,5,6]
//        array2=[4,4,5,8,7,7,9,4,6]


//        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(1,1,2,3,3,4,5,5,6));
//        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(4,4,5,8,7,7,9,4,6));
//
//        HashSet<Integer> ans = new HashSet<>();
//        for(int num : arrayList1) {
//            boolean found = false;
//            for (int i = 0; i < arrayList2.size(); i++) {
//                if(num == arrayList2.get(i)) {
//                    found = true;
//                }
//            }
//
//            if(!found) {
//                ans.add(num);
//            }
//        }
//
//
//        for(int num : arrayList2) {
//            boolean found = false;
//            for (int i = 0; i < arrayList1.size(); i++) {
//                if(num == arrayList1.get(i)) {
//                    found = true;
//                }
//            }
//
//            if(!found) {
//                ans.add(num);
//            }
//        }
//
//
//        System.out.println(ans);






        int[] arr = {12, 4, 5, 8, 1, 9, 10, 2, 19, 11};
        int maxFoundTillDate = -1;
        int profit = 0;
        for (int index = arr.length-1; index >= 0; index--) {
            if(maxFoundTillDate - arr[index] > profit) {
                profit = maxFoundTillDate - arr[index];
                System.out.println(arr[index] + " -> " + maxFoundTillDate);
            }
            maxFoundTillDate = Math.max(maxFoundTillDate, arr[index]);
        }
        System.out.println(profit + " " + maxFoundTillDate);



















//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> set2 = new HashSet<>();



//        for (int num: arrayList1){
//            set1.add(num);
//        }
//
//        for (int num: arrayList2){
//            set2.add(num);
//        }
//
//        set1.stream()
//                .filter(num -> !set2.contains(num))
//                .forEach(num -> ans.add(num));
//
//        set2.stream()
//                .filter(num -> !set1.contains(num))
//                .forEach(num -> ans.add(num));
//
//        System.out.println(ans);


    }
}
