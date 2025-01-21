import java.util.*;
class HashSetDemo1 {
	void HSetMethod() {
		HashSet<Object> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("sathwika");
        System.out.println("sahitha");
        System.out.println("ashu");
        System.out.println("bindhu");
        System.out.println("keerthi");
        String a = sc.nextLine();
		hashSet.add(a);
		System.out.println(hashSet);		
		for(Object x: hashSet) {
			System.out.println(x);
		}
	}
}


public class Demo032 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}
