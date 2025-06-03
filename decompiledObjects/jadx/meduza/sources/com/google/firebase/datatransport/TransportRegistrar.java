package com.google.firebase.datatransport;

import android.content.Context;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.k;
import d8.t;
import d9.p;
import d9.q;
import d9.r;
import h3.i;
import i3.a;
import java.util.Arrays;
import java.util.List;
import k3.w;

/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(c cVar) {
        w.b((Context) cVar.get(Context.class));
        return w.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(c cVar) {
        w.b((Context) cVar.get(Context.class));
        return w.a().c(a.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(c cVar) {
        w.b((Context) cVar.get(Context.class));
        return w.a().c(a.f7402e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b<?>> getComponents() {
        b.a b10 = b.b(i.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(k.d(Context.class));
        int i10 = 1;
        b10.f = new p(i10);
        b.a a10 = b.a(new t(u8.a.class, i.class));
        a10.a(k.d(Context.class));
        a10.f = new q(i10);
        b.a a11 = b.a(new t(u8.b.class, i.class));
        a11.a(k.d(Context.class));
        a11.f = new r(i10);
        return Arrays.asList(b10.b(), a10.b(), a11.b(), e.a(LIBRARY_NAME, "19.0.0"));
    }
}
