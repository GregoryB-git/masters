package com.google.firebase.iid;

import B3.C0342c;
import B3.InterfaceC0344e;
import B3.r;
import O4.h;
import O4.i;
import V2.AbstractC0659j;
import V2.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o4.j;
import p4.C1823o;
import p4.C1824p;
import p4.C1825q;
import q4.InterfaceC1904a;
import s3.C1947e;

@Keep
/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    public static class a implements InterfaceC1904a {

        /* renamed from: a, reason: collision with root package name */
        public final FirebaseInstanceId f11589a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f11589a = firebaseInstanceId;
        }

        @Override // q4.InterfaceC1904a
        public String a() {
            return this.f11589a.n();
        }

        @Override // q4.InterfaceC1904a
        public AbstractC0659j b() {
            String n7 = this.f11589a.n();
            return n7 != null ? m.e(n7) : this.f11589a.j().f(C1825q.f18462a);
        }

        @Override // q4.InterfaceC1904a
        public void c(String str, String str2) {
            this.f11589a.f(str, str2);
        }

        @Override // q4.InterfaceC1904a
        public void d(InterfaceC1904a.InterfaceC0255a interfaceC0255a) {
            this.f11589a.a(interfaceC0255a);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(InterfaceC0344e interfaceC0344e) {
        return new FirebaseInstanceId((C1947e) interfaceC0344e.a(C1947e.class), interfaceC0344e.g(i.class), interfaceC0344e.g(j.class), (s4.i) interfaceC0344e.a(s4.i.class));
    }

    public static final /* synthetic */ InterfaceC1904a lambda$getComponents$1$Registrar(InterfaceC0344e interfaceC0344e) {
        return new a((FirebaseInstanceId) interfaceC0344e.a(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<C0342c> getComponents() {
        return Arrays.asList(C0342c.e(FirebaseInstanceId.class).b(r.k(C1947e.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.k(s4.i.class)).f(C1823o.f18460a).c().d(), C0342c.e(InterfaceC1904a.class).b(r.k(FirebaseInstanceId.class)).f(C1824p.f18461a).d(), h.b("fire-iid", "21.1.0"));
    }
}
