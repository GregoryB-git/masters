/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.LinkedHashMap
 *  java.util.Map
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.ReporterConfig;
import com.yandex.metrica.impl.ob.A2;
import java.util.LinkedHashMap;
import java.util.Map;

public class e
extends ReporterConfig {
    @Nullable
    public final Integer a;
    @Nullable
    public final Integer b;
    public final Map<String, String> c;

    private e(ReporterConfig reporterConfig) {
        super(reporterConfig);
        if (reporterConfig instanceof e) {
            reporterConfig = (e)reporterConfig;
            this.a = ((e)reporterConfig).a;
            this.b = ((e)reporterConfig).b;
            this.c = ((e)reporterConfig).c;
        } else {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    public e(@NonNull a object) {
        super(object.a);
        this.b = object.b;
        this.a = object.c;
        object = object.d;
        object = object == null ? null : A2.e(object);
        this.c = object;
    }

    public static a a(@NonNull e object) {
        int n;
        a a4 = new a(((ReporterConfig)object).apiKey);
        if (A2.a((Object)((ReporterConfig)object).sessionTimeout)) {
            n = ((ReporterConfig)object).sessionTimeout;
            a4.a.withSessionTimeout(n);
        }
        if (A2.a((Object)((ReporterConfig)object).logs) && ((ReporterConfig)object).logs.booleanValue()) {
            a4.a.withLogs();
        }
        if (A2.a((Object)((ReporterConfig)object).statisticsSending)) {
            boolean bl = ((ReporterConfig)object).statisticsSending;
            a4.a.withStatisticsSending(bl);
        }
        if (A2.a((Object)((ReporterConfig)object).maxReportsInDatabaseCount)) {
            n = ((ReporterConfig)object).maxReportsInDatabaseCount;
            a4.a.withMaxReportsInDatabaseCount(n);
        }
        if (A2.a((Object)((e)object).a)) {
            a4.c = (int)((e)object).a;
        }
        if (A2.a((Object)((e)object).b)) {
            a4.b = (int)((e)object).b;
        }
        if (A2.a(((e)object).c)) {
            for (Object object2 : ((e)object).c.entrySet()) {
                String string2 = (String)object2.getKey();
                object2 = (String)object2.getValue();
                a4.d.put((Object)string2, object2);
            }
        }
        if (A2.a((Object)((ReporterConfig)object).userProfileID)) {
            object = ((ReporterConfig)object).userProfileID;
            a4.a.withUserProfileID((String)object);
        }
        return a4;
    }

    public static a a(@NonNull String string2) {
        return new a(string2);
    }

    public static e a(@NonNull ReporterConfig reporterConfig) {
        return new e(reporterConfig);
    }

    public static class a {
        public ReporterConfig.Builder a;
        public Integer b;
        public Integer c;
        public LinkedHashMap<String, String> d = new LinkedHashMap();

        public a(String string2) {
            this.a = ReporterConfig.newConfigBuilder(string2);
        }

        @NonNull
        public a a(int n) {
            this.a.withMaxReportsInDatabaseCount(n);
            return this;
        }

        @NonNull
        public e a() {
            return new e(this);
        }
    }
}

