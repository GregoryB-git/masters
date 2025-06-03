package ec;

/* loaded from: classes.dex */
public class g extends b implements f, jc.e {
    private final int arity;
    private final int flags;

    public g(int i10) {
        this(i10, b.NO_RECEIVER, null, null, null, 0);
    }

    public g(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    public g(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }

    @Override // ec.b
    public jc.b computeReflected() {
        t.f5273a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver()) && i.a(getOwner(), gVar.getOwner());
        }
        if (obj instanceof jc.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // ec.f
    public int getArity() {
        return this.arity;
    }

    @Override // ec.b
    public jc.e getReflected() {
        return (jc.e) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // jc.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // jc.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // jc.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // jc.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // ec.b, jc.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        jc.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder l10 = defpackage.f.l("function ");
        l10.append(getName());
        l10.append(" (Kotlin reflection is not available)");
        return l10.toString();
    }
}
