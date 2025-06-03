package A;

import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import z.e;

/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: b, reason: collision with root package name */
    public static final Class f18b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor f19c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f20d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f21e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi24Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f19c = constructor;
        f18b = cls;
        f20d = method2;
        f21e = method;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i7, int i8, boolean z7) {
        try {
            return ((Boolean) f20d.invoke(obj, byteBuffer, Integer.valueOf(i7), null, Integer.valueOf(i8), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface i(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) f18b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f21e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean j() {
        Method method = f20d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
        try {
            return f19c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // A.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        Object k7 = k();
        if (k7 == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            ByteBuffer b7 = o.b(context, resources, dVar.b());
            if (b7 == null || !h(k7, b7, dVar.c(), dVar.e(), dVar.f())) {
                return null;
            }
        }
        return i(k7);
    }

    @Override // A.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        Object k7 = k();
        if (k7 == null) {
            return null;
        }
        t.h hVar = new t.h();
        for (g.b bVar : bVarArr) {
            Uri d7 = bVar.d();
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(d7);
            if (byteBuffer == null) {
                byteBuffer = o.f(context, cancellationSignal, d7);
                hVar.put(d7, byteBuffer);
            }
            if (byteBuffer == null || !h(k7, byteBuffer, bVar.c(), bVar.e(), bVar.f())) {
                return null;
            }
        }
        Typeface i8 = i(k7);
        if (i8 == null) {
            return null;
        }
        return Typeface.create(i8, i7);
    }
}
