package c1;

import F0.AbstractC0372q;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.L;
import c1.t;
import java.util.List;

/* loaded from: classes.dex */
public class u implements F0.r {

    /* renamed from: a, reason: collision with root package name */
    public final F0.r f10050a;

    /* renamed from: b, reason: collision with root package name */
    public final t.a f10051b;

    /* renamed from: c, reason: collision with root package name */
    public v f10052c;

    public u(F0.r rVar, t.a aVar) {
        this.f10050a = rVar;
        this.f10051b = aVar;
    }

    @Override // F0.r
    public void a(long j7, long j8) {
        v vVar = this.f10052c;
        if (vVar != null) {
            vVar.b();
        }
        this.f10050a.a(j7, j8);
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        v vVar = new v(interfaceC0374t, this.f10051b);
        this.f10052c = vVar;
        this.f10050a.b(vVar);
    }

    @Override // F0.r
    public F0.r d() {
        return this.f10050a;
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        return this.f10050a.e(interfaceC0373s);
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    @Override // F0.r
    public int i(InterfaceC0373s interfaceC0373s, L l7) {
        return this.f10050a.i(interfaceC0373s, l7);
    }

    @Override // F0.r
    public void release() {
        this.f10050a.release();
    }
}
