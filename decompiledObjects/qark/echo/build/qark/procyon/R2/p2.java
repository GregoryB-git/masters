// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.content.SharedPreferences$Editor;
import android.util.Pair;
import A2.n;

public final class p2
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ l2 e;
    
    public p2(final l2 e, final String str, final long d) {
        this.e = e;
        n.e(str);
        n.a(d > 0L);
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":start");
        this.a = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(":count");
        this.b = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(":value");
        this.c = sb3.toString();
        this.d = d;
    }
    
    public final Pair a() {
        this.e.n();
        this.e.n();
        final long c = this.c();
        long abs;
        if (c == 0L) {
            this.d();
            abs = 0L;
        }
        else {
            abs = Math.abs(c - this.e.b().a());
        }
        final long d = this.d;
        if (abs < d) {
            return null;
        }
        if (abs > d << 1) {
            this.d();
            return null;
        }
        final String string = this.e.F().getString(this.c, (String)null);
        final long long1 = this.e.F().getLong(this.b, 0L);
        this.d();
        if (string != null && long1 > 0L) {
            return new Pair((Object)string, (Object)long1);
        }
        return l2.z;
    }
    
    public final void b(final String s, long nextLong) {
        this.e.n();
        if (this.c() == 0L) {
            this.d();
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "";
        }
        final long long1 = this.e.F().getLong(this.b, 0L);
        if (long1 <= 0L) {
            final SharedPreferences$Editor edit = this.e.F().edit();
            edit.putString(this.c, s2);
            edit.putLong(this.b, 1L);
            edit.apply();
            return;
        }
        nextLong = this.e.k().U0().nextLong();
        final long n = long1 + 1L;
        final boolean b = (nextLong & Long.MAX_VALUE) < Long.MAX_VALUE / n;
        final SharedPreferences$Editor edit2 = this.e.F().edit();
        if (b) {
            edit2.putString(this.c, s2);
        }
        edit2.putLong(this.b, n);
        edit2.apply();
    }
    
    public final long c() {
        return this.e.F().getLong(this.a, 0L);
    }
    
    public final void d() {
        this.e.n();
        final long a = this.e.b().a();
        final SharedPreferences$Editor edit = this.e.F().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, a);
        edit.apply();
    }
}
