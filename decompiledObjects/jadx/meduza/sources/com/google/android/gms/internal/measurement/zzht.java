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
import n7.a;
import n7.h;
import n7.l;

/* loaded from: classes.dex */
public final class zzht {

    public static class zza {
        private static volatile h<zzhr> zza;

        private zza() {
        }

        public static h<zzhr> zza(Context context) {
            h<zzhr> zza2;
            boolean isDeviceProtectedStorage;
            h<zzhr> hVar = zza;
            if (hVar == null) {
                synchronized (zza.class) {
                    hVar = zza;
                    if (hVar == null) {
                        new zzht();
                        if (zzhu.zza(Build.TYPE, Build.TAGS)) {
                            if (zzhg.zza()) {
                                isDeviceProtectedStorage = context.isDeviceProtectedStorage();
                                if (!isDeviceProtectedStorage) {
                                    context = context.createDeviceProtectedStorageContext();
                                }
                            }
                            zza2 = zzht.zza(context);
                        } else {
                            zza2 = a.f11274a;
                        }
                        zza = zza2;
                        hVar = zza2;
                    }
                }
            }
            return hVar;
        }
    }

    private static zzhr zza(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                r.h hVar = new r.h();
                HashMap hashMap = new HashMap();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzhm zzhmVar = new zzhm(hVar);
                        bufferedReader.close();
                        return zzhmVar;
                    }
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        r.h hVar2 = (r.h) hVar.getOrDefault(zza2, null);
                        if (hVar2 == null) {
                            hVar2 = new r.h();
                            hVar.put(zza2, hVar2);
                        }
                        hVar2.put(decode, str);
                    }
                }
            } finally {
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }

    private static h<File> zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? new l(file) : a.f11274a;
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return a.f11274a;
        }
    }

    public static h<zzhr> zza(Context context) {
        h<zzhr> hVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            h<File> zzb = zzb(context);
            if (zzb.b()) {
                zzhr zza2 = zza(context, zzb.a());
                zza2.getClass();
                hVar = new l<>(zza2);
            } else {
                hVar = a.f11274a;
            }
            return hVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
