// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public abstract class w extends androidx.datastore.preferences.protobuf.a
{
    private static Map<Object, w> defaultInstanceMap;
    protected int memoizedSerializedSize;
    protected m0 unknownFields;
    
    static {
        w.defaultInstanceMap = new ConcurrentHashMap<Object, w>();
    }
    
    public w() {
        this.unknownFields = m0.e();
        this.memoizedSerializedSize = -1;
    }
    
    public static y.b A(final y.b b) {
        final int size = b.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size * 2;
        }
        return b.h(n);
    }
    
    public static Object C(final O o, final String s, final Object[] array) {
        return new c0(o, s, array);
    }
    
    public static w D(final w w, final InputStream inputStream) {
        return o(E(w, h.f(inputStream), o.b()));
    }
    
    public static w E(w w, final h h, final o o) {
        w = (w)w.q(d.r);
        try {
            final e0 d = a0.a().d(w);
            d.h(w, i.O(h), o);
            d.b(w);
            return w;
        }
        catch (RuntimeException ex) {
            if (ex.getCause() instanceof z) {
                throw (z)ex.getCause();
            }
            throw ex;
        }
        catch (IOException ex3) {
            final IOException ex2;
            if (ex2.getCause() instanceof z) {
                throw (z)ex2.getCause();
            }
            throw new z(ex2.getMessage()).i(w);
        }
    }
    
    public static void F(final Class clazz, final w w) {
        w.defaultInstanceMap.put(clazz, w);
    }
    
    public static w o(final w w) {
        if (w == null) {
            return w;
        }
        if (w.x()) {
            return w;
        }
        throw w.k().a().i(w);
    }
    
    public static y.b t() {
        return b0.f();
    }
    
    public static w u(final Class clazz) {
        w w;
        if ((w = androidx.datastore.preferences.protobuf.w.defaultInstanceMap.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                w = androidx.datastore.preferences.protobuf.w.defaultInstanceMap.get(clazz);
            }
            catch (ClassNotFoundException cause) {
                throw new IllegalStateException("Class initialization cannot fail.", cause);
            }
        }
        if (w != null) {
            return w;
        }
        final w v = ((w)p0.i(clazz)).v();
        if (v != null) {
            androidx.datastore.preferences.protobuf.w.defaultInstanceMap.put(clazz, v);
            return v;
        }
        throw new IllegalStateException();
    }
    
    public static Object w(final Method method, final Object obj, final Object... args) {
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
    
    public static final boolean y(final w w, final boolean b) {
        final byte byteValue = (byte)w.q(d.o);
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        final boolean c = a0.a().d(w).c(w);
        if (b) {
            final d p2 = d.p;
            w w2;
            if (c) {
                w2 = w;
            }
            else {
                w2 = null;
            }
            w.r(p2, w2);
        }
        return c;
    }
    
    public final a B() {
        return (a)this.q(d.s);
    }
    
    public final a G() {
        final a a = (a)this.q(d.s);
        a.y(this);
        return a;
    }
    
    @Override
    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).e(this);
        }
        return this.memoizedSerializedSize;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (this.v().getClass().isInstance(o) && a0.a().d(this).d(this, o));
    }
    
    @Override
    public void g(final j j) {
        a0.a().d(this).i(this, k.P(j));
    }
    
    @Override
    public int hashCode() {
        final int memoizedHashCode = super.memoizedHashCode;
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        return super.memoizedHashCode = a0.a().d(this).g(this);
    }
    
    @Override
    public int i() {
        return this.memoizedSerializedSize;
    }
    
    @Override
    public void l(final int memoizedSerializedSize) {
        this.memoizedSerializedSize = memoizedSerializedSize;
    }
    
    public Object n() {
        return this.q(d.q);
    }
    
    public final a p() {
        return (a)this.q(d.s);
    }
    
    public Object q(final d d) {
        return this.s(d, null, null);
    }
    
    public Object r(final d d, final Object o) {
        return this.s(d, o, null);
    }
    
    public abstract Object s(final d p0, final Object p1, final Object p2);
    
    @Override
    public String toString() {
        return Q.e(this, super.toString());
    }
    
    public final w v() {
        return (w)this.q(d.t);
    }
    
    public final boolean x() {
        return y(this, true);
    }
    
    public void z() {
        a0.a().d(this).b(this);
    }
    
    public abstract static class a extends androidx.datastore.preferences.protobuf.a.a
    {
        public final w o;
        public w p;
        public boolean q;
        
        public a(final w o) {
            this.o = o;
            this.p = (w)o.q(d.r);
            this.q = false;
        }
        
        public final w s() {
            final w t = this.t();
            if (t.x()) {
                return t;
            }
            throw androidx.datastore.preferences.protobuf.a.a.p(t);
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
            final a b = this.w().B();
            b.y(this.t());
            return b;
        }
        
        public void v() {
            if (this.q) {
                final w p = (w)this.p.q(d.r);
                this.z(p, this.p);
                this.p = p;
                this.q = false;
            }
        }
        
        public w w() {
            return this.o;
        }
        
        public a x(final w w) {
            return this.y(w);
        }
        
        public a y(final w w) {
            this.v();
            this.z(this.p, w);
            return this;
        }
        
        public final void z(final w w, final w w2) {
            a0.a().d(w).a(w, w2);
        }
    }
    
    public static class b extends androidx.datastore.preferences.protobuf.b
    {
        public final w b;
        
        public b(final w b) {
            this.b = b;
        }
    }
    
    public abstract static class c extends m
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
