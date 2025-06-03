// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.jvm.internal;

import m6.b;
import m6.e;

public abstract class i extends c implements h, e
{
    private final int arity;
    private final int flags;
    
    public i(final int arity, final Object o, final Class clazz, final String s, final String s2, final int n) {
        super(o, clazz, s, s2, (n & 0x1) == 0x1);
        this.arity = arity;
        this.flags = n >> 1;
    }
    
    @Override
    public b computeReflected() {
        return v.a(this);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof i) {
            final i i = (i)o;
            return this.getName().equals(i.getName()) && this.getSignature().equals(i.getSignature()) && this.flags == i.flags && this.arity == i.arity && Intrinsics.a(this.getBoundReceiver(), i.getBoundReceiver()) && Intrinsics.a(this.getOwner(), i.getOwner());
        }
        return o instanceof e && o.equals(this.compute());
    }
    
    @Override
    public int getArity() {
        return this.arity;
    }
    
    @Override
    public e getReflected() {
        return (e)super.getReflected();
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.getOwner() == null) {
            n = 0;
        }
        else {
            n = this.getOwner().hashCode() * 31;
        }
        return (n + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }
    
    @Override
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }
    
    @Override
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }
    
    @Override
    public boolean isInline() {
        return this.getReflected().isInline();
    }
    
    @Override
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }
    
    @Override
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }
    
    @Override
    public String toString() {
        final b compute = this.compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(this.getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("function ");
        sb.append(this.getName());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
