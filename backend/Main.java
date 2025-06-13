package com.cyat.backend;

import java.io.*;
import java.net.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a simple HTTP server
            ServerSocket serverSocket = new ServerSocket(8080);
            System.out.println("CEEYIT Backend Server started on port 8080");
            
            while (true) {
                Socket clientSocket = serverSocket.accept();
                
                // Read the request
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String inputLine = in.readLine();
                
                // Send HTTP response
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/html");
                out.println("Connection: close");
                out.println();
                
                // Send HTML response
                out.println("<!DOCTYPE html>");
                out.println("<html><head><title>CEEYIT Backend</title>");
                out.println("<style>body{font-family:Arial;text-align:center;margin-top:100px;background:#f8f9fa}</style>");
                out.println("</head><body>");
                out.println("<h1 style='color:#28a745'>🚀 CEEYIT Backend Service</h1>");
                out.println("<h2>✅ Java Backend is Running Successfully!</h2>");
                out.println("<p><strong>Server Time:</strong> " + LocalDateTime.now() + "</p>");
                out.println("<p><strong>Status:</strong> GitOps Deployment Active</p>");
                out.println("<p><strong>Managed by:</strong> ArgoCD + Kubernetes</p>");
                out.println("<div style='margin-top:30px;padding:20px;background:#e8f5e8;border-radius:10px;display:inline-block'>");
                out.println("<h3>🏆 Project 4 Backend Complete!</h3>");
                out.println("<p>✅ Docker Container Running</p>");
                out.println("<p>✅ Kubernetes Deployment Active</p>");
                out.println("<p>✅ Load Balancer Accessible</p>");
                out.println("</div></body></html>");
                
                clientSocket.close();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
