/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package s6;

import V5.o;
import V5.t;
import Z5.d;
import g6.p;
import kotlin.jvm.internal.s;
import s6.b;
import s6.c;

public abstract class h {
    public static final b a(final b b8, final p p8) {
        return new b(){

            @Override
            public Object a(c object, X5.d d8) {
                final s s8 = new s();
                if ((object = b8.a(new c((c)object, p8){
                    public final /* synthetic */ c p;
                    public final /* synthetic */ p q;
                    {
                        this.p = c8;
                        this.q = p8;
                    }

                    /*
                     * Unable to fully structure code
                     * Enabled aggressive block sorting
                     * Lifted jumps to return sites
                     */
                    @Override
                    public final Object emit(Object var1_1, X5.d var2_2) {
                        if (!(var2_2 instanceof )) ** GOTO lbl-1000
                        var4_3 = var2_2;
                        var3_4 = var4_3.s;
                        if ((var3_4 & Integer.MIN_VALUE) != 0) {
                            var4_3.s = var3_4 + Integer.MIN_VALUE;
                            var2_2 = var4_3;
                        } else lbl-1000: // 2 sources:
                        {
                            var2_2 = new d(var2_2){
                                public Object o;
                                public Object p;
                                public /* synthetic */ Object q;
                                public int s;

                                @Override
                                public final Object invokeSuspend(Object object) {
                                    this.q = object;
                                    this.s |= Integer.MIN_VALUE;
                                    return this.emit(null, this);
                                }
                            };
                        }
                        var5_5 = var2_2.q;
                        var6_6 = Y5.b.c();
                        var3_4 = var2_2.s;
                        if (var3_4 != 0) {
                            if (var3_4 == 1) {
                                o.b(var5_5);
                                return t.a;
                            }
                            if (var3_4 != 2) {
                                if (var3_4 != 3) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                o.b(var5_5);
                                return t.a;
                            }
                            var1_1 = var2_2.p;
                            var4_3 = var2_2.o;
                            o.b(var5_5);
                        } else {
                            o.b(var5_5);
                            if (s8.o) {
                                var4_3 = this.p;
                                var2_2.s = 1;
                                if (var4_3.emit(var1_1, var2_2) != var6_6) return t.a;
                                return var6_6;
                            }
                            var4_3 = this.q;
                            var2_2.o = this;
                            var2_2.p = var1_1;
                            var2_2.s = 2;
                            var5_5 = var4_3.invoke(var1_1, var2_2);
                            if (var5_5 == var6_6) {
                                return var6_6;
                            }
                            var4_3 = this;
                        }
                        if ((Boolean)var5_5 != false) return t.a;
                        var4_3.s8.o = true;
                        var4_3 = var4_3.p;
                        var2_2.o = null;
                        var2_2.p = null;
                        var2_2.s = 3;
                        if (var4_3.emit(var1_1, var2_2) != var6_6) return t.a;
                        return var6_6;
                    }

                }, d8)) == Y5.b.c()) {
                    return object;
                }
                return t.a;
            }
        };
    }

}

