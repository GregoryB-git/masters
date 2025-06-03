package ma;

/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public volatile s0 f10952a;

    /* renamed from: b, reason: collision with root package name */
    public volatile h f10953b;

    static {
        o.a();
    }

    public final s0 a(s0 s0Var) {
        if (this.f10952a == null) {
            synchronized (this) {
                if (this.f10952a == null) {
                    try {
                        this.f10952a = s0Var;
                        this.f10953b = h.f10961b;
                    } catch (b0 unused) {
                        this.f10952a = s0Var;
                        this.f10953b = h.f10961b;
                    }
                }
            }
        }
        return this.f10952a;
    }

    public final h b() {
        if (this.f10953b != null) {
            return this.f10953b;
        }
        synchronized (this) {
            if (this.f10953b != null) {
                return this.f10953b;
            }
            this.f10953b = this.f10952a == null ? h.f10961b : this.f10952a.c();
            return this.f10953b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        s0 s0Var = this.f10952a;
        s0 s0Var2 = f0Var.f10952a;
        return (s0Var == null && s0Var2 == null) ? b().equals(f0Var.b()) : (s0Var == null || s0Var2 == null) ? s0Var != null ? s0Var.equals(f0Var.a(s0Var.b())) : a(s0Var2.b()).equals(s0Var2) : s0Var.equals(s0Var2);
    }

    public int hashCode() {
        return 1;
    }
}
