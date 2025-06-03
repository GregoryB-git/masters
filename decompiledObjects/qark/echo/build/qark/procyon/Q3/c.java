// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q3;

import java.util.Locale;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

public class c
{
    public static final Map d;
    public static final Map e;
    public final int a;
    public final String b;
    public final String c;
    
    static {
        final Map map = d = new HashMap();
        final Integer value = -1;
        map.put(value, "The transaction needs to be run again with current data");
        final Integer value2 = -2;
        map.put(value2, "The server indicated that this operation failed");
        final Integer value3 = -3;
        map.put(value3, "This client does not have permission to perform this operation");
        final Integer value4 = -4;
        map.put(value4, "The operation had to be aborted due to a network disconnect");
        final Integer value5 = -6;
        map.put(value5, "The supplied auth token has expired");
        final Integer value6 = -7;
        map.put(value6, "The supplied auth token was invalid");
        final Integer value7 = -8;
        map.put(value7, "The transaction had too many retries");
        final Integer value8 = -9;
        map.put(value8, "The transaction was overridden by a subsequent set");
        final Integer value9 = -10;
        map.put(value9, "The service is unavailable");
        map.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        final Integer value10 = -24;
        map.put(value10, "The operation could not be performed due to a network error");
        final Integer value11 = -25;
        map.put(value11, "The write was canceled by the user.");
        map.put(-999, "An unknown error occurred");
        final HashMap<String, Integer> e2 = new HashMap<String, Integer>();
        (e = e2).put("datastale", value);
        e2.put("failure", value2);
        e2.put("permission_denied", value3);
        e2.put("disconnected", value4);
        e2.put("expired_token", value5);
        e2.put("invalid_token", value6);
        e2.put("maxretries", value7);
        e2.put("overriddenbyset", value8);
        e2.put("unavailable", value9);
        e2.put("network_error", value10);
        e2.put("write_canceled", value11);
    }
    
    public c(final int n, final String s) {
        this(n, s, null);
    }
    
    public c(final int a, String s, final String s2) {
        this.a = a;
        this.b = s;
        s = s2;
        if (s2 == null) {
            s = "";
        }
        this.c = s;
    }
    
    public static c a(final int i) {
        final Map d = c.d;
        if (d.containsKey(i)) {
            return new c(i, d.get(i), null);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid Firebase Database error code: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static c b(final Throwable t) {
        final StringWriter out = new StringWriter();
        t.printStackTrace(new PrintWriter(out));
        final StringBuilder sb = new StringBuilder();
        sb.append(c.d.get(-11));
        sb.append(out.toString());
        return new c(-11, sb.toString());
    }
    
    public static c c(final String s) {
        return d(s, null);
    }
    
    public static c d(final String s, final String s2) {
        return e(s, s2, null);
    }
    
    public static c e(final String s, final String s2, final String s3) {
        Integer value;
        if ((value = c.e.get(s.toLowerCase(Locale.US))) == null) {
            value = -999;
        }
        String s4;
        if ((s4 = s2) == null) {
            s4 = c.d.get(value);
        }
        return new c(value, s4, s3);
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
        final StringBuilder sb = new StringBuilder();
        sb.append("Firebase Database error: ");
        sb.append(this.b);
        return new d(sb.toString());
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DatabaseError: ");
        sb.append(this.b);
        return sb.toString();
    }
}
