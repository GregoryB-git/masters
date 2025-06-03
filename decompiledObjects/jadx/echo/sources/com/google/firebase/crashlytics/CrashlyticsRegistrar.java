package com.google.firebase.crashlytics;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import D3.g;
import R4.l;
import S4.a;
import S4.b;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import s3.C1947e;
import s4.i;
import w3.InterfaceC2100a;

/* loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        a.f5888a.a(b.a.CRASHLYTICS);
    }

    public final g b(InterfaceC0344e interfaceC0344e) {
        return g.e((C1947e) interfaceC0344e.a(C1947e.class), (i) interfaceC0344e.a(i.class), (l) interfaceC0344e.a(l.class), interfaceC0344e.i(E3.a.class), interfaceC0344e.i(InterfaceC2100a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(C0342c.e(g.class).h("fire-cls").b(r.k(C1947e.class)).b(r.k(i.class)).b(r.k(l.class)).b(r.a(E3.a.class)).b(r.a(InterfaceC2100a.class)).f(new h() { // from class: D3.f
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                g b7;
                b7 = CrashlyticsRegistrar.this.b(interfaceC0344e);
                return b7;
            }
        }).e().d(), O4.h.b("fire-cls", "18.5.1"));
    }
}
