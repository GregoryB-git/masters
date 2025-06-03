package i9;

import j9.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: a, reason: collision with root package name */
    public final a f7789a = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<String, HashSet<j9.o>> f7790a = new HashMap<>();

        public final boolean a(j9.o oVar) {
            x6.b.Z("Expected a collection path.", oVar.q() % 2 == 1, new Object[0]);
            String m10 = oVar.m();
            j9.o s10 = oVar.s();
            HashSet<j9.o> hashSet = this.f7790a.get(m10);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f7790a.put(m10, hashSet);
            }
            return hashSet.add(s10);
        }
    }

    @Override // i9.f
    public final void a(j9.k kVar) {
    }

    @Override // i9.f
    public final j9.b b(g9.k0 k0Var) {
        return k.a.f8689a;
    }

    @Override // i9.f
    public final void c(j9.k kVar) {
    }

    @Override // i9.f
    public final Collection<j9.k> d() {
        return Collections.emptyList();
    }

    @Override // i9.f
    public final String e() {
        return null;
    }

    @Override // i9.f
    public final List<j9.o> f(String str) {
        HashSet<j9.o> hashSet = this.f7789a.f7790a.get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
    }

    @Override // i9.f
    public final void g() {
    }

    @Override // i9.f
    public final void h(t8.c<j9.i, j9.g> cVar) {
    }

    @Override // i9.f
    public final j9.b i(String str) {
        return k.a.f8689a;
    }

    @Override // i9.f
    public final void j(j9.o oVar) {
        this.f7789a.a(oVar);
    }

    @Override // i9.f
    public final int k(g9.k0 k0Var) {
        return 1;
    }

    @Override // i9.f
    public final List<j9.i> l(g9.k0 k0Var) {
        return null;
    }

    @Override // i9.f
    public final void m(g9.k0 k0Var) {
    }

    @Override // i9.f
    public final void n(String str, j9.b bVar) {
    }

    @Override // i9.f
    public final void start() {
    }
}
