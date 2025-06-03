// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import W2.g;
import W2.m;
import W2.s;
import W2.t;
import W2.l;
import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class S2
{
    public static final Object g;
    public static volatile Z2 h;
    public static final AtomicReference i;
    public static d3 j;
    public static final AtomicInteger k;
    public final a3 a;
    public final String b;
    public final Object c;
    public volatile int d;
    public volatile Object e;
    public final boolean f;
    
    static {
        g = new Object();
        i = new AtomicReference();
        S2.j = new d3(T2.a);
        k = new AtomicInteger();
    }
    
    public S2(final a3 a, final String b, final Object c, final boolean f) {
        this.d = -1;
        final String a2 = a.a;
        if (a2 == null && a.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (a2 != null && a.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
    }
    
    public static void l(Context context) {
        if (S2.h != null) {
            return;
        }
        if (context == null) {
            return;
        }
        final Object g = S2.g;
        // monitorenter(g)
        while (true) {
            try {
                while (true) {
                    if (S2.h == null) {
                        // monitorenter(g)
                        while (true) {
                            try {
                                final Z2 h = S2.h;
                                final Context applicationContext = context.getApplicationContext();
                                if (applicationContext != null) {
                                    context = applicationContext;
                                }
                                if (h == null || h.a() != context) {
                                    B2.d();
                                    b3.c();
                                    J2.b();
                                    S2.h = new x2(context, t.a(new U2(context)));
                                    S2.k.incrementAndGet();
                                }
                                // monitorexit(g)
                                // monitorexit(g)
                                return;
                                // monitorexit(g)
                                return;
                            }
                            // monitorexit(g)
                            finally {}
                            continue;
                        }
                    }
                    continue;
                }
            }
            finally {}
            continue;
        }
    }
    
    public static void m() {
        S2.k.incrementAndGet();
    }
    
    public final Object f() {
        if (!this.f) {
            m.p(S2.j.a(this.b), "Attempt to access PhenotypeFlag not via codegen. All new PhenotypeFlags must be accessed through codegen APIs. If you believe you are seeing this error by mistake, you can add your flag to the exemption list located at //java/com/google/android/libraries/phenotype/client/lockdown/flags.textproto. Send the addition CL to ph-reviews@. See go/phenotype-android-codegen for information about generated code. See go/ph-lockdown for more information about this error.");
        }
        final int value = S2.k.get();
        Label_0270: {
            if (this.d >= value) {
                break Label_0270;
            }
        Label_0146_Outer:
            while (true) {
                // monitorenter(this)
                Z2 h = null;
                Object a;
                Object o2;
                Object o;
                l l;
                Object e;
                boolean b;
                Label_0251_Outer:Label_0266_Outer:
                while (true) {
                    Label_0279: {
                        while (true) {
                            try {
                                if (this.d < value) {
                                    h = S2.h;
                                    a = W2.l.a();
                                    o = (o2 = null);
                                    if (h == null) {
                                        break Label_0279;
                                    }
                                    l = (l)(a = h.b().get());
                                    o2 = o;
                                    if (l.c()) {
                                        a = l.b();
                                        o2 = this.a;
                                        o2 = ((K2)a).a(((a3)o2).b, ((a3)o2).a, ((a3)o2).d, this.b);
                                        a = l;
                                    }
                                    break Label_0279;
                                }
                                // monitorexit(this)
                                // iftrue(Label_0176:, e == null)
                                // iftrue(Label_0190:, !this.a.f)
                                // iftrue(Label_0218:, e == null)
                                // iftrue(Label_0244:, o2 != null)
                                // iftrue(Label_0251:, !a.c())
                                // iftrue(Label_0218:, e == null)
                                // iftrue(Label_0204:, e == null)
                                // monitorexit(this)
                                Label_0223:Block_12_Outer:
                                while (true) {
                                    Block_10: {
                                        while (true) {
                                        Label_0251:
                                            while (true) {
                                            Block_11:
                                                while (true) {
                                                    while (true) {
                                                    Block_9_Outer:
                                                        while (true) {
                                                            return this.e;
                                                            while (true) {
                                                                e = this.g(h);
                                                                break Block_10;
                                                                m.p(b, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                                                continue Label_0146_Outer;
                                                            }
                                                            Label_0204: {
                                                                e = this.g(h);
                                                            }
                                                            break Block_11;
                                                            while (true) {
                                                                e = this.c;
                                                                break Label_0251;
                                                                break Label_0223;
                                                                continue Label_0251_Outer;
                                                            }
                                                            break Label_0223;
                                                            this.e = e;
                                                            this.d = value;
                                                            continue Block_9_Outer;
                                                        }
                                                        continue Block_12_Outer;
                                                    }
                                                    Label_0176: {
                                                        e = this.j(h);
                                                    }
                                                    continue Block_11;
                                                }
                                                Label_0218: {
                                                    e = this.c;
                                                }
                                                continue Label_0223;
                                                Label_0244:
                                                e = this.h(o2);
                                                continue Label_0251;
                                            }
                                            Label_0190: {
                                                e = this.j(h);
                                            }
                                            continue Label_0266_Outer;
                                        }
                                    }
                                    continue Label_0223;
                                }
                            }
                            finally {}
                            continue;
                        }
                    }
                    b = (h != null);
                    continue;
                }
            }
        }
    }
    
    public final Object g(final Z2 z2) {
        final a3 a = this.a;
        if (!a.e) {
            final g i = a.i;
            if (i == null || (boolean)i.apply(z2.a())) {
                final J2 a2 = J2.a(z2.a());
                final a3 a3 = this.a;
                String j;
                if (a3.e) {
                    j = null;
                }
                else {
                    j = this.i(a3.c);
                }
                final Object k = a2.i(j);
                if (k != null) {
                    return this.h(k);
                }
            }
        }
        return null;
    }
    
    public abstract Object h(final Object p0);
    
    public final String i(final String str) {
        if (str != null && str.isEmpty()) {
            return this.b;
        }
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(b);
        return sb.toString();
    }
    
    public final Object j(final Z2 z2) {
        E2 e2;
        if (this.a.b != null) {
            if (Q2.b(z2.a(), this.a.b)) {
                if (this.a.h) {
                    e2 = B2.a(z2.a().getContentResolver(), P2.a(P2.b(z2.a(), this.a.b.getLastPathSegment())), R2.o);
                }
                else {
                    e2 = B2.a(z2.a().getContentResolver(), this.a.b, R2.o);
                }
            }
            else {
                e2 = null;
            }
        }
        else {
            e2 = b3.b(z2.a(), this.a.a, R2.o);
        }
        if (e2 != null) {
            final Object i = e2.i(this.k());
            if (i != null) {
                return this.h(i);
            }
        }
        return null;
    }
    
    public final String k() {
        return this.i(this.a.d);
    }
}
