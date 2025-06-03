/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.String
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFa1qSDK;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.internal.AFe1dSDK;

public final class AFe1cSDK
extends AFe1dSDK {
    public AFe1cSDK() {
        super("af_purchase", Boolean.TRUE);
    }

    @Override
    public final AFd1vSDK AFInAppEventType() {
        return AFd1vSDK.getLevel;
    }

    @Override
    public final AFa1qSDK AFKeystoreWrapper(String string2) {
        return AFa1qSDK.super.AFKeystoreWrapper(AFa1qSDK.AFInAppEventParameterName(string2));
    }
}

