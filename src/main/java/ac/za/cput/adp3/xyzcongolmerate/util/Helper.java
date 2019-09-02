package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);

        char[] splitName;
        char[] upperCaseLetters = null;
        String processResults;

        if(className != null)
        {
            splitName = className.toCharArray();
            upperCaseLetters = new char[splitName.length];

            for (int i = 0; i <= splitName.length; i++)
            {
                char one = splitName[i];

                if(Character.isUpperCase(one))
                {
                    if (upperCaseLetters.length == 0) {
                        upperCaseLetters[0] = one;
                    }
                    else{
                        upperCaseLetters[upperCaseLetters.length+1] = one;
                    }
                }
            }
        }

        //Chars to be returned as String
        processResults = upperCaseLetters.toString();
        return processResults;


        /**
         * Your implementation goes here
         *
         * INSTRUCTION
         * 1. Remove line 17 [throw new UnsupportedOperationException("Not yet supported!");]
         * 2. Get the capitalized letter(s) from the className and return it.
         */
    }
}
