/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package com.appsflyer.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class AFc1aSDK
extends Enum<AFc1aSDK> {
    private static final /* synthetic */ AFc1aSDK[] AFInAppEventParameterName;
    public static final /* enum */ AFc1aSDK AFInAppEventType;
    public static final /* enum */ AFc1aSDK AFKeystoreWrapper;
    public static final /* enum */ AFc1aSDK values;
    @NotNull
    public final String valueOf;

    static {
        AFc1aSDK aFc1aSDK;
        AFc1aSDK aFc1aSDK2;
        AFc1aSDK aFc1aSDK3;
        AFInAppEventType = aFc1aSDK3 = new AFc1aSDK("api");
        values = aFc1aSDK2 = new AFc1aSDK("rc");
        AFKeystoreWrapper = aFc1aSDK = new AFc1aSDK("");
        AFInAppEventParameterName = new AFc1aSDK[]{aFc1aSDK3, aFc1aSDK2, aFc1aSDK};
    }

    private AFc1aSDK(String string3) {
        this.valueOf = string3;
    }

    public static AFc1aSDK valueOf(String string2) {
        return (AFc1aSDK)Enum.valueOf(AFc1aSDK.class, (String)string2);
    }

    public static AFc1aSDK[] values() {
        return (AFc1aSDK[])AFInAppEventParameterName.clone();
    }
}

