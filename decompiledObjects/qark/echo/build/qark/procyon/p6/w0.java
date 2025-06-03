// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import kotlin.jvm.internal.Intrinsics;

public abstract class w0 extends B implements X, l0
{
    public x0 r;
    
    @Override
    public boolean a() {
        return true;
    }
    
    @Override
    public void b() {
        this.w().u0(this);
    }
    
    @Override
    public C0 g() {
        return null;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(M.a(this));
        sb.append('@');
        sb.append(M.b(this));
        sb.append("[job@");
        sb.append(M.b(this.w()));
        sb.append(']');
        return sb.toString();
    }
    
    public final x0 w() {
        final x0 r = this.r;
        if (r != null) {
            return r;
        }
        Intrinsics.n("job");
        return null;
    }
    
    public final void x(final x0 r) {
        this.r = r;
    }
}
