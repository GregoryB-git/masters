package v1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.C1958a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C1958a f20110a;

    /* renamed from: b, reason: collision with root package name */
    public final C1958a f20111b;

    /* renamed from: c, reason: collision with root package name */
    public final C1958a f20112c;

    public b(C1958a c1958a, C1958a c1958a2, C1958a c1958a3) {
        this.f20110a = c1958a;
        this.f20111b = c1958a2;
        this.f20112c = c1958a3;
    }

    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i7) {
        w(i7);
        A(bArr);
    }

    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i7) {
        w(i7);
        C(charSequence);
    }

    public abstract void E(int i7);

    public void F(int i7, int i8) {
        w(i8);
        E(i7);
    }

    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i7) {
        w(i7);
        G(parcelable);
    }

    public abstract void I(String str);

    public void J(String str, int i7) {
        w(i7);
        I(str);
    }

    public void K(d dVar, b bVar) {
        try {
            e(dVar.getClass()).invoke(null, dVar, bVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (!(e10.getCause() instanceof RuntimeException)) {
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
            }
            throw ((RuntimeException) e10.getCause());
        }
    }

    public void L(d dVar) {
        if (dVar == null) {
            I(null);
            return;
        }
        N(dVar);
        b b7 = b();
        K(dVar, b7);
        b7.a();
    }

    public void M(d dVar, int i7) {
        w(i7);
        L(dVar);
    }

    public final void N(d dVar) {
        try {
            I(c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e7);
        }
    }

    public abstract void a();

    public abstract b b();

    public final Class c(Class cls) {
        Class cls2 = (Class) this.f20112c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f20112c.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        Method method = (Method) this.f20110a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        this.f20110a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) {
        Method method = (Method) this.f20111b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c7 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c7.getDeclaredMethod("write", cls, b.class);
        this.f20111b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean z7, int i7) {
        return !m(i7) ? z7 : g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i7) {
        return !m(i7) ? bArr : i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i7) {
        return !m(i7) ? charSequence : k();
    }

    public abstract boolean m(int i7);

    public d n(String str, b bVar) {
        try {
            return (d) d(str).invoke(null, bVar);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e8);
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e9);
        } catch (InvocationTargetException e10) {
            if (e10.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e10.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e10);
        }
    }

    public abstract int o();

    public int p(int i7, int i8) {
        return !m(i8) ? i7 : o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int i7) {
        return !m(i7) ? parcelable : q();
    }

    public abstract String s();

    public String t(String str, int i7) {
        return !m(i7) ? str : s();
    }

    public d u() {
        String s7 = s();
        if (s7 == null) {
            return null;
        }
        return n(s7, b());
    }

    public d v(d dVar, int i7) {
        return !m(i7) ? dVar : u();
    }

    public abstract void w(int i7);

    public abstract void y(boolean z7);

    public void z(boolean z7, int i7) {
        w(i7);
        y(z7);
    }

    public void x(boolean z7, boolean z8) {
    }
}
