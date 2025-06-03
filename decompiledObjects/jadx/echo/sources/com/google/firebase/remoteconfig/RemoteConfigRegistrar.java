package com.google.firebase.remoteconfig;

import B3.C0342c;
import B3.F;
import B3.InterfaceC0344e;
import B3.h;
import B3.r;
import P4.x;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import s3.C1947e;
import s4.i;
import u3.C2008a;
import w3.InterfaceC2100a;
import y3.InterfaceC2272b;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x lambda$getComponents$0(F f7, InterfaceC0344e interfaceC0344e) {
        return new x((Context) interfaceC0344e.a(Context.class), (ScheduledExecutorService) interfaceC0344e.h(f7), (C1947e) interfaceC0344e.a(C1947e.class), (i) interfaceC0344e.a(i.class), ((C2008a) interfaceC0344e.a(C2008a.class)).b("frc"), interfaceC0344e.g(InterfaceC2100a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0342c> getComponents() {
        final F a7 = F.a(InterfaceC2272b.class, ScheduledExecutorService.class);
        return Arrays.asList(C0342c.e(x.class).h(LIBRARY_NAME).b(r.k(Context.class)).b(r.j(a7)).b(r.k(C1947e.class)).b(r.k(i.class)).b(r.k(C2008a.class)).b(r.i(InterfaceC2100a.class)).f(new h() { // from class: P4.y
            @Override // B3.h
            public final Object a(InterfaceC0344e interfaceC0344e) {
                x lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(F.this, interfaceC0344e);
                return lambda$getComponents$0;
            }
        }).e().d(), O4.h.b(LIBRARY_NAME, "21.5.0"));
    }
}
