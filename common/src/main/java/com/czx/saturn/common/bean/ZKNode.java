package com.czx.saturn.common.bean;

import org.apache.zookeeper.CreateMode;

public class ZKNode {
    private String path;
    private CreateMode nodeMode;
    private byte[] data;

    public static ZKNode buider(){
        return new ZKNode();
    }

    public ZKNode withPath(String path){
        this.path = path;
        return this;
    }

    public ZKNode withNodeMode(CreateMode mode){
        this.nodeMode = mode;
        return this;
    }

    public ZKNode withData(byte[] data){
        this.data = data;
        return this;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public CreateMode getNodeMode() {
        return nodeMode;
    }

    public void setNodeMode(CreateMode nodeMode) {
        this.nodeMode = nodeMode;
    }
}
