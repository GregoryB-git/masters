package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class i extends c implements h, m6.e {
    private final int arity;
    private final int flags;

    public i(int i7, Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, (i8 & 1) == 1);
        this.arity = i7;
        this.flags = i8 >> 1;
    }

    @Override // kotlin.jvm.internal.c
    public m6.b computeReflected() {
        return v.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return getName().equals(iVar.getName()) && getSignature().equals(iVar.getSignature()) && this.flags == iVar.flags && this.arity == iVar.arity && Intrinsics.a(getBoundReceiver(), iVar.getBoundReceiver()) && Intrinsics.a(getOwner(), iVar.getOwner());
        }
        if (obj instanceof m6.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // m6.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // m6.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // m6.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // m6.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // m6.e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        m6.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.c
    public m6.e getReflected() {
        return (m6.e) super.getReflected();
    }
}
