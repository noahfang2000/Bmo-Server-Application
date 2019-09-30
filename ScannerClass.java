import java.util.Scanner;

import java.util.*;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
public class ScannerClass {

public static void main(String[] args) {
		 
		Dictionary<String,Server> Servers = new Hashtable<String,Server>();
		
		String ex = new String ("exit");
		String v = new String("view");
		String a = new String("add");
		String e = new String ("edit");
		String r = new String ("remove");
		String pname = new String ("projectname");
		String en = new String ("environment");
		String ap = new String ("application");
		String ho = new String ("host");
		String ipe = new String ("ip");
		String urle = new String ("url");
		String cpue = new String ("cpu");
		String rame = new String ("ram");
	
		Scanner myObj = new Scanner(System.in);
		
for (;;)	{	
		System.out.print("Would you like to view, add, edit, or remove a server?");
		
		String choice = myObj.nextLine();
		
			if (choice.equals(a)) {
				System.out.println("projectname: ");
				String pn = myObj.nextLine();
				
				System.out.println("environment");
				String env= myObj.nextLine();
				
				System.out.println("application:");
				String app = myObj.nextLine();
				
				System.out.println("host: ");
				String host = myObj.nextLine();
				
				System.out.println("ip: ");
				String ip = myObj.nextLine();
				
				System.out.println("url: ");
				String url = myObj.nextLine();
				
				System.out.println("Cpu: ");
				int cpu = myObj.nextInt();
				
				System.out.println("ram: ");
				int ram = myObj.nextInt();
				
				System.out.println("The server has been added with the key "+pn);
				Server placeholder = new Server(pn,env,app,host,ip,url,cpu,ram);
				Servers.put(pn,placeholder);
				
			}
			if (choice.equals(v)) {
				System.out.println("Please input the projectname");
				String nm = myObj.nextLine();
				System.out.println(Servers.get(nm).toString());
			}
			if (choice.equals(r)) {
				System.out.println("Please input the project name");
				String nme = myObj.nextLine();
				Servers.remove(nme);
				System.out.println("The server with project name "+nme+"has been removed");
			}
			if (choice.equals(e)) {
				System.out.println("Please input the project name");
				String nmee = myObj.nextLine();
				Servers.get(nmee);
				
				System.out.println("What would you like to edit");
				String ec = myObj.nextLine();
				
				if (ec.equals(pname)) {
					System.out.println("What would you like to change it to ");
					String pcha = myObj.nextLine();
					Servers.get(nmee).setProject(pcha);
					Servers.put(pcha,Servers.remove(nmee));
				}
				if (ec.equals(en)) {
					System.out.println("What would you like to change it to ");
					String enc = myObj.nextLine();
					Servers.get(nmee).setEnvironment(enc);
					 
				}
				
				if (ec.equals(ap)) {
					System.out.println("What would you like to change it to ");
					String ape = myObj.nextLine();
					Servers.get(nmee).setApplication(ape);
				}
				
				if (ec.equals(ho)) {
					System.out.println("What would you like to change it to ");
					String hoc = myObj.nextLine();
					Servers.get(nmee).setHost(hoc);
				}
				if (ec.equals(ipe)) {
					System.out.println("What would you like to change it to ");
					String ipec = myObj.nextLine();
					Servers.get(nmee).setIp(ipec);
				}
				if (ec.equals(urle)) {
					System.out.println("What would you like to change it to ");
					String urlec = myObj.nextLine();
					Servers.get(nmee).setURL(urlec);
					
				}
				if (ec.contentEquals(rame)) {
					System.out.println("What would you like to change it to ");
					int ramec = myObj.nextInt();
					Servers.get(nmee).setRam(ramec);
				}
				if (ec.contentEquals(cpue)) {
					System.out.println("What would you like to change it to ");
					int cpuec = myObj.nextInt();
					Servers.get(nmee).setCpuCore(cpuec);
				}
			}
		if (choice.equals(ex)){
			System.exit(0);
		}
			
		
				
	}
	}

} 
