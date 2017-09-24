
public class Q03 {

	private static final String arara = "arara";
	private static final String radar = "radar";
	private static final String mom = "mom";
	private static final String moon = "moon";
	private static final String moom = "moom";
	private static final String palindrome = "palindrome";
	
	private static boolean isPalindrome(String s) {
		int n = s.length();
		if(n == 1) return true;
		else for(int i = 0; i < (n/2); ++i)
			if(s.charAt(i) != s.charAt(n - 1 - i)) return false;
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print("\nIs '" + "z" + "' a palindrome? ");
		if(isPalindrome("z")) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + arara + "' a palindrome? ");
		if(isPalindrome(arara)) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + radar + "' a palindrome? ");
		if(isPalindrome(radar)) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + mom + "' a palindrome? ");
		if(isPalindrome(mom)) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + moon + "' a palindrome? ");
		if(isPalindrome(moon)) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + moom + "' a palindrome? ");
		if(isPalindrome(moom)) System.out.print("Yeap");
		else System.out.print("Nope");
		System.out.print("\nIs '" + palindrome + "' a palindrome? ");
		if(isPalindrome(palindrome)) System.out.print("Yeap");
		else System.out.print("Nope");
	}

}
