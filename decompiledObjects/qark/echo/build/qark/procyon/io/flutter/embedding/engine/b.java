// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.embedding.engine;

import io.flutter.plugin.platform.r;
import y5.f;
import t5.a;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;

public class b
{
    public final List a;
    
    public b(final Context context, final String[] array) {
        this.a = new ArrayList();
        final f c = t5.a.e().c();
        if (!c.l()) {
            c.p(context.getApplicationContext());
            c.h(context.getApplicationContext(), array);
        }
    }
    
    public io.flutter.embedding.engine.a a(final b b) {
        final Context b2 = b.b();
        final w5.a.c c = b.c();
        final String e = b.e();
        final List d = b.d();
        r f = b.f();
        if (f == null) {
            f = new r();
        }
        final boolean a = b.a();
        final boolean g = b.g();
        Object a2;
        if (c == null) {
            a2 = w5.a.c.a();
        }
        else {
            a2 = c;
        }
        io.flutter.embedding.engine.a a3;
        if (this.a.size() == 0) {
            final io.flutter.embedding.engine.a b3 = this.b(b2, f, a, g);
            if (e != null) {
                b3.o().c(e);
            }
            b3.k().k((w5.a.c)a2, d);
            a3 = b3;
        }
        else {
            a3 = this.a.get(0).A(b2, (w5.a.c)a2, e, d, f, a, g);
        }
        this.a.add(a3);
        a3.e((io.flutter.embedding.engine.a.b)new io.flutter.embedding.engine.a.b() {
            @Override
            public void a() {
                io.flutter.embedding.engine.b.this.a.remove(a3);
            }
            
            @Override
            public void b() {
            }
        });
        return a3;
    }
    
    public io.flutter.embedding.engine.a b(final Context context, final r r, final boolean b, final boolean b2) {
        return new io.flutter.embedding.engine.a(context, null, null, r, null, b, b2, this);
    }
    
    public static class b
    {
        public Context a;
        public w5.a.c b;
        public String c;
        public List d;
        public r e;
        public boolean f;
        public boolean g;
        
        public b(final Context a) {
            this.f = true;
            this.g = false;
            this.a = a;
        }
        
        public boolean a() {
            return this.f;
        }
        
        public Context b() {
            return this.a;
        }
        
        public w5.a.c c() {
            return this.b;
        }
        
        public List d() {
            return this.d;
        }
        
        public String e() {
            return this.c;
        }
        
        public r f() {
            return this.e;
        }
        
        public boolean g() {
            return this.g;
        }
        
        public b h(final boolean f) {
            this.f = f;
            return this;
        }
        
        public b i(final w5.a.c b) {
            this.b = b;
            return this;
        }
        
        public b j(final List d) {
            this.d = d;
            return this;
        }
        
        public b k(final String c) {
            this.c = c;
            return this;
        }
        
        public b l(final boolean g) {
            this.g = g;
            return this;
        }
    }
}
