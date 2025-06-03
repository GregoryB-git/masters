/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Pattern
 */
package E2;

import java.util.regex.Pattern;

public abstract class n {
    public static final Pattern a = Pattern.compile((String)"\\$\\{(.*?)\\}");

    public static boolean a(String string2) {
        if (string2 != null && !string2.trim().isEmpty()) {
            return false;
        }
        return true;
    }
}

