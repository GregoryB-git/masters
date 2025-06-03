/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package z2;

import A2.c;
import A2.l;
import A2.o;
import A2.p;
import V2.j;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import y2.a;
import z2.b;
import z2.e;
import z2.x;

public final class G
implements V2.e {
    public final e a;
    public final int b;
    public final b c;
    public final long d;
    public final long e;

    public G(e e8, int n8, b b8, long l8, long l9, String string2, String string3) {
        this.a = e8;
        this.b = n8;
        this.c = b8;
        this.d = l8;
        this.e = l9;
    }

    public static G b(e e8, int n8, b b8) {
        boolean bl;
        if (!e8.f()) {
            return null;
        }
        Object object = o.b().a();
        if (object != null) {
            if (!object.f()) {
                return null;
            }
            boolean bl2 = object.g();
            object = e8.w(b8);
            bl = bl2;
            if (object != null) {
                if (!(object.t() instanceof c)) {
                    return null;
                }
                Object object2 = (c)((Object)object.t());
                bl = bl2;
                if (object2.J()) {
                    bl = bl2;
                    if (!object2.i()) {
                        if ((object2 = G.c((x)object, (c)object2, n8)) == null) {
                            return null;
                        }
                        object.F();
                        bl = object2.i();
                    }
                }
            }
        } else {
            bl = true;
        }
        long l8 = bl ? System.currentTimeMillis() : 0L;
        long l9 = bl ? SystemClock.elapsedRealtime() : 0L;
        return new G(e8, n8, b8, l8, l9, null, null);
    }

    public static A2.e c(x x8, c object, int n8) {
        if ((object = object.H()) != null && object.g()) {
            int[] arrn = object.d();
            if (arrn == null ? (arrn = object.f()) != null && E2.b.a(arrn, n8) : !E2.b.a(arrn, n8)) {
                return null;
            }
            if (x8.r() < object.a()) {
                return object;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(j var1_1) {
        block13 : {
            block14 : {
                block12 : {
                    if (!this.a.f()) {
                        return;
                    }
                    var15_2 = o.b().a();
                    if (var15_2 != null) {
                        if (var15_2.f() == false) return;
                    }
                    if ((var16_3 = this.a.w(this.c)) == null) return;
                    if (!(var16_3.t() instanceof c)) {
                        return;
                    }
                    var17_4 = (c)var16_3.t();
                    var11_5 = this.d;
                    var6_6 = 1;
                    var8_7 = 0;
                    var2_8 = var11_5 > 0L ? 1 : 0;
                    var10_9 = var17_4.z();
                    if (var15_2 != null) {
                        var7_10 = var2_8 & var15_2.g();
                        var5_11 = var15_2.a();
                        var9_12 = var15_2.d();
                        var4_13 = var15_2.i();
                        var2_8 = var7_10;
                        var3_14 = var9_12;
                        if (var17_4.J()) {
                            var2_8 = var7_10;
                            var3_14 = var9_12;
                            if (!var17_4.i()) {
                                var15_2 = G.c(var16_3, var17_4, this.b);
                                if (var15_2 == null) {
                                    return;
                                }
                                var2_8 = var15_2.i() != false && this.d > 0L ? var6_6 : 0;
                                var3_14 = var15_2.a();
                            }
                        }
                        var6_6 = var3_14;
                        var7_10 = var2_8;
                    } else {
                        var4_13 = 0;
                        var6_6 = 100;
                        var5_11 = 5000;
                        var7_10 = var2_8;
                    }
                    var15_2 = this.a;
                    if (!var1_1.n()) break block12;
                    var3_14 = 0;
                    var2_8 = var8_7;
                    break block13;
                }
                if (!var1_1.l()) break block14;
                var2_8 = 100;
                ** GOTO lbl56
            }
            if ((var1_1 = var1_1.i()) instanceof y2.b) {
                var1_1 = ((y2.b)var1_1).a();
                var8_7 = var1_1.d();
                var2_8 = (var1_1 = var1_1.a()) == null ? -1 : var1_1.a();
                var3_14 = var2_8;
                var2_8 = var8_7;
            } else {
                var2_8 = 101;
lbl56: // 2 sources:
                var3_14 = -1;
            }
        }
        if (var7_10 != 0) {
            var11_5 = this.d;
            var13_15 = System.currentTimeMillis();
            var7_10 = (int)(SystemClock.elapsedRealtime() - this.e);
        } else {
            var13_15 = var11_5 = 0L;
            var7_10 = -1;
        }
        var15_2.E(new l(this.b, var2_8, var3_14, var11_5, var13_15, null, null, var10_9, var7_10), var4_13, var5_11, var6_6);
    }
}

