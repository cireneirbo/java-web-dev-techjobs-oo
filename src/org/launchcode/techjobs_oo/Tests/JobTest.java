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

    @Before
    //public void createTestObjects() {
        Employer employer = new Employer();
        Location location = new Location();
        PositionType positionType = new PositionType();
        CoreCompetency coreCompetency = new CoreCompetency();
        Job job = new Job("my job", employer, location, positionType, coreCompetency);
    //}



    @Test
    public void isJobIdEqual() {
        Assert.assertEquals( 1, job.getId(), .001);
    }



}
