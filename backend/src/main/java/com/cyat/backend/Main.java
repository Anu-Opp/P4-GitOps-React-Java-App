package com.cyat.backend;

public class Main {
    public static void main(String[] args) {
        System.out.println("Backend service for GitOps project running...");
        
        // Keep the application running
        try {
            Thread.sleep(Long.MAX_VALUE);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}