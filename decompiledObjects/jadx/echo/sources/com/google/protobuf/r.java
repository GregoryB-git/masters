package com.google.protobuf;

import com.google.protobuf.AbstractC1136a;
import com.google.protobuf.AbstractC1154t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class r extends AbstractC1136a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, r> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected h0 unknownFields = h0.c();

    public static abstract class a extends AbstractC1136a.AbstractC0179a {

        /* renamed from: o, reason: collision with root package name */
        public final r f12236o;

        /* renamed from: p, reason: collision with root package name */
        public r f12237p;

        public a(r rVar) {
            this.f12236o = rVar;
            if (rVar.I()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f12237p = C();
        }

        public static void B(Object obj, Object obj2) {
            W.a().d(obj).a(obj, obj2);
        }

        private r C() {
            return this.f12236o.P();
        }

        public r A() {
            return this.f12236o;
        }

        public final r v() {
            r c7 = c();
            if (c7.G()) {
                return c7;
            }
            throw AbstractC1136a.AbstractC0179a.u(c7);
        }

        @Override // com.google.protobuf.K.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public r c() {
            if (!this.f12237p.I()) {
                return this.f12237p;
            }
            this.f12237p.J();
            return this.f12237p;
        }

        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a d7 = A().d();
            d7.f12237p = c();
            return d7;
        }

        public final void y() {
            if (this.f12237p.I()) {
                return;
            }
            z();
        }

        public void z() {
            r C7 = C();
            B(C7, this.f12237p);
            this.f12237p = C7;
        }
    }

    public static class b extends AbstractC1137b {

        /* renamed from: b, reason: collision with root package name */
        public final r f12238b;

        public b(r rVar) {
            this.f12238b = rVar;
        }
    }

    public enum c {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static r A(Class cls) {
        r rVar = defaultInstanceMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (rVar == null) {
            rVar = ((r) k0.k(cls)).b();
            if (rVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, rVar);
        }
        return rVar;
    }

    public static Object F(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e8) {
            Throwable cause = e8.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean H(r rVar, boolean z7) {
        byte byteValue = ((Byte) rVar.v(c.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c7 = W.a().d(rVar).c(rVar);
        if (z7) {
            rVar.w(c.SET_MEMOIZED_IS_INITIALIZED, c7 ? rVar : null);
        }
        return c7;
    }

    public static AbstractC1154t.d L(AbstractC1154t.d dVar) {
        int size = dVar.size();
        return dVar.h(size == 0 ? 10 : size * 2);
    }

    public static AbstractC1154t.e M(AbstractC1154t.e eVar) {
        int size = eVar.size();
        return eVar.h(size == 0 ? 10 : size * 2);
    }

    public static Object O(K k7, String str, Object[] objArr) {
        return new Y(k7, str, objArr);
    }

    public static void Q(Class cls, r rVar) {
        rVar.K();
        defaultInstanceMap.put(cls, rVar);
    }

    public static AbstractC1154t.d y() {
        return C1153s.i();
    }

    public static AbstractC1154t.e z() {
        return X.f();
    }

    @Override // com.google.protobuf.L
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final r b() {
        return (r) v(c.GET_DEFAULT_INSTANCE);
    }

    public int C() {
        return this.memoizedHashCode;
    }

    public int D() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean E() {
        return C() == 0;
    }

    public final boolean G() {
        return H(this, true);
    }

    public boolean I() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void J() {
        W.a().d(this).b(this);
        K();
    }

    public void K() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.K
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final a d() {
        return (a) v(c.NEW_BUILDER);
    }

    public r P() {
        return (r) v(c.NEW_MUTABLE_INSTANCE);
    }

    public void R(int i7) {
        this.memoizedHashCode = i7;
    }

    public void S(int i7) {
        if (i7 >= 0) {
            this.memoizedSerializedSize = (i7 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i7);
        }
    }

    @Override // com.google.protobuf.K
    public int a() {
        return h(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return W.a().d(this).d(this, (r) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.AbstractC1136a
    public int h(Z z7) {
        if (!I()) {
            if (D() != Integer.MAX_VALUE) {
                return D();
            }
            int t7 = t(z7);
            S(t7);
            return t7;
        }
        int t8 = t(z7);
        if (t8 >= 0) {
            return t8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + t8);
    }

    public int hashCode() {
        if (I()) {
            return s();
        }
        if (E()) {
            R(s());
        }
        return C();
    }

    @Override // com.google.protobuf.K
    public void j(AbstractC1143h abstractC1143h) {
        W.a().d(this).h(this, C1144i.P(abstractC1143h));
    }

    public Object m() {
        return v(c.BUILD_MESSAGE_INFO);
    }

    public void q() {
        this.memoizedHashCode = 0;
    }

    public void r() {
        S(Integer.MAX_VALUE);
    }

    public int s() {
        return W.a().d(this).g(this);
    }

    public final int t(Z z7) {
        return z7 == null ? W.a().d(this).e(this) : z7.e(this);
    }

    public String toString() {
        return M.f(this, super.toString());
    }

    public final a u() {
        return (a) v(c.NEW_BUILDER);
    }

    public Object v(c cVar) {
        return x(cVar, null, null);
    }

    public Object w(c cVar, Object obj) {
        return x(cVar, obj, null);
    }

    public abstract Object x(c cVar, Object obj, Object obj2);
}
