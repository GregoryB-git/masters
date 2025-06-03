package j1;

import W2.e;
import X2.AbstractC0703v;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.InterfaceC1303g;
import g0.M;
import g0.o;
import g0.z;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final z f15426a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15427b;

    /* renamed from: c, reason: collision with root package name */
    public final int f15428c;

    /* renamed from: d, reason: collision with root package name */
    public final int f15429d;

    /* renamed from: e, reason: collision with root package name */
    public final String f15430e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15431f;

    /* renamed from: g, reason: collision with root package name */
    public final int f15432g;

    public C1369a(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f15428c = 0;
            this.f15429d = -1;
            this.f15430e = "sans-serif";
            this.f15427b = false;
            this.f15431f = 0.85f;
            this.f15432g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f15428c = bArr[24];
        this.f15429d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f15430e = "Serif".equals(M.I(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i7 = bArr[25] * 20;
        this.f15432g = i7;
        boolean z7 = (bArr[0] & 32) != 0;
        this.f15427b = z7;
        if (z7) {
            this.f15431f = M.o(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i7, 0.0f, 0.95f);
        } else {
            this.f15431f = 0.85f;
        }
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, int i7, int i8, int i9, int i10, int i11) {
        if (i7 != i8) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i7 >>> 8) | ((i7 & 255) << 24)), i9, i10, i11 | 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4d
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
            if (r10 == 0) goto L26
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L22
            r4 = 3
            r3.<init>(r4)
        L1e:
            r5.setSpan(r3, r8, r9, r7)
            goto L2f
        L22:
            r3.<init>(r1)
            goto L1e
        L26:
            if (r2 == 0) goto L2f
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
            goto L1e
        L2f:
            r6 = r6 & 4
            if (r6 == 0) goto L34
            goto L35
        L34:
            r1 = r0
        L35:
            if (r1 == 0) goto L3f
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3f:
            if (r1 != 0) goto L4d
            if (r10 != 0) goto L4d
            if (r2 != 0) goto L4d
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.C1369a.g(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, String str, int i7, int i8) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i7, i8, 16711713);
        }
    }

    public static String i(z zVar) {
        AbstractC1297a.a(zVar.a() >= 2);
        int M6 = zVar.M();
        if (M6 == 0) {
            return "";
        }
        int f7 = zVar.f();
        Charset O6 = zVar.O();
        int f8 = M6 - (zVar.f() - f7);
        if (O6 == null) {
            O6 = e.f6821c;
        }
        return zVar.E(f8, O6);
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public /* synthetic */ void b() {
        s.b(this);
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        this.f15426a.R(bArr, i7 + i8);
        this.f15426a.T(i7);
        String i9 = i(this.f15426a);
        if (i9.isEmpty()) {
            interfaceC1303g.accept(new C0816e(AbstractC0703v.Y(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i9);
        g(spannableStringBuilder, this.f15428c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder, this.f15429d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f15430e, 0, spannableStringBuilder.length());
        float f7 = this.f15431f;
        while (this.f15426a.a() >= 8) {
            int f8 = this.f15426a.f();
            int p7 = this.f15426a.p();
            int p8 = this.f15426a.p();
            if (p8 == 1937013100) {
                AbstractC1297a.a(this.f15426a.a() >= 2);
                int M6 = this.f15426a.M();
                for (int i10 = 0; i10 < M6; i10++) {
                    e(this.f15426a, spannableStringBuilder);
                }
            } else if (p8 == 1952608120 && this.f15427b) {
                AbstractC1297a.a(this.f15426a.a() >= 2);
                f7 = M.o(this.f15426a.M() / this.f15432g, 0.0f, 0.95f);
            }
            this.f15426a.T(f8 + p7);
        }
        interfaceC1303g.accept(new C0816e(AbstractC0703v.Z(new C1280a.b().o(spannableStringBuilder).h(f7, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // c1.t
    public int d() {
        return 2;
    }

    public final void e(z zVar, SpannableStringBuilder spannableStringBuilder) {
        AbstractC1297a.a(zVar.a() >= 12);
        int M6 = zVar.M();
        int M7 = zVar.M();
        zVar.U(2);
        int G6 = zVar.G();
        zVar.U(1);
        int p7 = zVar.p();
        if (M7 > spannableStringBuilder.length()) {
            o.h("Tx3gParser", "Truncating styl end (" + M7 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            M7 = spannableStringBuilder.length();
        }
        if (M6 < M7) {
            int i7 = M7;
            g(spannableStringBuilder, G6, this.f15428c, M6, i7, 0);
            f(spannableStringBuilder, p7, this.f15429d, M6, i7, 0);
            return;
        }
        o.h("Tx3gParser", "Ignoring styl with start (" + M6 + ") >= end (" + M7 + ").");
    }
}
