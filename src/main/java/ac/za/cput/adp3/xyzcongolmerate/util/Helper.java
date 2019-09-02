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

        String processResults = "";

        if(className != null)
        {
            splitName = className.toCharArray();

            for (int i = 0; i < splitName.length; i++)
            {
                if(Character.isUpperCase(splitName[i]))
                {
                    //Add individual letters to current string value
                    processResults = processResults + "" +splitName[i];
                }
            }
        }
        //concatenated string of capital letters returned
        return processResults;
    }

}
