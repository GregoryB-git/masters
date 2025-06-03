/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package s6;

import V5.o;
import V5.t;
import X5.g;
import Z5.d;
import s6.b;
import s6.c;
import t6.i;

public abstract class a
implements b {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final Object a(c var1_1, X5.d var2_2) {
        block8 : {
            block7 : {
                if (!(var2_2 instanceof )) ** GOTO lbl-1000
                var4_6 = var2_2;
                var3_7 = var4_6.r;
                if ((var3_7 & Integer.MIN_VALUE) != 0) {
                    var4_6.r = var3_7 + Integer.MIN_VALUE;
                    var2_2 = var4_6;
                } else lbl-1000: // 2 sources:
                {
                    var2_2 = new d((X5.d)var2_2){
                        public Object o;
                        public /* synthetic */ Object p;
                        public int r;

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.p = object;
                            this.r |= Integer.MIN_VALUE;
                            return this.a(null, this);
                        }
                    };
                }
                var5_8 = var2_2.p;
                var4_6 = Y5.b.c();
                var3_7 = var2_2.r;
                if (var3_7 != 0) {
                    if (var3_7 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    var1_1 = (i)var2_2.o;
                    try {
                        o.b(var5_8);
                        break block7;
                    }
                    catch (Throwable var2_3) {
                        break block8;
                    }
                }
                o.b(var5_8);
                var1_1 = new i(var1_1, var2_2.getContext());
                try {
                    var2_2.o = var1_1;
                    var2_2.r = 1;
                    var2_2 = this.b(var1_1, (X5.d)var2_2);
                    if (var2_2 != var4_6) break block7;
                    return var4_6;
                }
                catch (Throwable var2_4) {
                    // empty catch block
                }
            }
            var1_1.releaseIntercepted();
            return t.a;
        }
        var1_1.releaseIntercepted();
        throw var2_5;
    }

    public abstract Object b(c var1, X5.d var2);

}

