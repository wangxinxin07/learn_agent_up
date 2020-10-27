package com.wxx.learn;

/**
 * @描述:
 * @文件名: AgentTest.java
 * @创建人: wangxinxin
 * @创建时间: 2020/10/27
 * @修改人: wangxinxin
 * @修改备注: <br/>
 * <p>
 */
public class AgentTest {

    public void fun1(){
        System.out.println("fun1 run");
    }

    public void fun2(){
        System.out.println("fun2 run");
    }

    public static void main(String[] args) {
        AgentTest agentTest = new AgentTest();
        agentTest.fun1();
        agentTest.fun2();
    }


}
