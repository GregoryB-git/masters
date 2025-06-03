/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package L5;

import Q3.c;
import Q3.d;
import java.util.HashMap;
import java.util.Map;

public class y
extends Exception {
    public final String o;
    public final String p;
    public final Map q;

    /*
     * Enabled aggressive block sorting
     */
    public y(String string2, String string3, Map map) {
        this.o = string2;
        this.p = string3;
        if (map == null) {
            map = new HashMap();
        }
        this.q = map;
        this.q.put((Object)"code", (Object)string2);
        this.q.put((Object)"message", (Object)string3);
    }

    public static y a(c c8) {
        String string2;
        String string3;
        int n8 = c8.f();
        if (n8 != -25) {
            if (n8 != -24) {
                if (n8 != -4) {
                    if (n8 != -3) {
                        if (n8 != -2) {
                            if (n8 != -1) {
                                switch (n8) {
                                    default: {
                                        string2 = "An unknown error occurred";
                                        string3 = "unknown";
                                        break;
                                    }
                                    case -6: {
                                        string3 = "expired-token";
                                        string2 = "The supplied auth token has expired.";
                                        break;
                                    }
                                    case -7: {
                                        string3 = "invalid-token";
                                        string2 = "The supplied auth token was invalid.";
                                        break;
                                    }
                                    case -8: {
                                        string3 = "max-retries";
                                        string2 = "The transaction had too many retries.";
                                        break;
                                    }
                                    case -9: {
                                        string3 = "overridden-by-set";
                                        string2 = "The transaction was overridden by a subsequent set.";
                                        break;
                                    }
                                    case -10: {
                                        string3 = "unavailable";
                                        string2 = "The service is unavailable.";
                                        break;
                                    }
                                }
                            } else {
                                string3 = "data-stale";
                                string2 = "The transaction needs to be run again with current data.";
                            }
                        } else {
                            string3 = "failure";
                            string2 = "The server indicated that this operation failed.";
                        }
                    } else {
                        string3 = "permission-denied";
                        string2 = "Client doesn't have permission to access the desired data.";
                    }
                } else {
                    string3 = "disconnected";
                    string2 = "The operation had to be aborted due to a network disconnect.";
                }
            } else {
                string3 = "network-error";
                string2 = "The operation could not be performed due to a network error.";
            }
        } else {
            string3 = "write-cancelled";
            string2 = "The write was canceled by the user.";
        }
        if (string3.equals((Object)"unknown")) {
            return y.g(c8.h());
        }
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"details", (Object)c8.g());
        return new y(string3, string2, (Map)hashMap);
    }

    public static y b(d d8) {
        return y.a(c.b((Throwable)d8));
    }

    public static y c(Exception exception) {
        if (exception == null) {
            return y.f();
        }
        return y.g(exception.getMessage());
    }

    public static y f() {
        return y.g(null);
    }

    public static y g(String string2) {
        HashMap hashMap = new HashMap();
        String string3 = string2;
        if (string2 == null) {
            string3 = "An unknown error occurred";
        }
        if (string3.contains((CharSequence)"Index not defined, add \".indexOn\"")) {
            string3 = string3.replaceFirst("java.lang.Exception: ", "");
            string2 = "index-not-defined";
        } else if (string3.contains((CharSequence)"Permission denied")) {
            string2 = "permission-denied";
            string3 = "Client doesn't have permission to access the desired data.";
        } else {
            string2 = "unknown";
        }
        return new y(string2, string3, (Map)hashMap);
    }

    public Map d() {
        return this.q;
    }

    public String e() {
        return this.o;
    }

    public String getMessage() {
        return this.p;
    }
}

