/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.networktasks.api;

public class DefaultResponseParser$Response {
    public final String mStatus;

    public DefaultResponseParser$Response(String string) {
        this.mStatus = string;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("Response{mStatus='");
        stringBuilder.append(this.mStatus);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

