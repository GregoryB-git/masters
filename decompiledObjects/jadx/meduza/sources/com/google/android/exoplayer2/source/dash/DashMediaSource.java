package com.google.android.exoplayer2.source.dash;

import a4.g;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import b.m;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t5.c0;
import t5.d0;
import t5.e0;
import t5.f0;
import t5.j0;
import t5.k;
import t5.l0;
import t5.u;
import v3.a1;
import v3.h0;
import v3.o0;
import v3.r1;
import v5.x;
import w3.a0;
import z4.i;
import z4.n;
import z4.r;
import z4.t;
import z4.w;

/* loaded from: classes.dex */
public final class DashMediaSource extends z4.a {
    public static final /* synthetic */ int X = 0;
    public final e A;
    public final Object B;
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> C;
    public final m D;
    public final u.a E;
    public final c F;
    public final e0 G;
    public k H;
    public d0 I;
    public l0 J;
    public c5.b K;
    public Handler L;
    public o0.e M;
    public Uri N;
    public Uri O;
    public d5.c P;
    public boolean Q;
    public long R;
    public long S;
    public long T;
    public int U;
    public long V;
    public int W;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f2560p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2561q;

    /* renamed from: r, reason: collision with root package name */
    public final k.a f2562r;

    /* renamed from: s, reason: collision with root package name */
    public final a.InterfaceC0037a f2563s;
    public final i t;

    /* renamed from: u, reason: collision with root package name */
    public final a4.h f2564u;

    /* renamed from: v, reason: collision with root package name */
    public final c0 f2565v;

    /* renamed from: w, reason: collision with root package name */
    public final c5.a f2566w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2567x;

    /* renamed from: y, reason: collision with root package name */
    public final w.a f2568y;

    /* renamed from: z, reason: collision with root package name */
    public final f0.a<? extends d5.c> f2569z;

    public static final class Factory implements t.a {

        /* renamed from: a, reason: collision with root package name */
        public final a.InterfaceC0037a f2570a;

        /* renamed from: b, reason: collision with root package name */
        public final k.a f2571b;

        /* renamed from: c, reason: collision with root package name */
        public a4.i f2572c;

        /* renamed from: d, reason: collision with root package name */
        public i f2573d;

        /* renamed from: e, reason: collision with root package name */
        public u f2574e;
        public long f;

        public Factory(c.a aVar, k.a aVar2) {
            this.f2570a = aVar;
            this.f2571b = aVar2;
            this.f2572c = new a4.c();
            this.f2574e = new u();
            this.f = 30000L;
            this.f2573d = new i(0);
        }

        public Factory(k.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public final DashMediaSource a(o0 o0Var) {
            o0Var.f15535b.getClass();
            f0.a dVar = new d5.d();
            List<y4.c> list = o0Var.f15535b.f15598d;
            return new DashMediaSource(o0Var, this.f2571b, !list.isEmpty() ? new y4.b(dVar, list) : dVar, this.f2570a, this.f2573d, this.f2572c.a(o0Var), this.f2574e, this.f);
        }
    }

    public class a implements x.a {
        public a() {
        }
    }

    public static final class b extends r1 {

        /* renamed from: b, reason: collision with root package name */
        public final long f2576b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2577c;

        /* renamed from: d, reason: collision with root package name */
        public final long f2578d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2579e;
        public final long f;

        /* renamed from: o, reason: collision with root package name */
        public final long f2580o;

        /* renamed from: p, reason: collision with root package name */
        public final long f2581p;

        /* renamed from: q, reason: collision with root package name */
        public final d5.c f2582q;

        /* renamed from: r, reason: collision with root package name */
        public final o0 f2583r;

        /* renamed from: s, reason: collision with root package name */
        public final o0.e f2584s;

        public b(long j10, long j11, long j12, int i10, long j13, long j14, long j15, d5.c cVar, o0 o0Var, o0.e eVar) {
            x6.b.H(cVar.f3454d == (eVar != null));
            this.f2576b = j10;
            this.f2577c = j11;
            this.f2578d = j12;
            this.f2579e = i10;
            this.f = j13;
            this.f2580o = j14;
            this.f2581p = j15;
            this.f2582q = cVar;
            this.f2583r = o0Var;
            this.f2584s = eVar;
        }

        @Override // v3.r1
        public final int b(Object obj) {
            int intValue;
            if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.f2579e) >= 0 && intValue < h()) {
                return intValue;
            }
            return -1;
        }

        @Override // v3.r1
        public final r1.b f(int i10, r1.b bVar, boolean z10) {
            x6.b.x(i10, h());
            String str = z10 ? this.f2582q.b(i10).f3483a : null;
            Integer valueOf = z10 ? Integer.valueOf(this.f2579e + i10) : null;
            long e10 = this.f2582q.e(i10);
            long I = v5.e0.I(this.f2582q.b(i10).f3484b - this.f2582q.b(0).f3484b) - this.f;
            bVar.getClass();
            bVar.h(str, valueOf, 0, e10, I, a5.a.f208o, false);
            return bVar;
        }

        @Override // v3.r1
        public final int h() {
            return this.f2582q.c();
        }

        @Override // v3.r1
        public final Object l(int i10) {
            x6.b.x(i10, h());
            return Integer.valueOf(this.f2579e + i10);
        }

        @Override // v3.r1
        public final r1.c n(int i10, r1.c cVar, long j10) {
            c5.c l10;
            long j11;
            x6.b.x(i10, 1);
            long j12 = this.f2581p;
            d5.c cVar2 = this.f2582q;
            if (cVar2.f3454d && cVar2.f3455e != -9223372036854775807L && cVar2.f3452b == -9223372036854775807L) {
                if (j10 > 0) {
                    j12 += j10;
                    if (j12 > this.f2580o) {
                        j11 = -9223372036854775807L;
                        Object obj = r1.c.f15754z;
                        o0 o0Var = this.f2583r;
                        d5.c cVar3 = this.f2582q;
                        cVar.b(obj, o0Var, cVar3, this.f2576b, this.f2577c, this.f2578d, true, (cVar3.f3454d || cVar3.f3455e == -9223372036854775807L || cVar3.f3452b != -9223372036854775807L) ? false : true, this.f2584s, j11, this.f2580o, 0, h() - 1, this.f);
                        return cVar;
                    }
                }
                long j13 = this.f + j12;
                long e10 = cVar2.e(0);
                int i11 = 0;
                while (i11 < this.f2582q.c() - 1 && j13 >= e10) {
                    j13 -= e10;
                    i11++;
                    e10 = this.f2582q.e(i11);
                }
                d5.g b10 = this.f2582q.b(i11);
                int size = b10.f3485c.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size) {
                        i12 = -1;
                        break;
                    }
                    if (b10.f3485c.get(i12).f3443b == 2) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && (l10 = b10.f3485c.get(i12).f3444c.get(0).l()) != null && l10.j(e10) != 0) {
                    j12 = (l10.a(l10.g(j13, e10)) + j12) - j13;
                }
            }
            j11 = j12;
            Object obj2 = r1.c.f15754z;
            o0 o0Var2 = this.f2583r;
            d5.c cVar32 = this.f2582q;
            cVar.b(obj2, o0Var2, cVar32, this.f2576b, this.f2577c, this.f2578d, true, (cVar32.f3454d || cVar32.f3455e == -9223372036854775807L || cVar32.f3452b != -9223372036854775807L) ? false : true, this.f2584s, j11, this.f2580o, 0, h() - 1, this.f);
            return cVar;
        }

        @Override // v3.r1
        public final int o() {
            return 1;
        }
    }

    public final class c implements d.b {
        public c() {
        }
    }

    public static final class d implements f0.a<Long> {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f2586a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // t5.f0.a
        public final Object a(Uri uri, t5.m mVar) {
            String readLine = new BufferedReader(new InputStreamReader(mVar, n7.d.f11284c)).readLine();
            try {
                Matcher matcher = f2586a.matcher(readLine);
                if (!matcher.matches()) {
                    throw a1.b("Couldn't parse timestamp: " + readLine, null);
                }
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long parseLong = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    time -= ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000) * j10;
                }
                return Long.valueOf(time);
            } catch (ParseException e10) {
                throw a1.b(null, e10);
            }
        }
    }

    public final class e implements d0.a<f0<d5.c>> {
        public e() {
        }

        @Override // t5.d0.a
        public final void k(f0<d5.c> f0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.z(f0Var, j10, j11);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
        @Override // t5.d0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void p(t5.f0<d5.c> r18, long r19, long r21) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.e.p(t5.d0$d, long, long):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
        @Override // t5.d0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final t5.d0.b u(t5.f0<d5.c> r6, long r7, long r9, java.io.IOException r11, int r12) {
            /*
                r5 = this;
                t5.f0 r6 = (t5.f0) r6
                com.google.android.exoplayer2.source.dash.DashMediaSource r7 = com.google.android.exoplayer2.source.dash.DashMediaSource.this
                r7.getClass()
                z4.n r8 = new z4.n
                long r9 = r6.f14492a
                t5.j0 r9 = r6.f14495d
                android.net.Uri r10 = r9.f14525c
                java.util.Map<java.lang.String, java.util.List<java.lang.String>> r9 = r9.f14526d
                r8.<init>(r9)
                t5.c0 r9 = r7.f2565v
                t5.u r9 = (t5.u) r9
                r9.getClass()
                boolean r9 = r11 instanceof v3.a1
                r10 = 1
                r0 = 0
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r9 != 0) goto L5b
                boolean r9 = r11 instanceof java.io.FileNotFoundException
                if (r9 != 0) goto L5b
                boolean r9 = r11 instanceof t5.w
                if (r9 != 0) goto L5b
                boolean r9 = r11 instanceof t5.d0.g
                if (r9 != 0) goto L5b
                int r9 = t5.l.f14531b
                r9 = r11
            L35:
                if (r9 == 0) goto L4b
                boolean r3 = r9 instanceof t5.l
                if (r3 == 0) goto L46
                r3 = r9
                t5.l r3 = (t5.l) r3
                int r3 = r3.f14532a
                r4 = 2008(0x7d8, float:2.814E-42)
                if (r3 != r4) goto L46
                r9 = r10
                goto L4c
            L46:
                java.lang.Throwable r9 = r9.getCause()
                goto L35
            L4b:
                r9 = r0
            L4c:
                if (r9 == 0) goto L4f
                goto L5b
            L4f:
                int r12 = r12 + (-1)
                int r12 = r12 * 1000
                r9 = 5000(0x1388, float:7.006E-42)
                int r9 = java.lang.Math.min(r12, r9)
                long r3 = (long) r9
                goto L5c
            L5b:
                r3 = r1
            L5c:
                int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r9 != 0) goto L63
                t5.d0$b r9 = t5.d0.f
                goto L68
            L63:
                t5.d0$b r9 = new t5.d0$b
                r9.<init>(r0, r3)
            L68:
                boolean r12 = r9.a()
                r10 = r10 ^ r12
                z4.w$a r12 = r7.f2568y
                int r6 = r6.f14494c
                r12.k(r8, r6, r11, r10)
                if (r10 == 0) goto L7b
                t5.c0 r6 = r7.f2565v
                r6.getClass()
            L7b:
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.e.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
        }
    }

    public final class f implements e0 {
        public f() {
        }

        @Override // t5.e0
        public final void a() {
            DashMediaSource.this.I.a();
            c5.b bVar = DashMediaSource.this.K;
            if (bVar != null) {
                throw bVar;
            }
        }
    }

    public final class g implements d0.a<f0<Long>> {
        public g() {
        }

        @Override // t5.d0.a
        public final void k(f0<Long> f0Var, long j10, long j11, boolean z10) {
            DashMediaSource.this.z(f0Var, j10, j11);
        }

        @Override // t5.d0.a
        public final void p(f0<Long> f0Var, long j10, long j11) {
            f0<Long> f0Var2 = f0Var;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            dashMediaSource.getClass();
            long j12 = f0Var2.f14492a;
            j0 j0Var = f0Var2.f14495d;
            Uri uri = j0Var.f14525c;
            n nVar = new n(j0Var.f14526d);
            dashMediaSource.f2565v.getClass();
            dashMediaSource.f2568y.g(nVar, f0Var2.f14494c);
            dashMediaSource.T = f0Var2.f.longValue() - j10;
            dashMediaSource.A(true);
        }

        @Override // t5.d0.a
        public final d0.b u(f0<Long> f0Var, long j10, long j11, IOException iOException, int i10) {
            f0<Long> f0Var2 = f0Var;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            w.a aVar = dashMediaSource.f2568y;
            long j12 = f0Var2.f14492a;
            j0 j0Var = f0Var2.f14495d;
            Uri uri = j0Var.f14525c;
            aVar.k(new n(j0Var.f14526d), f0Var2.f14494c, iOException, true);
            dashMediaSource.f2565v.getClass();
            v5.m.d("DashMediaSource", "Failed to resolve time offset.", iOException);
            dashMediaSource.A(true);
            return d0.f14468e;
        }
    }

    public static final class h implements f0.a<Long> {
        @Override // t5.f0.a
        public final Object a(Uri uri, t5.m mVar) {
            return Long.valueOf(v5.e0.L(new BufferedReader(new InputStreamReader(mVar)).readLine()));
        }
    }

    static {
        h0.a("goog.exo.dash");
    }

    public DashMediaSource(o0 o0Var, k.a aVar, f0.a aVar2, a.InterfaceC0037a interfaceC0037a, i iVar, a4.h hVar, u uVar, long j10) {
        this.f2560p = o0Var;
        this.M = o0Var.f15536c;
        o0.g gVar = o0Var.f15535b;
        gVar.getClass();
        this.N = gVar.f15595a;
        this.O = o0Var.f15535b.f15595a;
        this.P = null;
        this.f2562r = aVar;
        this.f2569z = aVar2;
        this.f2563s = interfaceC0037a;
        this.f2564u = hVar;
        this.f2565v = uVar;
        this.f2567x = j10;
        this.t = iVar;
        this.f2566w = new c5.a();
        this.f2561q = false;
        this.f2568y = q(null);
        this.B = new Object();
        this.C = new SparseArray<>();
        this.F = new c();
        this.V = -9223372036854775807L;
        this.T = -9223372036854775807L;
        this.A = new e();
        this.G = new f();
        this.D = new m(this, 11);
        this.E = new u.a(this, 10);
    }

    public static boolean x(d5.g gVar) {
        for (int i10 = 0; i10 < gVar.f3485c.size(); i10++) {
            int i11 = gVar.f3485c.get(i10).f3443b;
            if (i11 == 1 || i11 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x025d, code lost:
    
        if (r10 != (-9223372036854775807L)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x047f, code lost:
    
        if (r11 > 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0482, code lost:
    
        if (r11 < 0) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x02a2, code lost:
    
        if (r12 != (-9223372036854775807L)) goto L129;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(boolean r46) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DashMediaSource.A(boolean):void");
    }

    public final void B() {
        Uri uri;
        this.L.removeCallbacks(this.D);
        if (this.I.c()) {
            return;
        }
        if (this.I.d()) {
            this.Q = true;
            return;
        }
        synchronized (this.B) {
            uri = this.N;
        }
        this.Q = false;
        f0 f0Var = new f0(this.H, uri, 4, this.f2569z);
        this.f2568y.m(new n(f0Var.f14492a, f0Var.f14493b, this.I.f(f0Var, this.A, ((u) this.f2565v).b(4))), f0Var.f14494c);
    }

    @Override // z4.t
    public final o0 f() {
        return this.f2560p;
    }

    @Override // z4.t
    public final void g(r rVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) rVar;
        com.google.android.exoplayer2.source.dash.d dVar = bVar.f2600u;
        dVar.f2638q = true;
        dVar.f2634d.removeCallbacksAndMessages(null);
        for (b5.h<com.google.android.exoplayer2.source.dash.a> hVar : bVar.A) {
            hVar.A(bVar);
        }
        bVar.f2605z = null;
        this.C.remove(bVar.f2590a);
    }

    @Override // z4.t
    public final void h() {
        this.G.a();
    }

    @Override // z4.t
    public final r o(t.b bVar, t5.b bVar2, long j10) {
        int intValue = ((Integer) bVar.f17725a).intValue() - this.W;
        w.a aVar = new w.a(this.f17557c.f17742c, 0, bVar, this.P.b(intValue).f3484b);
        g.a aVar2 = new g.a(this.f17558d.f182c, 0, bVar);
        int i10 = this.W + intValue;
        d5.c cVar = this.P;
        c5.a aVar3 = this.f2566w;
        a.InterfaceC0037a interfaceC0037a = this.f2563s;
        l0 l0Var = this.J;
        a4.h hVar = this.f2564u;
        c0 c0Var = this.f2565v;
        long j11 = this.T;
        e0 e0Var = this.G;
        i iVar = this.t;
        c cVar2 = this.F;
        a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        com.google.android.exoplayer2.source.dash.b bVar3 = new com.google.android.exoplayer2.source.dash.b(i10, cVar, aVar3, intValue, interfaceC0037a, l0Var, hVar, aVar2, c0Var, aVar, j11, e0Var, bVar2, iVar, cVar2, a0Var);
        this.C.put(i10, bVar3);
        return bVar3;
    }

    @Override // z4.a
    public final void t(l0 l0Var) {
        this.J = l0Var;
        a4.h hVar = this.f2564u;
        Looper myLooper = Looper.myLooper();
        a0 a0Var = this.f17560o;
        x6.b.K(a0Var);
        hVar.c(myLooper, a0Var);
        this.f2564u.a();
        if (this.f2561q) {
            A(false);
            return;
        }
        this.H = this.f2562r.a();
        this.I = new d0("DashMediaSource");
        this.L = v5.e0.l(null);
        B();
    }

    @Override // z4.a
    public final void w() {
        this.Q = false;
        this.H = null;
        d0 d0Var = this.I;
        if (d0Var != null) {
            d0Var.e(null);
            this.I = null;
        }
        this.R = 0L;
        this.S = 0L;
        this.P = this.f2561q ? this.P : null;
        this.N = this.O;
        this.K = null;
        Handler handler = this.L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.L = null;
        }
        this.T = -9223372036854775807L;
        this.U = 0;
        this.V = -9223372036854775807L;
        this.W = 0;
        this.C.clear();
        c5.a aVar = this.f2566w;
        aVar.f2343a.clear();
        aVar.f2344b.clear();
        aVar.f2345c.clear();
        this.f2564u.release();
    }

    public final void y() {
        boolean z10;
        long j10;
        d0 d0Var = this.I;
        a aVar = new a();
        Object obj = x.f15985b;
        synchronized (obj) {
            z10 = x.f15986c;
        }
        if (!z10) {
            if (d0Var == null) {
                d0Var = new d0("SntpClient");
            }
            d0Var.f(new x.c(), new x.b(aVar), 1);
        } else {
            synchronized (obj) {
                j10 = x.f15986c ? x.f15987d : -9223372036854775807L;
            }
            this.T = j10;
            A(true);
        }
    }

    public final void z(f0<?> f0Var, long j10, long j11) {
        long j12 = f0Var.f14492a;
        j0 j0Var = f0Var.f14495d;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f2565v.getClass();
        this.f2568y.d(nVar, f0Var.f14494c);
    }
}
