package u5;

import android.database.SQLException;
import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import o7.x;
import u5.a;
import u5.i;

/* loaded from: classes.dex */
public final class q implements a {

    /* renamed from: l, reason: collision with root package name */
    public static final HashSet<File> f15057l = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    public final File f15058a;

    /* renamed from: b, reason: collision with root package name */
    public final d f15059b;

    /* renamed from: c, reason: collision with root package name */
    public final j f15060c;

    /* renamed from: d, reason: collision with root package name */
    public final f f15061d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<a.b>> f15062e;
    public final Random f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15063g;

    /* renamed from: h, reason: collision with root package name */
    public long f15064h;

    /* renamed from: i, reason: collision with root package name */
    public long f15065i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f15066j;

    /* renamed from: k, reason: collision with root package name */
    public a.C0242a f15067k;

    public q(File file, n nVar, y3.c cVar) {
        boolean add;
        j jVar = new j(cVar, file);
        f fVar = new f(cVar);
        synchronized (q.class) {
            add = f15057l.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f15058a = file;
        this.f15059b = nVar;
        this.f15060c = jVar;
        this.f15061d = fVar;
        this.f15062e = new HashMap<>();
        this.f = new Random();
        this.f15063g = true;
        this.f15064h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new p(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void l(q qVar) {
        long j10;
        a.C0242a c0242a;
        if (!qVar.f15058a.exists()) {
            try {
                n(qVar.f15058a);
            } catch (a.C0242a e10) {
                qVar.f15067k = e10;
                return;
            }
        }
        File[] listFiles = qVar.f15058a.listFiles();
        if (listFiles == null) {
            StringBuilder l10 = defpackage.f.l("Failed to list cache directory files: ");
            l10.append(qVar.f15058a);
            String sb2 = l10.toString();
            v5.m.c("SimpleCache", sb2);
            c0242a = new a.C0242a(sb2);
        } else {
            int length = listFiles.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    j10 = -1;
                    break;
                }
                File file = listFiles[i10];
                String name = file.getName();
                if (name.endsWith(".uid")) {
                    try {
                        j10 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                        break;
                    } catch (NumberFormatException unused) {
                        v5.m.c("SimpleCache", "Malformed UID file: " + file);
                        file.delete();
                    }
                }
                i10++;
            }
            qVar.f15064h = j10;
            if (j10 == -1) {
                try {
                    qVar.f15064h = o(qVar.f15058a);
                } catch (IOException e11) {
                    StringBuilder l11 = defpackage.f.l("Failed to create cache UID: ");
                    l11.append(qVar.f15058a);
                    String sb3 = l11.toString();
                    v5.m.d("SimpleCache", sb3, e11);
                    c0242a = new a.C0242a(sb3, e11);
                }
            }
            try {
                qVar.f15060c.e(qVar.f15064h);
                f fVar = qVar.f15061d;
                if (fVar != null) {
                    fVar.b(qVar.f15064h);
                    HashMap a10 = qVar.f15061d.a();
                    qVar.p(qVar.f15058a, true, listFiles, a10);
                    qVar.f15061d.c(a10.keySet());
                } else {
                    qVar.p(qVar.f15058a, true, listFiles, null);
                }
                j jVar = qVar.f15060c;
                Iterator it = x.q(jVar.f15030a.keySet()).iterator();
                while (it.hasNext()) {
                    jVar.f((String) it.next());
                }
                try {
                    qVar.f15060c.g();
                    return;
                } catch (IOException e12) {
                    v5.m.d("SimpleCache", "Storing index file failed", e12);
                    return;
                }
            } catch (IOException e13) {
                StringBuilder l12 = defpackage.f.l("Failed to initialize cache indices: ");
                l12.append(qVar.f15058a);
                String sb4 = l12.toString();
                v5.m.d("SimpleCache", sb4, e13);
                c0242a = new a.C0242a(sb4, e13);
            }
        }
        qVar.f15067k = c0242a;
    }

    public static void n(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        v5.m.c("SimpleCache", str);
        throw new a.C0242a(str);
    }

    public static long o(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, defpackage.g.d(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void u(File file) {
        synchronized (q.class) {
            f15057l.remove(file.getAbsoluteFile());
        }
    }

    @Override // u5.a
    public final synchronized r a(long j10, long j11, String str) {
        r b10;
        boolean z10;
        boolean z11;
        x6.b.H(!this.f15066j);
        synchronized (this) {
            a.C0242a c0242a = this.f15067k;
            if (c0242a != null) {
                throw c0242a;
            }
        }
        i c10 = this.f15060c.c(str);
        if (c10 != null) {
            while (true) {
                b10 = c10.b(j10, j11);
                if (!b10.f15012d || b10.f15013e.length() == b10.f15011c) {
                    break;
                }
                s();
            }
        } else {
            b10 = new r(str, j10, j11, -9223372036854775807L, null);
        }
        if (b10.f15012d) {
            return t(str, b10);
        }
        i d10 = this.f15060c.d(str);
        long j12 = b10.f15011c;
        int i10 = 0;
        while (true) {
            if (i10 >= d10.f15026d.size()) {
                d10.f15026d.add(new i.a(j10, j12));
                z10 = true;
                break;
            }
            i.a aVar = d10.f15026d.get(i10);
            long j13 = aVar.f15028a;
            if (j13 <= j10) {
                long j14 = aVar.f15029b;
                if (j14 != -1) {
                    if (j13 + j14 > j10) {
                    }
                    z11 = false;
                }
                z11 = true;
            } else {
                if (j12 != -1) {
                    if (j10 + j12 > j13) {
                    }
                    z11 = false;
                }
                z11 = true;
            }
            if (z11) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (z10) {
            return b10;
        }
        return null;
    }

    @Override // u5.a
    public final synchronized void b(g gVar) {
        x6.b.H(!this.f15066j);
        i c10 = this.f15060c.c(gVar.f15009a);
        c10.getClass();
        long j10 = gVar.f15010b;
        for (int i10 = 0; i10 < c10.f15026d.size(); i10++) {
            if (c10.f15026d.get(i10).f15028a == j10) {
                c10.f15026d.remove(i10);
                this.f15060c.f(c10.f15024b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    @Override // u5.a
    public final synchronized m c(String str) {
        i c10;
        x6.b.H(!this.f15066j);
        c10 = this.f15060c.c(str);
        return c10 != null ? c10.f15027e : m.f15048c;
    }

    @Override // u5.a
    public final synchronized long d(long j10, long j11, String str) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long j16 = j(j15, j14 - j15, str);
            if (j16 > 0) {
                j12 += j16;
            } else {
                j16 = -j16;
            }
            j15 += j16;
        }
        return j12;
    }

    @Override // u5.a
    public final synchronized File e(long j10, long j11, String str) {
        x6.b.H(!this.f15066j);
        synchronized (this) {
            a.C0242a c0242a = this.f15067k;
            if (c0242a != null) {
                throw c0242a;
            }
        }
        return r.h(r1, r12.f15023a, j10, System.currentTimeMillis());
        i c10 = this.f15060c.c(str);
        c10.getClass();
        x6.b.H(c10.c(j10, j11));
        if (!this.f15058a.exists()) {
            n(this.f15058a);
            s();
        }
        this.f15059b.b(this, j11);
        File file = new File(this.f15058a, Integer.toString(this.f.nextInt(10)));
        if (!file.exists()) {
            n(file);
        }
        return r.h(file, c10.f15023a, j10, System.currentTimeMillis());
    }

    @Override // u5.a
    public final synchronized void f(String str, l lVar) {
        try {
            synchronized (this) {
                x6.b.H(!this.f15066j);
                synchronized (this) {
                    a.C0242a c0242a = this.f15067k;
                    if (c0242a != null) {
                        throw c0242a;
                    }
                }
                return;
            }
            this.f15060c.g();
            return;
        } catch (IOException e10) {
            throw new a.C0242a(e10);
        }
        j jVar = this.f15060c;
        i d10 = jVar.d(str);
        d10.f15027e = d10.f15027e.a(lVar);
        if (!r5.equals(r2)) {
            jVar.f15034e.f(d10);
        }
    }

    @Override // u5.a
    public final synchronized void g(g gVar) {
        x6.b.H(!this.f15066j);
        r(gVar);
    }

    @Override // u5.a
    public final synchronized void h(File file, long j10) {
        boolean z10 = true;
        x6.b.H(!this.f15066j);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            r g10 = r.g(file, j10, -9223372036854775807L, this.f15060c);
            g10.getClass();
            i c10 = this.f15060c.c(g10.f15009a);
            c10.getClass();
            x6.b.H(c10.c(g10.f15010b, g10.f15011c));
            long d10 = defpackage.f.d(c10.f15027e);
            if (d10 != -1) {
                if (g10.f15010b + g10.f15011c > d10) {
                    z10 = false;
                }
                x6.b.H(z10);
            }
            if (this.f15061d != null) {
                try {
                    this.f15061d.d(g10.f15011c, g10.f, file.getName());
                } catch (IOException e10) {
                    throw new a.C0242a(e10);
                }
            }
            m(g10);
            try {
                this.f15060c.g();
                notifyAll();
            } catch (IOException e11) {
                throw new a.C0242a(e11);
            }
        }
    }

    @Override // u5.a
    public final synchronized long i() {
        x6.b.H(!this.f15066j);
        return this.f15065i;
    }

    @Override // u5.a
    public final synchronized long j(long j10, long j11, String str) {
        i c10;
        x6.b.H(!this.f15066j);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        c10 = this.f15060c.c(str);
        return c10 != null ? c10.a(j10, j11) : -j11;
    }

    @Override // u5.a
    public final synchronized r k(long j10, long j11, String str) {
        r a10;
        x6.b.H(!this.f15066j);
        synchronized (this) {
            a.C0242a c0242a = this.f15067k;
            if (c0242a != null) {
                throw c0242a;
            }
        }
        return a10;
        while (true) {
            a10 = a(j10, j11, str);
            if (a10 != null) {
                return a10;
            }
            wait();
        }
    }

    public final void m(r rVar) {
        this.f15060c.d(rVar.f15009a).f15025c.add(rVar);
        this.f15065i += rVar.f15011c;
        ArrayList<a.b> arrayList = this.f15062e.get(rVar.f15009a);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    arrayList.get(size).d(this, rVar);
                }
            }
        }
        this.f15059b.d(this, rVar);
    }

    public final void p(File file, boolean z10, File[] fileArr, HashMap hashMap) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                p(file2, false, file2.listFiles(), hashMap);
            } else if (!z10 || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j10 = -1;
                long j11 = -9223372036854775807L;
                e eVar = hashMap != null ? (e) hashMap.remove(name) : null;
                if (eVar != null) {
                    j10 = eVar.f15004a;
                    j11 = eVar.f15005b;
                }
                r g10 = r.g(file2, j10, j11, this.f15060c);
                if (g10 != null) {
                    m(g10);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void q() {
        if (this.f15066j) {
            return;
        }
        this.f15062e.clear();
        s();
        try {
            try {
                this.f15060c.g();
                u(this.f15058a);
            } catch (Throwable th) {
                u(this.f15058a);
                this.f15066j = true;
                throw th;
            }
        } catch (IOException e10) {
            v5.m.d("SimpleCache", "Storing index file failed", e10);
            u(this.f15058a);
        }
        this.f15066j = true;
    }

    public final void r(g gVar) {
        boolean z10;
        i c10 = this.f15060c.c(gVar.f15009a);
        if (c10 != null) {
            if (c10.f15025c.remove(gVar)) {
                File file = gVar.f15013e;
                if (file != null) {
                    file.delete();
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f15065i -= gVar.f15011c;
                if (this.f15061d != null) {
                    String name = gVar.f15013e.getName();
                    try {
                        f fVar = this.f15061d;
                        fVar.f15008b.getClass();
                        try {
                            fVar.f15007a.getWritableDatabase().delete(fVar.f15008b, "name = ?", new String[]{name});
                        } catch (SQLException e10) {
                            throw new y3.a(e10);
                        }
                    } catch (IOException unused) {
                        v5.m.f("SimpleCache", "Failed to remove file index entry for: " + name);
                    }
                }
                this.f15060c.f(c10.f15024b);
                ArrayList<a.b> arrayList = this.f15062e.get(gVar.f15009a);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        } else {
                            arrayList.get(size).a(gVar);
                        }
                    }
                }
                this.f15059b.a(gVar);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(this.f15060c.f15030a.values()).iterator();
        while (it.hasNext()) {
            Iterator<r> it2 = ((i) it.next()).f15025c.iterator();
            while (it2.hasNext()) {
                r next = it2.next();
                if (next.f15013e.length() != next.f15011c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r((g) arrayList.get(i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u5.r t(java.lang.String r19, u5.r r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r0.f15063g
            if (r2 != 0) goto L9
            return r1
        L9:
            java.io.File r2 = r1.f15013e
            r2.getClass()
            java.lang.String r8 = r2.getName()
            long r4 = r1.f15011c
            long r15 = java.lang.System.currentTimeMillis()
            r2 = 0
            u5.f r3 = r0.f15061d
            if (r3 == 0) goto L2a
            r6 = r15
            r3.d(r4, r6, r8)     // Catch: java.io.IOException -> L22
            goto L2b
        L22:
            java.lang.String r3 = "SimpleCache"
            java.lang.String r4 = "Failed to update index with new touch timestamp."
            v5.m.f(r3, r4)
            goto L2b
        L2a:
            r2 = 1
        L2b:
            u5.j r3 = r0.f15060c
            r4 = r19
            u5.i r3 = r3.c(r4)
            java.util.TreeSet<u5.r> r4 = r3.f15025c
            boolean r4 = r4.remove(r1)
            x6.b.H(r4)
            java.io.File r4 = r1.f15013e
            r4.getClass()
            if (r2 == 0) goto L7a
            java.io.File r9 = r4.getParentFile()
            r9.getClass()
            long r11 = r1.f15010b
            int r10 = r3.f15023a
            r13 = r15
            java.io.File r2 = u5.r.h(r9, r10, r11, r13)
            boolean r5 = r4.renameTo(r2)
            if (r5 == 0) goto L5c
            r17 = r2
            goto L7c
        L5c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to rename "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = " to "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "CachedContent"
            v5.m.f(r5, r2)
        L7a:
            r17 = r4
        L7c:
            boolean r2 = r1.f15012d
            x6.b.H(r2)
            u5.r r2 = new u5.r
            java.lang.String r10 = r1.f15009a
            long r11 = r1.f15010b
            long r13 = r1.f15011c
            r9 = r2
            r9.<init>(r10, r11, r13, r15, r17)
            java.util.TreeSet<u5.r> r3 = r3.f15025c
            r3.add(r2)
            java.util.HashMap<java.lang.String, java.util.ArrayList<u5.a$b>> r3 = r0.f15062e
            java.lang.String r4 = r1.f15009a
            java.lang.Object r3 = r3.get(r4)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            if (r3 == 0) goto Lb0
            int r4 = r3.size()
        La2:
            int r4 = r4 + (-1)
            if (r4 < 0) goto Lb0
            java.lang.Object r5 = r3.get(r4)
            u5.a$b r5 = (u5.a.b) r5
            r5.e(r0, r1, r2)
            goto La2
        Lb0:
            u5.d r3 = r0.f15059b
            r3.e(r0, r1, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.q.t(java.lang.String, u5.r):u5.r");
    }
}
