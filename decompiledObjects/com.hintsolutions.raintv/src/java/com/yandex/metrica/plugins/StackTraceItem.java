/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.plugins;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class StackTraceItem {
    @Nullable
    private final String a;
    @Nullable
    private final String b;
    @Nullable
    private final Integer c;
    @Nullable
    private final Integer d;
    @Nullable
    private final String e;

    private StackTraceItem(@Nullable String string, @Nullable String string2, @Nullable Integer n7, @Nullable Integer n8, @Nullable String string3) {
        this.a = string;
        this.b = string2;
        this.c = n7;
        this.d = n8;
        this.e = string3;
    }

    public /* synthetic */ StackTraceItem(String string, String string2, Integer n7, Integer n8, String string3, a a2) {
        this(string, string2, n7, n8, string3);
    }

    @Nullable
    public String getClassName() {
        return this.a;
    }

    @Nullable
    public Integer getColumn() {
        return this.d;
    }

    @Nullable
    public String getFileName() {
        return this.b;
    }

    @Nullable
    public Integer getLine() {
        return this.c;
    }

    @Nullable
    public String getMethodName() {
        return this.e;
    }

    public static class Builder {
        @Nullable
        private String a;
        @Nullable
        private String b;
        @Nullable
        private Integer c;
        @Nullable
        private Integer d;
        @Nullable
        private String e;

        @NonNull
        public StackTraceItem build() {
            return new StackTraceItem(this.a, this.b, this.c, this.d, this.e, null);
        }

        @NonNull
        public Builder withClassName(@Nullable String string) {
            this.a = string;
            return this;
        }

        @NonNull
        public Builder withColumn(@Nullable Integer n7) {
            this.d = n7;
            return this;
        }

        @NonNull
        public Builder withFileName(@Nullable String string) {
            this.b = string;
            return this;
        }

        @NonNull
        public Builder withLine(@Nullable Integer n7) {
            this.c = n7;
            return this;
        }

        @NonNull
        public Builder withMethodName(@Nullable String string) {
            this.e = string;
            return this;
        }
    }
}

