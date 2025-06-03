package j5;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import v5.e0;
import v5.t;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f8419h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f8420i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f8421j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f8422a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f8423b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f8424c;

    /* renamed from: d, reason: collision with root package name */
    public final C0124b f8425d;

    /* renamed from: e, reason: collision with root package name */
    public final a f8426e;
    public final h f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f8427g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f8428a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f8429b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f8430c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f8431d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f8428a = i10;
            this.f8429b = iArr;
            this.f8430c = iArr2;
            this.f8431d = iArr3;
        }
    }

    /* renamed from: j5.b$b, reason: collision with other inner class name */
    public static final class C0124b {

        /* renamed from: a, reason: collision with root package name */
        public final int f8432a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8433b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8434c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8435d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8436e;
        public final int f;

        public C0124b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f8432a = i10;
            this.f8433b = i11;
            this.f8434c = i12;
            this.f8435d = i13;
            this.f8436e = i14;
            this.f = i15;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f8437a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8438b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f8439c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f8440d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f8437a = i10;
            this.f8438b = z10;
            this.f8439c = bArr;
            this.f8440d = bArr2;
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f8441a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8442b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<e> f8443c;

        public d(int i10, int i11, SparseArray sparseArray) {
            this.f8441a = i10;
            this.f8442b = i11;
            this.f8443c = sparseArray;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f8444a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8445b;

        public e(int i10, int i11) {
            this.f8444a = i10;
            this.f8445b = i11;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f8446a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8447b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8448c;

        /* renamed from: d, reason: collision with root package name */
        public final int f8449d;

        /* renamed from: e, reason: collision with root package name */
        public final int f8450e;
        public final int f;

        /* renamed from: g, reason: collision with root package name */
        public final int f8451g;

        /* renamed from: h, reason: collision with root package name */
        public final int f8452h;

        /* renamed from: i, reason: collision with root package name */
        public final int f8453i;

        /* renamed from: j, reason: collision with root package name */
        public final SparseArray<g> f8454j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, SparseArray sparseArray) {
            this.f8446a = i10;
            this.f8447b = z10;
            this.f8448c = i11;
            this.f8449d = i12;
            this.f8450e = i13;
            this.f = i14;
            this.f8451g = i15;
            this.f8452h = i16;
            this.f8453i = i17;
            this.f8454j = sparseArray;
        }
    }

    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f8455a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8456b;

        public g(int i10, int i11) {
            this.f8455a = i10;
            this.f8456b = i11;
        }
    }

    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f8457a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8458b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray<f> f8459c = new SparseArray<>();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray<a> f8460d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray<c> f8461e = new SparseArray<>();
        public final SparseArray<a> f = new SparseArray<>();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray<c> f8462g = new SparseArray<>();

        /* renamed from: h, reason: collision with root package name */
        public C0124b f8463h;

        /* renamed from: i, reason: collision with root package name */
        public d f8464i;

        public h(int i10, int i11) {
            this.f8457a = i10;
            this.f8458b = i11;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f8422a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f8423b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f8424c = new Canvas();
        this.f8425d = new C0124b(719, 575, 0, 719, 0, 575);
        this.f8426e = new a(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f = new h(i10, i11);
    }

    public static int[] a() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = c(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i10] = c(255, (i10 & 1) != 0 ? 127 : 0, (i10 & 2) != 0 ? 127 : 0, (i10 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            if (i10 < 8) {
                iArr[i10] = c(63, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) == 0 ? 0 : 255);
            } else {
                int i11 = i10 & ModuleDescriptor.MODULE_VERSION;
                if (i11 == 0) {
                    iArr[i10] = c(255, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 8) {
                    iArr[i10] = c(127, ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0), ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0), ((i10 & 4) == 0 ? 0 : 85) + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i11 == 128) {
                    iArr[i10] = c(255, ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + 127 + ((i10 & 64) == 0 ? 0 : 85));
                } else if (i11 == 136) {
                    iArr[i10] = c(255, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int c(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012c A[LOOP:2: B:42:0x009f->B:53:0x012c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01dc A[LOOP:3: B:88:0x014f->B:98:0x01dc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.b.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a e(t tVar, int i10) {
        int i11;
        int g10;
        int i12;
        int i13;
        int i14 = 8;
        int g11 = tVar.g(8);
        tVar.m(8);
        int i15 = i10 - 2;
        int i16 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] a10 = a();
        int[] b10 = b();
        while (i15 > 0) {
            int g12 = tVar.g(i14);
            int g13 = tVar.g(i14);
            int i17 = i15 - 2;
            int[] iArr2 = (g13 & 128) != 0 ? iArr : (g13 & 64) != 0 ? a10 : b10;
            if ((g13 & 1) != 0) {
                i12 = tVar.g(i14);
                i11 = tVar.g(i14);
                i13 = tVar.g(i14);
                g10 = tVar.g(i14);
                i15 = i17 - 4;
            } else {
                int g14 = tVar.g(6) << 2;
                int g15 = tVar.g(i16) << i16;
                int g16 = tVar.g(i16) << i16;
                i15 = i17 - 2;
                i11 = g15;
                g10 = tVar.g(2) << 6;
                i12 = g14;
                i13 = g16;
            }
            if (i12 == 0) {
                g10 = 255;
                i11 = 0;
                i13 = 0;
            }
            double d10 = i12;
            double d11 = i11 - 128;
            double d12 = i13 - 128;
            iArr2[g12] = c((byte) (255 - (g10 & 255)), e0.i((int) ((1.402d * d11) + d10), 0, 255), e0.i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), e0.i((int) ((d12 * 1.772d) + d10), 0, 255));
            iArr = iArr;
            g11 = g11;
            i14 = 8;
            i16 = 4;
        }
        return new a(g11, iArr, a10, b10);
    }

    public static c f(t tVar) {
        byte[] bArr;
        int g10 = tVar.g(16);
        tVar.m(4);
        int g11 = tVar.g(2);
        boolean f10 = tVar.f();
        tVar.m(1);
        byte[] bArr2 = e0.f;
        if (g11 == 1) {
            tVar.m(tVar.g(8) * 16);
        } else if (g11 == 0) {
            int g12 = tVar.g(16);
            int g13 = tVar.g(16);
            if (g12 > 0) {
                bArr2 = new byte[g12];
                tVar.i(bArr2, g12);
            }
            if (g13 > 0) {
                bArr = new byte[g13];
                tVar.i(bArr, g13);
                return new c(g10, f10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g10, f10, bArr2, bArr);
    }
}
