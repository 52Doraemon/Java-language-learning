package com.hzu.dynamicproxy;

public interface Star {
    //把需要代理的方法定义在接口当中

    //唱歌
    public abstract String sing(String name);

    //跳舞
    public abstract void dance();
}
