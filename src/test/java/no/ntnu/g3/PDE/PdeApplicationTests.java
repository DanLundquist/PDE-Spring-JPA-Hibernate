package no.ntnu.g3.PDE;

import no.ntnu.g3.PDE.models.Parcel;
import no.ntnu.g3.PDE.services.ParcelService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PdeApplicationTests {


    @Autowired
    private ParcelService parcelService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Parcel> parcels = parcelService.list();

        Assert.assertEquals(parcels.size(), 2);
    }
}