package ro.ubb.dp1819.lab1.home;

import ro.ubb.dp1819.lab1.home.factory.CoffeeType;

public class HomeMain {

    public static void main(String[] args) {
//        Service1 service1 = new Service1("D:\\GitWorkspace\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\home\\data.in");
//        service1.run();
//        Service2 service2 = new Service2("D:\\GitWorkspace\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\home\\data.in");
//        service2.run();

        Service3 service3 = new Service3("D:\\GitWorkspace\\ubb.dp.1819\\src\\main\\java\\ro\\ubb\\dp1819\\lab1\\home\\data.in");
        for (CoffeeType type: service3.run()){
            System.out.println(type);
        }

    }
}
