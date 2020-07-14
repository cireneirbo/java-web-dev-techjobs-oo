package org.launchcode.techjobs_oo.Tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


public class JobTest {
//    Employer employer;
//    Location location;
//    PositionType positionType;
//    CoreCompetency coreCompetency;
//    Job job;

    //@Before
    //public void createTestObjects() {
        Employer employer = new Employer("employer");
        Location location = new Location("location");
        PositionType positionType = new PositionType("positionType");
        CoreCompetency coreCompetency = new CoreCompetency("coreCompetency");
        Job job = new Job("my job", employer, location, positionType, coreCompetency);
    //}

    @Test
    public void isJobIdEqual() {
        Assert.assertEquals( 8, job.getId(), .001);
    }

    @Test
    public void isGetNameEqual() { Assert.assertEquals( "my job", "my job", job.getName()); }

    @Test
    public void isGetEmployerEqual() { Assert.assertEquals( "employer", employer, job.getEmployer()); }

    @Test
    public void isGetLocationEqual() { Assert.assertEquals( "location", location, job.getLocation()); }

    @Test
    public void isGetPositionTypeEqual() { Assert.assertEquals( "positionType", positionType, job.getPositionType()); }

    @Test
    public void isGetCoreCompetencyEqual() { Assert.assertEquals( "coreCompetency", coreCompetency, job.getCoreCompetency()); }

    @Test
    public void testSettingJobId() {
        Job job2 = new Job("my job", employer, location, positionType, coreCompetency);
        Assert.assertNotEquals(job.getId(), job2.getId(),0.001);
    }



}
