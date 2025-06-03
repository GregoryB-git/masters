/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.EOFException
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package x0;

import F0.L;
import F0.j;
import F0.r;
import F0.s;
import F0.t;
import F0.x;
import W2.h;
import X2.E;
import X2.v;
import Y0.f;
import android.net.Uri;
import d0.i;
import g0.a;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import x0.F;
import x0.a0;
import x0.c;

public final class d
implements F {
    public final x a;
    public r b;
    public s c;

    public d(x x8) {
        this.a = x8;
    }

    public static /* synthetic */ String f(r r8) {
        return d.g(r8);
    }

    public static /* synthetic */ String g(r r8) {
        return r8.d().getClass().getSimpleName();
    }

    @Override
    public void a(long l8, long l9) {
        ((r)a.e(this.b)).a(l8, l9);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void b(i var1_1, Uri var2_2, Map var3_4, long var4_5, long var6_6, t var8_7) {
        block18 : {
            block17 : {
                var1_1 = new j(var1_1, var4_5, var6_6);
                this.c = var1_1;
                if (this.b != null) {
                    return;
                }
                var3_4 = this.a.b(var2_2, (Map)var3_4);
                var13_8 = v.S(var3_4.length);
                var9_9 = var3_4.length;
                var12_10 = false;
                if (var9_9 != 1) break block17;
                this.b = var3_4[0];
                break block18;
            }
            var10_11 = var3_4.length;
            for (var9_9 = 0; var9_9 < var10_11; ++var9_9) {
                block20 : {
                    block19 : {
                        block16 : {
                            block15 : {
                                var14_13 = var3_4[var9_9];
                                if (!var14_13.e((s)var1_1)) break block15;
                                this.b = var14_13;
                                a.f(true);
                                var1_1.h();
                                break;
                            }
                            try {
                                var13_8.j((Iterable)var14_13.g());
                                if (this.b == null) {
                                }
                                ** GOTO lbl-1000
                            }
                            catch (Throwable var2_3) {
                                break block16;
                            }
                            if (var1_1.p() != var4_5) ** GOTO lbl-1000
                            ** GOTO lbl-1000
                        }
                        if (this.b != null) break block19;
                        var11_12 = var12_10;
                        if (var1_1.p() != var4_5) break block20;
                    }
                    var11_12 = true;
                }
                a.f(var11_12);
                var1_1.h();
                throw var2_3;
                catch (EOFException var14_14) {}
                if (this.b == null && var1_1.p() != var4_5) lbl-1000: // 2 sources:
                {
                    var11_12 = false;
                } else lbl-1000: // 3 sources:
                {
                    var11_12 = true;
                }
                a.f(var11_12);
                var1_1.h();
            }
            if (this.b == null) {
                var1_1 = new StringBuilder();
                var1_1.append("None of the available extractors (");
                var1_1.append(h.g(", ").d((Iterable)E.k(v.V(var3_4), new c())));
                var1_1.append(") could read the stream.");
                throw new a0(var1_1.toString(), (Uri)a.e((Object)var2_2), var13_8.k());
            }
        }
        this.b.b(var8_7);
    }

    @Override
    public int c(L l8) {
        return ((r)a.e(this.b)).i((s)a.e(this.c), l8);
    }

    @Override
    public long d() {
        s s8 = this.c;
        if (s8 != null) {
            return s8.p();
        }
        return -1L;
    }

    @Override
    public void e() {
        r r8 = this.b;
        if (r8 == null) {
            return;
        }
        if ((r8 = r8.d()) instanceof f) {
            ((f)r8).l();
        }
    }

    @Override
    public void release() {
        r r8 = this.b;
        if (r8 != null) {
            r8.release();
            this.b = null;
        }
        this.c = null;
    }
}

