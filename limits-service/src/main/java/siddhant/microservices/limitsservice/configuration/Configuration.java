package siddhant.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//to map values from application.properties
@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	//now, spring automatically maps the limit-service.min and limit-service.max (defined in the application.properties) to the below attributes
	
	private int minimum;
	private int maximum;
	
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
