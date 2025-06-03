package com.google.firebase.functions;

import android.content.Context;
import b1.v;
import ca.e;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.t;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k3.y;
import o9.h;
import o9.i;
import o9.k;
import o9.l;
import p3.f;
import t9.b;
import u7.j;
import y7.d;

/* loaded from: classes.dex */
public final class FunctionsRegistrar implements ComponentRegistrar {
    private static final a Companion = new a();
    private static final String LIBRARY_NAME = "fire-fn";

    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i getComponents$lambda$0(t tVar, t tVar2, c cVar) {
        ec.i.e(tVar, "$liteExecutor");
        ec.i.e(tVar2, "$uiExecutor");
        ec.i.e(cVar, "c");
        Object obj = cVar.get(Context.class);
        ec.i.d(obj, "c.get(Context::class.java)");
        Object obj2 = cVar.get(j.class);
        ec.i.d(obj2, "c.get(FirebaseOptions::class.java)");
        Object e10 = cVar.e(tVar);
        ec.i.d(e10, "c.get(liteExecutor)");
        Object e11 = cVar.e(tVar2);
        ec.i.d(e11, "c.get(uiExecutor)");
        b b10 = cVar.b(c8.b.class);
        ec.i.d(b10, "c.getProvider(InternalAuthProvider::class.java)");
        b b11 = cVar.b(s9.a.class);
        ec.i.d(b11, "c.getProvider(FirebaseIn…ceIdInternal::class.java)");
        t9.a f = cVar.f(a8.a.class);
        ec.i.d(f, "c.getDeferred(InteropApp…okenProvider::class.java)");
        v f10 = v.f((Context) obj);
        h hVar = new h(v.f((j) obj2));
        v f11 = v.f(b10);
        v f12 = v.f(b11);
        v f13 = v.f(f);
        v f14 = v.f((Executor) e10);
        return (i) p9.a.a(new o9.j(v.f(new k(new y(f10, hVar, p9.a.a(new f(f11, f12, f13, f14, 1)), f14, v.f((Executor) e11), 2))))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        t tVar = new t(y7.c.class, Executor.class);
        t tVar2 = new t(d.class, Executor.class);
        b.a b10 = d8.b.b(i.class);
        b10.f3588a = LIBRARY_NAME;
        b10.a(d8.k.d(Context.class));
        b10.a(d8.k.d(j.class));
        b10.a(d8.k.b(c8.b.class));
        b10.a(new d8.k(1, 1, s9.a.class));
        b10.a(d8.k.a(a8.a.class));
        b10.a(new d8.k((t<?>) tVar, 1, 0));
        b10.a(new d8.k((t<?>) tVar2, 1, 0));
        b10.f = new l(0, tVar, tVar2);
        List<d8.b<?>> asList = Arrays.asList(b10.b(), e.a(LIBRARY_NAME, "21.1.0"));
        ec.i.d(asList, "asList(\n      Component.…onfig.VERSION_NAME)\n    )");
        return asList;
    }
}
