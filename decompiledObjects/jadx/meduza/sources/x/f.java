package x;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import b0.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import w.d;

/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: a, reason: collision with root package name */
    public static Class<?> f16500a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor<?> f16501b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f16502c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f16503d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f16504e = false;

    public static boolean g(Object obj, String str, int i10, boolean z10) {
        h();
        try {
            return ((Boolean) f16502c.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static void h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f16504e) {
            return;
        }
        f16504e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f16501b = constructor;
        f16500a = cls;
        f16502c = method2;
        f16503d = method;
    }

    @Override // x.l
    public Typeface a(Context context, d.c cVar, Resources resources, int i10) {
        h();
        try {
            Object newInstance = f16501b.newInstance(new Object[0]);
            for (d.C0251d c0251d : cVar.f16147a) {
                File d10 = m.d(context);
                if (d10 == null) {
                    return null;
                }
                try {
                    if (!m.b(d10, resources, c0251d.f)) {
                        return null;
                    }
                    if (!g(newInstance, d10.getPath(), c0251d.f16149b, c0251d.f16150c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d10.delete();
                }
            }
            h();
            try {
                Object newInstance2 = Array.newInstance(f16500a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f16503d.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e10) {
                throw new RuntimeException(e10);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // x.l
    public Typeface b(Context context, n[] nVarArr, int i10) {
        File file;
        String readlink;
        if (nVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(f(i10, nVarArr).f1696a, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } catch (ErrnoException unused) {
                }
                try {
                    if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                        file = new File(readlink);
                        if (file != null && file.canRead()) {
                            Typeface createFromFile = Typeface.createFromFile(file);
                            openFileDescriptor.close();
                            return createFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                        Typeface c10 = c(context, fileInputStream);
                        fileInputStream.close();
                        openFileDescriptor.close();
                        return c10;
                    }
                    Typeface c102 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c102;
                } finally {
                }
                file = null;
                if (file != null) {
                    Typeface createFromFile2 = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile2;
                }
                FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused2) {
            return null;
        }
    }
}
