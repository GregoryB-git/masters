/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package W2;

import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class r {
    public static /* varargs */ String a(String arrobject, Object ... stringBuilder) {
        int n8;
        String string2 = String.valueOf((Object)arrobject);
        int n9 = 0;
        if (stringBuilder == null) {
            arrobject = new Object[]{"(Object[])null"};
        } else {
            n8 = 0;
            do {
                arrobject = stringBuilder;
                if (n8 >= stringBuilder.length) break;
                stringBuilder[n8] = r.b(stringBuilder[n8]);
                ++n8;
            } while (true);
        }
        stringBuilder = new StringBuilder(string2.length() + arrobject.length * 16);
        int n10 = 0;
        n8 = n9;
        while (n8 < arrobject.length && (n9 = string2.indexOf("%s", n10)) != -1) {
            stringBuilder.append((CharSequence)string2, n10, n9);
            stringBuilder.append(arrobject[n8]);
            n10 = n9 + 2;
            ++n8;
        }
        stringBuilder.append((CharSequence)string2, n10, string2.length());
        if (n8 < arrobject.length) {
            stringBuilder.append(" [");
            n10 = n8 + 1;
            stringBuilder.append(arrobject[n8]);
            for (n8 = n10; n8 < arrobject.length; ++n8) {
                stringBuilder.append(", ");
                stringBuilder.append(arrobject[n8]);
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public static String b(Object object) {
        if (object == null) {
            return "null";
        }
        try {
            String string2 = object.toString();
            return string2;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.getClass().getName());
            stringBuilder.append('@');
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)object)));
            object = stringBuilder.toString();
            stringBuilder = Logger.getLogger((String)"com.google.common.base.Strings");
            Level level = Level.WARNING;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Exception during lenientFormat for ");
            stringBuilder2.append((String)object);
            stringBuilder.log(level, stringBuilder2.toString(), (Throwable)exception);
            stringBuilder = new StringBuilder();
            stringBuilder.append("<");
            stringBuilder.append((String)object);
            stringBuilder.append(" threw ");
            stringBuilder.append(exception.getClass().getName());
            stringBuilder.append(">");
            return stringBuilder.toString();
        }
    }
}

