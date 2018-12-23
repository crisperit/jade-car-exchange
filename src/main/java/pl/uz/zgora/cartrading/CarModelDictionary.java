package pl.uz.zgora.cartrading;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class CarModelDictionary {

	private static List<CarModel> CARS = new ArrayList<>();

	static {
		CARS.add(new CarModel(Brand.FIAT, "Cinquecento",
			BigDecimal.valueOf(704), 1991, 1998, BigDecimal.valueOf(1800), BigDecimal.valueOf(4200),
			BigDecimal.valueOf(0), BigDecimal.valueOf(500)));
		CARS.add(new CarModel(Brand.VOLKSWAGEN, "Golf IV",
			BigDecimal.valueOf(1595), 1999, 2006, BigDecimal.valueOf(4000),
			BigDecimal.valueOf(8000),
			BigDecimal.valueOf(0), BigDecimal.valueOf(1000)));
		CARS.add(new CarModel(Brand.AUDI, "TT 8N",
			BigDecimal.valueOf(1781), 1998, 2006, BigDecimal.valueOf(9000),
			BigDecimal.valueOf(16000),
			BigDecimal.valueOf(300), BigDecimal.valueOf(1500)));
		CARS.add(new CarModel(Brand.FIAT, "PANDA II",
			BigDecimal.valueOf(1242), 2003, 2012, BigDecimal.valueOf(5500),
			BigDecimal.valueOf(12000),
			BigDecimal.valueOf(0), BigDecimal.valueOf(950)));
		CARS.add(new CarModel(Brand.VOLKSWAGEN, "Polo IV",
			BigDecimal.valueOf(1896), 2001, 2005, BigDecimal.valueOf(4700),
			BigDecimal.valueOf(15000),
			BigDecimal.valueOf(750), BigDecimal.valueOf(2300)));
		CARS.add(new CarModel(Brand.AUDI, "A6 C6",
			BigDecimal.valueOf(2461), 2004, 2011, BigDecimal.valueOf(13000),
			BigDecimal.valueOf(25000),
			BigDecimal.valueOf(1200), BigDecimal.valueOf(5000)));
		CARS.add(new CarModel(Brand.FIAT, "Grande Punto",
			BigDecimal.valueOf(1910), 2005, 2009, BigDecimal.valueOf(8700),
			BigDecimal.valueOf(18000),
			BigDecimal.valueOf(400), BigDecimal.valueOf(1900)));
		//TODO: zrobic
		CARS.add(new CarModel(Brand.VOLKSWAGEN, "Grande Punto",
			BigDecimal.valueOf(1910), 2005, 2009, BigDecimal.valueOf(8700),
			BigDecimal.valueOf(18000),
			BigDecimal.valueOf(400), BigDecimal.valueOf(1900)));

	}
}
