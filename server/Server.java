/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package server;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;


class Server{
    int port;
    ServerSocket server;
    Socket socket;
    DataInputStream dis;
    DataOutputStream dos;
    Vector<ClientHandler> Clients;
    int nClients=0;
    BufferedInputStream bis;
    Thread thread;
    ClientHandler client;
    
    
    public Server(int port){
        this.port=port;
    }
    public void powerUp(){
        try{
            server=new ServerSocket(port);
            while(true){
            socket=server.accept();
            bis=new BufferedInputStream(socket.getInputStream());
            dis=new DataInputStream(bis);
            dos=new DataOutputStream(socket.getOutputStream());
            client = new ClientHandler(socket,dis,dos,"client"+nClients);
            nClients++;
            }
            
        }catch(IOException e){
            System.out.println("No se recibio nada");
            e.printStackTrace();
            
        }
    }
    
    
   // Run|Debug
            public static void main(String arg[]){
                Server server=new Server(12000);
                server.powerUp();
            }
}
    
    class ClientHandler implements Runnable{
        
        Socket socket;
        DataInputStream dis;
        DataOutputStream dos;
        String msg;
        String name;
        
        public ClientHandler(Socket socket,DataInputStream dis, DataOutputStream dos,String msg, String name ){
            this.socket=socket;
            this.dis=dis;
            this.dos=dos;
            this.msg=msg;
            this.name=name;
        }

    @Override
    public void run() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }