package com.keyword;

import java.util.EnumMap;

enum JavaSets{HS,LHS,TS}



public class EnumMapContainsValue
{
    public static void main(String[] args)
    {
        EnumMap<JavaSets,String> map = new EnumMap<JavaSets, String>(JavaSets.class);
        map.put(JavaSets.HS,"HashSet");
        map.put(JavaSets.LHS,"LinkedHashSet");
        map.put(JavaSets.TS,"TreeSet");
        System.out.println("The Map is "+map);
        System.out.println((map.containsValue("HashSet"))?"True":"False");
    }
}
