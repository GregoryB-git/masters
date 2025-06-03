// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

public abstract class d
{
    public static boolean a;
    public static final Class b;
    public static final boolean c;
    
    static {
        b = a("libcore.io.Memory");
        c = (!d.a && a("org.robolectric.Robolectric") != null);
    }
    
    public static Class a(final String className) {
        try {
            return Class.forName(className);
        }
        finally {
            return null;
        }
    }
    
    public static Class b() {
        return d.b;
    }
    
    public static boolean c() {
        return d.a || (d.b != null && !d.c);
    }
}
