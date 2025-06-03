package gb;

import gb.j;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k0 implements j {

    /* renamed from: a, reason: collision with root package name */
    public Random f6556a = new Random();

    /* renamed from: b, reason: collision with root package name */
    public long f6557b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c, reason: collision with root package name */
    public long f6558c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d, reason: collision with root package name */
    public double f6559d = 1.6d;

    /* renamed from: e, reason: collision with root package name */
    public double f6560e = 0.2d;
    public long f = this.f6557b;

    public static final class a implements j.a {
    }

    public final long a() {
        long j10 = this.f;
        double d10 = j10;
        this.f = Math.min((long) (this.f6559d * d10), this.f6558c);
        double d11 = this.f6560e;
        double d12 = (-d11) * d10;
        double d13 = d11 * d10;
        x6.b.t(d13 >= d12);
        return j10 + ((long) ((this.f6556a.nextDouble() * (d13 - d12)) + d12));
    }
}
