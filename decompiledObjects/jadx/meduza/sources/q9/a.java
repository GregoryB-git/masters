package q9;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends h {

    /* renamed from: a, reason: collision with root package name */
    public final String f13367a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f13368b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f13367a = str;
        this.f13368b = arrayList;
    }

    @Override // q9.h
    public final List<String> a() {
        return this.f13368b;
    }

    @Override // q9.h
    public final String b() {
        return this.f13367a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f13367a.equals(hVar.b()) && this.f13368b.equals(hVar.a());
    }

    public final int hashCode() {
        return ((this.f13367a.hashCode() ^ 1000003) * 1000003) ^ this.f13368b.hashCode();
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("HeartBeatResult{userAgent=");
        l10.append(this.f13367a);
        l10.append(", usedDates=");
        l10.append(this.f13368b);
        l10.append("}");
        return l10.toString();
    }
}
