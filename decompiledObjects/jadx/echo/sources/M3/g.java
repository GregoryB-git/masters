package M3;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final File f3513a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3514b;

    /* renamed from: c, reason: collision with root package name */
    public final File f3515c;

    /* renamed from: d, reason: collision with root package name */
    public final File f3516d;

    /* renamed from: e, reason: collision with root package name */
    public final File f3517e;

    /* renamed from: f, reason: collision with root package name */
    public final File f3518f;

    public g(Context context) {
        String str;
        String processName;
        File filesDir = context.getFilesDir();
        this.f3513a = filesDir;
        if (v()) {
            StringBuilder sb = new StringBuilder();
            sb.append(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            processName = Application.getProcessName();
            sb.append(u(processName));
            str = sb.toString();
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q7 = q(new File(filesDir, str));
        this.f3514b = q7;
        this.f3515c = q(new File(q7, "open-sessions"));
        this.f3516d = q(new File(q7, "reports"));
        this.f3517e = q(new File(q7, "priority-reports"));
        this.f3518f = q(new File(q7, "native-reports"));
    }

    public static synchronized File q(File file) {
        synchronized (g.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return file;
                    }
                    E3.f.f().b("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                    file.delete();
                }
                if (!file.mkdirs()) {
                    E3.f.f().d("Could not create Crashlytics-specific directory: " + file);
                }
                return file;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static File r(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                s(file2);
            }
        }
        return file.delete();
    }

    public static List t(Object[] objArr) {
        return objArr == null ? Collections.emptyList() : Arrays.asList(objArr);
    }

    public static String u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public static boolean v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public final void a(File file) {
        if (file.exists() && s(file)) {
            E3.f.f().b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public void b() {
        a(new File(this.f3513a, ".com.google.firebase.crashlytics"));
        a(new File(this.f3513a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            a(new File(this.f3513a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String str) {
        return s(new File(this.f3515c, str));
    }

    public List d() {
        return t(this.f3515c.list());
    }

    public File e(String str) {
        return new File(this.f3514b, str);
    }

    public List f(FilenameFilter filenameFilter) {
        return t(this.f3514b.listFiles(filenameFilter));
    }

    public File g(String str) {
        return new File(this.f3518f, str);
    }

    public List h() {
        return t(this.f3518f.listFiles());
    }

    public File i(String str) {
        return r(new File(n(str), "native"));
    }

    public File j(String str) {
        return new File(this.f3517e, str);
    }

    public List k() {
        return t(this.f3517e.listFiles());
    }

    public File l(String str) {
        return new File(this.f3516d, str);
    }

    public List m() {
        return t(this.f3516d.listFiles());
    }

    public final File n(String str) {
        return r(new File(this.f3515c, str));
    }

    public File o(String str, String str2) {
        return new File(n(str), str2);
    }

    public List p(String str, FilenameFilter filenameFilter) {
        return t(n(str).listFiles(filenameFilter));
    }
}
