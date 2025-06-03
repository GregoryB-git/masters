package O4;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.r;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class h {

    public interface a {
        String a(Object obj);
    }

    public static C0342c b(String str, String str2) {
        return C0342c.l(f.a(str, str2), f.class);
    }

    public static C0342c c(final String str, final a aVar) {
        return C0342c.m(f.class).b(r.k(Context.class)).f(new B3.h() { // from class: O4.g
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                f d7;
                d7 = h.d(str, aVar, interfaceC0344e);
                return d7;
            }
        }).d();
    }

    public static /* synthetic */ f d(String str, a aVar, InterfaceC0344e interfaceC0344e) {
        return f.a(str, aVar.a((Context) interfaceC0344e.a(Context.class)));
    }
}
