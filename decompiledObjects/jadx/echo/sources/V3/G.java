package V3;

import a4.C0745a;
import d4.C1227b;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public final k f6494a;

    /* renamed from: b, reason: collision with root package name */
    public final F f6495b;

    public G(k kVar, F f7) {
        this.f6494a = kVar;
        this.f6495b = f7;
    }

    public d4.n a(C1227b c1227b, C0745a c0745a) {
        return this.f6495b.c(this.f6494a, c1227b, c0745a);
    }

    public d4.n b(d4.n nVar) {
        return c(nVar, Collections.emptyList());
    }

    public d4.n c(d4.n nVar, List list) {
        return d(nVar, list, false);
    }

    public d4.n d(d4.n nVar, List list, boolean z7) {
        return this.f6495b.d(this.f6494a, nVar, list, z7);
    }

    public d4.n e(d4.n nVar) {
        return this.f6495b.e(this.f6494a, nVar);
    }

    public d4.n f(k kVar, d4.n nVar, d4.n nVar2) {
        return this.f6495b.f(this.f6494a, kVar, nVar, nVar2);
    }

    public d4.m g(d4.n nVar, d4.m mVar, boolean z7, d4.h hVar) {
        return this.f6495b.g(this.f6494a, nVar, mVar, z7, hVar);
    }

    public G h(C1227b c1227b) {
        return new G(this.f6494a.U(c1227b), this.f6495b);
    }

    public d4.n i(k kVar) {
        return this.f6495b.o(this.f6494a.T(kVar));
    }
}
