// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f0;

import android.os.BaseBundle;
import android.os.Bundle;
import g0.M;

public final class g
{
    public static final String d;
    public static final String e;
    public static final String f;
    public int a;
    public int b;
    public final int c;
    
    static {
        d = M.w0(0);
        e = M.w0(1);
        f = M.w0(2);
    }
    
    public g(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static g a(final Bundle bundle) {
        return new g(((BaseBundle)bundle).getInt(g.d), ((BaseBundle)bundle).getInt(g.e), ((BaseBundle)bundle).getInt(g.f));
    }
    
    public Bundle b() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putInt(g.d, this.a);
        ((BaseBundle)bundle).putInt(g.e, this.b);
        ((BaseBundle)bundle).putInt(g.f, this.c);
        return bundle;
    }
}
