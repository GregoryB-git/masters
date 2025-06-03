// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.io.Serializable;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.a2;
import t.a;
import com.google.android.gms.internal.measurement.y1;
import java.util.HashSet;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.x1;

public final class h6 extends d
{
    public x1 g;
    public final /* synthetic */ b6 h;
    
    public h6(final b6 h, final String s, final int n, final x1 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    @Override
    public final int a() {
        return this.g.L();
    }
    
    @Override
    public final boolean i() {
        return this.g.U();
    }
    
    @Override
    public final boolean j() {
        return false;
    }
    
    public final boolean k(Long e, Long f, final Y1 y1, long e2, final E e3, final boolean b) {
        final boolean b2 = A6.a() && this.h.f().D(super.a, K.j0);
        if (this.g.T()) {
            e2 = e3.e;
        }
        final boolean c = this.h.j().C(2);
        final String s = null;
        final Object o = null;
        final Object o2 = null;
        if (c) {
            final R2.a2 k = this.h.j().K();
            final int b3 = super.b;
            Integer value;
            if (this.g.V()) {
                value = this.g.L();
            }
            else {
                value = null;
            }
            k.d("Evaluating filter. audience, filter, event", b3, value, this.h.h().c(this.g.P()));
            this.h.j().K().b("Filter definition", this.h.o().I(this.g));
        }
        if (!this.g.V() || this.g.L() > 256) {
            final R2.a2 l = this.h.j().L();
            final Object v = R2.Y1.v(super.a);
            Object value2 = o;
            if (this.g.V()) {
                value2 = this.g.L();
            }
            l.c("Invalid event filter ID. appId, id", v, String.valueOf(value2));
            return false;
        }
        final boolean r = this.g.R();
        final boolean s2 = this.g.S();
        final boolean t = this.g.T();
        final boolean b4 = r || s2 || t;
        if (b && !b4) {
            final R2.a2 i = this.h.j().K();
            final int b5 = super.b;
            Object value3 = o2;
            if (this.g.V()) {
                value3 = this.g.L();
            }
            i.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", b5, value3);
            return true;
        }
        final x1 g = this.g;
        final String b6 = y1.b0();
        Boolean b7 = null;
        Label_1393: {
            Boolean c2;
            HashSet<String> set;
            R2.a2 a2;
            String s3;
            String s4;
            a a3;
            String s5 = null;
            Serializable s6 = null;
            String s7;
            R2.a2 a5;
            String s8;
            String s9;
            String s10;
            boolean b8;
            String m;
            Long value4;
            Boolean c3;
            Boolean b9;
            Boolean b10;
            String s11;
            R2.Y1 j;
            Label_0385:Label_0477_Outer:
            while (true) {
                Label_0393: {
                    if (!g.U()) {
                        break Label_0393;
                    }
                    c2 = R2.d.c(e2, g.O());
                    if (c2 == null) {
                        b7 = (Boolean)s;
                        break Label_1393;
                    }
                    if (c2) {
                        break Label_0393;
                    }
                    b7 = Boolean.FALSE;
                    break Label_1393;
                }
                set = new HashSet<String>();
            Label_0477:
                while (true) {
                    for (final y1 y2 : g.Q()) {
                        if (y2.M().isEmpty()) {
                            a2 = this.h.j().L();
                            s3 = this.h.h().c(b6);
                            s4 = "null or empty param name in filter. event";
                            a2.b(s4, s3);
                            b7 = (Boolean)s;
                            break Label_1393;
                        }
                        set.add(y2.M());
                    }
                    a3 = new a();
                Label_0745:
                    while (true) {
                        for (final a2 a4 : y1.c0()) {
                            if (set.contains(a4.c0())) {
                                Label_0613: {
                                    if (a4.h0()) {
                                        s5 = a4.c0();
                                        if (a4.h0()) {
                                            s6 = a4.X();
                                            s5 = s5;
                                            break Label_0613;
                                        }
                                    }
                                    else if (a4.f0()) {
                                        s7 = (s5 = a4.c0());
                                        if (a4.f0()) {
                                            s6 = a4.G();
                                            s5 = s7;
                                            break Label_0613;
                                        }
                                    }
                                    else {
                                        if (a4.j0()) {
                                            s5 = a4.c0();
                                            s6 = a4.d0();
                                            break Label_0613;
                                        }
                                        a5 = this.h.j().L();
                                        s8 = this.h.h().c(b6);
                                        s9 = this.h.h().f(a4.c0());
                                        s10 = "Unknown value for param. event, param";
                                        a5.c(s10, s8, s9);
                                        b7 = (Boolean)s;
                                        break Label_1393;
                                    }
                                    s6 = null;
                                }
                                a3.put(s5, (Long)s6);
                            }
                        }
                        for (final y1 y3 : g.Q()) {
                            b8 = (y3.O() && y3.N());
                            m = y3.M();
                            if (m.isEmpty()) {
                                a2 = this.h.j().L();
                                s3 = this.h.h().c(b6);
                                s4 = "Event has empty param name. event";
                                continue Label_0477;
                            }
                            value4 = a3.get(m);
                            if (value4 instanceof Long) {
                                if (!y3.P()) {
                                    a5 = this.h.j().L();
                                    s8 = this.h.h().c(b6);
                                    s9 = this.h.h().f(m);
                                    s10 = "No number filter for long param. event, param";
                                    continue Label_0745;
                                }
                                c3 = R2.d.c(value4, y3.K());
                                if (c3 == null) {
                                    b7 = (Boolean)s;
                                    break Label_1393;
                                }
                                if (c3 == b8) {
                                    continue Label_0385;
                                }
                                continue Label_0477_Outer;
                            }
                            else if (value4 instanceof Double) {
                                if (!y3.P()) {
                                    a5 = this.h.j().L();
                                    s8 = this.h.h().c(b6);
                                    s9 = this.h.h().f(m);
                                    s10 = "No number filter for double param. event, param";
                                    continue Label_0745;
                                }
                                b9 = R2.d.b(value4, y3.K());
                                if (b9 == null) {
                                    b7 = (Boolean)s;
                                    break Label_1393;
                                }
                                if (b9 == b8) {
                                    continue Label_0385;
                                }
                                continue Label_0477_Outer;
                            }
                            else if (value4 instanceof String) {
                                if (y3.R()) {
                                    b10 = R2.d.g((String)value4, y3.L(), this.h.j());
                                }
                                else {
                                    if (!y3.P()) {
                                        a5 = this.h.j().L();
                                        s8 = this.h.h().c(b6);
                                        s9 = this.h.h().f(m);
                                        s10 = "No filter for String param. event, param";
                                        continue Label_0745;
                                    }
                                    s11 = (String)value4;
                                    if (!N5.f0(s11)) {
                                        a5 = this.h.j().L();
                                        s8 = this.h.h().c(b6);
                                        s9 = this.h.h().f(m);
                                        s10 = "Invalid param value for number filter. event, param";
                                        continue Label_0745;
                                    }
                                    b10 = R2.d.e(s11, y3.K());
                                }
                                if (b10 == null) {
                                    b7 = (Boolean)s;
                                    break Label_1393;
                                }
                                if (b10 == b8) {
                                    continue Label_0385;
                                }
                                continue Label_0477_Outer;
                            }
                            else {
                                j = this.h.j();
                                if (value4 == null) {
                                    j.K().c("Missing param for filter. event, param", this.h.h().c(b6), this.h.h().f(m));
                                    continue Label_0385;
                                }
                                a5 = j.L();
                                s8 = this.h.h().c(b6);
                                s9 = this.h.h().f(m);
                                s10 = "Unknown param type. event, param";
                                continue Label_0745;
                            }
                        }
                        break;
                    }
                    break;
                }
                break;
            }
            b7 = Boolean.TRUE;
        }
        final R2.a2 k2 = this.h.j().K();
        Serializable s12;
        if (b7 == null) {
            s12 = "null";
        }
        else {
            s12 = b7;
        }
        k2.b("Event filter result", s12);
        if (b7 == null) {
            return false;
        }
        final Boolean true = Boolean.TRUE;
        super.c = true;
        if (!b7) {
            return true;
        }
        super.d = true;
        if (b4 && y1.f0()) {
            final Long value5 = y1.Y();
            if (this.g.S()) {
                f = value5;
                if (b2) {
                    f = value5;
                    if (this.g.U()) {
                        f = e;
                    }
                }
                super.f = f;
                return true;
            }
            e = value5;
            if (b2) {
                e = value5;
                if (this.g.U()) {
                    e = f;
                }
            }
            super.e = e;
        }
        return true;
    }
}
