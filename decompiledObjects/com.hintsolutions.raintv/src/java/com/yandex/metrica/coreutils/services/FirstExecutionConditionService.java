/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.executors.ICommonExecutor
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.coreutils.services;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.ActivationBarrier;
import com.yandex.metrica.coreutils.services.UtilityServiceConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstExecutionConditionService {
    private static final String TAG = "[FirstExecutionConditionChecker]";
    @Nullable
    private UtilityServiceConfiguration configuration;
    @NonNull
    private final List<FirstExecutionHandler> mFirstExecutionHandlers = new ArrayList();

    @VisibleForTesting
    public FirstExecutionHandler createFirstExecutionHandler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrier.ActivationBarrierHelper activationBarrierHelper, @NonNull FirstExecutionConditionChecker firstExecutionConditionChecker) {
        FirstExecutionConditionService firstExecutionConditionService = this;
        synchronized (firstExecutionConditionService) {
            FirstExecutionHandler firstExecutionHandler = new FirstExecutionHandler(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker, null);
            this.mFirstExecutionHandlers.add((Object)firstExecutionHandler);
            return firstExecutionHandler;
        }
    }

    public FirstExecutionHandler createFirstExecutionHandler(@NonNull Runnable object, @NonNull ICommonExecutor iCommonExecutor, @NonNull String string2) {
        FirstExecutionConditionService firstExecutionConditionService = this;
        synchronized (firstExecutionConditionService) {
            ActivationBarrier.ActivationBarrierHelper activationBarrierHelper = new ActivationBarrier.ActivationBarrierHelper((Runnable)object);
            object = new FirstExecutionConditionChecker(this.configuration, string2);
            object = this.createFirstExecutionHandler(iCommonExecutor, activationBarrierHelper, (FirstExecutionConditionChecker)object);
            return object;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
        ArrayList arrayList;
        FirstExecutionConditionService firstExecutionConditionService = this;
        synchronized (firstExecutionConditionService) {
            this.configuration = utilityServiceConfiguration;
            arrayList = new ArrayList(this.mFirstExecutionHandlers);
        }
        arrayList = arrayList.iterator();
        while (arrayList.hasNext()) {
            ((FirstExecutionHandler)arrayList.next()).updateConfig(utilityServiceConfiguration);
        }
        return;
    }

    public static class FirstExecutionConditionChecker {
        private boolean firstExecutionAlreadyAllowed;
        private long initialUpdateConfigTime;
        private long lastUpdateConfigTime;
        private long mDelay;
        @NonNull
        private final FirstExecutionDelayChecker mFirstExecutionDelayChecker;
        public final String tag;

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull FirstExecutionDelayChecker firstExecutionDelayChecker, @NonNull String string2) {
            this.mFirstExecutionDelayChecker = firstExecutionDelayChecker;
            this.firstExecutionAlreadyAllowed = false;
            long l2 = 0L;
            long l3 = utilityServiceConfiguration == null ? 0L : utilityServiceConfiguration.getInitialConfigTime();
            this.initialUpdateConfigTime = l3;
            l3 = utilityServiceConfiguration == null ? l2 : utilityServiceConfiguration.getLastUpdateConfigTime();
            this.lastUpdateConfigTime = l3;
            this.mDelay = Long.MAX_VALUE;
            this.tag = string2;
        }

        public FirstExecutionConditionChecker(@Nullable UtilityServiceConfiguration utilityServiceConfiguration, @NonNull String string2) {
            this(utilityServiceConfiguration, new FirstExecutionDelayChecker(), string2);
        }

        public void setDelay(long l2, @NonNull TimeUnit timeUnit) {
            this.mDelay = timeUnit.toMillis(l2);
        }

        public void setFirstExecutionAlreadyAllowed() {
            this.firstExecutionAlreadyAllowed = true;
        }

        public boolean shouldExecute() {
            if (this.firstExecutionAlreadyAllowed) {
                return true;
            }
            return this.mFirstExecutionDelayChecker.delaySinceFirstStartupWasPassed(this.initialUpdateConfigTime, this.lastUpdateConfigTime, this.mDelay);
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.initialUpdateConfigTime = utilityServiceConfiguration.getInitialConfigTime();
            this.lastUpdateConfigTime = utilityServiceConfiguration.getLastUpdateConfigTime();
        }
    }

    public static class FirstExecutionDelayChecker {
        public boolean delaySinceFirstStartupWasPassed(long l2, long l3, long l4) {
            boolean bl = l3 - l2 >= l4;
            return bl;
        }
    }

    public static class FirstExecutionHandler {
        @NonNull
        private final ActivationBarrier.ActivationBarrierHelper mActivationBarrierHelper;
        @NonNull
        private final ICommonExecutor mExecutor;
        @NonNull
        private FirstExecutionConditionChecker mFirstExecutionConditionChecker;

        private FirstExecutionHandler(@NonNull ICommonExecutor iCommonExecutor, @NonNull ActivationBarrier.ActivationBarrierHelper activationBarrierHelper, @NonNull FirstExecutionConditionChecker firstExecutionConditionChecker) {
            this.mActivationBarrierHelper = activationBarrierHelper;
            this.mFirstExecutionConditionChecker = firstExecutionConditionChecker;
            this.mExecutor = iCommonExecutor;
        }

        public /* synthetic */ FirstExecutionHandler(ICommonExecutor iCommonExecutor, ActivationBarrier.ActivationBarrierHelper activationBarrierHelper, FirstExecutionConditionChecker firstExecutionConditionChecker, 1 var4_4) {
            this(iCommonExecutor, activationBarrierHelper, firstExecutionConditionChecker);
        }

        public boolean canExecute() {
            boolean bl = this.mFirstExecutionConditionChecker.shouldExecute();
            if (bl) {
                this.mFirstExecutionConditionChecker.setFirstExecutionAlreadyAllowed();
            }
            return bl;
        }

        public void setDelaySeconds(long l2) {
            this.mFirstExecutionConditionChecker.setDelay(l2, TimeUnit.SECONDS);
        }

        public boolean tryExecute(int n) {
            if (this.mFirstExecutionConditionChecker.shouldExecute()) {
                this.mActivationBarrierHelper.subscribeIfNeeded(TimeUnit.SECONDS.toMillis((long)n), this.mExecutor);
                this.mFirstExecutionConditionChecker.setFirstExecutionAlreadyAllowed();
                return true;
            }
            return false;
        }

        public void updateConfig(@NonNull UtilityServiceConfiguration utilityServiceConfiguration) {
            this.mFirstExecutionConditionChecker.updateConfig(utilityServiceConfiguration);
        }
    }
}

