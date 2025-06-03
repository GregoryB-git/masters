/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.RequiresApi
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.B0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public abstract class y7 {
    @NonNull
    private static final B0 a = new B0();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @RequiresApi(api=21)
    public static String[] a(Context object, String string) {
        try {
            String string2;
            void var0_7;
            Object[] objectArray;
            PackageManager packageManager = object.getPackageManager();
            String string3 = object.getPackageName();
            int n7 = A2.a(24) ? 8192 : 0;
            PackageInfo packageInfo = packageManager.getPackageInfo(string3, n7 | 0x400);
            packageManager = new ArrayList(10);
            packageManager.add((Object)packageInfo.applicationInfo.sourceDir);
            Object[] objectArray2 = packageInfo.applicationInfo.splitSourceDirs;
            if (objectArray2 != null) {
                Collections.addAll((Collection)packageManager, (Object[])objectArray2);
            }
            if ((objectArray = packageInfo.applicationInfo.sharedLibraryFiles) != null) {
                Collections.addAll((Collection)packageManager, (Object[])objectArray);
            }
            ArrayList arrayList = new ArrayList(10);
            String string4 = packageInfo.applicationInfo.nativeLibraryDir;
            if (TextUtils.isEmpty((CharSequence)string4)) {
                Object var0_4 = null;
            } else {
                File file2 = new File(string4);
                file2 = file2.getParentFile();
            }
            if (var0_7 != null) {
                string4 = new File((File)var0_7, string2);
                arrayList.add((Object)string4.getPath());
                if (string2.startsWith("arm64")) {
                    string4 = new File((File)var0_7, "arm64");
                    arrayList.add((Object)string4.getPath());
                } else if (string2.startsWith("arm")) {
                    string4 = new File((File)var0_7, "arm");
                    arrayList.add((Object)string4.getPath());
                }
            }
            for (String string5 : packageManager) {
                if (!string5.endsWith(".apk")) continue;
                string4 = new StringBuilder();
                string4.append(string5);
                string4.append("!/lib/");
                string4.append(string2);
                arrayList.add((Object)string4.toString());
            }
            arrayList.add((Object)System.getProperty((String)"java.library.path"));
            arrayList.add((Object)packageInfo.applicationInfo.nativeLibraryDir);
            string2 = File.pathSeparator;
            String string6 = TextUtils.join((CharSequence)string2, (Iterable)packageManager);
            string2 = TextUtils.join((CharSequence)string2, (Iterable)arrayList);
            return new String[]{string6, string2};
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new RuntimeException((Throwable)nameNotFoundException);
        }
    }
}

