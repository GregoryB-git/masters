// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class r extends com.google.protobuf.a
{
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap;
    private int memoizedSerializedSize;
    protected h0 unknownFields;
    
    static {
        r.defaultInstanceMap = new ConcurrentHashMap<Object, r>();
    }
    
    public r() {
        this.memoizedSerializedSize = -1;
        this.unknownFields = h0.c();
    }
    
    public static r A(final Class clazz) {
        r r;
        if ((r = com.google.protobuf.r.defaultInstanceMap.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                r = com.google.protobuf.r.defaultInstanceMap.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        if (r != null) {
            return r;
        }
        final r b = ((r)k0.k(clazz)).B();
        if (b != null) {
            com.google.protobuf.r.defaultInstanceMap.put(clazz, b);
            return b;
        }
        throw new IllegalStateException();
    }
    
    public static Object F(final Method method, final Object obj, final Object... args) {
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
    
    public static final boolean H(final r r, final boolean b) {
        final byte byteValue = (byte)r.v(c.o);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean c = W.a().d(r).c(r);
        if (b) {
            final c p2 = com.google.protobuf.r.c.p;
            r r2;
            if (c) {
                r2 = r;
            }
            else {
                r2 = null;
            }
            r.w(p2, r2);
        }
        return c;
    }
    
    public static t.d L(final t.d d) {
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
    
    public static t.e M(final t.e e) {
        final int size = e.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size * 2;
        }
        return e.h(n);
    }
    
    public static Object O(final K k, final String s, final Object[] array) {
        return new Y(k, s, array);
    }
    
    public static void Q(final Class clazz, final r r) {
        r.K();
        r.defaultInstanceMap.put(clazz, r);
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
        return super.memoizedHashCode;
    }
    
    public int D() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }
    
    public boolean E() {
        return this.C() == 0;
    }
    
    public final boolean G() {
        return H(this, true);
    }
    
    public boolean I() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0x0;
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
    
    @Override
    public int a() {
        return this.h(null);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && W.a().d(this).d(this, o));
    }
    
    @Override
    public int h(final Z z) {
        if (this.I()) {
            final int t = this.t(z);
            if (t >= 0) {
                return t;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("serialized size must be non-negative, was ");
            sb.append(t);
            throw new IllegalStateException(sb.toString());
        }
        else {
            if (this.D() != Integer.MAX_VALUE) {
                return this.D();
            }
            final int t2 = this.t(z);
            this.S(t2);
            return t2;
        }
    }
    
    @Override
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
    public void j(final h h) {
        W.a().d(this).h(this, i.P(h));
    }
    
    public Object m() {
        return this.v(c.q);
    }
    
    public void q() {
        super.memoizedHashCode = 0;
    }
    
    public void r() {
        this.S(Integer.MAX_VALUE);
    }
    
    public int s() {
        return W.a().d(this).g(this);
    }
    
    public final int t(final Z z) {
        if (z == null) {
            return W.a().d(this).e(this);
        }
        return z.e(this);
    }
    
    @Override
    public String toString() {
        return M.f(this, super.toString());
    }
    
    public final a u() {
        return (a)this.v(c.s);
    }
    
    public Object v(final c c) {
        return this.x(c, null, null);
    }
    
    public Object w(final c c, final Object o) {
        return this.x(c, o, null);
    }
    
    public abstract Object x(final c p0, final Object p1, final Object p2);
    
    public abstract static class a extends com.google.protobuf.a.a
    {
        public final r o;
        public r p;
        
        public a(final r o) {
            this.o = o;
            if (!o.I()) {
                this.p = this.C();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        
        public static void B(final Object o, final Object o2) {
            W.a().d(o).a(o, o2);
        }
        
        private r C() {
            return this.o.P();
        }
        
        public r A() {
            return this.o;
        }
        
        public final r v() {
            final r w = this.w();
            if (w.G()) {
                return w;
            }
            throw com.google.protobuf.a.a.u(w);
        }
        
        public r w() {
            if (!this.p.I()) {
                return this.p;
            }
            this.p.J();
            return this.p;
        }
        
        public a x() {
            final a n = this.A().N();
            n.p = this.w();
            return n;
        }
        
        public final void y() {
            if (!this.p.I()) {
                this.z();
            }
        }
        
        public void z() {
            final r c = this.C();
            B(c, this.p);
            this.p = c;
        }
    }
    
    public static class b extends com.google.protobuf.b
    {
        public final r b;
        
        public b(final r b) {
            this.b = b;
        }
    }
    
    public enum c
    {
        o("GET_MEMOIZED_IS_INITIALIZED", 0), 
        p("SET_MEMOIZED_IS_INITIALIZED", 1), 
        q("BUILD_MESSAGE_INFO", 2), 
        r("NEW_MUTABLE_INSTANCE", 3), 
        s("NEW_BUILDER", 4), 
        t("GET_DEFAULT_INSTANCE", 5), 
        u("GET_PARSER", 6);
        
        static {
            v = c();
        }
        
        public c(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ c[] c() {
            return new c[] { c.o, c.p, c.q, c.r, c.s, c.t, c.u };
        }
    }
}
