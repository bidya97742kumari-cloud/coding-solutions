

//Write your code here
class MyRegex {
    String octet = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern = octet + "\\." + octet + "\\." + octet + "\\." + octet;
}
