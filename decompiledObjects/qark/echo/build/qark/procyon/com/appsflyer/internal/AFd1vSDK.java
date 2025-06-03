// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public enum AFd1vSDK
{
    AFInAppEventParameterName(2), 
    AFInAppEventType(2), 
    AFKeystoreWrapper(2), 
    AFLogger(2), 
    AFLogger$LogLevel(4), 
    AFVersionDeclaration(4), 
    AppsFlyer2dXConversionCallback(4), 
    afDebugLog(3), 
    afErrorLog(4), 
    afErrorLogForExcManagerOnly(4), 
    afInfoLog(2), 
    afRDLog(2), 
    afWarnLog(4), 
    getLevel(4), 
    init(4), 
    onAppOpenAttributionNative(4), 
    onInstallConversionDataLoadedNative(4), 
    onInstallConversionFailureNative(4), 
    valueOf(2), 
    values(1);
    
    public final int onDeepLinkingNative;
    
    private AFd1vSDK(final int onDeepLinkingNative) {
        this.onDeepLinkingNative = onDeepLinkingNative;
    }
}
