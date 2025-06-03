package e7;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final String f4604a;

    /* renamed from: b, reason: collision with root package name */
    public long f4605b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f4606c;

    public r(o oVar, String str) {
        this.f4606c = oVar;
        m6.j.e(str);
        this.f4604a = str;
        this.f4605b = -1L;
    }

    public r(o oVar, String str, long j10) {
        this.f4606c = oVar;
        m6.j.e(str);
        this.f4604a = str;
        this.f4605b = oVar.w("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j10)}, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
    
        if (0 == 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<e7.q> a() {
        /*
            r22 = this;
            r1 = r22
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String r6 = "app_id = ? and rowid > ?"
            r12 = 2
            java.lang.String[] r7 = new java.lang.String[r12]
            java.lang.String r0 = r1.f4604a
            r13 = 0
            r7[r13] = r0
            long r3 = r1.f4605b
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r14 = 1
            r7[r14] = r0
            r15 = 0
            e7.o r0 = r1.f4606c     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            android.database.sqlite.SQLiteDatabase r3 = r0.s()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            java.lang.String r4 = "raw_events"
            java.lang.String r16 = "rowid"
            java.lang.String r17 = "name"
            java.lang.String r18 = "timestamp"
            java.lang.String r19 = "metadata_fingerprint"
            java.lang.String r20 = "data"
            java.lang.String r21 = "realtime"
            java.lang.String[] r5 = new java.lang.String[]{r16, r17, r18, r19, r20, r21}     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r8 = 0
            r9 = 0
            java.lang.String r10 = "rowid"
            java.lang.String r11 = "1000"
            android.database.Cursor r15 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            boolean r0 = r15.moveToFirst()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            if (r0 != 0) goto L4b
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r15.close()
            return r0
        L4b:
            long r4 = r15.getLong(r13)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r0 = 3
            long r6 = r15.getLong(r0)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r0 = 5
            long r8 = r15.getLong(r0)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r10 = 1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L61
            r8 = r14
            goto L62
        L61:
            r8 = r13
        L62:
            r0 = 4
            byte[] r0 = r15.getBlob(r0)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            long r9 = r1.f4605b     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            int r3 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r3 <= 0) goto L6f
            r1.f4605b = r4     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
        L6f:
            com.google.android.gms.internal.measurement.zzgf$zzf$zza r3 = com.google.android.gms.internal.measurement.zzgf.zzf.zze()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2 java.io.IOException -> La4
            com.google.android.gms.internal.measurement.zzlp r0 = e7.o6.z(r3, r0)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2 java.io.IOException -> La4
            com.google.android.gms.internal.measurement.zzgf$zzf$zza r0 = (com.google.android.gms.internal.measurement.zzgf.zzf.zza) r0     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2 java.io.IOException -> La4
            java.lang.String r3 = r15.getString(r14)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            if (r3 == 0) goto L80
            goto L82
        L80:
            java.lang.String r3 = ""
        L82:
            com.google.android.gms.internal.measurement.zzgf$zzf$zza r3 = r0.zza(r3)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            long r9 = r15.getLong(r12)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r3.zzb(r9)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            e7.q r10 = new e7.q     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            com.google.android.gms.internal.measurement.zzlm r0 = r0.zzaj()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            com.google.android.gms.internal.measurement.zzkg r0 = (com.google.android.gms.internal.measurement.zzkg) r0     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r9 = r0
            com.google.android.gms.internal.measurement.zzgf$zzf r9 = (com.google.android.gms.internal.measurement.zzgf.zzf) r9     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r3 = r10
            r3.<init>(r4, r6, r8, r9)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r2.add(r10)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            goto Lb8
        La0:
            r0 = move-exception
            goto Ld8
        La2:
            r0 = move-exception
            goto Lbf
        La4:
            r0 = move-exception
            e7.o r3 = r1.f4606c     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            e7.a1 r3 = r3.zzj()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            e7.b1 r3 = r3.f4060o     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            java.lang.String r4 = "Data loss. Failed to merge raw event. appId"
            java.lang.String r5 = r1.f4604a     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            e7.e1 r5 = e7.a1.p(r5)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            r3.d(r4, r5, r0)     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
        Lb8:
            boolean r0 = r15.moveToNext()     // Catch: java.lang.Throwable -> La0 android.database.sqlite.SQLiteException -> La2
            if (r0 != 0) goto L4b
            goto Ld4
        Lbf:
            e7.o r3 = r1.f4606c     // Catch: java.lang.Throwable -> La0
            e7.a1 r3 = r3.zzj()     // Catch: java.lang.Throwable -> La0
            e7.b1 r3 = r3.f4060o     // Catch: java.lang.Throwable -> La0
            java.lang.String r4 = "Data loss. Error querying raw events batch. appId"
            java.lang.String r5 = r1.f4604a     // Catch: java.lang.Throwable -> La0
            e7.e1 r5 = e7.a1.p(r5)     // Catch: java.lang.Throwable -> La0
            r3.d(r4, r5, r0)     // Catch: java.lang.Throwable -> La0
            if (r15 == 0) goto Ld7
        Ld4:
            r15.close()
        Ld7:
            return r2
        Ld8:
            if (r15 == 0) goto Ldd
            r15.close()
        Ldd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.r.a():java.util.List");
    }
}
