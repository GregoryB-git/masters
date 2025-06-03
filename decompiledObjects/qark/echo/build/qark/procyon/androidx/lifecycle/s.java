// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

public class s
{
    public final a a;
    public final t b;
    
    public s(final t b, final a a) {
        this.a = a;
        this.b = b;
    }
    
    public r a(final Class clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return this.b(sb.toString(), clazz);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public r b(final String s, final Class clazz) {
        final r b = this.b.b(s);
        if (clazz.isInstance(b)) {
            return b;
        }
        final r a = this.a.a(clazz);
        this.b.d(s, a);
        return a;
    }
    
    public interface a
    {
        r a(final Class p0);
    }
}
