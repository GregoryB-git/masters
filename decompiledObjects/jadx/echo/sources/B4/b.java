package B4;

import B4.a;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class b implements a.b {

    /* renamed from: o, reason: collision with root package name */
    public final a f827o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f829q = false;

    /* renamed from: r, reason: collision with root package name */
    public N4.d f830r = N4.d.APPLICATION_PROCESS_STATE_UNKNOWN;

    /* renamed from: p, reason: collision with root package name */
    public final WeakReference f828p = new WeakReference(this);

    public b(a aVar) {
        this.f827o = aVar;
    }

    @Override // B4.a.b
    public void b(N4.d dVar) {
        N4.d dVar2 = this.f830r;
        N4.d dVar3 = N4.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (dVar2 != dVar3) {
            if (dVar2 == dVar || dVar == dVar3) {
                return;
            } else {
                dVar = N4.d.FOREGROUND_BACKGROUND;
            }
        }
        this.f830r = dVar;
    }

    public N4.d c() {
        return this.f830r;
    }

    public void d(int i7) {
        this.f827o.e(i7);
    }

    public void e() {
        if (this.f829q) {
            return;
        }
        this.f830r = this.f827o.a();
        this.f827o.j(this.f828p);
        this.f829q = true;
    }

    public void f() {
        if (this.f829q) {
            this.f827o.o(this.f828p);
            this.f829q = false;
        }
    }
}
