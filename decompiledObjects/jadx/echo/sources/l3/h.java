package l3;

import c3.AbstractC0846x;
import c3.C0844v;
import c3.InterfaceC0845w;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h implements InterfaceC0845w {

    /* renamed from: a, reason: collision with root package name */
    public static final h f17186a = new h();

    public static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final C0844v f17187a;

        public b(C0844v c0844v) {
            this.f17187a = c0844v;
        }
    }

    public static void d() {
        AbstractC0846x.n(f17186a);
    }

    @Override // c3.InterfaceC0845w
    public Class a() {
        return g.class;
    }

    @Override // c3.InterfaceC0845w
    public Class c() {
        return g.class;
    }

    @Override // c3.InterfaceC0845w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g b(C0844v c0844v) {
        if (c0844v == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (c0844v.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = c0844v.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(c0844v);
    }
}
