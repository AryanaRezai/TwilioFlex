package com.foundation.selenium;

//import cucumber.deps.com.thoughtworks.xstream.core.util.Base64Encoder;
//import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.StringWriter;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

@Component
@Scope("thread")
public class SauceRestClient {
//	protected String username;
//    protected String accessKey;
//    public static final String RESTURL = "";
//
//    public SauceRestClient() {
//    	System.out.println("\n***** SauceRestClient ******");
//        this.username = System.getProperty("SAUCE_USER","");
//        this.accessKey = System.getProperty("SAUCE_KEY","");
//    }
//
//    public SauceRestClient(String username, String accessKey) {
//        this.username = username;
//        this.accessKey = accessKey;
//    }
//
//    public void jobPassed(String jobId) throws IOException {
//        Map<String, Object> updates = new HashMap<String, Object>();
//        updates.put("passed", true);
//        updateJobInfo(jobId, updates);
//    }
//
//    public void jobFailed(String jobId) throws IOException {
//        Map<String, Object> updates = new HashMap<String, Object>();
//        updates.put("passed", false);
//        updateJobInfo(jobId, updates);
//    }
//
//    public void scenarioName(String jobId, String name) throws IOException {
//    	System.out.println("SauceRestClient scenarioName: " + name);
//        Map<String, Object> updates = new HashMap<String, Object>();
//        updates.put("name", "Scenario: " + name);
//        updateJobInfo(jobId, updates);
//    }
//
//    public void addTags(String jobId, String...  tags) throws IOException {
//    	System.out.println("SauceRestClient tags: " + tags);
//        Map<String, Object> updates = new HashMap<String, Object>();
//        updates.put("tags", tags);
//        updateJobInfo(jobId, updates);
//    }
//
//    public void updateJobInfo(String jobId, Map<String,Object> updates) throws IOException {
//        System.out.println("SauceRestClient jobId: " + jobId);
//        System.out.println("SauceRestClient updates: " + updates);
//    	String url = String.format("https://%s:%s@saucelabs.com/rest/v1/%s/jobs/%s", username, accessKey, username, jobId);
//    	//String url = String.format("https://%s:%s@saucelabs.com/tests/%s", username, accessKey, jobId);
//
//    	URL restEndpoint = new URL(url);
//        String auth = username + ":" + accessKey;
//        Base64Encoder encoder = new Base64Encoder();
//        auth = "Basic " + new String(encoder.encode(auth.getBytes()));
//
//        HttpURLConnection postBack = null;
//        if(System.getProperty("http.proxyHost") != null && System.getProperty("http.proxyPort") != null){
//        	String host = System.getProperty("http.proxyHost");
//			int port = Integer.parseInt(System.getProperty("http.proxyPort"));
//
//        	SocketAddress addr  = new InetSocketAddress(host, port);
//     		Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
//     		postBack = (HttpURLConnection) restEndpoint.openConnection(proxy);
//        } else {
//        	postBack = (HttpURLConnection) restEndpoint.openConnection();
//        }
//
//        System.out.println("SauceRestClient restEndpoint: " + restEndpoint);
//        System.out.println("SauceRestClient updates: " + updates);
//
//        postBack.setDoOutput(true);
//        postBack.setRequestMethod("PUT");
//        postBack.setRequestProperty("Authorization", auth);
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonText = "";
//        StringWriter jsonWriter = new StringWriter();
//        mapper.writeValue(jsonWriter, updates);
//        jsonText = jsonWriter.toString();
//        postBack.getOutputStream().write(jsonText.getBytes());
//        postBack.getInputStream().close();
//    }
}
