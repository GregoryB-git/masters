// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f0;

import android.os.BaseBundle;
import g0.a;
import android.os.Bundle;
import g0.M;

public final class e
{
    public static final String c;
    public static final String d;
    public final String a;
    public final int b;
    
    static {
        c = M.w0(0);
        d = M.w0(1);
    }
    
    public e(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public static e a(final Bundle bundle) {
        return new e((String)a.e(((BaseBundle)bundle).getString(e.c)), ((BaseBundle)bundle).getInt(e.d));
    }
    
    public Bundle b() {
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString(e.c, this.a);
        ((BaseBundle)bundle).putInt(e.d, this.b);
        return bundle;
    }
}
