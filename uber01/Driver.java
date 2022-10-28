/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber01;


    class Driver extends Person{
        String vehicle;
        float distance;
        
        public Driver(String name, String ubication,String vehicle){
            super(name, ubication);
            this.vehicle = vehicle;
            this.name = name;
            this.ubication = ubication;
        }

    Driver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        @Override
        public String getName(){
            return name;
        }
        @Override
        public String getUbication(){
            return ubication;
        }
        public String getVehicle(){
            return vehicle;
        }
        
    }
    