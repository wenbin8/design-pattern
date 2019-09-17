package com.wenbin.design.pattern.proxy.staticproxy;

public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("物色对象");
        this.son.findLove();
        System.out.println("双方同意交往，确立关系");
    }
}
