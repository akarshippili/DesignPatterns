package com.akarsh.designpatterns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class OracleTest2 {

//    A, B, 10
//    A, C, 12
//    C, D, 10
//    A, B, 10

//    public void getMinPath(List<Edge> edges){
//
//        HashMap<Integer, ArrayList<Edge>> map = new HashMap<>();
//        for(Edge e: edges) {
//            if(!map.containsKey(e.start)) {map.put(e.start, new ArrayList<>());}
//
//            map.get(e.)
//        }
//
//    }


}


class Edge implements Comparable<Edge>{
    public int start;
    public int end;
    public int cost;

    @Override
    public int compareTo(Edge o) {
        return Integer.compare(this.cost, o.cost);
    }
}


//products
//product_id
//product_name
//catagore
//
//
//ratings
//
//product_id
//user_id
//rating
//
//SELECT product_id FROM ratings
//WHERE product_id IN (SELECT product_id FROM products WHERE catagore = ?)
//GROUP BY product_id
//ORDER BY AVG(rating) DESC LIMIT 3;