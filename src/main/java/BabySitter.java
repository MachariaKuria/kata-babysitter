import java.time.LocalTime;

public class BabySitter {

	private LocalTime startTime;
	private LocalTime bedTime;
	private LocalTime midnightTime;
	private LocalTime endTime;

	public BabySitter(LocalTime startTime, LocalTime bedTime, LocalTime midnightTime, LocalTime endTime) {
		this.startTime= startTime;
		this.bedTime = bedTime;
		this.midnightTime = midnightTime;
		this.endTime = endTime;
	}

	public LocalTime getStartTime() {

		return startTime;
	}

	public LocalTime getBedTime() {

		return bedTime;
	}

	public LocalTime getMidNightTime() {
		
		return midnightTime ;
	}

	public LocalTime getEndTime() {
		
		return endTime;
	}



}
