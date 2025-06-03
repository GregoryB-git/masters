package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0754a;
import androidx.datastore.preferences.protobuf.AbstractC0777y;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0775w extends AbstractC0754a {
    private static Map<Object, AbstractC0775w> defaultInstanceMap = new ConcurrentHashMap();
    protected m0 unknownFields = m0.e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.w$a */
    public static abstract class a extends AbstractC0754a.AbstractC0155a {

        /* renamed from: o, reason: collision with root package name */
        public final AbstractC0775w f9186o;

        /* renamed from: p, reason: collision with root package name */
        public AbstractC0775w f9187p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f9188q = false;

        public a(AbstractC0775w abstractC0775w) {
            this.f9186o = abstractC0775w;
            this.f9187p = (AbstractC0775w) abstractC0775w.q(d.NEW_MUTABLE_INSTANCE);
        }

        public final AbstractC0775w s() {
            AbstractC0775w c7 = c();
            if (c7.x()) {
                return c7;
            }
            throw AbstractC0754a.AbstractC0155a.p(c7);
        }

        @Override // androidx.datastore.preferences.protobuf.O.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public AbstractC0775w c() {
            if (this.f9188q) {
                return this.f9187p;
            }
            this.f9187p.z();
            this.f9188q = true;
            return this.f9187p;
        }

        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a d7 = b().d();
            d7.y(c());
            return d7;
        }

        public void v() {
            if (this.f9188q) {
                AbstractC0775w abstractC0775w = (AbstractC0775w) this.f9187p.q(d.NEW_MUTABLE_INSTANCE);
                z(abstractC0775w, this.f9187p);
                this.f9187p = abstractC0775w;
                this.f9188q = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.P
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public AbstractC0775w b() {
            return this.f9186o;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0754a.AbstractC0155a
        /* renamed from: x, reason: merged with bridge method [inline-methods] */
        public a n(AbstractC0775w abstractC0775w) {
            return y(abstractC0775w);
        }

        public a y(AbstractC0775w abstractC0775w) {
            v();
            z(this.f9187p, abstractC0775w);
            return this;
        }

        public final void z(AbstractC0775w abstractC0775w, AbstractC0775w abstractC0775w2) {
            a0.a().d(abstractC0775w).a(abstractC0775w, abstractC0775w2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$b */
    public static class b extends AbstractC0755b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0775w f9189b;

        public b(AbstractC0775w abstractC0775w) {
            this.f9189b = abstractC0775w;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$c */
    public static class c extends AbstractC0766m {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.w$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC0777y.b A(AbstractC0777y.b bVar) {
        int size = bVar.size();
        return bVar.h(size == 0 ? 10 : size * 2);
    }

    public static Object C(O o7, String str, Object[] objArr) {
        return new c0(o7, str, objArr);
    }

    public static AbstractC0775w D(AbstractC0775w abstractC0775w, InputStream inputStream) {
        return o(E(abstractC0775w, AbstractC0761h.f(inputStream), C0768o.b()));
    }

    public static AbstractC0775w E(AbstractC0775w abstractC0775w, AbstractC0761h abstractC0761h, C0768o c0768o) {
        AbstractC0775w abstractC0775w2 = (AbstractC0775w) abstractC0775w.q(d.NEW_MUTABLE_INSTANCE);
        try {
            e0 d7 = a0.a().d(abstractC0775w2);
            d7.h(abstractC0775w2, C0762i.O(abstractC0761h), c0768o);
            d7.b(abstractC0775w2);
            return abstractC0775w2;
        } catch (IOException e7) {
            if (e7.getCause() instanceof C0778z) {
                throw ((C0778z) e7.getCause());
            }
            throw new C0778z(e7.getMessage()).i(abstractC0775w2);
        } catch (RuntimeException e8) {
            if (e8.getCause() instanceof C0778z) {
                throw ((C0778z) e8.getCause());
            }
            throw e8;
        }
    }

    public static void F(Class cls, AbstractC0775w abstractC0775w) {
        defaultInstanceMap.put(cls, abstractC0775w);
    }

    public static AbstractC0775w o(AbstractC0775w abstractC0775w) {
        if (abstractC0775w == null || abstractC0775w.x()) {
            return abstractC0775w;
        }
        throw abstractC0775w.k().a().i(abstractC0775w);
    }

    public static AbstractC0777y.b t() {
        return b0.f();
    }

    public static AbstractC0775w u(Class cls) {
        AbstractC0775w abstractC0775w = defaultInstanceMap.get(cls);
        if (abstractC0775w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0775w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC0775w == null) {
            abstractC0775w = ((AbstractC0775w) p0.i(cls)).b();
            if (abstractC0775w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0775w);
        }
        return abstractC0775w;
    }

    public static Object w(Method method, Object obj, Object... objArr) {
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

    public static final boolean y(AbstractC0775w abstractC0775w, boolean z7) {
        byte byteValue = ((Byte) abstractC0775w.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c7 = a0.a().d(abstractC0775w).c(abstractC0775w);
        if (z7) {
            abstractC0775w.r(d.SET_MEMOIZED_IS_INITIALIZED, c7 ? abstractC0775w : null);
        }
        return c7;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final a d() {
        return (a) q(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.O
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a f() {
        a aVar = (a) q(d.NEW_BUILDER);
        aVar.y(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = a0.a().d(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (b().getClass().isInstance(obj)) {
            return a0.a().d(this).d(this, (AbstractC0775w) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public void g(AbstractC0763j abstractC0763j) {
        a0.a().d(this).i(this, C0764k.P(abstractC0763j));
    }

    public int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        int g7 = a0.a().d(this).g(this);
        this.memoizedHashCode = g7;
        return g7;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0754a
    public int i() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0754a
    public void l(int i7) {
        this.memoizedSerializedSize = i7;
    }

    public Object n() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    public Object q(d dVar) {
        return s(dVar, null, null);
    }

    public Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return Q.e(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC0775w b() {
        return (AbstractC0775w) q(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    public void z() {
        a0.a().d(this).b(this);
    }
}
