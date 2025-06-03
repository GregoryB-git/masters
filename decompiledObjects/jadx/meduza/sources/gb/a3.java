package gb;

import eb.e1;
import java.util.Arrays;
import java.util.Set;
import n7.g;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6189a;

    /* renamed from: b, reason: collision with root package name */
    public final long f6190b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6191c;

    /* renamed from: d, reason: collision with root package name */
    public final double f6192d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6193e;
    public final o7.x f;

    public a3(int i10, long j10, long j11, double d10, Long l10, Set<e1.a> set) {
        this.f6189a = i10;
        this.f6190b = j10;
        this.f6191c = j11;
        this.f6192d = d10;
        this.f6193e = l10;
        this.f = o7.x.q(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj;
        return this.f6189a == a3Var.f6189a && this.f6190b == a3Var.f6190b && this.f6191c == a3Var.f6191c && Double.compare(this.f6192d, a3Var.f6192d) == 0 && x6.b.Q(this.f6193e, a3Var.f6193e) && x6.b.Q(this.f, a3Var.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f6189a), Long.valueOf(this.f6190b), Long.valueOf(this.f6191c), Double.valueOf(this.f6192d), this.f6193e, this.f});
    }

    public final String toString() {
        g.a b10 = n7.g.b(this);
        b10.d(String.valueOf(this.f6189a), "maxAttempts");
        b10.b("initialBackoffNanos", this.f6190b);
        b10.b("maxBackoffNanos", this.f6191c);
        b10.d(String.valueOf(this.f6192d), "backoffMultiplier");
        b10.a(this.f6193e, "perAttemptRecvTimeoutNanos");
        b10.a(this.f, "retryableStatusCodes");
        return b10.toString();
    }
}
