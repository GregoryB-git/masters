// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class Q4
{
    public static final P4 a;
    public static final P4 b;
    
    static {
        a = c();
        b = new R4();
    }
    
    public static P4 a() {
        return Q4.a;
    }
    
    public static P4 b() {
        return Q4.b;
    }
    
    public static P4 c() {
        try {
            return (P4)Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
