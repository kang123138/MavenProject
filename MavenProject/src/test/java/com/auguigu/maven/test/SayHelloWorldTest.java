package com.auguigu.maven.test;

import org.junit.Test;

import com.atguigu.maven.SayHelloWorld;

public class SayHelloWorldTest {
    @Test
    public void say() {
        SayHelloWorld say = new SayHelloWorld();
        say.say("I");
    }
}
