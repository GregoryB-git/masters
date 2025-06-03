package s0;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import s0.a;
import s0.o0;
import s0.r;
import s0.v;
import s0.v.a;

/* loaded from: classes.dex */
public abstract class v<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends s0.a<MessageType, BuilderType> {
    private static Map<Object, v<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public i1 unknownFields = i1.f;
    public int memoizedSerializedSize = -1;

    public static abstract class a<MessageType extends v<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0215a<MessageType, BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        public final MessageType f14106a;

        /* renamed from: b, reason: collision with root package name */
        public MessageType f14107b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f14108c = false;

        public a(MessageType messagetype) {
            this.f14106a = messagetype;
            this.f14107b = (MessageType) messagetype.k(f.NEW_MUTABLE_INSTANCE);
        }

        public static void k(v vVar, v vVar2) {
            y0 y0Var = y0.f14122c;
            y0Var.getClass();
            y0Var.a(vVar.getClass()).a(vVar, vVar2);
        }

        @Override // s0.p0
        public final v b() {
            return this.f14106a;
        }

        public final Object clone() {
            a aVar = (a) this.f14106a.k(f.NEW_BUILDER);
            MessageType i10 = i();
            aVar.j();
            k(aVar.f14107b, i10);
            return aVar;
        }

        public final MessageType h() {
            MessageType i10 = i();
            if (i10.f()) {
                return i10;
            }
            throw new g3.b();
        }

        public final MessageType i() {
            if (this.f14108c) {
                return this.f14107b;
            }
            MessageType messagetype = this.f14107b;
            messagetype.getClass();
            y0 y0Var = y0.f14122c;
            y0Var.getClass();
            y0Var.a(messagetype.getClass()).b(messagetype);
            this.f14108c = true;
            return this.f14107b;
        }

        public final void j() {
            if (this.f14108c) {
                MessageType messagetype = (MessageType) this.f14107b.k(f.NEW_MUTABLE_INSTANCE);
                k(messagetype, this.f14107b);
                this.f14107b = messagetype;
                this.f14108c = false;
            }
        }
    }

    public static class b<T extends v<T, ?>> extends s0.b<T> {
        public b(T t) {
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends v<MessageType, BuilderType> implements p0 {
        public r<d> extensions = r.f14072d;

        @Override // s0.v, s0.o0
        public final a a() {
            a aVar = (a) k(f.NEW_BUILDER);
            aVar.j();
            a.k(aVar.f14107b, this);
            return aVar;
        }

        @Override // s0.v, s0.p0
        public final v b() {
            return (v) k(f.GET_DEFAULT_INSTANCE);
        }

        @Override // s0.v, s0.o0
        public final a e() {
            return (a) k(f.NEW_BUILDER);
        }
    }

    public static final class d implements r.a<d> {
        @Override // s0.r.a
        public final void a() {
        }

        @Override // s0.r.a
        public final void b() {
        }

        @Override // s0.r.a
        public final void c() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // s0.r.a
        public final o1 d() {
            throw null;
        }

        @Override // s0.r.a
        public final void e() {
        }

        @Override // s0.r.a
        public final a j(o0.a aVar, o0 o0Var) {
            a aVar2 = (a) aVar;
            aVar2.j();
            a.k(aVar2.f14107b, (v) o0Var);
            return aVar2;
        }
    }

    public static class e<ContainingType extends o0, Type> extends e9.a {
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        /* JADX INFO: Fake field, exist only in values array */
        GET_PARSER
    }

    public static <T extends v<?, ?>> T l(Class<T> cls) {
        v<?, ?> vVar = defaultInstanceMap.get(cls);
        if (vVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                vVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (vVar == null) {
            vVar = (T) ((v) l1.a(cls)).k(f.GET_DEFAULT_INSTANCE);
            if (vVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, vVar);
        }
        return (T) vVar;
    }

    static Object m(Method method, Object obj, Object... objArr) {
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

    public static <T extends v<T, ?>> T n(T t, h hVar, n nVar) {
        T t10 = (T) t.k(f.NEW_MUTABLE_INSTANCE);
        try {
            y0 y0Var = y0.f14122c;
            y0Var.getClass();
            c1 a10 = y0Var.a(t10.getClass());
            i iVar = hVar.f13992d;
            if (iVar == null) {
                iVar = new i(hVar);
            }
            a10.i(t10, iVar, nVar);
            a10.b(t10);
            return t10;
        } catch (IOException e10) {
            if (e10.getCause() instanceof y) {
                throw ((y) e10.getCause());
            }
            throw new y(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof y) {
                throw ((y) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends v<?, ?>> void o(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // s0.o0
    public a a() {
        a aVar = (a) k(f.NEW_BUILDER);
        aVar.j();
        a.k(aVar.f14107b, this);
        return aVar;
    }

    @Override // s0.p0
    public v b() {
        return (v) k(f.GET_DEFAULT_INSTANCE);
    }

    @Override // s0.o0
    public final int d() {
        if (this.memoizedSerializedSize == -1) {
            y0 y0Var = y0.f14122c;
            y0Var.getClass();
            this.memoizedSerializedSize = y0Var.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // s0.o0
    public a e() {
        return (a) k(f.NEW_BUILDER);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((v) k(f.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        y0 y0Var = y0.f14122c;
        y0Var.getClass();
        return y0Var.a(getClass()).d(this, (v) obj);
    }

    @Override // s0.p0
    public final boolean f() {
        byte byteValue = ((Byte) k(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        y0 y0Var = y0.f14122c;
        y0Var.getClass();
        boolean c10 = y0Var.a(getClass()).c(this);
        k(f.SET_MEMOIZED_IS_INITIALIZED);
        return c10;
    }

    @Override // s0.o0
    public final void g(j jVar) {
        y0 y0Var = y0.f14122c;
        y0Var.getClass();
        c1 a10 = y0Var.a(getClass());
        k kVar = jVar.f14026b;
        if (kVar == null) {
            kVar = new k(jVar);
        }
        a10.h(this, kVar);
    }

    @Override // s0.a
    final int h() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        y0 y0Var = y0.f14122c;
        y0Var.getClass();
        int g10 = y0Var.a(getClass()).g(this);
        this.memoizedHashCode = g10;
        return g10;
    }

    @Override // s0.a
    final void j(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public abstract Object k(f fVar);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        q0.c(this, sb2, 0);
        return sb2.toString();
    }
}
