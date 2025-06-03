package O4;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4013a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4014b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4013a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4014b = str2;
    }

    @Override // O4.f
    public String b() {
        return this.f4013a;
    }

    @Override // O4.f
    public String c() {
        return this.f4014b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4013a.equals(fVar.b()) && this.f4014b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f4013a.hashCode() ^ 1000003) * 1000003) ^ this.f4014b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4013a + ", version=" + this.f4014b + "}";
    }
}
