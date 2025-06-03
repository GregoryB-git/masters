// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.os.BaseBundle;
import android.os.Bundle;
import y2.a;

public class u implements d
{
    public static final u b;
    public final String a = a;
    
    static {
        b = a().a();
    }
    
    public static a a() {
        return new a(null);
    }
    
    public final Bundle b() {
        final Bundle bundle = new Bundle();
        final String a = this.a;
        if (a != null) {
            ((BaseBundle)bundle).putString("api", a);
        }
        return bundle;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof u && m.a(this.a, ((u)o).a));
    }
    
    @Override
    public final int hashCode() {
        return m.b(this.a);
    }
    
    public static class a
    {
        public String a;
        
        public u a() {
            return new u(this.a, null);
        }
    }
}
