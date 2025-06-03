package x;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import b0.n;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import w.d;

/* loaded from: classes.dex */
public class h extends f {
    public final Class<?> f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor<?> f16509g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f16510h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f16511i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f16512j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f16513k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f16514l;

    public h() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m(cls2);
            method4 = n(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            StringBuilder l10 = defpackage.f.l("Unable to collect necessary methods for class ");
            l10.append(e10.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", l10.toString(), e10);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f = cls;
        this.f16509g = constructor;
        this.f16510h = method3;
        this.f16511i = method4;
        this.f16512j = method5;
        this.f16513k = method2;
        this.f16514l = method;
    }

    public static Method m(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method n(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // x.f, x.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        if (!l()) {
            return super.a(context, cVar, resources, i10);
        }
        try {
            obj = this.f16509g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0251d c0251d : cVar.f16147a) {
            if (!i(context, obj, c0251d.f16148a, c0251d.f16152e, c0251d.f16149b, c0251d.f16150c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0251d.f16151d))) {
                try {
                    this.f16513k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (k(obj)) {
            return j(obj);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [android.graphics.Typeface$Builder] */
    @Override // x.f, x.l
    public final Typeface b(Context context, n[] nVarArr, int i10) {
        Object obj;
        Typeface j10;
        boolean z10;
        if (nVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            n f = f(i10, nVarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f.f1696a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    final FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                    Typeface build = new Object(fileDescriptor) { // from class: android.graphics.Typeface$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ Typeface build();

                        public native /* synthetic */ Typeface$Builder setItalic(boolean z11);

                        public native /* synthetic */ Typeface$Builder setWeight(int i11);
                    }.setWeight(f.f1698c).setItalic(f.f1699d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (n nVar : nVarArr) {
            if (nVar.f1700e == 0) {
                Uri uri = nVar.f1696a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, m.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f16509g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = nVarArr.length;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < length) {
            n nVar2 = nVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(nVar2.f1696a);
            if (byteBuffer != null) {
                try {
                    z10 = ((Boolean) this.f16511i.invoke(obj, byteBuffer, Integer.valueOf(nVar2.f1697b), null, Integer.valueOf(nVar2.f1698c), Integer.valueOf(nVar2.f1699d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused3) {
                    z10 = false;
                }
                if (!z10) {
                    try {
                        this.f16513k.invoke(obj, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException unused4) {
                    }
                    return null;
                }
                z11 = true;
            }
            i11++;
            z11 = z11;
        }
        if (!z11) {
            try {
                this.f16513k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused5) {
            }
            return null;
        }
        if (k(obj) && (j10 = j(obj)) != null) {
            return Typeface.create(j10, i10);
        }
        return null;
    }

    @Override // x.l
    public final Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        Object obj;
        if (!l()) {
            return super.d(context, resources, i10, str, i11);
        }
        try {
            obj = this.f16509g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!i(context, obj, str, 0, -1, -1, null)) {
            try {
                this.f16513k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        }
        if (k(obj)) {
            return j(obj);
        }
        return null;
    }

    public final boolean i(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f16510h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f16514l.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f16512j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f16510h == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f16510h != null;
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
