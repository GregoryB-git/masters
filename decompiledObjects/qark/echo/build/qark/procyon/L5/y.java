// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package L5;

import Q3.d;
import Q3.c;
import java.util.HashMap;
import java.util.Map;

public class y extends Exception
{
    public final String o;
    public final String p;
    public final Map q;
    
    public y(final String o, final String p2, Map q) {
        this.o = o;
        this.p = p2;
        if (q == null) {
            q = new HashMap();
        }
        (this.q = q).put("code", o);
        this.q.put("message", p2);
    }
    
    public static y a(final c c) {
        final int f = c.f();
        String s;
        String s2;
        if (f != -25) {
            if (f != -24) {
                if (f != -4) {
                    if (f != -3) {
                        if (f != -2) {
                            if (f != -1) {
                                switch (f) {
                                    default: {
                                        s = "An unknown error occurred";
                                        s2 = "unknown";
                                        break;
                                    }
                                    case -6: {
                                        s2 = "expired-token";
                                        s = "The supplied auth token has expired.";
                                        break;
                                    }
                                    case -7: {
                                        s2 = "invalid-token";
                                        s = "The supplied auth token was invalid.";
                                        break;
                                    }
                                    case -8: {
                                        s2 = "max-retries";
                                        s = "The transaction had too many retries.";
                                        break;
                                    }
                                    case -9: {
                                        s2 = "overridden-by-set";
                                        s = "The transaction was overridden by a subsequent set.";
                                        break;
                                    }
                                    case -10: {
                                        s2 = "unavailable";
                                        s = "The service is unavailable.";
                                        break;
                                    }
                                }
                            }
                            else {
                                s2 = "data-stale";
                                s = "The transaction needs to be run again with current data.";
                            }
                        }
                        else {
                            s2 = "failure";
                            s = "The server indicated that this operation failed.";
                        }
                    }
                    else {
                        s2 = "permission-denied";
                        s = "Client doesn't have permission to access the desired data.";
                    }
                }
                else {
                    s2 = "disconnected";
                    s = "The operation had to be aborted due to a network disconnect.";
                }
            }
            else {
                s2 = "network-error";
                s = "The operation could not be performed due to a network error.";
            }
        }
        else {
            s2 = "write-cancelled";
            s = "The write was canceled by the user.";
        }
        if (s2.equals("unknown")) {
            return g(c.h());
        }
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("details", c.g());
        return new y(s2, s, hashMap);
    }
    
    public static y b(final d d) {
        return a(c.b(d));
    }
    
    public static y c(final Exception ex) {
        if (ex == null) {
            return f();
        }
        return g(ex.getMessage());
    }
    
    public static y f() {
        return g(null);
    }
    
    public static y g(String s) {
        final HashMap hashMap = new HashMap();
        String replaceFirst = s;
        if (s == null) {
            replaceFirst = "An unknown error occurred";
        }
        if (replaceFirst.contains("Index not defined, add \".indexOn\"")) {
            replaceFirst = replaceFirst.replaceFirst("java.lang.Exception: ", "");
            s = "index-not-defined";
        }
        else if (replaceFirst.contains("Permission denied")) {
            s = "permission-denied";
            replaceFirst = "Client doesn't have permission to access the desired data.";
        }
        else {
            s = "unknown";
        }
        return new y(s, replaceFirst, hashMap);
    }
    
    public Map d() {
        return this.q;
    }
    
    public String e() {
        return this.o;
    }
    
    @Override
    public String getMessage() {
        return this.p;
    }
}
