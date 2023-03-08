package genericsDemo;



public class Main {

	public static void main(String[] args) {
		
		objClass<String> strObj = new objClass<String>();
		strObj.addObj("Good Morning");
		System.out.println(strObj.get());
		
		objClass<Integer> intObj = new objClass<Integer>();
		intObj.addObj(100);
		System.out.println(intObj.get());
		
		String[] array = {"abcd", "defg", "hijk"};
		String result = objClass.getFirst(array);
		System.out.println(result);
		
		Integer[] numbers = {1,2,3,4,5,6,7};
		System.out.println(objClass.getFirst(numbers));
	}

}
