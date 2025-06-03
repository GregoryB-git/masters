// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A;

import android.net.Uri;
import t.h;
import F.g;
import android.os.CancellationSignal;
import android.content.res.Resources;
import z.e;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Executable;
import java.io.Serializable;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.util.List;
import java.nio.ByteBuffer;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class j extends n
{
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;
    
    static {
        Serializable forName = null;
        Executable constructor = null;
        Executable method = null;
        Executable method2 = null;
        Label_0113: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = ((Class<?>)forName).getConstructor((Class<?>[])new Class[0]);
                final Class<Integer> type = Integer.TYPE;
                method = ((Class)forName).getMethod("addFontWeightStyle", ByteBuffer.class, type, List.class, type, Boolean.TYPE);
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>)forName, 1).getClass());
                break Label_0113;
            }
            catch (NoSuchMethodException forName) {}
            catch (ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi24Impl", ((Class<?>)forName).getClass().getName(), (Throwable)forName);
            final Throwable t = null;
            method2 = null;
            method = (constructor = method2);
            forName = t;
        }
        c = (Constructor)constructor;
        b = (Class)forName;
        d = (Method)method;
        e = (Method)method2;
    }
    
    public static boolean h(final Object obj, final ByteBuffer byteBuffer, final int i, final int j, final boolean b) {
        try {
            return (boolean)j.d.invoke(obj, byteBuffer, i, null, j, b);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return false;
        }
    }
    
    private static Typeface i(final Object o) {
        try {
            final Object instance = Array.newInstance(j.b, 1);
            Array.set(instance, 0, o);
            return (Typeface)j.e.invoke(null, instance);
        }
        catch (IllegalAccessException | InvocationTargetException ex) {
            return null;
        }
    }
    
    public static boolean j() {
        final Method d = j.d;
        if (d == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return d != null;
    }
    
    private static Object k() {
        try {
            return j.c.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException ex) {
            return null;
        }
    }
    
    @Override
    public Typeface a(final Context context, final e.c c, final Resources resources, int i) {
        final Object k = k();
        if (k == null) {
            return null;
        }
        final e.d[] a = c.a();
        int length;
        e.d d;
        ByteBuffer b;
        for (length = a.length, i = 0; i < length; ++i) {
            d = a[i];
            b = o.b(context, resources, d.b());
            if (b == null) {
                return null;
            }
            if (!h(k, b, d.c(), d.e(), d.f())) {
                return null;
            }
        }
        return i(k);
    }
    
    @Override
    public Typeface b(final Context context, final CancellationSignal cancellationSignal, final g.b[] array, final int n) {
        final Object k = k();
        if (k == null) {
            return null;
        }
        final h h = new h();
        for (int length = array.length, i = 0; i < length; ++i) {
            final g.b b = array[i];
            final Uri d = b.d();
            ByteBuffer f;
            if ((f = (ByteBuffer)h.get(d)) == null) {
                f = o.f(context, cancellationSignal, d);
                h.put(d, f);
            }
            if (f == null) {
                return null;
            }
            if (!h(k, f, b.c(), b.e(), b.f())) {
                return null;
            }
        }
        final Typeface j = i(k);
        if (j == null) {
            return null;
        }
        return Typeface.create(j, n);
    }
}
