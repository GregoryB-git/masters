package e7;

import java.util.Objects;

/* loaded from: classes.dex */
public final class v3 extends v {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k3 f4713e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(k3 k3Var, j2 j2Var) {
        super(j2Var);
        this.f4713e = k3Var;
    }

    @Override // e7.v
    public final void c() {
        k3 o10 = this.f4713e.o();
        Objects.requireNonNull(o10);
        new Thread(new r3(o10, 1)).start();
    }
}
