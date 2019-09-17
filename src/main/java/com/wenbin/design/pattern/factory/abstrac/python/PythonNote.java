package com.wenbin.design.pattern.factory.abstrac.python;

import com.wenbin.design.pattern.factory.abstrac.INote;

public class PythonNote implements INote {
    public void edit() {
        System.out.println("编写Python笔记");
    }
}
