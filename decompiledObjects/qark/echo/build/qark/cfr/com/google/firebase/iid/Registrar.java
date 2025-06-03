/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.iid;

import B3.c;
import B3.h;
import B3.r;
import V2.b;
import V2.j;
import V2.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import p4.l;
import p4.o;
import p4.p;
import p4.q;
import q4.a;
import s3.e;
import s4.i;

@Keep
public final class Registrar
implements ComponentRegistrar {
    public static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(B3.e e8) {
        return new FirebaseInstanceId((e)e8.a(e.class), e8.g(O4.i.class), e8.g(o4.j.class), (i)e8.a(i.class));
    }

    public static final /* synthetic */ q4.a lambda$getComponents$1$Registrar(B3.e e8) {
        return new a((FirebaseInstanceId)e8.a(FirebaseInstanceId.class));
    }

    @Keep
    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(FirebaseInstanceId.class).b(r.k(e.class)).b(r.i(O4.i.class)).b(r.i(o4.j.class)).b(r.k(i.class)).f(o.a).c().d(), c.e(q4.a.class).b(r.k(FirebaseInstanceId.class)).f(p.a).d(), O4.h.b("fire-iid", "21.1.0")});
    }

    public static class a
    implements q4.a {
        public final FirebaseInstanceId a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.a = firebaseInstanceId;
        }

        public static final /* synthetic */ String e(j j8) {
            return ((l)j8.j()).a();
        }

        @Override
        public String a() {
            return this.a.n();
        }

        @Override
        public j b() {
            String string2 = this.a.n();
            if (string2 != null) {
                return m.e(string2);
            }
            return this.a.j().f(q.a);
        }

        @Override
        public void c(String string2, String string3) {
            this.a.f(string2, string3);
        }

        @Override
        public void d(a.a a8) {
            this.a.a(a8);
        }
    }

}

