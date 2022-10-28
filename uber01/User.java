/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber01;

class User extends Person{
        float money;
        String destinationPlace;
        
        public User(String name, String ubication, float money, String destinationPlace){
            super(name, ubication);
            this.name = name;
            this.ubication = ubication;
            this.money = money;
            this.destinationPlace = destinationPlace;
        }

    User() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public String getNme(){
            return name;
            
        }
        @Override
        public String getUbication(){
            return ubication;
        }
        public float getMoney(){
            return money;
        }
    }
