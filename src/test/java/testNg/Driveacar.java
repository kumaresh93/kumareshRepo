package testNg;

import org.testng.annotations.Test;

public class Driveacar {
	@Test
	public void startthecar() {
		System.out.println("start the car");
	}
@Test(dependsOnMethods = "startthecar")
	public void putfirstgear() {
		System.out.println("put first gear");
	}
@Test(enabled = true )
	public void putsecondgear() {
		System.out.println("put second gear");
	}
@Test(dependsOnMethods = "putsecondgear")
	public void putthirdgear() {
		System.out.println("put third gear");
	}
@Test(dependsOnMethods = "putthirdgear")
	public void putfourthgear() {
		System.out.println("put fourth gear");
	}
}
