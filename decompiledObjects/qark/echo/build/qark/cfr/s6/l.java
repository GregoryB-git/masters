/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package s6;

import V5.o;
import V5.t;
import X5.g;
import Z5.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import p6.q0;
import p6.u0;
import s6.b;
import s6.c;
import s6.j;
import s6.n;
import t6.h;
import u6.F;

public final class l
extends t6.b
implements j,
b {
    public static final AtomicReferenceFieldUpdater s = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, (String)"_state");
    private volatile Object _state;
    public int r;

    public l(Object object) {
        this._state = object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public Object a(c var1_1, X5.d var2_2) {
        block13 : {
            block17 : {
                block15 : {
                    block16 : {
                        block14 : {
                            if (!(var2_2 instanceof )) ** GOTO lbl-1000
                            var4_3 = var2_2;
                            var3_5 = var4_3.v;
                            if ((var3_5 & Integer.MIN_VALUE) != 0) {
                                var4_3.v = var3_5 + Integer.MIN_VALUE;
                            } else lbl-1000: // 2 sources:
                            {
                                var4_3 = new d((X5.d)var2_2){
                                    public Object o;
                                    public Object p;
                                    public Object q;
                                    public Object r;
                                    public Object s;
                                    public /* synthetic */ Object t;
                                    public int v;

                                    @Override
                                    public final Object invokeSuspend(Object object) {
                                        this.t = object;
                                        this.v |= Integer.MIN_VALUE;
                                        return this.a(null, this);
                                    }
                                };
                            }
                            var12_6 = var4_3.t;
                            var17_7 = Y5.b.c();
                            var3_5 = var4_3.v;
                            if (var3_5 != 0) {
                                if (var3_5 != 1) {
                                    if (var3_5 != 2) {
                                        if (var3_5 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        var9_8 = var4_3.s;
                                        var7_9 = (q0)var4_3.r;
                                        var5_10 = (n)var4_3.q;
                                        var8_11 = (c)var4_3.p;
                                        var6_12 = (l)var4_3.o;
                                        var1_1 = var5_10;
                                        var2_2 = var6_12;
                                        o.b(var12_6);
                                        var12_6 = var4_3;
                                    }
                                    var11_13 = var4_3.s;
                                    var14_14 = (q0)var4_3.r;
                                    var5_10 = (n)var4_3.q;
                                    var15_15 = (c)var4_3.p;
                                    var10_16 = (l)var4_3.o;
                                    var1_1 = var5_10;
                                    var2_2 = var10_16;
                                    o.b(var12_6);
                                    var13_17 = var4_3;
                                    var4_3 = var5_10;
                                    break block13;
                                }
                                var5_10 = (n)var4_3.q;
                                var7_9 = (c)var4_3.p;
                                var6_12 = (l)var4_3.o;
                                var1_1 = var5_10;
                                var2_2 = var6_12;
                                o.b(var12_6);
                                break block14;
                            }
                            o.b(var12_6);
                            var5_10 = (n)this.b();
                            var6_12 = this;
                            var7_9 = var1_1;
                        }
                        var1_1 = var5_10;
                        var2_2 = var6_12;
                        try {
                            var9_8 = (q0)var4_3.getContext().b(q0.n);
                            var8_11 = var7_9;
                            var7_9 = var9_8;
                            var9_8 = null;
                            var12_6 = var4_3;
                        }
                        catch (Throwable var4_4) {
                            break block15;
                        }
lbl62: // 4 sources:
                        var1_1 = var5_10;
                        var2_2 = var6_12;
                        var16_18 = l.s.get((Object)var6_12);
                        if (var7_9 != null) {
                            var1_1 = var5_10;
                            var2_2 = var6_12;
                            u0.e((q0)var7_9);
                        }
                        if (var9_8 == null) break block16;
                        var1_1 = var5_10;
                        var2_2 = var6_12;
                        var13_17 = var12_6;
                        var14_14 = var7_9;
                        var4_3 = var5_10;
                        var15_15 = var8_11;
                        var10_16 = var6_12;
                        var11_13 = var9_8;
                        if (Intrinsics.a(var9_8, var16_18)) break block13;
                    }
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var4_3 = var16_18 == h.a ? null : var16_18;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.o = var6_12;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.p = var8_11;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.q = var5_10;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.r = var7_9;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.s = var16_18;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    var12_6.v = 2;
                    var1_1 = var5_10;
                    var2_2 = var6_12;
                    if (var8_11.emit(var4_3, (X5.d)var12_6) == var17_7) {
                        return var17_7;
                    }
                    break block17;
                }
                var2_2.e((t6.d)var1_1);
                throw var4_4;
            }
            var11_13 = var16_18;
            var13_17 = var12_6;
            var14_14 = var7_9;
            var4_3 = var5_10;
            var15_15 = var8_11;
            var10_16 = var6_12;
        }
        var1_1 = var4_3;
        var2_2 = var10_16;
        var12_6 = var13_17;
        var7_9 = var14_14;
        var5_10 = var4_3;
        var8_11 = var15_15;
        var6_12 = var10_16;
        var9_8 = var11_13;
        if (var4_3.h()) ** GOTO lbl62
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.o = var10_16;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.p = var15_15;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.q = var4_3;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.r = var14_14;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.s = var11_13;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var13_17.v = 3;
        var1_1 = var4_3;
        var2_2 = var10_16;
        var16_18 = var4_3.e((X5.d)var13_17);
        var12_6 = var13_17;
        var7_9 = var14_14;
        var5_10 = var4_3;
        var8_11 = var15_15;
        var6_12 = var10_16;
        var9_8 = var11_13;
        if (var16_18 != var17_7) ** GOTO lbl62
        return var17_7;
    }

    @Override
    public Object emit(Object object, X5.d d8) {
        this.setValue(object);
        return t.a;
    }

    public n g() {
        return new n();
    }

    @Override
    public Object getValue() {
        Object object;
        F f8 = h.a;
        Object object2 = object = s.get((Object)this);
        if (object == f8) {
            object2 = null;
        }
        return object2;
    }

    public n[] h(int n8) {
        return new n[n8];
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean i(Object arrd, Object object322) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        block17 : {
            boolean bl;
            Object object2;
            block16 : {
                // MONITORENTER : this
                atomicReferenceFieldUpdater = s;
                object2 = atomicReferenceFieldUpdater.get((Object)this);
                if (arrd == null || (bl = Intrinsics.a(object2, arrd))) break block16;
                {
                    catch (Throwable throwable222) {
                        throw throwable222;
                    }
                }
                // MONITOREXIT : this
                return false;
            }
            bl = Intrinsics.a(object2, object322);
            if (!bl) break block17;
            // MONITOREXIT : this
            return true;
        }
        atomicReferenceFieldUpdater.set((Object)this, object322);
        int n8 = this.r;
        if ((n8 & 1) == 0) {
            ++n8;
            this.r = n8;
            arrd = this.f();
            object322 = t.a;
            // MONITOREXIT : this
        } else {
            this.r = n8 + 2;
            // MONITOREXIT : this
            return true;
        }
        do {
            if ((arrd = (n[])arrd) != null) {
                for (Object object322 : arrd) {
                    if (object322 == null) continue;
                    object322.g();
                }
            }
            // MONITORENTER : this
            int n9 = this.r;
            if (n9 == n8) {
                this.r = n8 + 1;
                // MONITOREXIT : this
                return true;
            }
            arrd = this.f();
            object322 = t.a;
            // MONITOREXIT : this
            n8 = n9;
        } while (true);
    }

    @Override
    public void setValue(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = h.a;
        }
        this.i(null, object2);
    }

}

