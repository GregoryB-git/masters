/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.List
 */
package M3;

import M3.f;
import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class g {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;

    public g(Context object) {
        File file;
        this.a = file = object.getFilesDir();
        if (g.v()) {
            object = new StringBuilder();
            object.append(".com.google.firebase.crashlytics.files.v2");
            object.append(File.pathSeparator);
            object.append(g.u(f.a()));
            object = object.toString();
        } else {
            object = ".com.google.firebase.crashlytics.files.v1";
        }
        this.b = object = g.q(new File(file, (String)object));
        this.c = g.q(new File((File)object, "open-sessions"));
        this.d = g.q(new File((File)object, "reports"));
        this.e = g.q(new File((File)object, "priority-reports"));
        this.f = g.q(new File((File)object, "native-reports"));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static File q(File var0) {
        block5 : {
            block4 : {
                // MONITORENTER : M3.g.class
                if (!var0.exists()) ** GOTO lbl19
                var1_2 = var0.isDirectory();
                if (!var1_2) break block4;
                return var0;
            }
            var2_3 = E3.f.f();
            var3_4 = new StringBuilder();
            var3_4.append("Unexpected non-directory file: ");
            var3_4.append((Object)var0);
            var3_4.append("; deleting file and creating new directory.");
            var2_3.b(var3_4.toString());
            var0.delete();
lbl19: // 2 sources:
            if (var0.mkdirs()) break block5;
            var2_3 = E3.f.f();
            var3_4 = new StringBuilder();
            var3_4.append("Could not create Crashlytics-specific directory: ");
            var3_4.append((Object)var0);
            var2_3.d(var3_4.toString());
        }
        // MONITOREXIT : M3.g.class
        return var0;
    }

    public static File r(File file) {
        file.mkdirs();
        return file;
    }

    public static boolean s(File file) {
        File[] arrfile = file.listFiles();
        if (arrfile != null) {
            int n8 = arrfile.length;
            for (int i8 = 0; i8 < n8; ++i8) {
                g.s(arrfile[i8]);
            }
        }
        return file.delete();
    }

    public static List t(Object[] arrobject) {
        if (arrobject == null) {
            return Collections.emptyList();
        }
        return Arrays.asList((Object[])arrobject);
    }

    public static String u(String string2) {
        return string2.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    public static boolean v() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }

    public final void a(File file) {
        if (file.exists() && g.s(file)) {
            E3.f f8 = E3.f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Deleted previous Crashlytics file system: ");
            stringBuilder.append(file.getPath());
            f8.b(stringBuilder.toString());
        }
    }

    public void b() {
        this.a(new File(this.a, ".com.google.firebase.crashlytics"));
        this.a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
        if (g.v()) {
            this.a(new File(this.a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    public boolean c(String string2) {
        return g.s(new File(this.c, string2));
    }

    public List d() {
        return g.t(this.c.list());
    }

    public File e(String string2) {
        return new File(this.b, string2);
    }

    public List f(FilenameFilter filenameFilter) {
        return g.t((Object[])this.b.listFiles(filenameFilter));
    }

    public File g(String string2) {
        return new File(this.f, string2);
    }

    public List h() {
        return g.t((Object[])this.f.listFiles());
    }

    public File i(String string2) {
        return g.r(new File(this.n(string2), "native"));
    }

    public File j(String string2) {
        return new File(this.e, string2);
    }

    public List k() {
        return g.t((Object[])this.e.listFiles());
    }

    public File l(String string2) {
        return new File(this.d, string2);
    }

    public List m() {
        return g.t((Object[])this.d.listFiles());
    }

    public final File n(String string2) {
        return g.r(new File(this.c, string2));
    }

    public File o(String string2, String string3) {
        return new File(this.n(string2), string3);
    }

    public List p(String string2, FilenameFilter filenameFilter) {
        return g.t((Object[])this.n(string2).listFiles(filenameFilter));
    }
}

