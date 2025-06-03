/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.Q5
 *  com.yandex.metrica.impl.ob.c0
 *  com.yandex.metrica.impl.ob.e6
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.A0;
import com.yandex.metrica.impl.ob.G7;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.Q5;
import com.yandex.metrica.impl.ob.R5;
import com.yandex.metrica.impl.ob.S5;
import com.yandex.metrica.impl.ob.T5;
import com.yandex.metrica.impl.ob.U5;
import com.yandex.metrica.impl.ob.V5;
import com.yandex.metrica.impl.ob.Z5;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.b6;
import com.yandex.metrica.impl.ob.c0;
import com.yandex.metrica.impl.ob.e6;

public class a6 {
    @NonNull
    private final L3 a;
    @NonNull
    private final Z5 b;
    @NonNull
    private final a c;
    @NonNull
    private final A0 d;
    @NonNull
    private final T5<V5> e;
    @NonNull
    private final T5<V5> f;
    @Nullable
    private U5 g;
    @Nullable
    private b h = null;

    public a6(@NonNull L3 l3, @NonNull Z5 z5, @NonNull a a10) {
        this(l3, z5, a10, (T5<V5>)((Object)new S5(l3, z5)), (T5<V5>)((Object)new R5(l3, z5)), new A0(l3.g()));
    }

    @VisibleForTesting
    public a6(@NonNull L3 l3, @NonNull Z5 z5, @NonNull a a10, @NonNull T5<V5> t5, @NonNull T5<V5> t52, @NonNull A0 a02) {
        this.a = l3;
        this.c = a10;
        this.e = t5;
        this.f = t52;
        this.b = z5;
        this.d = a02;
    }

    @NonNull
    private U5 a(@NonNull c0 c02) {
        long l3 = c02.e();
        Object object = this.e;
        V5 v5 = new V5(l3, c02.f());
        object = ((Q5)object).a((Object)v5);
        this.h = com.yandex.metrica.impl.ob.a6$b.c;
        this.a.l().c();
        this.c.a(c0.a((c0)c02, (A0)this.d), this.a((U5)object, l3));
        return object;
    }

    @NonNull
    private b6 a(@NonNull U5 u5, long l3) {
        return new b6().c(u5.c()).a(u5.e()).b(u5.a(l3)).a(u5.f());
    }

    private boolean a(@Nullable U5 u5, @NonNull c0 c02) {
        if (u5 == null) {
            return false;
        }
        if (u5.b(c02.e())) {
            return true;
        }
        this.b(u5, c02);
        return false;
    }

    private void b(@NonNull U5 u5, @Nullable c0 c02) {
        if (u5.h()) {
            this.c.a(c0.a((c0)c02), new b6().c(u5.c()).a(u5.f()).a(u5.e()).b(u5.b()));
            u5.a(false);
        }
        u5.i();
    }

    private void e(@NonNull c0 c02) {
        if (this.h == null) {
            U5 u5 = ((Q5)this.e).b();
            if (this.a(u5, c02)) {
                this.g = u5;
                this.h = com.yandex.metrica.impl.ob.a6$b.c;
            } else {
                u5 = ((Q5)this.f).b();
                if (this.a(u5, c02)) {
                    this.g = u5;
                    this.h = com.yandex.metrica.impl.ob.a6$b.b;
                } else {
                    this.g = null;
                    this.h = com.yandex.metrica.impl.ob.a6$b.a;
                }
            }
        }
    }

    public long a() {
        a6 a62 = this;
        synchronized (a62) {
            long l3;
            block5: {
                U5 u5;
                block4: {
                    u5 = this.g;
                    if (u5 != null) break block4;
                    l3 = 10000000000L;
                    break block5;
                }
                l3 = u5.c();
                --l3;
            }
            return l3;
        }
    }

    @NonNull
    public b6 b(@NonNull c0 c02) {
        return this.a(this.c(c02), c02.e());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @NonNull
    public U5 c(@NonNull c0 object) {
        a6 a62 = this;
        synchronized (a62) {
            int n2;
            this.e((c0)object);
            b b3 = this.h;
            b b4 = com.yandex.metrica.impl.ob.a6$b.a;
            if (b3 != b4 && !this.a(this.g, (c0)object)) {
                this.h = b4;
                this.g = null;
            }
            if ((n2 = this.h.ordinal()) == 1) {
                this.g.c(object.e());
                return this.g;
            }
            if (n2 == 2) {
                return this.g;
            }
            this.h = com.yandex.metrica.impl.ob.a6$b.b;
            long l3 = object.e();
            T5<V5> t5 = this.f;
            V5 v5 = new V5(l3, object.f());
            U5 u5 = ((Q5)t5).a((Object)v5);
            if (this.a.w().k()) {
                this.c.a(c0.a((c0)object, (A0)this.d), this.a(u5, object.e()));
            } else if (object.n() == a1.P.b()) {
                this.c.a((c0)object, this.a(u5, l3));
                this.c.a(c0.a((c0)object, (A0)this.d), this.a(u5, l3));
            }
            this.g = u5;
            return u5;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d(@NonNull c0 c02) {
        a6 a62 = this;
        synchronized (a62) {
            block7: {
                block8: {
                    this.e(c02);
                    int n2 = this.h.ordinal();
                    if (n2 == 0) break block8;
                    if (n2 != 1) {
                        if (n2 == 2) {
                            if (this.a(this.g, c02)) {
                                this.g.c(c02.e());
                                break block7;
                            } else {
                                this.g = this.a(c02);
                            }
                        }
                        break block7;
                    } else {
                        this.b(this.g, c02);
                        this.g = this.a(c02);
                    }
                    break block7;
                }
                this.g = this.a(c02);
            }
            return;
        }
    }

    @NonNull
    public b6 f(@NonNull c0 object) {
        U5 u5;
        if (this.h == null) {
            u5 = ((Q5)this.e).b();
            boolean bl = false;
            boolean bl2 = u5 == null ? false : u5.b(object.e());
            if (bl2 && (bl2 = (u5 = ((Q5)this.f).b()) == null ? bl : u5.b(object.e()))) {
                u5 = null;
            }
        } else {
            u5 = this.g;
        }
        if (u5 != null) {
            return new b6().c(u5.c()).a(u5.e()).b(u5.d()).a(u5.f());
        }
        long l3 = object.f();
        long l4 = this.b.a();
        object = this.a.i();
        u5 = e6.c;
        ((G7)object).a(l4, (e6)u5, l3);
        return new b6().c(l4).a((e6)u5).a(0L).b(0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(@NonNull c0 c02) {
        a6 a62 = this;
        synchronized (a62) {
            this.c(c02).a(false);
            b b3 = this.h;
            b b4 = com.yandex.metrica.impl.ob.a6$b.a;
            if (b3 != b4) {
                this.b(this.g, c02);
            }
            this.h = b4;
            return;
        }
    }

    public static interface a {
        public void a(@NonNull c0 var1, @NonNull b6 var2);
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b a;
        public static final /* enum */ b b;
        public static final /* enum */ b c;
        private static final b[] d;

        static {
            b b3;
            b b4;
            b b10;
            a = b10 = new b();
            b = b4 = new b();
            c = b3 = new b();
            d = new b[]{b10, b4, b3};
        }

        public static b valueOf(String string) {
            return (b)Enum.valueOf(b.class, (String)string);
        }

        public static b[] values() {
            return (b[])d.clone();
        }
    }
}

