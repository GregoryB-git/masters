package H3;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* renamed from: H3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0390l {

    /* renamed from: d, reason: collision with root package name */
    public static final FilenameFilter f2278d = new FilenameFilter() { // from class: H3.j
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d7;
            d7 = C0390l.d(file, str);
            return d7;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator f2279e = new Comparator() { // from class: H3.k
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e7;
            e7 = C0390l.e((File) obj, (File) obj2);
            return e7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final M3.g f2280a;

    /* renamed from: b, reason: collision with root package name */
    public String f2281b = null;

    /* renamed from: c, reason: collision with root package name */
    public String f2282c = null;

    public C0390l(M3.g gVar) {
        this.f2280a = gVar;
    }

    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    public static void f(M3.g gVar, String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        try {
            gVar.o(str, "aqs." + str2).createNewFile();
        } catch (IOException e7) {
            E3.f.f().l("Failed to persist App Quality Sessions session id.", e7);
        }
    }

    public static String g(M3.g gVar, String str) {
        List p7 = gVar.p(str, f2278d);
        if (!p7.isEmpty()) {
            return ((File) Collections.min(p7, f2279e)).getName().substring(4);
        }
        E3.f.f().k("Unable to read App Quality Sessions session id.");
        return null;
    }

    public synchronized String c(String str) {
        if (Objects.equals(this.f2281b, str)) {
            return this.f2282c;
        }
        return g(this.f2280a, str);
    }

    public synchronized void h(String str) {
        if (!Objects.equals(this.f2282c, str)) {
            f(this.f2280a, this.f2281b, str);
            this.f2282c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.f2281b, str)) {
            f(this.f2280a, str, this.f2282c);
            this.f2281b = str;
        }
    }
}
