package FirstTask;

public interface ProstedMaker {

	public static String fName = "Prosted";
	public final String lName = "Maker";

	public static void FullName() {
		System.out.println("********** "+fName + "  " + lName + " **********");
	}

	void clean();

	void chopping();

	void spicing();

	void fry();

	void present();

	default void prepare() {
		clean();
		chopping();
		spicing();
		fry();
		present();

	}

}
