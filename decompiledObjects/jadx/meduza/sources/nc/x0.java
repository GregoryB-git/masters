package nc;

/* loaded from: classes.dex */
public abstract class x0 extends a0 {
    public static final /* synthetic */ int f = 0;

    /* renamed from: c, reason: collision with root package name */
    public long f11562c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11563d;

    /* renamed from: e, reason: collision with root package name */
    public sb.i<p0<?>> f11564e;

    public final void C0(boolean z10) {
        long j10 = this.f11562c - (z10 ? 4294967296L : 1L);
        this.f11562c = j10;
        if (j10 <= 0 && this.f11563d) {
            shutdown();
        }
    }

    public final void D0(p0<?> p0Var) {
        sb.i<p0<?>> iVar = this.f11564e;
        if (iVar == null) {
            iVar = new sb.i<>();
            this.f11564e = iVar;
        }
        iVar.addLast(p0Var);
    }

    public final void E0(boolean z10) {
        this.f11562c = (z10 ? 4294967296L : 1L) + this.f11562c;
        if (z10) {
            return;
        }
        this.f11563d = true;
    }

    public final boolean F0() {
        return this.f11562c >= 4294967296L;
    }

    public long G0() {
        return !H0() ? Long.MAX_VALUE : 0L;
    }

    public final boolean H0() {
        sb.i<p0<?>> iVar = this.f11564e;
        if (iVar == null) {
            return false;
        }
        p0<?> removeFirst = iVar.isEmpty() ? null : iVar.removeFirst();
        if (removeFirst == null) {
            return false;
        }
        removeFirst.run();
        return true;
    }

    public void shutdown() {
    }
}
