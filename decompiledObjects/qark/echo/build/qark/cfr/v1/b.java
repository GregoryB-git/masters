/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Parcelable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package v1;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import t.a;
import v1.d;

public abstract class b {
    public final a a;
    public final a b;
    public final a c;

    public b(a a8, a a9, a a10) {
        this.a = a8;
        this.b = a9;
        this.c = a10;
    }

    public abstract void A(byte[] var1);

    public void B(byte[] arrby, int n8) {
        this.w(n8);
        this.A(arrby);
    }

    public abstract void C(CharSequence var1);

    public void D(CharSequence charSequence, int n8) {
        this.w(n8);
        this.C(charSequence);
    }

    public abstract void E(int var1);

    public void F(int n8, int n9) {
        this.w(n9);
        this.E(n8);
    }

    public abstract void G(Parcelable var1);

    public void H(Parcelable parcelable, int n8) {
        this.w(n8);
        this.G(parcelable);
    }

    public abstract void I(String var1);

    public void J(String string2, int n8) {
        this.w(n8);
        this.I(string2);
    }

    public void K(d d8, b b8) {
        IllegalAccessException illegalAccessException2;
        block8 : {
            InvocationTargetException invocationTargetException2;
            block7 : {
                NoSuchMethodException noSuchMethodException2;
                block6 : {
                    try {
                        this.e(d8.getClass()).invoke((Object)null, new Object[]{d8, b8});
                        return;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block6;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", (Throwable)classNotFoundException);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", (Throwable)noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", (Throwable)invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", (Throwable)illegalAccessException2);
    }

    public void L(d d8) {
        if (d8 == null) {
            this.I(null);
            return;
        }
        this.N(d8);
        b b8 = this.b();
        this.K(d8, b8);
        b8.a();
    }

    public void M(d d8, int n8) {
        this.w(n8);
        this.L(d8);
    }

    public final void N(d d8) {
        Class class_;
        try {
            class_ = this.c(d8.getClass());
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(d8.getClass().getSimpleName());
            stringBuilder.append(" does not have a Parcelizer");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)classNotFoundException);
        }
        this.I(class_.getName());
    }

    public abstract void a();

    public abstract b b();

    public final Class c(Class class_) {
        Class class_2;
        Class class_3 = class_2 = (Class)this.c.get(class_.getName());
        if (class_2 == null) {
            class_3 = Class.forName((String)String.format((String)"%s.%sParcelizer", (Object[])new Object[]{class_.getPackage().getName(), class_.getSimpleName()}), (boolean)false, (ClassLoader)class_.getClassLoader());
            this.c.put(class_.getName(), (Object)class_3);
        }
        return class_3;
    }

    public final Method d(String string2) {
        Method method;
        Method method2 = method = (Method)this.a.get(string2);
        if (method == null) {
            System.currentTimeMillis();
            method2 = Class.forName((String)string2, (boolean)true, (ClassLoader)b.class.getClassLoader()).getDeclaredMethod("read", new Class[]{b.class});
            this.a.put(string2, (Object)method2);
        }
        return method2;
    }

    public final Method e(Class class_) {
        Method method;
        Method method2 = method = (Method)this.b.get(class_.getName());
        if (method == null) {
            method2 = this.c(class_);
            System.currentTimeMillis();
            method2 = method2.getDeclaredMethod("write", new Class[]{class_, b.class});
            this.b.put(class_.getName(), (Object)method2);
        }
        return method2;
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public boolean h(boolean bl, int n8) {
        if (!this.m(n8)) {
            return bl;
        }
        return this.g();
    }

    public abstract byte[] i();

    public byte[] j(byte[] arrby, int n8) {
        if (!this.m(n8)) {
            return arrby;
        }
        return this.i();
    }

    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int n8) {
        if (!this.m(n8)) {
            return charSequence;
        }
        return this.k();
    }

    public abstract boolean m(int var1);

    public d n(String object, b b8) {
        IllegalAccessException illegalAccessException2;
        block8 : {
            InvocationTargetException invocationTargetException2;
            block7 : {
                NoSuchMethodException noSuchMethodException2;
                block6 : {
                    try {
                        object = (d)this.d((String)object).invoke((Object)null, new Object[]{b8});
                        return object;
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                    }
                    catch (NoSuchMethodException noSuchMethodException2) {
                        break block6;
                    }
                    catch (InvocationTargetException invocationTargetException2) {
                        break block7;
                    }
                    catch (IllegalAccessException illegalAccessException2) {
                        break block8;
                    }
                    throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", (Throwable)classNotFoundException);
                }
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", (Throwable)noSuchMethodException2);
            }
            if (invocationTargetException2.getCause() instanceof RuntimeException) {
                throw (RuntimeException)invocationTargetException2.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", (Throwable)invocationTargetException2);
        }
        throw new RuntimeException("VersionedParcel encountered IllegalAccessException", (Throwable)illegalAccessException2);
    }

    public abstract int o();

    public int p(int n8, int n9) {
        if (!this.m(n9)) {
            return n8;
        }
        return this.o();
    }

    public abstract Parcelable q();

    public Parcelable r(Parcelable parcelable, int n8) {
        if (!this.m(n8)) {
            return parcelable;
        }
        return this.q();
    }

    public abstract String s();

    public String t(String string2, int n8) {
        if (!this.m(n8)) {
            return string2;
        }
        return this.s();
    }

    public d u() {
        String string2 = this.s();
        if (string2 == null) {
            return null;
        }
        return this.n(string2, this.b());
    }

    public d v(d d8, int n8) {
        if (!this.m(n8)) {
            return d8;
        }
        return this.u();
    }

    public abstract void w(int var1);

    public void x(boolean bl, boolean bl2) {
    }

    public abstract void y(boolean var1);

    public void z(boolean bl, int n8) {
        this.w(n8);
        this.y(bl);
    }
}

