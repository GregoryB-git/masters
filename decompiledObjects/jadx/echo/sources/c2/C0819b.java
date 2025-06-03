package c2;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10071a;

    public C0819b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f10071a = str;
    }

    public static C0819b b(String str) {
        return new C0819b(str);
    }

    public String a() {
        return this.f10071a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0819b) {
            return this.f10071a.equals(((C0819b) obj).f10071a);
        }
        return false;
    }

    public int hashCode() {
        return this.f10071a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f10071a + "\"}";
    }
}
