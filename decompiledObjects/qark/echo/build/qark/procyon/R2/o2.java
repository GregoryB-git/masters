// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.SharedPreferences$Editor;
import A2.n;

public final class o2
{
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ l2 e;
    
    public o2(final l2 e, final String a, final boolean b) {
        this.e = e;
        n.e(a);
        this.a = a;
        this.b = b;
    }
    
    public final void a(final boolean d) {
        final SharedPreferences$Editor edit = this.e.F().edit();
        edit.putBoolean(this.a, d);
        edit.apply();
        this.d = d;
    }
    
    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
