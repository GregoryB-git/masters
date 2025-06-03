// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public abstract class d
{
    public static final Class a;
    public static final boolean b;
    
    static {
        a = a("libcore.io.Memory");
        b = (a("org.robolectric.Robolectric") != null);
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
        return d.a;
    }
    
    public static boolean c() {
        return d.a != null && !d.b;
    }
}
