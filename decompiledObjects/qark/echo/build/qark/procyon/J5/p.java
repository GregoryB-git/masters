// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J5;

import java.util.Map;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import android.util.Log;
import java.util.ArrayList;

public abstract class p
{
    public static ArrayList a(final Throwable t) {
        final ArrayList<String> list = new ArrayList<String>(3);
        list.add(t.toString());
        list.add(t.getClass().getSimpleName());
        final StringBuilder sb = new StringBuilder();
        sb.append("Cause: ");
        sb.append(t.getCause());
        sb.append(", Stacktrace: ");
        sb.append(Log.getStackTraceString(t));
        list.add(sb.toString());
        return list;
    }
    
    public interface a
    {
        void b(final String p0, final Boolean p1, final f p2);
        
        void d(final String p0, final f p1);
        
        void f(final String p0, final Boolean p1, final f p2);
    }
    
    public interface b
    {
        void a(final f p0);
        
        void c(final f p0);
        
        void e(final String p0, final d p1, final f p2);
    }
    
    public static class c extends p
    {
        public static final c d;
        
        static {
            d = new c();
        }
        
        @Override
        public Object g(final byte b, final ByteBuffer byteBuffer) {
            if (b == -128) {
                return J5.p.d.a((ArrayList)this.f(byteBuffer));
            }
            if (b != -127) {
                return super.g(b, byteBuffer);
            }
            return e.a((ArrayList)this.f(byteBuffer));
        }
        
        @Override
        public void p(final ByteArrayOutputStream byteArrayOutputStream, final Object o) {
            ArrayList list;
            if (o instanceof d) {
                byteArrayOutputStream.write(128);
                list = ((d)o).w();
            }
            else {
                if (!(o instanceof e)) {
                    super.p(byteArrayOutputStream, o);
                    return;
                }
                byteArrayOutputStream.write(129);
                list = ((e)o).f();
            }
            this.p(byteArrayOutputStream, list);
        }
    }
    
    public static final class d
    {
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;
        
        public static d a(final ArrayList list) {
            final d d = new d();
            d.j(list.get(0));
            d.l(list.get(1));
            d.s(list.get(2));
            d.t(list.get(3));
            d.m(list.get(4));
            d.n(list.get(5));
            d.u(list.get(6));
            d.r(list.get(7));
            d.v(list.get(8));
            d.o(list.get(9));
            d.i(list.get(10));
            d.q(list.get(11));
            d.p(list.get(12));
            d.k(list.get(13));
            return d;
        }
        
        public String b() {
            return this.a;
        }
        
        public String c() {
            return this.b;
        }
        
        public String d() {
            return this.f;
        }
        
        public String e() {
            return this.c;
        }
        
        public String f() {
            return this.d;
        }
        
        public String g() {
            return this.g;
        }
        
        public String h() {
            return this.i;
        }
        
        public void i(final String k) {
            this.k = k;
        }
        
        public void j(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        
        public void k(final String n) {
            this.n = n;
        }
        
        public void l(final String b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        
        public void m(final String e) {
            this.e = e;
        }
        
        public void n(final String f) {
            this.f = f;
        }
        
        public void o(final String j) {
            this.j = j;
        }
        
        public void p(final String m) {
            this.m = m;
        }
        
        public void q(final String l) {
            this.l = l;
        }
        
        public void r(final String h) {
            this.h = h;
        }
        
        public void s(final String c) {
            if (c != null) {
                this.c = c;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        
        public void t(final String d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        
        public void u(final String g) {
            this.g = g;
        }
        
        public void v(final String i) {
            this.i = i;
        }
        
        public ArrayList w() {
            final ArrayList<String> list = new ArrayList<String>(14);
            list.add(this.a);
            list.add(this.b);
            list.add(this.c);
            list.add(this.d);
            list.add(this.e);
            list.add(this.f);
            list.add(this.g);
            list.add(this.h);
            list.add(this.i);
            list.add(this.j);
            list.add(this.k);
            list.add(this.l);
            list.add(this.m);
            list.add(this.n);
            return list;
        }
        
        public static final class a
        {
            public String a;
            public String b;
            public String c;
            public String d;
            public String e;
            public String f;
            public String g;
            public String h;
            public String i;
            public String j;
            public String k;
            public String l;
            public String m;
            public String n;
            
            public d a() {
                final d d = new d();
                d.j(this.a);
                d.l(this.b);
                d.s(this.c);
                d.t(this.d);
                d.m(this.e);
                d.n(this.f);
                d.u(this.g);
                d.r(this.h);
                d.v(this.i);
                d.o(this.j);
                d.i(this.k);
                d.q(this.l);
                d.p(this.m);
                d.k(this.n);
                return d;
            }
            
            public a b(final String a) {
                this.a = a;
                return this;
            }
            
            public a c(final String b) {
                this.b = b;
                return this;
            }
            
            public a d(final String f) {
                this.f = f;
                return this;
            }
            
            public a e(final String c) {
                this.c = c;
                return this;
            }
            
            public a f(final String d) {
                this.d = d;
                return this;
            }
            
            public a g(final String g) {
                this.g = g;
                return this;
            }
            
            public a h(final String i) {
                this.i = i;
                return this;
            }
        }
    }
    
    public static final class e
    {
        public String a;
        public d b;
        public Boolean c;
        public Map d;
        
        public static e a(final ArrayList list) {
            final e e = new e();
            e.c(list.get(0));
            final String value = list.get(1);
            Object a;
            if (value == null) {
                a = null;
            }
            else {
                a = d.a((ArrayList)value);
            }
            e.d((d)a);
            e.b((Boolean)list.get(2));
            e.e((Map)list.get(3));
            return e;
        }
        
        public void b(final Boolean c) {
            this.c = c;
        }
        
        public void c(final String a) {
            if (a != null) {
                this.a = a;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }
        
        public void d(final d b) {
            if (b != null) {
                this.b = b;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }
        
        public void e(final Map d) {
            if (d != null) {
                this.d = d;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }
        
        public ArrayList f() {
            final ArrayList<Map> list = new ArrayList<Map>(4);
            list.add((Map)this.a);
            final d b = this.b;
            Object w;
            if (b == null) {
                w = null;
            }
            else {
                w = b.w();
            }
            list.add((Map)w);
            list.add((Map)this.c);
            list.add(this.d);
            return list;
        }
        
        public static final class a
        {
            public String a;
            public d b;
            public Boolean c;
            public Map d;
            
            public e a() {
                final e e = new e();
                e.c(this.a);
                e.d(this.b);
                e.b(this.c);
                e.e(this.d);
                return e;
            }
            
            public a b(final Boolean c) {
                this.c = c;
                return this;
            }
            
            public a c(final String a) {
                this.a = a;
                return this;
            }
            
            public a d(final d b) {
                this.b = b;
                return this;
            }
            
            public a e(final Map d) {
                this.d = d;
                return this;
            }
        }
    }
    
    public interface f
    {
        void a(final Object p0);
        
        void b(final Throwable p0);
    }
}
