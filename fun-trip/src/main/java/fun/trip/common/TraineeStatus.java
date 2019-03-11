package fun.trip.common;

public enum TraineeStatus {

  ENROLLED("Enrolled"), ATTENDING("Attending"), COMPLETE("Complete"), WITHDRAWN("Withdrawn"), FAILED("Failed");

  protected String value;

  private TraineeStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
