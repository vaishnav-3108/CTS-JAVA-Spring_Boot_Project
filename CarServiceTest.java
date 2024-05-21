
package com.example.Carservicecompany;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.Carservicecompany.model.Address;
import com.example.Carservicecompany.model.CarService;
import com.example.Carservicecompany.service.CarServiceService;

@SpringBootTest
public class CarServiceTest {

	@Autowired
	private CarServiceService car;

	@Test
	public void testsaveCarService() {
		LocalDate ld = LocalDate.of(2024, 01, 04);
		CarService c = new CarService(121, "carmake", "modelname", "RN", 879, "knownissues", 7500, ld, ld, ld, ld,
				"phonenumber", 
				new Address(121, "street", "landmark", "city", "state"));

		CarService addedCarService = car.saveCarService(c);
		assertNotNull(addedCarService.getId());
		assertEquals(c.getCarmake(), addedCarService.getCarmake());
	}

	@Test

	public void testgetCarService() {
          LocalDate ld = LocalDate.of(2024, 01, 04);
            CarService c = new CarService(121, "carmake", "modelname", "RN", 879,
            		"knownissues", 7500, ld, ld,
            		ld, ld, "phonenumber",
                    new Address(121, "street", "landmark", "city", "state"));

		CarService addedCarService = car.saveCarService(c);
        CarService displayCarService = car.getCarService(addedCarService.getId());
        String mname = displayCarService.getModelname();
        assertEquals("modelname", mname);

	}

	@Test
    public void testupdateCarService() {
      LocalDate ld = LocalDate.of(2024, 01, 04);
      CarService c = new CarService(121, "carmake", "modelname", "RN", 879,
    		  "knownissues", 7500, ld, ld,
    		  ld, ld, "phonenumber",
    		  new Address(121, "street", "landmark", "city", "state"));

		CarService addedCarService = car.saveCarService(c);
        c.setModelname("benz");
        c.setChassisNumber(99);
        CarService updatedCarService = car.updateCarService(addedCarService.getId(), c);
        assertNotNull(updatedCarService.getId());
        assertEquals("benz", updatedCarService.getModelname());
        assertEquals(99, updatedCarService.getChassisNumber());

	}

	@Test
public void testdeleteCarService() {
    LocalDate ld = LocalDate.of(2024, 01, 04);
    CarService c = new CarService(121, "carmake", "modelname", "RN", 879,
    		"knownissues", 7500, ld, ld,
    		ld, ld, "phonenumber",
    		new Address(121, "street", "landmark", "city", "state"));

		CarService addedCarService = car.saveCarService(c);
        boolean isDeleted = car.deleteCarServiceById(addedCarService.getId());

		assertTrue(isDeleted);

	}

}
