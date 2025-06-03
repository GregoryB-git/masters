/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.CancellationSignal
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package A;

import A.n;
import A.o;
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
import t.h;
import z.e;

public class j
extends n {
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;

    static {
        Class class_;
        Class class_2;
        Constructor constructor;
        Class class_3;
        block3 : {
            try {
                class_2 = Class.forName((String)"android.graphics.FontFamily");
                constructor = class_2.getConstructor(new Class[0]);
                class_3 = Integer.TYPE;
                class_ = class_2.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, class_3, List.class, class_3, Boolean.TYPE});
                class_3 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance((Class)class_2, (int)1).getClass()});
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi24Impl", (String)class_2.getClass().getName(), (Throwable)class_2);
            Object var4_6 = null;
            class_ = class_2 = (class_3 = null);
            constructor = class_2;
            class_2 = var4_6;
        }
        c = constructor;
        b = class_2;
        d = class_;
        e = class_3;
    }

    public static boolean h(Object object, ByteBuffer byteBuffer, int n8, int n9, boolean bl) {
        try {
            bl = (Boolean)d.invoke(object, new Object[]{byteBuffer, n8, null, n9, bl});
            return bl;
        }
        catch (IllegalAccessException | InvocationTargetException illegalAccessException) {
            return false;
        }
    }

    private static Typeface i(Object object) {
        try {
            Object object2 = Array.newInstance((Class)b, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            object = (Typeface)e.invoke((Object)null, new Object[]{object2});
            return object;
        }
        catch (IllegalAccessException | InvocationTargetException illegalAccessException) {
            return null;
        }
    }

    public static boolean j() {
        Method method = d;
        if (method == null) {
            Log.w((String)"TypefaceCompatApi24Impl", (String)"Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Object k() {
        try {
            return c.newInstance(new Object[0]);
        }
        catch (IllegalAccessException | InstantiationException | InvocationTargetException invocationTargetException) {
            return null;
        }
    }

    @Override
    public Typeface a(Context context, e.c arrd, Resources resources, int n8) {
        Object object = j.k();
        if (object == null) {
            return null;
        }
        for (e.d d8 : arrd.a()) {
            ByteBuffer byteBuffer = o.b(context, resources, d8.b());
            if (byteBuffer == null) {
                return null;
            }
            if (j.h(object, byteBuffer, d8.c(), d8.e(), d8.f())) continue;
            return null;
        }
        return j.i(object);
    }

    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] arrb, int n8) {
        Object object = j.k();
        if (object == null) {
            return null;
        }
        h h8 = new h();
        for (g.b b8 : arrb) {
            ByteBuffer byteBuffer;
            Uri uri = b8.d();
            ByteBuffer byteBuffer2 = byteBuffer = (ByteBuffer)h8.get((Object)uri);
            if (byteBuffer == null) {
                byteBuffer2 = o.f(context, cancellationSignal, uri);
                h8.put((Object)uri, (Object)byteBuffer2);
            }
            if (byteBuffer2 == null) {
                return null;
            }
            if (j.h(object, byteBuffer2, b8.c(), b8.e(), b8.f())) continue;
            return null;
        }
        context = j.i(object);
        if (context == null) {
            return null;
        }
        return Typeface.create((Typeface)context, (int)n8);
    }
}

