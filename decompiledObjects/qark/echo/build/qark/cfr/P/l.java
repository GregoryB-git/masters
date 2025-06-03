/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicInteger
 */
package P;

import V5.o;
import V5.t;
import X5.d;
import X5.g;
import Y5.b;
import g6.p;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import p6.I;
import p6.J;
import p6.X;
import p6.q0;
import r6.f;
import r6.g;
import r6.k;

public final class l {
    public final I a;
    public final p b;
    public final r6.d c;
    public final AtomicInteger d;

    public l(I object, final g6.l l8, final p p8, p p9) {
        Intrinsics.checkNotNullParameter(object, "scope");
        Intrinsics.checkNotNullParameter(l8, "onComplete");
        Intrinsics.checkNotNullParameter(p8, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(p9, "consumeMessage");
        this.a = object;
        this.b = p9;
        this.c = f.b(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        object = (q0)object.f().b(q0.n);
        if (object == null) {
            return;
        }
        object.e(new g6.l(){

            public final void a(Throwable throwable) {
                Object object;
                l8.invoke((Object)throwable);
                this.c.b(throwable);
                do {
                    if ((object = r6.g.d(this.c.c())) == null) {
                        object = null;
                        continue;
                    }
                    p8.invoke(object, (Object)throwable);
                    object = t.a;
                } while (object != null);
            }
        });
    }

    public static final /* synthetic */ p a(l l8) {
        return l8.b;
    }

    public static final /* synthetic */ AtomicInteger c(l l8) {
        return l8.d;
    }

    public static final /* synthetic */ I d(l l8) {
        return l8.a;
    }

    public final void e(Object object) {
        if ((object = this.c.d(object)) instanceof g.a) {
            Throwable throwable = r6.g.c(object);
            object = throwable;
            if (throwable == null) {
                object = new k("Channel was closed normally");
            }
            throw object;
        }
        if (r6.g.f(object)) {
            if (this.d.getAndIncrement() == 0) {
                p6.g.d(this.a, null, null, new p(this, null){
                    public Object o;
                    public int p;
                    public final /* synthetic */ l q;
                    {
                        this.q = l8;
                        super(2, d8);
                    }

                    @Override
                    public final d create(Object object, d d8) {
                        return new ;
                    }

                    public final Object invoke(I i8, d d8) {
                        return (this.create(i8, d8)).invokeSuspend(t.a);
                    }

                    /*
                     * Unable to fully structure code
                     * Enabled aggressive block sorting
                     * Lifted jumps to return sites
                     */
                    @Override
                    public final Object invokeSuspend(Object var1_1) {
                        block2 : {
                            block3 : {
                                var5_2 = b.c();
                                var2_3 = this.p;
                                if (var2_3 == 0) break block2;
                                if (var2_3 == 1) break block3;
                                if (var2_3 != 2) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                o.b(var1_1);
                                ** GOTO lbl29
                            }
                            var3_4 = (p)this.o;
                            o.b(var1_1);
                            ** GOTO lbl25
                        }
                        o.b(var1_1);
                        var2_3 = l.c(this.q).get() > 0 ? 1 : 0;
                        if (var2_3 == 0) throw new IllegalStateException("Check failed.".toString());
                        do {
                            J.b(l.d(this.q));
                            var3_4 = l.a(this.q);
                            var1_1 = l.b(this.q);
                            this.o = var3_4;
                            this.p = 1;
                            var1_1 = var4_5 = var1_1.a(this);
                            if (var4_5 == var5_2) {
                                return var5_2;
                            }
lbl25: // 3 sources:
                            this.o = null;
                            this.p = 2;
                            if (var3_4.invoke(var1_1, this) != var5_2) continue;
                            return var5_2;
lbl29: // 2 sources:
                        } while (l.c(this.q).decrementAndGet() != 0);
                        return t.a;
                    }
                }, 3, null);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

}

