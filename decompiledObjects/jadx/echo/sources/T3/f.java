package T3;

import java.net.URI;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f6102a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6103b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6104c;

    public f(String str, String str2, boolean z7) {
        this.f6102a = str;
        this.f6103b = str2;
        this.f6104c = z7;
    }

    public static URI a(String str, boolean z7, String str2, String str3) {
        String str4 = (z7 ? "wss" : "ws") + "://" + str + "/.ws?ns=" + str2 + "&v=5";
        if (str3 != null) {
            str4 = str4 + "&ls=" + str3;
        }
        return URI.create(str4);
    }

    public String b() {
        return this.f6102a;
    }

    public String c() {
        return this.f6103b;
    }

    public boolean d() {
        return this.f6104c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("http");
        sb.append(this.f6104c ? "s" : "");
        sb.append("://");
        sb.append(this.f6102a);
        return sb.toString();
    }
}
