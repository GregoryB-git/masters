package L5;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class y extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final String f3461o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3462p;

    /* renamed from: q, reason: collision with root package name */
    public final Map f3463q;

    public y(String str, String str2, Map map) {
        this.f3461o = str;
        this.f3462p = str2;
        this.f3463q = map == null ? new HashMap() : map;
        this.f3463q.put("code", str);
        this.f3463q.put("message", str2);
    }

    public static y a(Q3.c cVar) {
        String str;
        String str2;
        int f7 = cVar.f();
        if (f7 == -25) {
            str = "write-cancelled";
            str2 = "The write was canceled by the user.";
        } else if (f7 == -24) {
            str = "network-error";
            str2 = "The operation could not be performed due to a network error.";
        } else if (f7 == -4) {
            str = "disconnected";
            str2 = "The operation had to be aborted due to a network disconnect.";
        } else if (f7 == -3) {
            str = "permission-denied";
            str2 = "Client doesn't have permission to access the desired data.";
        } else if (f7 == -2) {
            str = "failure";
            str2 = "The server indicated that this operation failed.";
        } else if (f7 != -1) {
            switch (f7) {
                case -10:
                    str = "unavailable";
                    str2 = "The service is unavailable.";
                    break;
                case -9:
                    str = "overridden-by-set";
                    str2 = "The transaction was overridden by a subsequent set.";
                    break;
                case -8:
                    str = "max-retries";
                    str2 = "The transaction had too many retries.";
                    break;
                case -7:
                    str = "invalid-token";
                    str2 = "The supplied auth token was invalid.";
                    break;
                case -6:
                    str = "expired-token";
                    str2 = "The supplied auth token has expired.";
                    break;
                default:
                    str2 = "An unknown error occurred";
                    str = "unknown";
                    break;
            }
        } else {
            str = "data-stale";
            str2 = "The transaction needs to be run again with current data.";
        }
        if (str.equals("unknown")) {
            return g(cVar.h());
        }
        HashMap hashMap = new HashMap();
        hashMap.put("details", cVar.g());
        return new y(str, str2, hashMap);
    }

    public static y b(Q3.d dVar) {
        return a(Q3.c.b(dVar));
    }

    public static y c(Exception exc) {
        return exc == null ? f() : g(exc.getMessage());
    }

    public static y f() {
        return g(null);
    }

    public static y g(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        if (str == null) {
            str = "An unknown error occurred";
        }
        if (str.contains("Index not defined, add \".indexOn\"")) {
            str = str.replaceFirst("java.lang.Exception: ", "");
            str2 = "index-not-defined";
        } else if (str.contains("Permission denied")) {
            str2 = "permission-denied";
            str = "Client doesn't have permission to access the desired data.";
        } else {
            str2 = "unknown";
        }
        return new y(str2, str, hashMap);
    }

    public Map d() {
        return this.f3463q;
    }

    public String e() {
        return this.f3461o;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3462p;
    }
}
