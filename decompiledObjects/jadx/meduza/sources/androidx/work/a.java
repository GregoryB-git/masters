package androidx.work;

import android.os.Build;
import b.a0;
import java.util.concurrent.ExecutorService;
import o2.k;
import o2.r;
import o2.s;
import p2.m0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f1442a = a0.f(false);

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1443b = a0.f(true);

    /* renamed from: c, reason: collision with root package name */
    public final m0 f1444c = new m0();

    /* renamed from: d, reason: collision with root package name */
    public final r f1445d;

    /* renamed from: e, reason: collision with root package name */
    public final k f1446e;
    public final p2.c f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1447g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1448h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1449i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1450j;

    /* renamed from: androidx.work.a$a, reason: collision with other inner class name */
    public static final class C0023a {
    }

    public interface b {
        a a();
    }

    public a(C0023a c0023a) {
        String str = s.f11752a;
        this.f1445d = new r();
        this.f1446e = k.f11722b;
        this.f = new p2.c();
        this.f1447g = 4;
        this.f1448h = Integer.MAX_VALUE;
        this.f1450j = Build.VERSION.SDK_INT == 23 ? 10 : 20;
        this.f1449i = 8;
    }
}
