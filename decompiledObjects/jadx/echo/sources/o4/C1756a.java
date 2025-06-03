package o4;

import java.util.List;

/* renamed from: o4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1756a extends r {

    /* renamed from: a, reason: collision with root package name */
    public final String f18175a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18176b;

    public C1756a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f18175a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f18176b = list;
    }

    @Override // o4.r
    public List b() {
        return this.f18176b;
    }

    @Override // o4.r
    public String c() {
        return this.f18175a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f18175a.equals(rVar.c()) && this.f18176b.equals(rVar.b());
    }

    public int hashCode() {
        return ((this.f18175a.hashCode() ^ 1000003) * 1000003) ^ this.f18176b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f18175a + ", usedDates=" + this.f18176b + "}";
    }
}
