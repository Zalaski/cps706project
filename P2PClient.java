import java.io.*;
import java.net.*;

public class P2PClient
{
  public static String hostName;
  public static InetAddress hostIP;
  public static int protocolPort;
  
  public static DatagramSocket userSocket;
  public static Socket ListeningSocket = null;
  public static int listeningPort;
  
  public static InetAddress directoryIP;
  public static int directoryProtocolPort;
  
  public static Socket serverSocket = null;
  public static InetAddress serverIP;
  
  public static byte[] sendData = new byte[80];
  public static byte[] receiveData = new byte[80];
  public static DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
  
  public static boolean connected;
  
  public static void main(String args[]) throws Exception 
  {    
    protocolPort = 40245; 
    hostIP = InetAddress.getLocalHost();
    hostName = hostIP.getHostName();
    
    directoryProtocolPort = 40240;
    //directoryIP = InetAddress.getByName("10.16.150.228");
    
    userSocket = new DatagramSocket(protocolPort, hostIP);
    
  }
  public static void connectDHTServer(){
    //conect to dht using indicated udp datagram
  }
  
  public static void hash(String name){
    //use hash function to find server ID(add each character in name) mod 4 + 1 = ID #
    //return ID #
  }
  
  //hash content name into server ID, contact that server and stores content name and client IP into server, keep that record for client 
  public static void informUpdate(){
//    D# =  hash(content name)
//      connect to that specific server through datagram socket
//      send to that server the content name and client IP through packet
//      store name, DHT server, and the server IP in P2P client NOT server
  }

  public static void queryContent(){
//    ID# = hash(content Name)
//      connect with that specific server ID
//      find content name you are searching for, get IP address from table in server
//      if found, return IP address of server
//      if not found
//      search rest of DHT
//      if found, 
//      return IP address of server file was found in
//      else 
//      return 404
//      end if
//      end if
  }
  
  //(contact EACH DHT server to erase all entries by client)
 public static void exit(){
//    contact server 1, search and delete entries by client
//      contact server 2, search and delete entries by client
//      contact server 3, search and delete entries by client
//      contact server 4, search and delete entries by client
  }
}
