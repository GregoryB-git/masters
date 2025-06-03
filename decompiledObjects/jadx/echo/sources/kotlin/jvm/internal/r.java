package kotlin.jvm.internal;

/* loaded from: classes.dex */
public abstract class r extends c implements m6.h {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f16227o;

    public r(Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.f16227o = (i7 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m6.h getReflected() {
        if (this.f16227o) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (m6.h) super.getReflected();
    }

    @Override // kotlin.jvm.internal.c
    public m6.b compute() {
        return this.f16227o ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            return getOwner().equals(rVar.getOwner()) && getName().equals(rVar.getName()) && getSignature().equals(rVar.getSignature()) && Intrinsics.a(getBoundReceiver(), rVar.getBoundReceiver());
        }
        if (obj instanceof m6.h) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        m6.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
