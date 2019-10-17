package com.wew.exercise.zk.demo1017;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public class CuratorDemo {
    private static String CONNECTION_STRING="192.168.138.102:2181";
    public static void main(String[] args) {
//        CuratorFramework curatorFramework = CuratorFrameworkFactory.newClient()
        CuratorFramework curatorFramework = CuratorFrameworkFactory.builder().
                connectString(CONNECTION_STRING).sessionTimeoutMs(5000).
                retryPolicy(new ExponentialBackoffRetry(1000,3)).build();
        curatorFramework.start();//启动

        //crud
    }
}
