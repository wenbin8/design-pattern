package com.wenbin.design.pattern.proxy.jdkproxy;

import com.wenbin.design.pattern.proxy.staticproxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

public class JDKProxyOutputTest {

    public static void main(String[] args) throws IOException {
        Person obj = (Person) new JDKMeipo().getInstance(new Girl());
        obj.findLove();

        byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        FileOutputStream os = new FileOutputStream("/Users/dongwenbin/github/design-pattern/$Proxy0.class");

        os.write(bytes);
        os.close();
    }
}
