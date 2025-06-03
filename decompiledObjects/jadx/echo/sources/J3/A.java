package J3;

import J3.D;

/* loaded from: classes.dex */
public final class A extends D.c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2686a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2687b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2688c;

    public A(String str, String str2, boolean z7) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f2686a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f2687b = str2;
        this.f2688c = z7;
    }

    @Override // J3.D.c
    public boolean b() {
        return this.f2688c;
    }

    @Override // J3.D.c
    public String c() {
        return this.f2687b;
    }

    @Override // J3.D.c
    public String d() {
        return this.f2686a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.c)) {
            return false;
        }
        D.c cVar = (D.c) obj;
        return this.f2686a.equals(cVar.d()) && this.f2687b.equals(cVar.c()) && this.f2688c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f2686a.hashCode() ^ 1000003) * 1000003) ^ this.f2687b.hashCode()) * 1000003) ^ (this.f2688c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f2686a + ", osCodeName=" + this.f2687b + ", isRooted=" + this.f2688c + "}";
    }
}
