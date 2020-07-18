package org.launchcode.techjobs_oo;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public void dataNotAvailable() {
        if (name == "") {
            name = "Data not available";
        }
        if (employer.getValue().equals("")) {
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("")) {
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("")) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("")) {
            coreCompetency.setValue("Data not available");
        }
    }

    @Override
    public String toString() {

        if (name == null && location == null && employer == null && positionType == null && coreCompetency == null) {
            String errorMessageNotAnObject = "OOPS! This job does not seem to exist.";
            return errorMessageNotAnObject;
        }
        dataNotAvailable();

        String jobToString =
                        "_______\n" +
                        "ID: " + this.getId() + "\n" +
                        "Name: " + this.getName() + "\n" +
                        "Employer: " + this.getEmployer() + "\n" +
                        "Location: " + this.getLocation() + "\n" +
                        "Position Type: " + this.getPositionType() + "\n" +
                        "Core Competency: " + this.getCoreCompetency() + "\n" +
                        "_______\n";

        return jobToString;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    public int getId() {
        return id;
    }

    public String getName() { return name; }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
