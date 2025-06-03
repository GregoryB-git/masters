package com.google.firebase.database;

import A3.a;
import B3.C0342c;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import Q3.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.database.DatabaseRegistrar;
import java.util.Arrays;
import java.util.List;
import s3.C1947e;
import z3.InterfaceC2323a;

@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(InterfaceC0344e interfaceC0344e) {
        return new i((C1947e) interfaceC0344e.a(C1947e.class), interfaceC0344e.i(a.class), interfaceC0344e.i(InterfaceC2323a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(i.class).h(LIBRARY_NAME).b(r.k(C1947e.class)).b(r.a(a.class)).b(r.a(InterfaceC2323a.class)).f(new h() { // from class: Q3.f
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                i lambda$getComponents$0;
                lambda$getComponents$0 = DatabaseRegistrar.lambda$getComponents$0(interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).d(), O4.h.b(LIBRARY_NAME, "20.3.0"));
    }
}
