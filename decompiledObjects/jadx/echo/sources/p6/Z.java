package p6;

/* loaded from: classes.dex */
public final class Z implements InterfaceC1859l0 {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f18518o;

    public Z(boolean z7) {
        this.f18518o = z7;
    }

    @Override // p6.InterfaceC1859l0
    public boolean a() {
        return this.f18518o;
    }

    @Override // p6.InterfaceC1859l0
    public C0 g() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(a() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
