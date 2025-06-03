package ic;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: d, reason: collision with root package name */
    public static final f f7961d = new f(1, 0);

    public f(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // ic.d
    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (this.f7954a != fVar.f7954a || this.f7955b != fVar.f7955b) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // ic.d
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f7954a * 31) + this.f7955b;
    }

    @Override // ic.d
    public final boolean isEmpty() {
        return this.f7954a > this.f7955b;
    }

    @Override // ic.d
    public final String toString() {
        return this.f7954a + ".." + this.f7955b;
    }
}
