// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import kotlin.jvm.internal.Intrinsics;

public final class E
{
    public int a;
    public D b;
    
    public E() {
        this.b = D.o;
    }
    
    public final int a() {
        return this.a;
    }
    
    public final D b() {
        return this.b;
    }
    
    public final void c(final int a) {
        this.a = a;
    }
    
    public final void d(final D b) {
        Intrinsics.checkNotNullParameter(b, "<set-?>");
        this.b = b;
    }
}
