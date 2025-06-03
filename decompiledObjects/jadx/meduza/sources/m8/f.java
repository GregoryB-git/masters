package m8;

import java.util.List;
import m8.f0;

/* loaded from: classes.dex */
public final class f extends f0.d {

    /* renamed from: a, reason: collision with root package name */
    public final List<f0.d.a> f10577a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10578b;

    public f(List list, String str) {
        this.f10577a = list;
        this.f10578b = str;
    }

    @Override // m8.f0.d
    public final List<f0.d.a> a() {
        return this.f10577a;
    }

    @Override // m8.f0.d
    public final String b() {
        return this.f10578b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0.d)) {
            return false;
        }
        f0.d dVar = (f0.d) obj;
        if (this.f10577a.equals(dVar.a())) {
            String str = this.f10578b;
            String b10 = dVar.b();
            if (str == null) {
                if (b10 == null) {
                    return true;
                }
            } else if (str.equals(b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f10577a.hashCode() ^ 1000003) * 1000003;
        String str = this.f10578b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("FilesPayload{files=");
        l10.append(this.f10577a);
        l10.append(", orgId=");
        return defpackage.g.f(l10, this.f10578b, "}");
    }
}
