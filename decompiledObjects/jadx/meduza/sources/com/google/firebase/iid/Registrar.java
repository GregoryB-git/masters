package com.google.firebase.iid;

import aa.l;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import b.a0;
import b.z;
import b1.v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import d8.b;
import d8.c;
import d8.k;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import l3.j;
import p2.m0;
import r9.e;
import r9.h;
import u7.f;
import u9.d;

/* loaded from: classes.dex */
public final class Registrar implements ComponentRegistrar {

    public static class a implements s9.a {

        /* renamed from: a, reason: collision with root package name */
        public final FirebaseInstanceId f3213a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f3213a = firebaseInstanceId;
        }

        @Override // s9.a
        public final String a() {
            return this.f3213a.h();
        }

        @Override // s9.a
        public final void b(String str) {
            FirebaseInstanceId firebaseInstanceId = this.f3213a;
            FirebaseInstanceId.d(firebaseInstanceId.f3207b);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String f = firebaseInstanceId.f();
            e eVar = firebaseInstanceId.f3209d;
            eVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("delete", "1");
            firebaseInstanceId.a(eVar.a(bundle, f, str, "*").continueWith(r9.a.f13813a, new v(eVar)));
            com.google.firebase.iid.a aVar = FirebaseInstanceId.f3203j;
            String g10 = firebaseInstanceId.g();
            synchronized (aVar) {
                String b10 = com.google.firebase.iid.a.b(g10, str, "*");
                SharedPreferences.Editor edit = aVar.f3214a.edit();
                edit.remove(b10);
                edit.commit();
            }
        }

        @Override // s9.a
        public final void c(l lVar) {
            this.f3213a.f3212h.add(lVar);
        }

        @Override // s9.a
        public final Task<String> d() {
            String h10 = this.f3213a.h();
            if (h10 != null) {
                return Tasks.forResult(h10);
            }
            FirebaseInstanceId firebaseInstanceId = this.f3213a;
            FirebaseInstanceId.d(firebaseInstanceId.f3207b);
            return Tasks.forResult(null).continueWithTask(firebaseInstanceId.f3206a, new j(firebaseInstanceId, h.a(firebaseInstanceId.f3207b), "*")).continueWith(m0.A);
        }
    }

    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(c cVar) {
        return new FirebaseInstanceId((f) cVar.get(f.class), cVar.b(ca.f.class), cVar.b(q9.f.class), (d) cVar.get(d.class));
    }

    public static final /* synthetic */ s9.a lambda$getComponents$1$Registrar(c cVar) {
        return new a((FirebaseInstanceId) cVar.get(FirebaseInstanceId.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<d8.b<?>> getComponents() {
        b.a b10 = d8.b.b(FirebaseInstanceId.class);
        b10.a(k.d(f.class));
        b10.a(k.b(ca.f.class));
        b10.a(k.b(q9.f.class));
        b10.a(k.d(d.class));
        b10.f = z.f1661o;
        b10.c(1);
        d8.b b11 = b10.b();
        b.a b12 = d8.b.b(s9.a.class);
        b12.a(k.d(FirebaseInstanceId.class));
        b12.f = a0.V;
        return Arrays.asList(b11, b12.b(), ca.e.a("fire-iid", "21.1.0"));
    }
}
