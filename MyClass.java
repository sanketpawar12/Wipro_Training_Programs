package day5;

interface A{
	default void show() {
		System.out.println("From interface A");
	}
}

interface B {
	default void show() {
		System.out.println("From interface B");
	}
}


class MyClass implements A, B{
	@Override
	public void show() {
		A.super.show();
	}
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.show();
	}
}
