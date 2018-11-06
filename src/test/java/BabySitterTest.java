
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.Test;


public class BabySitterTest {
	
	BabySitter underTest;
	
	@Test
	public void shouldReturnStartTimeOf1700() {
	
		LocalTime expectedStartTime = LocalTime.of(17,00);
		underTest = new BabySitter(expectedStartTime,null, null,null);
		LocalTime actualStartTime = ((BabySitter) underTest).getStartTime();
		
		assertThat(actualStartTime, is(expectedStartTime));
	
	}

	@Test
	public void shouldReturnStartTimeOf1900() {
	
		LocalTime expectedStartTime = LocalTime.of(19,00);
		underTest = new BabySitter(expectedStartTime,null, null,null);
		LocalTime actualStartTime = ((BabySitter) underTest).getStartTime();
		
		assertThat(actualStartTime, is(expectedStartTime));
	
	}

	@Test
	public void shouldReturnBedTimeOf2100() {
	
		LocalTime expectedBedTime = LocalTime.of(21,00);
		underTest = new BabySitter(null,expectedBedTime, null,null);
		LocalTime actualBedTime = ((BabySitter) underTest).getBedTime();
		
		assertThat(actualBedTime, is(expectedBedTime));
	
	}
	
	@Test
	public void shouldReturnBedTimeOf2000() {
	
		LocalTime expectedBedTime = LocalTime.of(20,00);
		underTest = new BabySitter(null,expectedBedTime, null,null);
		LocalTime actualBedTime = ((BabySitter) underTest).getBedTime();
		
		assertThat(actualBedTime, is(expectedBedTime));
	
	}
	
	
	@Test
	public void shouldReturnEndTimeOf0400() {
	
		LocalTime expectedEndTime = LocalTime.of(04, 00);
		underTest = new BabySitter(null,null,null,expectedEndTime);
		LocalTime actualEndtime = ((BabySitter) underTest).getEndTime();
		
		assertThat(actualEndtime, is(expectedEndTime));
	
	}

	
	@Test
	public void shouldReturnEndTimeOf0500() {
	
		LocalTime expectedEndTime = LocalTime.of(05, 00);
		underTest = new BabySitter(null,null,null,expectedEndTime);
		LocalTime actualEndtime = ((BabySitter) underTest).getEndTime();
		
		assertThat(actualEndtime, is(expectedEndTime));
	
	}
	

}
