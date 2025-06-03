/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package d2;

public abstract class e {
    public static String a(String string2, String string3) {
        int n8 = string2.length() - string3.length();
        if (n8 >= 0 && n8 <= 1) {
            StringBuilder stringBuilder = new StringBuilder(string2.length() + string3.length());
            for (n8 = 0; n8 < string2.length(); ++n8) {
                stringBuilder.append(string2.charAt(n8));
                if (string3.length() <= n8) continue;
                stringBuilder.append(string3.charAt(n8));
            }
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}

