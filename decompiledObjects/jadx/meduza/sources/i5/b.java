package i5;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import defpackage.f;
import h5.a;
import i5.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import v5.m;
import v5.t;
import v5.u;

/* loaded from: classes.dex */
public final class b extends i5.c {

    /* renamed from: g, reason: collision with root package name */
    public final u f7515g = new u();

    /* renamed from: h, reason: collision with root package name */
    public final t f7516h = new t();

    /* renamed from: i, reason: collision with root package name */
    public int f7517i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final int f7518j;

    /* renamed from: k, reason: collision with root package name */
    public final C0116b[] f7519k;

    /* renamed from: l, reason: collision with root package name */
    public C0116b f7520l;

    /* renamed from: m, reason: collision with root package name */
    public List<h5.a> f7521m;

    /* renamed from: n, reason: collision with root package name */
    public List<h5.a> f7522n;

    /* renamed from: o, reason: collision with root package name */
    public c f7523o;

    /* renamed from: p, reason: collision with root package name */
    public int f7524p;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final b0.d f7525c = new b0.d(1);

        /* renamed from: a, reason: collision with root package name */
        public final h5.a f7526a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7527b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f, int i10, float f10, int i11, boolean z10, int i12, int i13) {
            a.C0105a c0105a = new a.C0105a();
            c0105a.f7110a = spannableStringBuilder;
            c0105a.f7112c = alignment;
            c0105a.f7114e = f;
            c0105a.f = 0;
            c0105a.f7115g = i10;
            c0105a.f7116h = f10;
            c0105a.f7117i = i11;
            c0105a.f7120l = -3.4028235E38f;
            if (z10) {
                c0105a.f7123o = i12;
                c0105a.f7122n = true;
            }
            this.f7526a = c0105a.a();
            this.f7527b = i13;
        }
    }

    /* renamed from: i5.b$b, reason: collision with other inner class name */
    public static final class C0116b {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;

        /* renamed from: w, reason: collision with root package name */
        public static final int f7528w = c(2, 2, 2, 0);

        /* renamed from: x, reason: collision with root package name */
        public static final int f7529x;

        /* renamed from: y, reason: collision with root package name */
        public static final int[] f7530y;

        /* renamed from: z, reason: collision with root package name */
        public static final int[] f7531z;

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f7532a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f7533b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f7534c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f7535d;

        /* renamed from: e, reason: collision with root package name */
        public int f7536e;
        public boolean f;

        /* renamed from: g, reason: collision with root package name */
        public int f7537g;

        /* renamed from: h, reason: collision with root package name */
        public int f7538h;

        /* renamed from: i, reason: collision with root package name */
        public int f7539i;

        /* renamed from: j, reason: collision with root package name */
        public int f7540j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f7541k;

        /* renamed from: l, reason: collision with root package name */
        public int f7542l;

        /* renamed from: m, reason: collision with root package name */
        public int f7543m;

        /* renamed from: n, reason: collision with root package name */
        public int f7544n;

        /* renamed from: o, reason: collision with root package name */
        public int f7545o;

        /* renamed from: p, reason: collision with root package name */
        public int f7546p;

        /* renamed from: q, reason: collision with root package name */
        public int f7547q;

        /* renamed from: r, reason: collision with root package name */
        public int f7548r;

        /* renamed from: s, reason: collision with root package name */
        public int f7549s;
        public int t;

        /* renamed from: u, reason: collision with root package name */
        public int f7550u;

        /* renamed from: v, reason: collision with root package name */
        public int f7551v;

        static {
            int c10 = c(0, 0, 0, 0);
            f7529x = c10;
            int c11 = c(0, 0, 0, 3);
            f7530y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f7531z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{c10, c11, c10, c10, c11, c10, c10};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{c10, c10, c10, c10, c10, c11, c11};
        }

        public C0116b() {
            d();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int c(int r4, int r5, int r6, int r7) {
            /*
                r0 = 4
                x6.b.x(r4, r0)
                x6.b.x(r5, r0)
                x6.b.x(r6, r0)
                x6.b.x(r7, r0)
                r0 = 0
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L21
                if (r7 == r1) goto L21
                r3 = 2
                if (r7 == r3) goto L1e
                r3 = 3
                if (r7 == r3) goto L1c
                goto L21
            L1c:
                r7 = r0
                goto L22
            L1e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L22
            L21:
                r7 = r2
            L22:
                if (r4 <= r1) goto L26
                r4 = r2
                goto L27
            L26:
                r4 = r0
            L27:
                if (r5 <= r1) goto L2b
                r5 = r2
                goto L2c
            L2b:
                r5 = r0
            L2c:
                if (r6 <= r1) goto L2f
                r0 = r2
            L2f:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: i5.b.C0116b.c(int, int, int, int):int");
        }

        public final void a(char c10) {
            if (c10 != '\n') {
                this.f7533b.append(c10);
                return;
            }
            this.f7532a.add(b());
            this.f7533b.clear();
            if (this.f7546p != -1) {
                this.f7546p = 0;
            }
            if (this.f7547q != -1) {
                this.f7547q = 0;
            }
            if (this.f7548r != -1) {
                this.f7548r = 0;
            }
            if (this.t != -1) {
                this.t = 0;
            }
            while (true) {
                if ((!this.f7541k || this.f7532a.size() < this.f7540j) && this.f7532a.size() < 15) {
                    return;
                } else {
                    this.f7532a.remove(0);
                }
            }
        }

        public final SpannableString b() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f7533b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f7546p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f7546p, length, 33);
                }
                if (this.f7547q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f7547q, length, 33);
                }
                if (this.f7548r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f7549s), this.f7548r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f7550u), this.t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void d() {
            this.f7532a.clear();
            this.f7533b.clear();
            this.f7546p = -1;
            this.f7547q = -1;
            this.f7548r = -1;
            this.t = -1;
            this.f7551v = 0;
            this.f7534c = false;
            this.f7535d = false;
            this.f7536e = 4;
            this.f = false;
            this.f7537g = 0;
            this.f7538h = 0;
            this.f7539i = 0;
            this.f7540j = 15;
            this.f7541k = true;
            this.f7542l = 0;
            this.f7543m = 0;
            this.f7544n = 0;
            int i10 = f7529x;
            this.f7545o = i10;
            this.f7549s = f7528w;
            this.f7550u = i10;
        }

        public final void e(boolean z10, boolean z11) {
            if (this.f7546p != -1) {
                if (!z10) {
                    this.f7533b.setSpan(new StyleSpan(2), this.f7546p, this.f7533b.length(), 33);
                    this.f7546p = -1;
                }
            } else if (z10) {
                this.f7546p = this.f7533b.length();
            }
            if (this.f7547q == -1) {
                if (z11) {
                    this.f7547q = this.f7533b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f7533b.setSpan(new UnderlineSpan(), this.f7547q, this.f7533b.length(), 33);
                this.f7547q = -1;
            }
        }

        public final void f(int i10, int i11) {
            if (this.f7548r != -1 && this.f7549s != i10) {
                this.f7533b.setSpan(new ForegroundColorSpan(this.f7549s), this.f7548r, this.f7533b.length(), 33);
            }
            if (i10 != f7528w) {
                this.f7548r = this.f7533b.length();
                this.f7549s = i10;
            }
            if (this.t != -1 && this.f7550u != i11) {
                this.f7533b.setSpan(new BackgroundColorSpan(this.f7550u), this.t, this.f7533b.length(), 33);
            }
            if (i11 != f7529x) {
                this.t = this.f7533b.length();
                this.f7550u = i11;
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7552a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7553b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f7554c;

        /* renamed from: d, reason: collision with root package name */
        public int f7555d = 0;

        public c(int i10, int i11) {
            this.f7552a = i10;
            this.f7553b = i11;
            this.f7554c = new byte[(i11 * 2) - 1];
        }
    }

    public b(int i10, List<byte[]> list) {
        this.f7518j = i10 == -1 ? 1 : i10;
        if (list != null && (list.size() != 1 || list.get(0).length != 1 || list.get(0)[0] != 1)) {
        }
        this.f7519k = new C0116b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f7519k[i11] = new C0116b();
        }
        this.f7520l = this.f7519k[0];
    }

    @Override // i5.c
    public final d e() {
        List<h5.a> list = this.f7521m;
        this.f7522n = list;
        list.getClass();
        return new d(list);
    }

    @Override // i5.c
    public final void f(c.a aVar) {
        ByteBuffer byteBuffer = aVar.f17532c;
        byteBuffer.getClass();
        this.f7515g.E(byteBuffer.array(), byteBuffer.limit());
        while (true) {
            u uVar = this.f7515g;
            if (uVar.f15976c - uVar.f15975b < 3) {
                return;
            }
            int v10 = uVar.v() & 7;
            int i10 = v10 & 3;
            boolean z10 = (v10 & 4) == 4;
            byte v11 = (byte) this.f7515g.v();
            byte v12 = (byte) this.f7515g.v();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        i();
                        int i11 = (v11 & 192) >> 6;
                        int i12 = this.f7517i;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            k();
                            m.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f7517i + " current=" + i11);
                        }
                        this.f7517i = i11;
                        int i13 = v11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        c cVar = new c(i11, i13);
                        this.f7523o = cVar;
                        byte[] bArr = cVar.f7554c;
                        int i14 = cVar.f7555d;
                        cVar.f7555d = i14 + 1;
                        bArr[i14] = v12;
                    } else {
                        x6.b.q(i10 == 2);
                        c cVar2 = this.f7523o;
                        if (cVar2 == null) {
                            m.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = cVar2.f7554c;
                            int i15 = cVar2.f7555d;
                            int i16 = i15 + 1;
                            bArr2[i15] = v11;
                            cVar2.f7555d = i16 + 1;
                            bArr2[i16] = v12;
                        }
                    }
                    c cVar3 = this.f7523o;
                    if (cVar3.f7555d == (cVar3.f7553b * 2) - 1) {
                        i();
                    }
                }
            }
        }
    }

    @Override // i5.c, z3.d
    public final void flush() {
        super.flush();
        this.f7521m = null;
        this.f7522n = null;
        this.f7524p = 0;
        this.f7520l = this.f7519k[0];
        k();
        this.f7523o = null;
    }

    @Override // i5.c
    public final boolean h() {
        return this.f7521m != this.f7522n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void i() {
        t tVar;
        C0116b c0116b;
        char c10;
        int i10;
        boolean z10;
        C0116b c0116b2;
        t tVar2;
        t tVar3;
        C0116b c0116b3;
        t tVar4;
        C0116b c0116b4;
        char c11;
        c cVar = this.f7523o;
        if (cVar == null) {
            return;
        }
        int i11 = 2;
        if (cVar.f7555d != (cVar.f7553b * 2) - 1) {
            StringBuilder l10 = f.l("DtvCcPacket ended prematurely; size is ");
            l10.append((this.f7523o.f7553b * 2) - 1);
            l10.append(", but current index is ");
            l10.append(this.f7523o.f7555d);
            l10.append(" (sequence number ");
            l10.append(this.f7523o.f7552a);
            l10.append(");");
            m.b("Cea708Decoder", l10.toString());
        }
        t tVar5 = this.f7516h;
        c cVar2 = this.f7523o;
        tVar5.j(cVar2.f7554c, cVar2.f7555d);
        boolean z11 = false;
        while (true) {
            if (this.f7516h.b() > 0) {
                int i12 = 3;
                int g10 = this.f7516h.g(3);
                int g11 = this.f7516h.g(5);
                int i13 = 7;
                int i14 = 6;
                if (g10 == 7) {
                    this.f7516h.m(i11);
                    g10 = this.f7516h.g(6);
                    if (g10 < 7) {
                        f.p("Invalid extended service number: ", g10, "Cea708Decoder");
                    }
                }
                if (g11 == 0) {
                    if (g10 != 0) {
                        m.f("Cea708Decoder", "serviceNumber is non-zero (" + g10 + ") when blockSize is 0");
                    }
                } else if (g10 != this.f7518j) {
                    this.f7516h.n(g11);
                } else {
                    int e10 = (g11 * 8) + this.f7516h.e();
                    while (this.f7516h.e() < e10) {
                        int i15 = 8;
                        int g12 = this.f7516h.g(8);
                        int i16 = 24;
                        if (g12 == 16) {
                            int g13 = this.f7516h.g(8);
                            if (g13 <= 31) {
                                i10 = 7;
                                if (g13 > 7) {
                                    if (g13 <= 15) {
                                        tVar3 = this.f7516h;
                                    } else if (g13 <= 23) {
                                        tVar3 = this.f7516h;
                                        i15 = 16;
                                    } else if (g13 <= 31) {
                                        tVar3 = this.f7516h;
                                        i15 = 24;
                                    }
                                    tVar3.m(i15);
                                }
                            } else {
                                i13 = 7;
                                char c12 = 160;
                                if (g13 <= 127) {
                                    if (g13 == 32) {
                                        c12 = ' ';
                                        c0116b3 = this.f7520l;
                                    } else if (g13 == 33) {
                                        c0116b3 = this.f7520l;
                                    } else if (g13 == 37) {
                                        c0116b3 = this.f7520l;
                                        c12 = 8230;
                                    } else if (g13 == 42) {
                                        c0116b3 = this.f7520l;
                                        c12 = 352;
                                    } else if (g13 == 44) {
                                        c0116b3 = this.f7520l;
                                        c12 = 338;
                                    } else if (g13 == 63) {
                                        c0116b3 = this.f7520l;
                                        c12 = 376;
                                    } else if (g13 == 57) {
                                        c0116b3 = this.f7520l;
                                        c12 = 8482;
                                    } else if (g13 == 58) {
                                        c0116b3 = this.f7520l;
                                        c12 = 353;
                                    } else if (g13 == 60) {
                                        c0116b3 = this.f7520l;
                                        c12 = 339;
                                    } else if (g13 != 61) {
                                        switch (g13) {
                                            case 48:
                                                c0116b3 = this.f7520l;
                                                c12 = 9608;
                                                break;
                                            case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                                                c0116b3 = this.f7520l;
                                                c12 = 8216;
                                                break;
                                            case R.styleable.AppCompatTheme_colorAccent /* 50 */:
                                                c0116b3 = this.f7520l;
                                                c12 = 8217;
                                                break;
                                            case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                                                c0116b3 = this.f7520l;
                                                c12 = 8220;
                                                break;
                                            case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                                                c0116b3 = this.f7520l;
                                                c12 = 8221;
                                                break;
                                            case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                                                c0116b3 = this.f7520l;
                                                c12 = 8226;
                                                break;
                                            default:
                                                switch (g13) {
                                                    case R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 8539;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowActionModeOverlay /* 119 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 8540;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMajor /* 120 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 8541;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedHeightMinor /* 121 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 8542;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9474;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowFixedWidthMinor /* 123 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9488;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowMinWidthMajor /* 124 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9492;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowMinWidthMinor /* 125 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9472;
                                                        break;
                                                    case R.styleable.AppCompatTheme_windowNoTitle /* 126 */:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9496;
                                                        break;
                                                    case 127:
                                                        c0116b3 = this.f7520l;
                                                        c12 = 9484;
                                                        break;
                                                    default:
                                                        f.p("Invalid G2 character: ", g13, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                        z11 = true;
                                    } else {
                                        c0116b3 = this.f7520l;
                                        c12 = 8480;
                                    }
                                    c0116b3.a(c12);
                                    z11 = true;
                                } else {
                                    int i17 = 32;
                                    if (g13 <= 159) {
                                        if (g13 <= 135) {
                                            tVar4 = this.f7516h;
                                        } else if (g13 <= 143) {
                                            tVar4 = this.f7516h;
                                            i17 = 40;
                                        } else if (g13 <= 159) {
                                            i11 = 2;
                                            this.f7516h.m(2);
                                            i14 = 6;
                                            this.f7516h.m(this.f7516h.g(6) * 8);
                                        }
                                        tVar4.m(i17);
                                    } else {
                                        if (g13 <= 255) {
                                            if (g13 == 160) {
                                                c0116b4 = this.f7520l;
                                                c11 = 13252;
                                            } else {
                                                f.p("Invalid G3 character: ", g13, "Cea708Decoder");
                                                c0116b4 = this.f7520l;
                                                c11 = '_';
                                            }
                                            c0116b4.a(c11);
                                            z11 = true;
                                        } else {
                                            f.p("Invalid extended command: ", g13, "Cea708Decoder");
                                        }
                                        i11 = 2;
                                        i14 = 6;
                                    }
                                }
                                i10 = 7;
                            }
                            i11 = 2;
                            i14 = 6;
                            i13 = i10;
                        } else if (g12 <= 31) {
                            if (g12 != 0) {
                                if (g12 == i12) {
                                    this.f7521m = j();
                                } else if (g12 != 8) {
                                    switch (g12) {
                                        case 12:
                                            k();
                                            break;
                                        case 13:
                                            this.f7520l.a('\n');
                                            break;
                                        case 14:
                                            break;
                                        default:
                                            if (g12 >= 17 && g12 <= 23) {
                                                f.p("Currently unsupported COMMAND_EXT1 Command: ", g12, "Cea708Decoder");
                                                tVar = this.f7516h;
                                            } else if (g12 < 24 || g12 > 31) {
                                                f.p("Invalid C0 command: ", g12, "Cea708Decoder");
                                                break;
                                            } else {
                                                f.p("Currently unsupported COMMAND_P16 Command: ", g12, "Cea708Decoder");
                                                tVar = this.f7516h;
                                                i15 = 16;
                                            }
                                            tVar.m(i15);
                                            break;
                                    }
                                } else {
                                    C0116b c0116b5 = this.f7520l;
                                    int length = c0116b5.f7533b.length();
                                    if (length > 0) {
                                        c0116b5.f7533b.delete(length - 1, length);
                                    }
                                }
                            }
                        } else if (g12 <= 127) {
                            if (g12 == 127) {
                                c0116b = this.f7520l;
                                c10 = 9835;
                            } else {
                                c0116b = this.f7520l;
                                c10 = (char) (g12 & 255);
                            }
                            c0116b.a(c10);
                            z11 = true;
                        } else {
                            if (g12 <= 159) {
                                switch (g12) {
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                        z11 = true;
                                        int i18 = g12 - 128;
                                        if (this.f7524p != i18) {
                                            this.f7524p = i18;
                                            C0116b c0116b6 = this.f7519k[i18];
                                            z10 = true;
                                            c0116b2 = c0116b6;
                                            this.f7520l = c0116b2;
                                            z11 = z10;
                                            break;
                                        }
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 136 */:
                                        z11 = true;
                                        for (int i19 = 1; i19 <= 8; i19++) {
                                            if (this.f7516h.f()) {
                                                C0116b c0116b7 = this.f7519k[8 - i19];
                                                c0116b7.f7532a.clear();
                                                c0116b7.f7533b.clear();
                                                c0116b7.f7546p = -1;
                                                c0116b7.f7547q = -1;
                                                c0116b7.f7548r = -1;
                                                c0116b7.t = -1;
                                                c0116b7.f7551v = 0;
                                            }
                                        }
                                        break;
                                    case 137:
                                        for (int i20 = 1; i20 <= 8; i20++) {
                                            if (this.f7516h.f()) {
                                                this.f7519k[8 - i20].f7535d = true;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 138:
                                        for (int i21 = 1; i21 <= 8; i21++) {
                                            if (this.f7516h.f()) {
                                                this.f7519k[8 - i21].f7535d = false;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 139:
                                        for (int i22 = 1; i22 <= 8; i22++) {
                                            if (this.f7516h.f()) {
                                                this.f7519k[8 - i22].f7535d = !r2.f7535d;
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 140:
                                        for (int i23 = 1; i23 <= 8; i23++) {
                                            if (this.f7516h.f()) {
                                                this.f7519k[8 - i23].d();
                                            }
                                        }
                                        z11 = true;
                                        break;
                                    case 141:
                                        this.f7516h.m(8);
                                        z11 = true;
                                        break;
                                    case 142:
                                        z11 = true;
                                        break;
                                    case 143:
                                        k();
                                        z11 = true;
                                        break;
                                    case 144:
                                        if (this.f7520l.f7534c) {
                                            this.f7516h.g(4);
                                            this.f7516h.g(2);
                                            this.f7516h.g(2);
                                            boolean f = this.f7516h.f();
                                            boolean f10 = this.f7516h.f();
                                            i12 = 3;
                                            this.f7516h.g(3);
                                            this.f7516h.g(3);
                                            this.f7520l.e(f, f10);
                                            z11 = true;
                                            break;
                                        }
                                        tVar2 = this.f7516h;
                                        i16 = 16;
                                        tVar2.m(i16);
                                        i12 = 3;
                                        z11 = true;
                                    case 145:
                                        if (!this.f7520l.f7534c) {
                                            tVar2 = this.f7516h;
                                            tVar2.m(i16);
                                            i12 = 3;
                                            z11 = true;
                                            break;
                                        } else {
                                            int c13 = C0116b.c(this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2));
                                            int c14 = C0116b.c(this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2));
                                            this.f7516h.m(2);
                                            C0116b.c(this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2), 0);
                                            this.f7520l.f(c13, c14);
                                            i12 = 3;
                                            z11 = true;
                                        }
                                    case 146:
                                        if (this.f7520l.f7534c) {
                                            this.f7516h.m(4);
                                            int g14 = this.f7516h.g(4);
                                            this.f7516h.m(2);
                                            this.f7516h.g(6);
                                            C0116b c0116b8 = this.f7520l;
                                            if (c0116b8.f7551v != g14) {
                                                c0116b8.a('\n');
                                            }
                                            c0116b8.f7551v = g14;
                                            i12 = 3;
                                            z11 = true;
                                            break;
                                        }
                                        tVar2 = this.f7516h;
                                        i16 = 16;
                                        tVar2.m(i16);
                                        i12 = 3;
                                        z11 = true;
                                    case 147:
                                    case 148:
                                    case 149:
                                    case 150:
                                    default:
                                        z11 = true;
                                        f.p("Invalid C1 command: ", g12, "Cea708Decoder");
                                        break;
                                    case 151:
                                        if (!this.f7520l.f7534c) {
                                            tVar2 = this.f7516h;
                                            i16 = 32;
                                            tVar2.m(i16);
                                            i12 = 3;
                                            z11 = true;
                                            break;
                                        } else {
                                            int c15 = C0116b.c(this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2));
                                            this.f7516h.g(2);
                                            C0116b.c(this.f7516h.g(2), this.f7516h.g(2), this.f7516h.g(2), 0);
                                            this.f7516h.f();
                                            this.f7516h.f();
                                            this.f7516h.g(2);
                                            this.f7516h.g(2);
                                            int g15 = this.f7516h.g(2);
                                            this.f7516h.m(8);
                                            C0116b c0116b9 = this.f7520l;
                                            c0116b9.f7545o = c15;
                                            c0116b9.f7542l = g15;
                                            i12 = 3;
                                            z11 = true;
                                        }
                                    case 152:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 159:
                                        int i24 = g12 - 152;
                                        C0116b c0116b10 = this.f7519k[i24];
                                        this.f7516h.m(i11);
                                        boolean f11 = this.f7516h.f();
                                        boolean f12 = this.f7516h.f();
                                        this.f7516h.f();
                                        int g16 = this.f7516h.g(i12);
                                        boolean f13 = this.f7516h.f();
                                        int g17 = this.f7516h.g(i13);
                                        int g18 = this.f7516h.g(8);
                                        int g19 = this.f7516h.g(4);
                                        int g20 = this.f7516h.g(4);
                                        this.f7516h.m(i11);
                                        this.f7516h.g(i14);
                                        this.f7516h.m(i11);
                                        int g21 = this.f7516h.g(3);
                                        int g22 = this.f7516h.g(3);
                                        c0116b10.f7534c = true;
                                        c0116b10.f7535d = f11;
                                        c0116b10.f7541k = f12;
                                        c0116b10.f7536e = g16;
                                        c0116b10.f = f13;
                                        c0116b10.f7537g = g17;
                                        c0116b10.f7538h = g18;
                                        c0116b10.f7539i = g19;
                                        int i25 = g20 + 1;
                                        if (c0116b10.f7540j != i25) {
                                            c0116b10.f7540j = i25;
                                            while (true) {
                                                if ((f12 && c0116b10.f7532a.size() >= c0116b10.f7540j) || c0116b10.f7532a.size() >= 15) {
                                                    c0116b10.f7532a.remove(0);
                                                }
                                            }
                                        }
                                        if (g21 != 0 && c0116b10.f7543m != g21) {
                                            c0116b10.f7543m = g21;
                                            int i26 = g21 - 1;
                                            int i27 = C0116b.C[i26];
                                            boolean z12 = C0116b.B[i26];
                                            int i28 = C0116b.f7531z[i26];
                                            int i29 = C0116b.A[i26];
                                            int i30 = C0116b.f7530y[i26];
                                            c0116b10.f7545o = i27;
                                            c0116b10.f7542l = i30;
                                        }
                                        if (g22 != 0 && c0116b10.f7544n != g22) {
                                            c0116b10.f7544n = g22;
                                            int i31 = g22 - 1;
                                            int i32 = C0116b.E[i31];
                                            int i33 = C0116b.D[i31];
                                            c0116b10.e(false, false);
                                            c0116b10.f(C0116b.f7528w, C0116b.F[i31]);
                                        }
                                        if (this.f7524p != i24) {
                                            this.f7524p = i24;
                                            c0116b2 = this.f7519k[i24];
                                            z10 = true;
                                            i12 = 3;
                                            this.f7520l = c0116b2;
                                            z11 = z10;
                                            break;
                                        }
                                        i12 = 3;
                                        z11 = true;
                                        break;
                                }
                            } else if (g12 <= 255) {
                                this.f7520l.a((char) (g12 & 255));
                                z11 = true;
                            } else {
                                f.p("Invalid base command: ", g12, "Cea708Decoder");
                            }
                            i10 = 7;
                            i11 = 2;
                            i14 = 6;
                            i13 = i10;
                        }
                    }
                }
            }
        }
        if (z11) {
            this.f7521m = j();
        }
        this.f7523o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<h5.a> j() {
        /*
            Method dump skipped, instructions count: 305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.b.j():java.util.List");
    }

    public final void k() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f7519k[i10].d();
        }
    }
}
