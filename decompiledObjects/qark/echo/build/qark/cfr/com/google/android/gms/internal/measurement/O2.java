/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build
 *  android.os.StrictMode
 *  android.os.StrictMode$ThreadPolicy
 *  android.util.Log
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.HashMap
 */
package com.google.android.gms.internal.measurement;

import W2.l;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.K2;
import com.google.android.gms.internal.measurement.M2;
import com.google.android.gms.internal.measurement.N2;
import com.google.android.gms.internal.measurement.z2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.util.HashMap;
import t.h;

public final class O2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static l a(Context object) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            l l8 = O2.d((Context)object);
            object = l8.c() ? l.d(O2.b((Context)object, (File)l8.b())) : l.a();
        }
        catch (Throwable throwable) {}
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        return object;
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static K2 b(Context object, File object2) {
        Object object3;
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader((InputStream)new FileInputStream((File)object2)));
        h h8 = new h();
        HashMap hashMap = new HashMap();
        while ((object3 = bufferedReader.readLine()) != null) {
            String string3;
            String string2;
            block17 : {
                Object object4;
                String[] arrstring;
                block18 : {
                    arrstring = object3.split(" ", 3);
                    if (arrstring.length != 3) {
                        object4 = new StringBuilder("Invalid: ");
                        object4.append((String)object3);
                        Log.e((String)"HermeticFileOverrides", (String)object4.toString());
                        continue;
                    }
                    string3 = O2.c(arrstring[0]);
                    string2 = Uri.decode((String)O2.c(arrstring[1]));
                    object3 = object4 = (String)hashMap.get((Object)arrstring[2]);
                    if (object4 != null) break block17;
                    object4 = Uri.decode((String)(arrstring = O2.c(arrstring[2])));
                    if (object4.length() < 1024) break block18;
                    object3 = object4;
                    if (object4 != arrstring) break block17;
                }
                hashMap.put((Object)arrstring, object4);
                object3 = object4;
            }
            if (!h8.containsKey(string3)) {
                h8.put(string3, new h());
            }
            ((h)h8.get(string3)).put(string2, object3);
        }
        object2 = String.valueOf((Object)object2);
        object = object.getPackageName();
        object3 = new StringBuilder("Parsed ");
        object3.append((String)object2);
        object3.append(" for Android package ");
        object3.append((String)object);
        Log.w((String)"HermeticFileOverrides", (String)object3.toString());
        object = new F2(h8);
        try {
            bufferedReader.close();
            return object;
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
        catch (Throwable throwable) {}
        try {
            bufferedReader.close();
        }
        catch (Throwable throwable) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke((Object)throwable, new Object[]{throwable});
            }
            catch (Exception exception) {}
        }
        throw throwable;
    }

    public static final String c(String string2) {
        return new String(string2);
    }

    public static l d(Context context) {
        try {
            context = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
        }
        catch (RuntimeException runtimeException) {
            Log.e((String)"HermeticFileOverrides", (String)"no data dir", (Throwable)runtimeException);
            return l.a();
        }
        if (context.exists()) {
            return l.d((Object)context);
        }
        return l.a();
    }

    public static abstract class a {
        public static volatile l a;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static l a(Context object) {
            synchronized (a.class) {
                try {
                    Object object2;
                    Object object3 = object2 = a;
                    if (object2 != null) return object3;
                    new O2();
                    object3 = Build.TYPE;
                    object2 = Build.TAGS;
                    if (!object3.equals((Object)"eng") && !object3.equals((Object)"userdebug") || !object2.contains((CharSequence)"dev-keys") && !object2.contains((CharSequence)"test-keys")) {
                        object = l.a();
                    } else {
                        object3 = object;
                        if (z2.a()) {
                            object3 = M2.a((Context)object) ? object : N2.a((Context)object);
                        }
                        object = O2.a((Context)object3);
                    }
                    a = object;
                    return object;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

}

