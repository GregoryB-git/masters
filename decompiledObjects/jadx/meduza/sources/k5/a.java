package k5;

import android.graphics.Bitmap;
import h5.a;
import h5.f;
import h5.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: m, reason: collision with root package name */
    public final u f9080m = new u();

    /* renamed from: n, reason: collision with root package name */
    public final u f9081n = new u();

    /* renamed from: o, reason: collision with root package name */
    public final C0129a f9082o = new C0129a();

    /* renamed from: p, reason: collision with root package name */
    public Inflater f9083p;

    /* renamed from: k5.a$a, reason: collision with other inner class name */
    public static final class C0129a {

        /* renamed from: a, reason: collision with root package name */
        public final u f9084a = new u();

        /* renamed from: b, reason: collision with root package name */
        public final int[] f9085b = new int[256];

        /* renamed from: c, reason: collision with root package name */
        public boolean f9086c;

        /* renamed from: d, reason: collision with root package name */
        public int f9087d;

        /* renamed from: e, reason: collision with root package name */
        public int f9088e;
        public int f;

        /* renamed from: g, reason: collision with root package name */
        public int f9089g;

        /* renamed from: h, reason: collision with root package name */
        public int f9090h;

        /* renamed from: i, reason: collision with root package name */
        public int f9091i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // h5.f
    public final g h(byte[] bArr, int i10, boolean z10) {
        u uVar;
        char c10;
        h5.a aVar;
        u uVar2;
        int i11;
        int i12;
        int x10;
        this.f9080m.E(bArr, i10);
        u uVar3 = this.f9080m;
        int i13 = uVar3.f15976c;
        int i14 = uVar3.f15975b;
        char c11 = 255;
        if (i13 - i14 > 0 && (uVar3.f15974a[i14] & 255) == 120) {
            if (this.f9083p == null) {
                this.f9083p = new Inflater();
            }
            if (e0.D(uVar3, this.f9081n, this.f9083p)) {
                u uVar4 = this.f9081n;
                uVar3.E(uVar4.f15974a, uVar4.f15976c);
            }
        }
        C0129a c0129a = this.f9082o;
        int i15 = 0;
        c0129a.f9087d = 0;
        c0129a.f9088e = 0;
        c0129a.f = 0;
        c0129a.f9089g = 0;
        c0129a.f9090h = 0;
        c0129a.f9091i = 0;
        c0129a.f9084a.D(0);
        c0129a.f9086c = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            u uVar5 = this.f9080m;
            int i16 = uVar5.f15976c;
            if (i16 - uVar5.f15975b < 3) {
                return new b(Collections.unmodifiableList(arrayList));
            }
            C0129a c0129a2 = this.f9082o;
            int v10 = uVar5.v();
            int A = uVar5.A();
            int i17 = uVar5.f15975b + A;
            if (i17 > i16) {
                uVar5.G(i16);
                c10 = c11;
                aVar = null;
            } else {
                if (v10 != 128) {
                    switch (v10) {
                        case 20:
                            c0129a2.getClass();
                            if (A % 5 == 2) {
                                uVar5.H(2);
                                Arrays.fill(c0129a2.f9085b, i15);
                                int i18 = A / 5;
                                for (int i19 = i15; i19 < i18; i19++) {
                                    int v11 = uVar5.v();
                                    int v12 = uVar5.v();
                                    int v13 = uVar5.v();
                                    double d10 = v12;
                                    double d11 = v13 - 128;
                                    int i20 = (int) ((1.402d * d11) + d10);
                                    double v14 = uVar5.v() - 128;
                                    c0129a2.f9085b[v11] = (e0.i((int) ((d10 - (0.34414d * v14)) - (d11 * 0.71414d)), 0, 255) << 8) | (e0.i(i20, 0, 255) << 16) | (uVar5.v() << 24) | e0.i((int) ((v14 * 1.772d) + d10), 0, 255);
                                    c11 = 255;
                                    uVar5 = uVar5;
                                }
                                uVar = uVar5;
                                c10 = c11;
                                c0129a2.f9086c = true;
                                break;
                            }
                            uVar = uVar5;
                            c10 = c11;
                            break;
                        case 21:
                            c0129a2.getClass();
                            if (A >= 4) {
                                uVar5.H(3);
                                int i21 = A - 4;
                                if (((128 & uVar5.v()) != 0 ? 1 : i15) != 0) {
                                    if (i21 >= 7 && (x10 = uVar5.x()) >= 4) {
                                        c0129a2.f9090h = uVar5.A();
                                        c0129a2.f9091i = uVar5.A();
                                        c0129a2.f9084a.D(x10 - 4);
                                        i21 -= 7;
                                    }
                                }
                                u uVar6 = c0129a2.f9084a;
                                int i22 = uVar6.f15975b;
                                int i23 = uVar6.f15976c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    uVar5.d(c0129a2.f9084a.f15974a, i22, min);
                                    c0129a2.f9084a.G(i22 + min);
                                }
                            }
                            uVar = uVar5;
                            c10 = c11;
                            break;
                        case 22:
                            c0129a2.getClass();
                            if (A >= 19) {
                                c0129a2.f9087d = uVar5.A();
                                c0129a2.f9088e = uVar5.A();
                                uVar5.H(11);
                                c0129a2.f = uVar5.A();
                                c0129a2.f9089g = uVar5.A();
                            }
                            uVar = uVar5;
                            c10 = c11;
                            break;
                        default:
                            uVar = uVar5;
                            c10 = c11;
                            break;
                    }
                    i15 = 0;
                    aVar = null;
                } else {
                    uVar = uVar5;
                    c10 = c11;
                    if (c0129a2.f9087d == 0 || c0129a2.f9088e == 0 || c0129a2.f9090h == 0 || c0129a2.f9091i == 0 || (i11 = (uVar2 = c0129a2.f9084a).f15976c) == 0 || uVar2.f15975b != i11 || !c0129a2.f9086c) {
                        aVar = null;
                    } else {
                        uVar2.G(0);
                        int i24 = c0129a2.f9090h * c0129a2.f9091i;
                        int[] iArr = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int v15 = c0129a2.f9084a.v();
                            if (v15 != 0) {
                                i12 = i25 + 1;
                                iArr[i25] = c0129a2.f9085b[v15];
                            } else {
                                int v16 = c0129a2.f9084a.v();
                                if (v16 != 0) {
                                    i12 = ((v16 & 64) == 0 ? v16 & 63 : ((v16 & 63) << 8) | c0129a2.f9084a.v()) + i25;
                                    Arrays.fill(iArr, i25, i12, (v16 & 128) == 0 ? 0 : c0129a2.f9085b[c0129a2.f9084a.v()]);
                                }
                            }
                            i25 = i12;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, c0129a2.f9090h, c0129a2.f9091i, Bitmap.Config.ARGB_8888);
                        a.C0105a c0105a = new a.C0105a();
                        c0105a.f7111b = createBitmap;
                        float f = c0129a2.f;
                        float f10 = c0129a2.f9087d;
                        c0105a.f7116h = f / f10;
                        c0105a.f7117i = 0;
                        float f11 = c0129a2.f9089g;
                        float f12 = c0129a2.f9088e;
                        c0105a.f7114e = f11 / f12;
                        c0105a.f = 0;
                        c0105a.f7115g = 0;
                        c0105a.f7120l = c0129a2.f9090h / f10;
                        c0105a.f7121m = c0129a2.f9091i / f12;
                        aVar = c0105a.a();
                    }
                    i15 = 0;
                    c0129a2.f9087d = 0;
                    c0129a2.f9088e = 0;
                    c0129a2.f = 0;
                    c0129a2.f9089g = 0;
                    c0129a2.f9090h = 0;
                    c0129a2.f9091i = 0;
                    c0129a2.f9084a.D(0);
                    c0129a2.f9086c = false;
                }
                uVar.G(i17);
            }
            if (aVar != null) {
                arrayList.add(aVar);
            }
            c11 = c10;
        }
    }
}
