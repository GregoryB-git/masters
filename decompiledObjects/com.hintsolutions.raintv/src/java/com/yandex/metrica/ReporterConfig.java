/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  com.yandex.metrica.impl.ob.un
 *  com.yandex.metrica.impl.ob.xn
 *  com.yandex.metrica.impl.ob.yn
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import com.yandex.metrica.impl.ob.yn;

public class ReporterConfig {
    @NonNull
    public final String apiKey;
    @Nullable
    public final Boolean logs;
    @Nullable
    public final Integer maxReportsInDatabaseCount;
    @Nullable
    public final Integer sessionTimeout;
    @Nullable
    public final Boolean statisticsSending;
    @Nullable
    public final String userProfileID;

    public ReporterConfig(@NonNull Builder builder) {
        this.apiKey = builder.a;
        this.sessionTimeout = builder.b;
        this.logs = builder.c;
        this.statisticsSending = builder.d;
        this.maxReportsInDatabaseCount = builder.e;
        this.userProfileID = builder.f;
    }

    public ReporterConfig(@NonNull ReporterConfig reporterConfig) {
        this.apiKey = reporterConfig.apiKey;
        this.sessionTimeout = reporterConfig.sessionTimeout;
        this.logs = reporterConfig.logs;
        this.statisticsSending = reporterConfig.statisticsSending;
        this.maxReportsInDatabaseCount = reporterConfig.maxReportsInDatabaseCount;
        this.userProfileID = reporterConfig.userProfileID;
    }

    public static Builder createBuilderFromConfig(@NonNull ReporterConfig reporterConfig) {
        Builder builder = ReporterConfig.newConfigBuilder(reporterConfig.apiKey);
        if (A2.a((Object)reporterConfig.sessionTimeout)) {
            builder.withSessionTimeout(reporterConfig.sessionTimeout);
        }
        if (A2.a((Object)reporterConfig.logs) && reporterConfig.logs.booleanValue()) {
            builder.withLogs();
        }
        if (A2.a((Object)reporterConfig.statisticsSending)) {
            builder.withStatisticsSending(reporterConfig.statisticsSending);
        }
        if (A2.a((Object)reporterConfig.maxReportsInDatabaseCount)) {
            builder.withMaxReportsInDatabaseCount(reporterConfig.maxReportsInDatabaseCount);
        }
        if (A2.a((Object)reporterConfig.userProfileID)) {
            builder.withUserProfileID(reporterConfig.userProfileID);
        }
        return builder;
    }

    @NonNull
    public static Builder newConfigBuilder(@NonNull String string2) {
        return new Builder(string2);
    }

    public static class Builder {
        private static final xn<String> g = new un((xn)new yn());
        private final String a;
        @Nullable
        private Integer b;
        @Nullable
        private Boolean c;
        @Nullable
        private Boolean d;
        @Nullable
        private Integer e;
        @Nullable
        private String f;

        public Builder(@NonNull String string2) {
            ((un)g).a((Object)string2);
            this.a = string2;
        }

        @NonNull
        public ReporterConfig build() {
            return new ReporterConfig(this);
        }

        @NonNull
        public Builder withLogs() {
            this.c = Boolean.TRUE;
            return this;
        }

        @NonNull
        public Builder withMaxReportsInDatabaseCount(int n) {
            this.e = n;
            return this;
        }

        @NonNull
        public Builder withSessionTimeout(int n) {
            this.b = n;
            return this;
        }

        @NonNull
        public Builder withStatisticsSending(boolean bl) {
            this.d = bl;
            return this;
        }

        @NonNull
        public Builder withUserProfileID(@Nullable String string2) {
            this.f = string2;
            return this;
        }
    }
}

