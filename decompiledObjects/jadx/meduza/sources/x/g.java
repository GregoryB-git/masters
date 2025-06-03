package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import b0.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import w.d;

/* loaded from: classes.dex */
public final class g extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f16505a;

    /* renamed from: b, reason: collision with root package name */
    public static final Constructor<?> f16506b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f16507c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f16508d;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi24Impl", e10.getClass().getName(), e10);
            cls = null;
            method = null;
            method2 = null;
        }
        f16506b = constructor;
        f16505a = cls;
        f16507c = method2;
        f16508d = method;
    }

    public static boolean g(Object obj, ByteBuffer byteBuffer, int i10, int i11, boolean z10) {
        try {
            return ((Boolean) f16507c.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // x.l
    public final Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        try {
            obj = f16506b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (d.C0251d c0251d : cVar.f16147a) {
            int i11 = c0251d.f;
            File d10 = m.d(context);
            if (d10 != null) {
                try {
                    if (m.b(d10, resources, i11)) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(d10);
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                            } finally {
                            }
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        if (mappedByteBuffer != null || !g(obj, mappedByteBuffer, c0251d.f16152e, c0251d.f16149b, c0251d.f16150c)) {
                            return null;
                        }
                    }
                } finally {
                    d10.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f16505a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f16508d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    @Override // x.l
    public final Typeface b(Context context, n[] nVarArr, int i10) {
        Object obj;
        Typeface typeface;
        try {
            obj = f16506b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        r.h hVar = new r.h();
        for (n nVar : nVarArr) {
            Uri uri = nVar.f1696a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = m.e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !g(obj, byteBuffer, nVar.f1697b, nVar.f1698c, nVar.f1699d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f16505a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f16508d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i10);
    }
}
