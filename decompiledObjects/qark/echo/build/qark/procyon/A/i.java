// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.system.ErrnoException;
import android.system.OsConstants;
import android.system.Os;
import android.content.ContentResolver;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import android.os.ParcelFileDescriptor;
import F.g;
import android.os.CancellationSignal;
import java.io.File;
import android.content.res.Resources;
import z.e;
import android.content.Context;
import java.lang.reflect.Executable;
import java.io.Serializable;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class i extends n
{
    public static Class b;
    public static Constructor c;
    public static Method d;
    public static Method e;
    public static boolean f = false;
    
    public static boolean h(final Object ex, final String s, final int i, final boolean b) {
        k();
        try {
            return (boolean)i.d.invoke(ex, s, i, b);
        }
        catch (InvocationTargetException ex) {}
        catch (IllegalAccessException ex2) {}
        throw new RuntimeException(ex);
    }
    
    private static Typeface i(Object cause) {
        k();
        try {
            final Object instance = Array.newInstance(i.b, 1);
            Array.set(instance, 0, cause);
            cause = (InvocationTargetException)i.e.invoke(null, instance);
            return (Typeface)cause;
        }
        catch (InvocationTargetException cause) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException(cause);
    }
    
    public static void k() {
        if (i.f) {
            return;
        }
        i.f = true;
        Serializable forName = null;
        Executable constructor = null;
        Executable method = null;
        Executable method2 = null;
        Label_0113: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = ((Class<?>)forName).getConstructor((Class<?>[])new Class[0]);
                method = ((Class)forName).getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>)forName, 1).getClass());
                break Label_0113;
            }
            catch (NoSuchMethodException forName) {}
            catch (ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi21Impl", ((Class<?>)forName).getClass().getName(), (Throwable)forName);
            final Throwable t = null;
            method2 = null;
            method = (constructor = method2);
            forName = t;
        }
        i.c = (Constructor)constructor;
        i.b = (Class)forName;
        i.d = (Method)method;
        i.e = (Method)method2;
    }
    
    private static Object l() {
        k();
        InvocationTargetException instance = null;
        try {
            instance = i.c.newInstance(new Object[0]);
            return instance;
        }
        catch (InvocationTargetException instance) {}
        catch (InstantiationException instance) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException(instance);
    }
    
    @Override
    public Typeface a(final Context context, e.c e, final Resources resources, int i) {
        final Object l = l();
        final e.d[] a = e.a();
        final int length = a.length;
        i = 0;
        while (i < length) {
            final e.d d = a[i];
            e = (e.c)o.e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!o.c((File)e, resources, d.b())) {
                    return null;
                }
                final boolean h = h(l, ((File)e).getPath(), d.e(), d.f());
                ((File)e).delete();
                if (!h) {
                    return null;
                }
                ++i;
                continue;
            }
            catch (RuntimeException ex) {}
            finally {
                ((File)e).delete();
            }
            goto Label_0118;
        }
        goto Label_0125;
    }
    
    @Override
    public Typeface b(final Context context, CancellationSignal openFileDescriptor, g.b[] array, final int n) {
        if (array.length < 1) {
            return null;
        }
        final g.b g = this.g(array, n);
        final ContentResolver contentResolver = context.getContentResolver();
        try {
            openFileDescriptor = (CancellationSignal)contentResolver.openFileDescriptor(g.d(), "r", openFileDescriptor);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                return null;
            }
            Label_0084: {
                try {
                    final File j = this.j((ParcelFileDescriptor)openFileDescriptor);
                    if (j != null && j.canRead()) {
                        final Typeface fromFile = Typeface.createFromFile(j);
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                        return fromFile;
                    }
                    break Label_0084;
                }
                finally {
                    try {
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                    }
                    finally {
                        final Throwable exception;
                        ((Throwable)context).addSuppressed(exception);
                    }
                    array = (g.b[])(Object)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                    try {
                        final Typeface c = super.c(context, (InputStream)(Object)array);
                        ((FileInputStream)(Object)array).close();
                        ((ParcelFileDescriptor)openFileDescriptor).close();
                        return c;
                    }
                    finally {
                        try {
                            ((FileInputStream)(Object)array).close();
                        }
                        finally {
                            final Throwable exception2;
                            ((Throwable)context).addSuppressed(exception2);
                        }
                    }
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public final File j(final ParcelFileDescriptor parcelFileDescriptor) {
        try {
            final StringBuilder sb = new StringBuilder();
            sb.append("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            final String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        }
        catch (ErrnoException ex) {
            return null;
        }
    }
}
