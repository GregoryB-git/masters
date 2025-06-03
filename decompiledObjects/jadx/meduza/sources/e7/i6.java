package e7;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzgc;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzoy;
import com.google.android.gms.internal.measurement.zzpe;
import e7.e3;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class i6 implements c3 {
    public static volatile i6 S;
    public int A;
    public boolean B;
    public boolean C;
    public boolean D;
    public FileLock E;
    public FileChannel F;
    public ArrayList G;
    public ArrayList H;
    public final HashMap J;
    public final HashMap K;
    public final HashMap L;
    public q4 N;
    public String O;
    public y3 P;
    public long Q;

    /* renamed from: a, reason: collision with root package name */
    public w1 f4330a;

    /* renamed from: b, reason: collision with root package name */
    public g1 f4331b;

    /* renamed from: c, reason: collision with root package name */
    public o f4332c;

    /* renamed from: d, reason: collision with root package name */
    public j1 f4333d;

    /* renamed from: e, reason: collision with root package name */
    public x5 f4334e;
    public y6 f;

    /* renamed from: o, reason: collision with root package name */
    public final o6 f4335o;

    /* renamed from: p, reason: collision with root package name */
    public p4 f4336p;

    /* renamed from: q, reason: collision with root package name */
    public l5 f4337q;

    /* renamed from: s, reason: collision with root package name */
    public t1 f4339s;
    public final j2 t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4341v;

    /* renamed from: w, reason: collision with root package name */
    public long f4342w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f4343x;

    /* renamed from: z, reason: collision with root package name */
    public int f4345z;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4340u = false;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedList f4344y = new LinkedList();
    public final HashMap M = new HashMap();
    public final b1.v R = new b1.v(this);
    public long I = -1;

    /* renamed from: r, reason: collision with root package name */
    public final g6 f4338r = new g6(this);

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public zzgf.zzk f4346a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f4347b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f4348c;

        /* renamed from: d, reason: collision with root package name */
        public long f4349d;

        public a() {
        }

        public final void a(zzgf.zzk zzkVar) {
            m6.j.i(zzkVar);
            this.f4346a = zzkVar;
        }

        public final boolean b(zzgf.zzf zzfVar, long j10) {
            m6.j.i(zzfVar);
            if (this.f4348c == null) {
                this.f4348c = new ArrayList();
            }
            if (this.f4347b == null) {
                this.f4347b = new ArrayList();
            }
            if (!this.f4348c.isEmpty() && ((((zzgf.zzf) this.f4348c.get(0)).zzd() / 1000) / 60) / 60 != ((zzfVar.zzd() / 1000) / 60) / 60) {
                return false;
            }
            long zzcf = this.f4349d + zzfVar.zzcf();
            i6.this.R();
            if (zzcf >= Math.max(0, h0.f4253j.a(null).intValue())) {
                return false;
            }
            this.f4349d = zzcf;
            this.f4348c.add(zzfVar);
            this.f4347b.add(Long.valueOf(j10));
            int size = this.f4348c.size();
            i6.this.R();
            return size < Math.max(1, h0.f4255k.a(null).intValue());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final i6 f4351a;

        /* renamed from: b, reason: collision with root package name */
        public int f4352b = 1;

        /* renamed from: c, reason: collision with root package name */
        public long f4353c = a();

        public b(i6 i6Var) {
            this.f4351a = i6Var;
        }

        public final long a() {
            m6.j.i(this.f4351a);
            long longValue = h0.f4274u.a(null).longValue();
            long longValue2 = h0.f4276v.a(null).longValue();
            for (int i10 = 1; i10 < this.f4352b; i10++) {
                longValue <<= 1;
                if (longValue >= longValue2) {
                    break;
                }
            }
            ((b.z) this.f4351a.zzb()).getClass();
            return Math.min(longValue, longValue2) + System.currentTimeMillis();
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f4354a;

        /* renamed from: b, reason: collision with root package name */
        public long f4355b;

        public c(i6 i6Var, String str) {
            this.f4354a = str;
            ((b.z) i6Var.zzb()).getClass();
            this.f4355b = SystemClock.elapsedRealtime();
        }
    }

    public i6(m6 m6Var) {
        this.t = j2.a(m6Var.f4497a, null, null);
        o6 o6Var = new o6(this);
        o6Var.q();
        this.f4335o = o6Var;
        g1 g1Var = new g1(this);
        g1Var.q();
        this.f4331b = g1Var;
        w1 w1Var = new w1(this);
        w1Var.q();
        this.f4330a = w1Var;
        this.J = new HashMap();
        this.K = new HashMap();
        this.L = new HashMap();
        zzl().u(new i6.t(5, this, m6Var));
    }

    public static Boolean X(k6 k6Var) {
        Boolean bool = k6Var.f4451y;
        if (TextUtils.isEmpty(k6Var.M)) {
            return bool;
        }
        int i10 = l6.f4476a[((g3) d2.q.g(k6Var.M).f3407b).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Boolean.FALSE;
            }
            if (i10 == 3) {
                return Boolean.TRUE;
            }
            if (i10 != 4) {
                return bool;
            }
        }
        return null;
    }

    public static boolean Z(k6 k6Var) {
        return (TextUtils.isEmpty(k6Var.f4438b) && TextUtils.isEmpty(k6Var.f4450x)) ? false : true;
    }

    public static i6 f(Context context) {
        m6.j.i(context);
        m6.j.i(context.getApplicationContext());
        if (S == null) {
            synchronized (i6.class) {
                if (S == null) {
                    S = new i6(new m6(context));
                }
            }
        }
        return S;
    }

    public static String i(String str, Map map) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    public static void k(zzgf.zzf.zza zzaVar, int i10, String str) {
        List<zzgf.zzh> zzf = zzaVar.zzf();
        for (int i11 = 0; i11 < zzf.size(); i11++) {
            if ("_err".equals(zzf.get(i11).zzg())) {
                return;
            }
        }
        zzaVar.zza((zzgf.zzh) ((zzkg) zzgf.zzh.zze().zza("_err").zza(Long.valueOf(i10).longValue()).zzaj())).zza((zzgf.zzh) ((zzkg) zzgf.zzh.zze().zza("_ev").zzb(str).zzaj()));
    }

    public static void l(zzgf.zzf.zza zzaVar, String str) {
        List<zzgf.zzh> zzf = zzaVar.zzf();
        for (int i10 = 0; i10 < zzf.size(); i10++) {
            if (str.equals(zzf.get(i10).zzg())) {
                zzaVar.zza(i10);
                return;
            }
        }
    }

    public static void q(h6 h6Var) {
        if (h6Var == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (!h6Var.f4304d) {
            throw new IllegalStateException(defpackage.f.j("Component not initialized: ", String.valueOf(h6Var.getClass())));
        }
    }

    public final boolean A(String str, String str2) {
        o oVar = this.f4332c;
        q(oVar);
        b0 k02 = oVar.k0(str, str2);
        return k02 == null || k02.f4089c < 1;
    }

    public final j1 B() {
        j1 j1Var = this.f4333d;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final void C() {
        zzl().l();
        if (this.B || this.C || this.D) {
            zzj().f4067w.a(Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D), "Not stopping services. fetch, network, upload");
            return;
        }
        zzj().f4067w.b("Stopping uploading service(s)");
        ArrayList arrayList = this.f4343x;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ArrayList arrayList2 = this.f4343x;
        m6.j.i(arrayList2);
        arrayList2.clear();
    }

    public final void D() {
        zzl().l();
        if (h0.w0.a(null).intValue() > 0) {
            E();
            return;
        }
        for (String str : this.f4344y) {
            if (zzoy.zza() && R().x(str, h0.Q0)) {
                zzj().f4066v.c("Notifying app that trigger URIs are available. App ID", str);
                Intent intent = new Intent();
                intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intent.setPackage(str);
                this.t.f4360a.sendBroadcast(intent);
            }
        }
        this.f4344y.clear();
    }

    public final void E() {
        zzl().l();
        if (this.f4344y.isEmpty()) {
            return;
        }
        int i10 = 2;
        if (this.P == null) {
            this.P = new y3(this, this.t, i10);
        }
        if (this.P.f4703c != 0) {
            return;
        }
        ((b.z) zzb()).getClass();
        long max = Math.max(0L, h0.w0.a(null).intValue() - (SystemClock.elapsedRealtime() - this.Q));
        zzj().f4067w.c("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        if (this.P == null) {
            this.P = new y3(this, this.t, i10);
        }
        this.P.b(max);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F() {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.F():void");
    }

    public final boolean G() {
        a0.j.q(this);
        o oVar = this.f4332c;
        q(oVar);
        if (!(oVar.b0("select count(1) > 0 from raw_events", null) != 0)) {
            o oVar2 = this.f4332c;
            q(oVar2);
            if (TextUtils.isEmpty(oVar2.t())) {
                return false;
            }
        }
        return true;
    }

    public final e3 H(String str) {
        a0.j.q(this);
        e3 e3Var = (e3) this.J.get(str);
        if (e3Var == null) {
            o oVar = this.f4332c;
            q(oVar);
            e3Var = oVar.q0(str);
            if (e3Var == null) {
                e3Var = e3.f4165c;
            }
            a0.j.q(this);
            this.J.put(str, e3Var);
            o oVar2 = this.f4332c;
            q(oVar2);
            oVar2.f0(str, e3Var);
        }
        return e3Var;
    }

    public final void I(f fVar, k6 k6Var) {
        b1 b1Var;
        String str;
        Object p10;
        String g10;
        q6 q6Var;
        b1 b1Var2;
        String str2;
        Object p11;
        String g11;
        f0 f0Var;
        boolean z10;
        m6.j.i(fVar);
        m6.j.e(fVar.f4182a);
        m6.j.i(fVar.f4183b);
        m6.j.i(fVar.f4184c);
        m6.j.e(fVar.f4184c.f4599b);
        zzl().l();
        d0();
        if (Z(k6Var)) {
            if (!k6Var.f4443p) {
                e(k6Var);
                return;
            }
            f fVar2 = new f(fVar);
            boolean z11 = false;
            fVar2.f4186e = false;
            o oVar = this.f4332c;
            q(oVar);
            oVar.y0();
            try {
                o oVar2 = this.f4332c;
                q(oVar2);
                String str3 = fVar2.f4182a;
                m6.j.i(str3);
                f i02 = oVar2.i0(str3, fVar2.f4184c.f4599b);
                if (i02 != null && !i02.f4183b.equals(fVar2.f4183b)) {
                    zzj().f4063r.a(this.t.f4370u.g(fVar2.f4184c.f4599b), fVar2.f4183b, i02.f4183b, "Updating a conditional user property with different origin. name, origin, origin (from DB)");
                }
                if (i02 != null && (z10 = i02.f4186e)) {
                    fVar2.f4183b = i02.f4183b;
                    fVar2.f4185d = i02.f4185d;
                    fVar2.f4188p = i02.f4188p;
                    fVar2.f = i02.f;
                    fVar2.f4189q = i02.f4189q;
                    fVar2.f4186e = z10;
                    q6 q6Var2 = fVar2.f4184c;
                    fVar2.f4184c = new q6(q6Var2.f4599b, i02.f4184c.f, i02.f4184c.f4600c, q6Var2.D());
                } else if (TextUtils.isEmpty(fVar2.f)) {
                    q6 q6Var3 = fVar2.f4184c;
                    fVar2.f4184c = new q6(q6Var3.f4599b, fVar2.f4184c.f, fVar2.f4185d, q6Var3.D());
                    fVar2.f4186e = true;
                    z11 = true;
                }
                if (fVar2.f4186e) {
                    q6 q6Var4 = fVar2.f4184c;
                    String str4 = fVar2.f4182a;
                    m6.j.i(str4);
                    String str5 = fVar2.f4183b;
                    String str6 = q6Var4.f4599b;
                    long j10 = q6Var4.f4600c;
                    Object D = q6Var4.D();
                    m6.j.i(D);
                    s6 s6Var = new s6(str4, str5, str6, j10, D);
                    o oVar3 = this.f4332c;
                    q(oVar3);
                    if (oVar3.U(s6Var)) {
                        b1Var2 = zzj().f4066v;
                        str2 = "User property updated immediately";
                        p11 = fVar2.f4182a;
                        g11 = this.t.f4370u.g(s6Var.f4651c);
                    } else {
                        b1Var2 = zzj().f4060o;
                        str2 = "(2)Too many active user properties, ignoring";
                        p11 = a1.p(fVar2.f4182a);
                        g11 = this.t.f4370u.g(s6Var.f4651c);
                    }
                    b1Var2.a(p11, g11, s6Var.f4653e, str2);
                    if (z11 && (f0Var = fVar2.f4189q) != null) {
                        O(new f0(f0Var, fVar2.f4185d), k6Var);
                    }
                }
                o oVar4 = this.f4332c;
                q(oVar4);
                if (oVar4.S(fVar2)) {
                    b1Var = zzj().f4066v;
                    str = "Conditional property added";
                    p10 = fVar2.f4182a;
                    g10 = this.t.f4370u.g(fVar2.f4184c.f4599b);
                    q6Var = fVar2.f4184c;
                } else {
                    b1Var = zzj().f4060o;
                    str = "Too many conditional properties, ignoring";
                    p10 = a1.p(fVar2.f4182a);
                    g10 = this.t.f4370u.g(fVar2.f4184c.f4599b);
                    q6Var = fVar2.f4184c;
                }
                b1Var.a(p10, g10, q6Var.D(), str);
                o oVar5 = this.f4332c;
                q(oVar5);
                oVar5.C0();
            } finally {
                o oVar6 = this.f4332c;
                q(oVar6);
                oVar6.A0();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(e7.f0 r10, e7.k6 r11) {
        /*
            r9 = this;
            java.lang.String r0 = r11.f4437a
            m6.j.e(r0)
            e7.d1 r10 = e7.d1.b(r10)
            e7.r6 r0 = r9.b0()
            android.os.Bundle r1 = r10.f4145d
            e7.o r2 = r9.f4332c
            q(r2)
            java.lang.String r3 = r11.f4437a
            r2.l()
            r2.p()
            r4 = 0
            android.database.sqlite.SQLiteDatabase r5 = r2.s()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L77
            java.lang.String r6 = "select parameters from default_event_params where app_id=?"
            r7 = 1
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L77
            r8 = 0
            r7[r8] = r3     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L77
            android.database.Cursor r5 = r5.rawQuery(r6, r7)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L77
            boolean r6 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            if (r6 != 0) goto L3f
            e7.a1 r3 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            e7.b1 r3 = r3.f4067w     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            java.lang.String r6 = "Default event parameters not found"
            r3.b(r6)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            goto L86
        L3f:
            byte[] r6 = r5.getBlob(r8)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzgf$zzf$zza r7 = com.google.android.gms.internal.measurement.zzgf.zzf.zze()     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzlp r6 = e7.o6.z(r7, r6)     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzgf$zzf$zza r6 = (com.google.android.gms.internal.measurement.zzgf.zzf.zza) r6     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzlm r6 = r6.zzaj()     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzkg r6 = (com.google.android.gms.internal.measurement.zzkg) r6     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            com.google.android.gms.internal.measurement.zzgf$zzf r6 = (com.google.android.gms.internal.measurement.zzgf.zzf) r6     // Catch: java.io.IOException -> L61 android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            r2.m()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            java.util.List r3 = r6.zzh()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            android.os.Bundle r4 = e7.o6.u(r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            goto L86
        L61:
            r6 = move-exception
            e7.a1 r7 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            e7.b1 r7 = r7.f4060o     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            java.lang.String r8 = "Failed to retrieve default event parameters. appId"
            e7.e1 r3 = e7.a1.p(r3)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            r7.d(r8, r3, r6)     // Catch: android.database.sqlite.SQLiteException -> L72 java.lang.Throwable -> Le9
            goto L86
        L72:
            r3 = move-exception
            goto L79
        L74:
            r10 = move-exception
            goto Leb
        L77:
            r3 = move-exception
            r5 = r4
        L79:
            e7.a1 r2 = r2.zzj()     // Catch: java.lang.Throwable -> Le9
            e7.b1 r2 = r2.f4060o     // Catch: java.lang.Throwable -> Le9
            java.lang.String r6 = "Error selecting default event parameters"
            r2.c(r6, r3)     // Catch: java.lang.Throwable -> Le9
            if (r5 == 0) goto L89
        L86:
            r5.close()
        L89:
            r0.D(r1, r4)
            e7.r6 r0 = r9.b0()
            e7.h r1 = r9.R()
            java.lang.String r2 = r11.f4437a
            r1.getClass()
            e7.m0<java.lang.Integer> r3 = e7.h0.T
            r4 = 25
            r5 = 100
            int r1 = r1.m(r2, r3, r4, r5)
            r0.K(r10, r1)
            e7.f0 r10 = r10.a()
            java.lang.String r0 = r10.f4192a
            java.lang.String r1 = "_cmp"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le5
            e7.a0 r0 = r10.f4193b
            android.os.Bundle r0 = r0.f4057a
            java.lang.String r1 = "_cis"
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "referrer API v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Le5
            e7.a0 r0 = r10.f4193b
            android.os.Bundle r0 = r0.f4057a
            java.lang.String r1 = "gclid"
            java.lang.String r7 = r0.getString(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto Le5
            e7.q6 r0 = new e7.q6
            long r5 = r10.f4195d
            java.lang.String r3 = "_lgclid"
            java.lang.String r4 = "auto"
            r2 = r0
            r2.<init>(r3, r4, r5, r7)
            r9.r(r0, r11)
        Le5:
            r9.o(r10, r11)
            return
        Le9:
            r10 = move-exception
            r4 = r5
        Leb:
            if (r4 == 0) goto Lf0
            r4.close()
        Lf0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.J(e7.f0, e7.k6):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void K(k1 k1Var) {
        r.b bVar;
        r.b bVar2;
        zzl().l();
        if (TextUtils.isEmpty(k1Var.j()) && TextUtils.isEmpty(k1Var.d())) {
            String f = k1Var.f();
            m6.j.i(f);
            s(f, 204, null, null, null);
            return;
        }
        String f10 = k1Var.f();
        m6.j.i(f10);
        zzj().f4067w.c("Fetching remote configuration", f10);
        w1 w1Var = this.f4330a;
        q(w1Var);
        zzgc.zzd C = w1Var.C(f10);
        w1 w1Var2 = this.f4330a;
        q(w1Var2);
        w1Var2.l();
        String str = (String) w1Var2.f4727v.getOrDefault(f10, null);
        if (C != null) {
            if (TextUtils.isEmpty(str)) {
                bVar2 = null;
            } else {
                bVar2 = new r.b();
                bVar2.put("If-Modified-Since", str);
            }
            w1 w1Var3 = this.f4330a;
            q(w1Var3);
            w1Var3.l();
            String str2 = (String) w1Var3.f4728w.getOrDefault(f10, null);
            if (!TextUtils.isEmpty(str2)) {
                if (bVar2 == null) {
                    bVar2 = new r.b();
                }
                bVar2.put("If-None-Match", str2);
            }
            bVar = bVar2;
        } else {
            bVar = null;
        }
        this.B = true;
        g1 g1Var = this.f4331b;
        q(g1Var);
        d2.q qVar = new d2.q(this, 6);
        g1Var.l();
        g1Var.p();
        Uri.Builder builder = new Uri.Builder();
        String j10 = k1Var.j();
        if (TextUtils.isEmpty(j10)) {
            j10 = k1Var.d();
        }
        builder.scheme(h0.f.a(null)).encodedAuthority(h0.f4247g.a(null)).path("config/app/" + j10).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "114010").appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            g1Var.zzl().s(new h1(g1Var, k1Var.f(), new URI(uri).toURL(), null, bVar, qVar));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            g1Var.zzj().f4060o.d("Failed to parse config URL. Not fetching. appId", a1.p(k1Var.f()), uri);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r4v227 ??), method size: 8743
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    public final boolean L(java.lang.String r71, long r72) {
        /*
            Method dump skipped, instructions count: 8743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.L(java.lang.String, long):boolean");
    }

    public final k6 M(String str) {
        b1 b1Var;
        Object obj;
        String str2;
        o oVar = this.f4332c;
        q(oVar);
        k1 l02 = oVar.l0(str);
        if (l02 == null || TextUtils.isEmpty(l02.h())) {
            b1Var = zzj().f4066v;
            obj = str;
            str2 = "No app data available; dropping";
        } else {
            Boolean g10 = g(l02);
            if (g10 == null || g10.booleanValue()) {
                String j10 = l02.j();
                String h10 = l02.h();
                long w10 = l02.w();
                l02.f4393a.zzl().l();
                String str3 = l02.f4403l;
                l02.f4393a.zzl().l();
                long j11 = l02.f4404m;
                l02.f4393a.zzl().l();
                long j12 = l02.f4405n;
                l02.f4393a.zzl().l();
                boolean z10 = l02.f4406o;
                String i10 = l02.i();
                l02.f4393a.zzl().l();
                boolean z11 = l02.f4407p;
                String d10 = l02.d();
                l02.f4393a.zzl().l();
                Boolean bool = l02.f4409r;
                l02.f4393a.zzl().l();
                long j13 = l02.f4410s;
                l02.f4393a.zzl().l();
                ArrayList arrayList = l02.t;
                String n2 = H(str).n();
                boolean l10 = l02.l();
                l02.f4393a.zzl().l();
                long j14 = l02.f4413w;
                int i11 = H(str).f4167b;
                String str4 = P(str).f4745b;
                l02.f4393a.zzl().l();
                int i12 = l02.f4415y;
                l02.f4393a.zzl().l();
                long j15 = l02.C;
                String k10 = l02.k();
                l02.f4393a.zzl().l();
                return new k6(str, j10, h10, w10, str3, j11, j12, null, z10, false, i10, 0L, 0, z11, false, d10, bool, j13, arrayList, n2, "", null, l10, j14, i11, str4, i12, j15, k10, l02.H, 0L, l02.m());
            }
            b1Var = zzj().f4060o;
            obj = a1.p(str);
            str2 = "App version does not match; dropping. appId";
        }
        b1Var.c(str2, obj);
        return null;
    }

    public final y6 N() {
        y6 y6Var = this.f;
        q(y6Var);
        return y6Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:78|(2:80|(1:82)(6:83|84|85|(1:87)|88|(0)))|371|372|373|374|375|376|377|84|85|(0)|88|(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(61:(2:103|(5:105|(1:107)|108|109|110))|(2:112|(5:114|(1:116)|117|118|119))|120|121|(1:123)|124|(1:130)|131|(2:141|142)|145|146|(1:148)|149|(2:151|(2:157|158)(3:154|155|156))(9:355|356|357|358|359|360|361|362|363)|159|(1:161)|162|(1:164)|165|(1:167)|168|(1:170)|171|(1:173)|174|(1:176)|177|178|179|180|(1:184)|185|(2:189|(33:191|(1:195)|196|(1:198)(1:345)|199|(15:201|(1:203)(1:229)|204|(1:206)(1:228)|207|(1:209)(1:227)|210|(1:212)(1:226)|213|(1:215)(1:225)|216|(1:218)(1:224)|219|(1:221)(1:223)|222)|230|(1:232)|233|(1:235)|236|(4:240|(1:242)(1:343)|243|(4:247|(1:249)|250|(2:256|(25:258|(1:260)|261|(1:263)|264|265|(2:267|(1:269))|270|(3:272|(1:274)|275)(1:342)|276|(1:280)|281|(1:283)|284|(6:287|(1:289)(2:306|(1:308)(2:309|(1:311)(1:312)))|290|(2:292|(4:294|(1:296)(1:303)|297|(2:299|300)(1:302))(1:304))(1:305)|301|285)|313|314|315|(8:317|(2:318|(2:320|(2:322|323)(1:332))(3:333|334|(1:336)))|324|325|(1:327)|328|329|330)|338|325|(0)|328|329|330))))|344|265|(0)|270|(0)(0)|276|(2:278|280)|281|(0)|284|(1:285)|313|314|315|(0)|338|325|(0)|328|329|330))|346|230|(0)|233|(0)|236|(5:238|240|(0)(0)|243|(5:245|247|(0)|250|(4:252|254|256|(0))))|344|265|(0)|270|(0)(0)|276|(0)|281|(0)|284|(1:285)|313|314|315|(0)|338|325|(0)|328|329|330) */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0aa5, code lost:
    
        if (r7 < r4.q(r9, e7.h0.f4265p)) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0ab5, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0ab6, code lost:
    
        zzj().w().d("Data loss. Failed to insert raw event metadata. appId", e7.a1.p(r1.zzu()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x02ec, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x02f2, code lost:
    
        r8.zzj().w().d("Error pruning currencies. appId", e7.a1.p(r15), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x02ee, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x02ef, code lost:
    
        r23 = "_fx";
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0794 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x07a6 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x07d3 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07fa A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0832 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x08c9 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08e2 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x094b A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0969 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0983 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0a57 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0ab0 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07d8 A[Catch: all -> 0x087d, TryCatch #6 {all -> 0x087d, blocks: (B:180:0x06b0, B:182:0x06cf, B:184:0x06d7, B:185:0x06dc, B:187:0x06e2, B:189:0x06f0, B:191:0x06fb, B:195:0x0710, B:199:0x071d, B:201:0x0724, B:204:0x0732, B:207:0x073f, B:210:0x074c, B:213:0x0759, B:216:0x0766, B:219:0x0771, B:222:0x077d, B:230:0x078e, B:232:0x0794, B:233:0x0797, B:235:0x07a6, B:236:0x07a9, B:238:0x07c2, B:240:0x07c6, B:242:0x07d3, B:243:0x07e1, B:245:0x07eb, B:247:0x07ef, B:249:0x07fa, B:250:0x0803, B:252:0x080d, B:254:0x0819, B:256:0x0825, B:258:0x0832, B:260:0x084b, B:261:0x0858, B:263:0x0865, B:264:0x086e, B:265:0x0882, B:267:0x08c9, B:269:0x08d3, B:270:0x08d6, B:272:0x08e2, B:274:0x0902, B:275:0x090f, B:276:0x0945, B:278:0x094b, B:280:0x0955, B:281:0x095f, B:283:0x0969, B:284:0x0973, B:285:0x097d, B:287:0x0983, B:289:0x09bd, B:290:0x09ea, B:292:0x09fd, B:294:0x0a0c, B:297:0x0a27, B:299:0x0a36, B:303:0x0a19, B:306:0x09c3, B:308:0x09c7, B:309:0x09d1, B:311:0x09d5, B:312:0x09df, B:314:0x0a3f, B:315:0x0a4f, B:317:0x0a57, B:318:0x0a5b, B:320:0x0a64, B:325:0x0aaa, B:327:0x0ab0, B:328:0x0acc, B:334:0x0a71, B:336:0x0a91, B:341:0x0ab6, B:343:0x07d8), top: B:179:0x06b0, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:389:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6 A[Catch: all -> 0x01ff, TRY_ENTER, TryCatch #9 {all -> 0x01ff, blocks: (B:392:0x019c, B:394:0x01a6, B:62:0x01c6, B:64:0x01d2, B:66:0x01e9, B:71:0x0211, B:74:0x0250, B:76:0x0256, B:78:0x0264, B:80:0x027c, B:83:0x0283, B:85:0x031e, B:87:0x0328, B:90:0x0360, B:96:0x03c5, B:98:0x03ca, B:99:0x03e1, B:103:0x03f2, B:105:0x040a, B:107:0x0411, B:108:0x0428, B:112:0x044a, B:116:0x046e, B:117:0x0485, B:123:0x04b5, B:126:0x04d7, B:128:0x04e3, B:130:0x04e9, B:133:0x04fe, B:135:0x0508, B:137:0x0512, B:139:0x0518, B:142:0x051c, B:148:0x0534, B:151:0x056f, B:154:0x058f, B:157:0x05d1, B:371:0x02af, B:373:0x02cd, B:376:0x02d6, B:377:0x0303, B:381:0x02f2, B:386:0x021f, B:388:0x023e), top: B:391:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0328 A[Catch: all -> 0x01ff, TryCatch #9 {all -> 0x01ff, blocks: (B:392:0x019c, B:394:0x01a6, B:62:0x01c6, B:64:0x01d2, B:66:0x01e9, B:71:0x0211, B:74:0x0250, B:76:0x0256, B:78:0x0264, B:80:0x027c, B:83:0x0283, B:85:0x031e, B:87:0x0328, B:90:0x0360, B:96:0x03c5, B:98:0x03ca, B:99:0x03e1, B:103:0x03f2, B:105:0x040a, B:107:0x0411, B:108:0x0428, B:112:0x044a, B:116:0x046e, B:117:0x0485, B:123:0x04b5, B:126:0x04d7, B:128:0x04e3, B:130:0x04e9, B:133:0x04fe, B:135:0x0508, B:137:0x0512, B:139:0x0518, B:142:0x051c, B:148:0x0534, B:151:0x056f, B:154:0x058f, B:157:0x05d1, B:371:0x02af, B:373:0x02cd, B:376:0x02d6, B:377:0x0303, B:381:0x02f2, B:386:0x021f, B:388:0x023e), top: B:391:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0360 A[Catch: all -> 0x01ff, TRY_LEAVE, TryCatch #9 {all -> 0x01ff, blocks: (B:392:0x019c, B:394:0x01a6, B:62:0x01c6, B:64:0x01d2, B:66:0x01e9, B:71:0x0211, B:74:0x0250, B:76:0x0256, B:78:0x0264, B:80:0x027c, B:83:0x0283, B:85:0x031e, B:87:0x0328, B:90:0x0360, B:96:0x03c5, B:98:0x03ca, B:99:0x03e1, B:103:0x03f2, B:105:0x040a, B:107:0x0411, B:108:0x0428, B:112:0x044a, B:116:0x046e, B:117:0x0485, B:123:0x04b5, B:126:0x04d7, B:128:0x04e3, B:130:0x04e9, B:133:0x04fe, B:135:0x0508, B:137:0x0512, B:139:0x0518, B:142:0x051c, B:148:0x0534, B:151:0x056f, B:154:0x058f, B:157:0x05d1, B:371:0x02af, B:373:0x02cd, B:376:0x02d6, B:377:0x0303, B:381:0x02f2, B:386:0x021f, B:388:0x023e), top: B:391:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03c5 A[Catch: all -> 0x01ff, TRY_ENTER, TryCatch #9 {all -> 0x01ff, blocks: (B:392:0x019c, B:394:0x01a6, B:62:0x01c6, B:64:0x01d2, B:66:0x01e9, B:71:0x0211, B:74:0x0250, B:76:0x0256, B:78:0x0264, B:80:0x027c, B:83:0x0283, B:85:0x031e, B:87:0x0328, B:90:0x0360, B:96:0x03c5, B:98:0x03ca, B:99:0x03e1, B:103:0x03f2, B:105:0x040a, B:107:0x0411, B:108:0x0428, B:112:0x044a, B:116:0x046e, B:117:0x0485, B:123:0x04b5, B:126:0x04d7, B:128:0x04e3, B:130:0x04e9, B:133:0x04fe, B:135:0x0508, B:137:0x0512, B:139:0x0518, B:142:0x051c, B:148:0x0534, B:151:0x056f, B:154:0x058f, B:157:0x05d1, B:371:0x02af, B:373:0x02cd, B:376:0x02d6, B:377:0x0303, B:381:0x02f2, B:386:0x021f, B:388:0x023e), top: B:391:0x019c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O(e7.f0 r42, e7.k6 r43) {
        /*
            Method dump skipped, instructions count: 2836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.O(e7.f0, e7.k6):void");
    }

    public final x P(String str) {
        a0.j.q(this);
        x xVar = (x) this.K.get(str);
        if (xVar != null) {
            return xVar;
        }
        o oVar = this.f4332c;
        q(oVar);
        m6.j.i(str);
        oVar.l();
        oVar.p();
        x b10 = x.b(oVar.B("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}));
        this.K.put(str, b10);
        return b10;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:92|93|(2:95|(8:97|(3:99|(1:121)|103)(1:122)|104|(1:106)(1:120)|107|108|109|(4:111|(1:113)|114|(1:116))))|123|108|109|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0436, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0437, code lost:
    
        zzj().f4060o.d("Application info is null, first open report might be inaccurate. appId", e7.a1.p(r8), r0);
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x00da, code lost:
    
        if (r11.booleanValue() == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x00dc, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x00e1, code lost:
    
        r11 = 1;
        r0 = new e7.q6("_npa", "auto", r21, java.lang.Long.valueOf(r17));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x00f0, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00fa, code lost:
    
        if (r10.f4653e.equals(r0.f4601d) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x00fc, code lost:
    
        r(r0, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x00df, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0449 A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x04ca A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0116 A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d2 A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x022e A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x024b A[Catch: all -> 0x04fa, TRY_LEAVE, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x038c A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03b0 A[Catch: all -> 0x04fa, TRY_LEAVE, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0465 A[Catch: all -> 0x04fa, TryCatch #2 {all -> 0x04fa, blocks: (B:25:0x00b0, B:27:0x00c3, B:31:0x0106, B:33:0x0116, B:35:0x012b, B:37:0x0150, B:39:0x01af, B:43:0x01c0, B:45:0x01d2, B:47:0x01dd, B:50:0x01ea, B:53:0x01fb, B:56:0x0206, B:58:0x0209, B:61:0x0229, B:63:0x022e, B:64:0x0243, B:66:0x024b, B:69:0x025f, B:71:0x0282, B:74:0x028a, B:76:0x0299, B:77:0x035d, B:78:0x0360, B:80:0x038c, B:81:0x038f, B:83:0x03b0, B:86:0x0465, B:87:0x0468, B:88:0x04e9, B:93:0x03c1, B:95:0x03e2, B:97:0x03ea, B:99:0x03f0, B:104:0x040c, B:107:0x0417, B:109:0x0428, B:111:0x0449, B:113:0x044f, B:114:0x0454, B:116:0x045a, B:119:0x0437, B:121:0x0403, B:126:0x03d0, B:127:0x02a5, B:129:0x02ce, B:130:0x02da, B:132:0x02e1, B:134:0x02e7, B:136:0x02f1, B:138:0x02f7, B:140:0x02fd, B:142:0x0303, B:144:0x0308, B:147:0x0326, B:151:0x032b, B:152:0x033d, B:153:0x0348, B:154:0x0353, B:157:0x0482, B:159:0x04b3, B:160:0x04b6, B:161:0x04e6, B:162:0x04ca, B:164:0x04ce, B:166:0x023a, B:169:0x00d2, B:172:0x00e1, B:174:0x00f2, B:176:0x00fc, B:180:0x0103), top: B:24:0x00b0, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q(e7.k6 r24) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.Q(e7.k6):void");
    }

    public final h R() {
        j2 j2Var = this.t;
        m6.j.i(j2Var);
        return j2Var.f4365o;
    }

    public final void S(String str) {
        zzgf.zzj zzjVar;
        b1 b1Var;
        String str2;
        a0.j.q(this);
        this.D = true;
        try {
            Boolean bool = this.t.l().f;
            if (bool == null) {
                b1Var = zzj().f4063r;
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!bool.booleanValue()) {
                    if (this.f4342w <= 0) {
                        g1 g1Var = this.f4331b;
                        q(g1Var);
                        if (g1Var.u()) {
                            o oVar = this.f4332c;
                            q(oVar);
                            if (oVar.z0(str)) {
                                o oVar2 = this.f4332c;
                                q(oVar2);
                                n6 s02 = oVar2.s0(str);
                                if (s02 != null && (zzjVar = s02.f4521b) != null) {
                                    byte[] zzce = zzjVar.zzce();
                                    if (zzj().u(2)) {
                                        o6 o6Var = this.f4335o;
                                        q(o6Var);
                                        zzj().f4067w.a(str, Integer.valueOf(zzce.length), o6Var.C(zzjVar), "Uploading data from upload queue. appId, uncompressed size, data");
                                    }
                                    this.C = true;
                                    g1 g1Var2 = this.f4331b;
                                    q(g1Var2);
                                    String str3 = s02.f4522c;
                                    Map<String, String> map = s02.f4523d;
                                    l3.j jVar = new l3.j(this, str, s02);
                                    g1Var2.l();
                                    g1Var2.p();
                                    try {
                                        URL url = new URI(str3).toURL();
                                        g1Var2.m();
                                        g1Var2.zzl().s(new h1(g1Var2, str, url, zzjVar.zzce(), map == null ? Collections.emptyMap() : map, jVar));
                                    } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                                        g1Var2.zzj().f4060o.d("Failed to parse URL. Not uploading MeasurementBatch. appId", a1.p(str), str3);
                                    }
                                }
                            } else {
                                zzj().f4067w.c("Upload queue has no batches for appId", str);
                            }
                        }
                        zzj().f4067w.b("Network not connected, ignoring upload request");
                    }
                    F();
                }
                b1Var = zzj().f4060o;
                str2 = "Upload called in the client side when service should be used";
            }
            b1Var.b(str2);
        } finally {
            this.D = false;
            C();
        }
    }

    public final o T() {
        o oVar = this.f4332c;
        q(oVar);
        return oVar;
    }

    public final void U(k6 k6Var) {
        g3 g3Var = g3.GRANTED;
        a0.j.q(this);
        m6.j.e(k6Var.f4437a);
        x b10 = x.b(k6Var.I);
        zzj().f4067w.d("Setting DMA consent for package", k6Var.f4437a, b10);
        String str = k6Var.f4437a;
        zzl().l();
        d0();
        g3 d10 = x.a(100, c(str)).d();
        this.K.put(str, b10);
        o oVar = this.f4332c;
        q(oVar);
        m6.j.i(str);
        m6.j.i(b10);
        oVar.l();
        oVar.p();
        e3 q02 = oVar.q0(str);
        e3 e3Var = e3.f4165c;
        if (q02 == e3Var) {
            oVar.f0(str, e3Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", b10.f4745b);
        oVar.F(contentValues);
        g3 d11 = x.a(100, c(str)).d();
        a0.j.q(this);
        g3 g3Var2 = g3.DENIED;
        boolean z10 = d10 == g3Var2 && d11 == g3Var;
        boolean z11 = d10 == g3Var && d11 == g3Var2;
        if (z10 || z11) {
            zzj().f4067w.c("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            o oVar2 = this.f4332c;
            q(oVar2);
            if (oVar2.y(f0(), str, false, false, false, false).f < R().q(str, h0.f4250h0)) {
                bundle.putLong("_r", 1L);
                o oVar3 = this.f4332c;
                q(oVar3);
                zzj().f4067w.d("_dcu realtime event count", str, Long.valueOf(oVar3.y(f0(), str, false, false, true, false).f));
            }
            this.R.a(str, "_dcu", bundle);
        }
    }

    public final boolean V(String str) {
        b bVar = (b) this.M.get(str);
        if (bVar == null) {
            return true;
        }
        ((b.z) bVar.f4351a.zzb()).getClass();
        return System.currentTimeMillis() >= bVar.f4353c;
    }

    public final void W(k6 k6Var) {
        a0.j.q(this);
        m6.j.e(k6Var.f4437a);
        e3 c10 = e3.c(k6Var.H, k6Var.C);
        H(k6Var.f4437a);
        zzj().f4067w.d("Setting storage consent for package", k6Var.f4437a, c10);
        String str = k6Var.f4437a;
        a0.j.q(this);
        this.J.put(str, c10);
        o oVar = this.f4332c;
        q(oVar);
        oVar.f0(str, c10);
    }

    public final w1 Y() {
        w1 w1Var = this.f4330a;
        q(w1Var);
        return w1Var;
    }

    public final int a(String str, l lVar) {
        g3 v10;
        e3.a aVar = e3.a.AD_PERSONALIZATION;
        if (this.f4330a.B(str) == null) {
            lVar.b(aVar, k.FAILSAFE);
            return 1;
        }
        o oVar = this.f4332c;
        q(oVar);
        k1 l02 = oVar.l0(str);
        if (l02 != null) {
            l02.f4393a.zzl().l();
            if (((g3) d2.q.g(l02.H).f3407b) == g3.POLICY && (v10 = this.f4330a.v(str, aVar)) != g3.UNINITIALIZED) {
                lVar.b(aVar, k.REMOTE_ENFORCED_DEFAULT);
                return v10 == g3.GRANTED ? 0 : 1;
            }
        }
        lVar.b(aVar, k.REMOTE_DEFAULT);
        return this.f4330a.D(str, aVar) ? 0 : 1;
    }

    public final o6 a0() {
        o6 o6Var = this.f4335o;
        q(o6Var);
        return o6Var;
    }

    public final Bundle b(f0 f0Var, String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", Long.valueOf(f0Var.f4193b.f4057a.getLong("_sid")).longValue());
        o oVar = this.f4332c;
        q(oVar);
        s6 m02 = oVar.m0(str, "_sno");
        if (m02 != null) {
            Object obj = m02.f4653e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    public final r6 b0() {
        j2 j2Var = this.t;
        m6.j.i(j2Var);
        return j2Var.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bundle c(String str) {
        String str2;
        a0.j.q(this);
        w1 w1Var = this.f4330a;
        q(w1Var);
        if (w1Var.B(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        e3 H = H(str);
        Bundle bundle2 = new Bundle();
        Iterator<Map.Entry<e3.a, g3>> it = H.f4166a.entrySet().iterator();
        while (true) {
            str2 = "granted";
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<e3.a, g3> next = it.next();
            int ordinal = next.getValue().ordinal();
            if (ordinal == 2) {
                str2 = "denied";
            } else if (ordinal != 3) {
                str2 = null;
            }
            if (str2 != null) {
                bundle2.putString(next.getKey().f4172a, str2);
            }
        }
        bundle.putAll(bundle2);
        x d10 = d(str, P(str), H, new l());
        Bundle bundle3 = new Bundle();
        for (Map.Entry<e3.a, g3> entry : d10.f4748e.entrySet()) {
            int ordinal2 = entry.getValue().ordinal();
            String str3 = ordinal2 != 2 ? ordinal2 != 3 ? null : "granted" : "denied";
            if (str3 != null) {
                bundle3.putString(entry.getKey().f4172a, str3);
            }
        }
        Boolean bool = d10.f4746c;
        if (bool != null) {
            bundle3.putString("is_dma_region", bool.toString());
        }
        String str4 = d10.f4747d;
        if (str4 != null) {
            bundle3.putString("cps_display_str", str4);
        }
        bundle.putAll(bundle3);
        o oVar = this.f4332c;
        q(oVar);
        s6 m02 = oVar.m0(str, "_npa");
        bundle.putString("ad_personalization", (m02 != null ? m02.f4653e.equals(1L) : a(str, new l())) == 1 ? "denied" : "granted");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c0() {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.c0():void");
    }

    public final x d(String str, x xVar, e3 e3Var, l lVar) {
        k kVar;
        g3 v10;
        g3 g3Var = g3.UNINITIALIZED;
        g3 g3Var2 = g3.GRANTED;
        g3 g3Var3 = g3.DENIED;
        e3.a aVar = e3.a.AD_USER_DATA;
        w1 w1Var = this.f4330a;
        q(w1Var);
        int i10 = 90;
        if (w1Var.B(str) == null) {
            if (xVar.d() == g3Var3) {
                i10 = xVar.f4744a;
                lVar.a(aVar, i10);
            } else {
                lVar.b(aVar, k.FAILSAFE);
            }
            return new x(Boolean.FALSE, i10, Boolean.TRUE, "-");
        }
        g3 d10 = xVar.d();
        if (d10 == g3Var2 || d10 == g3Var3) {
            i10 = xVar.f4744a;
            lVar.a(aVar, i10);
        } else {
            if (d10 != g3.POLICY || (v10 = this.f4330a.v(str, aVar)) == g3Var) {
                w1 w1Var2 = this.f4330a;
                w1Var2.l();
                w1Var2.L(str);
                zzgc.zza B = w1Var2.B(str);
                e3.a aVar2 = null;
                if (B != null) {
                    Iterator<zzgc.zza.zzc> it = B.zze().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        zzgc.zza.zzc next = it.next();
                        if (aVar == w1.u(next.zzc())) {
                            aVar2 = w1.u(next.zzb());
                            break;
                        }
                    }
                }
                EnumMap<e3.a, g3> enumMap = e3Var.f4166a;
                e3.a aVar3 = e3.a.AD_STORAGE;
                g3 g3Var4 = enumMap.get(aVar3);
                if (g3Var4 != null) {
                    g3Var = g3Var4;
                }
                boolean z10 = g3Var == g3Var2 || g3Var == g3Var3;
                if (aVar2 == aVar3 && z10) {
                    kVar = k.REMOTE_DELEGATION;
                    g3Var2 = g3Var;
                } else {
                    lVar.b(aVar, k.REMOTE_DEFAULT);
                    if (!this.f4330a.D(str, aVar)) {
                        g3Var2 = g3Var3;
                    }
                    d10 = g3Var2;
                }
            } else {
                kVar = k.REMOTE_ENFORCED_DEFAULT;
                g3Var2 = v10;
            }
            lVar.b(aVar, kVar);
            d10 = g3Var2;
        }
        boolean I = this.f4330a.I(str);
        w1 w1Var3 = this.f4330a;
        q(w1Var3);
        w1Var3.l();
        w1Var3.L(str);
        TreeSet treeSet = new TreeSet();
        zzgc.zza B2 = w1Var3.B(str);
        if (B2 != null) {
            Iterator<zzgc.zza.zzf> it2 = B2.zzc().iterator();
            while (it2.hasNext()) {
                treeSet.add(it2.next().zzb());
            }
        }
        if (d10 == g3Var3 || treeSet.isEmpty()) {
            return new x(Boolean.FALSE, i10, Boolean.valueOf(I), "-");
        }
        return new x(Boolean.TRUE, i10, Boolean.valueOf(I), I ? TextUtils.join("", treeSet) : "");
    }

    public final void d0() {
        if (!this.f4340u) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0134, code lost:
    
        if (r1.p() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0147, code lost:
    
        r0.o(h(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0145, code lost:
    
        if (r1.p() != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final e7.k1 e(e7.k6 r14) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.e(e7.k6):e7.k1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0109, code lost:
    
        if (r7 == null) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.e0():void");
    }

    public final long f0() {
        ((b.z) zzb()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        l5 l5Var = this.f4337q;
        l5Var.p();
        l5Var.l();
        long a10 = l5Var.f4475s.a();
        if (a10 == 0) {
            a10 = 1 + l5Var.k().C0().nextInt(86400000);
            l5Var.f4475s.b(a10);
        }
        return ((((currentTimeMillis + a10) / 1000) / 60) / 60) / 24;
    }

    public final Boolean g(k1 k1Var) {
        try {
            if (k1Var.w() != -2147483648L) {
                if (k1Var.w() == x6.d.a(this.t.f4360a).b(0, k1Var.f()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = x6.d.a(this.t.f4360a).b(0, k1Var.f()).versionName;
                String h10 = k1Var.h();
                if (h10 != null && h10.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final String h(e3 e3Var) {
        if (!e3Var.p()) {
            return null;
        }
        byte[] bArr = new byte[16];
        b0().C0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012c, code lost:
    
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List j(android.os.Bundle r19, e7.k6 r20) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.j(android.os.Bundle, e7.k6):java.util.List");
    }

    public final void m(zzgf.zzk.zza zzaVar, long j10, boolean z10) {
        s6 s6Var;
        String str = z10 ? "_se" : "_lte";
        o oVar = this.f4332c;
        q(oVar);
        s6 m02 = oVar.m0(zzaVar.zzu(), str);
        if (m02 == null || m02.f4653e == null) {
            String zzu = zzaVar.zzu();
            ((b.z) zzb()).getClass();
            s6Var = new s6(zzu, "auto", str, System.currentTimeMillis(), Long.valueOf(j10));
        } else {
            String zzu2 = zzaVar.zzu();
            ((b.z) zzb()).getClass();
            s6Var = new s6(zzu2, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) m02.f4653e).longValue() + j10));
        }
        zzgf.zzp.zza zza = zzgf.zzp.zze().zza(str);
        ((b.z) zzb()).getClass();
        zzgf.zzp zzpVar = (zzgf.zzp) ((zzkg) zza.zzb(System.currentTimeMillis()).zza(((Long) s6Var.f4653e).longValue()).zzaj());
        boolean z11 = false;
        int s10 = o6.s(zzaVar, str);
        if (s10 >= 0) {
            zzaVar.zza(s10, zzpVar);
            z11 = true;
        }
        if (!z11) {
            zzaVar.zza(zzpVar);
        }
        if (j10 > 0) {
            o oVar2 = this.f4332c;
            q(oVar2);
            oVar2.U(s6Var);
            zzj().f4067w.d("Updated engagement user property. scope, value", z10 ? "session-scoped" : "lifetime", s6Var.f4653e);
        }
    }

    public final void n(f fVar, k6 k6Var) {
        m6.j.i(fVar);
        m6.j.e(fVar.f4182a);
        m6.j.i(fVar.f4184c);
        m6.j.e(fVar.f4184c.f4599b);
        zzl().l();
        d0();
        if (Z(k6Var)) {
            if (!k6Var.f4443p) {
                e(k6Var);
                return;
            }
            o oVar = this.f4332c;
            q(oVar);
            oVar.y0();
            try {
                e(k6Var);
                String str = fVar.f4182a;
                m6.j.i(str);
                o oVar2 = this.f4332c;
                q(oVar2);
                f i02 = oVar2.i0(str, fVar.f4184c.f4599b);
                if (i02 != null) {
                    zzj().f4066v.d("Removing conditional user property", fVar.f4182a, this.t.f4370u.g(fVar.f4184c.f4599b));
                    o oVar3 = this.f4332c;
                    q(oVar3);
                    oVar3.Q(str, fVar.f4184c.f4599b);
                    if (i02.f4186e) {
                        o oVar4 = this.f4332c;
                        q(oVar4);
                        oVar4.r0(str, fVar.f4184c.f4599b);
                    }
                    f0 f0Var = fVar.f4191s;
                    if (f0Var != null) {
                        a0 a0Var = f0Var.f4193b;
                        Bundle E = a0Var != null ? a0Var.E() : null;
                        r6 b02 = b0();
                        f0 f0Var2 = fVar.f4191s;
                        m6.j.i(f0Var2);
                        f0 y10 = b02.y(f0Var2.f4192a, E, i02.f4183b, fVar.f4191s.f4195d, true);
                        m6.j.i(y10);
                        O(y10, k6Var);
                    }
                } else {
                    zzj().f4063r.d("Conditional user property doesn't exist", a1.p(fVar.f4182a), this.t.f4370u.g(fVar.f4184c.f4599b));
                }
                o oVar5 = this.f4332c;
                q(oVar5);
                oVar5.C0();
            } finally {
                o oVar6 = this.f4332c;
                q(oVar6);
                oVar6.A0();
            }
        }
    }

    public final void o(f0 f0Var, k6 k6Var) {
        f0 f0Var2;
        List<f> E;
        List<f> E2;
        List<f> E3;
        b1 b1Var;
        String str;
        Object p10;
        String g10;
        String str2;
        m6.j.i(k6Var);
        m6.j.e(k6Var.f4437a);
        zzl().l();
        d0();
        String str3 = k6Var.f4437a;
        long j10 = f0Var.f4195d;
        d1 b10 = d1.b(f0Var);
        zzl().l();
        r6.L((this.N == null || (str2 = this.O) == null || !str2.equals(str3)) ? null : this.N, b10.f4145d, false);
        f0 a10 = b10.a();
        a0();
        if ((TextUtils.isEmpty(k6Var.f4438b) && TextUtils.isEmpty(k6Var.f4450x)) ? false : true) {
            if (!k6Var.f4443p) {
                e(k6Var);
                return;
            }
            List<String> list = k6Var.A;
            if (list == null) {
                f0Var2 = a10;
            } else if (!list.contains(a10.f4192a)) {
                zzj().f4066v.a(str3, a10.f4192a, a10.f4194c, "Dropping non-safelisted event. appId, event name, origin");
                return;
            } else {
                Bundle E4 = a10.f4193b.E();
                E4.putLong("ga_safelisted", 1L);
                f0Var2 = new f0(a10.f4192a, new a0(E4), a10.f4194c, a10.f4195d);
            }
            o oVar = this.f4332c;
            q(oVar);
            oVar.y0();
            try {
                if (zzpe.zza() && R().x(null, h0.f4246f1) && "_s".equals(f0Var2.f4192a)) {
                    o oVar2 = this.f4332c;
                    q(oVar2);
                    if (!oVar2.t0(str3, "_s") && Long.valueOf(f0Var2.f4193b.f4057a.getLong("_sid")).longValue() != 0) {
                        o oVar3 = this.f4332c;
                        q(oVar3);
                        if (!oVar3.t0(str3, "_f")) {
                            o oVar4 = this.f4332c;
                            q(oVar4);
                            if (!oVar4.t0(str3, "_v")) {
                                o oVar5 = this.f4332c;
                                q(oVar5);
                                ((b.z) zzb()).getClass();
                                oVar5.P(str3, Long.valueOf(System.currentTimeMillis() - 15000), "_sid", b(f0Var2, k6Var.f4437a));
                            }
                        }
                        o oVar6 = this.f4332c;
                        q(oVar6);
                        oVar6.P(str3, null, "_sid", b(f0Var2, k6Var.f4437a));
                    }
                }
                o oVar7 = this.f4332c;
                q(oVar7);
                m6.j.e(str3);
                oVar7.l();
                oVar7.p();
                if (j10 < 0) {
                    oVar7.zzj().f4063r.d("Invalid time querying timed out conditional properties", a1.p(str3), Long.valueOf(j10));
                    E = Collections.emptyList();
                } else {
                    E = oVar7.E("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str3, String.valueOf(j10)});
                }
                for (f fVar : E) {
                    if (fVar != null) {
                        zzj().f4067w.a(fVar.f4182a, this.t.f4370u.g(fVar.f4184c.f4599b), fVar.f4184c.D(), "User property timed out");
                        f0 f0Var3 = fVar.f4187o;
                        if (f0Var3 != null) {
                            O(new f0(f0Var3, j10), k6Var);
                        }
                        o oVar8 = this.f4332c;
                        q(oVar8);
                        oVar8.Q(str3, fVar.f4184c.f4599b);
                    }
                }
                o oVar9 = this.f4332c;
                q(oVar9);
                m6.j.e(str3);
                oVar9.l();
                oVar9.p();
                if (j10 < 0) {
                    oVar9.zzj().f4063r.d("Invalid time querying expired conditional properties", a1.p(str3), Long.valueOf(j10));
                    E2 = Collections.emptyList();
                } else {
                    E2 = oVar9.E("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str3, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(E2.size());
                for (f fVar2 : E2) {
                    if (fVar2 != null) {
                        zzj().f4067w.a(fVar2.f4182a, this.t.f4370u.g(fVar2.f4184c.f4599b), fVar2.f4184c.D(), "User property expired");
                        o oVar10 = this.f4332c;
                        q(oVar10);
                        oVar10.r0(str3, fVar2.f4184c.f4599b);
                        f0 f0Var4 = fVar2.f4191s;
                        if (f0Var4 != null) {
                            arrayList.add(f0Var4);
                        }
                        o oVar11 = this.f4332c;
                        q(oVar11);
                        oVar11.Q(str3, fVar2.f4184c.f4599b);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    O(new f0((f0) obj, j10), k6Var);
                }
                o oVar12 = this.f4332c;
                q(oVar12);
                String str4 = f0Var2.f4192a;
                m6.j.e(str3);
                m6.j.e(str4);
                oVar12.l();
                oVar12.p();
                if (j10 < 0) {
                    oVar12.zzj().f4063r.a(a1.p(str3), oVar12.i().c(str4), Long.valueOf(j10), "Invalid time querying triggered conditional properties");
                    E3 = Collections.emptyList();
                } else {
                    E3 = oVar12.E("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str3, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(E3.size());
                for (f fVar3 : E3) {
                    if (fVar3 != null) {
                        q6 q6Var = fVar3.f4184c;
                        String str5 = fVar3.f4182a;
                        m6.j.i(str5);
                        String str6 = fVar3.f4183b;
                        String str7 = q6Var.f4599b;
                        Object D = q6Var.D();
                        m6.j.i(D);
                        s6 s6Var = new s6(str5, str6, str7, j10, D);
                        o oVar13 = this.f4332c;
                        q(oVar13);
                        if (oVar13.U(s6Var)) {
                            b1Var = zzj().f4067w;
                            str = "User property triggered";
                            p10 = fVar3.f4182a;
                            g10 = this.t.f4370u.g(s6Var.f4651c);
                        } else {
                            b1Var = zzj().f4060o;
                            str = "Too many active user properties, ignoring";
                            p10 = a1.p(fVar3.f4182a);
                            g10 = this.t.f4370u.g(s6Var.f4651c);
                        }
                        b1Var.a(p10, g10, s6Var.f4653e, str);
                        f0 f0Var5 = fVar3.f4189q;
                        if (f0Var5 != null) {
                            arrayList2.add(f0Var5);
                        }
                        fVar3.f4184c = new q6(s6Var);
                        fVar3.f4186e = true;
                        o oVar14 = this.f4332c;
                        q(oVar14);
                        oVar14.S(fVar3);
                    }
                }
                O(f0Var2, k6Var);
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = arrayList2.get(i11);
                    i11++;
                    O(new f0((f0) obj2, j10), k6Var);
                }
                o oVar15 = this.f4332c;
                q(oVar15);
                oVar15.C0();
                o oVar16 = this.f4332c;
                q(oVar16);
                oVar16.A0();
            } catch (Throwable th) {
                o oVar17 = this.f4332c;
                q(oVar17);
                oVar17.A0();
                throw th;
            }
        }
    }

    public final void p(f0 f0Var, String str) {
        o oVar = this.f4332c;
        q(oVar);
        k1 l02 = oVar.l0(str);
        if (l02 == null || TextUtils.isEmpty(l02.h())) {
            zzj().f4066v.c("No app data available; dropping event", str);
            return;
        }
        Boolean g10 = g(l02);
        if (g10 == null) {
            if (!"_ui".equals(f0Var.f4192a)) {
                zzj().f4063r.c("Could not find package. appId", a1.p(str));
            }
        } else if (!g10.booleanValue()) {
            zzj().f4060o.c("App version does not match; dropping event. appId", a1.p(str));
            return;
        }
        String j10 = l02.j();
        String h10 = l02.h();
        long w10 = l02.w();
        l02.f4393a.zzl().l();
        String str2 = l02.f4403l;
        l02.f4393a.zzl().l();
        long j11 = l02.f4404m;
        l02.f4393a.zzl().l();
        long j12 = l02.f4405n;
        l02.f4393a.zzl().l();
        boolean z10 = l02.f4406o;
        String i10 = l02.i();
        l02.f4393a.zzl().l();
        boolean z11 = l02.f4407p;
        String d10 = l02.d();
        l02.f4393a.zzl().l();
        Boolean bool = l02.f4409r;
        l02.f4393a.zzl().l();
        long j13 = l02.f4410s;
        l02.f4393a.zzl().l();
        ArrayList arrayList = l02.t;
        String n2 = H(str).n();
        boolean l10 = l02.l();
        l02.f4393a.zzl().l();
        long j14 = l02.f4413w;
        int i11 = H(str).f4167b;
        String str3 = P(str).f4745b;
        l02.f4393a.zzl().l();
        int i12 = l02.f4415y;
        l02.f4393a.zzl().l();
        long j15 = l02.C;
        String k10 = l02.k();
        l02.f4393a.zzl().l();
        J(f0Var, new k6(str, j10, h10, w10, str2, j11, j12, null, z10, false, i10, 0L, 0, z11, false, d10, bool, j13, arrayList, n2, "", null, l10, j14, i11, str3, i12, j15, k10, l02.H, 0L, l02.m()));
    }

    public final void r(q6 q6Var, k6 k6Var) {
        long j10;
        zzl().l();
        d0();
        if (Z(k6Var)) {
            if (!k6Var.f4443p) {
                e(k6Var);
                return;
            }
            int e02 = b0().e0(q6Var.f4599b);
            int i10 = 0;
            boolean z10 = true;
            if (e02 != 0) {
                b0();
                String str = q6Var.f4599b;
                R();
                String A = r6.A(str, 24, true);
                String str2 = q6Var.f4599b;
                int length = str2 != null ? str2.length() : 0;
                b0();
                r6.M(this.R, k6Var.f4437a, e02, "_ev", A, length);
                return;
            }
            int p10 = b0().p(q6Var.D(), q6Var.f4599b);
            if (p10 != 0) {
                b0();
                String str3 = q6Var.f4599b;
                R();
                String A2 = r6.A(str3, 24, true);
                Object D = q6Var.D();
                if (D != null && ((D instanceof String) || (D instanceof CharSequence))) {
                    i10 = String.valueOf(D).length();
                }
                b0();
                r6.M(this.R, k6Var.f4437a, p10, "_ev", A2, i10);
                return;
            }
            Object l02 = b0().l0(q6Var.D(), q6Var.f4599b);
            if (l02 == null) {
                return;
            }
            long j11 = 0;
            if ("_sid".equals(q6Var.f4599b)) {
                long j12 = q6Var.f4600c;
                String str4 = q6Var.f;
                String str5 = k6Var.f4437a;
                m6.j.i(str5);
                o oVar = this.f4332c;
                q(oVar);
                s6 m02 = oVar.m0(str5, "_sno");
                if (m02 != null) {
                    Object obj = m02.f4653e;
                    if (obj instanceof Long) {
                        j10 = ((Long) obj).longValue();
                        r(new q6("_sno", str4, j12, Long.valueOf(j10 + 1)), k6Var);
                    }
                }
                if (m02 != null) {
                    zzj().f4063r.c("Retrieved last session number from database does not contain a valid (long) value", m02.f4653e);
                }
                o oVar2 = this.f4332c;
                q(oVar2);
                b0 k02 = oVar2.k0(str5, "_s");
                if (k02 != null) {
                    j10 = k02.f4089c;
                    zzj().f4067w.c("Backfill the session number. Last used session number", Long.valueOf(j10));
                } else {
                    j10 = 0;
                }
                r(new q6("_sno", str4, j12, Long.valueOf(j10 + 1)), k6Var);
            }
            String str6 = k6Var.f4437a;
            m6.j.i(str6);
            String str7 = q6Var.f;
            m6.j.i(str7);
            s6 s6Var = new s6(str6, str7, q6Var.f4599b, q6Var.f4600c, l02);
            zzj().f4067w.d("Setting user property", this.t.f4370u.g(s6Var.f4651c), l02);
            o oVar3 = this.f4332c;
            q(oVar3);
            oVar3.y0();
            try {
                if ("_id".equals(s6Var.f4651c)) {
                    o oVar4 = this.f4332c;
                    q(oVar4);
                    s6 m03 = oVar4.m0(k6Var.f4437a, "_id");
                    if (m03 != null && !s6Var.f4653e.equals(m03.f4653e)) {
                        o oVar5 = this.f4332c;
                        q(oVar5);
                        oVar5.r0(k6Var.f4437a, "_lair");
                    }
                }
                e(k6Var);
                o oVar6 = this.f4332c;
                q(oVar6);
                boolean U = oVar6.U(s6Var);
                if ("_sid".equals(q6Var.f4599b)) {
                    o6 o6Var = this.f4335o;
                    q(o6Var);
                    String str8 = k6Var.E;
                    if (!TextUtils.isEmpty(str8)) {
                        j11 = o6Var.t(str8.getBytes(Charset.forName("UTF-8")));
                    }
                    long j13 = j11;
                    o oVar7 = this.f4332c;
                    q(oVar7);
                    k1 l03 = oVar7.l0(k6Var.f4437a);
                    if (l03 != null) {
                        l03.f4393a.zzl().l();
                        boolean z11 = l03.R;
                        if (l03.f4414x == j13) {
                            z10 = false;
                        }
                        l03.R = z11 | z10;
                        l03.f4414x = j13;
                        l03.f4393a.zzl().l();
                        if (l03.R) {
                            o oVar8 = this.f4332c;
                            q(oVar8);
                            oVar8.J(l03, false);
                        }
                    }
                }
                o oVar9 = this.f4332c;
                q(oVar9);
                oVar9.C0();
                if (!U) {
                    zzj().f4060o.d("Too many unique user properties are set. Ignoring user property", this.t.f4370u.g(s6Var.f4651c), s6Var.f4653e);
                    b0();
                    r6.M(this.R, k6Var.f4437a, 9, null, null, 0);
                }
                o oVar10 = this.f4332c;
                q(oVar10);
                oVar10.A0();
            } catch (Throwable th) {
                o oVar11 = this.f4332c;
                q(oVar11);
                oVar11.A0();
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cb, code lost:
    
        r10 = r9.f4337q.f4472p;
        ((b.z) zzb()).getClass();
        r10.b(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:5:0x002a, B:12:0x0047, B:13:0x01a0, B:25:0x0061, B:28:0x0082, B:35:0x00cb, B:36:0x019d, B:38:0x00e4, B:42:0x00f5, B:45:0x0120, B:47:0x013a, B:48:0x015a, B:50:0x0165, B:52:0x016b, B:53:0x016f, B:55:0x017b, B:57:0x0186, B:59:0x0195, B:60:0x0146, B:61:0x0107, B:63:0x0112), top: B:4:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017b A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:5:0x002a, B:12:0x0047, B:13:0x01a0, B:25:0x0061, B:28:0x0082, B:35:0x00cb, B:36:0x019d, B:38:0x00e4, B:42:0x00f5, B:45:0x0120, B:47:0x013a, B:48:0x015a, B:50:0x0165, B:52:0x016b, B:53:0x016f, B:55:0x017b, B:57:0x0186, B:59:0x0195, B:60:0x0146, B:61:0x0107, B:63:0x0112), top: B:4:0x002a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:5:0x002a, B:12:0x0047, B:13:0x01a0, B:25:0x0061, B:28:0x0082, B:35:0x00cb, B:36:0x019d, B:38:0x00e4, B:42:0x00f5, B:45:0x0120, B:47:0x013a, B:48:0x015a, B:50:0x0165, B:52:0x016b, B:53:0x016f, B:55:0x017b, B:57:0x0186, B:59:0x0195, B:60:0x0146, B:61:0x0107, B:63:0x0112), top: B:4:0x002a, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(java.lang.String r10, int r11, java.lang.Throwable r12, byte[] r13, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.s(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:402:0x01ab, code lost:
    
        if (r7 == null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x018b A[EDGE_INSN: B:376:0x018b->B:343:0x018b BREAK  A[LOOP:8: B:334:0x0074->B:390:0x0185], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0a2b  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v56 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(java.lang.String r27, long r28) {
        /*
            Method dump skipped, instructions count: 2607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.t(java.lang.String, long):void");
    }

    public final void u(String str, zzgf.zzh.zza zzaVar, Bundle bundle, String str2) {
        List unmodifiableList = Collections.unmodifiableList(Arrays.asList("_o", "_sn", "_sc", "_si"));
        long r10 = (r6.r0(zzaVar.zzf()) || r6.r0(str)) ? R().r(str2, true) : R().n(str2, true);
        long codePointCount = zzaVar.zzg().codePointCount(0, zzaVar.zzg().length());
        b0();
        String zzf = zzaVar.zzf();
        R();
        String A = r6.A(zzf, 40, true);
        if (codePointCount <= r10 || unmodifiableList.contains(zzaVar.zzf())) {
            return;
        }
        if ("_ev".equals(zzaVar.zzf())) {
            b0();
            bundle.putString("_ev", r6.A(zzaVar.zzg(), R().r(str2, true), true));
            return;
        }
        zzj().t.d("Param value is too long; discarded. Name, value length", A, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", A);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzaVar.zzf());
    }

    public final void v(String str, k6 k6Var) {
        zzl().l();
        d0();
        if (Z(k6Var)) {
            if (!k6Var.f4443p) {
                e(k6Var);
                return;
            }
            Boolean X = X(k6Var);
            if ("_npa".equals(str) && X != null) {
                zzj().f4066v.b("Falling back to manifest metadata value for ad personalization");
                ((b.z) zzb()).getClass();
                r(new q6("_npa", "auto", System.currentTimeMillis(), Long.valueOf(X.booleanValue() ? 1L : 0L)), k6Var);
                return;
            }
            zzj().f4066v.c("Removing user property", this.t.f4370u.g(str));
            o oVar = this.f4332c;
            q(oVar);
            oVar.y0();
            try {
                e(k6Var);
                if ("_id".equals(str)) {
                    o oVar2 = this.f4332c;
                    q(oVar2);
                    String str2 = k6Var.f4437a;
                    m6.j.i(str2);
                    oVar2.r0(str2, "_lair");
                }
                o oVar3 = this.f4332c;
                q(oVar3);
                String str3 = k6Var.f4437a;
                m6.j.i(str3);
                oVar3.r0(str3, str);
                o oVar4 = this.f4332c;
                q(oVar4);
                oVar4.C0();
                zzj().f4066v.c("User property removed", this.t.f4370u.g(str));
            } finally {
                o oVar5 = this.f4332c;
                q(oVar5);
                oVar5.A0();
            }
        }
    }

    public final void w(String str, boolean z10, Long l10, Long l11) {
        o oVar = this.f4332c;
        q(oVar);
        k1 l02 = oVar.l0(str);
        if (l02 != null) {
            l02.f4393a.zzl().l();
            l02.R |= l02.f4416z != z10;
            l02.f4416z = z10;
            l02.f4393a.zzl().l();
            l02.R |= !Objects.equals(l02.A, l10);
            l02.A = l10;
            l02.f4393a.zzl().l();
            l02.R |= !Objects.equals(l02.B, l11);
            l02.B = l11;
            l02.f4393a.zzl().l();
            if (l02.R) {
                o oVar2 = this.f4332c;
                q(oVar2);
                oVar2.J(l02, false);
            }
        }
    }

    public final void x(List<Long> list) {
        m6.j.b(!((ArrayList) list).isEmpty());
        if (this.G != null) {
            zzj().f4060o.b("Set uploading progress before finishing the previous upload");
        } else {
            this.G = new ArrayList(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: all -> 0x0011, TryCatch #0 {all -> 0x0011, blocks: (B:145:0x000e, B:4:0x0016, B:10:0x002b, B:17:0x0071, B:18:0x0085, B:25:0x0093, B:137:0x00a8, B:27:0x00bc, B:29:0x00ca, B:30:0x00ea, B:117:0x0244, B:119:0x025a, B:121:0x0260, B:122:0x0290, B:124:0x0264, B:126:0x0271, B:128:0x027c, B:130:0x0287, B:131:0x028b, B:133:0x0296, B:134:0x029e, B:135:0x00df, B:139:0x02a0), top: B:144:0x000e, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y(boolean r18, int r19, java.lang.Throwable r20, byte[] r21, java.lang.String r22, java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzgf.zzj, e7.j6>> r23) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.i6.y(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    public final boolean z(zzgf.zzf.zza zzaVar, zzgf.zzf.zza zzaVar2) {
        m6.j.b("_e".equals(zzaVar.zze()));
        a0();
        zzgf.zzh y10 = o6.y((zzgf.zzf) ((zzkg) zzaVar.zzaj()), "_sc");
        String zzh = y10 == null ? null : y10.zzh();
        a0();
        zzgf.zzh y11 = o6.y((zzgf.zzf) ((zzkg) zzaVar2.zzaj()), "_pc");
        String zzh2 = y11 != null ? y11.zzh() : null;
        if (zzh2 == null || !zzh2.equals(zzh)) {
            return false;
        }
        m6.j.b("_e".equals(zzaVar.zze()));
        a0();
        zzgf.zzh y12 = o6.y((zzgf.zzf) ((zzkg) zzaVar.zzaj()), "_et");
        if (y12 == null || !y12.zzl() || y12.zzd() <= 0) {
            return true;
        }
        long zzd = y12.zzd();
        a0();
        zzgf.zzh y13 = o6.y((zzgf.zzf) ((zzkg) zzaVar2.zzaj()), "_et");
        if (y13 != null && y13.zzd() > 0) {
            zzd += y13.zzd();
        }
        a0();
        o6.J(zzaVar2, "_et", Long.valueOf(zzd));
        a0();
        o6.J(zzaVar, "_fr", 1L);
        return true;
    }

    @Override // e7.c3
    public final Context zza() {
        return this.t.f4360a;
    }

    @Override // e7.c3
    public final v6.b zzb() {
        j2 j2Var = this.t;
        m6.j.i(j2Var);
        return j2Var.f4371v;
    }

    @Override // e7.c3
    public final nc.g0 zzd() {
        return this.t.f;
    }

    @Override // e7.c3
    public final a1 zzj() {
        j2 j2Var = this.t;
        m6.j.i(j2Var);
        return j2Var.zzj();
    }

    @Override // e7.c3
    public final e2 zzl() {
        j2 j2Var = this.t;
        m6.j.i(j2Var);
        return j2Var.zzl();
    }
}
