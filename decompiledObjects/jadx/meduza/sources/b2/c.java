package b2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import defpackage.g;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final r.b<String, Method> f1811a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b<String, Method> f1812b;

    /* renamed from: c, reason: collision with root package name */
    public final r.b<String, Class> f1813c;

    public c(r.b<String, Method> bVar, r.b<String, Method> bVar2, r.b<String, Class> bVar3) {
        this.f1811a = bVar;
        this.f1812b = bVar2;
        this.f1813c = bVar3;
    }

    public abstract void A(boolean z10);

    public final void B(int i10, Bundle bundle) {
        y(i10);
        C(bundle);
    }

    public abstract void C(Bundle bundle);

    public abstract void D(byte[] bArr);

    public abstract void E(CharSequence charSequence);

    public final void F(int i10, Collection collection) {
        int i11;
        y(i10);
        if (collection == null) {
            H(-1);
            return;
        }
        int size = collection.size();
        H(size);
        if (size > 0) {
            Object next = collection.iterator().next();
            if (next instanceof String) {
                i11 = 4;
            } else if (next instanceof Parcelable) {
                i11 = 2;
            } else if (next instanceof e) {
                i11 = 1;
            } else if (next instanceof Serializable) {
                i11 = 3;
            } else if (next instanceof IBinder) {
                i11 = 5;
            } else if (next instanceof Integer) {
                i11 = 7;
            } else {
                if (!(next instanceof Float)) {
                    throw new IllegalArgumentException(next.getClass().getName() + " cannot be VersionedParcelled");
                }
                i11 = 8;
            }
            H(i11);
            switch (i11) {
                case 1:
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        Q((e) it.next());
                    }
                    return;
                case 2:
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        L((Parcelable) it2.next());
                    }
                    return;
                case 3:
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Serializable serializable = (Serializable) it3.next();
                        if (serializable == null) {
                            N(null);
                        } else {
                            String name = serializable.getClass().getName();
                            N(name);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(serializable);
                                objectOutputStream.close();
                                D(byteArrayOutputStream.toByteArray());
                            } catch (IOException e10) {
                                throw new RuntimeException(g.e("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e10);
                            }
                        }
                    }
                    return;
                case 4:
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        N((String) it4.next());
                    }
                    return;
                case 5:
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        P((IBinder) it5.next());
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        H(((Integer) it6.next()).intValue());
                    }
                    return;
                case 8:
                    Iterator it7 = collection.iterator();
                    while (it7.hasNext()) {
                        G(((Float) it7.next()).floatValue());
                    }
                    return;
            }
        }
    }

    public abstract void G(float f);

    public abstract void H(int i10);

    public final void I(int i10, int i11) {
        y(i11);
        H(i10);
    }

    public final void J(int i10, long j10) {
        y(i10);
        K(j10);
    }

    public abstract void K(long j10);

    public abstract void L(Parcelable parcelable);

    public final void M(Parcelable parcelable, int i10) {
        y(i10);
        L(parcelable);
    }

    public abstract void N(String str);

    public final void O(int i10, String str) {
        y(i10);
        N(str);
    }

    public abstract void P(IBinder iBinder);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(e eVar) {
        if (eVar == null) {
            N(null);
            return;
        }
        try {
            N(b(eVar.getClass()).getName());
            d a10 = a();
            try {
                d(eVar.getClass()).invoke(null, eVar, a10);
                a10.S();
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
            } catch (NoSuchMethodException e12) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
            } catch (InvocationTargetException e13) {
                if (!(e13.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
                }
                throw ((RuntimeException) e13.getCause());
            }
        } catch (ClassNotFoundException e14) {
            throw new RuntimeException(eVar.getClass().getSimpleName() + " does not have a Parcelizer", e14);
        }
    }

    public final void R(e eVar, int i10) {
        y(i10);
        Q(eVar);
    }

    public abstract d a();

    public final Class b(Class<? extends e> cls) {
        Class orDefault = this.f1813c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1813c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) {
        Method orDefault = this.f1811a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, c.class.getClassLoader()).getDeclaredMethod("read", c.class);
        this.f1811a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        Method orDefault = this.f1812b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b10 = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b10.getDeclaredMethod("write", cls, c.class);
        this.f1812b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public final boolean f(int i10, boolean z10) {
        return !l(i10) ? z10 : e();
    }

    public abstract Bundle g();

    public final Bundle h(int i10, Bundle bundle) {
        return !l(i10) ? bundle : g();
    }

    public abstract byte[] i();

    public abstract CharSequence j();

    public final <T, S extends Collection<T>> S k(S s10) {
        Serializable serializable;
        int n2 = n();
        if (n2 < 0) {
            return null;
        }
        if (n2 != 0) {
            int n10 = n();
            if (n2 < 0) {
                return null;
            }
            if (n10 == 1) {
                while (n2 > 0) {
                    s10.add(w());
                    n2--;
                }
            } else if (n10 == 2) {
                while (n2 > 0) {
                    s10.add(r());
                    n2--;
                }
            } else if (n10 == 3) {
                while (n2 > 0) {
                    String t = t();
                    if (t == null) {
                        serializable = null;
                    } else {
                        try {
                            serializable = (Serializable) new b(new ByteArrayInputStream(i())).readObject();
                        } catch (IOException e10) {
                            throw new RuntimeException(g.e("VersionedParcelable encountered IOException reading a Serializable object (name = ", t, ")"), e10);
                        } catch (ClassNotFoundException e11) {
                            throw new RuntimeException(g.e("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", t, ")"), e11);
                        }
                    }
                    s10.add(serializable);
                    n2--;
                }
            } else if (n10 == 4) {
                while (n2 > 0) {
                    s10.add(t());
                    n2--;
                }
            } else if (n10 == 5) {
                while (n2 > 0) {
                    s10.add(v());
                    n2--;
                }
            }
        }
        return s10;
    }

    public abstract boolean l(int i10);

    public abstract float m();

    public abstract int n();

    public final int o(int i10, int i11) {
        return !l(i11) ? i10 : n();
    }

    public abstract long p();

    public final long q(int i10, long j10) {
        return !l(i10) ? j10 : p();
    }

    public abstract <T extends Parcelable> T r();

    public final <T extends Parcelable> T s(T t, int i10) {
        return !l(i10) ? t : (T) r();
    }

    public abstract String t();

    public final String u(int i10, String str) {
        return !l(i10) ? str : t();
    }

    public abstract IBinder v();

    public final <T extends e> T w() {
        String t = t();
        if (t == null) {
            return null;
        }
        try {
            return (T) c(t).invoke(null, a());
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    public final <T extends e> T x(T t, int i10) {
        return !l(i10) ? t : (T) w();
    }

    public abstract void y(int i10);

    public final void z(int i10, boolean z10) {
        y(i10);
        A(z10);
    }
}
