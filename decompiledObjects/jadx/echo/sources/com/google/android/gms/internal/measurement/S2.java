package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class S2 {

    /* renamed from: h, reason: collision with root package name */
    public static volatile Z2 f10570h;

    /* renamed from: a, reason: collision with root package name */
    public final C0859a3 f10574a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10575b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10576c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f10577d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f10578e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10579f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f10569g = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference f10571i = new AtomicReference();

    /* renamed from: j, reason: collision with root package name */
    public static C0886d3 f10572j = new C0886d3(new InterfaceC0922h3() { // from class: com.google.android.gms.internal.measurement.T2
        @Override // com.google.android.gms.internal.measurement.InterfaceC0922h3
        public final boolean a() {
            return S2.n();
        }
    });

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f10573k = new AtomicInteger();

    public S2(C0859a3 c0859a3, String str, Object obj, boolean z7) {
        this.f10577d = -1;
        String str2 = c0859a3.f10813a;
        if (str2 == null && c0859a3.f10814b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && c0859a3.f10814b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.f10574a = c0859a3;
        this.f10575b = str;
        this.f10576c = obj;
        this.f10579f = z7;
    }

    public static /* synthetic */ S2 b(C0859a3 c0859a3, String str, Boolean bool, boolean z7) {
        return new V2(c0859a3, str, bool, true);
    }

    public static /* synthetic */ S2 c(C0859a3 c0859a3, String str, Double d7, boolean z7) {
        return new Y2(c0859a3, str, d7, true);
    }

    public static /* synthetic */ S2 d(C0859a3 c0859a3, String str, Long l7, boolean z7) {
        return new W2(c0859a3, str, l7, true);
    }

    public static /* synthetic */ S2 e(C0859a3 c0859a3, String str, String str2, boolean z7) {
        return new X2(c0859a3, str, str2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004b, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(final android.content.Context r3) {
        /*
            com.google.android.gms.internal.measurement.Z2 r0 = com.google.android.gms.internal.measurement.S2.f10570h
            if (r0 != 0) goto L4c
            if (r3 != 0) goto L7
            goto L4c
        L7:
            java.lang.Object r0 = com.google.android.gms.internal.measurement.S2.f10569g
            monitor-enter(r0)
            com.google.android.gms.internal.measurement.Z2 r1 = com.google.android.gms.internal.measurement.S2.f10570h     // Catch: java.lang.Throwable -> L46
            if (r1 != 0) goto L48
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L46
            com.google.android.gms.internal.measurement.Z2 r1 = com.google.android.gms.internal.measurement.S2.f10570h     // Catch: java.lang.Throwable -> L22
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L18
            goto L19
        L18:
            r3 = r2
        L19:
            if (r1 == 0) goto L24
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L22
            if (r1 == r3) goto L42
            goto L24
        L22:
            r3 = move-exception
            goto L44
        L24:
            com.google.android.gms.internal.measurement.B2.d()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.C0868b3.c()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.J2.b()     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.U2 r1 = new com.google.android.gms.internal.measurement.U2     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            W2.s r1 = W2.t.a(r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.x2 r2 = new com.google.android.gms.internal.measurement.x2     // Catch: java.lang.Throwable -> L22
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            com.google.android.gms.internal.measurement.S2.f10570h = r2     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.atomic.AtomicInteger r3 = com.google.android.gms.internal.measurement.S2.f10573k     // Catch: java.lang.Throwable -> L22
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L22
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            goto L48
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r3     // Catch: java.lang.Throwable -> L46
        L46:
            r3 = move-exception
            goto L4a
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r3
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S2.l(android.content.Context):void");
    }

    public static void m() {
        f10573k.incrementAndGet();
    }

    public static /* synthetic */ boolean n() {
        return true;
    }

    public final Object f() {
        Object j7;
        if (!this.f10579f) {
            W2.m.p(f10572j.a(this.f10575b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        int i7 = f10573k.get();
        if (this.f10577d < i7) {
            synchronized (this) {
                try {
                    if (this.f10577d < i7) {
                        Z2 z22 = f10570h;
                        W2.l a7 = W2.l.a();
                        String str = null;
                        if (z22 != null) {
                            a7 = (W2.l) z22.b().get();
                            if (a7.c()) {
                                K2 k22 = (K2) a7.b();
                                C0859a3 c0859a3 = this.f10574a;
                                str = k22.a(c0859a3.f10814b, c0859a3.f10813a, c0859a3.f10816d, this.f10575b);
                            }
                        }
                        W2.m.p(z22 != null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                        if (!this.f10574a.f10818f ? (j7 = j(z22)) == null && (j7 = g(z22)) == null : (j7 = g(z22)) == null && (j7 = j(z22)) == null) {
                            j7 = this.f10576c;
                        }
                        if (a7.c()) {
                            j7 = str == null ? this.f10576c : h(str);
                        }
                        this.f10578e = j7;
                        this.f10577d = i7;
                    }
                } finally {
                }
            }
        }
        return this.f10578e;
    }

    public final Object g(Z2 z22) {
        W2.g gVar;
        C0859a3 c0859a3 = this.f10574a;
        if (!c0859a3.f10817e && ((gVar = c0859a3.f10821i) == null || ((Boolean) gVar.apply(z22.a())).booleanValue())) {
            J2 a7 = J2.a(z22.a());
            C0859a3 c0859a32 = this.f10574a;
            Object i7 = a7.i(c0859a32.f10817e ? null : i(c0859a32.f10815c));
            if (i7 != null) {
                return h(i7);
            }
        }
        return null;
    }

    public abstract Object h(Object obj);

    public final String i(String str) {
        if (str != null && str.isEmpty()) {
            return this.f10575b;
        }
        return str + this.f10575b;
    }

    public final Object j(Z2 z22) {
        Object i7;
        E2 a7 = this.f10574a.f10814b != null ? Q2.b(z22.a(), this.f10574a.f10814b) ? this.f10574a.f10820h ? B2.a(z22.a().getContentResolver(), P2.a(P2.b(z22.a(), this.f10574a.f10814b.getLastPathSegment())), new Runnable() { // from class: com.google.android.gms.internal.measurement.R2
            @Override // java.lang.Runnable
            public final void run() {
                S2.m();
            }
        }) : B2.a(z22.a().getContentResolver(), this.f10574a.f10814b, new Runnable() { // from class: com.google.android.gms.internal.measurement.R2
            @Override // java.lang.Runnable
            public final void run() {
                S2.m();
            }
        }) : null : C0868b3.b(z22.a(), this.f10574a.f10813a, new Runnable() { // from class: com.google.android.gms.internal.measurement.R2
            @Override // java.lang.Runnable
            public final void run() {
                S2.m();
            }
        });
        if (a7 == null || (i7 = a7.i(k())) == null) {
            return null;
        }
        return h(i7);
    }

    public final String k() {
        return i(this.f10574a.f10816d);
    }
}
