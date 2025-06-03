package O4;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.r;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final d f4016b;

    public c(Set set, d dVar) {
        this.f4015a = e(set);
        this.f4016b = dVar;
    }

    public static C0342c c() {
        return C0342c.e(i.class).b(r.n(f.class)).f(new B3.h() { // from class: O4.b
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                i d7;
                d7 = c.d(interfaceC0344e);
                return d7;
            }
        }).d();
    }

    public static /* synthetic */ i d(InterfaceC0344e interfaceC0344e) {
        return new c(interfaceC0344e.c(f.class), d.a());
    }

    public static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // O4.i
    public String a() {
        if (this.f4016b.b().isEmpty()) {
            return this.f4015a;
        }
        return this.f4015a + ' ' + e(this.f4016b.b());
    }
}
