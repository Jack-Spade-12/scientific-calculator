/**
 * History
 * 		
 * 		December 2, 2023 - S. Cortel - Created
 *      December 7, 2023 - S. Cortel - Added isOperator() method
 *      December 8, 2023 - S. Cortel - Changed access to ValueChecker methods to static;
 *                                     Added isOpenGrouper();
 *                                     Added isCloseGrouper();
 *      
 * Purpose
 * 		
 * 		The purpose of this class is to check if a 
 *      specific character or string is either a
 *      number, special character, digit, or symbol.
 *      
 */
package com.sc.project.scientificcalculator;
import java.util.Arrays;
import java.util.List;

public class ValueChecker {
    private static List<Character> specialCharacters = Arrays.asList('A', 'a');
    private static List<Character> numberSeparators = Arrays.asList(',', '.');
    private static List<Character> symbols = Arrays.asList('(', ')', '/', '*', '^', '+', '-', '%', 'r', 'R');
    private static List<Character> groupers = Arrays.asList('(', ')');
    private static List<Character> rootOperators = Arrays.asList( 'R', 'r');
    private static List<Character> operators = Arrays.asList('/', '*', '^', '+', '-', '%', 'r', 'R');
    private static char minus = '-';
    private static char equals = '=';
    private static char openGrouper = '(';
    private static char closeGrouper = ')';
    
    /**
	 * Checks if a character is a special value 'A' or 'a'
     * 
	 * @param value to check in form of <code>char</code>
	 * @return <code>boolean</code>
	 */
	public static boolean isSpecial(char value) {
		return specialCharacters.contains(value);
	}

    /**
	 * Checks if a string is a special value 'A' or 'a'
     * 
	 * @param value to check in form of <code>String</code>
	 * @return <code>boolean</code>
	 */
    public static boolean isSpecial(String value) {
        return value.length() == 1 && isSpecial(value.charAt(0));
    }
	
	/**
	 * Checks if a character is a digit or a number separator:
     * period (<code>.</code>) or comma (<code>,</code>)
     * 
	 * @param value to check in form of <code>char</code>
	 * @return <code>boolean</code>
	 */
	public static boolean isDigit(char value) {
		return Character.isDigit(value) || numberSeparators.contains(value);
	}

    /**
	 * Checks if a string is a digit or a number separator:
     * period (<code>.</code>) or comma (<code>,</code>)
     * 
	 * @param value to check in form of <code>char</code>
	 * @return <code>boolean</code>
	 */
	public static boolean isDigit(String value) {
		return value.length() == 1 && isDigit(value.charAt(0));
	}
	
	/**
     * Checks if a character is a symbol
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isSymbol(char value) {
        return symbols.contains(value);
    }

    /**
     * Checks if a string is a symbol
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isSymbol(String value) {
        return value.length() == 1 && isSymbol(value.charAt(0));
    }

    /**
     * Checks if a character is an operator
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isOpertor(char value) {
        return operators.contains(value);
    }

    /**
     * Checks if a string is a symbol
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isOpertor(String value) {
        return value.length() == 1 && isOpertor(value.charAt(0));
    }

    /**
     * Checks if <code>char</code> is a root operator (<code>r</code>) or 
     * (<code>R</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isRootOperator(char value) {
        return rootOperators.contains(value);
    }

    /**
     * Checks if <code>String</code> is a root operator (<code>r</code>) or 
     * (<code>R</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isRootOperator(String value) {
        return isRootOperator(value.charAt(0));
    }

    /**
     * Checks if a character is a minus (<code>-</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isMinus(char value) {
        return value == minus;
    }

    /**
     * Checks if a string is a minus (<code>-</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isMinus(String value) {
        return value.length() == 1 && isMinus(value.charAt(0));
    }

    /**
     * Checks if a character is a grouper: open parenthesis
     * (<code>(</code>) or closed parenthesis (<code>)</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isGrouper(char value) {
        return groupers.contains(value);
    }

    /**
     * Checks if a string is a grouper: open parenthesis
     * (<code>(</code>) or closed parenthesis (<code>)</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isGrouper(String value) {
        return value.length() == 1 && isGrouper(value.charAt(0));
    }

    /**
     * Checks if a character is an open grouper a.k.a. open parenthesis
     * (<code>(</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isOpenGrouper(char value) {
        return value == openGrouper;
    }

    /**
     * Checks if a character is an open grouper a.k.a. open parenthesis
     * (<code>(</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isOpenGrouper(String value) {
        return value.length() == 1 && isOpenGrouper(value.charAt(0));
    }

    /**
     * Checks if a character is a close grouper a.k.a. close parenthesis
     * (<code>)</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isCloseGrouper(char value) {
        return value == closeGrouper;
    }

    /**
     * Checks if a character is a close grouper a.k.a. close parenthesis
     * (<code>)</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isCloseGrouper(String value) {
        return value.length() == 1 && isCloseGrouper(value.charAt(0));
    }

    /**
     * Checks is character is an equal sign (<code>=</code>)
     * 
     * @param value to check in form of <code>char</code>
     * @return boolean
     */
    public static boolean isEquals(char value) {
        return value == equals;
    }

    /**
     * Checks is character is an equal sign (<code>=</code>)
     * 
     * @param value to check in form of <code>String</code>
     * @return boolean
     */
    public static boolean isEquals(String value) {
        return value.length() == 1 && isEquals(value.charAt(0));
    }

    /**
     * Returns the equal sign
     * 
     * @return <code>String</code>
     */
    public static String getEquals() {
        return String.valueOf(equals);
    }

    /**
	 * Checks if a string is a valid number
     * 
	 * @param value to check in form of <code>String</code>
	 * @return <code>boolean</code>
	 */
	public static boolean isNumber(String value) {
        try {
            // Remove commas ( , )
            Double.parseDouble(value.replace(",", ""));
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
        catch (NullPointerException e) {
            return false;
        }
	}
}