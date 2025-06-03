package f5;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import f5.e;
import f5.f;
import f5.h;
import f5.j;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o7.m0;
import t5.c0;
import t5.d0;
import t5.f0;
import t5.j0;
import t5.k;
import t5.u;
import t5.z;
import v3.a1;
import v3.i0;
import v5.e0;
import w3.v;
import z4.n;
import z4.w;

/* loaded from: classes.dex */
public final class b implements j, d0.a<f0<g>> {

    /* renamed from: w, reason: collision with root package name */
    public static final v f5347w = new v(10);

    /* renamed from: a, reason: collision with root package name */
    public final e5.h f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5349b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f5350c;
    public w.a f;

    /* renamed from: o, reason: collision with root package name */
    public d0 f5353o;

    /* renamed from: p, reason: collision with root package name */
    public Handler f5354p;

    /* renamed from: q, reason: collision with root package name */
    public j.d f5355q;

    /* renamed from: r, reason: collision with root package name */
    public f f5356r;

    /* renamed from: s, reason: collision with root package name */
    public Uri f5357s;
    public e t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5358u;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList<j.a> f5352e = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<Uri, C0081b> f5351d = new HashMap<>();

    /* renamed from: v, reason: collision with root package name */
    public long f5359v = -9223372036854775807L;

    public class a implements j.a {
        public a() {
        }

        @Override // f5.j.a
        public final boolean a(Uri uri, c0.c cVar, boolean z10) {
            C0081b c0081b;
            if (b.this.t == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                f fVar = b.this.f5356r;
                int i10 = e0.f15881a;
                List<f.b> list = fVar.f5412e;
                int i11 = 0;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    C0081b c0081b2 = b.this.f5351d.get(list.get(i12).f5423a);
                    if (c0081b2 != null && elapsedRealtime < c0081b2.f5367p) {
                        i11++;
                    }
                }
                c0.b a10 = ((u) b.this.f5350c).a(new c0.a(1, 0, b.this.f5356r.f5412e.size(), i11), cVar);
                if (a10 != null && a10.f14459a == 2 && (c0081b = b.this.f5351d.get(uri)) != null) {
                    C0081b.a(c0081b, a10.f14460b);
                }
            }
            return false;
        }

        @Override // f5.j.a
        public final void f() {
            b.this.f5352e.remove(this);
        }
    }

    /* renamed from: f5.b$b, reason: collision with other inner class name */
    public final class C0081b implements d0.a<f0<g>> {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f5361a;

        /* renamed from: b, reason: collision with root package name */
        public final d0 f5362b = new d0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c, reason: collision with root package name */
        public final k f5363c;

        /* renamed from: d, reason: collision with root package name */
        public e f5364d;

        /* renamed from: e, reason: collision with root package name */
        public long f5365e;
        public long f;

        /* renamed from: o, reason: collision with root package name */
        public long f5366o;

        /* renamed from: p, reason: collision with root package name */
        public long f5367p;

        /* renamed from: q, reason: collision with root package name */
        public boolean f5368q;

        /* renamed from: r, reason: collision with root package name */
        public IOException f5369r;

        public C0081b(Uri uri) {
            this.f5361a = uri;
            this.f5363c = b.this.f5348a.a();
        }

        public static boolean a(C0081b c0081b, long j10) {
            boolean z10;
            c0081b.f5367p = SystemClock.elapsedRealtime() + j10;
            if (c0081b.f5361a.equals(b.this.f5357s)) {
                b bVar = b.this;
                List<f.b> list = bVar.f5356r.f5412e;
                int size = list.size();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        z10 = false;
                        break;
                    }
                    C0081b c0081b2 = bVar.f5351d.get(list.get(i10).f5423a);
                    c0081b2.getClass();
                    if (elapsedRealtime > c0081b2.f5367p) {
                        Uri uri = c0081b2.f5361a;
                        bVar.f5357s = uri;
                        c0081b2.c(bVar.n(uri));
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    return true;
                }
            }
            return false;
        }

        public final void b(Uri uri) {
            b bVar = b.this;
            f0 f0Var = new f0(this.f5363c, uri, 4, bVar.f5349b.a(bVar.f5356r, this.f5364d));
            b.this.f.m(new n(f0Var.f14492a, f0Var.f14493b, this.f5362b.f(f0Var, this, ((u) b.this.f5350c).b(f0Var.f14494c))), f0Var.f14494c);
        }

        public final void c(Uri uri) {
            this.f5367p = 0L;
            if (this.f5368q || this.f5362b.d() || this.f5362b.c()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = this.f5366o;
            if (elapsedRealtime >= j10) {
                b(uri);
            } else {
                this.f5368q = true;
                b.this.f5354p.postDelayed(new x0.f(11, this, uri), j10 - elapsedRealtime);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x022b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x024c  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0236  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01c2  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(f5.e r39) {
            /*
                Method dump skipped, instructions count: 730
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: f5.b.C0081b.d(f5.e):void");
        }

        @Override // t5.d0.a
        public final void k(f0<g> f0Var, long j10, long j11, boolean z10) {
            f0<g> f0Var2 = f0Var;
            long j12 = f0Var2.f14492a;
            j0 j0Var = f0Var2.f14495d;
            Uri uri = j0Var.f14525c;
            n nVar = new n(j0Var.f14526d);
            b.this.f5350c.getClass();
            b.this.f.d(nVar, 4);
        }

        @Override // t5.d0.a
        public final void p(f0<g> f0Var, long j10, long j11) {
            f0<g> f0Var2 = f0Var;
            g gVar = f0Var2.f;
            j0 j0Var = f0Var2.f14495d;
            Uri uri = j0Var.f14525c;
            n nVar = new n(j0Var.f14526d);
            if (gVar instanceof e) {
                d((e) gVar);
                b.this.f.g(nVar, 4);
            } else {
                a1 b10 = a1.b("Loaded playlist has unexpected type.", null);
                this.f5369r = b10;
                b.this.f.k(nVar, 4, b10, true);
            }
            b.this.f5350c.getClass();
        }

        @Override // t5.d0.a
        public final d0.b u(f0<g> f0Var, long j10, long j11, IOException iOException, int i10) {
            d0.b bVar;
            f0<g> f0Var2 = f0Var;
            long j12 = f0Var2.f14492a;
            j0 j0Var = f0Var2.f14495d;
            Uri uri = j0Var.f14525c;
            n nVar = new n(j0Var.f14526d);
            boolean z10 = iOException instanceof h.a;
            if ((uri.getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof z ? ((z) iOException).f14616d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f5366o = SystemClock.elapsedRealtime();
                    c(this.f5361a);
                    w.a aVar = b.this.f;
                    int i12 = e0.f15881a;
                    aVar.k(nVar, f0Var2.f14494c, iOException, true);
                    return d0.f14468e;
                }
            }
            c0.c cVar = new c0.c(iOException, i10);
            b bVar2 = b.this;
            Uri uri2 = this.f5361a;
            Iterator<j.a> it = bVar2.f5352e.iterator();
            boolean z11 = false;
            while (it.hasNext()) {
                z11 |= !it.next().a(uri2, cVar, false);
            }
            if (z11) {
                long c10 = ((u) b.this.f5350c).c(cVar);
                bVar = c10 != -9223372036854775807L ? new d0.b(0, c10) : d0.f;
            } else {
                bVar = d0.f14468e;
            }
            boolean z12 = !bVar.a();
            b.this.f.k(nVar, f0Var2.f14494c, iOException, z12);
            if (!z12) {
                return bVar;
            }
            b.this.f5350c.getClass();
            return bVar;
        }
    }

    public b(e5.h hVar, u uVar, i iVar) {
        this.f5348a = hVar;
        this.f5349b = iVar;
        this.f5350c = uVar;
    }

    @Override // f5.j
    public final boolean a(Uri uri) {
        int i10;
        C0081b c0081b = this.f5351d.get(uri);
        if (c0081b.f5364d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, e0.R(c0081b.f5364d.f5388u));
        e eVar = c0081b.f5364d;
        return eVar.f5383o || (i10 = eVar.f5373d) == 2 || i10 == 1 || c0081b.f5365e + max > elapsedRealtime;
    }

    @Override // f5.j
    public final void b(Uri uri) {
        C0081b c0081b = this.f5351d.get(uri);
        c0081b.f5362b.a();
        IOException iOException = c0081b.f5369r;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // f5.j
    public final void c(j.a aVar) {
        this.f5352e.remove(aVar);
    }

    @Override // f5.j
    public final void d(j.a aVar) {
        aVar.getClass();
        this.f5352e.add(aVar);
    }

    @Override // f5.j
    public final long e() {
        return this.f5359v;
    }

    @Override // f5.j
    public final void f(Uri uri, w.a aVar, j.d dVar) {
        this.f5354p = e0.l(null);
        this.f = aVar;
        this.f5355q = dVar;
        f0 f0Var = new f0(this.f5348a.a(), uri, 4, this.f5349b.b());
        x6.b.H(this.f5353o == null);
        d0 d0Var = new d0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f5353o = d0Var;
        aVar.m(new n(f0Var.f14492a, f0Var.f14493b, d0Var.f(f0Var, this, ((u) this.f5350c).b(f0Var.f14494c))), f0Var.f14494c);
    }

    @Override // f5.j
    public final boolean g() {
        return this.f5358u;
    }

    @Override // f5.j
    public final f h() {
        return this.f5356r;
    }

    @Override // f5.j
    public final boolean i(Uri uri, long j10) {
        if (this.f5351d.get(uri) != null) {
            return !C0081b.a(r2, j10);
        }
        return false;
    }

    @Override // f5.j
    public final void j() {
        d0 d0Var = this.f5353o;
        if (d0Var != null) {
            d0Var.a();
        }
        Uri uri = this.f5357s;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // t5.d0.a
    public final void k(f0<g> f0Var, long j10, long j11, boolean z10) {
        f0<g> f0Var2 = f0Var;
        long j12 = f0Var2.f14492a;
        j0 j0Var = f0Var2.f14495d;
        Uri uri = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        this.f5350c.getClass();
        this.f.d(nVar, 4);
    }

    @Override // f5.j
    public final void l(Uri uri) {
        C0081b c0081b = this.f5351d.get(uri);
        c0081b.c(c0081b.f5361a);
    }

    @Override // f5.j
    public final e m(boolean z10, Uri uri) {
        e eVar;
        e eVar2 = this.f5351d.get(uri).f5364d;
        if (eVar2 != null && z10 && !uri.equals(this.f5357s)) {
            List<f.b> list = this.f5356r.f5412e;
            boolean z11 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(list.get(i10).f5423a)) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            if (z11 && ((eVar = this.t) == null || !eVar.f5383o)) {
                this.f5357s = uri;
                C0081b c0081b = this.f5351d.get(uri);
                e eVar3 = c0081b.f5364d;
                if (eVar3 == null || !eVar3.f5383o) {
                    c0081b.c(n(uri));
                } else {
                    this.t = eVar3;
                    ((HlsMediaSource) this.f5355q).y(eVar3);
                }
            }
        }
        return eVar2;
    }

    public final Uri n(Uri uri) {
        e.b bVar;
        e eVar = this.t;
        if (eVar == null || !eVar.f5389v.f5409e || (bVar = (e.b) ((m0) eVar.t).get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar.f5392b));
        int i10 = bVar.f5393c;
        if (i10 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return buildUpon.build();
    }

    @Override // t5.d0.a
    public final void p(f0<g> f0Var, long j10, long j11) {
        f fVar;
        f0<g> f0Var2 = f0Var;
        g gVar = f0Var2.f;
        boolean z10 = gVar instanceof e;
        if (z10) {
            String str = gVar.f5428a;
            f fVar2 = f.f5410n;
            Uri parse = Uri.parse(str);
            i0.a aVar = new i0.a();
            aVar.f15463a = "0";
            aVar.f15471j = "application/x-mpegURL";
            fVar = new f("", Collections.emptyList(), Collections.singletonList(new f.b(parse, new i0(aVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            fVar = (f) gVar;
        }
        this.f5356r = fVar;
        this.f5357s = fVar.f5412e.get(0).f5423a;
        this.f5352e.add(new a());
        List<Uri> list = fVar.f5411d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = list.get(i10);
            this.f5351d.put(uri, new C0081b(uri));
        }
        j0 j0Var = f0Var2.f14495d;
        Uri uri2 = j0Var.f14525c;
        n nVar = new n(j0Var.f14526d);
        C0081b c0081b = this.f5351d.get(this.f5357s);
        if (z10) {
            c0081b.d((e) gVar);
        } else {
            c0081b.c(c0081b.f5361a);
        }
        this.f5350c.getClass();
        this.f.g(nVar, 4);
    }

    @Override // f5.j
    public final void stop() {
        this.f5357s = null;
        this.t = null;
        this.f5356r = null;
        this.f5359v = -9223372036854775807L;
        this.f5353o.e(null);
        this.f5353o = null;
        Iterator<C0081b> it = this.f5351d.values().iterator();
        while (it.hasNext()) {
            it.next().f5362b.e(null);
        }
        this.f5354p.removeCallbacksAndMessages(null);
        this.f5354p = null;
        this.f5351d.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    @Override // t5.d0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final t5.d0.b u(t5.f0<f5.g> r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            t5.f0 r5 = (t5.f0) r5
            z4.n r6 = new z4.n
            long r7 = r5.f14492a
            t5.j0 r7 = r5.f14495d
            android.net.Uri r8 = r7.f14525c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7 = r7.f14526d
            r6.<init>(r7)
            t5.c0 r7 = r4.f5350c
            t5.u r7 = (t5.u) r7
            r7.getClass()
            boolean r7 = r10 instanceof v3.a1
            r8 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof t5.w
            if (r7 != 0) goto L56
            boolean r7 = r10 instanceof t5.d0.g
            if (r7 != 0) goto L56
            int r7 = t5.l.f14531b
            r7 = r10
        L30:
            if (r7 == 0) goto L46
            boolean r2 = r7 instanceof t5.l
            if (r2 == 0) goto L41
            r2 = r7
            t5.l r2 = (t5.l) r2
            int r2 = r2.f14532a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L41
            r7 = r8
            goto L47
        L41:
            java.lang.Throwable r7 = r7.getCause()
            goto L30
        L46:
            r7 = r9
        L47:
            if (r7 == 0) goto L4a
            goto L56
        L4a:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r11, r7)
            long r2 = (long) r7
            goto L57
        L56:
            r2 = r0
        L57:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L5c
            goto L5d
        L5c:
            r8 = r9
        L5d:
            z4.w$a r7 = r4.f
            int r5 = r5.f14494c
            r7.k(r6, r5, r10, r8)
            if (r8 == 0) goto L6b
            t5.c0 r5 = r4.f5350c
            r5.getClass()
        L6b:
            if (r8 == 0) goto L70
            t5.d0$b r5 = t5.d0.f
            goto L75
        L70:
            t5.d0$b r5 = new t5.d0$b
            r5.<init>(r9, r2)
        L75:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f5.b.u(t5.d0$d, long, long, java.io.IOException, int):t5.d0$b");
    }
}
