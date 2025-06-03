package A;

import F.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z.e;

/* loaded from: classes.dex */
public class i extends n {

    /* renamed from: b, reason: collision with root package name */
    public static Class f13b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor f14c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f15d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f16e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f17f = false;

    public static boolean h(Object obj, String str, int i7, boolean z7) {
        k();
        try {
            return ((Boolean) f15d.invoke(obj, str, Integer.valueOf(i7), Boolean.valueOf(z7))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    private static Typeface i(Object obj) {
        k();
        try {
            Object newInstance = Array.newInstance((Class<?>) f13b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f16e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static void k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f17f) {
            return;
        }
        f17f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e7) {
            Log.e("TypefaceCompatApi21Impl", e7.getClass().getName(), e7);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f14c = constructor;
        f13b = cls;
        f15d = method2;
        f16e = method;
    }

    private static Object l() {
        k();
        try {
            return f14c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    @Override // A.n
    public Typeface a(Context context, e.c cVar, Resources resources, int i7) {
        Object l7 = l();
        for (e.d dVar : cVar.a()) {
            File e7 = o.e(context);
            if (e7 == null) {
                return null;
            }
            try {
                if (!o.c(e7, resources, dVar.b())) {
                    return null;
                }
                if (!h(l7, e7.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e7.delete();
            }
        }
        return i(l7);
    }

    @Override // A.n
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i7) {
        if (bVarArr.length < 1) {
            return null;
        }
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
                File j7 = j(openFileDescriptor);
                if (j7 != null && j7.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(j7);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    Typeface c7 = super.c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c7;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public final File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }
}
