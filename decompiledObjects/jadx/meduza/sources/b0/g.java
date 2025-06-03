package b0;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f1673a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1674b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1675c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f1676d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1677e;

    public g(String str, String str2, String str3, List<List<byte[]>> list) {
        str.getClass();
        this.f1673a = str;
        str2.getClass();
        this.f1674b = str2;
        this.f1675c = str3;
        list.getClass();
        this.f1676d = list;
        this.f1677e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        StringBuilder l10 = defpackage.f.l("FontRequest {mProviderAuthority: ");
        l10.append(this.f1673a);
        l10.append(", mProviderPackage: ");
        l10.append(this.f1674b);
        l10.append(", mQuery: ");
        l10.append(this.f1675c);
        l10.append(", mCertificates:");
        sb2.append(l10.toString());
        for (int i10 = 0; i10 < this.f1676d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f1676d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        return defpackage.g.f(sb2, "}", "mCertificatesArray: 0");
    }
}
