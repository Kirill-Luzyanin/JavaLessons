package parser;

import entity.Type;

import java.util.ArrayList;

/**
 * @author Andrej Reutow
 * created on 21.01.2023
 */
public class Parser {

    public static String parseToString(String value, boolean require, ArrayList<String> errors) {
        boolean isAllowed = checkRequire(value, require, errors);
        if (!isAllowed) {
            errors.add("Value " + value + "is not allowed");
            return null;
        }
        return value;
    }

    public static Integer parseToInt(String value, boolean require, ArrayList<String> errors) {
        boolean isValid = checkRequire(value, require, errors);
        if (!isValid) {
            return null;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            errors.add("Value " + value + " is not a number");
            return null;
        }
    }

    public static Long parseToLong(String value, boolean require, ArrayList<String> errors) {
        boolean isAllowed = checkRequire(value, require, errors);
        if (!isAllowed) {
            errors.add("Value " + value + "is not allowed");
            return null;
        }
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            errors.add("Value " + value + " is not a number");
            return null;
        }
    }

    public static Double parseToDouble(String value, boolean require, ArrayList<String> errors) {
        boolean isAllowed = checkRequire(value, require, errors);
        if (!isAllowed) {
            errors.add("Value " + value + "is not allowed");
            return null;
        }
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            errors.add("Value " + value + " is not a (dezimal) number");
            return null;
        } catch (NullPointerException e) {
            errors.add("Can not parse to double blank String: " + value);
            return null;
        }
    }

    public static Type parseTypeEnum(String code, boolean require, ArrayList<String> errors) {
        if (code == null) {
            errors.add("Value code is null");
            return null;
        }
        boolean isAllowed = checkRequire(code, require, errors);
        if (!isAllowed) {
            errors.add("Value " + code + "is not allowed");
            return null;
        }
        Type[] enumValues = Type.values();
        Type resultType = null;
        for (Type enumValue : enumValues) {
            if (enumValue.getCode().equals(code)) {
                resultType = enumValue;
            }
        }
        if (resultType == null) {
            errors.add("Type with " + code + "is not exist");
        }
        return resultType;
    }

    private static boolean checkRequire(String value, boolean require, ArrayList<String> errors) {
        if (require) {
            // не null и больше 0
            if (value.isBlank()) {
                errors.add("Value " + value + "is not allowed");
                return false;
            }
        }
        return true;
    }
}
