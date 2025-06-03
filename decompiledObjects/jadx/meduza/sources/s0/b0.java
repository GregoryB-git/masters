package s0;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile o0 f13946a;

    /* renamed from: b, reason: collision with root package name */
    public volatile g f13947b;

    static {
        n.a();
    }

    public final o0 a(o0 o0Var) {
        if (this.f13946a == null) {
            synchronized (this) {
                if (this.f13946a == null) {
                    try {
                        this.f13946a = o0Var;
                        this.f13947b = g.f13982b;
                    } catch (y unused) {
                        this.f13946a = o0Var;
                        this.f13947b = g.f13982b;
                    }
                }
            }
        }
        return this.f13946a;
    }

    public final g b() {
        if (this.f13947b != null) {
            return this.f13947b;
        }
        synchronized (this) {
            if (this.f13947b != null) {
                return this.f13947b;
            }
            this.f13947b = this.f13946a == null ? g.f13982b : this.f13946a.c();
            return this.f13947b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        o0 o0Var = this.f13946a;
        o0 o0Var2 = b0Var.f13946a;
        return (o0Var == null && o0Var2 == null) ? b().equals(b0Var.b()) : (o0Var == null || o0Var2 == null) ? o0Var != null ? o0Var.equals(b0Var.a(o0Var.b())) : a(o0Var2.b()).equals(o0Var2) : o0Var.equals(o0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
