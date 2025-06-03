/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package R2;

import R2.E;
import R2.K;
import R2.N5;
import R2.P1;
import R2.X1;
import R2.Y1;
import R2.a2;
import R2.b6;
import R2.d;
import R2.g;
import com.google.android.gms.internal.measurement.A6;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.x1;
import com.google.android.gms.internal.measurement.y1;
import com.google.android.gms.internal.measurement.z1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import t.a;

public final class h6
extends d {
    public x1 g;
    public final /* synthetic */ b6 h;

    public h6(b6 b62, String string2, int n8, x1 x12) {
        this.h = b62;
        super(string2, n8);
        this.g = x12;
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

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean k(Long var1_1, Long var2_2, com.google.android.gms.internal.measurement.Y1 var3_3, long var4_4, E var6_5, boolean var7_6) {
        block32 : {
            block45 : {
                block34 : {
                    block40 : {
                        block33 : {
                            block39 : {
                                block38 : {
                                    block35 : {
                                        block36 : {
                                            block37 : {
                                                var8_7 = A6.a() != false && this.h.f().D(this.a, K.j0) != false ? 1 : 0;
                                                if (this.g.T()) {
                                                    var4_4 = var6_5.e;
                                                }
                                                var10_8 = this.h.j().C(2);
                                                var16_9 = null;
                                                var13_10 = null;
                                                var14_11 = null;
                                                if (var10_8) {
                                                    var15_12 = this.h.j().K();
                                                    var9_13 = this.b;
                                                    var6_5 = this.g.V() != false ? Integer.valueOf((int)this.g.L()) : null;
                                                    var15_12.d("Evaluating filter. audience, filter, event", var9_13, var6_5, this.h.h().c(this.g.P()));
                                                    this.h.j().K().b("Filter definition", this.h.o().I(this.g));
                                                }
                                                if (!this.g.V() || this.g.L() > 256) break block35;
                                                var10_8 = this.g.R();
                                                var11_14 = this.g.S();
                                                var12_15 = this.g.T();
                                                var9_13 = !(var10_8 || var11_14 || var12_15) ? 0 : 1;
                                                if (var7_6 && var9_13 == 0) {
                                                    var2_2 = this.h.j().K();
                                                    var8_7 = this.b;
                                                    var1_1 = var14_11;
                                                    if (this.g.V()) {
                                                        var1_1 = this.g.L();
                                                    }
                                                    var2_2.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", var8_7, var1_1);
                                                    return true;
                                                }
                                                var18_16 = this.g;
                                                var15_12 = var3_3.b0();
                                                if (!var18_16.U()) break block36;
                                                var6_5 = d.c(var4_4, var18_16.O());
                                                if (var6_5 != null) break block37;
                                                var6_5 = var16_9;
                                                break block32;
                                            }
                                            if (!var6_5.booleanValue()) break block38;
                                        }
                                        var19_17 = new HashSet();
                                        var6_5 = var18_16.Q().iterator();
                                        break block39;
                                    }
                                    var2_2 = this.h.j().L();
                                    var3_3 = Y1.v(this.a);
                                    var1_1 = var13_10;
                                    if (this.g.V()) {
                                        var1_1 = this.g.L();
                                    }
                                    var2_2.c("Invalid event filter ID. appId, id", var3_3, String.valueOf((Object)var1_1));
                                    return false;
                                }
lbl49: // 5 sources:
                                do {
                                    var6_5 = Boolean.FALSE;
                                    break block32;
                                    break;
                                } while (true);
                            }
                            while (var6_5.hasNext()) {
                                var13_10 = (y1)var6_5.next();
                                if (var13_10.M().isEmpty()) {
                                    var6_5 = this.h.j().L();
                                    var13_10 = this.h.h().c((String)var15_12);
                                    var14_11 = "null or empty param name in filter. event";
                                    break block33;
                                }
                                var19_17.add((Object)var13_10.M());
                            }
                            var17_18 = new a();
                            var20_19 = var3_3.c0().iterator();
                            break block40;
                        }
lbl66: // 2 sources:
                        do {
                            var6_5.b((String)var14_11, var13_10);
                            var6_5 = var16_9;
                            break block32;
                            break;
                        } while (true);
                    }
                    while (var20_19.hasNext()) {
                        block44 : {
                            block42 : {
                                block43 : {
                                    block41 : {
                                        var21_20 = (com.google.android.gms.internal.measurement.a2)var20_19.next();
                                        if (!var19_17.contains((Object)var21_20.c0())) continue;
                                        if (!var21_20.h0()) break block41;
                                        var13_10 = var14_11 = var21_20.c0();
                                        if (!var21_20.h0()) ** GOTO lbl-1000
                                        var6_5 = var21_20.X();
                                        var13_10 = var14_11;
                                        break block42;
                                    }
                                    if (var21_20.f0()) {
                                        var13_10 = var14_11 = var21_20.c0();
                                        ** if (!var21_20.f0()) goto lbl-1000
lbl-1000: // 1 sources:
                                        {
                                            var6_5 = Double.valueOf((double)var21_20.G());
                                            var13_10 = var14_11;
                                            ** GOTO lbl94
                                        }
                                    }
                                    break block43;
lbl-1000: // 2 sources:
                                    {
                                        var6_5 = null;
                                    }
                                    break block42;
                                }
                                if (!var21_20.j0()) break block44;
                                var13_10 = var21_20.c0();
                                var6_5 = var21_20.d0();
                            }
                            var17_18.put(var13_10, var6_5);
                            continue;
                        }
                        var6_5 = this.h.j().L();
                        var13_10 = this.h.h().c((String)var15_12);
                        var14_11 = this.h.h().f(var21_20.c0());
                        var15_12 = "Unknown value for param. event, param";
                        break block34;
                    }
                    var13_10 = var18_16.Q().iterator();
                    break block45;
                }
lbl106: // 6 sources:
                do {
                    var6_5.c((String)var15_12, var13_10, var14_11);
                    var6_5 = var16_9;
                    break block32;
                    break;
                } while (true);
            }
            while (var13_10.hasNext()) {
                block50 : {
                    block53 : {
                        block54 : {
                            block52 : {
                                block51 : {
                                    block48 : {
                                        block49 : {
                                            block46 : {
                                                block47 : {
                                                    var6_5 = (y1)var13_10.next();
                                                    var7_6 = var6_5.O() != false && var6_5.N() != false;
                                                    var14_11 = var6_5.M();
                                                    if (var14_11.isEmpty()) {
                                                        var6_5 = this.h.j().L();
                                                        var13_10 = this.h.h().c((String)var15_12);
                                                        var14_11 = "Event has empty param name. event";
                                                        ** continue;
                                                    }
                                                    var18_16 = var17_18.get(var14_11);
                                                    if (!(var18_16 instanceof Long)) break block46;
                                                    if (var6_5.P()) break block47;
                                                    var6_5 = this.h.j().L();
                                                    var13_10 = this.h.h().c((String)var15_12);
                                                    var14_11 = this.h.h().f((String)var14_11);
                                                    var15_12 = "No number filter for long param. event, param";
                                                    ** GOTO lbl106
                                                }
                                                var6_5 = d.c((Long)var18_16, var6_5.K());
                                                if (var6_5 == null) {
                                                    var6_5 = var16_9;
                                                    break block32;
                                                }
                                                if (var6_5.booleanValue() != var7_6) continue;
                                                ** GOTO lbl49
                                            }
                                            if (!(var18_16 instanceof Double)) break block48;
                                            if (var6_5.P()) break block49;
                                            var6_5 = this.h.j().L();
                                            var13_10 = this.h.h().c((String)var15_12);
                                            var14_11 = this.h.h().f((String)var14_11);
                                            var15_12 = "No number filter for double param. event, param";
                                            ** GOTO lbl106
                                        }
                                        var6_5 = d.b((Double)var18_16, var6_5.K());
                                        if (var6_5 == null) {
                                            var6_5 = var16_9;
                                            break block32;
                                        }
                                        if (var6_5.booleanValue() != var7_6) continue;
                                        ** GOTO lbl49
                                    }
                                    if (!(var18_16 instanceof String)) break block50;
                                    if (!var6_5.R()) break block51;
                                    var6_5 = d.g((String)var18_16, var6_5.L(), this.h.j());
                                    break block52;
                                }
                                if (!var6_5.P()) break block53;
                                if (!N5.f0((String)(var18_16 = (String)var18_16))) break block54;
                                var6_5 = d.e((String)var18_16, var6_5.K());
                            }
                            if (var6_5 == null) {
                                var6_5 = var16_9;
                                break block32;
                            }
                            if (var6_5.booleanValue() != var7_6) continue;
                            ** GOTO lbl49
                        }
                        var6_5 = this.h.j().L();
                        var13_10 = this.h.h().c((String)var15_12);
                        var14_11 = this.h.h().f((String)var14_11);
                        var15_12 = "Invalid param value for number filter. event, param";
                        ** GOTO lbl106
                    }
                    var6_5 = this.h.j().L();
                    var13_10 = this.h.h().c((String)var15_12);
                    var14_11 = this.h.h().f((String)var14_11);
                    var15_12 = "No filter for String param. event, param";
                    ** GOTO lbl106
                }
                var6_5 = this.h.j();
                if (var18_16 == null) {
                    var6_5.K().c("Missing param for filter. event, param", this.h.h().c((String)var15_12), this.h.h().f((String)var14_11));
                    ** continue;
                }
                var6_5 = var6_5.L();
                var13_10 = this.h.h().c((String)var15_12);
                var14_11 = this.h.h().f((String)var14_11);
                var15_12 = "Unknown param type. event, param";
                ** continue;
lbl187: // 1 sources:
                ** GOTO lbl106
            }
            var6_5 = Boolean.TRUE;
        }
        var14_11 = this.h.j().K();
        var13_10 = var6_5 == null ? "null" : var6_5;
        var14_11.b("Event filter result", var13_10);
        if (var6_5 == null) {
            return false;
        }
        this.c = var13_10 = Boolean.TRUE;
        if (!var6_5.booleanValue()) {
            return true;
        }
        this.d = var13_10;
        if (var9_13 == 0) return true;
        if (var3_3.f0() == false) return true;
        var3_3 = var3_3.Y();
        if (this.g.S()) {
            var2_2 = var3_3;
            if (var8_7 != 0) {
                var2_2 = var3_3;
                if (this.g.U()) {
                    var2_2 = var1_1;
                }
            }
            this.f = var2_2;
            return true;
        }
        var1_1 = var3_3;
        if (var8_7 != 0) {
            var1_1 = var3_3;
            if (this.g.U()) {
                var1_1 = var2_2;
            }
        }
        this.e = var1_1;
        return true;
    }
}

