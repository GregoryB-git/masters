package ea;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f4855a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4856b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4857c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4858d;

    /* renamed from: e, reason: collision with root package name */
    public final s f4859e;
    public final List<s> f;

    public a(String str, String str2, String str3, String str4, s sVar, ArrayList arrayList) {
        ec.i.e(str2, "versionName");
        ec.i.e(str3, "appBuildVersion");
        this.f4855a = str;
        this.f4856b = str2;
        this.f4857c = str3;
        this.f4858d = str4;
        this.f4859e = sVar;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return ec.i.a(this.f4855a, aVar.f4855a) && ec.i.a(this.f4856b, aVar.f4856b) && ec.i.a(this.f4857c, aVar.f4857c) && ec.i.a(this.f4858d, aVar.f4858d) && ec.i.a(this.f4859e, aVar.f4859e) && ec.i.a(this.f, aVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f4859e.hashCode() + a0.j.e(this.f4858d, a0.j.e(this.f4857c, a0.j.e(this.f4856b, this.f4855a.hashCode() * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("AndroidApplicationInfo(packageName=");
        l10.append(this.f4855a);
        l10.append(", versionName=");
        l10.append(this.f4856b);
        l10.append(", appBuildVersion=");
        l10.append(this.f4857c);
        l10.append(", deviceManufacturer=");
        l10.append(this.f4858d);
        l10.append(", currentProcessDetails=");
        l10.append(this.f4859e);
        l10.append(", appProcessDetails=");
        l10.append(this.f);
        l10.append(')');
        return l10.toString();
    }
}
