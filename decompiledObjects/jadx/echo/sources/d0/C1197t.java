package d0;

/* renamed from: d0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1197t {

    /* renamed from: c, reason: collision with root package name */
    public static final String f12788c = g0.M.w0(0);

    /* renamed from: d, reason: collision with root package name */
    public static final String f12789d = g0.M.w0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f12790a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12791b;

    public C1197t(String str, String str2) {
        this.f12790a = g0.M.L0(str);
        this.f12791b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1197t c1197t = (C1197t) obj;
        return g0.M.c(this.f12790a, c1197t.f12790a) && g0.M.c(this.f12791b, c1197t.f12791b);
    }

    public int hashCode() {
        int hashCode = this.f12791b.hashCode() * 31;
        String str = this.f12790a;
        return hashCode + (str != null ? str.hashCode() : 0);
    }
}
