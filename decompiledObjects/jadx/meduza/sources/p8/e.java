package p8;

import android.content.Context;
import android.util.Log;
import defpackage.f;
import j8.g;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f13040a;

    /* renamed from: b, reason: collision with root package name */
    public final File f13041b;

    /* renamed from: c, reason: collision with root package name */
    public final File f13042c;

    /* renamed from: d, reason: collision with root package name */
    public final File f13043d;

    /* renamed from: e, reason: collision with root package name */
    public final File f13044e;
    public final File f;

    /* renamed from: g, reason: collision with root package name */
    public final File f13045g;

    public e(Context context) {
        String str;
        String c10 = g8.e.f5913a.c(context).c();
        this.f13040a = c10;
        File filesDir = context.getFilesDir();
        this.f13041b = filesDir;
        if (!c10.isEmpty()) {
            StringBuilder l10 = f.l(".crashlytics.v3");
            l10.append(File.separator);
            l10.append(c10.length() > 40 ? g.i(c10) : c10.replaceAll("[^a-zA-Z0-9.]", "_"));
            str = l10.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, str);
        c(file);
        this.f13042c = file;
        File file2 = new File(file, "open-sessions");
        c(file2);
        this.f13043d = file2;
        File file3 = new File(file, "reports");
        c(file3);
        this.f13044e = file3;
        File file4 = new File(file, "priority-reports");
        c(file4);
        this.f = file4;
        File file5 = new File(file, "native-reports");
        c(file5);
        this.f13045g = file5;
    }

    public static synchronized void c(File file) {
        synchronized (e.class) {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        }
    }

    public static boolean d(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                d(file2);
            }
        }
        return file.delete();
    }

    public static <T> List<T> e(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final void a(String str) {
        File file = new File(this.f13041b, str);
        if (file.exists() && d(file)) {
            StringBuilder l10 = f.l("Deleted previous Crashlytics file system: ");
            l10.append(file.getPath());
            String sb2 = l10.toString();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", sb2, null);
            }
        }
    }

    public final File b(String str, String str2) {
        File file = new File(this.f13043d, str);
        file.mkdirs();
        return new File(file, str2);
    }
}
