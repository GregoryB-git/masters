// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package v1;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Parcelable;
import t.a;

public abstract class b
{
    public final a a;
    public final a b;
    public final a c;
    
    public b(final a a, final a b, final a c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public abstract void A(final byte[] p0);
    
    public void B(final byte[] array, final int n) {
        this.w(n);
        this.A(array);
    }
    
    public abstract void C(final CharSequence p0);
    
    public void D(final CharSequence charSequence, final int n) {
        this.w(n);
        this.C(charSequence);
    }
    
    public abstract void E(final int p0);
    
    public void F(final int n, final int n2) {
        this.w(n2);
        this.E(n);
    }
    
    public abstract void G(final Parcelable p0);
    
    public void H(final Parcelable parcelable, final int n) {
        this.w(n);
        this.G(parcelable);
    }
    
    public abstract void I(final String p0);
    
    public void J(final String s, final int n) {
        this.w(n);
        this.I(s);
    }
    
    public void K(final d d, final b b) {
        try {
            this.e(d.getClass()).invoke(null, d, b);
            return;
        }
        catch (ClassNotFoundException cause) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", cause);
        }
        catch (NoSuchMethodException cause2) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", cause2);
        }
        catch (InvocationTargetException cause3) {
            if (cause3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)cause3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", cause3);
        }
        catch (IllegalAccessException ex) {}
        final IllegalAccessException cause4;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", cause4);
    }
    
    public void L(final d d) {
        if (d == null) {
            this.I(null);
            return;
        }
        this.N(d);
        final b b = this.b();
        this.K(d, b);
        b.a();
    }
    
    public void M(final d d, final int n) {
        this.w(n);
        this.L(d);
    }
    
    public final void N(final d d) {
        try {
            this.I(this.c(d.getClass()).getName());
        }
        catch (ClassNotFoundException cause) {
            final StringBuilder sb = new StringBuilder();
            sb.append(d.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    public abstract void a();
    
    public abstract b b();
    
    public final Class c(final Class clazz) {
        Class<?> forName;
        if ((forName = (Class<?>)this.c.get(clazz.getName())) == null) {
            forName = Class.forName(String.format("%s.%sParcelizer", clazz.getPackage().getName(), clazz.getSimpleName()), false, clazz.getClassLoader());
            this.c.put(clazz.getName(), forName);
        }
        return forName;
    }
    
    public final Method d(final String name) {
        Method declaredMethod;
        if ((declaredMethod = (Method)this.a.get(name)) == null) {
            System.currentTimeMillis();
            declaredMethod = Class.forName(name, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
            this.a.put(name, declaredMethod);
        }
        return declaredMethod;
    }
    
    public final Method e(final Class clazz) {
        Method declaredMethod;
        if ((declaredMethod = (Method)this.b.get(clazz.getName())) == null) {
            final Class c = this.c(clazz);
            System.currentTimeMillis();
            declaredMethod = c.getDeclaredMethod("write", clazz, b.class);
            this.b.put(clazz.getName(), declaredMethod);
        }
        return declaredMethod;
    }
    
    public boolean f() {
        return false;
    }
    
    public abstract boolean g();
    
    public boolean h(final boolean b, final int n) {
        if (!this.m(n)) {
            return b;
        }
        return this.g();
    }
    
    public abstract byte[] i();
    
    public byte[] j(final byte[] array, final int n) {
        if (!this.m(n)) {
            return array;
        }
        return this.i();
    }
    
    public abstract CharSequence k();
    
    public CharSequence l(final CharSequence charSequence, final int n) {
        if (!this.m(n)) {
            return charSequence;
        }
        return this.k();
    }
    
    public abstract boolean m(final int p0);
    
    public d n(final String s, final b b) {
        try {
            return (d)this.d(s).invoke(null, b);
        }
        catch (ClassNotFoundException cause) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", cause);
        }
        catch (NoSuchMethodException cause2) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", cause2);
        }
        catch (InvocationTargetException cause3) {
            if (cause3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)cause3.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", cause3);
        }
        catch (IllegalAccessException ex) {}
        final IllegalAccessException cause4;
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", cause4);
    }
    
    public abstract int o();
    
    public int p(final int n, final int n2) {
        if (!this.m(n2)) {
            return n;
        }
        return this.o();
    }
    
    public abstract Parcelable q();
    
    public Parcelable r(final Parcelable parcelable, final int n) {
        if (!this.m(n)) {
            return parcelable;
        }
        return this.q();
    }
    
    public abstract String s();
    
    public String t(final String s, final int n) {
        if (!this.m(n)) {
            return s;
        }
        return this.s();
    }
    
    public d u() {
        final String s = this.s();
        if (s == null) {
            return null;
        }
        return this.n(s, this.b());
    }
    
    public d v(final d d, final int n) {
        if (!this.m(n)) {
            return d;
        }
        return this.u();
    }
    
    public abstract void w(final int p0);
    
    public void x(final boolean b, final boolean b2) {
    }
    
    public abstract void y(final boolean p0);
    
    public void z(final boolean b, final int n) {
        this.w(n);
        this.y(b);
    }
}
