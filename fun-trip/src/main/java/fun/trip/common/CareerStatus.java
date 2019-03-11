package fun.trip.common;

import com.fasterxml.jackson.annotation.JsonProperty;

// EmploymentStatus
public enum CareerStatus {

  @JsonProperty("Training") TRAINING("Training"),

  @JsonProperty("Instructor Training") TRAINING_INSTRUCTOR("Instructor Training"),

  @JsonProperty("Instructor Training, Waiting") TRAINING_INSTRUCTOR_WAIT("Instructor Training, Waiting"),

  @JsonProperty("Active") ACTIVE("Active"),

  @JsonProperty("Active, Instructing") ACTIVE_INSTRUCTING("Active, Instructing"),

  @JsonProperty("Posted") POSTED("Posted"),

  @JsonProperty("In Buffer") IN_BUFFER("In Buffer"),

  @JsonProperty("Removed, Failure") REMOVED_FAILURE("Removed, Failure"),

  @JsonProperty("Removed, Self Withdraw") REMOVED_SELF_WITHDRAW("Removed, Self Withdraw"),

  @JsonProperty("Exited System") EXITED("Exited System"),

  @JsonProperty("Training, Transition") TRAINING_TRANSITION("Training, Transition"),

  @JsonProperty("Training, Conversion") TRAINING_CONVERSION("Training, Conversion");

  protected String value;

  private CareerStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
