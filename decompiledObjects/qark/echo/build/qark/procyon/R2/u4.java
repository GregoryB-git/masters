// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import android.util.Pair;
import java.util.List;
import java.util.Collections;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.n6;
import java.util.Arrays;
import com.google.android.gms.internal.measurement.a2;
import com.google.android.gms.internal.measurement.s7;
import java.io.IOException;
import com.google.android.gms.internal.measurement.Y3;
import android.os.Build$VERSION;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.c2;
import A2.n;

public final class u4 extends C5
{
    public u4(final D5 d5) {
        super(d5);
    }
    
    private static String c(final String s, final String s2) {
        throw new SecurityException("This implementation should not be used.");
    }
    
    @Override
    public final boolean x() {
        return false;
    }
    
    public final byte[] y(final I i, final String s) {
        this.n();
        super.a.Q();
        n.i(i);
        n.e(s);
        final boolean b = this.f().B(s, K.f0);
        int n = 0;
        if (!b) {
            this.j().F().b("Generating ScionPayload disabled. packageName", s);
            return new byte[0];
        }
        if (!"_iap".equals(i.o) && !"_iapx".equals(i.o)) {
            this.j().F().c("Generating a payload for this event is not available. package_name, event_name", s, i.o);
            return null;
        }
        final c2.a j = c2.J();
        this.q().Q0();
        final I l;
        Label_1777: {
            I2 d0;
            try {
                d0 = this.q().D0(s);
                if (d0 == null) {
                    this.j().F().b("Log and bundle not available. package_name", s);
                    this.q().R0();
                    return new byte[0];
                }
            }
            finally {
                break Label_1777;
            }
            if (!d0.r()) {
                this.j().F().b("Log and bundle disabled. package_name", s);
                this.q().R0();
                return new byte[0];
            }
            final d2.a o0 = d2.A3().m0(1).O0("android");
            if (!TextUtils.isEmpty((CharSequence)d0.t0())) {
                o0.O(d0.t0());
            }
            if (!TextUtils.isEmpty((CharSequence)d0.v0())) {
                o0.a0((String)A2.n.i(d0.v0()));
            }
            if (!TextUtils.isEmpty((CharSequence)d0.h())) {
                o0.g0((String)A2.n.i(d0.h()));
            }
            if (d0.z() != -2147483648L) {
                o0.d0((int)d0.z());
            }
            o0.j0(d0.g0()).Y(d0.c0());
            final String k = d0.j();
            final String r0 = d0.r0();
            if (!TextUtils.isEmpty((CharSequence)k)) {
                o0.I0(k);
            }
            else if (!TextUtils.isEmpty((CharSequence)r0)) {
                o0.I(r0);
            }
            o0.y0(d0.p0());
            final q3 q = super.b.Q(s);
            o0.S(d0.a0());
            if (super.a.p() && this.f().K(o0.S0()) && q.x() && !TextUtils.isEmpty((CharSequence)null)) {
                o0.z0(null);
            }
            o0.o0(q.v());
            if (q.x() && d0.q()) {
                final Pair z = this.s().z(d0.t0(), q);
                if (d0.q() && z != null && !TextUtils.isEmpty((CharSequence)z.first)) {
                    try {
                        o0.Q0(c((String)z.first, Long.toString(l.r)));
                        final Object second = z.second;
                        if (second != null) {
                            o0.V((boolean)second);
                        }
                    }
                    catch (SecurityException ex) {
                        this.j().F().b("Resettable device id encryption failed", ex.getMessage());
                        this.q().R0();
                        return new byte[0];
                    }
                }
            }
            d2.a w0;
            String m;
            Iterator iterator;
            String s2;
            a2.a b2;
            A a;
            Object k2;
            E c0;
            long f;
            E a2;
            long n2;
            List m2;
            String t0;
            Iterator<T5> iterator2;
            h2[] a3;
            Bundle d2;
            com.google.android.gms.internal.measurement.Y1.a a4;
            long m3;
            h2.a b3;
            T5 t2;
            R2.c2 b4;
            long i2;
            T5 t3;
            Label_1547_Outer:Label_0739_Outer:Label_0805_Outer:Label_1587_Outer:
            while (true) {
                this.g().o();
                w0 = o0.w0(Build.MODEL);
                this.g().o();
                w0.M0(Build$VERSION.RELEASE).u0((int)this.g().v()).T0(this.g().w());
            Label_1587:
                while (true) {
                Label_0805:
                    while (true) {
                        Label_0711: {
                            try {
                                if (q.y() && d0.u0() != null) {
                                    o0.U(c((String)A2.n.i(d0.u0()), Long.toString(l.r)));
                                }
                                break Label_0711;
                            }
                            catch (SecurityException ex2) {
                                this.j().F().b("app instance id encryption failed", ex2.getMessage());
                                this.q().R0();
                                return new byte[0];
                                // iftrue(Label_1792:, !s7.a())
                                // iftrue(Label_1311:, k2 == null)
                                // iftrue(Label_1215:, c0 != null)
                                // iftrue(Label_1547:, n2 == 0)
                                // iftrue(Label_1382:, !iterator.hasNext())
                                // iftrue(Label_0975:, n >= m2.size())
                                // iftrue(Label_1025:, !n6.a() || !this.f().s(K.T0))
                                // iftrue(Label_1535:, m3 == 0L)
                                // iftrue(Label_0868:, t2 != null && t2.e != null)
                                // iftrue(Label_1587:, !this.f().B(s, K.y0) || m == null)
                                // iftrue(Label_1653:, !this.f().s(K.C0))
                                // iftrue(Label_0766:, !"_lte".equals((Object)t2.c))
                                // iftrue(Label_0739:, TextUtils.isEmpty((CharSequence)d0.i()))
                                // iftrue(Label_1165:, !this.k().F0(o0.S0()))
                                // iftrue(Label_1486:, !a4.M())
                            Block_42_Outer:
                                while (true) {
                                    Block_31: {
                                        while (true) {
                                            Label_1486: {
                                                while (true) {
                                                    Label_0766: {
                                                        while (true) {
                                                            while (true) {
                                                                Label_1233_Outer:Label_1311_Outer:
                                                                while (true) {
                                                                Block_37_Outer:
                                                                    while (true) {
                                                                        while (true) {
                                                                        Label_0880:
                                                                            while (true) {
                                                                            Label_1311:
                                                                                while (true) {
                                                                                    Block_40: {
                                                                                        Block_36: {
                                                                                            while (true) {
                                                                                            Label_1233:
                                                                                                while (true) {
                                                                                                Block_38:
                                                                                                    while (true) {
                                                                                                        while (true) {
                                                                                                            j.x(o0);
                                                                                                            d0.j0(o0.W());
                                                                                                            d0.f0(o0.Q());
                                                                                                            this.q().U(d0);
                                                                                                            this.q().T0();
                                                                                                            this.q().R0();
                                                                                                            try {
                                                                                                                return this.o().g0(((c2)((Y3.b)j).p()).h());
                                                                                                            }
                                                                                                            catch (IOException ex3) {
                                                                                                                this.j().G().c("Data loss. Failed to bundle and serialize. appId", Y1.v(s), ex3);
                                                                                                                return null;
                                                                                                            }
                                                                                                            m = d0.m();
                                                                                                            Block_45: {
                                                                                                                break Block_45;
                                                                                                                while (true) {
                                                                                                                    s2 = iterator.next();
                                                                                                                    b2 = com.google.android.gms.internal.measurement.a2.Z().B(s2);
                                                                                                                    k2 = a.f.k(s2);
                                                                                                                    break Block_40;
                                                                                                                    Label_1215: {
                                                                                                                        f = c0.f;
                                                                                                                    }
                                                                                                                    a2 = c0.a(l.r);
                                                                                                                    break Label_1233;
                                                                                                                    c0 = this.q().C0(s, l.o);
                                                                                                                    break Block_38;
                                                                                                                    Label_1535:
                                                                                                                    break Block_37_Outer;
                                                                                                                    continue Label_1233_Outer;
                                                                                                                }
                                                                                                                Block_34: {
                                                                                                                    break Block_34;
                                                                                                                    t0 = d0.t0();
                                                                                                                    m2 = this.q().M0(t0);
                                                                                                                    iterator2 = m2.iterator();
                                                                                                                    break Label_0766;
                                                                                                                    Label_0975: {
                                                                                                                        o0.f0(Arrays.asList(a3));
                                                                                                                    }
                                                                                                                    this.o().T(o0);
                                                                                                                    break Block_36;
                                                                                                                    this.q().T(a2);
                                                                                                                    a = new A(super.a, l.q, s, l.o, l.r, f, d2);
                                                                                                                    a4 = com.google.android.gms.internal.measurement.Y1.Z().G(a.d).E(a.b).A(a.e);
                                                                                                                    iterator = a.f.iterator();
                                                                                                                    continue Label_1311;
                                                                                                                    m3 = d0.m0();
                                                                                                                    break Label_1233;
                                                                                                                }
                                                                                                                b3 = h2.X().z(m2.get(n).c).B(m2.get(n).d);
                                                                                                                this.o().U(b3, m2.get(n).e);
                                                                                                                a3[n] = (h2)((Y3.b)b3).p();
                                                                                                                ++n;
                                                                                                                continue Label_0880;
                                                                                                                o0.v0(a4.I()).e0(a4.I());
                                                                                                                break Label_1486;
                                                                                                                break Label_1233_Outer;
                                                                                                            }
                                                                                                            break Label_1311;
                                                                                                            super.b.E(o0.S0(), o0);
                                                                                                            continue Label_1547_Outer;
                                                                                                        }
                                                                                                        this.k().R(d2, "_dbg", 1L);
                                                                                                        this.k().R(d2, "_r", 1L);
                                                                                                        continue Label_1311_Outer;
                                                                                                    }
                                                                                                    a2 = new E(s, l.o, 0L, 0L, l.r, 0L, null, null, null, null);
                                                                                                    f = 0L;
                                                                                                    continue Label_1233;
                                                                                                }
                                                                                                o0.r0(m3);
                                                                                                continue Label_1233_Outer;
                                                                                                d0.p();
                                                                                                o0.i0((int)d0.k0()).F0(82001L).C0(this.b().a()).b0(true);
                                                                                                continue Block_37_Outer;
                                                                                            }
                                                                                        }
                                                                                        super.b.s(d0, o0);
                                                                                        break Label_0880;
                                                                                        t2 = iterator2.next();
                                                                                        continue Label_0805;
                                                                                    }
                                                                                    this.o().S(b2, k2);
                                                                                    a4.B(b2);
                                                                                    continue Label_1311;
                                                                                }
                                                                                o0.R0(m);
                                                                                continue Label_1587;
                                                                                break Block_31;
                                                                                a3 = new h2[m2.size()];
                                                                                continue Label_0880;
                                                                            }
                                                                            b4 = R2.c2.b(l);
                                                                            this.k().Q(b4.d, this.q().B0(s));
                                                                            this.k().K(b4, this.f().y(s));
                                                                            d2 = b4.d;
                                                                            ((BaseBundle)d2).putLong("_c", 1L);
                                                                            this.j().F().a("Marking in-app purchase as real-time");
                                                                            ((BaseBundle)d2).putLong("_r", 1L);
                                                                            ((BaseBundle)d2).putString("_o", l.q);
                                                                            continue Label_1587_Outer;
                                                                        }
                                                                        Label_1382: {
                                                                            o0.D(a4).E(e2.G().w(Z1.G().w(a2.c).x(l.o)));
                                                                        }
                                                                        o0.H(this.p().z(d0.t0(), Collections.emptyList(), o0.Z0(), a4.I(), a4.I()));
                                                                        continue Label_0805_Outer;
                                                                    }
                                                                    o0.r0(i2);
                                                                    continue Label_0739_Outer;
                                                                }
                                                                t3 = new T5(t0, "auto", "_lte", this.b().a(), 0L);
                                                                m2.add(t3);
                                                                this.q().d0(t3);
                                                                continue Block_42_Outer;
                                                            }
                                                            o0.n0(i2);
                                                            continue Label_0805_Outer;
                                                        }
                                                    }
                                                    continue Block_42_Outer;
                                                }
                                            }
                                            i2 = d0.i0();
                                            n2 = lcmp(i2, 0L);
                                            continue;
                                        }
                                    }
                                    o0.G0((String)A2.n.i(d0.i()));
                                    continue Label_0805_Outer;
                                }
                            }
                            // iftrue(Label_1786:, !iterator2.hasNext())
                            // iftrue(Label_1510:, n2 == 0)
                        }
                        break;
                        Label_1786: {
                            t2 = null;
                        }
                        continue Label_0805;
                    }
                    Label_1792: {
                        continue Label_1587;
                    }
                }
            }
        }
        this.q().R0();
        throw l;
    }
}
