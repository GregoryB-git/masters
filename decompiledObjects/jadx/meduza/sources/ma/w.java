package ma;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ma.a;
import ma.a0;
import ma.f;
import ma.s;
import ma.s0;
import ma.w;
import ma.w.a;

/* loaded from: classes.dex */
public abstract class w<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends ma.a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    public static final int UNINITIALIZED_HASH_CODE = 0;
    public static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    public q1 unknownFields = q1.f;

    public static abstract class a<MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0163a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageType f11119a;

        /* renamed from: b, reason: collision with root package name */
        public MessageType f11120b;

        public a(MessageType messagetype) {
            this.f11119a = messagetype;
            if (messagetype.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f11120b = (MessageType) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        public static void o(w wVar, Object obj) {
            d1 d1Var = d1.f10940c;
            d1Var.getClass();
            d1Var.a(wVar.getClass()).a(wVar, obj);
        }

        @Override // ma.t0
        public final w b() {
            return this.f11119a;
        }

        public final Object clone() {
            a aVar = (a) this.f11119a.t(f.NEW_BUILDER);
            aVar.f11120b = l();
            return aVar;
        }

        @Override // ma.t0
        public final boolean f() {
            return w.x(this.f11120b, false);
        }

        public final MessageType k() {
            MessageType l10 = l();
            l10.getClass();
            if (w.x(l10, true)) {
                return l10;
            }
            throw new o1();
        }

        public final MessageType l() {
            if (!this.f11120b.y()) {
                return this.f11120b;
            }
            MessageType messagetype = this.f11120b;
            messagetype.getClass();
            d1 d1Var = d1.f10940c;
            d1Var.getClass();
            d1Var.a(messagetype.getClass()).b(messagetype);
            messagetype.z();
            return this.f11120b;
        }

        public final void m() {
            if (this.f11120b.y()) {
                return;
            }
            MessageType messagetype = (MessageType) this.f11119a.t(f.NEW_MUTABLE_INSTANCE);
            o(messagetype, this.f11120b);
            this.f11120b = messagetype;
        }

        public final void n(w wVar) {
            if (this.f11119a.equals(wVar)) {
                return;
            }
            m();
            o(this.f11120b, wVar);
        }
    }

    public static class b<T extends w<T, ?>> extends ma.b<T> {

        /* renamed from: a, reason: collision with root package name */
        public final T f11121a;

        public b(T t) {
            this.f11121a = t;
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends w<MessageType, BuilderType> implements t0 {
        public s<d> extensions = s.f11072d;

        @Override // ma.w, ma.s0
        public final /* bridge */ /* synthetic */ a a() {
            return a();
        }

        @Override // ma.w, ma.t0
        public final w b() {
            return (w) t(f.GET_DEFAULT_INSTANCE);
        }

        @Override // ma.w, ma.s0
        public final a e() {
            return (a) t(f.NEW_BUILDER);
        }
    }

    public static final class d implements s.a<d> {
        @Override // ma.s.a
        public final void a() {
        }

        @Override // ma.s.a
        public final void b() {
        }

        @Override // ma.s.a
        public final void c() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // ma.s.a
        public final w1 d() {
            throw null;
        }

        @Override // ma.s.a
        public final void e() {
        }

        @Override // ma.s.a
        public final a k(s0.a aVar, s0 s0Var) {
            a aVar2 = (a) aVar;
            aVar2.n((w) s0Var);
            return aVar2;
        }
    }

    public static class e<ContainingType extends s0, Type> extends e9.a {
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static <E> a0.d<E> A(a0.d<E> dVar) {
        int size = dVar.size();
        return dVar.c(size == 0 ? 10 : size * 2);
    }

    public static <T extends w<T, ?>> T B(T t, byte[] bArr) {
        int length = bArr.length;
        o a10 = o.a();
        T t10 = (T) t.t(f.NEW_MUTABLE_INSTANCE);
        try {
            d1 d1Var = d1.f10940c;
            d1Var.getClass();
            i1 a11 = d1Var.a(t10.getClass());
            a11.j(t10, bArr, 0, length + 0, new f.a(a10));
            a11.b(t10);
            p(t10);
            return t10;
        } catch (IOException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw new b0(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw b0.h();
        } catch (b0 e11) {
            if (e11.f10918b) {
                throw new b0(e11);
            }
            throw e11;
        } catch (o1 e12) {
            throw new b0(e12.getMessage());
        }
    }

    public static <T extends w<T, ?>> T C(T t, i iVar, o oVar) {
        T t10 = (T) t.t(f.NEW_MUTABLE_INSTANCE);
        try {
            d1 d1Var = d1.f10940c;
            d1Var.getClass();
            i1 a10 = d1Var.a(t10.getClass());
            j jVar = iVar.f10982d;
            if (jVar == null) {
                jVar = new j(iVar);
            }
            a10.i(t10, jVar, oVar);
            a10.b(t10);
            return t10;
        } catch (IOException e10) {
            if (e10.getCause() instanceof b0) {
                throw ((b0) e10.getCause());
            }
            throw new b0(e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof b0) {
                throw ((b0) e11.getCause());
            }
            throw e11;
        } catch (b0 e12) {
            if (e12.f10918b) {
                throw new b0(e12);
            }
            throw e12;
        } catch (o1 e13) {
            throw new b0(e13.getMessage());
        }
    }

    public static <T extends w<?, ?>> void D(Class<T> cls, T t) {
        t.z();
        defaultInstanceMap.put(cls, t);
    }

    public static void p(w wVar) {
        if (!x(wVar, true)) {
            throw new b0(new o1().getMessage());
        }
    }

    public static <T extends w<?, ?>> T u(Class<T> cls) {
        w<?, ?> wVar = defaultInstanceMap.get(cls);
        if (wVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                wVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (wVar == null) {
            wVar = (T) ((w) t1.b(cls)).t(f.GET_DEFAULT_INSTANCE);
            if (wVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, wVar);
        }
        return (T) wVar;
    }

    static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final <T extends w<T, ?>> boolean x(T t, boolean z10) {
        byte byteValue = ((Byte) t.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        d1 d1Var = d1.f10940c;
        d1Var.getClass();
        boolean c10 = d1Var.a(t.getClass()).c(t);
        if (z10) {
            t.t(f.SET_MEMOIZED_IS_INITIALIZED);
        }
        return c10;
    }

    @Override // ma.s0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final BuilderType a() {
        BuilderType buildertype = (BuilderType) t(f.NEW_BUILDER);
        buildertype.n(this);
        return buildertype;
    }

    @Override // ma.t0
    public w b() {
        return (w) t(f.GET_DEFAULT_INSTANCE);
    }

    @Override // ma.s0
    public final int d() {
        return m(null);
    }

    @Override // ma.s0
    public a e() {
        return (a) t(f.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d1 d1Var = d1.f10940c;
        d1Var.getClass();
        return d1Var.a(getClass()).d(this, (w) obj);
    }

    @Override // ma.t0
    public final boolean f() {
        return x(this, true);
    }

    public final int hashCode() {
        if (y()) {
            d1 d1Var = d1.f10940c;
            d1Var.getClass();
            return d1Var.a(getClass()).g(this);
        }
        if (this.memoizedHashCode == 0) {
            d1 d1Var2 = d1.f10940c;
            d1Var2.getClass();
            this.memoizedHashCode = d1Var2.a(getClass()).g(this);
        }
        return this.memoizedHashCode;
    }

    @Override // ma.s0
    public final void i(k kVar) {
        d1 d1Var = d1.f10940c;
        d1Var.getClass();
        i1 a10 = d1Var.a(getClass());
        l lVar = kVar.f11020b;
        if (lVar == null) {
            lVar = new l(kVar);
        }
        a10.h(this, lVar);
    }

    @Override // ma.a
    final int l() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // ma.a
    public final int m(i1 i1Var) {
        if (y()) {
            if (i1Var == null) {
                d1 d1Var = d1.f10940c;
                d1Var.getClass();
                i1Var = d1Var.a(getClass());
            }
            int e10 = i1Var.e(this);
            if (e10 >= 0) {
                return e10;
            }
            throw new IllegalStateException(defpackage.f.h("serialized size must be non-negative, was ", e10));
        }
        if (l() != Integer.MAX_VALUE) {
            return l();
        }
        if (i1Var == null) {
            d1 d1Var2 = d1.f10940c;
            d1Var2.getClass();
            i1Var = d1Var2.a(getClass());
        }
        int e11 = i1Var.e(this);
        o(e11);
        return e11;
    }

    @Override // ma.a
    final void o(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(defpackage.f.h("serialized size must be non-negative, was ", i10));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final void q() {
        this.memoizedHashCode = 0;
    }

    public final void r() {
        o(Integer.MAX_VALUE);
    }

    public final <MessageType extends w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    public abstract Object t(f fVar);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = u0.f11094a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        u0.c(this, sb2, 0);
        return sb2.toString();
    }

    public final b1<MessageType> v() {
        return (b1) t(f.GET_PARSER);
    }

    final boolean y() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void z() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }
}
