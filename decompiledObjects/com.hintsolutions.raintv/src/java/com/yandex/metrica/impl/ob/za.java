/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yandex.metrica.impl.ob.Za$a
 *  com.yandex.metrica.impl.ob.db
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.random.Random
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.impl.ob.Hh;
import com.yandex.metrica.impl.ob.Rl;
import com.yandex.metrica.impl.ob.Za;
import com.yandex.metrica.impl.ob.db;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

public final class Za {
    private Rl a;
    private volatile boolean b;
    private final ICommonExecutor c;

    public Za(@NotNull Hh object, @NotNull b b3, @NotNull Random random, @NotNull ICommonExecutor iCommonExecutor, @NotNull db db2) {
        this.c = iCommonExecutor;
        this.a = new a(this, b3, db2, (long)((Hh)object).b());
        if (b3.a()) {
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"periodicRunnable");
            }
            ((Rl)object).run();
        } else {
            long l3 = random.nextInt(((Hh)object).a() + 1);
            object = this.a;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)"periodicRunnable");
            }
            iCommonExecutor.executeDelayed((Runnable)object, l3, TimeUnit.SECONDS);
        }
    }

    public static final /* synthetic */ ICommonExecutor a(Za za) {
        return za.c;
    }

    public static final /* synthetic */ Rl b(Za object) {
        object = ((Za)object).a;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"periodicRunnable");
        }
        return object;
    }

    public static final /* synthetic */ boolean c(Za za) {
        return za.b;
    }

    public final void a() {
        this.b = true;
        ICommonExecutor iCommonExecutor = this.c;
        Rl rl2 = this.a;
        if (rl2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)"periodicRunnable");
        }
        iCommonExecutor.remove(rl2);
    }

    public static final class b {
        private volatile boolean a;

        public b(boolean bl) {
            this.a = bl;
        }

        public /* synthetic */ b(boolean bl, int n2) {
            if ((n2 & 1) != 0) {
                bl = false;
            }
            this(bl);
        }

        public final void a(boolean bl) {
            this.a = bl;
        }

        public final boolean a() {
            return this.a;
        }
    }
}

