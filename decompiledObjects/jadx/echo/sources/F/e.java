package F;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f1698a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1699b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1700c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1701d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1702e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final String f1703f;

    public e(String str, String str2, String str3, List list) {
        this.f1698a = (String) H.e.b(str);
        this.f1699b = (String) H.e.b(str2);
        this.f1700c = (String) H.e.b(str3);
        this.f1701d = (List) H.e.b(list);
        this.f1703f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f1701d;
    }

    public int c() {
        return this.f1702e;
    }

    public String d() {
        return this.f1703f;
    }

    public String e() {
        return this.f1698a;
    }

    public String f() {
        return this.f1699b;
    }

    public String g() {
        return this.f1700c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f1698a + ", mProviderPackage: " + this.f1699b + ", mQuery: " + this.f1700c + ", mCertificates:");
        for (int i7 = 0; i7 < this.f1701d.size(); i7++) {
            sb.append(" [");
            List list = (List) this.f1701d.get(i7);
            for (int i8 = 0; i8 < list.size(); i8++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i8), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f1702e);
        return sb.toString();
    }
}
