package Q3;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4351d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map f4352e;

    /* renamed from: a, reason: collision with root package name */
    public final int f4353a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4354b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4355c;

    static {
        HashMap hashMap = new HashMap();
        f4351d = hashMap;
        hashMap.put(-1, "The transaction needs to be run again with current data");
        hashMap.put(-2, "The server indicated that this operation failed");
        hashMap.put(-3, "This client does not have permission to perform this operation");
        hashMap.put(-4, "The operation had to be aborted due to a network disconnect");
        hashMap.put(-6, "The supplied auth token has expired");
        hashMap.put(-7, "The supplied auth token was invalid");
        hashMap.put(-8, "The transaction had too many retries");
        hashMap.put(-9, "The transaction was overridden by a subsequent set");
        hashMap.put(-10, "The service is unavailable");
        hashMap.put(-11, "User code called from the Firebase Database runloop threw an exception:\n");
        hashMap.put(-24, "The operation could not be performed due to a network error");
        hashMap.put(-25, "The write was canceled by the user.");
        hashMap.put(-999, "An unknown error occurred");
        HashMap hashMap2 = new HashMap();
        f4352e = hashMap2;
        hashMap2.put("datastale", -1);
        hashMap2.put("failure", -2);
        hashMap2.put("permission_denied", -3);
        hashMap2.put("disconnected", -4);
        hashMap2.put("expired_token", -6);
        hashMap2.put("invalid_token", -7);
        hashMap2.put("maxretries", -8);
        hashMap2.put("overriddenbyset", -9);
        hashMap2.put("unavailable", -10);
        hashMap2.put("network_error", -24);
        hashMap2.put("write_canceled", -25);
    }

    public c(int i7, String str) {
        this(i7, str, null);
    }

    public static c a(int i7) {
        Map map = f4351d;
        if (map.containsKey(Integer.valueOf(i7))) {
            return new c(i7, (String) map.get(Integer.valueOf(i7)), null);
        }
        throw new IllegalArgumentException("Invalid Firebase Database error code: " + i7);
    }

    public static c b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new c(-11, ((String) f4351d.get(-11)) + stringWriter.toString());
    }

    public static c c(String str) {
        return d(str, null);
    }

    public static c d(String str, String str2) {
        return e(str, str2, null);
    }

    public static c e(String str, String str2, String str3) {
        Integer num = (Integer) f4352e.get(str.toLowerCase(Locale.US));
        if (num == null) {
            num = -999;
        }
        if (str2 == null) {
            str2 = (String) f4351d.get(num);
        }
        return new c(num.intValue(), str2, str3);
    }

    public int f() {
        return this.f4353a;
    }

    public String g() {
        return this.f4355c;
    }

    public String h() {
        return this.f4354b;
    }

    public d i() {
        return new d("Firebase Database error: " + this.f4354b);
    }

    public String toString() {
        return "DatabaseError: " + this.f4354b;
    }

    public c(int i7, String str, String str2) {
        this.f4353a = i7;
        this.f4354b = str;
        this.f4355c = str2 == null ? "" : str2;
    }
}
