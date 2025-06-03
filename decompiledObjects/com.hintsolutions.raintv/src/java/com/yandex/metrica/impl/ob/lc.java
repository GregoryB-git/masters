/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.AnyThread
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.networktasks.api.NetworkServiceLocator
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.ob.E7;
import com.yandex.metrica.impl.ob.O7;
import com.yandex.metrica.impl.ob.P7;
import com.yandex.metrica.impl.ob.Yc;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.fc;
import com.yandex.metrica.impl.ob.yc;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import com.yandex.metrica.networktasks.api.NetworkTask;

class Lc
implements yc {
    @NonNull
    private final Context a;
    @NonNull
    private ci b;
    @Nullable
    private volatile fc c;
    @NonNull
    private final P7 d;
    @NonNull
    private final O7 e;
    @NonNull
    private final TimeProvider f;
    @NonNull
    private final Yc g;
    @NonNull
    private final ActivationBarrier h;
    @NonNull
    private final ActivationBarrier.IActivationBarrierCallback i;
    @NonNull
    private final ICommonExecutor j;
    private boolean k = false;

    public Lc(@NonNull Context context, @NonNull ci ci2, @Nullable fc fc2, @NonNull P7 p7, @NonNull O7 o7, @NonNull ICommonExecutor iCommonExecutor) {
        this(context, ci2, fc2, p7, o7, iCommonExecutor, new SystemTimeProvider(), new Yc(), UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    @VisibleForTesting
    public Lc(@NonNull Context context, @NonNull ci ci2, @Nullable fc fc2, @NonNull P7 p7, @NonNull O7 o7, @NonNull ICommonExecutor iCommonExecutor, @NonNull TimeProvider timeProvider, @NonNull Yc yc2, @NonNull ActivationBarrier activationBarrier) {
        this.a = context;
        this.c = fc2;
        this.b = ci2;
        this.d = p7;
        this.e = o7;
        this.j = iCommonExecutor;
        this.f = timeProvider;
        this.g = yc2;
        this.h = activationBarrier;
        this.i = new ActivationBarrier.IActivationBarrierCallback(this){
            public final Lc a;
            {
                this.a = lc;
            }

            @Override
            @AnyThread
            public void onWaitFinished() {
                Lc.a(this.a, true);
                Lc.a(this.a);
            }
        };
    }

    public static void a(Lc object) {
        fc fc2 = ((Lc)object).c;
        if (fc2 != null) {
            object = ((Lc)object).g.a(((Lc)object).a, ((Lc)object).b, fc2, (yc)object);
            NetworkServiceLocator.getInstance().getNetworkCore().startTask((NetworkTask)object);
        }
    }

    /*
     * Unable to fully structure code
     */
    @AnyThread
    private boolean a(E7 var1_1) {
        block6: {
            var7_2 = this.c;
            var6_3 = true;
            if (var7_2 == null) ** GOTO lbl-1000
            var7_2 = this.c;
            if (var7_2 == null) ** GOTO lbl-1000
            var3_4 = var7_2.c;
            var2_5 = var1_1.c() >= var3_4;
            if (var2_5) {
                var2_5 = true;
            } else lbl-1000:
            // 2 sources

            {
                var2_5 = false;
            }
            var5_6 = var6_3;
            if (var2_5) break block6;
            var7_2 = this.c;
            if (var7_2 == null) ** GOTO lbl-1000
            var3_4 = var7_2.e;
            var2_5 = this.f.currentTimeMillis() - var1_1.b() > var3_4;
            if (var2_5) {
                var2_5 = true;
            } else lbl-1000:
            // 2 sources

            {
                var2_5 = false;
            }
            if (var2_5) {
                var5_6 = var6_3;
            } else lbl-1000:
            // 2 sources

            {
                var5_6 = false;
            }
        }
        return var5_6;
    }

    public static /* synthetic */ boolean a(Lc lc, boolean bl) {
        lc.k = bl;
        return bl;
    }

    @Override
    @AnyThread
    public void a() {
        boolean bl = this.a(this.d);
        boolean bl2 = this.a(this.e);
        boolean bl3 = bl || bl2;
        if (bl3) {
            if (!this.k) {
                this.h.subscribe(ActivationBarrier.ACTIVATION_DELAY, this.j, this.i);
            } else {
                Object object = this.c;
                if (object != null) {
                    object = this.g.a(this.a, this.b, (fc)object, this);
                    NetworkServiceLocator.getInstance().getNetworkCore().startTask((NetworkTask)object);
                }
            }
        }
    }

    public void a(@NonNull ci ci2) {
        this.b = ci2;
    }

    public void a(@Nullable fc fc2) {
        this.c = fc2;
    }
}

