package d1;

import N4.h;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import c1.k;
import c1.p;
import c1.q;
import com.appsflyer.attribution.RequestError;
import d1.c;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.AbstractC1300d;
import g0.o;
import g0.y;
import g0.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: h, reason: collision with root package name */
    public final z f13056h = new z();

    /* renamed from: i, reason: collision with root package name */
    public final y f13057i = new y();

    /* renamed from: j, reason: collision with root package name */
    public int f13058j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f13059k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13060l;

    /* renamed from: m, reason: collision with root package name */
    public final b[] f13061m;

    /* renamed from: n, reason: collision with root package name */
    public b f13062n;

    /* renamed from: o, reason: collision with root package name */
    public List f13063o;

    /* renamed from: p, reason: collision with root package name */
    public List f13064p;

    /* renamed from: q, reason: collision with root package name */
    public C0190c f13065q;

    /* renamed from: r, reason: collision with root package name */
    public int f13066r;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f13067c = new Comparator() { // from class: d1.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int c7;
                c7 = c.a.c((c.a) obj, (c.a) obj2);
                return c7;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final C1280a f13068a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13069b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f7, int i7, int i8, float f8, int i9, float f9, boolean z7, int i10, int i11) {
            C1280a.b n7 = new C1280a.b().o(charSequence).p(alignment).h(f7, i7).i(i8).k(f8).l(i9).n(f9);
            if (z7) {
                n7.s(i10);
            }
            this.f13068a = n7.a();
            this.f13069b = i11;
        }

        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f13069b, aVar.f13069b);
        }
    }

    public static final class b {

        /* renamed from: A, reason: collision with root package name */
        public static final int[] f13070A;

        /* renamed from: B, reason: collision with root package name */
        public static final boolean[] f13071B;

        /* renamed from: C, reason: collision with root package name */
        public static final int[] f13072C;

        /* renamed from: D, reason: collision with root package name */
        public static final int[] f13073D;

        /* renamed from: E, reason: collision with root package name */
        public static final int[] f13074E;

        /* renamed from: F, reason: collision with root package name */
        public static final int[] f13075F;

        /* renamed from: v, reason: collision with root package name */
        public static final int f13076v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f13077w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f13078x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f13079y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f13080z;

        /* renamed from: a, reason: collision with root package name */
        public final List f13081a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f13082b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f13083c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f13084d;

        /* renamed from: e, reason: collision with root package name */
        public int f13085e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f13086f;

        /* renamed from: g, reason: collision with root package name */
        public int f13087g;

        /* renamed from: h, reason: collision with root package name */
        public int f13088h;

        /* renamed from: i, reason: collision with root package name */
        public int f13089i;

        /* renamed from: j, reason: collision with root package name */
        public int f13090j;

        /* renamed from: k, reason: collision with root package name */
        public int f13091k;

        /* renamed from: l, reason: collision with root package name */
        public int f13092l;

        /* renamed from: m, reason: collision with root package name */
        public int f13093m;

        /* renamed from: n, reason: collision with root package name */
        public int f13094n;

        /* renamed from: o, reason: collision with root package name */
        public int f13095o;

        /* renamed from: p, reason: collision with root package name */
        public int f13096p;

        /* renamed from: q, reason: collision with root package name */
        public int f13097q;

        /* renamed from: r, reason: collision with root package name */
        public int f13098r;

        /* renamed from: s, reason: collision with root package name */
        public int f13099s;

        /* renamed from: t, reason: collision with root package name */
        public int f13100t;

        /* renamed from: u, reason: collision with root package name */
        public int f13101u;

        static {
            int h7 = h(0, 0, 0, 0);
            f13077w = h7;
            int h8 = h(0, 0, 0, 3);
            f13078x = h8;
            f13079y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f13080z = new int[]{0, 0, 0, 0, 0, 0, 2};
            f13070A = new int[]{3, 3, 3, 3, 3, 3, 1};
            f13071B = new boolean[]{false, false, false, true, true, true, false};
            f13072C = new int[]{h7, h8, h7, h7, h8, h7, h7};
            f13073D = new int[]{0, 1, 2, 3, 4, 3, 4};
            f13074E = new int[]{0, 0, 0, 0, 0, 3, 3};
            f13075F = new int[]{h7, h7, h7, h7, h7, h8, h8};
        }

        public b() {
            l();
        }

        public static int g(int i7, int i8, int i9) {
            return h(i7, i8, i9, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int h(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                g0.AbstractC1297a.c(r4, r0, r1)
                g0.AbstractC1297a.c(r5, r0, r1)
                g0.AbstractC1297a.c(r6, r0, r1)
                g0.AbstractC1297a.c(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L1b
                if (r7 == r1) goto L1b
                r3 = 2
                if (r7 == r3) goto L1f
                r3 = 3
                if (r7 == r3) goto L1d
            L1b:
                r7 = r2
                goto L21
            L1d:
                r7 = r0
                goto L21
            L1f:
                r7 = 127(0x7f, float:1.78E-43)
            L21:
                if (r4 <= r1) goto L25
                r4 = r2
                goto L26
            L25:
                r4 = r0
            L26:
                if (r5 <= r1) goto L2a
                r5 = r2
                goto L2b
            L2a:
                r5 = r0
            L2b:
                if (r6 <= r1) goto L2e
                r0 = r2
            L2e:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.c.b.h(int, int, int, int):int");
        }

        public void a(char c7) {
            if (c7 != '\n') {
                this.f13082b.append(c7);
                return;
            }
            this.f13081a.add(d());
            this.f13082b.clear();
            if (this.f13095o != -1) {
                this.f13095o = 0;
            }
            if (this.f13096p != -1) {
                this.f13096p = 0;
            }
            if (this.f13097q != -1) {
                this.f13097q = 0;
            }
            if (this.f13099s != -1) {
                this.f13099s = 0;
            }
            while (true) {
                if (this.f13081a.size() < this.f13090j && this.f13081a.size() < 15) {
                    this.f13101u = this.f13081a.size();
                    return;
                }
                this.f13081a.remove(0);
            }
        }

        public void b() {
            int length = this.f13082b.length();
            if (length > 0) {
                this.f13082b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d1.c.a c() {
            /*
                Method dump skipped, instructions count: 194
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: d1.c.b.c():d1.c$a");
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f13082b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f13095o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f13095o, length, 33);
                }
                if (this.f13096p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f13096p, length, 33);
                }
                if (this.f13097q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f13098r), this.f13097q, length, 33);
                }
                if (this.f13099s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f13100t), this.f13099s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f13081a.clear();
            this.f13082b.clear();
            this.f13095o = -1;
            this.f13096p = -1;
            this.f13097q = -1;
            this.f13099s = -1;
            this.f13101u = 0;
        }

        public void f(boolean z7, int i7, boolean z8, int i8, int i9, int i10, int i11, int i12, int i13) {
            this.f13083c = true;
            this.f13084d = z7;
            this.f13085e = i7;
            this.f13086f = z8;
            this.f13087g = i8;
            this.f13088h = i9;
            this.f13089i = i11;
            int i14 = i10 + 1;
            if (this.f13090j != i14) {
                this.f13090j = i14;
                while (true) {
                    if (this.f13081a.size() < this.f13090j && this.f13081a.size() < 15) {
                        break;
                    } else {
                        this.f13081a.remove(0);
                    }
                }
            }
            if (i12 != 0 && this.f13092l != i12) {
                this.f13092l = i12;
                int i15 = i12 - 1;
                q(f13072C[i15], f13078x, f13071B[i15], 0, f13080z[i15], f13070A[i15], f13079y[i15]);
            }
            if (i13 == 0 || this.f13093m == i13) {
                return;
            }
            this.f13093m = i13;
            int i16 = i13 - 1;
            m(0, 1, 1, false, false, f13074E[i16], f13073D[i16]);
            n(f13076v, f13075F[i16], f13077w);
        }

        public boolean i() {
            return this.f13083c;
        }

        public boolean j() {
            return !i() || (this.f13081a.isEmpty() && this.f13082b.length() == 0);
        }

        public boolean k() {
            return this.f13084d;
        }

        public void l() {
            e();
            this.f13083c = false;
            this.f13084d = false;
            this.f13085e = 4;
            this.f13086f = false;
            this.f13087g = 0;
            this.f13088h = 0;
            this.f13089i = 0;
            this.f13090j = 15;
            this.f13091k = 0;
            this.f13092l = 0;
            this.f13093m = 0;
            int i7 = f13077w;
            this.f13094n = i7;
            this.f13098r = f13076v;
            this.f13100t = i7;
        }

        public void m(int i7, int i8, int i9, boolean z7, boolean z8, int i10, int i11) {
            if (this.f13095o != -1) {
                if (!z7) {
                    this.f13082b.setSpan(new StyleSpan(2), this.f13095o, this.f13082b.length(), 33);
                    this.f13095o = -1;
                }
            } else if (z7) {
                this.f13095o = this.f13082b.length();
            }
            if (this.f13096p == -1) {
                if (z8) {
                    this.f13096p = this.f13082b.length();
                }
            } else {
                if (z8) {
                    return;
                }
                this.f13082b.setSpan(new UnderlineSpan(), this.f13096p, this.f13082b.length(), 33);
                this.f13096p = -1;
            }
        }

        public void n(int i7, int i8, int i9) {
            if (this.f13097q != -1 && this.f13098r != i7) {
                this.f13082b.setSpan(new ForegroundColorSpan(this.f13098r), this.f13097q, this.f13082b.length(), 33);
            }
            if (i7 != f13076v) {
                this.f13097q = this.f13082b.length();
                this.f13098r = i7;
            }
            if (this.f13099s != -1 && this.f13100t != i8) {
                this.f13082b.setSpan(new BackgroundColorSpan(this.f13100t), this.f13099s, this.f13082b.length(), 33);
            }
            if (i8 != f13077w) {
                this.f13099s = this.f13082b.length();
                this.f13100t = i8;
            }
        }

        public void o(int i7, int i8) {
            if (this.f13101u != i7) {
                a('\n');
            }
            this.f13101u = i7;
        }

        public void p(boolean z7) {
            this.f13084d = z7;
        }

        public void q(int i7, int i8, boolean z7, int i9, int i10, int i11, int i12) {
            this.f13094n = i7;
            this.f13091k = i12;
        }
    }

    /* renamed from: d1.c$c, reason: collision with other inner class name */
    public static final class C0190c {

        /* renamed from: a, reason: collision with root package name */
        public final int f13102a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13103b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f13104c;

        /* renamed from: d, reason: collision with root package name */
        public int f13105d = 0;

        public C0190c(int i7, int i8) {
            this.f13102a = i7;
            this.f13103b = i8;
            this.f13104c = new byte[(i8 * 2) - 1];
        }
    }

    public c(int i7, List list) {
        this.f13060l = i7 == -1 ? 1 : i7;
        this.f13059k = list != null && AbstractC1300d.f(list);
        this.f13061m = new b[8];
        for (int i8 = 0; i8 < 8; i8++) {
            this.f13061m[i8] = new b();
        }
        this.f13062n = this.f13061m[0];
    }

    private void G() {
        for (int i7 = 0; i7 < 8; i7++) {
            this.f13061m[i7].l();
        }
    }

    private List r() {
        a c7;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < 8; i7++) {
            if (!this.f13061m[i7].j() && this.f13061m[i7].k() && (c7 = this.f13061m[i7].c()) != null) {
                arrayList.add(c7);
            }
        }
        Collections.sort(arrayList, a.f13067c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList2.add(((a) arrayList.get(i8)).f13068a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A(int i7) {
        b bVar;
        char c7;
        if (i7 == 160) {
            bVar = this.f13062n;
            c7 = 13252;
        } else {
            o.h("Cea708Decoder", "Invalid G3 character: " + i7);
            bVar = this.f13062n;
            c7 = '_';
        }
        bVar.a(c7);
    }

    public final void B() {
        this.f13062n.m(this.f13057i.h(4), this.f13057i.h(2), this.f13057i.h(2), this.f13057i.g(), this.f13057i.g(), this.f13057i.h(3), this.f13057i.h(3));
    }

    public final void C() {
        int h7 = b.h(this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2));
        int h8 = b.h(this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2));
        this.f13057i.r(2);
        this.f13062n.n(h7, h8, b.g(this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2)));
    }

    public final void D() {
        this.f13057i.r(4);
        int h7 = this.f13057i.h(4);
        this.f13057i.r(2);
        this.f13062n.o(h7, this.f13057i.h(6));
    }

    public final void E() {
        int h7 = b.h(this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2));
        int h8 = this.f13057i.h(2);
        int g7 = b.g(this.f13057i.h(2), this.f13057i.h(2), this.f13057i.h(2));
        if (this.f13057i.g()) {
            h8 |= 4;
        }
        boolean g8 = this.f13057i.g();
        int h9 = this.f13057i.h(2);
        int h10 = this.f13057i.h(2);
        int h11 = this.f13057i.h(2);
        this.f13057i.r(8);
        this.f13062n.q(h7, g7, g8, h8, h9, h10, h11);
    }

    public final void F() {
        StringBuilder sb;
        String str;
        C0190c c0190c = this.f13065q;
        if (c0190c.f13105d != (c0190c.f13103b * 2) - 1) {
            o.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f13065q.f13103b * 2) - 1) + ", but current index is " + this.f13065q.f13105d + " (sequence number " + this.f13065q.f13102a + ");");
        }
        y yVar = this.f13057i;
        C0190c c0190c2 = this.f13065q;
        yVar.o(c0190c2.f13104c, c0190c2.f13105d);
        boolean z7 = false;
        while (true) {
            if (this.f13057i.b() <= 0) {
                break;
            }
            int h7 = this.f13057i.h(3);
            int h8 = this.f13057i.h(5);
            if (h7 == 7) {
                this.f13057i.r(2);
                h7 = this.f13057i.h(6);
                if (h7 < 7) {
                    o.h("Cea708Decoder", "Invalid extended service number: " + h7);
                }
            }
            if (h8 == 0) {
                if (h7 != 0) {
                    o.h("Cea708Decoder", "serviceNumber is non-zero (" + h7 + ") when blockSize is 0");
                }
            } else if (h7 != this.f13060l) {
                this.f13057i.s(h8);
            } else {
                int e7 = this.f13057i.e() + (h8 * 8);
                while (this.f13057i.e() < e7) {
                    int h9 = this.f13057i.h(8);
                    if (h9 == 16) {
                        h9 = this.f13057i.h(8);
                        if (h9 <= 31) {
                            u(h9);
                        } else {
                            if (h9 <= 127) {
                                z(h9);
                            } else if (h9 <= 159) {
                                v(h9);
                            } else if (h9 <= 255) {
                                A(h9);
                            } else {
                                sb = new StringBuilder();
                                str = "Invalid extended command: ";
                                sb.append(str);
                                sb.append(h9);
                                o.h("Cea708Decoder", sb.toString());
                            }
                            z7 = true;
                        }
                    } else if (h9 <= 31) {
                        s(h9);
                    } else {
                        if (h9 <= 127) {
                            x(h9);
                        } else if (h9 <= 159) {
                            t(h9);
                        } else if (h9 <= 255) {
                            y(h9);
                        } else {
                            sb = new StringBuilder();
                            str = "Invalid base command: ";
                            sb.append(str);
                            sb.append(h9);
                            o.h("Cea708Decoder", sb.toString());
                        }
                        z7 = true;
                    }
                }
            }
        }
        if (z7) {
            this.f13063o = r();
        }
    }

    @Override // d1.e, c1.l
    public /* bridge */ /* synthetic */ void d(long j7) {
        super.d(j7);
    }

    @Override // d1.e, j0.g
    public void flush() {
        super.flush();
        this.f13063o = null;
        this.f13064p = null;
        this.f13066r = 0;
        this.f13062n = this.f13061m[0];
        G();
        this.f13065q = null;
    }

    @Override // d1.e
    public k g() {
        List list = this.f13063o;
        this.f13064p = list;
        return new f((List) AbstractC1297a.e(list));
    }

    @Override // d1.e
    public void h(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1297a.e(pVar.f15400r);
        this.f13056h.R(byteBuffer.array(), byteBuffer.limit());
        while (this.f13056h.a() >= 3) {
            int G6 = this.f13056h.G();
            int i7 = G6 & 3;
            boolean z7 = (G6 & 4) == 4;
            byte G7 = (byte) this.f13056h.G();
            byte G8 = (byte) this.f13056h.G();
            if (i7 == 2 || i7 == 3) {
                if (z7) {
                    if (i7 == 3) {
                        q();
                        int i8 = (G7 & 192) >> 6;
                        int i9 = this.f13058j;
                        if (i9 != -1 && i8 != (i9 + 1) % 4) {
                            G();
                            o.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f13058j + " current=" + i8);
                        }
                        this.f13058j = i8;
                        int i10 = G7 & 63;
                        if (i10 == 0) {
                            i10 = 64;
                        }
                        C0190c c0190c = new C0190c(i8, i10);
                        this.f13065q = c0190c;
                        byte[] bArr = c0190c.f13104c;
                        int i11 = c0190c.f13105d;
                        c0190c.f13105d = i11 + 1;
                        bArr[i11] = G8;
                    } else {
                        AbstractC1297a.a(i7 == 2);
                        C0190c c0190c2 = this.f13065q;
                        if (c0190c2 == null) {
                            o.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0190c2.f13104c;
                            int i12 = c0190c2.f13105d;
                            bArr2[i12] = G7;
                            c0190c2.f13105d = i12 + 2;
                            bArr2[i12 + 1] = G8;
                        }
                    }
                    C0190c c0190c3 = this.f13065q;
                    if (c0190c3.f13105d == (c0190c3.f13103b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // d1.e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // d1.e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // d1.e
    public boolean m() {
        return this.f13063o != this.f13064p;
    }

    @Override // d1.e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void e(p pVar) {
        super.e(pVar);
    }

    public final void q() {
        if (this.f13065q == null) {
            return;
        }
        F();
        this.f13065q = null;
    }

    @Override // d1.e, j0.g
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i7) {
        y yVar;
        if (i7 != 0) {
            if (i7 == 3) {
                this.f13063o = r();
            }
            int i8 = 8;
            if (i7 == 8) {
                this.f13062n.b();
                return;
            }
            switch (i7) {
                case h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    G();
                    break;
                case h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                    this.f13062n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i7 >= 17 && i7 <= 23) {
                        o.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i7);
                        yVar = this.f13057i;
                    } else if (i7 < 24 || i7 > 31) {
                        o.h("Cea708Decoder", "Invalid C0 command: " + i7);
                        break;
                    } else {
                        o.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i7);
                        yVar = this.f13057i;
                        i8 = 16;
                    }
                    yVar.r(i8);
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void t(int i7) {
        b bVar;
        y yVar;
        int i8 = 16;
        int i9 = 1;
        switch (i7) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i10 = i7 - 128;
                if (this.f13066r != i10) {
                    this.f13066r = i10;
                    bVar = this.f13061m[i10];
                    this.f13062n = bVar;
                    break;
                }
                break;
            case 136:
                while (i9 <= 8) {
                    if (this.f13057i.g()) {
                        this.f13061m[8 - i9].e();
                    }
                    i9++;
                }
                break;
            case 137:
                for (int i11 = 1; i11 <= 8; i11++) {
                    if (this.f13057i.g()) {
                        this.f13061m[8 - i11].p(true);
                    }
                }
                break;
            case 138:
                while (i9 <= 8) {
                    if (this.f13057i.g()) {
                        this.f13061m[8 - i9].p(false);
                    }
                    i9++;
                }
                break;
            case 139:
                for (int i12 = 1; i12 <= 8; i12++) {
                    if (this.f13057i.g()) {
                        this.f13061m[8 - i12].p(!r0.k());
                    }
                }
                break;
            case 140:
                while (i9 <= 8) {
                    if (this.f13057i.g()) {
                        this.f13061m[8 - i9].l();
                    }
                    i9++;
                }
                break;
            case 141:
                this.f13057i.r(8);
                break;
            case 142:
                break;
            case 143:
                G();
                break;
            case 144:
                if (this.f13062n.i()) {
                    B();
                    break;
                }
                yVar = this.f13057i;
                yVar.r(i8);
                break;
            case 145:
                if (this.f13062n.i()) {
                    C();
                    break;
                } else {
                    yVar = this.f13057i;
                    i8 = 24;
                    yVar.r(i8);
                    break;
                }
            case 146:
                if (this.f13062n.i()) {
                    D();
                    break;
                }
                yVar = this.f13057i;
                yVar.r(i8);
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                o.h("Cea708Decoder", "Invalid C1 command: " + i7);
                break;
            case 151:
                if (this.f13062n.i()) {
                    E();
                    break;
                } else {
                    yVar = this.f13057i;
                    i8 = 32;
                    yVar.r(i8);
                    break;
                }
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i13 = i7 - 152;
                w(i13);
                if (this.f13066r != i13) {
                    this.f13066r = i13;
                    bVar = this.f13061m[i13];
                    this.f13062n = bVar;
                    break;
                }
                break;
        }
    }

    public final void u(int i7) {
        y yVar;
        int i8;
        if (i7 <= 7) {
            return;
        }
        if (i7 <= 15) {
            yVar = this.f13057i;
            i8 = 8;
        } else if (i7 <= 23) {
            yVar = this.f13057i;
            i8 = 16;
        } else {
            if (i7 > 31) {
                return;
            }
            yVar = this.f13057i;
            i8 = 24;
        }
        yVar.r(i8);
    }

    public final void v(int i7) {
        y yVar;
        int i8;
        if (i7 <= 135) {
            yVar = this.f13057i;
            i8 = 32;
        } else {
            if (i7 > 143) {
                if (i7 <= 159) {
                    this.f13057i.r(2);
                    this.f13057i.r(this.f13057i.h(6) * 8);
                    return;
                }
                return;
            }
            yVar = this.f13057i;
            i8 = 40;
        }
        yVar.r(i8);
    }

    public final void w(int i7) {
        b bVar = this.f13061m[i7];
        this.f13057i.r(2);
        boolean g7 = this.f13057i.g();
        this.f13057i.r(2);
        int h7 = this.f13057i.h(3);
        boolean g8 = this.f13057i.g();
        int h8 = this.f13057i.h(7);
        int h9 = this.f13057i.h(8);
        int h10 = this.f13057i.h(4);
        int h11 = this.f13057i.h(4);
        this.f13057i.r(2);
        this.f13057i.r(6);
        this.f13057i.r(2);
        bVar.f(g7, h7, g8, h8, h9, h11, h10, this.f13057i.h(3), this.f13057i.h(3));
    }

    public final void x(int i7) {
        if (i7 == 127) {
            this.f13062n.a((char) 9835);
        } else {
            this.f13062n.a((char) (i7 & 255));
        }
    }

    public final void y(int i7) {
        this.f13062n.a((char) (i7 & 255));
    }

    public final void z(int i7) {
        b bVar;
        char c7 = ' ';
        if (i7 == 32) {
            bVar = this.f13062n;
        } else if (i7 == 33) {
            bVar = this.f13062n;
            c7 = 160;
        } else if (i7 == 37) {
            bVar = this.f13062n;
            c7 = 8230;
        } else if (i7 == 42) {
            bVar = this.f13062n;
            c7 = 352;
        } else if (i7 == 44) {
            bVar = this.f13062n;
            c7 = 338;
        } else if (i7 == 63) {
            bVar = this.f13062n;
            c7 = 376;
        } else if (i7 == 57) {
            bVar = this.f13062n;
            c7 = 8482;
        } else if (i7 == 58) {
            bVar = this.f13062n;
            c7 = 353;
        } else if (i7 == 60) {
            bVar = this.f13062n;
            c7 = 339;
        } else if (i7 != 61) {
            switch (i7) {
                case 48:
                    bVar = this.f13062n;
                    c7 = 9608;
                    break;
                case 49:
                    bVar = this.f13062n;
                    c7 = 8216;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    bVar = this.f13062n;
                    c7 = 8217;
                    break;
                case 51:
                    bVar = this.f13062n;
                    c7 = 8220;
                    break;
                case 52:
                    bVar = this.f13062n;
                    c7 = 8221;
                    break;
                case 53:
                    bVar = this.f13062n;
                    c7 = 8226;
                    break;
                default:
                    switch (i7) {
                        case 118:
                            bVar = this.f13062n;
                            c7 = 8539;
                            break;
                        case 119:
                            bVar = this.f13062n;
                            c7 = 8540;
                            break;
                        case 120:
                            bVar = this.f13062n;
                            c7 = 8541;
                            break;
                        case 121:
                            bVar = this.f13062n;
                            c7 = 8542;
                            break;
                        case 122:
                            bVar = this.f13062n;
                            c7 = 9474;
                            break;
                        case 123:
                            bVar = this.f13062n;
                            c7 = 9488;
                            break;
                        case 124:
                            bVar = this.f13062n;
                            c7 = 9492;
                            break;
                        case 125:
                            bVar = this.f13062n;
                            c7 = 9472;
                            break;
                        case 126:
                            bVar = this.f13062n;
                            c7 = 9496;
                            break;
                        case 127:
                            bVar = this.f13062n;
                            c7 = 9484;
                            break;
                        default:
                            o.h("Cea708Decoder", "Invalid G2 character: " + i7);
                            return;
                    }
            }
        } else {
            bVar = this.f13062n;
            c7 = 8480;
        }
        bVar.a(c7);
    }
}
