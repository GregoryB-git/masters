/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.os.CancellationSignal
 *  android.os.ParcelFileDescriptor
 *  android.system.ErrnoException
 *  android.system.Os
 *  android.system.OsConstants
 *  android.system.StructStat
 *  android.util.Log
 *  java.io.File
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package A;

import A.n;
import A.o;
import F.g;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import android.util.Log;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import z.e;

public class i
extends n {
    public static Class b;
    public static Constructor c;
    public static Method d;
    public static Method e;
    public static boolean f = false;

    public static boolean h(Object object, String string2, int n8, boolean bl) {
        void var0_3;
        i.k();
        try {
            bl = (Boolean)d.invoke(object, new Object[]{string2, n8, bl});
            return bl;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_3);
    }

    private static Typeface i(Object object) {
        void var0_3;
        i.k();
        try {
            Object object2 = Array.newInstance((Class)b, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            object = (Typeface)e.invoke((Object)null, new Object[]{object2});
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_3);
    }

    public static void k() {
        Class class_;
        Method method;
        Class class_2;
        Constructor constructor;
        block4 : {
            if (f) {
                return;
            }
            f = true;
            try {
                class_2 = Class.forName((String)"android.graphics.FontFamily");
                constructor = class_2.getConstructor(new Class[0]);
                class_ = class_2.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance((Class)class_2, (int)1).getClass()});
                break block4;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi21Impl", (String)class_2.getClass().getName(), (Throwable)class_2);
            Object var4_6 = null;
            method = null;
            class_ = class_2 = method;
            constructor = class_2;
            class_2 = var4_6;
        }
        c = constructor;
        b = class_2;
        d = class_;
        e = method;
    }

    private static Object l() {
        void var0_4;
        i.k();
        try {
            Object object = c.newInstance(new Object[0]);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_4);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    @Override
    public Typeface a(Context var1_1, e.c var2_4, Resources var3_5, int var4_6) {
        block8 : {
            var7_7 = i.l();
            for (e.d var9_11 : var2_4.a()) {
                block7 : {
                    var2_4 = o.e(var1_1);
                    if (var2_4 == null) {
                        return null;
                    }
                    var6_10 = o.c((File)var2_4, var3_5, var9_11.b());
                    if (var6_10) break block7;
                    var2_4.delete();
                    return null;
                }
                try {
                    var6_10 = i.h(var7_7, var2_4.getPath(), var9_11.e(), var9_11.f());
                }
                catch (Throwable var1_2) {
                    var2_4.delete();
                    throw var1_2;
                }
                var2_4.delete();
                if (var6_10) continue;
                return null;
            }
            break block8;
lbl21: // 1 sources:
            do {
                var2_4.delete();
                return null;
                break;
            } while (true);
        }
        return i.i(var7_7);
        catch (RuntimeException var1_3) {
            ** continue;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] object, int n8) {
        Throwable throwable422;
        block18 : {
            block17 : {
                if (object.length < 1) {
                    return null;
                }
                object = this.g((g.b[])object, n8);
                ContentResolver contentResolver = context.getContentResolver();
                cancellationSignal = contentResolver.openFileDescriptor(object.d(), "r", cancellationSignal);
                if (cancellationSignal != null) break block17;
                if (cancellationSignal == null) return null;
                cancellationSignal.close();
                return null;
                {
                    catch (IOException iOException) {
                        return null;
                    }
                }
            }
            object = this.j((ParcelFileDescriptor)cancellationSignal);
            if (object == null || !object.canRead()) break block18;
            context = Typeface.createFromFile((File)object);
            cancellationSignal.close();
            return context;
        }
        object = new FileInputStream(cancellationSignal.getFileDescriptor());
        context = super.c(context, (InputStream)object);
        object.close();
        cancellationSignal.close();
        return context;
        catch (Throwable throwable2) {
            try {
                object.close();
                throw throwable2;
            }
            catch (Throwable throwable3) {
                try {
                    throwable2.addSuppressed(throwable3);
                    throw throwable2;
                }
                catch (Throwable throwable422) {}
            }
        }
        try {
            cancellationSignal.close();
            throw throwable422;
        }
        catch (Throwable throwable5) {
            throwable422.addSuppressed(throwable5);
            throw throwable422;
        }
    }

    public final File j(ParcelFileDescriptor object) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("/proc/self/fd/");
            stringBuilder.append(object.getFd());
            object = Os.readlink((String)stringBuilder.toString());
            if (OsConstants.S_ISREG((int)Os.stat((String)object).st_mode)) {
                object = new File((String)object);
                return object;
            }
            return null;
        }
        catch (ErrnoException errnoException) {
            return null;
        }
    }
}

