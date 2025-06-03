// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M3;

import java.io.FilenameFilter;
import android.os.Build$VERSION;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import android.content.Context;
import java.io.File;

public class g
{
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final File f;
    
    public g(final Context context) {
        final File filesDir = context.getFilesDir();
        this.a = filesDir;
        String string;
        if (v()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(".com.google.firebase.crashlytics.files.v2");
            sb.append(File.pathSeparator);
            sb.append(u(M3.f.a()));
            string = sb.toString();
        }
        else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        final File q = q(new File(filesDir, string));
        this.b = q;
        this.c = q(new File(q, "open-sessions"));
        this.d = q(new File(q, "reports"));
        this.e = q(new File(q, "priority-reports"));
        this.f = q(new File(q, "native-reports"));
    }
    
    public static File q(final File file) {
        // monitorenter(g.class)
        while (true) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        // monitorexit(g.class)
                        return file;
                    }
                    final E3.f f = E3.f.f();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unexpected non-directory file: ");
                    sb.append(file);
                    sb.append("; deleting file and creating new directory.");
                    f.b(sb.toString());
                    file.delete();
                }
                if (!file.mkdirs()) {
                    final E3.f f2 = E3.f.f();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Could not create Crashlytics-specific directory: ");
                    sb2.append(file);
                    f2.d(sb2.toString());
                }
                // monitorexit(g.class)
                return file;
                // monitorexit(g.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static File r(final File file) {
        file.mkdirs();
        return file;
    }
    
    public static boolean s(final File file) {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                s(listFiles[i]);
            }
        }
        return file.delete();
    }
    
    public static List t(final Object[] a) {
        if (a == null) {
            return Collections.emptyList();
        }
        return Arrays.asList(a);
    }
    
    public static String u(final String s) {
        return s.replaceAll("[^a-zA-Z0-9.]", "_");
    }
    
    public static boolean v() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    public final void a(final File file) {
        if (file.exists() && s(file)) {
            final E3.f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Deleted previous Crashlytics file system: ");
            sb.append(file.getPath());
            f.b(sb.toString());
        }
    }
    
    public void b() {
        this.a(new File(this.a, ".com.google.firebase.crashlytics"));
        this.a(new File(this.a, ".com.google.firebase.crashlytics-ndk"));
        if (v()) {
            this.a(new File(this.a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }
    
    public boolean c(final String child) {
        return s(new File(this.c, child));
    }
    
    public List d() {
        return t(this.c.list());
    }
    
    public File e(final String child) {
        return new File(this.b, child);
    }
    
    public List f(final FilenameFilter filter) {
        return t(this.b.listFiles(filter));
    }
    
    public File g(final String child) {
        return new File(this.f, child);
    }
    
    public List h() {
        return t(this.f.listFiles());
    }
    
    public File i(final String s) {
        return r(new File(this.n(s), "native"));
    }
    
    public File j(final String child) {
        return new File(this.e, child);
    }
    
    public List k() {
        return t(this.e.listFiles());
    }
    
    public File l(final String child) {
        return new File(this.d, child);
    }
    
    public List m() {
        return t(this.d.listFiles());
    }
    
    public final File n(final String child) {
        return r(new File(this.c, child));
    }
    
    public File o(final String s, final String child) {
        return new File(this.n(s), child);
    }
    
    public List p(final String s, final FilenameFilter filter) {
        return t(this.n(s).listFiles(filter));
    }
}
