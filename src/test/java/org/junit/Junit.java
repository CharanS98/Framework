package org.junit;

public class Junit {


@BeforeClass
public static void befc() {
	System.out.println("befclass");

}
@AfterClass
public static void Aftc() {
	System.out.println("aftcla");
}
@Before
public void bef() {
System.out.println("bef");
}
@After
public void aft() {
System.out.println("aft");
}
@Test
public void test1() {
System.out.println("test1");
}

@Test
public void test2() {
System.out.println("test2");
}

@Test
public void test3() {
System.out.println("test3");
}





}
