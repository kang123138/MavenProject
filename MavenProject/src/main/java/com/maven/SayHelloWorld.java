package com.atguigu.maven;

public class SayHelloWorld {
    public void say( String who ) {
        System.out.print(who + "say :");
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.hello();
    }
}
