/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package T5;

import T5.b;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.io.File;

public abstract class c {
    public static String a(Context context) {
        File file;
        File file2 = file = context.getCodeCacheDir();
        if (file == null) {
            file2 = context.getCacheDir();
        }
        file = file2;
        if (file2 == null) {
            file = new File(c.b(context), "cache");
        }
        return file.getPath();
    }

    public static String b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(context).getPath();
        }
        return context.getApplicationInfo().dataDir;
    }

    public static String c(Context context) {
        File file;
        File file2 = file = context.getDir("flutter", 0);
        if (file == null) {
            file2 = new File(c.b(context), "app_flutter");
        }
        return file2.getPath();
    }

    public static String d(Context context) {
        File file;
        File file2 = file = context.getFilesDir();
        if (file == null) {
            file2 = new File(c.b(context), "files");
        }
        return file2.getPath();
    }
}

