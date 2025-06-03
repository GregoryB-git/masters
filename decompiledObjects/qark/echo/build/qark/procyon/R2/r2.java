// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.SharedPreferences$Editor;
import A2.n;

public final class r2
{
    public final String a;
    public final String b;
    public boolean c;
    public String d;
    public final /* synthetic */ l2 e;
    
    public r2(final l2 e, final String a, final String s) {
        this.e = e;
        n.e(a);
        this.a = a;
        this.b = null;
    }
    
    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getString(this.a, (String)null);
        }
        return this.d;
    }
    
    public final void b(final String d) {
        final SharedPreferences$Editor edit = this.e.F().edit();
        edit.putString(this.a, d);
        edit.apply();
        this.d = d;
    }
}
