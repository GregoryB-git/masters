package ec;

/* loaded from: classes.dex */
public abstract class q extends b implements jc.h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5270a;

    public q() {
        this.f5270a = false;
    }

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f5270a = (i10 & 2) == 2;
    }

    @Override // ec.b
    public final jc.b compute() {
        return this.f5270a ? this : super.compute();
    }

    @Override // ec.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final jc.h getReflected() {
        if (this.f5270a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (jc.h) super.getReflected();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return getOwner().equals(qVar.getOwner()) && getName().equals(qVar.getName()) && getSignature().equals(qVar.getSignature()) && i.a(getBoundReceiver(), qVar.getBoundReceiver());
        }
        if (obj instanceof jc.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        jc.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder l10 = defpackage.f.l("property ");
        l10.append(getName());
        l10.append(" (Kotlin reflection is not available)");
        return l10.toString();
    }
}
