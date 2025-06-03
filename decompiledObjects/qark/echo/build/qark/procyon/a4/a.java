// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import V3.k;
import d4.b;
import d4.n;
import d4.i;

public class a
{
    public final i a;
    public final boolean b;
    public final boolean c;
    
    public a(final i a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public i a() {
        return this.a;
    }
    
    public n b() {
        return this.a.k();
    }
    
    public boolean c(final b b) {
        return (this.f() && !this.c) || this.a.k().Q(b);
    }
    
    public boolean d(final k k) {
        if (k.isEmpty()) {
            return this.f() && !this.c;
        }
        return this.c(k.Z());
    }
    
    public boolean e() {
        return this.c;
    }
    
    public boolean f() {
        return this.b;
    }
}
