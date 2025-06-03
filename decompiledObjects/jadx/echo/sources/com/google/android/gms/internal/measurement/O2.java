package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class O2 {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static volatile W2.l f10531a;

        public static W2.l a(Context context) {
            W2.l lVar;
            W2.l a7;
            boolean isDeviceProtectedStorage;
            synchronized (a.class) {
                try {
                    lVar = f10531a;
                    if (lVar == null) {
                        new O2();
                        String str = Build.TYPE;
                        String str2 = Build.TAGS;
                        if (!str.equals("eng")) {
                            if (str.equals("userdebug")) {
                            }
                            a7 = W2.l.a();
                            lVar = a7;
                            f10531a = lVar;
                        }
                        if (!str2.contains("dev-keys")) {
                            if (str2.contains("test-keys")) {
                            }
                            a7 = W2.l.a();
                            lVar = a7;
                            f10531a = lVar;
                        }
                        if (AbstractC1081z2.a()) {
                            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                            if (!isDeviceProtectedStorage) {
                                context = context.createDeviceProtectedStorageContext();
                            }
                        }
                        a7 = O2.a(context);
                        lVar = a7;
                        f10531a = lVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return lVar;
        }
    }

    public static W2.l a(Context context) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            W2.l d7 = d(context);
            W2.l d8 = d7.c() ? W2.l.d(b(context, (File) d7.b())) : W2.l.a();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d8;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static K2 b(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                t.h hVar = new t.h();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        F2 f22 = new F2(hVar);
                        bufferedReader.close();
                        return f22;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String c7 = c(split[0]);
                        String decode = Uri.decode(c(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String c8 = c(split[2]);
                            str = Uri.decode(c8);
                            if (str.length() < 1024 || str == c8) {
                                hashMap.put(c8, str);
                            }
                        }
                        if (!hVar.containsKey(c7)) {
                            hVar.put(c7, new t.h());
                        }
                        ((t.h) hVar.get(c7)).put(decode, str);
                    }
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static final String c(String str) {
        return new String(str);
    }

    public static W2.l d(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? W2.l.d(file) : W2.l.a();
        } catch (RuntimeException e7) {
            Log.e("HermeticFileOverrides", "no data dir", e7);
            return W2.l.a();
        }
    }
}
