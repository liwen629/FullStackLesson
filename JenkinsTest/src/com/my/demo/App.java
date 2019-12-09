package com.my.demo;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import java.util.Map;

import com.offbytwo.jenkins.JenkinsServer;
import com.offbytwo.jenkins.model.Build;
import com.offbytwo.jenkins.model.BuildWithDetails;
import com.offbytwo.jenkins.model.Job;
import com.offbytwo.jenkins.model.JobWithDetails;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args) throws URISyntaxException, IOException
    {
       
    	
    	//https://www.jianshu.com/p/ae7e003dfb2c REST API
    	//https://github.com/jenkinsci/java-client-api
    	JenkinsServer jenkins = new JenkinsServer(new URI("http://localhost:8080"), "kevin", "Passw0rd");
    	
    	 String script = "node(){ \n" +
                 "echo 'hello world!' \n" +
             "}";
// xml配置文件，且将脚本加入到配置中
       String xml = "<flow-definition plugin=\"workflow-job@2.32\">\n" +
              "<description>测试项目</description>\n" +
              "<definition class=\"org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition\" plugin=\"workflow-cps@2.66\">\n" +
                  "<script>" + script + "</script>\n" +
                  "<sandbox>true</sandbox>\n" +
              "</definition>\n" +
           "</flow-definition>";

    	
    	jenkins.createJob("JavaApiDemo", xml,true);
    	
    	//jenkins.getJob("MyDemo2").build(true);
    	
    	/*
    	
    	Map<String, Job> jobs = jenkins.getJobs();
        JobWithDetails job = jobs.get("MyDemo2").details();
        
        Build lastbuild=job.getLastBuild();
    
        BuildWithDetails buildDetails=lastbuild.details();
        
        if(buildDetails.isBuilding()){
             System.out.println("building");
        }else{
            System.out.println("not building");
        }
    	

    	
  
    	
    	Map<String, Job> jobs = jenkins.getJobs();
        JobWithDetails job = jobs.get("Demo").details();
        
        Build lastbuild=job.getLastBuild();
    
        BuildWithDetails buildDetails=lastbuild.details();
        
        if(buildDetails.isBuilding()){
             System.out.println("鏈?鍚庝竴娆℃瀯寤鸿繕娌″畬鎴愶紝杩樺湪鏋勫缓涓?");
        }else{
            System.out.println("鏈?鍚庝竴娆℃瀯寤哄凡瀹屾垚");
        }
        
 
        System.out.println(lastbuild.getNumber());
        */
      
    	
    	

    }
}
