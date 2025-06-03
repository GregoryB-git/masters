package n4;

import c4.h;
import c4.i;
import c4.j;
import c4.v;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import v3.a1;
import v3.i0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public j f11230a;

    /* renamed from: b, reason: collision with root package name */
    public v f11231b;

    /* renamed from: e, reason: collision with root package name */
    public b f11234e;

    /* renamed from: c, reason: collision with root package name */
    public int f11232c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f11233d = -1;
    public int f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f11235g = -1;

    /* renamed from: n4.a$a, reason: collision with other inner class name */
    public static final class C0170a implements b {

        /* renamed from: m, reason: collision with root package name */
        public static final int[] f11236m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

        /* renamed from: n, reason: collision with root package name */
        public static final int[] f11237n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, R.styleable.AppCompatTheme_windowActionBarOverlay, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final j f11238a;

        /* renamed from: b, reason: collision with root package name */
        public final v f11239b;

        /* renamed from: c, reason: collision with root package name */
        public final n4.b f11240c;

        /* renamed from: d, reason: collision with root package name */
        public final int f11241d;

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f11242e;
        public final u f;

        /* renamed from: g, reason: collision with root package name */
        public final int f11243g;

        /* renamed from: h, reason: collision with root package name */
        public final i0 f11244h;

        /* renamed from: i, reason: collision with root package name */
        public int f11245i;

        /* renamed from: j, reason: collision with root package name */
        public long f11246j;

        /* renamed from: k, reason: collision with root package name */
        public int f11247k;

        /* renamed from: l, reason: collision with root package name */
        public long f11248l;

        public C0170a(j jVar, v vVar, n4.b bVar) {
            this.f11238a = jVar;
            this.f11239b = vVar;
            this.f11240c = bVar;
            int max = Math.max(1, bVar.f11257b / 10);
            this.f11243g = max;
            u uVar = new u(bVar.f11260e);
            uVar.n();
            int n2 = uVar.n();
            this.f11241d = n2;
            int i10 = bVar.f11256a;
            int i11 = bVar.f11258c;
            int i12 = (((i11 - (i10 * 4)) * 8) / (bVar.f11259d * i10)) + 1;
            if (n2 != i12) {
                throw a1.a("Expected frames per block: " + i12 + "; got: " + n2, null);
            }
            int i13 = e0.f15881a;
            int i14 = ((max + n2) - 1) / n2;
            this.f11242e = new byte[i11 * i14];
            this.f = new u(n2 * 2 * i10 * i14);
            int i15 = bVar.f11257b;
            int i16 = ((bVar.f11258c * i15) * 8) / n2;
            i0.a aVar = new i0.a();
            aVar.f15472k = "audio/raw";
            aVar.f = i16;
            aVar.f15468g = i16;
            aVar.f15473l = max * 2 * i10;
            aVar.f15484x = bVar.f11256a;
            aVar.f15485y = i15;
            aVar.f15486z = 2;
            this.f11244h = new i0(aVar);
        }

        @Override // n4.a.b
        public final void a(long j10) {
            this.f11245i = 0;
            this.f11246j = j10;
            this.f11247k = 0;
            this.f11248l = 0L;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0040 -> B:4:0x0042). Please report as a decompilation issue!!! */
        @Override // n4.a.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(c4.i r21, long r22) {
            /*
                Method dump skipped, instructions count: 355
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: n4.a.C0170a.b(c4.i, long):boolean");
        }

        @Override // n4.a.b
        public final void c(int i10, long j10) {
            this.f11238a.t(new d(this.f11240c, this.f11241d, i10, j10));
            this.f11239b.d(this.f11244h);
        }

        public final void d(int i10) {
            long O = this.f11246j + e0.O(this.f11248l, 1000000L, this.f11240c.f11257b);
            int i11 = i10 * 2 * this.f11240c.f11256a;
            this.f11239b.c(O, 1, i11, this.f11247k - i11, null);
            this.f11248l += i10;
            this.f11247k -= i11;
        }
    }

    public interface b {
        void a(long j10);

        boolean b(i iVar, long j10);

        void c(int i10, long j10);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final j f11249a;

        /* renamed from: b, reason: collision with root package name */
        public final v f11250b;

        /* renamed from: c, reason: collision with root package name */
        public final n4.b f11251c;

        /* renamed from: d, reason: collision with root package name */
        public final i0 f11252d;

        /* renamed from: e, reason: collision with root package name */
        public final int f11253e;
        public long f;

        /* renamed from: g, reason: collision with root package name */
        public int f11254g;

        /* renamed from: h, reason: collision with root package name */
        public long f11255h;

        public c(j jVar, v vVar, n4.b bVar, String str, int i10) {
            this.f11249a = jVar;
            this.f11250b = vVar;
            this.f11251c = bVar;
            int i11 = (bVar.f11256a * bVar.f11259d) / 8;
            if (bVar.f11258c != i11) {
                StringBuilder n2 = a0.j.n("Expected block size: ", i11, "; got: ");
                n2.append(bVar.f11258c);
                throw a1.a(n2.toString(), null);
            }
            int i12 = bVar.f11257b * i11;
            int i13 = i12 * 8;
            int max = Math.max(i11, i12 / 10);
            this.f11253e = max;
            i0.a aVar = new i0.a();
            aVar.f15472k = str;
            aVar.f = i13;
            aVar.f15468g = i13;
            aVar.f15473l = max;
            aVar.f15484x = bVar.f11256a;
            aVar.f15485y = bVar.f11257b;
            aVar.f15486z = i10;
            this.f11252d = new i0(aVar);
        }

        @Override // n4.a.b
        public final void a(long j10) {
            this.f = j10;
            this.f11254g = 0;
            this.f11255h = 0L;
        }

        @Override // n4.a.b
        public final boolean b(i iVar, long j10) {
            int i10;
            int i11;
            long j11 = j10;
            while (j11 > 0 && (i10 = this.f11254g) < (i11 = this.f11253e)) {
                int e10 = this.f11250b.e(iVar, (int) Math.min(i11 - i10, j11), true);
                if (e10 == -1) {
                    j11 = 0;
                } else {
                    this.f11254g += e10;
                    j11 -= e10;
                }
            }
            int i12 = this.f11251c.f11258c;
            int i13 = this.f11254g / i12;
            if (i13 > 0) {
                long O = this.f + e0.O(this.f11255h, 1000000L, r1.f11257b);
                int i14 = i13 * i12;
                int i15 = this.f11254g - i14;
                this.f11250b.c(O, 1, i14, i15, null);
                this.f11255h += i13;
                this.f11254g = i15;
            }
            return j11 <= 0;
        }

        @Override // n4.a.b
        public final void c(int i10, long j10) {
            this.f11249a.t(new d(this.f11251c, 1, i10, j10));
            this.f11250b.d(this.f11252d);
        }
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f11230a = jVar;
        this.f11231b = jVar.r(0, 1);
        jVar.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0177, code lost:
    
        if (r8 != 65534) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017c, code lost:
    
        if (r2 == 32) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r26, c4.s r27) {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.a.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f11232c = j10 == 0 ? 0 : 4;
        b bVar = this.f11234e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        return n4.c.a(iVar);
    }

    @Override // c4.h
    public final void release() {
    }
}
