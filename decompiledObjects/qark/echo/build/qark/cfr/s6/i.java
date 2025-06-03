/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.NoSuchElementException
 */
package s6;

import V5.o;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.u;
import s6.b;
import s6.c;
import s6.d;
import t6.a;
import t6.f;
import t6.h;
import u6.F;

public abstract class i {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final Object a(b var0, X5.d var1_1) {
        block8 : {
            block9 : {
                if (!(var1_1 instanceof )) ** GOTO lbl-1000
                var3_3 = var1_1;
                var2_4 = var3_3.r;
                if ((var2_4 & Integer.MIN_VALUE) != 0) {
                    var3_3.r = var2_4 + Integer.MIN_VALUE;
                    var1_1 = var3_3;
                } else lbl-1000: // 2 sources:
                {
                    var1_1 = new Z5.d((X5.d)var1_1){
                        public Object o;
                        public Object p;
                        public /* synthetic */ Object q;
                        public int r;

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.q = object;
                            this.r |= Integer.MIN_VALUE;
                            return d.d(null, this);
                        }
                    };
                }
                var4_5 = var1_1.q;
                var5_7 = Y5.b.c();
                var2_4 = var1_1.r;
                if (var2_4 != 0) {
                    if (var2_4 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    var3_3 = var1_1.p;
                    var0 = (u)var1_1.o;
                    try {
                        o.b(var4_5);
                        break block8;
                    }
                    catch (a var4_6) {
                        var1_1 = var3_3;
                        var3_3 = var4_6;
                        break block9;
                    }
                }
                o.b(var4_5);
                var3_3 = new u();
                var3_3.o = h.a;
                var4_5 = new c((u)var3_3){
                    public final /* synthetic */ u o;
                    {
                        this.o = u8;
                    }

                    @Override
                    public Object emit(Object object, X5.d d8) {
                        this.o.o = object;
                        throw new a(this);
                    }
                };
                try {
                    var1_1.o = var3_3;
                    var1_1.p = var4_5;
                    var1_1.r = 1;
                    var0 = var0.a((c)var4_5, (X5.d)var1_1);
                    if (var0 == var5_7) {
                        return var5_7;
                    }
                    var0 = var3_3;
                    break block8;
                }
                catch (a var1_2) {
                    var0 = var3_3;
                    var3_3 = var1_2;
                    var1_1 = var4_5;
                }
            }
            f.a((a)var3_3, (c)var1_1);
        }
        var0 = var0.o;
        if (var0 == h.a) throw new NoSuchElementException("Expected at least one element");
        return var0;
    }

}

