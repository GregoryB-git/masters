/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 *  java.util.Map
 */
package Q3;

import Q3.c;
import Q3.d;
import Q3.n;
import Q3.p;
import Q3.r;
import V2.j;
import V3.C;
import V3.k;
import V3.m;
import Y3.g;
import Z3.a;
import d4.b;
import d4.o;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class e
extends p {
    public e(m m8, k k8) {
        super(m8, k8);
    }

    public e W(String object) {
        if (object != null) {
            if (this.s().isEmpty()) {
                Y3.n.i((String)object);
            } else {
                Y3.n.h((String)object);
            }
            object = this.s().T(new k((String)object));
            return new e(this.a, (k)object);
        }
        throw new NullPointerException("Can't pass null for argument 'pathString' in child()");
    }

    public String X() {
        if (this.s().isEmpty()) {
            return null;
        }
        return this.s().X().e();
    }

    public e Y() {
        k k8 = this.s().a0();
        if (k8 != null) {
            return new e(this.a, k8);
        }
        return null;
    }

    public n Z() {
        Y3.n.l(this.s());
        return new n(this.a, this.s());
    }

    public void a0(final r.b b8, final boolean bl) {
        if (b8 != null) {
            Y3.n.l(this.s());
            this.a.i0(new Runnable(){

                public void run() {
                    e e8 = e.this;
                    e8.a.n0(e8.s(), b8, bl);
                }
            });
            return;
        }
        throw new NullPointerException("Can't pass null for argument 'handler' in runTransaction()");
    }

    public j b0(Object object) {
        return this.c0(d4.r.c(this.b, object), null);
    }

    public final j c0(final d4.n n8, e object) {
        Y3.n.l(this.s());
        object = Y3.m.l((e)object);
        this.a.i0(new Runnable((g)object){
            public final /* synthetic */ g p;
            {
                this.p = g8;
            }

            public void run() {
                e e8 = e.this;
                e8.a.m0(e8.s().U(b.o()), n8, (e)this.p.b());
            }
        });
        return (j)object.a();
    }

    public j d0(Object object) {
        return this.f0(object, d4.r.c(this.b, null), null);
    }

    public j e0(Object object, Object object2) {
        return this.f0(object, d4.r.c(this.b, object2), null);
    }

    public boolean equals(Object object) {
        if (object instanceof e && this.toString().equals((Object)object.toString())) {
            return true;
        }
        return false;
    }

    public final j f0(Object object, d4.n object2, e e8) {
        Y3.n.l(this.s());
        C.g(this.s(), object);
        object = a.b(object);
        Y3.n.k(object);
        object = o.b(object, (d4.n)object2);
        object2 = Y3.m.l(e8);
        this.a.i0(new Runnable((d4.n)object, (g)object2){
            public final /* synthetic */ d4.n o;
            public final /* synthetic */ g p;
            {
                this.o = n8;
                this.p = g8;
            }

            public void run() {
                e e8 = e.this;
                e8.a.m0(e8.s(), this.o, (e)this.p.b());
            }
        });
        return (j)object2.a();
    }

    public j g0(Map map) {
        return this.h0(map, null);
    }

    public final j h0(Map map, e object) {
        if (map != null) {
            map = a.c(map);
            final V3.b b8 = V3.b.D(Y3.n.e(this.s(), map));
            object = Y3.m.l((e)object);
            this.a.i0(new Runnable((g)object, map){
                public final /* synthetic */ g p;
                public final /* synthetic */ Map q;
                {
                    this.p = g8;
                    this.q = map;
                }

                public void run() {
                    e e8 = e.this;
                    e8.a.o0(e8.s(), b8, (e)this.p.b(), this.q);
                }
            });
            return (j)object.a();
        }
        throw new NullPointerException("Can't pass null for argument 'update' in updateChildren()");
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        Object object = this.Y();
        if (object == null) {
            return this.a.toString();
        }
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(object.toString());
            stringBuilder.append("/");
            stringBuilder.append(URLEncoder.encode((String)this.X(), (String)"UTF-8").replace((CharSequence)"+", (CharSequence)"%20"));
            object = stringBuilder.toString();
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to URLEncode key: ");
            stringBuilder.append(this.X());
            throw new d(stringBuilder.toString(), (Throwable)unsupportedEncodingException);
        }
    }

    public static interface e {
        public void a(c var1, e var2);
    }

}

