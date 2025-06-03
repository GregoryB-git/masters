// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public abstract class AFe1dSDK extends AFe1jSDK
{
    public AFe1dSDK() {
        this(null, null);
    }
    
    public AFe1dSDK(final String s, final Boolean b) {
        super(s, null, Boolean.FALSE, null, b);
    }
    
    @Override
    public final boolean afDebugLog() {
        return false;
    }
    
    @Override
    public final boolean afErrorLog() {
        return false;
    }
    
    @Override
    public final boolean afInfoLog() {
        return false;
    }
}
