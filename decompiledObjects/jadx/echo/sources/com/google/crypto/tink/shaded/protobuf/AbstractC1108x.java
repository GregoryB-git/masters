package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC1086a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1090e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1108x extends AbstractC1086a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1108x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l0 unknownFields = l0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a extends AbstractC1086a.AbstractC0172a {

        /* renamed from: o, reason: collision with root package name */
        public final AbstractC1108x f11541o;

        /* renamed from: p, reason: collision with root package name */
        public AbstractC1108x f11542p;

        public a(AbstractC1108x abstractC1108x) {
            this.f11541o = abstractC1108x;
            if (abstractC1108x.D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f11542p = x();
        }

        public static void w(Object obj, Object obj2) {
            a0.a().d(obj).a(obj, obj2);
        }

        private AbstractC1108x x() {
            return this.f11541o.J();
        }

        public final AbstractC1108x n() {
            AbstractC1108x o7 = o();
            if (o7.B()) {
                return o7;
            }
            throw AbstractC1086a.AbstractC0172a.l(o7);
        }

        public AbstractC1108x o() {
            if (!this.f11542p.D()) {
                return this.f11542p;
            }
            this.f11542p.E();
            return this.f11542p;
        }

        public a p() {
            a H6 = u().H();
            H6.f11542p = o();
            return H6;
        }

        public final void s() {
            if (this.f11542p.D()) {
                return;
            }
            t();
        }

        public void t() {
            AbstractC1108x x7 = x();
            w(x7, this.f11542p);
            this.f11542p = x7;
        }

        public AbstractC1108x u() {
            return this.f11541o;
        }

        public a v(AbstractC1108x abstractC1108x) {
            if (u().equals(abstractC1108x)) {
                return this;
            }
            s();
            w(this.f11542p, abstractC1108x);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    public static class b extends AbstractC1087b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC1108x f11543b;

        public b(AbstractC1108x abstractC1108x) {
            this.f11543b = abstractC1108x;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    public static class c extends AbstractC1099n {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static Object A(Method method, Object obj, Object... objArr) {
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

    public static final boolean C(AbstractC1108x abstractC1108x, boolean z7) {
        byte byteValue = ((Byte) abstractC1108x.r(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c7 = a0.a().d(abstractC1108x).c(abstractC1108x);
        if (z7) {
            abstractC1108x.s(d.SET_MEMOIZED_IS_INITIALIZED, c7 ? abstractC1108x : null);
        }
        return c7;
    }

    public static AbstractC1110z.d G(AbstractC1110z.d dVar) {
        int size = dVar.size();
        return dVar.h(size == 0 ? 10 : size * 2);
    }

    public static Object I(O o7, String str, Object[] objArr) {
        return new c0(o7, str, objArr);
    }

    public static AbstractC1108x K(AbstractC1108x abstractC1108x, AbstractC1093h abstractC1093h, C1101p c1101p) {
        return l(N(abstractC1108x, abstractC1093h, c1101p));
    }

    public static AbstractC1108x L(AbstractC1108x abstractC1108x, InputStream inputStream, C1101p c1101p) {
        return l(O(abstractC1108x, AbstractC1094i.f(inputStream), c1101p));
    }

    public static AbstractC1108x M(AbstractC1108x abstractC1108x, byte[] bArr, C1101p c1101p) {
        return l(P(abstractC1108x, bArr, 0, bArr.length, c1101p));
    }

    public static AbstractC1108x N(AbstractC1108x abstractC1108x, AbstractC1093h abstractC1093h, C1101p c1101p) {
        AbstractC1094i U6 = abstractC1093h.U();
        AbstractC1108x O6 = O(abstractC1108x, U6, c1101p);
        try {
            U6.a(0);
            return O6;
        } catch (A e7) {
            throw e7.k(O6);
        }
    }

    public static AbstractC1108x O(AbstractC1108x abstractC1108x, AbstractC1094i abstractC1094i, C1101p c1101p) {
        AbstractC1108x J6 = abstractC1108x.J();
        try {
            e0 d7 = a0.a().d(J6);
            d7.j(J6, C1095j.O(abstractC1094i), c1101p);
            d7.b(J6);
            return J6;
        } catch (A e7) {
            e = e7;
            if (e.a()) {
                e = new A(e);
            }
            throw e.k(J6);
        } catch (j0 e8) {
            throw e8.a().k(J6);
        } catch (IOException e9) {
            if (e9.getCause() instanceof A) {
                throw ((A) e9.getCause());
            }
            throw new A(e9).k(J6);
        } catch (RuntimeException e10) {
            if (e10.getCause() instanceof A) {
                throw ((A) e10.getCause());
            }
            throw e10;
        }
    }

    public static AbstractC1108x P(AbstractC1108x abstractC1108x, byte[] bArr, int i7, int i8, C1101p c1101p) {
        AbstractC1108x J6 = abstractC1108x.J();
        try {
            e0 d7 = a0.a().d(J6);
            d7.h(J6, bArr, i7, i7 + i8, new AbstractC1090e.a(c1101p));
            d7.b(J6);
            return J6;
        } catch (A e7) {
            e = e7;
            if (e.a()) {
                e = new A(e);
            }
            throw e.k(J6);
        } catch (j0 e8) {
            throw e8.a().k(J6);
        } catch (IOException e9) {
            if (e9.getCause() instanceof A) {
                throw ((A) e9.getCause());
            }
            throw new A(e9).k(J6);
        } catch (IndexOutOfBoundsException unused) {
            throw A.m().k(J6);
        }
    }

    public static void Q(Class cls, AbstractC1108x abstractC1108x) {
        abstractC1108x.F();
        defaultInstanceMap.put(cls, abstractC1108x);
    }

    public static AbstractC1108x l(AbstractC1108x abstractC1108x) {
        if (abstractC1108x == null || abstractC1108x.B()) {
            return abstractC1108x;
        }
        throw abstractC1108x.i().a().k(abstractC1108x);
    }

    public static AbstractC1110z.d u() {
        return b0.f();
    }

    public static AbstractC1108x v(Class cls) {
        AbstractC1108x abstractC1108x = defaultInstanceMap.get(cls);
        if (abstractC1108x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1108x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC1108x == null) {
            abstractC1108x = ((AbstractC1108x) o0.k(cls)).w();
            if (abstractC1108x == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC1108x);
        }
        return abstractC1108x;
    }

    public final boolean B() {
        return C(this, true);
    }

    public boolean D() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void E() {
        a0.a().d(this).b(this);
        F();
    }

    public void F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a H() {
        return (a) r(d.NEW_BUILDER);
    }

    public AbstractC1108x J() {
        return (AbstractC1108x) r(d.NEW_MUTABLE_INSTANCE);
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

    public final a T() {
        return ((a) r(d.NEW_BUILDER)).v(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public int a() {
        return e(null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1086a
    public int e(e0 e0Var) {
        if (!D()) {
            if (y() != Integer.MAX_VALUE) {
                return y();
            }
            int p7 = p(e0Var);
            S(p7);
            return p7;
        }
        int p8 = p(e0Var);
        if (p8 >= 0) {
            return p8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + p8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a0.a().d(this).d(this, (AbstractC1108x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public void g(AbstractC1096k abstractC1096k) {
        a0.a().d(this).i(this, C1097l.P(abstractC1096k));
    }

    public int hashCode() {
        if (D()) {
            return o();
        }
        if (z()) {
            R(o());
        }
        return x();
    }

    public Object k() {
        return r(d.BUILD_MESSAGE_INFO);
    }

    public void m() {
        this.memoizedHashCode = 0;
    }

    public void n() {
        S(Integer.MAX_VALUE);
    }

    public int o() {
        return a0.a().d(this).g(this);
    }

    public final int p(e0 e0Var) {
        return e0Var == null ? a0.a().d(this).e(this) : e0Var.e(this);
    }

    public final a q() {
        return (a) r(d.NEW_BUILDER);
    }

    public Object r(d dVar) {
        return t(dVar, null, null);
    }

    public Object s(d dVar, Object obj) {
        return t(dVar, obj, null);
    }

    public abstract Object t(d dVar, Object obj, Object obj2);

    public String toString() {
        return Q.f(this, super.toString());
    }

    public final AbstractC1108x w() {
        return (AbstractC1108x) r(d.GET_DEFAULT_INSTANCE);
    }

    public int x() {
        return this.memoizedHashCode;
    }

    public int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean z() {
        return x() == 0;
    }
}
