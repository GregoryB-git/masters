package p1;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f12791a;

    public f(e eVar) {
        this.f12791a = eVar;
    }

    public final tb.g a() {
        e eVar = this.f12791a;
        tb.g gVar = new tb.g();
        Cursor l10 = eVar.f12767a.l(new t1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (l10.moveToNext()) {
            try {
                gVar.add(Integer.valueOf(l10.getInt(0)));
            } finally {
            }
        }
        rb.h hVar = rb.h.f13851a;
        x6.b.L(l10, null);
        tb.g a10 = va.a.a(gVar);
        if (!a10.isEmpty()) {
            if (this.f12791a.f12773h == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            t1.f fVar = this.f12791a.f12773h;
            if (fVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            fVar.p();
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            p1.e r0 = r5.f12791a
            p1.j r0 = r0.f12767a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f12799i
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "readWriteLock.readLock()"
            ec.i.d(r0, r1)
            r0.lock()
            r1 = 1
            p1.e r2 = r5.f12791a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            boolean r2 = r2.b()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 != 0) goto L24
        L1b:
            r0.unlock()
            p1.e r0 = r5.f12791a
            r0.getClass()
            return
        L24:
            p1.e r2 = r5.f12791a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            r3 = 0
            boolean r2 = r2.compareAndSet(r1, r3)     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 != 0) goto L30
            goto L1b
        L30:
            p1.e r2 = r5.f12791a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            p1.j r2 = r2.f12767a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            t1.c r2 = r2.g()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            t1.b r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            boolean r2 = r2.j0()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            if (r2 == 0) goto L43
            goto L1b
        L43:
            p1.e r2 = r5.f12791a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            p1.j r2 = r2.f12767a     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            t1.c r2 = r2.g()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            t1.b r2 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            r2.J()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            tb.g r3 = r5.a()     // Catch: java.lang.Throwable -> L5d
            r2.G()     // Catch: java.lang.Throwable -> L5d
            r2.X()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            goto L78
        L5d:
            r3 = move-exception
            r2.X()     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
            throw r3     // Catch: java.lang.Throwable -> L62 android.database.sqlite.SQLiteException -> L64 java.lang.IllegalStateException -> L6f
        L62:
            r1 = move-exception
            goto Lb3
        L64:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L62
        L6c:
            sb.u r3 = sb.u.f14326a     // Catch: java.lang.Throwable -> L62
            goto L78
        L6f:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch: java.lang.Throwable -> L62
            goto L6c
        L78:
            r0.unlock()
            p1.e r0 = r5.f12791a
            r0.getClass()
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto Lb2
            p1.e r0 = r5.f12791a
            n.b<p1.e$c, p1.e$d> r1 = r0.f12776k
            monitor-enter(r1)
            n.b<p1.e$c, p1.e$d> r0 = r0.f12776k     // Catch: java.lang.Throwable -> Laf
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Laf
        L92:
            r2 = r0
            n.b$e r2 = (n.b.e) r2     // Catch: java.lang.Throwable -> Laf
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Laf
            if (r4 == 0) goto Lab
            java.lang.Object r2 = r2.next()     // Catch: java.lang.Throwable -> Laf
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Laf
            p1.e$d r2 = (p1.e.d) r2     // Catch: java.lang.Throwable -> Laf
            r2.a(r3)     // Catch: java.lang.Throwable -> Laf
            goto L92
        Lab:
            rb.h r0 = rb.h.f13851a     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r1)
            goto Lb2
        Laf:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        Lb2:
            return
        Lb3:
            r0.unlock()
            p1.e r0 = r5.f12791a
            r0.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.f.run():void");
    }
}
