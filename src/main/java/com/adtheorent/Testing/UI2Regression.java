package com.adtheorent.Testing;

import java.io.IOException;

import org.apache.http.ParseException;

//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//public class UI2Regression {
//
//	public static void main(String[] args) throws ParseException, IOException {
//	
//		try {
			// Resets Device Configuration
//			DeviceTargeting.ResetDeviceTypes();
//			DeviceTargeting.ResetDeviceCarrier();
//			DeviceTargeting.ResetDeviceWifi();
			// if you want to use these again in the non-static model, you'll need to convert them to instance based, as done in my demo

//			//Calls JSON request that is passed to the bidder
//			LoadJsonRequests();
//			System.out.println("");
//			System.out.println("Sending a MoPub request.  This is expected to Bid.");
//			RequestCSVs.request(JsonRequests.getMopub());
			
			//Setting up Device Targeting
//			System.out.println("");
//			DeviceTargeting.deviceiPADOSiOSv9CarrierAttDevice();
//			DeviceTargeting.DeviceiPADOSiOSv9CarrierAttCarrier();
//			DeviceTargeting.DeviceiPADOSiOSv9CarrierAttWifi();
			
			//Sends request to bidder.  This is expected NOT to bid
//			System.out.println("");
//			System.out.println("Sending a MoPub regular request.  This is expected to NOT Bid.");
//			RequestCSVs.request(JsonRequests.getMopub());
//			System.out.println("");
//			System.out.println("Sending a MoPub request that meets the Device Targeting setting.  This is expected to Bid.");
//			RequestCSVs.request(JsonRequests.getMopubIpad());
		//	System.out.println("");
			
			// Resets Device Configuration
//			DeviceTargeting.ResetDeviceTypes();
//			DeviceTargeting.ResetDeviceCarrier();
//			DeviceTargeting.ResetDeviceWifi();
			// if you want to use these again in the non-static model, you'll need to convert them to instance based, as done in my dem
			
			//System.out.println("Sending a MoPub regular request.  This is expected to Bid.");
			//System.out.println("");
		//	RequestCSVs.request(JsonRequests.getMopub());
			//Sets Device Targeting to IOS9 Tablet and Comcast
			//DeviceTargeting.DeviceiPADOSiOSv9WifiComcast();		
		//	System.out.println("Sending a MoPub request that meets the Device Targeting setting.  This is expected to Bid.");
			//RequestCSVs.request(JsonRequests.getMopubIpadComcast());
			
			
//			DeviceTargeting.ResetDeviceTypes();
//			DeviceTargeting.ResetDeviceCarrier();
//			DeviceTargeting.ResetDeviceWiFi();
//			System.out.println("");
//			DeviceTargeting.DeviceBrandTargeting();
//			System.out.println("");
//
//			DeviceTargeting.ResetDeviceTypes();
//			DeviceTargeting.ResetDeviceCarrier();
//			DeviceTargeting.ResetDeviceWiFi();
//			System.out.println("");

//			System.out.println("");
//			DeviceTargeting.ResetDeviceTypes();
//			DeviceTargeting.ResetDeviceCarrier();
//			DeviceTargeting.ResetDeviceWiFi();
//			System.out.println("");
//			OSTargeting.DeviceOSTargeting();
			
//		} catch (InterruptedException e) {
//		
//			e.printStackTrace();
//		}
	//}
	
	
//	private static void LoadJsonRequests() {
//		JsonRequests.setMopub("{\"app\":{\"bundle\":\"372648912\",\"cat\":[\"IAB24\",\"social_networking\"],\"id\":\"ba411a3edf074a9a9792ff8c56e193ae\",\"name\":\"MeetMe iPhone\",\"publisher\":{\"id\":\"c3584d1c40cb43619e043c065caee33a\",\"name\":\"MeetMe, Inc.\"},\"storeurl\":\"https://itunes.apple.com/us/app/meetme-chat-meet-new-people/id372648912?mt=8&uo=4\",\"ver\":\"10.3.0\"},\"at\":2,\"badv\":[\"badoo\",\"chatmeup\",\"fling\",\"happn\",\"howaboutwe\",\"imvu\",\"jaumo\",\"justhookup\",\"lavaplace\",\"lovoo\",\"meetmoi\",\"meowchat\",\"moco\",\"momo\",\"on.com\",\"pof\",\"sayhi\",\"skout\",\"tagged\",\"tango\",\"thegamebyhotornot\",\"tinder\",\"twoo\",\"wechat\",\"whisper\",\"zoosk\",\"landrover\",\"landrover.com\",\"landrovertristate.com\"],\"bcat\":[\"IAB25\",\"IAB25-2\",\"IAB25-3\",\"IAB25-4\",\"IAB25-5\",\"IAB26\",\"IAB26-1\",\"IAB26-2\",\"IAB26-3\",\"IAB26-4\",\"IAB3-7\"],\"device\":{\"carrier\":\"310-VZW\",\"connectiontype\":2,\"devicetype\":1,\"dnt\":0,\"dpidmd5\":\"9c6b132814c572f4eaad3bea5ad92354\",\"dpidsha1\":\"5096f9a6db54780f8f87c3736eb5063b3584d501\",\"ext\":{\"idfa\":\"203D9D0B-558D-4BDD-A186-9183546D9755\"},\"geo\":{\"city\":\"Rancho Cucamonga\",\"country\":\"USA\",\"lat\":34.118733,\"lon\":-117.56488,\"metro\":\"803\",\"region\":\"CA\",\"zip\":\"91730\"},\"ip\":\"108.38.247.146\",\"js\":1,\"language\":\"en\",\"make\":\"Apple\",\"model\":\"iPhone 4S\",\"os\":\"iOS\",\"osv\":\"7.1.1\",\"ua\":\"Mozilla/5.0 (iPhone; CPU iPhone OS 7_1_1 like Mac OS X) AppleWebKit/537.51.2 (KHTML, like Gecko) Mobile/11D201\"},\"id\":\"09658018-6772-4e16-8fda-7a510bf61988\",\"imp\":[{\"banner\":{\"api\":[3,5],\"battr\":[1,3,8,9,10,14,6],\"btype\":[4],\"ext\":{\"nativebrowserclick\":1},\"h\":249,\"pos\":1,\"w\":300},\"bidfloor\":1,\"displaymanager\":\"mopub\",\"displaymanagerver\":\"3.7.0\",\"ext\":{\"secure\":0},\"id\":\"1\",\"instl\":0,\"tagid\":\"f5ea2d24c9bb46a38713cf98dffd8252\"}],\"user\":{\"gender\":\"f\",\"ext\":{\"age\":72},\"keywords\":\"ETHNICITY:NONE,RELIGION:NONE,AGE:21,INTERESTED_IN:WOMEN,EDUCATION:NONE,RELATIONSIP_STATUS:SINGLE,PARENTAL_STATE:NONE,GENDER:m\"}}");
//		JsonRequests.setMopubIpad("{\"app\":{\"bundle\":\"372648912\",\"cat\":[\"IAB24\",\"social_networking\"],\"id\":\"ba411a3edf074a9a9792ff8c56e193ae\",\"name\":\"MeetMe iPhone\",\"publisher\":{\"id\":\"c3584d1c40cb43619e043c065caee33a\",\"name\":\"MeetMe, Inc.\"},\"storeurl\":\"https://itunes.apple.com/us/app/meetme-chat-meet-new-people/id372648912?mt=8&uo=4\",\"ver\":\"10.3.0\"},\"at\":2,\"badv\":[\"badoo\",\"chatmeup\",\"fling\",\"happn\",\"howaboutwe\",\"imvu\",\"jaumo\",\"justhookup\",\"lavaplace\",\"lovoo\",\"meetmoi\",\"meowchat\",\"moco\",\"momo\",\"on.com\",\"pof\",\"sayhi\",\"skout\",\"tagged\",\"tango\",\"thegamebyhotornot\",\"tinder\",\"twoo\",\"wechat\",\"whisper\",\"zoosk\",\"landrover\",\"landrover.com\",\"landrovertristate.com\"],\"bcat\":[\"IAB25\",\"IAB25-2\",\"IAB25-3\",\"IAB25-4\",\"IAB25-5\",\"IAB26\",\"IAB26-1\",\"IAB26-2\",\"IAB26-3\",\"IAB26-4\",\"IAB3-7\"],\"device\":{\"carrier\":\"310-VZW\",\"connectiontype\":2,\"devicetype\":1,\"dnt\":0,\"dpidmd5\":\"9c6b132814c572f4eaad3bea5ad92354\",\"dpidsha1\":\"5096f9a6db54780f8f87c3736eb5063b3584d501\",\"ext\":{\"idfa\":\"203D9D0B-558D-4BDD-A186-9183546D9755\"},\"geo\":{\"city\":\"Saint Augustine\",\"country\":\"USA\",\"lat\":29.9475,\"lon\":-81.5264,\"metro\":\"109\",\"region\":\"FL\",\"zip\":\"32092\"},\"ip\":\"66.102.160.1\",\"js\":1,\"language\":\"en\",\"make\":\"Apple\",\"model\":\"iPhone 5S\",\"os\":\"iOS\",\"osv\":\"9\",\"ua\":\"Mozilla/5.0 (iPad; U; CPU OS 9_1 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B334b Safari/531.21.10\"},\"id\":\"09658018-6772-4e16-8fda-7a510bf61988\",\"imp\":[{\"banner\":{\"api\":[3,5],\"battr\":[1,3,8,9,10,14,6],\"btype\":[4],\"ext\":{\"nativebrowserclick\":1},\"h\":249,\"pos\":1,\"w\":300},\"bidfloor\":1,\"displaymanager\":\"mopub\",\"displaymanagerver\":\"3.7.0\",\"ext\":{\"secure\":0},\"id\":\"1\",\"instl\":0,\"tagid\":\"f5ea2d24c9bb46a38713cf98dffd8252\"}],\"user\":{\"gender\":\"f\",\"ext\":{\"age\":72},\"keywords\":\"ETHNICITY:NONE,RELIGION:NONE,AGE:21,INTERESTED_IN:WOMEN,EDUCATION:NONE,RELATIONSIP_STATUS:SINGLE,PARENTAL_STATE:NONE,GENDER:m\"}}");
//		JsonRequests.setMopubIpadComcast("{\"app\":{\"bundle\":\"372648912\",\"cat\":[\"IAB24\",\"social_networking\"],\"id\":\"ba411a3edf074a9a9792ff8c56e193ae\",\"name\":\"MeetMe iPhone\",\"publisher\":{\"id\":\"c3584d1c40cb43619e043c065caee33a\",\"name\":\"MeetMe, Inc.\"},\"storeurl\":\"https://itunes.apple.com/us/app/meetme-chat-meet-new-people/id372648912?mt=8&uo=4\",\"ver\":\"10.3.0\"},\"at\":2,\"badv\":[\"badoo\",\"chatmeup\",\"fling\",\"happn\",\"howaboutwe\",\"imvu\",\"jaumo\",\"justhookup\",\"lavaplace\",\"lovoo\",\"meetmoi\",\"meowchat\",\"moco\",\"momo\",\"on.com\",\"pof\",\"sayhi\",\"skout\",\"tagged\",\"tango\",\"thegamebyhotornot\",\"tinder\",\"twoo\",\"wechat\",\"whisper\",\"zoosk\",\"landrover\",\"landrover.com\",\"landrovertristate.com\"],\"bcat\":[\"IAB25\",\"IAB25-2\",\"IAB25-3\",\"IAB25-4\",\"IAB25-5\",\"IAB26\",\"IAB26-1\",\"IAB26-2\",\"IAB26-3\",\"IAB26-4\",\"IAB3-7\"],\"device\":{\"carrier\":\"310-VZW\",\"connectiontype\":2,\"devicetype\":1,\"dnt\":0,\"dpidmd5\":\"9c6b132814c572f4eaad3bea5ad92354\",\"dpidsha1\":\"5096f9a6db54780f8f87c3736eb5063b3584d501\",\"ext\":{\"idfa\":\"203D9D0B-558D-4BDD-A186-9183546D9755\"},\"geo\":{\"city\":\"Saint Augustine\",\"country\":\"USA\",\"lat\":29.9475,\"lon\":-81.5264,\"metro\":\"109\",\"region\":\"FL\",\"zip\":\"32092\"},\"ip\":\"66.102.160.1\",\"js\":1,\"language\":\"en\",\"make\":\"Apple\",\"model\":\"iPhone 5S\",\"os\":\"iOS\",\"osv\":\"9\",\"ua\":\"Mozilla/5.0 (iPad; U; CPU OS 9_1 like Mac OS X; en-us) AppleWebKit/531.21.10 (KHTML, like Gecko) Version/4.0.4 Mobile/7B334b Safari/531.21.10\"},\"id\":\"09658018-6772-4e16-8fda-7a510bf61988\",\"imp\":[{\"banner\":{\"api\":[3,5],\"battr\":[1,3,8,9,10,14,6],\"btype\":[4],\"ext\":{\"nativebrowserclick\":1},\"h\":249,\"pos\":1,\"w\":300},\"bidfloor\":1,\"displaymanager\":\"mopub\",\"displaymanagerver\":\"3.7.0\",\"ext\":{\"secure\":0},\"id\":\"1\",\"instl\":0,\"tagid\":\"f5ea2d24c9bb46a38713cf98dffd8252\"}],\"user\":{\"gender\":\"f\",\"ext\":{\"age\":72},\"keywords\":\"ETHNICITY:NONE,RELIGION:NONE,AGE:21,INTERESTED_IN:WOMEN,EDUCATION:NONE,RELATIONSIP_STATUS:SINGLE,PARENTAL_STATE:NONE,GENDER:m\"}}");
	//}
	

//}