/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.fh
 *  com.yandex.metrica.impl.ob.hd
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import com.yandex.metrica.impl.ob.B0;
import com.yandex.metrica.impl.ob.F0;
import com.yandex.metrica.impl.ob.Qh;
import com.yandex.metrica.impl.ob.ch;
import com.yandex.metrica.impl.ob.ci;
import com.yandex.metrica.impl.ob.fh;
import com.yandex.metrica.impl.ob.hd;
import com.yandex.metrica.impl.ob.rh;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.io.File;

public class hh {
    @NonNull
    private final Context a;
    @NonNull
    private final B0 b;
    @NonNull
    private final ICommonExecutor c;
    @NonNull
    private final CacheControlHttpsConnectionPerformer d;
    @NonNull
    private final ch e;
    @NonNull
    private final TimeProvider f;
    @NonNull
    private final IExecutionPolicy g;
    @NonNull
    private final ActivationBarrier h;
    private boolean i;

    public hh(@NonNull Context context) {
        B0 b0 = new B0();
        F0.g().t().getClass();
        this(context, b0, new CacheControlHttpsConnectionPerformer(null), new SystemTimeProvider(), (IExecutionPolicy)new hd(context), F0.g().q().g(), (ch)F0.g().s(), UtilityServiceLocator.getInstance().getActivationBarrier());
    }

    @VisibleForTesting
    public hh(@NonNull Context context, @NonNull B0 b0, @NonNull CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, @NonNull TimeProvider timeProvider, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ICommonExecutor iCommonExecutor, @NonNull ch ch2, @NonNull ActivationBarrier activationBarrier) {
        this.i = false;
        this.a = context;
        this.b = b0;
        this.d = cacheControlHttpsConnectionPerformer;
        this.f = timeProvider;
        this.g = iExecutionPolicy;
        this.c = iCommonExecutor;
        this.e = ch2;
        this.h = activationBarrier;
    }

    public static /* synthetic */ CacheControlHttpsConnectionPerformer a(hh hh2) {
        return hh2.d;
    }

    public static void a(hh hh2, long l5) {
        hh2.e.a(hh2.f.currentTimeSeconds() + l5);
    }

    public static /* synthetic */ ch b(hh hh2) {
        return hh2.e;
    }

    public static void c(hh hh2) {
        hh hh3 = hh2;
        synchronized (hh3) {
            hh2.i = false;
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull ci ci2, @NonNull rh rh2) {
        hh hh2 = this;
        synchronized (hh2) {
            String string;
            void var2_2;
            Qh qh = ci2.M();
            if (qh == null) {
                return;
            }
            File file = this.b.a(this.a, "certificate.p12");
            boolean bl = file != null && file.exists();
            if (bl) {
                var2_2.a(file);
            }
            long l5 = this.f.currentTimeSeconds();
            long l8 = this.e.a();
            if (!(bl && l5 < l8 || this.i || TextUtils.isEmpty((CharSequence)(string = ci2.e())) || !this.g.canBeExecuted())) {
                this.i = true;
                ActivationBarrier activationBarrier = this.h;
                l8 = ActivationBarrier.ACTIVATION_DELAY;
                ICommonExecutor iCommonExecutor = this.c;
                ci2 = new fh(this, string, file, (rh)var2_2, qh);
                activationBarrier.subscribe(l8, iCommonExecutor, (ActivationBarrier.IActivationBarrierCallback)((Object)ci2));
            }
            return;
        }
    }
}

