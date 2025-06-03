// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer.internal;

public abstract class AFe1jSDK extends AFa1qSDK
{
    private final boolean AFLogger$LogLevel;
    public boolean afErrorLogForExcManagerOnly;
    private final boolean getLevel;
    
    public AFe1jSDK() {
        this(null, null, null, null, null);
    }
    
    public AFe1jSDK(final String s, final String s2, final Boolean b, final Boolean b2, final Boolean b3) {
        super(s, s2, b3 != null && b3);
        final boolean b4 = true;
        this.AFLogger$LogLevel = (b == null || b);
        boolean booleanValue = b4;
        if (b2 != null) {
            booleanValue = b2;
        }
        this.getLevel = booleanValue;
    }
    
    public final boolean AFVersionDeclaration() {
        return this.getLevel;
    }
    
    public final boolean afErrorLogForExcManagerOnly() {
        return this.AFLogger$LogLevel;
    }
    
    public final boolean getLevel() {
        return this.afErrorLogForExcManagerOnly;
    }
}
