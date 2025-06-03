// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

public abstract class S
{
    public static final P a;
    public static final P b;
    
    static {
        a = c();
        b = new Q();
    }
    
    public static P a() {
        return S.a;
    }
    
    public static P b() {
        return S.b;
    }
    
    public static P c() {
        try {
            return (P)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
