class ReverseString {

    String reverse(String inputString) {
        String ret = new StringBuilder(inputString).reverse().toString();
        return ret;
    }
  
}