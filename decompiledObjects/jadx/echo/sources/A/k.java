package A;

import F.g;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import z.e;

/* loaded from: classes.dex */
public class k extends i {

    /* renamed from: g, reason: collision with root package name */
    public final Class f22g;

    /* renamed from: h, reason: collision with root package name */
    public final Constructor f23h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f24i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f25j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f26k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f27l;

    /* renamed from: m, reason: collision with root package name */
    public final Method f28m;

    public k() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = v();
            constructor = w(cls);
            method = s(cls);
            method2 = t(cls);
            method3 = x(cls);
            method4 = r(cls);
            method5 = u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e7.getClass().getName(), e7);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f22g = cls;
        this.f23h = constructor;
        this.f24i = method;
        this.f25j = method2;
        this.f26k = method3;
        this.f27l = method4;
        this.f28m = method5;
    }

    @Override // A.i, A.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        if (!q()) {
            return super.a(context, cVar, resources, i7);
        }
        Object l7 = l();
        if (l7 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!n(context, l7, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(l7);
                return null;
            }
        }
        if (p(l7)) {
            return i(l7);
        }
        return null;
    }

    @Override // A.i, A.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Typeface i8;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b g7 = g(bVarArr, i7);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(g7.d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(g7.e()).setItalic(g7.f()).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map h7 = o.h(context, bVarArr, cancellationSignal);
        Object l7 = l();
        if (l7 == null) {
            return null;
        }
        boolean z7 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = (ByteBuffer) h7.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(l7, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(l7);
                    return null;
                }
                z7 = true;
            }
        }
        if (!z7) {
            m(l7);
            return null;
        }
        if (p(l7) && (i8 = i(l7)) != null) {
            return Typeface.create(i8, i7);
        }
        return null;
    }

    @Override // A.n
    public Typeface d(Context context, Resources resources, int i7, String str, int i8) {
        if (!q()) {
            return super.d(context, resources, i7, str, i8);
        }
        Object l7 = l();
        if (l7 == null) {
            return null;
        }
        if (!n(context, l7, str, 0, -1, -1, null)) {
            m(l7);
            return null;
        }
        if (p(l7)) {
            return i(l7);
        }
        return null;
    }

    public Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f22g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f28m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object l() {
        try {
            return this.f23h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void m(Object obj) {
        try {
            this.f27l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean n(Context context, Object obj, String str, int i7, int i8, int i9, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f24i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o(Object obj, ByteBuffer byteBuffer, int i7, int i8, int i9) {
        try {
            return ((Boolean) this.f25j.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Integer.valueOf(i9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean p(Object obj) {
        try {
            return ((Boolean) this.f26k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean q() {
        if (this.f24i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f24i != null;
    }

    public Method r(Class cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    public Method s(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method t(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method u(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor w(Class cls) {
        return cls.getConstructor(new Class[0]);
    }

    public Method x(Class cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
