// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

public class v implements N
{
    public static final v a;
    
    static {
        a = new v();
    }
    
    public static v c() {
        return v.a;
    }
    
    @Override
    public M a(final Class clazz) {
        if (w.class.isAssignableFrom(clazz)) {
            try {
                return (M)w.u(clazz.asSubclass(w.class)).n();
            }
            catch (Exception cause) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unable to get message info for ");
                sb.append(clazz.getName());
                throw new RuntimeException(sb.toString(), cause);
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unsupported message type: ");
        sb2.append(clazz.getName());
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @Override
    public boolean b(final Class clazz) {
        return w.class.isAssignableFrom(clazz);
    }
}
