/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package com.appsflyer;

import java.util.Map;

public interface AppsFlyerConversionListener {
    public void onAppOpenAttribution(Map<String, String> var1);

    public void onAttributionFailure(String var1);

    public void onConversionDataFail(String var1);

    public void onConversionDataSuccess(Map<String, Object> var1);
}

