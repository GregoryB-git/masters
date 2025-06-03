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
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import com.google.crypto.tink.shaded.protobuf.Q;
import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.c0;
import com.google.crypto.tink.shaded.protobuf.d0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.e0;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.i;
import com.google.crypto.tink.shaded.protobuf.j;
import com.google.crypto.tink.shaded.protobuf.j0;
import com.google.crypto.tink.shaded.protobuf.k;
import com.google.crypto.tink.shaded.protobuf.l;
import com.google.crypto.tink.shaded.protobuf.l0;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.o0;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class x
extends com.google.crypto.tink.shaded.protobuf.a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l0 unknownFields = l0.c();

    public static /* varargs */ Object A(Method object, Object object2, Object ... arrobject) {
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

    public static final boolean C(x x8, boolean bl) {
        byte by = (Byte)x8.r(d.o);
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        boolean bl2 = a0.a().d(x8).c(x8);
        if (bl) {
            d d8 = d.p;
            x x9 = bl2 ? x8 : null;
            x8.s(d8, x9);
        }
        return bl2;
    }

    public static z.d G(z.d d8) {
        int n8 = d8.size();
        n8 = n8 == 0 ? 10 : (n8 *= 2);
        return d8.h(n8);
    }

    public static Object I(O o8, String string2, Object[] arrobject) {
        return new c0(o8, string2, arrobject);
    }

    public static x K(x x8, h h8, p p8) {
        return x.l(x.N(x8, h8, p8));
    }

    public static x L(x x8, InputStream inputStream, p p8) {
        return x.l(x.O(x8, i.f(inputStream), p8));
    }

    public static x M(x x8, byte[] arrby, p p8) {
        return x.l(x.P(x8, arrby, 0, arrby.length, p8));
    }

    public static x N(x x8, h object, p p8) {
        object = object.U();
        x8 = x.O(x8, (i)object, p8);
        try {
            object.a(0);
            return x8;
        }
        catch (A a8) {
            throw a8.k(x8);
        }
    }

    public static x O(x object, i i8, p p8) {
        A a82;
        x x8;
        block10 : {
            j0 j022;
            block9 : {
                IOException iOException2;
                block8 : {
                    x8 = object.J();
                    try {
                        object = a0.a().d(x8);
                        object.j(x8, j.O(i8), p8);
                        object.b(x8);
                        return x8;
                    }
                    catch (RuntimeException runtimeException) {
                    }
                    catch (IOException iOException2) {
                        break block8;
                    }
                    catch (j0 j022) {
                        break block9;
                    }
                    catch (A a82) {
                        break block10;
                    }
                    if (runtimeException.getCause() instanceof A) {
                        throw (A)runtimeException.getCause();
                    }
                    throw runtimeException;
                }
                if (iOException2.getCause() instanceof A) {
                    throw (A)iOException2.getCause();
                }
                throw new A(iOException2).k(x8);
            }
            throw j022.a().k(x8);
        }
        object = a82;
        if (a82.a()) {
            object = new A(a82);
        }
        throw object.k(x8);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static x P(x object, byte[] arrby, int n8, int n9, p p8) {
        A a82222;
        x x8;
        block5 : {
            x8 = object.J();
            try {
                object = a0.a().d(x8);
                object.h(x8, arrby, n8, n8 + n9, new e.a(p8));
                object.b(x8);
                return x8;
            }
            catch (IOException iOException2) {
            }
            catch (j0 j02) {
                throw j02.a().k(x8);
            }
            catch (A a82222) {
                break block5;
            }
            if (!(iOException2.getCause() instanceof A)) throw new A(iOException2).k(x8);
            throw (A)iOException2.getCause();
        }
        object = a82222;
        if (!a82222.a()) throw object.k(x8);
        object = new A(a82222);
        throw object.k(x8);
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw A.m().k(x8);
        }
    }

    public static void Q(Class class_, x x8) {
        x8.F();
        defaultInstanceMap.put((Object)class_, (Object)x8);
    }

    public static x l(x x8) {
        if (x8 != null) {
            if (x8.B()) {
                return x8;
            }
            throw x8.i().a().k(x8);
        }
        return x8;
    }

    public static z.d u() {
        return b0.f();
    }

    public static x v(Class class_) {
        x x8;
        x x9;
        x8 = x9 = (x)defaultInstanceMap.get((Object)class_);
        if (x9 == null) {
            try {
                Class.forName((String)class_.getName(), (boolean)true, (ClassLoader)class_.getClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw new IllegalStateException("Class initialization cannot fail.", (Throwable)classNotFoundException);
            }
            x8 = (x)defaultInstanceMap.get((Object)class_);
        }
        if (x8 == null) {
            x8 = ((x)o0.k(class_)).w();
            if (x8 != null) {
                defaultInstanceMap.put((Object)class_, (Object)x8);
                return x8;
            }
            throw new IllegalStateException();
        }
        return x8;
    }

    public final boolean B() {
        return x.C(this, true);
    }

    public boolean D() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public void E() {
        a0.a().d(this).b(this);
        this.F();
    }

    public void F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a H() {
        return (a)this.r(d.s);
    }

    public x J() {
        return (x)this.r(d.r);
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

    public final a T() {
        return ((a)this.r(d.s)).v(this);
    }

    @Override
    public int a() {
        return this.e(null);
    }

    @Override
    public int e(e0 e02) {
        if (this.D()) {
            int n8 = this.p(e02);
            if (n8 >= 0) {
                return n8;
            }
            e02 = new StringBuilder();
            e02.append("serialized size must be non-negative, was ");
            e02.append(n8);
            throw new IllegalStateException(e02.toString());
        }
        if (this.y() != Integer.MAX_VALUE) {
            return this.y();
        }
        int n9 = this.p(e02);
        this.S(n9);
        return n9;
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
        return a0.a().d(this).d(this, (x)object);
    }

    @Override
    public void g(k k8) {
        a0.a().d(this).i(this, l.P(k8));
    }

    public int hashCode() {
        if (this.D()) {
            return this.o();
        }
        if (this.z()) {
            this.R(this.o());
        }
        return this.x();
    }

    public Object k() {
        return this.r(d.q);
    }

    public void m() {
        this.memoizedHashCode = 0;
    }

    public void n() {
        this.S(Integer.MAX_VALUE);
    }

    public int o() {
        return a0.a().d(this).g(this);
    }

    public final int p(e0 e02) {
        if (e02 == null) {
            return a0.a().d(this).e(this);
        }
        return e02.e(this);
    }

    public final a q() {
        return (a)this.r(d.s);
    }

    public Object r(d d8) {
        return this.t(d8, null, null);
    }

    public Object s(d d8, Object object) {
        return this.t(d8, object, null);
    }

    public abstract Object t(d var1, Object var2, Object var3);

    public String toString() {
        return Q.f(this, Object.super.toString());
    }

    public final x w() {
        return (x)this.r(d.t);
    }

    public int x() {
        return this.memoizedHashCode;
    }

    public int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean z() {
        if (this.x() == 0) {
            return true;
        }
        return false;
    }

    public static abstract class a
    extends a.a {
        public final x o;
        public x p;

        public a(x x8) {
            this.o = x8;
            if (!x8.D()) {
                this.p = this.x();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        public static void w(Object object, Object object2) {
            a0.a().d(object).a(object, object2);
        }

        private x x() {
            return this.o.J();
        }

        public final x n() {
            x x8 = this.o();
            if (x8.B()) {
                return x8;
            }
            throw a.a.l(x8);
        }

        public x o() {
            if (!this.p.D()) {
                return this.p;
            }
            this.p.E();
            return this.p;
        }

        public a p() {
            a a8 = this.u().H();
            a8.p = this.o();
            return a8;
        }

        public final void s() {
            if (!this.p.D()) {
                this.t();
            }
        }

        public void t() {
            x x8 = this.x();
            a.w(x8, this.p);
            this.p = x8;
        }

        public x u() {
            return this.o;
        }

        public a v(x x8) {
            if (this.u().equals(x8)) {
                return this;
            }
            this.s();
            a.w(this.p, x8);
            return this;
        }
    }

    public static class b
    extends com.google.crypto.tink.shaded.protobuf.b {
        public final x b;

        public b(x x8) {
            this.b = x8;
        }
    }

    public static abstract class c
    extends n {
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
            o = d11 = new d();
            p = d12 = new d();
            q = d9 = new d();
            r = d14 = new d();
            s = d8 = new d();
            t = d10 = new d();
            u = d13 = new d();
            v = new d[]{d11, d12, d9, d14, d8, d10, d13};
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])v.clone();
        }
    }

}

