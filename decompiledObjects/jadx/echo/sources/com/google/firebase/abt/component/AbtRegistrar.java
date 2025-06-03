package com.google.firebase.abt.component;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import u3.C2008a;
import w3.InterfaceC2100a;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2008a lambda$getComponents$0(InterfaceC0344e interfaceC0344e) {
        return new C2008a((Context) interfaceC0344e.a(Context.class), interfaceC0344e.g(InterfaceC2100a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(C2008a.class).h(LIBRARY_NAME).b(r.k(Context.class)).b(r.i(InterfaceC2100a.class)).f(new h() { // from class: u3.b
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                C2008a lambda$getComponents$0;
                lambda$getComponents$0 = AbtRegistrar.lambda$getComponents$0(interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).d(), O4.h.b(LIBRARY_NAME, "21.1.1"));
    }
}
