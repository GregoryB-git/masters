package com.google.firebase.dynamiclinks.internal;

import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.k;
import d9.p;
import java.util.Arrays;
import java.util.List;
import u7.f;

/* loaded from: classes.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v8.b lambda$getComponents$0(c cVar) {
        return new b((f) cVar.get(f.class), cVar.b(w7.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(v8.b.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(k.d(f.class));
        b10.a(k.b(w7.a.class));
        b10.f = new p(2);
        return Arrays.asList(b10.b(), e.a(LIBRARY_NAME, "22.1.0"));
    }
}
