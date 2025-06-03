/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 */
package Q3;

import Q3.d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class c {
    public static final Map d;
    public static final Map e;
    public final int a;
    public final String b;
    public final String c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        Integer n8 = -1;
        hashMap.put((Object)n8, (Object)"The transaction needs to be run again with current data");
        Integer n9 = -2;
        hashMap.put((Object)n9, (Object)"The server indicated that this operation failed");
        Integer n10 = -3;
        hashMap.put((Object)n10, (Object)"This client does not have permission to perform this operation");
        Integer n11 = -4;
        hashMap.put((Object)n11, (Object)"The operation had to be aborted due to a network disconnect");
        Integer n12 = -6;
        hashMap.put((Object)n12, (Object)"The supplied auth token has expired");
        Integer n13 = -7;
        hashMap.put((Object)n13, (Object)"The supplied auth token was invalid");
        Integer n14 = -8;
        hashMap.put((Object)n14, (Object)"The transaction had too many retries");
        Integer n15 = -9;
        hashMap.put((Object)n15, (Object)"The transaction was overridden by a subsequent set");
        Integer n16 = -10;
        hashMap.put((Object)n16, (Object)"The service is unavailable");
        hashMap.put((Object)-11, (Object)"User code called from the Firebase Database runloop threw an exception:\n");
        Integer n17 = -24;
        hashMap.put((Object)n17, (Object)"The operation could not be performed due to a network error");
        Integer n18 = -25;
        hashMap.put((Object)n18, (Object)"The write was canceled by the user.");
        hashMap.put((Object)-999, (Object)"An unknown error occurred");
        hashMap = new HashMap();
        e = hashMap;
        hashMap.put((Object)"datastale", (Object)n8);
        hashMap.put((Object)"failure", (Object)n9);
        hashMap.put((Object)"permission_denied", (Object)n10);
        hashMap.put((Object)"disconnected", (Object)n11);
        hashMap.put((Object)"expired_token", (Object)n12);
        hashMap.put((Object)"invalid_token", (Object)n13);
        hashMap.put((Object)"maxretries", (Object)n14);
        hashMap.put((Object)"overriddenbyset", (Object)n15);
        hashMap.put((Object)"unavailable", (Object)n16);
        hashMap.put((Object)"network_error", (Object)n17);
        hashMap.put((Object)"write_canceled", (Object)n18);
    }

    public c(int n8, String string2) {
        this(n8, string2, null);
    }

    public c(int n8, String string2, String string3) {
        this.a = n8;
        this.b = string2;
        string2 = string3;
        if (string3 == null) {
            string2 = "";
        }
        this.c = string2;
    }

    public static c a(int n8) {
        Map map = d;
        if (map.containsKey((Object)n8)) {
            return new c(n8, (String)map.get((Object)n8), null);
        }
        map = new StringBuilder();
        map.append("Invalid Firebase Database error code: ");
        map.append(n8);
        throw new IllegalArgumentException(map.toString());
    }

    public static c b(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter((Writer)stringWriter));
        throwable = new StringBuilder();
        throwable.append((String)d.get((Object)-11));
        throwable.append(stringWriter.toString());
        return new c(-11, throwable.toString());
    }

    public static c c(String string2) {
        return c.d(string2, null);
    }

    public static c d(String string2, String string3) {
        return c.e(string2, string3, null);
    }

    public static c e(String string2, String string3, String string4) {
        Object object = (Integer)e.get((Object)string2.toLowerCase(Locale.US));
        string2 = object;
        if (object == null) {
            string2 = Integer.valueOf((int)-999);
        }
        object = string3;
        if (string3 == null) {
            object = (String)d.get((Object)string2);
        }
        return new c(string2.intValue(), (String)object, string4);
    }

    public int f() {
        return this.a;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.b;
    }

    public d i() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Firebase Database error: ");
        stringBuilder.append(this.b);
        return new d(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DatabaseError: ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}

