// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.SharedPreferences$Editor;
import A2.n;

public final class q2
{
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ l2 e;
    
    public q2(final l2 e, final String a, final long b) {
        this.e = e;
        n.e(a);
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getLong(this.a, this.b);
        }
        return this.d;
    }
    
    public final void b(final long d) {
        final SharedPreferences$Editor edit = this.e.F().edit();
        edit.putLong(this.a, d);
        edit.apply();
        this.d = d;
    }
}
