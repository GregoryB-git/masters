/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import R2.K;
import R2.N5;
import R2.P1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.d;
import R2.g;
import com.google.android.gms.internal.measurement.A1;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.z1;

public final class c
extends d {
    public A1 g;
    public final /* synthetic */ b6 h;

    public c(b6 b62, String string2, int n8, A1 a12) {
        this.h = b62;
        super(string2, n8);
        this.g = a12;
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

    /*
     * Enabled aggressive block sorting
     */
    public final boolean k(Long object, Long object2, h2 h22, boolean bl) {
        int n8;
        boolean bl2;
        Object object3;
        Object object4;
        boolean bl3;
        Object object5;
        block22 : {
            Object var17_10;
            block14 : {
                block18 : {
                    boolean bl4;
                    block15 : {
                        block19 : {
                            block21 : {
                                block20 : {
                                    block16 : {
                                        block17 : {
                                            block12 : {
                                                block13 : {
                                                    n8 = A6.a() && this.h.f().D(this.a, K.h0) ? 1 : 0;
                                                    bl4 = this.g.M();
                                                    boolean bl5 = this.g.N();
                                                    bl3 = this.g.O();
                                                    bl2 = bl4 || bl5 || bl3;
                                                    var17_10 = null;
                                                    object3 = null;
                                                    if (bl && !bl2) {
                                                        object2 = this.h.j().K();
                                                        n8 = this.b;
                                                        object = object3;
                                                        if (this.g.P()) {
                                                            object = this.g.k();
                                                        }
                                                        object2.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", n8, object);
                                                        return true;
                                                    }
                                                    object3 = this.g.I();
                                                    bl4 = object3.N();
                                                    if (!h22.d0()) break block12;
                                                    if (object3.P()) break block13;
                                                    object3 = this.h.j().L();
                                                    object4 = this.h.h().g(h22.Z());
                                                    object5 = "No number filter for long property. property";
                                                    break block14;
                                                }
                                                object3 = d.c(h22.U(), object3.K());
                                                break block15;
                                            }
                                            if (!h22.b0()) break block16;
                                            if (object3.P()) break block17;
                                            object3 = this.h.j().L();
                                            object4 = this.h.h().g(h22.Z());
                                            object5 = "No number filter for double property. property";
                                            break block14;
                                        }
                                        object3 = d.b(h22.G(), object3.K());
                                        break block15;
                                    }
                                    if (!h22.f0()) break block18;
                                    if (object3.R()) break block19;
                                    if (object3.P()) break block20;
                                    object3 = this.h.j().L();
                                    object4 = this.h.h().g(h22.Z());
                                    object5 = "No string or number filter defined. property";
                                    break block14;
                                }
                                if (!N5.f0(h22.a0())) break block21;
                                object3 = d.e(h22.a0(), object3.K());
                                break block15;
                            }
                            this.h.j().L().c("Invalid user property value for Numeric number filter. property, value", this.h.h().g(h22.Z()), h22.a0());
                            object3 = var17_10;
                            break block22;
                        }
                        object3 = d.g(h22.a0(), object3.L(), this.h.j());
                    }
                    object3 = d.d((Boolean)object3, bl4);
                    break block22;
                }
                object3 = this.h.j().L();
                object4 = this.h.h().g(h22.Z());
                object5 = "User property has no value, property";
            }
            object3.b((String)object5, object4);
            object3 = var17_10;
        }
        object5 = this.h.j().K();
        object4 = object3 == null ? "null" : object3;
        object5.b("Property filter result", object4);
        if (object3 == null) {
            return false;
        }
        this.c = Boolean.TRUE;
        if (bl3 && !object3.booleanValue()) {
            return true;
        }
        if (!bl || this.g.M()) {
            this.d = object3;
        }
        if (object3.booleanValue() && bl2 && h22.e0()) {
            long l8 = h22.W();
            if (object != null) {
                l8 = object.longValue();
            }
            long l9 = l8;
            if (n8 != 0) {
                l9 = l8;
                if (this.g.M()) {
                    l9 = l8;
                    if (!this.g.N()) {
                        l9 = l8;
                        if (object2 != null) {
                            l9 = object2.longValue();
                        }
                    }
                }
            }
            if (this.g.N()) {
                this.f = l9;
                return true;
            }
            this.e = l9;
        }
        return true;
    }
}

