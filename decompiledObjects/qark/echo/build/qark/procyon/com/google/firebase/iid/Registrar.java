// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.iid;

import p4.q;
import V2.m;
import p4.l;
import java.util.Arrays;
import O4.h;
import p4.p;
import p4.o;
import B3.r;
import B3.c;
import java.util.List;
import q4.a;
import o4.j;
import O4.i;
import B3.e;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;

@Keep
public final class Registrar implements ComponentRegistrar
{
    @Keep
    @Override
    public List<c> getComponents() {
        return Arrays.asList(c.e(FirebaseInstanceId.class).b(r.k(s3.e.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.k(s4.i.class)).f(o.a).c().d(), c.e(q4.a.class).b(r.k(FirebaseInstanceId.class)).f(p.a).d(), h.b("fire-iid", "21.1.0"));
    }
    
    public static class a implements q4.a
    {
        public final FirebaseInstanceId a;
        
        public a(final FirebaseInstanceId a) {
            this.a = a;
        }
        
        @Override
        public String a() {
            return this.a.n();
        }
        
        @Override
        public V2.j b() {
            final String n = this.a.n();
            if (n != null) {
                return m.e(n);
            }
            return this.a.j().f(q.a);
        }
        
        @Override
        public void c(final String s, final String s2) {
            this.a.f(s, s2);
        }
        
        @Override
        public void d(final q4.a.a a) {
            this.a.a(a);
        }
    }
}
