/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.apache.http.Header
 *  org.apache.http.HttpMessage
 *  org.apache.http.HttpResponse
 */
package I4;

import F4.a;
import N4.h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;

public abstract class j {
    public static final Pattern a = Pattern.compile((String)"(^|.*\\s)datatransport/\\S+ android/($|\\s.*)");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Long a(HttpMessage httpMessage) {
        long l8;
        try {
            httpMessage = httpMessage.getFirstHeader("content-length");
            if (httpMessage == null) return null;
            {
                l8 = Long.parseLong((String)httpMessage.getValue());
            }
        }
        catch (NumberFormatException numberFormatException) {}
        return l8;
        a.e().a("The content-length value is not a valid number");
        return null;
    }

    public static String b(HttpResponse object) {
        if ((object = object.getFirstHeader("content-type")) != null && (object = object.getValue()) != null) {
            return object;
        }
        return null;
    }

    public static boolean c(String string2) {
        if (string2 != null && a.matcher((CharSequence)string2).matches()) {
            return false;
        }
        return true;
    }

    public static void d(G4.j j8) {
        if (!j8.l()) {
            j8.u();
        }
        j8.g();
    }
}

