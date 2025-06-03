package b5;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1869a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1870b;

    public /* synthetic */ g() {
        this.f1870b = v5.c.f15872a;
    }

    public final synchronized boolean a() {
        if (this.f1869a) {
            return false;
        }
        this.f1869a = true;
        notifyAll();
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i10) {
        this();
        if (i10 != 1) {
            return;
        }
    }
}
