package b4;

import Y3.m;
import a4.C0747c;
import a4.InterfaceC0749e;
import d4.C1227b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0799a {

    /* renamed from: a, reason: collision with root package name */
    public final Map f9970a = new HashMap();

    public List a() {
        return new ArrayList(this.f9970a.values());
    }

    public void b(C0747c c0747c) {
        Map map;
        InterfaceC0749e.a j7 = c0747c.j();
        C1227b i7 = c0747c.i();
        InterfaceC0749e.a aVar = InterfaceC0749e.a.CHILD_ADDED;
        m.g(j7 == aVar || j7 == InterfaceC0749e.a.CHILD_CHANGED || j7 == InterfaceC0749e.a.CHILD_REMOVED, "Only child changes supported for tracking");
        m.f(true ^ c0747c.i().s());
        if (this.f9970a.containsKey(i7)) {
            C0747c c0747c2 = (C0747c) this.f9970a.get(i7);
            InterfaceC0749e.a j8 = c0747c2.j();
            if (j7 == aVar && j8 == InterfaceC0749e.a.CHILD_REMOVED) {
                this.f9970a.put(c0747c.i(), C0747c.d(i7, c0747c.k(), c0747c2.k()));
                return;
            }
            InterfaceC0749e.a aVar2 = InterfaceC0749e.a.CHILD_REMOVED;
            if (j7 == aVar2 && j8 == aVar) {
                this.f9970a.remove(i7);
                return;
            }
            if (j7 == aVar2 && j8 == InterfaceC0749e.a.CHILD_CHANGED) {
                this.f9970a.put(i7, C0747c.g(i7, c0747c2.l()));
                return;
            }
            InterfaceC0749e.a aVar3 = InterfaceC0749e.a.CHILD_CHANGED;
            if (j7 == aVar3 && j8 == aVar) {
                map = this.f9970a;
                c0747c = C0747c.b(i7, c0747c.k());
            } else {
                if (j7 != aVar3 || j8 != aVar3) {
                    throw new IllegalStateException("Illegal combination of changes: " + c0747c + " occurred after " + c0747c2);
                }
                map = this.f9970a;
                c0747c = C0747c.d(i7, c0747c.k(), c0747c2.l());
            }
        } else {
            map = this.f9970a;
            i7 = c0747c.i();
        }
        map.put(i7, c0747c);
    }
}
