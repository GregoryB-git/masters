/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.networktasks.api;

public class RetryPolicyConfig {
    public final int exponentialMultiplier;
    public final int maxIntervalSeconds;

    public RetryPolicyConfig(int n7, int n8) {
        this.maxIntervalSeconds = n7;
        this.exponentialMultiplier = n8;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (RetryPolicyConfig)object;
            if (this.maxIntervalSeconds != ((RetryPolicyConfig)object).maxIntervalSeconds) {
                return false;
            }
            if (this.exponentialMultiplier != ((RetryPolicyConfig)object).exponentialMultiplier) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        return this.maxIntervalSeconds * 31 + this.exponentialMultiplier;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("RetryPolicyConfig{maxIntervalSeconds=");
        stringBuilder.append(this.maxIntervalSeconds);
        stringBuilder.append(", exponentialMultiplier=");
        return a.n(stringBuilder, this.exponentialMultiplier, '}');
    }
}

