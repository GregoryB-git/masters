package k4;

import b.a0;
import c4.t;
import c4.v;
import c4.w;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k4.a;
import v5.e0;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class g implements c4.h, t {

    /* renamed from: a, reason: collision with root package name */
    public final int f9005a;

    /* renamed from: b, reason: collision with root package name */
    public final u f9006b;

    /* renamed from: c, reason: collision with root package name */
    public final u f9007c;

    /* renamed from: d, reason: collision with root package name */
    public final u f9008d;

    /* renamed from: e, reason: collision with root package name */
    public final u f9009e;
    public final ArrayDeque<a.C0127a> f;

    /* renamed from: g, reason: collision with root package name */
    public final i f9010g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9011h;

    /* renamed from: i, reason: collision with root package name */
    public int f9012i;

    /* renamed from: j, reason: collision with root package name */
    public int f9013j;

    /* renamed from: k, reason: collision with root package name */
    public long f9014k;

    /* renamed from: l, reason: collision with root package name */
    public int f9015l;

    /* renamed from: m, reason: collision with root package name */
    public u f9016m;

    /* renamed from: n, reason: collision with root package name */
    public int f9017n;

    /* renamed from: o, reason: collision with root package name */
    public int f9018o;

    /* renamed from: p, reason: collision with root package name */
    public int f9019p;

    /* renamed from: q, reason: collision with root package name */
    public int f9020q;

    /* renamed from: r, reason: collision with root package name */
    public c4.j f9021r;

    /* renamed from: s, reason: collision with root package name */
    public a[] f9022s;
    public long[][] t;

    /* renamed from: u, reason: collision with root package name */
    public int f9023u;

    /* renamed from: v, reason: collision with root package name */
    public long f9024v;

    /* renamed from: w, reason: collision with root package name */
    public int f9025w;

    /* renamed from: x, reason: collision with root package name */
    public v4.b f9026x;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final j f9027a;

        /* renamed from: b, reason: collision with root package name */
        public final m f9028b;

        /* renamed from: c, reason: collision with root package name */
        public final v f9029c;

        /* renamed from: d, reason: collision with root package name */
        public final w f9030d;

        /* renamed from: e, reason: collision with root package name */
        public int f9031e;

        public a(j jVar, m mVar, v vVar) {
            this.f9027a = jVar;
            this.f9028b = mVar;
            this.f9029c = vVar;
            this.f9030d = "audio/true-hd".equals(jVar.f.t) ? new w() : null;
        }
    }

    public g() {
        this(0);
    }

    public g(int i10) {
        this.f9005a = 0;
        this.f9012i = 0;
        this.f9010g = new i();
        this.f9011h = new ArrayList();
        this.f9009e = new u(16);
        this.f = new ArrayDeque<>();
        this.f9006b = new u(q.f15932a);
        this.f9007c = new u(4);
        this.f9008d = new u();
        this.f9017n = -1;
        this.f9021r = c4.j.f2288i;
        this.f9022s = new a[0];
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f9021r = jVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0677 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x046d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0675 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0532  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r34, c4.s r35) {
        /*
            Method dump skipped, instructions count: 1684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g.d(c4.i, c4.s):int");
    }

    @Override // c4.t
    public final boolean e() {
        return true;
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f.clear();
        this.f9015l = 0;
        this.f9017n = -1;
        this.f9018o = 0;
        this.f9019p = 0;
        this.f9020q = 0;
        if (j10 == 0) {
            if (this.f9012i != 3) {
                this.f9012i = 0;
                this.f9015l = 0;
                return;
            } else {
                i iVar = this.f9010g;
                iVar.f9037a.clear();
                iVar.f9038b = 0;
                this.f9011h.clear();
                return;
            }
        }
        for (a aVar : this.f9022s) {
            m mVar = aVar.f9028b;
            int f = e0.f(mVar.f, j11, false);
            while (true) {
                if (f < 0) {
                    f = -1;
                    break;
                } else if ((mVar.f9078g[f] & 1) != 0) {
                    break;
                } else {
                    f--;
                }
            }
            if (f == -1) {
                f = mVar.a(j11);
            }
            aVar.f9031e = f;
            w wVar = aVar.f9030d;
            if (wVar != null) {
                wVar.f2326b = false;
                wVar.f2327c = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db A[EDGE_INSN: B:64:0x00db->B:65:0x00db BREAK  A[LOOP:1: B:28:0x0076->B:56:0x00d6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    @Override // c4.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c4.t.a g(long r17) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g.g(long):c4.t$a");
    }

    @Override // c4.t
    public final long h() {
        return this.f9024v;
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        return a0.L(iVar, false, (this.f9005a & 2) != 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01c0, code lost:
    
        r0 = "TSOC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c6, code lost:
    
        if (r6 != 1920233063) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c8, code lost:
    
        r0 = "ITUNESADVISORY";
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d3, code lost:
    
        if (r6 != 1885823344) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d5, code lost:
    
        r0 = k4.f.d(r6, "ITUNESGAPLESS", r3, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e5, code lost:
    
        if (r6 != 1936683886) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e7, code lost:
    
        r0 = "TVSHOWSORT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01ed, code lost:
    
        if (r6 != 1953919848) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01ef, code lost:
    
        r0 = "TVSHOW";
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01f8, code lost:
    
        if (r6 != 757935405) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01fa, code lost:
    
        r9 = -1;
        r6 = -1;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01ff, code lost:
    
        r11 = r3.f15975b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0201, code lost:
    
        if (r11 >= r7) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0203, code lost:
    
        r15 = r3.f();
        r11 = r3.f();
        r19 = r8;
        r3.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0216, code lost:
    
        if (r11 != 1835360622) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0218, code lost:
    
        r0 = r3.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0238, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0222, code lost:
    
        if (r11 != 1851878757) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0224, code lost:
    
        r5 = r3.q(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x022e, code lost:
    
        if (r11 != 1684108385) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0230, code lost:
    
        r9 = r15;
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0233, code lost:
    
        r3.H(r15 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x023b, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x023d, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x023f, code lost:
    
        if (r5 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0242, code lost:
    
        if (r6 != (-1)) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0245, code lost:
    
        r3.G(r6);
        r3.H(16);
        r5 = new u4.i(r0, r5, r3.q(r9 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x025b, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x025c, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x025f, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02cb, code lost:
    
        v5.m.b("MetadataUtil", "Skipped unknown metadata entry: " + k4.a.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00c2, code lost:
    
        r6 = k4.f.e(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00c6, code lost:
    
        if (r6 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c8, code lost:
    
        r9 = k4.f.f9004a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00cc, code lost:
    
        if (r6 > 192) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00ce, code lost:
    
        r6 = r9[r6 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00d4, code lost:
    
        if (r6 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x00d6, code lost:
    
        r5 = new u4.l("TCON", null, o7.t.t(r6));
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e4, code lost:
    
        v5.m.f("MetadataUtil", "Failed to parse standard genre code");
        r17 = r0;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00d3, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0277, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02fe, code lost:
    
        r3.G(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0301, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0263, code lost:
    
        r17 = r0;
        r19 = r8;
        r0 = null;
        r8 = 16777215 & r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x026f, code lost:
    
        if (r8 != 6516084) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0271, code lost:
    
        r5 = k4.f.a(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x027d, code lost:
    
        if (r8 == 7233901) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0282, code lost:
    
        if (r8 != 7631467) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0289, code lost:
    
        if (r8 == 6516589) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x028e, code lost:
    
        if (r8 != 7828084) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0294, code lost:
    
        if (r8 != 6578553) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0296, code lost:
    
        r0 = "TDRC";
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x029c, code lost:
    
        if (r8 != 4280916) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x029e, code lost:
    
        r0 = "TPE1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02a4, code lost:
    
        if (r8 != 7630703) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02a6, code lost:
    
        r0 = "TSSE";
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02ac, code lost:
    
        if (r8 != 6384738) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x02ae, code lost:
    
        r0 = "TALB";
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02b4, code lost:
    
        if (r8 != 7108978) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02b6, code lost:
    
        r0 = "USLT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02bc, code lost:
    
        if (r8 != 6776174) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x02be, code lost:
    
        r5 = k4.f.c(r6, r3, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x02c6, code lost:
    
        if (r8 != 6779504) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02c8, code lost:
    
        r0 = "TIT1";
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02e5, code lost:
    
        r0 = "TCOM";
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x02e8, code lost:
    
        r0 = "TIT2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0302, code lost:
    
        r17 = r0;
        r19 = r8;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x030b, code lost:
    
        if (r4.isEmpty() == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x030e, code lost:
    
        r0 = new p4.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        r3.G(r5);
        r5 = r5 + r7;
        r3.H(r9);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r6 = r3.f15975b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
    
        if (r6 >= r5) goto L372;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        r7 = r3.f() + r6;
        r6 = r3.f();
        r9 = (r6 >> 24) & 255;
        r16 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b5, code lost:
    
        if (r9 == 169) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
    
        if (r9 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
    
        if (r6 != 1735291493) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f2, code lost:
    
        if (r6 != 1684632427) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f4, code lost:
    
        r9 = "TPOS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        r11 = r3.f();
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010b, code lost:
    
        if (r3.f() != 1684108385) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010f, code lost:
    
        if (r11 < 22) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0111, code lost:
    
        r3.H(10);
        r0 = r3.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011a, code lost:
    
        if (r0 <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011c, code lost:
    
        r0 = "" + r0;
        r5 = r3.A();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0131, code lost:
    
        if (r5 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0133, code lost:
    
        r0 = r0 + io.flutter.embedding.android.FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0147, code lost:
    
        r5 = new u4.l(r9, null, o7.t.t(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01de, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x02f1, code lost:
    
        if (r5 == null) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x02f3, code lost:
    
        r4.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02f6, code lost:
    
        r5 = r16;
        r0 = r17;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0153, code lost:
    
        r0 = null;
        v5.m.f("MetadataUtil", "Failed to parse index/count attribute: " + k4.a.a(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016c, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00fa, code lost:
    
        if (r6 != 1953655662) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fc, code lost:
    
        r9 = "TRCK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016f, code lost:
    
        r17 = r0;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0175, code lost:
    
        if (r6 != 1953329263) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
    
        r0 = k4.f.d(r6, "TBPM", r3, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0183, code lost:
    
        if (r6 != 1668311404) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0185, code lost:
    
        r0 = "TCMP";
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01cb, code lost:
    
        r0 = k4.f.d(r6, r0, r3, r5, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        if (r6 != 1668249202) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018e, code lost:
    
        r5 = k4.f.b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0196, code lost:
    
        if (r6 != 1631670868) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
    
        r0 = "TPE2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01f1, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ea, code lost:
    
        r5 = k4.f.c(r6, r3, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x019e, code lost:
    
        if (r6 != 1936682605) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        r0 = "TSOT";
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a6, code lost:
    
        if (r6 != 1936679276) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a8, code lost:
    
        r0 = "TSO2";
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01ae, code lost:
    
        if (r6 != 1936679282) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b0, code lost:
    
        r0 = "TSOA";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b6, code lost:
    
        if (r6 != 1936679265) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b8, code lost:
    
        r0 = "TSOP";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01be, code lost:
    
        if (r6 != 1936679791) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x064b A[LOOP:12: B:358:0x0648->B:360:0x064b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x04a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(long r26) {
        /*
            Method dump skipped, instructions count: 1755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.g.j(long):void");
    }

    @Override // c4.h
    public final void release() {
    }
}
