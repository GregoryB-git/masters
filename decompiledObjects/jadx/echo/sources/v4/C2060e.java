package v4;

import java.util.concurrent.TimeUnit;
import s4.q;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2060e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f20164d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f20165e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final q f20166a = q.c();

    /* renamed from: b, reason: collision with root package name */
    public long f20167b;

    /* renamed from: c, reason: collision with root package name */
    public int f20168c;

    public static boolean c(int i7) {
        return i7 == 429 || (i7 >= 500 && i7 < 600);
    }

    public static boolean d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    public final synchronized long a(int i7) {
        if (c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f20168c) + this.f20166a.e(), f20165e);
        }
        return f20164d;
    }

    public synchronized boolean b() {
        boolean z7;
        if (this.f20168c != 0) {
            z7 = this.f20166a.a() > this.f20167b;
        }
        return z7;
    }

    public final synchronized void e() {
        this.f20168c = 0;
    }

    public synchronized void f(int i7) {
        if (d(i7)) {
            e();
            return;
        }
        this.f20168c++;
        this.f20167b = this.f20166a.a() + a(i7);
    }
}
