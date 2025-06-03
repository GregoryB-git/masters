package R2;

import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.C0921h2;
import com.google.android.gms.internal.measurement.C1072y1;

/* renamed from: R2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0483c extends AbstractC0490d {

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.A1 f5226g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b6 f5227h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0483c(b6 b6Var, String str, int i7, com.google.android.gms.internal.measurement.A1 a12) {
        super(str, i7);
        this.f5227h = b6Var;
        this.f5226g = a12;
    }

    @Override // R2.AbstractC0490d
    public final int a() {
        return this.f5226g.k();
    }

    @Override // R2.AbstractC0490d
    public final boolean i() {
        return false;
    }

    @Override // R2.AbstractC0490d
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l7, Long l8, C0921h2 c0921h2, boolean z7) {
        C0472a2 L6;
        String g7;
        String str;
        Boolean g8;
        byte b7 = A6.a() && this.f5227h.f().D(this.f5240a, K.f4835h0);
        boolean M6 = this.f5226g.M();
        boolean N6 = this.f5226g.N();
        boolean O6 = this.f5226g.O();
        byte b8 = M6 || N6 || O6;
        Boolean bool = null;
        bool = null;
        if (z7 && b8 != true) {
            this.f5227h.j().K().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f5241b), this.f5226g.P() ? Integer.valueOf(this.f5226g.k()) : null);
            return true;
        }
        C1072y1 I6 = this.f5226g.I();
        boolean N7 = I6.N();
        if (c0921h2.d0()) {
            if (I6.P()) {
                g8 = AbstractC0490d.c(c0921h2.U(), I6.K());
                bool = AbstractC0490d.d(g8, N7);
            } else {
                L6 = this.f5227h.j().L();
                g7 = this.f5227h.h().g(c0921h2.Z());
                str = "No number filter for long property. property";
                L6.b(str, g7);
            }
        } else if (!c0921h2.b0()) {
            if (c0921h2.f0()) {
                if (I6.R()) {
                    g8 = AbstractC0490d.g(c0921h2.a0(), I6.L(), this.f5227h.j());
                } else if (!I6.P()) {
                    L6 = this.f5227h.j().L();
                    g7 = this.f5227h.h().g(c0921h2.Z());
                    str = "No string or number filter defined. property";
                } else if (N5.f0(c0921h2.a0())) {
                    g8 = AbstractC0490d.e(c0921h2.a0(), I6.K());
                } else {
                    this.f5227h.j().L().c("Invalid user property value for Numeric number filter. property, value", this.f5227h.h().g(c0921h2.Z()), c0921h2.a0());
                }
                bool = AbstractC0490d.d(g8, N7);
            } else {
                L6 = this.f5227h.j().L();
                g7 = this.f5227h.h().g(c0921h2.Z());
                str = "User property has no value, property";
            }
            L6.b(str, g7);
        } else if (I6.P()) {
            g8 = AbstractC0490d.b(c0921h2.G(), I6.K());
            bool = AbstractC0490d.d(g8, N7);
        } else {
            L6 = this.f5227h.j().L();
            g7 = this.f5227h.h().g(c0921h2.Z());
            str = "No number filter for double property. property";
            L6.b(str, g7);
        }
        this.f5227h.j().K().b("Property filter result", bool == null ? "null" : bool);
        if (bool == null) {
            return false;
        }
        this.f5242c = Boolean.TRUE;
        if (O6 && !bool.booleanValue()) {
            return true;
        }
        if (!z7 || this.f5226g.M()) {
            this.f5243d = bool;
        }
        if (bool.booleanValue() && b8 != false && c0921h2.e0()) {
            long W6 = c0921h2.W();
            if (l7 != null) {
                W6 = l7.longValue();
            }
            if (b7 != false && this.f5226g.M() && !this.f5226g.N() && l8 != null) {
                W6 = l8.longValue();
            }
            if (this.f5226g.N()) {
                this.f5245f = Long.valueOf(W6);
            } else {
                this.f5244e = Long.valueOf(W6);
            }
        }
        return true;
    }
}
