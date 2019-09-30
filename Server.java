public class Server {
	//variables 
	public String projectName;
	public String environment;
	public String application;
	public String host;
	public String ip; 
	public String url;
	public int cpuCore; 
	public int ram;

	//getters 
	public String getProject()
	{
		return projectName;
	}
	public String getEnvironment() {
		return environment;
	}
	public String getApplication() {
		return application;
	}
	public String getHost () {
		return host;
	}
	public String getIp() {
		return ip;
	}
	public String getUrl() {
		return url;
	}
	public int getCpuCore() {
		return cpuCore;
	}
	public int getRam() {
		return ram;
	}
	
	//setters 
	public void setProject(String newProject) {
		projectName= newProject;
	}
	public void setEnvironment(String newEnvironment) {
		environment= newEnvironment;
	}
	public void setApplication(String newApplication) {
		application= newApplication;
	}
	public void setHost(String newHost) {
		host=newHost;
	}
	public void setIp(String newIP) {
		ip=newIP;
	}
	public void setURL(String newUrl) {
		url=newUrl;
	}
	public void setCpuCore(int newCpu) {
		cpuCore = newCpu;
	}
	public void setRam(int newRam) {
		ram=newRam;
	}
	
	//server paramaters 
	public Server (String projectName, String environment , String application, String host, String ip, String url, int cpuCore, int ram)
	{
		this.projectName=projectName;
		this.environment = environment; 
		this.application = application;
		this.host=host;
		this.url=url; 
		this.cpuCore=cpuCore;
		this.ram=ram;
	}
	public String toString() {
		return projectName + " "+ environment+ " " + application + " " + host +" "+ url + " " + cpuCore + " " + ram;
		
	}
	
	
}

