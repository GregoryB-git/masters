// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

public abstract class P3
{
    public static final O3 a;
    public static final O3 b;
    
    static {
        a = new Q3();
        b = c();
    }
    
    public static O3 a() {
        final O3 b = P3.b;
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
    
    public static O3 b() {
        return P3.a;
    }
    
    public static O3 c() {
        try {
            return (O3)Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
        }
        catch (Exception ex) {
            return null;
        }
    }
}
