package M4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final F4.a f3541b = F4.a.e();

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3542a;

    public f() {
        this(new Bundle());
    }

    public boolean a(String str) {
        return str != null && this.f3542a.containsKey(str);
    }

    public g b(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Boolean) this.f3542a.get(str));
        } catch (ClassCastException e7) {
            f3541b.b("Metadata key %s contains type other than boolean: %s", str, e7.getMessage());
            return g.a();
        }
    }

    public g c(String str) {
        if (!a(str)) {
            return g.a();
        }
        Object obj = this.f3542a.get(str);
        if (obj == null) {
            return g.a();
        }
        if (obj instanceof Float) {
            return g.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return g.e((Double) obj);
        }
        f3541b.b("Metadata key %s contains type other than double: %s", str);
        return g.a();
    }

    public final g d(String str) {
        if (!a(str)) {
            return g.a();
        }
        try {
            return g.b((Integer) this.f3542a.get(str));
        } catch (ClassCastException e7) {
            f3541b.b("Metadata key %s contains type other than int: %s", str, e7.getMessage());
            return g.a();
        }
    }

    public g e(String str) {
        return d(str).d() ? g.e(Long.valueOf(((Integer) r3.c()).intValue())) : g.a();
    }

    public f(Bundle bundle) {
        this.f3542a = (Bundle) bundle.clone();
    }
}
