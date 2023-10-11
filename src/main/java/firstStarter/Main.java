package firstStarter;

public class Main {
    public static final String GO = "Поехали!!!";
    public static void main(String[] args) {
        System.out.println(GO);
        Frontend frontend = new Frontend();

        Server server = new Server(8080);


//        Fronted fronted = new Fronted();
//        Server server = new Server(8080);
//        ServletContextHandler context = new ServletContextHandler (ServletContextHandler.SESSIONS);
//        server.setHandler(context);
//        context.addServlet(new ServletHolder(fronted), "/authform");
//        server.start();
//        server.join();




    }
}
