package com.example.faceview.device;

/**
 * Created by gqj3375 on 2015/10/19.
 */
public interface SerialListener {
    public void onSerialReceivce(Serial serial, byte[] data);
}
