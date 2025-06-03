package p8;

import android.util.Log;
import defpackage.g;
import j8.j;
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
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import m8.f0;
import r8.f;
import r8.h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f13031e = Charset.forName("UTF-8");
    public static final int f = 15;

    /* renamed from: g, reason: collision with root package name */
    public static final n8.a f13032g = new n8.a();

    /* renamed from: h, reason: collision with root package name */
    public static final r5.c f13033h = new r5.c(5);

    /* renamed from: i, reason: collision with root package name */
    public static final a f13034i = new FilenameFilter() { // from class: p8.a
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith("event");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13035a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final e f13036b;

    /* renamed from: c, reason: collision with root package name */
    public final h f13037c;

    /* renamed from: d, reason: collision with root package name */
    public final j f13038d;

    public c(e eVar, f fVar, j jVar) {
        this.f13036b = eVar;
        this.f13037c = fVar;
        this.f13038d = jVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String d(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f13031e);
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

    public static void e(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f13031e);
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

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(e.e(this.f13036b.f.listFiles()));
        arrayList.addAll(e.e(this.f13036b.f13045g.listFiles()));
        r5.c cVar = f13033h;
        Collections.sort(arrayList, cVar);
        List e10 = e.e(this.f13036b.f13044e.listFiles());
        Collections.sort(e10, cVar);
        arrayList.addAll(e10);
        return arrayList;
    }

    public final void c(f0.e.d dVar, String str, boolean z10) {
        int i10 = ((f) this.f13037c).b().f13785a.f13793a;
        f13032g.getClass();
        try {
            e(this.f13036b.b(str, g.e("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f13035a.getAndIncrement())), z10 ? "_" : "")), n8.a.f11321a.a(dVar));
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e10);
        }
        e eVar = this.f13036b;
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: p8.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.startsWith("event") && !str2.endsWith("_");
            }
        };
        eVar.getClass();
        File file = new File(eVar.f13043d, str);
        file.mkdirs();
        List<File> e11 = e.e(file.listFiles(filenameFilter));
        Collections.sort(e11, new b0.d(8));
        int size = e11.size();
        for (File file2 : e11) {
            if (size <= i10) {
                return;
            }
            e.d(file2);
            size--;
        }
    }
}
