package M3;

import H3.AbstractC0399v;
import H3.C0391m;
import J3.B;
import J3.C;
import K3.h;
import O3.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class e {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f3504e = Charset.forName("UTF-8");

    /* renamed from: f, reason: collision with root package name */
    public static final int f3505f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final h f3506g = new h();

    /* renamed from: h, reason: collision with root package name */
    public static final Comparator f3507h = new Comparator() { // from class: M3.a
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u7;
            u7 = e.u((File) obj, (File) obj2);
            return u7;
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public static final FilenameFilter f3508i = new FilenameFilter() { // from class: M3.b
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v7;
            v7 = e.v(file, str);
            return v7;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3509a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final g f3510b;

    /* renamed from: c, reason: collision with root package name */
    public final i f3511c;

    /* renamed from: d, reason: collision with root package name */
    public final C0391m f3512d;

    public e(g gVar, i iVar, C0391m c0391m) {
        this.f3510b = gVar;
        this.f3511c = iVar;
        this.f3512d = c0391m;
    }

    public static String A(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f3504e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f3504e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void G(File file, String str, long j7) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f3504e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j7));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int f(List list, int i7) {
        int size = list.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (size <= i7) {
                return size;
            }
            g.s(file);
            size--;
        }
        return size;
    }

    public static long h(long j7) {
        return j7 * 1000;
    }

    public static String m(int i7, boolean z7) {
        return "event" + String.format(Locale.US, "%010d", Integer.valueOf(i7)) + (z7 ? "_" : "");
    }

    public static String o(String str) {
        return str.substring(0, f3505f);
    }

    public static boolean s(String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    public static boolean t(File file, String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    public static int x(File file, File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public final void B(File file, B.d dVar, String str, B.a aVar) {
        String d7 = this.f3512d.d(str);
        try {
            h hVar = f3506g;
            F(this.f3510b.g(str), hVar.G(hVar.F(A(file)).s(dVar).p(aVar).o(d7)));
        } catch (IOException e7) {
            E3.f.f().l("Could not synthesize final native report file for " + file, e7);
        }
    }

    public final void C(String str, long j7) {
        boolean z7;
        List<File> p7 = this.f3510b.p(str, f3508i);
        if (p7.isEmpty()) {
            E3.f.f().i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p7);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z7 = false;
            for (File file : p7) {
                try {
                    arrayList.add(f3506g.h(A(file)));
                } catch (IOException e7) {
                    E3.f.f().l("Could not add event to report for " + file, e7);
                }
                if (z7 || s(file.getName())) {
                    z7 = true;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            D(this.f3510b.o(str, "report"), arrayList, j7, z7, I3.i.j(str, this.f3510b), this.f3512d.d(str));
        } else {
            E3.f.f().k("Could not parse event files for session " + str);
        }
    }

    public final void D(File file, List list, long j7, boolean z7, String str, String str2) {
        try {
            h hVar = f3506g;
            B q7 = hVar.F(A(file)).t(j7, z7, str).o(str2).q(C.a(list));
            B.e m7 = q7.m();
            if (m7 == null) {
                return;
            }
            E3.f.f().b("appQualitySessionId: " + str2);
            F(z7 ? this.f3510b.j(m7.i()) : this.f3510b.l(m7.i()), hVar.G(q7));
        } catch (IOException e7) {
            E3.f.f().l("Could not synthesize final report file for " + file, e7);
        }
    }

    public final int E(String str, int i7) {
        List p7 = this.f3510b.p(str, new FilenameFilter() { // from class: M3.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t7;
                t7 = e.t(file, str2);
                return t7;
            }
        });
        Collections.sort(p7, new Comparator() { // from class: M3.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x7;
                x7 = e.x((File) obj, (File) obj2);
                return x7;
            }
        });
        return f(p7, i7);
    }

    public final SortedSet e(String str) {
        this.f3510b.b();
        SortedSet p7 = p();
        if (str != null) {
            p7.remove(str);
        }
        if (p7.size() <= 8) {
            return p7;
        }
        while (p7.size() > 8) {
            String str2 = (String) p7.last();
            E3.f.f().b("Removing session over cap: " + str2);
            this.f3510b.c(str2);
            p7.remove(str2);
        }
        return p7;
    }

    public final void g() {
        int i7 = this.f3511c.b().f3976a.f3988b;
        List n7 = n();
        int size = n7.size();
        if (size <= i7) {
            return;
        }
        Iterator it = n7.subList(i7, size).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void i() {
        j(this.f3510b.m());
        j(this.f3510b.k());
        j(this.f3510b.h());
    }

    public final void j(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public void k(String str, long j7) {
        for (String str2 : e(str)) {
            E3.f.f().i("Finalizing report for session " + str2);
            C(str2, j7);
            this.f3510b.c(str2);
        }
        g();
    }

    public void l(String str, B.d dVar, B.a aVar) {
        File o7 = this.f3510b.o(str, "report");
        E3.f.f().b("Writing native session report for " + str + " to file: " + o7);
        B(o7, dVar, str, aVar);
    }

    public final List n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3510b.k());
        arrayList.addAll(this.f3510b.h());
        Comparator comparator = f3507h;
        Collections.sort(arrayList, comparator);
        List m7 = this.f3510b.m();
        Collections.sort(m7, comparator);
        arrayList.addAll(m7);
        return arrayList;
    }

    public SortedSet p() {
        return new TreeSet(this.f3510b.d()).descendingSet();
    }

    public long q(String str) {
        return this.f3510b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        return (this.f3510b.m().isEmpty() && this.f3510b.k().isEmpty() && this.f3510b.h().isEmpty()) ? false : true;
    }

    public List w() {
        List<File> n7 = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n7) {
            try {
                arrayList.add(AbstractC0399v.a(f3506g.F(A(file)), file.getName(), file));
            } catch (IOException e7) {
                E3.f.f().l("Could not load report file " + file + "; deleting", e7);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(B.e.d dVar, String str, boolean z7) {
        int i7 = this.f3511c.b().f3976a.f3987a;
        try {
            F(this.f3510b.o(str, m(this.f3509a.getAndIncrement(), z7)), f3506g.i(dVar));
        } catch (IOException e7) {
            E3.f.f().l("Could not persist event for session " + str, e7);
        }
        E(str, i7);
    }

    public void z(B b7) {
        B.e m7 = b7.m();
        if (m7 == null) {
            E3.f.f().b("Could not get session for report");
            return;
        }
        String i7 = m7.i();
        try {
            F(this.f3510b.o(i7, "report"), f3506g.G(b7));
            G(this.f3510b.o(i7, "start-time"), "", m7.l());
        } catch (IOException e7) {
            E3.f.f().c("Could not persist report for session " + i7, e7);
        }
    }
}
