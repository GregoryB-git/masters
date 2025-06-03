package p5;

import a0.j;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import h5.a;
import h5.f;
import h5.g;
import h5.i;
import java.nio.charset.Charset;
import java.util.List;
import n7.d;
import v5.e0;
import v5.m;
import v5.u;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final u f13006m = new u();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f13007n;

    /* renamed from: o, reason: collision with root package name */
    public final int f13008o;

    /* renamed from: p, reason: collision with root package name */
    public final int f13009p;

    /* renamed from: q, reason: collision with root package name */
    public final String f13010q;

    /* renamed from: r, reason: collision with root package name */
    public final float f13011r;

    /* renamed from: s, reason: collision with root package name */
    public final int f13012s;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f13008o = 0;
            this.f13009p = -1;
            this.f13010q = "sans-serif";
            this.f13007n = false;
            this.f13011r = 0.85f;
            this.f13012s = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f13008o = bArr[24];
        this.f13009p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        int length = bArr.length - 43;
        int i10 = e0.f15881a;
        this.f13010q = "Serif".equals(new String(bArr, 43, length, d.f11284c)) ? "serif" : "sans-serif";
        int i11 = bArr[25] * 20;
        this.f13012s = i11;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f13007n = z10;
        if (z10) {
            this.f13011r = e0.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, 0.0f, 0.95f);
        } else {
            this.f13011r = 0.85f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.a.i(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    @Override // h5.f
    public final g h(byte[] bArr, int i10, boolean z10) {
        String t;
        int i11;
        this.f13006m.E(bArr, i10);
        u uVar = this.f13006m;
        int i12 = 0;
        int i13 = 1;
        int i14 = 2;
        if (!(uVar.f15976c - uVar.f15975b >= 2)) {
            throw new i("Unexpected subtitle format.");
        }
        int A = uVar.A();
        if (A == 0) {
            t = "";
        } else {
            int i15 = uVar.f15975b;
            Charset C = uVar.C();
            int i16 = A - (uVar.f15975b - i15);
            if (C == null) {
                C = d.f11284c;
            }
            t = uVar.t(i16, C);
        }
        if (t.isEmpty()) {
            return b.f13013b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(t);
        i(spannableStringBuilder, this.f13008o, 0, 0, spannableStringBuilder.length(), 16711680);
        int i17 = this.f13009p;
        int length = spannableStringBuilder.length();
        int i18 = 8;
        if (i17 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i17 >>> 8) | ((i17 & 255) << 24)), 0, length, 16711713);
        }
        String str = this.f13010q;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float f = this.f13011r;
        while (true) {
            u uVar2 = this.f13006m;
            int i19 = uVar2.f15976c;
            int i20 = uVar2.f15975b;
            if (i19 - i20 < i18) {
                a.C0105a c0105a = new a.C0105a();
                c0105a.f7110a = spannableStringBuilder;
                c0105a.f7114e = f;
                c0105a.f = 0;
                c0105a.f7115g = 0;
                return new b(c0105a.a());
            }
            int f10 = uVar2.f();
            int f11 = this.f13006m.f();
            if (f11 == 1937013100) {
                u uVar3 = this.f13006m;
                if ((uVar3.f15976c - uVar3.f15975b >= i14 ? i13 : i12) == 0) {
                    throw new i("Unexpected subtitle format.");
                }
                int A2 = uVar3.A();
                int i21 = i14;
                int i22 = i13;
                int i23 = i12;
                while (i12 < A2) {
                    u uVar4 = this.f13006m;
                    if (uVar4.f15976c - uVar4.f15975b >= 12) {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                        throw new i("Unexpected subtitle format.");
                    }
                    int A3 = uVar4.A();
                    int A4 = uVar4.A();
                    uVar4.H(i21);
                    int v10 = uVar4.v();
                    uVar4.H(i22);
                    int f12 = uVar4.f();
                    if (A4 > spannableStringBuilder.length()) {
                        StringBuilder n2 = j.n("Truncating styl end (", A4, ") to cueText.length() (");
                        n2.append(spannableStringBuilder.length());
                        n2.append(").");
                        m.f("Tx3gDecoder", n2.toString());
                        A4 = spannableStringBuilder.length();
                    }
                    int i24 = A4;
                    if (A3 >= i24) {
                        m.f("Tx3gDecoder", "Ignoring styl with start (" + A3 + ") >= end (" + i24 + ").");
                        i11 = A2;
                    } else {
                        i11 = A2;
                        i(spannableStringBuilder, v10, this.f13008o, A3, i24, 0);
                        if (f12 != this.f13009p) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan((f12 >>> 8) | ((f12 & 255) << 24)), A3, i24, 33);
                        }
                    }
                    i12++;
                    i23 = 0;
                    i22 = 1;
                    i21 = 2;
                    A2 = i11;
                }
                i14 = i21;
            } else if (f11 == 1952608120 && this.f13007n) {
                u uVar5 = this.f13006m;
                if (!(uVar5.f15976c - uVar5.f15975b >= 2)) {
                    throw new i("Unexpected subtitle format.");
                }
                f = e0.h(uVar5.A() / this.f13012s, 0.0f, 0.95f);
                i14 = 2;
            } else {
                i14 = 2;
            }
            this.f13006m.G(i20 + f10);
            i12 = 0;
            i13 = 1;
            i18 = 8;
        }
    }
}
