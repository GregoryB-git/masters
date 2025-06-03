package com.google.firebase.installations;

import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import B3.r;
import C3.z;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import o4.AbstractC1763h;
import o4.InterfaceC1764i;
import s3.C1947e;
import s4.h;
import s4.i;
import y3.InterfaceC2271a;
import y3.InterfaceC2272b;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(InterfaceC0344e interfaceC0344e) {
        return new h((C1947e) interfaceC0344e.a(C1947e.class), interfaceC0344e.g(InterfaceC1764i.class), (ExecutorService) interfaceC0344e.h(F.a(InterfaceC2271a.class, ExecutorService.class)), z.b((Executor) interfaceC0344e.h(F.a(InterfaceC2272b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(i.class).h(LIBRARY_NAME).b(r.k(C1947e.class)).b(r.i(InterfaceC1764i.class)).b(r.j(F.a(InterfaceC2271a.class, ExecutorService.class))).b(r.j(F.a(InterfaceC2272b.class, Executor.class))).f(new B3.h() { // from class: s4.k
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                i lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).d(), AbstractC1763h.a(), O4.h.b(LIBRARY_NAME, "17.2.0"));
    }
}
