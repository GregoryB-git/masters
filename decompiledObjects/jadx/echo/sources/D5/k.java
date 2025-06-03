package D5;

import java.util.Locale;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public b f1294a;

    /* renamed from: b, reason: collision with root package name */
    public b f1295b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1296c;

    /* renamed from: d, reason: collision with root package name */
    public final E5.a f1297d;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1298a;

        static {
            int[] iArr = new int[b.values().length];
            f1298a = iArr;
            try {
                iArr[b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1298a[b.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1298a[b.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1298a[b.PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1298a[b.DETACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum b {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public k(E5.a aVar) {
        this.f1294a = null;
        this.f1295b = null;
        this.f1296c = true;
        this.f1297d = aVar;
    }

    public void a() {
        g(this.f1294a, true);
    }

    public void b() {
        g(b.DETACHED, this.f1296c);
    }

    public void c() {
        g(b.INACTIVE, this.f1296c);
    }

    public void d() {
        g(b.PAUSED, this.f1296c);
    }

    public void e() {
        g(b.RESUMED, this.f1296c);
    }

    public void f() {
        g(this.f1294a, false);
    }

    public final void g(b bVar, boolean z7) {
        b bVar2 = this.f1294a;
        if (bVar2 == bVar && z7 == this.f1296c) {
            return;
        }
        if (bVar == null && bVar2 == null) {
            this.f1296c = z7;
            return;
        }
        int i7 = a.f1298a[bVar.ordinal()];
        b bVar3 = i7 != 1 ? (i7 == 2 || i7 == 3 || i7 == 4 || i7 == 5) ? bVar : null : z7 ? b.RESUMED : b.INACTIVE;
        this.f1294a = bVar;
        this.f1296c = z7;
        if (bVar3 == this.f1295b) {
            return;
        }
        String str = "AppLifecycleState." + bVar3.name().toLowerCase(Locale.ROOT);
        AbstractC1995b.f("LifecycleChannel", "Sending " + str + " message.");
        this.f1297d.c(str);
        this.f1295b = bVar3;
    }

    public k(C2105a c2105a) {
        this(new E5.a(c2105a, "flutter/lifecycle", E5.r.f1688b));
    }
}
