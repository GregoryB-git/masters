/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.bb$a
 *  com.yandex.metrica.impl.ob.ci
 *  com.yandex.metrica.impl.ob.w
 *  com.yandex.metrica.impl.ob.w$a
 *  com.yandex.metrica.impl.ob.w$b
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.Za;
import com.yandex.metrica.impl.ob.ab;
import com.yandex.metrica.impl.ob.bb;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class bb {
    private Hh a;
    private Za b;
    private final w c;
    private final ab d;

    @VisibleForTesting
    public bb(@NotNull w w4, @NotNull ab ab2) {
        this.c = w4;
        this.d = ab2;
    }

    public static final /* synthetic */ void a(bb bb2) {
        bb2.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean a() {
        boolean bl;
        boolean bl2;
        Hh hh = this.a;
        boolean bl3 = bl2 = false;
        if (hh == null) return bl3;
        w.a a10 = this.c.c();
        Intrinsics.checkNotNullExpressionValue((Object)a10, (String)"applicationStateProvider.currentState");
        int n2 = hh.c().length() > 0 ? 1 : 0;
        bl3 = bl2;
        if (n2 == 0) return bl3;
        n2 = a10.ordinal();
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) throw new NoWhenBranchMatchedException();
            bl = true;
        } else {
            bl = hh.d();
        }
        bl3 = bl2;
        if (!bl) return bl3;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void b() {
        bb bb2 = this;
        synchronized (bb2) {
            Hh hh;
            boolean bl = this.b != null;
            boolean bl2 = this.a();
            if (bl2 == bl) {
                return;
            }
            if (bl) {
                Za za = this.b;
                if (za != null) {
                    za.a();
                }
                this.b = null;
                return;
            }
            if (this.b == null && (hh = this.a) != null) {
                this.b = this.d.a(hh);
            }
            return;
        }
    }

    public final void a(@NotNull ci ci2) {
        bb bb2 = this;
        synchronized (bb2) {
            this.a = ci2.m();
            w w4 = this.c;
            ci2 = new a(this);
            w4.a((w.b)ci2);
            this.b();
            return;
        }
    }

    public void b(@NotNull ci object) {
        bb bb2 = this;
        synchronized (bb2) {
            if (Intrinsics.areEqual((Object)object.m(), (Object)this.a) ^ true) {
                this.a = object.m();
                object = this.b;
                if (object != null) {
                    ((Za)object).a();
                }
                this.b = null;
                if (this.a()) {
                    if (this.b != null) {
                    } else {
                        object = this.a;
                        if (object != null) {
                            this.b = this.d.a((Hh)object);
                        }
                    }
                }
            }
            return;
        }
    }
}

