package m8;

import m8.g0;

/* loaded from: classes.dex */
public final class e0 extends g0.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10575b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10576c;

    public e0(String str, String str2, boolean z10) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f10574a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f10575b = str2;
        this.f10576c = z10;
    }

    @Override // m8.g0.c
    public final boolean a() {
        return this.f10576c;
    }

    @Override // m8.g0.c
    public final String b() {
        return this.f10575b;
    }

    @Override // m8.g0.c
    public final String c() {
        return this.f10574a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0.c)) {
            return false;
        }
        g0.c cVar = (g0.c) obj;
        return this.f10574a.equals(cVar.c()) && this.f10575b.equals(cVar.b()) && this.f10576c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.f10574a.hashCode() ^ 1000003) * 1000003) ^ this.f10575b.hashCode()) * 1000003) ^ (this.f10576c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("OsData{osRelease=");
        l10.append(this.f10574a);
        l10.append(", osCodeName=");
        l10.append(this.f10575b);
        l10.append(", isRooted=");
        l10.append(this.f10576c);
        l10.append("}");
        return l10.toString();
    }
}
