/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.ByteArrayOutputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Map
 */
package J5;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public abstract class p {
    public static ArrayList a(Throwable throwable) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add((Object)throwable.toString());
        arrayList.add((Object)throwable.getClass().getSimpleName());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cause: ");
        stringBuilder.append((Object)throwable.getCause());
        stringBuilder.append(", Stacktrace: ");
        stringBuilder.append(Log.getStackTraceString((Throwable)throwable));
        arrayList.add((Object)stringBuilder.toString());
        return arrayList;
    }

    public static interface a {
        public void b(String var1, Boolean var2, f var3);

        public void d(String var1, f var2);

        public void f(String var1, Boolean var2, f var3);
    }

    public static interface b {
        public void a(f var1);

        public void c(f var1);

        public void e(String var1, d var2, f var3);
    }

    public static class c
    extends E5.p {
        public static final c d = new c();

        @Override
        public Object g(byte by, ByteBuffer byteBuffer) {
            if (by != -128) {
                if (by != -127) {
                    return super.g(by, byteBuffer);
                }
                return e.a((ArrayList)this.f(byteBuffer));
            }
            return d.a((ArrayList)this.f(byteBuffer));
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object object) {
            if (object instanceof d) {
                byteArrayOutputStream.write(128);
                object = ((d)object).w();
            } else {
                if (!(object instanceof e)) {
                    super.p(byteArrayOutputStream, object);
                    return;
                }
                byteArrayOutputStream.write(129);
                object = ((e)object).f();
            }
            this.p(byteArrayOutputStream, object);
        }
    }

    public static final class d {
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

        public static d a(ArrayList arrayList) {
            d d8 = new d();
            d8.j((String)arrayList.get(0));
            d8.l((String)arrayList.get(1));
            d8.s((String)arrayList.get(2));
            d8.t((String)arrayList.get(3));
            d8.m((String)arrayList.get(4));
            d8.n((String)arrayList.get(5));
            d8.u((String)arrayList.get(6));
            d8.r((String)arrayList.get(7));
            d8.v((String)arrayList.get(8));
            d8.o((String)arrayList.get(9));
            d8.i((String)arrayList.get(10));
            d8.q((String)arrayList.get(11));
            d8.p((String)arrayList.get(12));
            d8.k((String)arrayList.get(13));
            return d8;
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

        public void i(String string2) {
            this.k = string2;
        }

        public void j(String string2) {
            if (string2 != null) {
                this.a = string2;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void k(String string2) {
            this.n = string2;
        }

        public void l(String string2) {
            if (string2 != null) {
                this.b = string2;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void m(String string2) {
            this.e = string2;
        }

        public void n(String string2) {
            this.f = string2;
        }

        public void o(String string2) {
            this.j = string2;
        }

        public void p(String string2) {
            this.m = string2;
        }

        public void q(String string2) {
            this.l = string2;
        }

        public void r(String string2) {
            this.h = string2;
        }

        public void s(String string2) {
            if (string2 != null) {
                this.c = string2;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void t(String string2) {
            if (string2 != null) {
                this.d = string2;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void u(String string2) {
            this.g = string2;
        }

        public void v(String string2) {
            this.i = string2;
        }

        public ArrayList w() {
            ArrayList arrayList = new ArrayList(14);
            arrayList.add((Object)this.a);
            arrayList.add((Object)this.b);
            arrayList.add((Object)this.c);
            arrayList.add((Object)this.d);
            arrayList.add((Object)this.e);
            arrayList.add((Object)this.f);
            arrayList.add((Object)this.g);
            arrayList.add((Object)this.h);
            arrayList.add((Object)this.i);
            arrayList.add((Object)this.j);
            arrayList.add((Object)this.k);
            arrayList.add((Object)this.l);
            arrayList.add((Object)this.m);
            arrayList.add((Object)this.n);
            return arrayList;
        }

        public static final class a {
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
                d d8 = new d();
                d8.j(this.a);
                d8.l(this.b);
                d8.s(this.c);
                d8.t(this.d);
                d8.m(this.e);
                d8.n(this.f);
                d8.u(this.g);
                d8.r(this.h);
                d8.v(this.i);
                d8.o(this.j);
                d8.i(this.k);
                d8.q(this.l);
                d8.p(this.m);
                d8.k(this.n);
                return d8;
            }

            public a b(String string2) {
                this.a = string2;
                return this;
            }

            public a c(String string2) {
                this.b = string2;
                return this;
            }

            public a d(String string2) {
                this.f = string2;
                return this;
            }

            public a e(String string2) {
                this.c = string2;
                return this;
            }

            public a f(String string2) {
                this.d = string2;
                return this;
            }

            public a g(String string2) {
                this.g = string2;
                return this;
            }

            public a h(String string2) {
                this.i = string2;
                return this;
            }
        }

    }

    public static final class e {
        public String a;
        public d b;
        public Boolean c;
        public Map d;

        public static e a(ArrayList arrayList) {
            e e8 = new e();
            e8.c((String)arrayList.get(0));
            Object object = arrayList.get(1);
            object = object == null ? null : d.a((ArrayList)object);
            e8.d((d)object);
            e8.b((Boolean)arrayList.get(2));
            e8.e((Map)arrayList.get(3));
            return e8;
        }

        public void b(Boolean bl) {
            this.c = bl;
        }

        public void c(String string2) {
            if (string2 != null) {
                this.a = string2;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void d(d d8) {
            if (d8 != null) {
                this.b = d8;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void e(Map map) {
            if (map != null) {
                this.d = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        public ArrayList f() {
            ArrayList arrayList = new ArrayList(4);
            arrayList.add((Object)this.a);
            d d8 = this.b;
            d8 = d8 == null ? null : d8.w();
            arrayList.add((Object)d8);
            arrayList.add((Object)this.c);
            arrayList.add((Object)this.d);
            return arrayList;
        }

        public static final class a {
            public String a;
            public d b;
            public Boolean c;
            public Map d;

            public e a() {
                e e8 = new e();
                e8.c(this.a);
                e8.d(this.b);
                e8.b(this.c);
                e8.e(this.d);
                return e8;
            }

            public a b(Boolean bl) {
                this.c = bl;
                return this;
            }

            public a c(String string2) {
                this.a = string2;
                return this;
            }

            public a d(d d8) {
                this.b = d8;
                return this;
            }

            public a e(Map map) {
                this.d = map;
                return this;
            }
        }

    }

    public static interface f {
        public void a(Object var1);

        public void b(Throwable var1);
    }

}

