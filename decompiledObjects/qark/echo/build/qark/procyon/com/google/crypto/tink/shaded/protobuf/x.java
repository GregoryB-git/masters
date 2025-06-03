// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class x extends com.google.crypto.tink.shaded.protobuf.a
{
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, x> defaultInstanceMap;
    private int memoizedSerializedSize;
    protected l0 unknownFields;
    
    static {
        x.defaultInstanceMap = new ConcurrentHashMap<Object, x>();
    }
    
    public x() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = l0.c();
    }
    
    public static Object A(final Method method, final Object obj, final Object... args) {
        try {
            return method.invoke(obj, args);
        }
        catch (InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", cause2);
        }
    }
    
    public static final boolean C(final x x, final boolean b) {
        final byte byteValue = (byte)x.r(d.o);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean c = a0.a().d(x).c(x);
        if (b) {
            final d p2 = d.p;
            x x2;
            if (c) {
                x2 = x;
            }
            else {
                x2 = null;
            }
            x.s(p2, x2);
        }
        return c;
    }
    
    public static z.d G(final z.d d) {
        final int size = d.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size * 2;
        }
        return d.h(n);
    }
    
    public static Object I(final O o, final String s, final Object[] array) {
        return new c0(o, s, array);
    }
    
    public static x K(final x x, final h h, final p p3) {
        return l(N(x, h, p3));
    }
    
    public static x L(final x x, final InputStream inputStream, final p p3) {
        return l(O(x, i.f(inputStream), p3));
    }
    
    public static x M(final x x, final byte[] array, final p p3) {
        return l(P(x, array, 0, array.length, p3));
    }
    
    public static x N(x o, final h h, final p p3) {
        final i u = h.U();
        o = O(o, u, p3);
        try {
            u.a(0);
            return o;
        }
        catch (A a) {
            throw a.k(o);
        }
    }
    
    public static x O(final x x, final i i, final p p3) {
        final x j = x.J();
        try {
            final e0 d = a0.a().d(j);
            d.j(j, com.google.crypto.tink.shaded.protobuf.j.O(i), p3);
            d.b(j);
            return j;
        }
        catch (RuntimeException ex) {
            if (ex.getCause() instanceof A) {
                throw (A)ex.getCause();
            }
            throw ex;
        }
        catch (IOException ex3) {
            final IOException ex2;
            if (ex2.getCause() instanceof A) {
                throw (A)ex2.getCause();
            }
            throw new A(ex2).k(j);
        }
        catch (j0 j3) {}
        catch (A a3) {
            final j0 j2;
            throw j2.a().k(j);
            // iftrue(Label_0128:, !a2.a())
            A a;
            while (true) {
                final A a2;
                a = new A(a2);
                throw a.k(j);
                a = a2;
                continue;
            }
            Label_0128: {
                throw a.k(j);
            }
        }
    }
    
    public static x P(final x x, final byte[] array, final int n, final int n2, final p p5) {
        final x j = x.J();
        while (true) {
            try {
                final e0 d = a0.a().d(j);
                d.h(j, array, n, n + n2, new e.a(p5));
                d.b(j);
                return j;
            }
            catch (IOException ex) {
                if (ex.getCause() instanceof A) {
                    throw (A)ex.getCause();
                }
                throw new A(ex).k(j);
                throw A.m().k(j);
            }
            catch (j0 j3) {}
            catch (A a3) {
                final j0 j2;
                throw j2.a().k(j);
                final A a2;
                A a = a2;
                // iftrue(Label_0129:, !a2.a())
                a = new A(a2);
                Label_0129: {
                    throw a.k(j);
                }
            }
            catch (IndexOutOfBoundsException ex2) {}
            continue;
        }
    }
    
    public static void Q(final Class clazz, final x x) {
        x.F();
        x.defaultInstanceMap.put(clazz, x);
    }
    
    public static x l(final x x) {
        if (x == null) {
            return x;
        }
        if (x.B()) {
            return x;
        }
        throw x.i().a().k(x);
    }
    
    public static z.d u() {
        return b0.f();
    }
    
    public static x v(final Class clazz) {
        x x;
        if ((x = com.google.crypto.tink.shaded.protobuf.x.defaultInstanceMap.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                x = com.google.crypto.tink.shaded.protobuf.x.defaultInstanceMap.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        if (x != null) {
            return x;
        }
        final x w = ((x)o0.k(clazz)).w();
        if (w != null) {
            com.google.crypto.tink.shaded.protobuf.x.defaultInstanceMap.put(clazz, w);
            return w;
        }
        throw new IllegalStateException();
    }
    
    public final boolean B() {
        return C(this, true);
    }
    
    public boolean D() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0x0;
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
    
    public void R(final int memoizedHashCode) {
        super.memoizedHashCode = memoizedHashCode;
    }
    
    public void S(final int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = ((i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("serialized size must be non-negative, was ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
    
    public final a T() {
        return ((a)this.r(d.s)).v(this);
    }
    
    @Override
    public int a() {
        return this.e(null);
    }
    
    @Override
    public int e(final e0 e0) {
        if (this.D()) {
            final int p = this.p(e0);
            if (p >= 0) {
                return p;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("serialized size must be non-negative, was ");
            sb.append(p);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (this.y() != Integer.MAX_VALUE) {
                return this.y();
            }
            final int p2 = this.p(e0);
            this.S(p2);
            return p2;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && a0.a().d(this).d(this, o));
    }
    
    @Override
    public void g(final k k) {
        a0.a().d(this).i(this, l.P(k));
    }
    
    @Override
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
        super.memoizedHashCode = 0;
    }
    
    public void n() {
        this.S(Integer.MAX_VALUE);
    }
    
    public int o() {
        return a0.a().d(this).g(this);
    }
    
    public final int p(final e0 e0) {
        if (e0 == null) {
            return a0.a().d(this).e(this);
        }
        return e0.e(this);
    }
    
    public final a q() {
        return (a)this.r(d.s);
    }
    
    public Object r(final d d) {
        return this.t(d, null, null);
    }
    
    public Object s(final d d, final Object o) {
        return this.t(d, o, null);
    }
    
    public abstract Object t(final d p0, final Object p1, final Object p2);
    
    @Override
    public String toString() {
        return Q.f(this, super.toString());
    }
    
    public final x w() {
        return (x)this.r(d.t);
    }
    
    public int x() {
        return super.memoizedHashCode;
    }
    
    public int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }
    
    public boolean z() {
        return this.x() == 0;
    }
    
    public abstract static class a extends com.google.crypto.tink.shaded.protobuf.a.a
    {
        public final x o;
        public x p;
        
        public a(final x o) {
            this.o = o;
            if (!o.D()) {
                this.p = this.x();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        
        public static void w(final Object o, final Object o2) {
            a0.a().d(o).a(o, o2);
        }
        
        private x x() {
            return this.o.J();
        }
        
        public final x n() {
            final x o = this.o();
            if (o.B()) {
                return o;
            }
            throw com.google.crypto.tink.shaded.protobuf.a.a.l(o);
        }
        
        public x o() {
            if (!this.p.D()) {
                return this.p;
            }
            this.p.E();
            return this.p;
        }
        
        public a p() {
            final a h = this.u().H();
            h.p = this.o();
            return h;
        }
        
        public final void s() {
            if (!this.p.D()) {
                this.t();
            }
        }
        
        public void t() {
            final x x = this.x();
            w(x, this.p);
            this.p = x;
        }
        
        public x u() {
            return this.o;
        }
        
        public a v(final x x) {
            if (this.u().equals(x)) {
                return this;
            }
            this.s();
            w(this.p, x);
            return this;
        }
    }
    
    public static class b extends com.google.crypto.tink.shaded.protobuf.b
    {
        public final x b;
        
        public b(final x b) {
            this.b = b;
        }
    }
    
    public abstract static class c extends n
    {
    }
    
    public enum d
    {
        o("GET_MEMOIZED_IS_INITIALIZED", 0), 
        p("SET_MEMOIZED_IS_INITIALIZED", 1), 
        q("BUILD_MESSAGE_INFO", 2), 
        r("NEW_MUTABLE_INSTANCE", 3), 
        s("NEW_BUILDER", 4), 
        t("GET_DEFAULT_INSTANCE", 5), 
        u("GET_PARSER", 6);
        
        public d(final String name, final int ordinal) {
        }
    }
}
