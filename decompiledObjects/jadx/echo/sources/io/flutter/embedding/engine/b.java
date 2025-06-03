package io.flutter.embedding.engine;

import android.content.Context;
import io.flutter.embedding.engine.a;
import io.flutter.plugin.platform.r;
import java.util.ArrayList;
import java.util.List;
import t5.C1994a;
import w5.C2105a;
import y5.f;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f14917a = new ArrayList();

    public class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ io.flutter.embedding.engine.a f14918a;

        public a(io.flutter.embedding.engine.a aVar) {
            this.f14918a = aVar;
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            b.this.f14917a.remove(this.f14918a);
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    /* renamed from: io.flutter.embedding.engine.b$b, reason: collision with other inner class name */
    public static class C0219b {

        /* renamed from: a, reason: collision with root package name */
        public Context f14920a;

        /* renamed from: b, reason: collision with root package name */
        public C2105a.c f14921b;

        /* renamed from: c, reason: collision with root package name */
        public String f14922c;

        /* renamed from: d, reason: collision with root package name */
        public List f14923d;

        /* renamed from: e, reason: collision with root package name */
        public r f14924e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f14925f = true;

        /* renamed from: g, reason: collision with root package name */
        public boolean f14926g = false;

        public C0219b(Context context) {
            this.f14920a = context;
        }

        public boolean a() {
            return this.f14925f;
        }

        public Context b() {
            return this.f14920a;
        }

        public C2105a.c c() {
            return this.f14921b;
        }

        public List d() {
            return this.f14923d;
        }

        public String e() {
            return this.f14922c;
        }

        public r f() {
            return this.f14924e;
        }

        public boolean g() {
            return this.f14926g;
        }

        public C0219b h(boolean z7) {
            this.f14925f = z7;
            return this;
        }

        public C0219b i(C2105a.c cVar) {
            this.f14921b = cVar;
            return this;
        }

        public C0219b j(List list) {
            this.f14923d = list;
            return this;
        }

        public C0219b k(String str) {
            this.f14922c = str;
            return this;
        }

        public C0219b l(boolean z7) {
            this.f14926g = z7;
            return this;
        }
    }

    public b(Context context, String[] strArr) {
        f c7 = C1994a.e().c();
        if (c7.l()) {
            return;
        }
        c7.p(context.getApplicationContext());
        c7.h(context.getApplicationContext(), strArr);
    }

    public io.flutter.embedding.engine.a a(C0219b c0219b) {
        io.flutter.embedding.engine.a A7;
        Context b7 = c0219b.b();
        C2105a.c c7 = c0219b.c();
        String e7 = c0219b.e();
        List d7 = c0219b.d();
        r f7 = c0219b.f();
        if (f7 == null) {
            f7 = new r();
        }
        r rVar = f7;
        boolean a7 = c0219b.a();
        boolean g7 = c0219b.g();
        C2105a.c a8 = c7 == null ? C2105a.c.a() : c7;
        if (this.f14917a.size() == 0) {
            A7 = b(b7, rVar, a7, g7);
            if (e7 != null) {
                A7.o().c(e7);
            }
            A7.k().k(a8, d7);
        } else {
            A7 = ((io.flutter.embedding.engine.a) this.f14917a.get(0)).A(b7, a8, e7, d7, rVar, a7, g7);
        }
        this.f14917a.add(A7);
        A7.e(new a(A7));
        return A7;
    }

    public io.flutter.embedding.engine.a b(Context context, r rVar, boolean z7, boolean z8) {
        return new io.flutter.embedding.engine.a(context, null, null, rVar, null, z7, z8, this);
    }
}
