/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.O;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.a0;
import androidx.datastore.preferences.protobuf.b0;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.d0;
import androidx.datastore.preferences.protobuf.e0;
import androidx.datastore.preferences.protobuf.h;
import androidx.datastore.preferences.protobuf.i;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.m;
import androidx.datastore.preferences.protobuf.m0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.y;
import androidx.datastore.preferences.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class w
extends androidx.datastore.preferences.protobuf.a {
    private static Map<Object, w> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.e();

    public static y.b A(y.b b8) {
        int n8 = b8.size();
        n8 = n8 == 0 ? 10 : (n8 *= 2);
        return b8.h(n8);
    }

    public static Object C(O o8, String string2, Object[] arrobject) {
        return new c0(o8, string2, arrobject);
    }

    public static w D(w w8, InputStream inputStream) {
        return w.o(w.E(w8, h.f(inputStream), o.b()));
    }

    public static w E(w w8, h h8, o o8) {
        IOException iOException2;
        block5 : {
            w8 = (w)w8.q(d.r);
            try {
                e0 e02 = a0.a().d(w8);
                e02.h(w8, i.O(h8), o8);
                e02.b(w8);
                return w8;
            }
            catch (RuntimeException runtimeException) {
            }
            catch (IOException iOException2) {
                break block5;
            }
            if (runtimeException.getCause() instanceof z) {
                throw (z)runtimeException.getCause();
            }
            throw runtimeException;
        }
        if (iOException2.getCause() instanceof z) {
            throw (z)iOException2.getCause();
        }
        throw new z(iOException2.getMessage()).i(w8);
    }

    public static void F(Class class_, w w8) {
        defaultInstanceMap.put((Object)class_, (Object)w8);
    }

    public static w o(w w8) {
        if (w8 != null) {
            if (w8.x()) {
                return w8;
            }
            throw w8.k().a().i(w8);
        }
        return w8;
    }

    public static y.b t() {
        return b0.f();
    }

    public static w u(Class class_) {
        w w8;
        w w9;
        w8 = w9 = (w)defaultInstanceMap.get((Object)class_);
        if (w9 == null) {
            try {
                Class.forName((String)class_.getName(), (boolean)true, (ClassLoader)class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            w8 = (w)defaultInstanceMap.get((Object)class_);
        }
        if (w8 == null) {
            w8 = ((w)p0.i(class_)).v();
            if (w8 != null) {
                defaultInstanceMap.put((Object)class_, (Object)w8);
                return w8;
            }
            throw new IllegalStateException();
        }
        return w8;
    }

    public static /* varargs */ Object w(Method object, Object object2, Object ... arrobject) {
        try {
            object = object.invoke(object2, arrobject);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            if (!(throwable instanceof RuntimeException)) {
                if (throwable instanceof Error) {
                    throw (Error)throwable;
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", throwable);
            }
            throw (RuntimeException)throwable;
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", (Throwable)illegalAccessException);
        }
    }

    public static final boolean y(w w8, boolean bl) {
        byte by = (Byte)w8.q(d.o);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl2 = a0.a().d(w8).c(w8);
        if (bl) {
            d d8 = d.p;
            w w9 = bl2 ? w8 : null;
            w8.r(d8, w9);
        }
        return bl2;
    }

    public final a B() {
        return (a)this.q(d.s);
    }

    public final a G() {
        a a8 = (a)this.q(d.s);
        a8.y(this);
        return a8;
    }

    @Override
    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!this.v().getClass().isInstance(object)) {
            return false;
        }
        return a0.a().d(this).d(this, (w)object);
    }

    @Override
    public void g(j j8) {
        a0.a().d(this).i(this, k.P(j8));
    }

    public int hashCode() {
        int n8 = this.memoizedHashCode;
        if (n8 != 0) {
            return n8;
        }
        this.memoizedHashCode = n8 = a0.a().d(this).g(this);
        return n8;
    }

    @Override
    public int i() {
        return this.memoizedSerializedSize;
    }

    @Override
    public void l(int n8) {
        this.memoizedSerializedSize = n8;
    }

    public Object n() {
        return this.q(d.q);
    }

    public final a p() {
        return (a)this.q(d.s);
    }

    public Object q(d d8) {
        return this.s(d8, null, null);
    }

    public Object r(d d8, Object object) {
        return this.s(d8, object, null);
    }

    public abstract Object s(d var1, Object var2, Object var3);

    public String toString() {
        return Q.e(this, Object.super.toString());
    }

    public final w v() {
        return (w)this.q(d.t);
    }

    public final boolean x() {
        return w.y(this, true);
    }

    public void z() {
        a0.a().d(this).b(this);
    }

    public static abstract class a
    extends a.a {
        public final w o;
        public w p;
        public boolean q;

        public a(w w8) {
            this.o = w8;
            this.p = (w)w8.q(d.r);
            this.q = false;
        }

        public final w s() {
            w w8 = this.t();
            if (w8.x()) {
                return w8;
            }
            throw a.a.p(w8);
        }

        public w t() {
            if (this.q) {
                return this.p;
            }
            this.p.z();
            this.q = true;
            return this.p;
        }

        public a u() {
            a a8 = this.w().B();
            a8.y(this.t());
            return a8;
        }

        public void v() {
            if (this.q) {
                w w8 = (w)this.p.q(d.r);
                this.z(w8, this.p);
                this.p = w8;
                this.q = false;
            }
        }

        public w w() {
            return this.o;
        }

        public a x(w w8) {
            return this.y(w8);
        }

        public a y(w w8) {
            this.v();
            this.z(this.p, w8);
            return this;
        }

        public final void z(w w8, w w9) {
            a0.a().d(w8).a(w8, w9);
        }
    }

    public static class b
    extends androidx.datastore.preferences.protobuf.b {
        public final w b;

        public b(w w8) {
            this.b = w8;
        }
    }

    public static abstract class c
    extends m {
    }

    public static final class d
    extends Enum {
        public static final /* enum */ d o;
        public static final /* enum */ d p;
        public static final /* enum */ d q;
        public static final /* enum */ d r;
        public static final /* enum */ d s;
        public static final /* enum */ d t;
        public static final /* enum */ d u;
        public static final /* synthetic */ d[] v;

        static {
            d d8;
            d d9;
            d d10;
            d d11;
            d d12;
            d d13;
            d d14;
            o = d9 = new d();
            p = d10 = new d();
            q = d14 = new d();
            r = d12 = new d();
            s = d13 = new d();
            t = d8 = new d();
            u = d11 = new d();
            v = new d[]{d9, d10, d14, d12, d13, d8, d11};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])v.clone();
        }
    }

}

