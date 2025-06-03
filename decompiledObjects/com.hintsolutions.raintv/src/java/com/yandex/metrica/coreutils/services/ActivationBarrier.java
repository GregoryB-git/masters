/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.executors.ICommonExecutor
 *  com.yandex.metrica.coreutils.services.ActivationBarrier$ActivationBarrierHelper$1
 *  com.yandex.metrica.coreutils.services.SystemTimeProvider
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.coreutils.services;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.UtilityServiceLocator;
import java.util.concurrent.TimeUnit;

public class ActivationBarrier {
    public static final long ACTIVATION_DELAY = TimeUnit.SECONDS.toMillis(10L);
    private static final String TAG = "[ActivationBarrier]";
    private long mStartTime;
    @NonNull
    private final SystemTimeProvider mTimeProvider;

    public ActivationBarrier() {
        this(new SystemTimeProvider());
    }

    @VisibleForTesting
    public ActivationBarrier(@NonNull SystemTimeProvider systemTimeProvider) {
        this.mTimeProvider = systemTimeProvider;
    }

    public void activate() {
        this.mStartTime = this.mTimeProvider.currentTimeMillis();
    }

    public void subscribe(long l2, @NonNull ICommonExecutor iCommonExecutor, @NonNull IActivationBarrierCallback iActivationBarrierCallback) {
        l2 = Math.max((long)(l2 - (this.mTimeProvider.currentTimeMillis() - this.mStartTime)), (long)0L);
        iCommonExecutor.executeDelayed(new Runnable(){
            public final ActivationBarrier this$0;
            public final IActivationBarrierCallback val$callback;
            {
                this.this$0 = activationBarrier;
                this.val$callback = iActivationBarrierCallback;
            }

            public void run() {
                this.val$callback.onWaitFinished();
            }
        }, l2);
    }

    public static class ActivationBarrierHelper {
        private boolean mActivated = false;
        @NonNull
        private final ActivationBarrier mActivationBarrier;
        @NonNull
        private final IActivationBarrierCallback mActivationCallback;

        public ActivationBarrierHelper(@NonNull Runnable runnable) {
            this(runnable, UtilityServiceLocator.getInstance().getActivationBarrier());
        }

        @VisibleForTesting
        public ActivationBarrierHelper(@NonNull Runnable runnable, @NonNull ActivationBarrier activationBarrier) {
            this.mActivationCallback = new 1(this, runnable);
            this.mActivationBarrier = activationBarrier;
        }

        public static /* synthetic */ boolean access$002(ActivationBarrierHelper activationBarrierHelper, boolean bl) {
            activationBarrierHelper.mActivated = bl;
            return bl;
        }

        public void subscribeIfNeeded(long l2, @NonNull ICommonExecutor iCommonExecutor) {
            if (!this.mActivated) {
                this.mActivationBarrier.subscribe(l2, iCommonExecutor, this.mActivationCallback);
            } else {
                iCommonExecutor.execute(new Runnable(this){
                    public final ActivationBarrierHelper this$0;
                    {
                        this.this$0 = activationBarrierHelper;
                    }

                    public void run() {
                        this.this$0.mActivationCallback.onWaitFinished();
                    }
                });
            }
        }
    }

    public static interface IActivationBarrierCallback {
        public void onWaitFinished();
    }
}

