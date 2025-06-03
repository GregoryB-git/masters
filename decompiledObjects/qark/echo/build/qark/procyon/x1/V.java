// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import kotlin.jvm.internal.Intrinsics;
import android.os.Handler;

public final class V
{
    public final Handler a;
    public final F b;
    public final long c;
    public long d;
    public long e;
    public long f;
    
    public V(final Handler a, final F b) {
        Intrinsics.checkNotNullParameter(b, "request");
        this.a = a;
        this.b = b;
        this.c = B.A();
    }
    
    public final void a(long d) {
        d += this.d;
        this.d = d;
        if (d >= this.e + this.c || d >= this.f) {
            this.c();
        }
    }
    
    public final void b(final long n) {
        this.f += n;
    }
    
    public final void c() {
        if (this.d > this.e) {
            this.b.o();
        }
    }
}
