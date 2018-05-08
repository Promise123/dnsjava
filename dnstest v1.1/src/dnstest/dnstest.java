package dnstest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import dnstest.trans;

public class dnstest {
	public static void sendpocket(String urls,String name) throws IOException{
	    trans strToHex = new trans();  
	    String hex1 = urls;
	    String name1 = name;
	    System.out.println(name1);
		byte[] test = strToHex.convertHexToString(hex1).getBytes();
		InetAddress address = InetAddress.getByName("114.114.114.114");
		int port = 53;
		byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(test, test.length, address, port);
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket outpacket = new DatagramPacket(buffer, buffer.length);
        try {
			for (int i = 0; i <11; i++){
			   int length = 0;
			   long startTime = System.nanoTime();
			   socket.send(packet);
			   socket.receive(outpacket);
			   length = outpacket.getLength();
				   while (true)
				   {
					   if (length !=0||(float)(System.nanoTime()-startTime)>1500000000)
					   {
							 System.out.println((float)(System.nanoTime()-startTime)/1000000000);
							 break;
					   }
					   
				   }
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	
	
	public static void main(String[] args) throws IOException{
		//String ip = CustomSystemUtil.INTRANET_IP;
		//String ip1 = CustomSystemUtil.INTERNET_IP;
		//System.out.println("ip地址："+ip1);
        File f=new File("out.txt");  
        f.createNewFile();  
        FileOutputStream fileOutputStream = new FileOutputStream(f);  
        PrintStream printStream = new PrintStream(fileOutputStream);  
        System.setOut(printStream);  
		String baiduurl = "5c6d010000010000000000000377777705626169647503636f6d0000010001";
		String baidu = "www.baidu.com";
		String wangyiurl ="5c6d01000001000000000000037777770331363303636f6d0000010001";
		String wangyi = "www.163.com";
		String weibourl = "5c6d010000010000000000000377777705776569626f03636f6d0000010001";
		String weibo ="www.weibo.com";
		String taobaourl = "5c6d01000001000000000000037777770674616f62616f03636f6d0000010001";
		String taobao = "www.taobao.com";
		String jdurl = "5c6d0100000100000000000003777777026a6403636f6d0000010001";
		String jd ="www.jd.com";
		String douyuurl = "5c6d010000010000000000000377777705646f75797503636f6d0000010001";
		String douyu = "www.douyu.com";
		String biliurl = "5c6d01000001000000000000037777770862696c6962696c6903636f6d0000010001";
		String bili = "www.bilibili.com";
		String iqiyiurl = "5c6d010000010000000000000377777705697169796903636f6d0000010001";
		String iqiyi ="www.iqiyi.com";
		String sohuurl = "5c6d010000010000000000000377777704736f687503636f6d0000010001";
		String sohu = "www.sohu.com";
		String youkuurl = "5c6d010000010000000000000377777705796f756b7503636f6d0000010001";
		String youku = "www.youku.com";
		try {
			for(int i=0;i<5;i++)
			{
				sendpocket(baiduurl,baidu);
				sendpocket(wangyiurl,wangyi);
				sendpocket(weibourl,weibo);
				sendpocket(taobaourl,taobao);
				sendpocket(jdurl,jd);
				sendpocket(douyuurl,douyu);
				sendpocket(biliurl,bili);
				sendpocket(iqiyiurl,iqiyi);
				sendpocket(sohuurl,sohu);
				sendpocket(youkuurl,youku);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		
	}
	
	
	
}
