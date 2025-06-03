// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.b;
import m6.h;

public abstract class r extends c implements h
{
    public final boolean o;
    
    public r(final Object o, final Class clazz, final String s, final String s2, final int n) {
        final boolean b = false;
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        boolean o2 = b;
        if ((n & 0x2) == 0x2) {
            o2 = true;
        }
        this.o = o2;
    }
    
    public h b() {
        if (!this.o) {
            return (h)super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }
    
    @Override
    public b compute() {
        if (this.o) {
            return this;
        }
        return super.compute();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof r) {
            final r r = (r)o;
            return this.getOwner().equals(r.getOwner()) && this.getName().equals(r.getName()) && this.getSignature().equals(r.getSignature()) && Intrinsics.a(this.getBoundReceiver(), r.getBoundReceiver());
        }
        return o instanceof h && o.equals(this.compute());
    }
    
    @Override
    public int hashCode() {
        return (this.getOwner().hashCode() * 31 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }
    
    @Override
    public String toString() {
        final b compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(this.getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
