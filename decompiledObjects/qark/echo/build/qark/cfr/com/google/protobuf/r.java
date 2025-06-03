/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Enum
 *  java.lang.Error
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.google.protobuf;

import com.google.protobuf.K;
import com.google.protobuf.M;
import com.google.protobuf.W;
import com.google.protobuf.X;
import com.google.protobuf.Y;
import com.google.protobuf.Z;
import com.google.protobuf.a;
import com.google.protobuf.h;
import com.google.protobuf.h0;
import com.google.protobuf.i;
import com.google.protobuf.k0;
import com.google.protobuf.n0;
import com.google.protobuf.s;
import com.google.protobuf.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class r
extends com.google.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected h0 unknownFields = h0.c();

    public static r A(Class class_) {
        r r8;
        r r9;
        r8 = r9 = (r)defaultInstanceMap.get((Object)class_);
        if (r9 == null) {
            try {
                Class.forName((String)class_.getName(), (boolean)true, (ClassLoader)class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            r8 = (r)defaultInstanceMap.get((Object)class_);
        }
        if (r8 == null) {
            r8 = ((r)k0.k(class_)).B();
            if (r8 != null) {
                defaultInstanceMap.put((Object)class_, (Object)r8);
                return r8;
            }
            throw new IllegalStateException();
        }
        return r8;
    }

    public static /* varargs */ Object F(Method object, Object object2, Object ... arrobject) {
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

    public static final boolean H(r r8, boolean bl) {
        byte by = (Byte)r8.v(c.o);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl2 = W.a().d(r8).c(r8);
        if (bl) {
            c c8 = c.p;
            r r9 = bl2 ? r8 : null;
            r8.w(c8, r9);
        }
        return bl2;
    }

    public static t.d L(t.d d8) {
        int n8 = d8.size();
        n8 = n8 == 0 ? 10 : (n8 *= 2);
        return d8.h(n8);
    }

    public static t.e M(t.e e8) {
        int n8 = e8.size();
        n8 = n8 == 0 ? 10 : (n8 *= 2);
        return e8.h(n8);
    }

    public static Object O(K k8, String string2, Object[] arrobject) {
        return new Y(k8, string2, arrobject);
    }

    public static void Q(Class class_, r r8) {
        r8.K();
        defaultInstanceMap.put((Object)class_, (Object)r8);
    }

    public static t.d y() {
        return s.i();
    }

    public static t.e z() {
        return X.f();
    }

    public final r B() {
        return (r)this.v(c.t);
    }

    public int C() {
        return this.memoizedHashCode;
    }

    public int D() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean E() {
        if (this.C() == 0) {
            return true;
        }
        return false;
    }

    public final boolean G() {
        return r.H(this, true);
    }

    public boolean I() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public void J() {
        W.a().d(this).b(this);
        this.K();
    }

    public void K() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a N() {
        return (a)this.v(c.s);
    }

    public r P() {
        return (r)this.v(c.r);
    }

    public void R(int n8) {
        this.memoizedHashCode = n8;
    }

    public void S(int n8) {
        if (n8 >= 0) {
            this.memoizedSerializedSize = n8 & Integer.MAX_VALUE | this.memoizedSerializedSize & Integer.MIN_VALUE;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("serialized size must be non-negative, was ");
        stringBuilder.append(n8);
        throw new IllegalStateException(stringBuilder.toString());
    }

    @Override
    public int a() {
        return this.h(null);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        return W.a().d(this).d(this, (r)object);
    }

    @Override
    public int h(Z z8) {
        if (this.I()) {
            int n8 = this.t(z8);
            if (n8 >= 0) {
                return n8;
            }
            z8 = new StringBuilder();
            z8.append("serialized size must be non-negative, was ");
            z8.append(n8);
            throw new IllegalStateException(z8.toString());
        }
        if (this.D() != Integer.MAX_VALUE) {
            return this.D();
        }
        int n9 = this.t(z8);
        this.S(n9);
        return n9;
    }

    public int hashCode() {
        if (this.I()) {
            return this.s();
        }
        if (this.E()) {
            this.R(this.s());
        }
        return this.C();
    }

    @Override
    public void j(h h8) {
        W.a().d(this).h(this, i.P(h8));
    }

    public Object m() {
        return this.v(c.q);
    }

    public void q() {
        this.memoizedHashCode = 0;
    }

    public void r() {
        this.S(Integer.MAX_VALUE);
    }

    public int s() {
        return W.a().d(this).g(this);
    }

    public final int t(Z z8) {
        if (z8 == null) {
            return W.a().d(this).e(this);
        }
        return z8.e(this);
    }

    public String toString() {
        return M.f(this, Object.super.toString());
    }

    public final a u() {
        return (a)this.v(c.s);
    }

    public Object v(c c8) {
        return this.x(c8, null, null);
    }

    public Object w(c c8, Object object) {
        return this.x(c8, object, null);
    }

    public abstract Object x(c var1, Object var2, Object var3);

    public static abstract class a
    extends a.a {
        public final r o;
        public r p;

        public a(r r8) {
            this.o = r8;
            if (!r8.I()) {
                this.p = this.C();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void B(Object object, Object object2) {
            W.a().d(object).a(object, object2);
        }

        private r C() {
            return this.o.P();
        }

        public r A() {
            return this.o;
        }

        public final r v() {
            r r8 = this.w();
            if (r8.G()) {
                return r8;
            }
            throw a.a.u(r8);
        }

        public r w() {
            if (!this.p.I()) {
                return this.p;
            }
            this.p.J();
            return this.p;
        }

        public a x() {
            a a8 = this.A().N();
            a8.p = this.w();
            return a8;
        }

        public final void y() {
            if (!this.p.I()) {
                this.z();
            }
        }

        public void z() {
            r r8 = this.C();
            a.B(r8, this.p);
            this.p = r8;
        }
    }

    public static class b
    extends com.google.protobuf.b {
        public final r b;

        public b(r r8) {
            this.b = r8;
        }
    }

    public static final class c
    extends Enum {
        public static final /* enum */ c o = new c();
        public static final /* enum */ c p = new c();
        public static final /* enum */ c q = new c();
        public static final /* enum */ c r = new c();
        public static final /* enum */ c s = new c();
        public static final /* enum */ c t = new c();
        public static final /* enum */ c u = new c();
        public static final /* synthetic */ c[] v;

        static {
            v = c.c();
        }

        public static /* synthetic */ c[] c() {
            return new c[]{o, p, q, r, s, t, u};
        }

        public static c valueOf(String string2) {
            return (c)Enum.valueOf(c.class, (String)string2);
        }

        public static c[] values() {
            return (c[])v.clone();
        }
    }

}

