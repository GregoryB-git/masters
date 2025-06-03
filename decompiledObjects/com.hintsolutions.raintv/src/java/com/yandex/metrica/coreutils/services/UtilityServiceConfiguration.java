/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.yandex.metrica.coreutils.services;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv={1, 0, 3}, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2={"Lcom/yandex/metrica/coreutils/services/UtilityServiceConfiguration;", "", "initialConfigTime", "", "lastUpdateConfigTime", "(JJ)V", "getInitialConfigTime", "()J", "getLastUpdateConfigTime", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core-utils_release"}, k=1, mv={1, 4, 2})
public final class UtilityServiceConfiguration {
    private final long initialConfigTime;
    private final long lastUpdateConfigTime;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public UtilityServiceConfiguration(long l2, long l3) {
        this.initialConfigTime = l2;
        this.lastUpdateConfigTime = l3;
    }

    public /* synthetic */ UtilityServiceConfiguration(long l2, long l3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            l2 = 0L;
        }
        if ((n & 2) != 0) {
            l3 = 0L;
        }
        this(l2, l3);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long l2, long l3, int n, Object object) {
        if ((n & 1) != 0) {
            l2 = utilityServiceConfiguration.initialConfigTime;
        }
        if ((n & 2) != 0) {
            l3 = utilityServiceConfiguration.lastUpdateConfigTime;
        }
        return utilityServiceConfiguration.copy(l2, l3);
    }

    public final long component1() {
        return this.initialConfigTime;
    }

    public final long component2() {
        return this.lastUpdateConfigTime;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long l2, long l3) {
        return new UtilityServiceConfiguration(l2, l3);
    }

    public boolean equals(@Nullable Object object) {
        block2: {
            block3: {
                if (this == object) break block2;
                if (!(object instanceof UtilityServiceConfiguration)) break block3;
                object = (UtilityServiceConfiguration)object;
                if (this.initialConfigTime == ((UtilityServiceConfiguration)object).initialConfigTime && this.lastUpdateConfigTime == ((UtilityServiceConfiguration)object).lastUpdateConfigTime) break block2;
            }
            return false;
        }
        return true;
    }

    public final long getInitialConfigTime() {
        return this.initialConfigTime;
    }

    public final long getLastUpdateConfigTime() {
        return this.lastUpdateConfigTime;
    }

    public int hashCode() {
        long l2 = this.initialConfigTime;
        int n = (int)(l2 ^ l2 >>> 32);
        l2 = this.lastUpdateConfigTime;
        return n * 31 + (int)(l2 >>> 32 ^ l2);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("UtilityServiceConfiguration(initialConfigTime=");
        stringBuilder.append(this.initialConfigTime);
        stringBuilder.append(", lastUpdateConfigTime=");
        return z2.r(stringBuilder, this.lastUpdateConfigTime, ")");
    }
}

