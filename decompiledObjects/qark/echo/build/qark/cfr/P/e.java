/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package P;

import P.d;
import P.i;
import V5.o;
import V5.t;
import Y5.b;
import Z5.k;
import g6.l;
import g6.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.u;

public abstract class e {
    public static final a a = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final p b(List list) {
            Intrinsics.checkNotNullParameter((Object)list, "migrations");
            return new p(list, null){
                public int o;
                public /* synthetic */ Object p;
                public final /* synthetic */ List q;
                {
                    this.q = list;
                    super(2, d8);
                }

                public final Object a(i i8, X5.d d8) {
                    return (this.create(i8, d8)).invokeSuspend(t.a);
                }

                @Override
                public final X5.d create(Object object, X5.d d8) {
                    d8 = new ;
                    d8.p = object;
                    return d8;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object invokeSuspend(Object object) {
                    Object object2 = b.c();
                    int n8 = this.o;
                    if (n8 != 0) {
                        if (n8 != 1) throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        o.b(object);
                        return t.a;
                    } else {
                        o.b(object);
                        object = (i)this.p;
                        a a8 = e.a;
                        List list = this.q;
                        this.o = 1;
                        if (a8.c(list, (i)object, this) != object2) return t.a;
                        return object2;
                    }
                }
            };
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final Object c(List var1_1, i var2_3, X5.d var3_4) {
            block14 : {
                if (!(var3_4 instanceof a)) ** GOTO lbl-1000
                var5_5 /* !! */  = var3_4;
                var4_6 = var5_5 /* !! */ .s;
                if ((var4_6 & Integer.MIN_VALUE) != 0) {
                    var5_5 /* !! */ .s = var4_6 + Integer.MIN_VALUE;
                    var3_4 = var5_5 /* !! */ ;
                } else lbl-1000: // 2 sources:
                {
                    var3_4 = new Z5.d(var3_4){
                        public Object o;
                        public Object p;
                        public /* synthetic */ Object q;
                        public int s;

                        @Override
                        public final Object invokeSuspend(Object object) {
                            this.q = object;
                            this.s |= Integer.MIN_VALUE;
                            return this.c(null, null, this);
                        }
                    };
                }
                var9_7 = var3_4.q;
                var8_8 = b.c();
                var4_6 = var3_4.s;
                if (var4_6 != 0) {
                    if (var4_6 != 1) {
                        if (var4_6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var1_1 = (Iterator)var3_4.p;
                        var2_3 = (u)var3_4.o;
                        var5_5 /* !! */  = var3_4;
                        var6_9 = var1_1;
                        var7_10 = var2_3;
                        o.b(var9_7);
                        break block14;
                    }
                    var1_1 = (List)var3_4.o;
                    o.b(var9_7);
                } else {
                    o.b(var9_7);
                    var5_5 /* !! */  = new ArrayList();
                    var1_1 = new p((List)var1_1, (List)var5_5 /* !! */ , null){
                        public Object o;
                        public Object p;
                        public Object q;
                        public int r;
                        public /* synthetic */ Object s;
                        public final /* synthetic */ List t;
                        public final /* synthetic */ List u;
                        {
                            this.t = list;
                            this.u = list2;
                            super(2, d8);
                        }

                        public final Object a(Object object, X5.d d8) {
                            return (this.create(object, d8)).invokeSuspend(t.a);
                        }

                        @Override
                        public final X5.d create(Object object, X5.d d8) {
                            d8 = new ;
                            d8.s = object;
                            return d8;
                        }

                        /*
                         * Enabled aggressive block sorting
                         */
                        @Override
                        public final Object invokeSuspend(Object object) {
                            Iterable iterable;
                            List list;
                            b.c();
                            int n8 = this.r;
                            if (n8 != 0) {
                                if (n8 != 1) {
                                    if (n8 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    iterable = (Iterator)this.o;
                                    list = (List)this.s;
                                    o.b(object);
                                } else {
                                    Object object2 = this.q;
                                    android.support.v4.media.a.a(this.p);
                                    iterable = (Iterator)this.o;
                                    list = (List)this.s;
                                    o.b(object);
                                    if (((Boolean)object).booleanValue()) {
                                        list.add((Object)new l(null, null){
                                            public int o;

                                            public final Object a(X5.d d8) {
                                                return (this.create(d8)).invokeSuspend(t.a);
                                            }

                                            @Override
                                            public final X5.d create(X5.d d8) {
                                                return new ;
                                            }

                                            @Override
                                            public final Object invokeSuspend(Object object) {
                                                b.c();
                                                int n8 = this.o;
                                                if (n8 != 0) {
                                                    if (n8 == 1) {
                                                        o.b(object);
                                                        return t.a;
                                                    }
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                o.b(object);
                                                this.o = 1;
                                                throw null;
                                            }
                                        });
                                        this.s = list;
                                        this.o = iterable;
                                        this.p = null;
                                        this.q = null;
                                        this.r = 2;
                                        throw null;
                                    }
                                    object = object2;
                                }
                            } else {
                                o.b(object);
                                object = this.s;
                                iterable = (Iterable)this.t;
                                list = this.u;
                                iterable = iterable.iterator();
                            }
                            if (!iterable.hasNext()) {
                                return object;
                            }
                            android.support.v4.media.a.a(iterable.next());
                            this.s = list;
                            this.o = iterable;
                            this.p = null;
                            this.q = object;
                            this.r = 1;
                            throw null;
                        }

                    };
                    var3_4.o = var5_5 /* !! */ ;
                    var3_4.s = 1;
                    if (var2_3.a((p)var1_1, var3_4) == var8_8) {
                        return var8_8;
                    }
                    var1_1 = var5_5 /* !! */ ;
                }
                var2_3 = new u();
                var1_1 = ((Iterable)var1_1).iterator();
                break block14;
                catch (Throwable var1_2) {}
                var2_3 = var7_10.o;
                if (var2_3 == null) {
                    var7_10.o = var1_2;
                    var3_4 = var5_5 /* !! */ ;
                    var1_1 = var6_9;
                    var2_3 = var7_10;
                } else {
                    Intrinsics.b(var2_3);
                    V5.a.a((Throwable)var7_10.o, var1_2);
                    var3_4 = var5_5 /* !! */ ;
                    var1_1 = var6_9;
                    var2_3 = var7_10;
                }
            }
            while (var1_1.hasNext()) {
                var9_7 = (l)var1_1.next();
                var5_5 /* !! */  = var3_4;
                var6_9 = var1_1;
                var7_10 = var2_3;
                {
                    var3_4.o = var2_3;
                    var5_5 /* !! */  = var3_4;
                    var6_9 = var1_1;
                    var7_10 = var2_3;
                    var3_4.p = var1_1;
                    var5_5 /* !! */  = var3_4;
                    var6_9 = var1_1;
                    var7_10 = var2_3;
                    var3_4.s = 2;
                    var5_5 /* !! */  = var3_4;
                    var6_9 = var1_1;
                    var7_10 = var2_3;
                    if ((var9_7 = var9_7.invoke(var3_4)) != var8_8) continue;
                    return var8_8;
                }
            }
            var1_1 = (Throwable)var2_3.o;
            if (var1_1 == null) {
                return t.a;
            }
            throw var1_1;
        }

    }

}

