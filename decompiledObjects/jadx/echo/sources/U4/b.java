package U4;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b implements j {
    public static /* synthetic */ Object c(String str, C0342c c0342c, InterfaceC0344e interfaceC0344e) {
        try {
            c.b(str);
            return c0342c.h().a(interfaceC0344e);
        } finally {
            c.a();
        }
    }

    @Override // B3.j
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C0342c c0342c : componentRegistrar.getComponents()) {
            final String i7 = c0342c.i();
            if (i7 != null) {
                c0342c = c0342c.t(new h() { // from class: U4.a
                    @Override // B3.h
                    public final Object a(InterfaceC0344e interfaceC0344e) {
                        Object c7;
                        c7 = b.c(i7, c0342c, interfaceC0344e);
                        return c7;
                    }
                });
            }
            arrayList.add(c0342c);
        }
        return arrayList;
    }
}
