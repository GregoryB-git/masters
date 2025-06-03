/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.plugins.StackTraceItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PluginErrorDetails {
    @Nullable
    private final String a;
    @Nullable
    private final String b;
    @NonNull
    private final List<StackTraceItem> c;
    @Nullable
    private final String d;
    @Nullable
    private final String e;
    @NonNull
    private final Map<String, String> f;

    private PluginErrorDetails(@Nullable String string, @Nullable String string2, @NonNull List<StackTraceItem> list, @Nullable String string3, @Nullable String string4, @NonNull Map<String, String> map) {
        this.a = string;
        this.b = string2;
        this.c = new ArrayList(list);
        this.d = string3;
        this.e = string4;
        this.f = A2.a(A2.a(map));
    }

    public /* synthetic */ PluginErrorDetails(String string, String string2, List list, String string3, String string4, Map map, a a2) {
        this(string, string2, (List<StackTraceItem>)list, string3, string4, (Map<String, String>)map);
    }

    @Nullable
    public String getExceptionClass() {
        return this.a;
    }

    @Nullable
    public String getMessage() {
        return this.b;
    }

    @Nullable
    public String getPlatform() {
        return this.d;
    }

    @NonNull
    public Map<String, String> getPluginEnvironment() {
        return this.f;
    }

    @NonNull
    public List<StackTraceItem> getStacktrace() {
        return this.c;
    }

    @Nullable
    public String getVirtualMachineVersion() {
        return this.e;
    }

    public static class Builder {
        @Nullable
        private String a;
        @Nullable
        private String b;
        @Nullable
        private List<StackTraceItem> c;
        @Nullable
        private String d;
        @Nullable
        private String e;
        @Nullable
        private Map<String, String> f;

        @NonNull
        public PluginErrorDetails build() {
            String string = this.a;
            String string2 = this.b;
            HashMap hashMap = this.c;
            HashMap hashMap2 = new ArrayList();
            if (hashMap != null) {
                hashMap2 = hashMap;
            }
            String string3 = this.d;
            String string4 = this.e;
            hashMap = this.f;
            HashMap hashMap3 = new HashMap();
            if (hashMap == null) {
                hashMap = hashMap3;
            }
            return new PluginErrorDetails(string, string2, (List)hashMap2, string3, string4, (Map)hashMap, null);
        }

        @NonNull
        public Builder withExceptionClass(@Nullable String string) {
            this.a = string;
            return this;
        }

        @NonNull
        public Builder withMessage(@Nullable String string) {
            this.b = string;
            return this;
        }

        @NonNull
        public Builder withPlatform(@Nullable String string) {
            this.d = string;
            return this;
        }

        @NonNull
        public Builder withPluginEnvironment(@Nullable Map<String, String> map) {
            this.f = map;
            return this;
        }

        @NonNull
        public Builder withStacktrace(@Nullable List<StackTraceItem> list) {
            this.c = list;
            return this;
        }

        @NonNull
        public Builder withVirtualMachineVersion(@Nullable String string) {
            this.e = string;
            return this;
        }
    }

    public static final class Platform {
        public static final String CORDOVA = "cordova";
        public static final String FLUTTER = "flutter";
        public static final String NATIVE = "native";
        public static final String REACT_NATIVE = "react_native";
        public static final String UNITY = "unity";
        public static final String XAMARIN = "xamarin";
    }
}

