package com.example.demo.config;


public class DataBaseContextHolder {

    public static final String DEFAULT_DS = "primary";

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static void setDB(String db) {
        contextHolder.set(db);
    }

    public static String getDB() {
        return contextHolder.get();
    }

    public static void clearDB() {
        contextHolder.remove();
    }
}
