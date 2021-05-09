package com.company;
import jssc.*;
public class Main {

    public static void main(String[] args) {

            String[] portNames = SerialPortList.getPortNames();
            for (int i = 0; i < portNames.length; i++) {
                System.out.println(portNames[i]);
            }
            SerialPort serialPort = new SerialPort(portNames[0]);
            try {
                serialPort.openPort();//Open serial port
                serialPort.setParams(9600, 8, 1, 0);//Set params.
                byte[] buffer = serialPort.readBytes(10);//Read 10 bytes from serial port
                serialPort.closePort();//Close serial port
            }
            catch (SerialPortException ex) {
                System.out.println(ex);
            }
            System.out.println("Hello World");
        }
	// write your code here
    }

