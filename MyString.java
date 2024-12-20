public class MyString {
    public static void main(String[] args) {
        //System.out.println("Testing lowercase:");
        //System.out.println("UnHappy : " + lowerCase("UnHappy"));
        //System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        //System.out.println("TLV : " + lowerCase("TLV"));
        //System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("baba yaga", "yaga")); // true
        //System.out.println(contains("happy", "unhappy")); // false
        //System.out.println(contains("historical", "story")); // false
        //System.out.println(contains("psychology", "psycho")); // true
        //System.out.println(contains("personality", "son")); // true
        //System.out.println(contains("personality", "dad")); // false
        //System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str)
     {
        String strNew="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if((str.charAt(i)>='A')&&(ch<='Z'))
            {
                ch=(char)(ch+32);
            }
            strNew+=ch;
        }
        return strNew;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        Boolean bool=false;
        if(str2.length()>str1.length())
        {
            return false;
        }
        if(str2=="")
        {
            bool=true;
            return true;
        }
        String stNew="";
        for(int i=0;i<str1.length();i++)
        {
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j))
                {
                    for(int m=i;m<str2.length();m++)
                    {
                        stNew+=str1.charAt(m);
                        if(stNew.equals(str2))
                        {
                            bool=true;
                            break;
                        }
                    }
                }
                if(str2.equals(stNew))
                {
                    bool=true;
                    break;
                }
            }
            if(str2.equals(stNew))
            {
                bool=true;
                break;
            }
        }
        return bool;
    }
}
