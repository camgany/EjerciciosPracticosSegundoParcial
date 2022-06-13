package Ejercicio4.exercise;

public class Client {
    public static void main (String []args){
        WhatsApp whatsApp= new WhatsApp();

        Usuario usuario1 = new Usuario(whatsApp);
        usuario1.setName("Laura");
        usuario1.setCi("1234");


        Usuario usuario2 = new Usuario(whatsApp);
        usuario2.setName("Yoss");
        usuario2.setCi("2344");

        Usuario usuario3 = new Usuario(whatsApp);
        usuario3.setCi("3422");
        usuario3.setName("Salvador");

        Usuario usuario4 = new Usuario(whatsApp);
        usuario4.setCi("8655");
        usuario4.setName("Carla");

        Usuario usuario5 = new Usuario(whatsApp);
        usuario5.setCi("3877");
        usuario5.setName("Zoraya");

        Usuario usuario6 = new Usuario(whatsApp);
        usuario6.setCi("6633");
        usuario6.setName("Rafaela");

        Usuario usuario7 = new Usuario(whatsApp);
        usuario7.setCi("2111");
        usuario7.setName("Mario");

        Usuario usuario8 = new Usuario(whatsApp);
        usuario8.setCi("9989");
        usuario8.setName("Diana");

        Usuario usuario9 = new Usuario(whatsApp);
        usuario9.setCi("9777");
        usuario9.setName("Alejandra");

        Usuario usuario10 = new Usuario(whatsApp);
        usuario10.setCi("5543");
        usuario10.setName("Manu");
        whatsApp.addUsuario(usuario1);
        whatsApp.addUsuario(usuario2);
        whatsApp.addUsuario(usuario3);
        whatsApp.addUsuario(usuario4);
        whatsApp.addUsuario(usuario5);
        whatsApp.addUsuario(usuario6);
        whatsApp.addUsuario(usuario7);
        whatsApp.addUsuario(usuario8);
        whatsApp.addUsuario(usuario9);
        whatsApp.addUsuario(usuario10);
        usuario1.send("Hello from Lambda!", "1 a 1",usuario2);
        usuario10.send("Hi everyone!", "todos",null);










    }

}