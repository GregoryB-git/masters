package gb;

import eb.e1;
import java.util.Arrays;
import java.util.Set;
import n7.g;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6887a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6888b;

    /* renamed from: c, reason: collision with root package name */
    public final o7.x f6889c;

    public x0(int i10, long j10, Set<e1.a> set) {
        this.f6887a = i10;
        this.f6888b = j10;
        this.f6889c = o7.x.q(set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x0.class != obj.getClass()) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.f6887a == x0Var.f6887a && this.f6888b == x0Var.f6888b && x6.b.Q(this.f6889c, x0Var.f6889c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6887a), Long.valueOf(this.f6888b), this.f6889c});
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.d(String.valueOf(this.f6887a), "maxAttempts");
        b10.b("hedgingDelayNanos", this.f6888b);
        b10.a(this.f6889c, "nonFatalStatusCodes");
        return b10.toString();
    }
}
