package xc;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final a f17297d = new a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f17298a;

    /* renamed from: b, reason: collision with root package name */
    public long f17299b;

    /* renamed from: c, reason: collision with root package name */
    public long f17300c;

    public static final class a extends z {
        @Override // xc.z
        public final z d(long j10) {
            return this;
        }

        @Override // xc.z
        public final void f() {
        }

        @Override // xc.z
        public final z g(long j10, TimeUnit timeUnit) {
            ec.i.e(timeUnit, "unit");
            return this;
        }
    }

    public z a() {
        this.f17298a = false;
        return this;
    }

    public z b() {
        this.f17300c = 0L;
        return this;
    }

    public long c() {
        if (this.f17298a) {
            return this.f17299b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j10) {
        this.f17298a = true;
        this.f17299b = j10;
        return this;
    }

    public boolean e() {
        return this.f17298a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f17298a && this.f17299b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j10, TimeUnit timeUnit) {
        ec.i.e(timeUnit, "unit");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(a0.j.i("timeout < 0: ", j10).toString());
        }
        this.f17300c = timeUnit.toNanos(j10);
        return this;
    }
}
