// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.io.Serializable;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.A1;

public final class c extends d
{
    public A1 g;
    public final /* synthetic */ b6 h;
    
    public c(final b6 h, final String s, final int n, final A1 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    @Override
    public final int a() {
        return this.g.k();
    }
    
    @Override
    public final boolean i() {
        return false;
    }
    
    @Override
    public final boolean j() {
        return true;
    }
    
    public final boolean k(final Long n, final Long n2, final h2 h2, final boolean b) {
        final boolean b2 = A6.a() && this.h.f().D(super.a, K.h0);
        final boolean m = this.g.M();
        final boolean n3 = this.g.N();
        final boolean o = this.g.O();
        final boolean b3 = m || n3 || o;
        final String s = null;
        final Object o2 = null;
        if (b && !b3) {
            final a2 k = this.h.j().K();
            final int b4 = super.b;
            Object value = o2;
            if (this.g.P()) {
                value = this.g.k();
            }
            k.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", b4, value);
            return true;
        }
        final y1 i = this.g.I();
        final boolean n4 = i.N();
        Serializable d = null;
        Label_0516: {
            Boolean b5 = null;
            Label_0253: {
                a2 a2;
                String s2;
                String s3;
                if (h2.d0()) {
                    if (i.P()) {
                        b5 = R2.d.c(h2.U(), i.K());
                        break Label_0253;
                    }
                    a2 = this.h.j().L();
                    s2 = this.h.h().g(h2.Z());
                    s3 = "No number filter for long property. property";
                }
                else if (h2.b0()) {
                    if (i.P()) {
                        b5 = R2.d.b(h2.G(), i.K());
                        break Label_0253;
                    }
                    a2 = this.h.j().L();
                    s2 = this.h.h().g(h2.Z());
                    s3 = "No number filter for double property. property";
                }
                else if (h2.f0()) {
                    if (i.R()) {
                        b5 = R2.d.g(h2.a0(), i.L(), this.h.j());
                        break Label_0253;
                    }
                    if (!i.P()) {
                        a2 = this.h.j().L();
                        s2 = this.h.h().g(h2.Z());
                        s3 = "No string or number filter defined. property";
                    }
                    else {
                        if (N5.f0(h2.a0())) {
                            b5 = R2.d.e(h2.a0(), i.K());
                            break Label_0253;
                        }
                        this.h.j().L().c("Invalid user property value for Numeric number filter. property, value", this.h.h().g(h2.Z()), h2.a0());
                        d = s;
                        break Label_0516;
                    }
                }
                else {
                    a2 = this.h.j().L();
                    s2 = this.h.h().g(h2.Z());
                    s3 = "User property has no value, property";
                }
                a2.b(s3, s2);
                d = s;
                break Label_0516;
            }
            d = R2.d.d(b5, n4);
        }
        final a2 j = this.h.j().K();
        Serializable s4;
        if (d == null) {
            s4 = "null";
        }
        else {
            s4 = d;
        }
        j.b("Property filter result", s4);
        if (d == null) {
            return false;
        }
        super.c = Boolean.TRUE;
        if (o && !(boolean)d) {
            return true;
        }
        if (!b || this.g.M()) {
            super.d = (Boolean)d;
        }
        if ((boolean)d && b3 && h2.e0()) {
            long n5 = h2.W();
            if (n != null) {
                n5 = n;
            }
            long longValue = n5;
            if (b2) {
                longValue = n5;
                if (this.g.M()) {
                    longValue = n5;
                    if (!this.g.N()) {
                        longValue = n5;
                        if (n2 != null) {
                            longValue = n2;
                        }
                    }
                }
            }
            if (this.g.N()) {
                super.f = longValue;
                return true;
            }
            super.e = longValue;
        }
        return true;
    }
}
