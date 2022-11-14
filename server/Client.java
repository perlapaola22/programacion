/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


    class Client {
        String ip;
        int port;
        Socket socket;
        DataInputStream dis;
        DataInputStream dos;
        BufferedInputStream bis;
        
        public Client(int ip, int port){
            this.ip=ip;
            this.port=port;
        }
        public void initsocket() throws IOException{
            socket = new Socket(ip,port);
        }
    
}



