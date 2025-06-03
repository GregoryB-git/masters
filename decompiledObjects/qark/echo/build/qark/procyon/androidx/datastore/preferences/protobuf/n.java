// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public abstract class n
{
    public static final Class a;
    
    static {
        a = c();
    }
    
    public static o a() {
        Label_0014: {
            if (n.a == null) {
                break Label_0014;
            }
            try {
                return b("getEmptyRegistry");
                return o.e;
            }
            catch (Exception ex) {
                return o.e;
            }
        }
    }
    
    public static final o b(final String name) {
        return (o)n.a.getDeclaredMethod(name, (Class[])new Class[0]).invoke(null, new Object[0]);
    }
    
    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        }
        catch (ClassNotFoundException ex) {
            return null;
        }
    }
}
