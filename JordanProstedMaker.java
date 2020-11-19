package FirstTask;

public class JordanProstedMaker implements ProstedMaker {

	@Override
	public void clean() {
		System.out.println("*******************************************************************************");
		System.out.println("Cleaning ... ");
		System.out.println("------------");
		System.out.println(
				"  We clean the chicken well by removing the feathers from it, and then cleaning the chicken from the inside, after which we soak the chicken"
						+ " with salt and vinegar for half an hour and re-clean it again to make sure that there is anything on the chicken ");
	}

	@Override
	public void chopping() {
		System.out.println("*******************************************************************************");
		System.out.println("Chopping ... ");
		System.out.println("------------");
		System.out.println(
				"  We cut the chicken into 8 pieces on the joints, and then we make several stings in each piece so that it "
						+ "ripens from the inside and to avoid the presence of blood when biting the chicken piece after frying ");

	}

	@Override
	public void spicing() {
		System.out.println("*******************************************************************************");
		System.out.println("Spicing ...  ");
		System.out.println("------------");
		System.out.println("  We put the spices on the chicken for a period of time in order to be rich in flavors,"
				+ " and from the spices that we put: black pepper, curry, dry coriander, ground cardamom"
				+ ", hot or moderate paprika on request, chicken spices, the seven spices (or mixed),"
				+ " crushed garlic, Pomegranate molasses, and spices can be added on request ");

	}

	@Override
	public void fry() {
		System.out.println("*******************************************************************************");
		System.out.println("Frying ... ");
		System.out.println("----------");
		System.out.println(
				"  Now for the frying process, we prepare the flour and put the spices on it to add more flavor to the taste of the chicken,"
						+ " beat two eggs in a bowl, then put the vegetable oil in the pan so that it is suitable for deep frying and put it on the gas to start heating,"
						+ " we make sure the temperature of the oil before putting the chicken so that the oil does not absorb\r\n"
						+ "  Then we start dipping the chicken with eggs after that with flour, repeat it as desired, put the chicken pieces in hot oil,"
						+ " reduce the heat of the stove a little, and cover the pan without forgetting to turn the chicken pieces, "
						+ "we do this process until the chicken pieces are cooked"
						+ ", do not forget that the chicken pieces must be golden We put the chicken pieces on kitchen paper to absorb the oil and prepare it to present");

	}

	@Override
	public void present() {
		System.out.println("*******************************************************************************");
		System.out.println("Presenting ... ");
		System.out.println("--------------");
		System.out.println(
				"  Presents with  fries potato, ketchup, mayonnaise, mustard, barbecue sauce, and any favorite sauce. ");

	}

	@Override
	public void prepare() {
		clean();
		chopping();
		spicing();
		fry();
		present();
	}
}
