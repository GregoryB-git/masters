package com.google.firebase.firestore;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ h lambda$getComponents$0(d8.c cVar) {
        return new h((Context) cVar.get(Context.class), (u7.f) cVar.get(u7.f.class), cVar.f(c8.b.class), cVar.f(a8.a.class), new m9.l(cVar.b(ca.f.class), cVar.b(q9.f.class), (u7.j) cVar.get(u7.j.class)));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(h.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(d8.k.d(u7.f.class));
        b10.a(d8.k.d(Context.class));
        b10.a(d8.k.b(q9.f.class));
        b10.a(d8.k.b(ca.f.class));
        b10.a(d8.k.a(c8.b.class));
        b10.a(d8.k.a(a8.a.class));
        b10.a(new d8.k(0, 0, u7.j.class));
        b10.f = new e0.d(1);
        return Arrays.asList(b10.b(), ca.e.a(LIBRARY_NAME, "25.1.2"));
    }
}
