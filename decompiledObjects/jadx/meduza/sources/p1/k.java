package p1;

import androidx.work.impl.WorkDatabase_Impl;
import t1.c;

/* loaded from: classes.dex */
public final class k extends c.a {

    /* renamed from: b, reason: collision with root package name */
    public p1.b f12820b;

    /* renamed from: c, reason: collision with root package name */
    public final a f12821c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12822d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12823e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f12824a = 20;

        public abstract void a(u1.c cVar);

        public abstract b b(u1.c cVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12825a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12826b;

        public b(String str, boolean z10) {
            this.f12825a = z10;
            this.f12826b = str;
        }
    }

    public k(p1.b bVar, WorkDatabase_Impl.a aVar) {
        super(aVar.f12824a);
        this.f12820b = bVar;
        this.f12821c = aVar;
        this.f12822d = "7d73d21f1bd82c9e5268b6dcf9fde2cb";
        this.f12823e = "3071c8717539de5d5353f4c8cd59a032";
    }

    @Override // t1.c.a
    public final void b(u1.c cVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[ORIG_RETURN, RETURN] */
    @Override // t1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(u1.c r5) {
        /*
            r4 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r5.C(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L65
            r2 = 0
            if (r1 == 0) goto L15
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L65
            if (r1 != 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = r2
        L16:
            r3 = 0
            x6.b.L(r0, r3)
            p1.k$a r0 = r4.f12821c
            r0.a(r5)
            if (r1 != 0) goto L41
            p1.k$a r0 = r4.f12821c
            p1.k$b r0 = r0.b(r5)
            boolean r1 = r0.f12825a
            if (r1 == 0) goto L2c
            goto L41
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.StringBuilder r1 = defpackage.f.l(r1)
            java.lang.String r0 = r0.f12826b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L41:
            r4.g(r5)
            p1.k$a r5 = r4.f12821c
            androidx.work.impl.WorkDatabase_Impl$a r5 = (androidx.work.impl.WorkDatabase_Impl.a) r5
            androidx.work.impl.WorkDatabase_Impl r0 = androidx.work.impl.WorkDatabase_Impl.this
            java.util.List<? extends p1.j$b> r0 = r0.f12797g
            if (r0 == 0) goto L64
            int r0 = r0.size()
        L52:
            if (r2 >= r0) goto L64
            androidx.work.impl.WorkDatabase_Impl r1 = androidx.work.impl.WorkDatabase_Impl.this
            java.util.List<? extends p1.j$b> r1 = r1.f12797g
            java.lang.Object r1 = r1.get(r2)
            p1.j$b r1 = (p1.j.b) r1
            r1.getClass()
            int r2 = r2 + 1
            goto L52
        L64:
            return
        L65:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L67
        L67:
            r1 = move-exception
            x6.b.L(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.k.c(u1.c):void");
    }

    @Override // t1.c.a
    public final void d(u1.c cVar, int i10, int i11) {
        f(cVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006c  */
    @Override // t1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(u1.c r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.k.e(u1.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0062, code lost:
    
        if (r10 <= r15) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0070, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x006e, code lost:
    
        if (r10 < r6) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b3 A[ORIG_RETURN, RETURN] */
    @Override // t1.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(u1.c r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.k.f(u1.c, int, int):void");
    }

    public final void g(u1.c cVar) {
        cVar.m("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = this.f12822d;
        ec.i.e(str, "hash");
        cVar.m("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }
}
