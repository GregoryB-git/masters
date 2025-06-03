package com.google.firebase.datatransport;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import android.content.Context;
import androidx.annotation.Keep;
import c2.g;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import d2.C1205a;
import f2.u;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(InterfaceC0344e interfaceC0344e) {
        u.f((Context) interfaceC0344e.a(Context.class));
        return u.c().g(C1205a.f13122h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(g.class).h(LIBRARY_NAME).b(r.k(Context.class)).f(new h() { // from class: g4.a
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).d(), O4.h.b(LIBRARY_NAME, "18.1.8"));
    }
}
