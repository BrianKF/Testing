package com.adtheorent.Testing;

import com.adtheorent.common.cache.memcached.Memcached;
import com.adtheorent.common.cache.provider.WeatherProvider;

public class Weather {
	public static void main (String[] args) {
		final Memcached memcache = new Memcached();
		  final WeatherProvider weatherProvider = memcache;
		  System.out.println( weatherProvider.GetWeatherEntry( "32092" ) );
	}
}
