package eb;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class q implements Comparable<q> {

    /* renamed from: d, reason: collision with root package name */
    public static final a f5189d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final long f5190e;
    public static final long f;

    /* renamed from: o, reason: collision with root package name */
    public static final long f5191o;

    /* renamed from: a, reason: collision with root package name */
    public final b f5192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5193b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5194c;

    public static class a extends b {
    }

    public static abstract class b {
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        f5190e = nanos;
        f = -nanos;
        f5191o = TimeUnit.SECONDS.toNanos(1L);
    }

    public q(long j10) {
        a aVar = f5189d;
        long nanoTime = System.nanoTime();
        this.f5192a = aVar;
        long min = Math.min(f5190e, Math.max(f, j10));
        this.f5193b = nanoTime + min;
        this.f5194c = min <= 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(q qVar) {
        q qVar2 = qVar;
        f(qVar2);
        long j10 = this.f5193b - qVar2.f5193b;
        if (j10 < 0) {
            return -1;
        }
        return j10 > 0 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        b bVar = this.f5192a;
        if (bVar != null ? bVar == qVar.f5192a : qVar.f5192a == null) {
            return this.f5193b == qVar.f5193b;
        }
        return false;
    }

    public final void f(q qVar) {
        if (this.f5192a == qVar.f5192a) {
            return;
        }
        StringBuilder l10 = defpackage.f.l("Tickers (");
        l10.append(this.f5192a);
        l10.append(" and ");
        l10.append(qVar.f5192a);
        l10.append(") don't match. Custom Ticker should only be used in tests!");
        throw new AssertionError(l10.toString());
    }

    public final boolean g() {
        if (!this.f5194c) {
            long j10 = this.f5193b;
            ((a) this.f5192a).getClass();
            if (j10 - System.nanoTime() > 0) {
                return false;
            }
            this.f5194c = true;
        }
        return true;
    }

    public final long h(TimeUnit timeUnit) {
        ((a) this.f5192a).getClass();
        long nanoTime = System.nanoTime();
        if (!this.f5194c && this.f5193b - nanoTime <= 0) {
            this.f5194c = true;
        }
        return timeUnit.convert(this.f5193b - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final int hashCode() {
        return Arrays.asList(this.f5192a, Long.valueOf(this.f5193b)).hashCode();
    }

    public final String toString() {
        long h10 = h(TimeUnit.NANOSECONDS);
        long abs = Math.abs(h10);
        long j10 = f5191o;
        long j11 = abs / j10;
        long abs2 = Math.abs(h10) % j10;
        StringBuilder sb2 = new StringBuilder();
        if (h10 < 0) {
            sb2.append('-');
        }
        sb2.append(j11);
        if (abs2 > 0) {
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb2.append("s from now");
        if (this.f5192a != f5189d) {
            StringBuilder l10 = defpackage.f.l(" (ticker=");
            l10.append(this.f5192a);
            l10.append(")");
            sb2.append(l10.toString());
        }
        return sb2.toString();
    }
}
