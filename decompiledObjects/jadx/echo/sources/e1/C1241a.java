package e1;

import X2.AbstractC0703v;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import c1.C0816e;
import c1.k;
import c1.s;
import c1.t;
import f0.C1280a;
import g0.InterfaceC1303g;
import g0.M;
import g0.o;
import g0.y;
import g0.z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: e1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1241a implements t {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f13726h = {0, 7, 8, 15};

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f13727i = {0, 119, -120, -1};

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f13728j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f13729a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f13730b;

    /* renamed from: c, reason: collision with root package name */
    public final Canvas f13731c;

    /* renamed from: d, reason: collision with root package name */
    public final b f13732d;

    /* renamed from: e, reason: collision with root package name */
    public final C0196a f13733e;

    /* renamed from: f, reason: collision with root package name */
    public final h f13734f;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f13735g;

    /* renamed from: e1.a$a, reason: collision with other inner class name */
    public static final class C0196a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13736a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f13737b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f13738c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f13739d;

        public C0196a(int i7, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f13736a = i7;
            this.f13737b = iArr;
            this.f13738c = iArr2;
            this.f13739d = iArr3;
        }
    }

    /* renamed from: e1.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f13740a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13741b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13742c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13743d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13744e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13745f;

        public b(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f13740a = i7;
            this.f13741b = i8;
            this.f13742c = i9;
            this.f13743d = i10;
            this.f13744e = i11;
            this.f13745f = i12;
        }
    }

    /* renamed from: e1.a$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f13746a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13747b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f13748c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f13749d;

        public c(int i7, boolean z7, byte[] bArr, byte[] bArr2) {
            this.f13746a = i7;
            this.f13747b = z7;
            this.f13748c = bArr;
            this.f13749d = bArr2;
        }
    }

    /* renamed from: e1.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f13750a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13751b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13752c;

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f13753d;

        public d(int i7, int i8, int i9, SparseArray sparseArray) {
            this.f13750a = i7;
            this.f13751b = i8;
            this.f13752c = i9;
            this.f13753d = sparseArray;
        }
    }

    /* renamed from: e1.a$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f13754a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13755b;

        public e(int i7, int i8) {
            this.f13754a = i7;
            this.f13755b = i8;
        }
    }

    /* renamed from: e1.a$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final int f13756a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13757b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13758c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13759d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13760e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13761f;

        /* renamed from: g, reason: collision with root package name */
        public final int f13762g;

        /* renamed from: h, reason: collision with root package name */
        public final int f13763h;

        /* renamed from: i, reason: collision with root package name */
        public final int f13764i;

        /* renamed from: j, reason: collision with root package name */
        public final int f13765j;

        /* renamed from: k, reason: collision with root package name */
        public final SparseArray f13766k;

        public f(int i7, boolean z7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, SparseArray sparseArray) {
            this.f13756a = i7;
            this.f13757b = z7;
            this.f13758c = i8;
            this.f13759d = i9;
            this.f13760e = i10;
            this.f13761f = i11;
            this.f13762g = i12;
            this.f13763h = i13;
            this.f13764i = i14;
            this.f13765j = i15;
            this.f13766k = sparseArray;
        }

        public void a(f fVar) {
            SparseArray sparseArray = fVar.f13766k;
            for (int i7 = 0; i7 < sparseArray.size(); i7++) {
                this.f13766k.put(sparseArray.keyAt(i7), (g) sparseArray.valueAt(i7));
            }
        }
    }

    /* renamed from: e1.a$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final int f13767a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13768b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13769c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13770d;

        /* renamed from: e, reason: collision with root package name */
        public final int f13771e;

        /* renamed from: f, reason: collision with root package name */
        public final int f13772f;

        public g(int i7, int i8, int i9, int i10, int i11, int i12) {
            this.f13767a = i7;
            this.f13768b = i8;
            this.f13769c = i9;
            this.f13770d = i10;
            this.f13771e = i11;
            this.f13772f = i12;
        }
    }

    /* renamed from: e1.a$h */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final int f13773a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13774b;

        /* renamed from: c, reason: collision with root package name */
        public final SparseArray f13775c = new SparseArray();

        /* renamed from: d, reason: collision with root package name */
        public final SparseArray f13776d = new SparseArray();

        /* renamed from: e, reason: collision with root package name */
        public final SparseArray f13777e = new SparseArray();

        /* renamed from: f, reason: collision with root package name */
        public final SparseArray f13778f = new SparseArray();

        /* renamed from: g, reason: collision with root package name */
        public final SparseArray f13779g = new SparseArray();

        /* renamed from: h, reason: collision with root package name */
        public b f13780h;

        /* renamed from: i, reason: collision with root package name */
        public d f13781i;

        public h(int i7, int i8) {
            this.f13773a = i7;
            this.f13774b = i8;
        }

        public void a() {
            this.f13775c.clear();
            this.f13776d.clear();
            this.f13777e.clear();
            this.f13778f.clear();
            this.f13779g.clear();
            this.f13780h = null;
            this.f13781i = null;
        }
    }

    public C1241a(List list) {
        z zVar = new z((byte[]) list.get(0));
        int M6 = zVar.M();
        int M7 = zVar.M();
        Paint paint = new Paint();
        this.f13729a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f13730b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f13731c = new Canvas();
        this.f13732d = new b(719, 575, 0, 719, 0, 575);
        this.f13733e = new C0196a(0, f(), g(), h());
        this.f13734f = new h(M6, M7);
    }

    public static byte[] e(int i7, int i8, y yVar) {
        byte[] bArr = new byte[i7];
        for (int i9 = 0; i9 < i7; i9++) {
            bArr[i9] = (byte) yVar.h(i8);
        }
        return bArr;
    }

    public static int[] f() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    public static int[] g() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                iArr[i7] = i(255, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i7] = i(255, (i7 & 1) != 0 ? 127 : 0, (i7 & 2) != 0 ? 127 : 0, (i7 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] h() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i7 = 0; i7 < 256; i7++) {
            if (i7 < 8) {
                iArr[i7] = i(63, (i7 & 1) != 0 ? 255 : 0, (i7 & 2) != 0 ? 255 : 0, (i7 & 4) == 0 ? 0 : 255);
            } else {
                int i8 = i7 & 136;
                if (i8 == 0) {
                    iArr[i7] = i(255, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 8) {
                    iArr[i7] = i(127, ((i7 & 1) != 0 ? 85 : 0) + ((i7 & 16) != 0 ? 170 : 0), ((i7 & 2) != 0 ? 85 : 0) + ((i7 & 32) != 0 ? 170 : 0), ((i7 & 4) == 0 ? 0 : 85) + ((i7 & 64) == 0 ? 0 : 170));
                } else if (i8 == 128) {
                    iArr[i7] = i(255, ((i7 & 1) != 0 ? 43 : 0) + 127 + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + 127 + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + 127 + ((i7 & 64) == 0 ? 0 : 85));
                } else if (i8 == 136) {
                    iArr[i7] = i(255, ((i7 & 1) != 0 ? 43 : 0) + ((i7 & 16) != 0 ? 85 : 0), ((i7 & 2) != 0 ? 43 : 0) + ((i7 & 32) != 0 ? 85 : 0), ((i7 & 4) == 0 ? 0 : 43) + ((i7 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int i(int i7, int i8, int i9, int i10) {
        return (i7 << 24) | (i8 << 16) | (i9 << 8) | i10;
    }

    public static int j(y yVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z7;
        int i9;
        int h7;
        int i10 = i7;
        boolean z8 = false;
        while (true) {
            int h8 = yVar.h(2);
            if (h8 != 0) {
                z7 = z8;
                i9 = 1;
            } else {
                if (yVar.g()) {
                    h7 = yVar.h(3) + 3;
                } else {
                    if (yVar.g()) {
                        z7 = z8;
                        i9 = 1;
                    } else {
                        int h9 = yVar.h(2);
                        if (h9 == 0) {
                            z7 = true;
                        } else if (h9 == 1) {
                            z7 = z8;
                            i9 = 2;
                        } else if (h9 == 2) {
                            h7 = yVar.h(4) + 12;
                        } else if (h9 != 3) {
                            z7 = z8;
                        } else {
                            h7 = yVar.h(8) + 29;
                        }
                        h8 = 0;
                        i9 = 0;
                    }
                    h8 = 0;
                }
                z7 = z8;
                i9 = h7;
                h8 = yVar.h(2);
            }
            if (i9 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
            }
            i10 += i9;
            if (z7) {
                return i10;
            }
            z8 = z7;
        }
    }

    public static int k(y yVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z7;
        int i9;
        int h7;
        int i10 = i7;
        boolean z8 = false;
        while (true) {
            int h8 = yVar.h(4);
            if (h8 != 0) {
                z7 = z8;
                i9 = 1;
            } else if (yVar.g()) {
                if (yVar.g()) {
                    int h9 = yVar.h(2);
                    if (h9 == 0) {
                        z7 = z8;
                        i9 = 1;
                    } else if (h9 == 1) {
                        z7 = z8;
                        i9 = 2;
                    } else if (h9 == 2) {
                        h7 = yVar.h(4) + 9;
                    } else if (h9 != 3) {
                        z7 = z8;
                        h8 = 0;
                        i9 = 0;
                    } else {
                        h7 = yVar.h(8) + 25;
                    }
                    h8 = 0;
                } else {
                    h7 = yVar.h(2) + 4;
                }
                z7 = z8;
                i9 = h7;
                h8 = yVar.h(4);
            } else {
                int h10 = yVar.h(3);
                if (h10 != 0) {
                    z7 = z8;
                    i9 = h10 + 2;
                    h8 = 0;
                } else {
                    z7 = true;
                    h8 = 0;
                    i9 = 0;
                }
            }
            if (i9 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i10, i8, i10 + i9, i8 + 1, paint);
            }
            i10 += i9;
            if (z7) {
                return i10;
            }
            z8 = z7;
        }
    }

    public static int l(y yVar, int[] iArr, byte[] bArr, int i7, int i8, Paint paint, Canvas canvas) {
        boolean z7;
        int h7;
        int i9 = i7;
        boolean z8 = false;
        while (true) {
            int h8 = yVar.h(8);
            if (h8 != 0) {
                z7 = z8;
                h7 = 1;
            } else if (yVar.g()) {
                z7 = z8;
                h7 = yVar.h(7);
                h8 = yVar.h(8);
            } else {
                int h9 = yVar.h(7);
                if (h9 != 0) {
                    z7 = z8;
                    h7 = h9;
                    h8 = 0;
                } else {
                    z7 = true;
                    h8 = 0;
                    h7 = 0;
                }
            }
            if (h7 != 0 && paint != null) {
                if (bArr != null) {
                    h8 = bArr[h8];
                }
                paint.setColor(iArr[h8]);
                canvas.drawRect(i9, i8, i9 + h7, i8 + 1, paint);
            }
            i9 += h7;
            if (z7) {
                return i9;
            }
            z8 = z7;
        }
    }

    public static void m(byte[] bArr, int[] iArr, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        y yVar = new y(bArr);
        int i10 = i8;
        int i11 = i9;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        byte[] bArr7 = null;
        while (yVar.b() != 0) {
            int h7 = yVar.h(8);
            if (h7 != 240) {
                switch (h7) {
                    case 16:
                        if (i7 != 3) {
                            if (i7 != 2) {
                                bArr2 = null;
                                i10 = j(yVar, iArr, bArr2, i10, i11, paint, canvas);
                                break;
                            } else {
                                bArr3 = bArr7 == null ? f13726h : bArr7;
                            }
                        } else {
                            bArr3 = bArr5 == null ? f13727i : bArr5;
                        }
                        bArr2 = bArr3;
                        i10 = j(yVar, iArr, bArr2, i10, i11, paint, canvas);
                    case 17:
                        if (i7 == 3) {
                            bArr4 = bArr6 == null ? f13728j : bArr6;
                        } else {
                            bArr4 = null;
                        }
                        i10 = k(yVar, iArr, bArr4, i10, i11, paint, canvas);
                        break;
                    case 18:
                        i10 = l(yVar, iArr, null, i10, i11, paint, canvas);
                        continue;
                    default:
                        switch (h7) {
                            case 32:
                                bArr7 = e(4, 4, yVar);
                                break;
                            case 33:
                                bArr5 = e(4, 8, yVar);
                                break;
                            case 34:
                                bArr6 = e(16, 8, yVar);
                                break;
                            default:
                                continue;
                        }
                }
                yVar.c();
            } else {
                i11 += 2;
                i10 = i8;
            }
        }
    }

    public static void n(c cVar, C0196a c0196a, int i7, int i8, int i9, Paint paint, Canvas canvas) {
        int[] iArr = i7 == 3 ? c0196a.f13739d : i7 == 2 ? c0196a.f13738c : c0196a.f13737b;
        m(cVar.f13748c, iArr, i7, i8, i9, paint, canvas);
        m(cVar.f13749d, iArr, i7, i8, i9 + 1, paint, canvas);
    }

    public static C0196a p(y yVar, int i7) {
        int h7;
        int i8;
        int h8;
        int i9;
        int i10;
        int i11 = 8;
        int h9 = yVar.h(8);
        yVar.r(8);
        int i12 = 2;
        int i13 = i7 - 2;
        int[] f7 = f();
        int[] g7 = g();
        int[] h10 = h();
        while (i13 > 0) {
            int h11 = yVar.h(i11);
            int h12 = yVar.h(i11);
            int[] iArr = (h12 & 128) != 0 ? f7 : (h12 & 64) != 0 ? g7 : h10;
            if ((h12 & 1) != 0) {
                i9 = yVar.h(i11);
                i10 = yVar.h(i11);
                h7 = yVar.h(i11);
                h8 = yVar.h(i11);
                i8 = i13 - 6;
            } else {
                int h13 = yVar.h(6) << i12;
                int h14 = yVar.h(4) << 4;
                h7 = yVar.h(4) << 4;
                i8 = i13 - 4;
                h8 = yVar.h(i12) << 6;
                i9 = h13;
                i10 = h14;
            }
            if (i9 == 0) {
                h8 = 255;
                i10 = 0;
                h7 = 0;
            }
            double d7 = i9;
            double d8 = i10 - 128;
            double d9 = h7 - 128;
            iArr[h11] = i((byte) (255 - (h8 & 255)), M.p((int) (d7 + (1.402d * d8)), 0, 255), M.p((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 0, 255), M.p((int) (d7 + (d9 * 1.772d)), 0, 255));
            i13 = i8;
            h9 = h9;
            i11 = 8;
            i12 = 2;
        }
        return new C0196a(h9, f7, g7, h10);
    }

    public static b q(y yVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        yVar.r(4);
        boolean g7 = yVar.g();
        yVar.r(3);
        int h7 = yVar.h(16);
        int h8 = yVar.h(16);
        if (g7) {
            int h9 = yVar.h(16);
            int h10 = yVar.h(16);
            int h11 = yVar.h(16);
            i10 = yVar.h(16);
            i9 = h10;
            i8 = h11;
            i7 = h9;
        } else {
            i7 = 0;
            i8 = 0;
            i9 = h7;
            i10 = h8;
        }
        return new b(h7, h8, i7, i9, i8, i10);
    }

    public static c r(y yVar) {
        byte[] bArr;
        int h7 = yVar.h(16);
        yVar.r(4);
        int h8 = yVar.h(2);
        boolean g7 = yVar.g();
        yVar.r(1);
        byte[] bArr2 = M.f14266f;
        if (h8 == 1) {
            yVar.r(yVar.h(8) * 16);
        } else if (h8 == 0) {
            int h9 = yVar.h(16);
            int h10 = yVar.h(16);
            if (h9 > 0) {
                bArr2 = new byte[h9];
                yVar.k(bArr2, 0, h9);
            }
            if (h10 > 0) {
                bArr = new byte[h10];
                yVar.k(bArr, 0, h10);
                return new c(h7, g7, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(h7, g7, bArr2, bArr);
    }

    public static d s(y yVar, int i7) {
        int h7 = yVar.h(8);
        int h8 = yVar.h(4);
        int h9 = yVar.h(2);
        yVar.r(2);
        int i8 = i7 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i8 > 0) {
            int h10 = yVar.h(8);
            yVar.r(8);
            i8 -= 6;
            sparseArray.put(h10, new e(yVar.h(16), yVar.h(16)));
        }
        return new d(h7, h8, h9, sparseArray);
    }

    public static f t(y yVar, int i7) {
        int i8;
        int i9;
        int i10;
        int h7 = yVar.h(8);
        yVar.r(4);
        boolean g7 = yVar.g();
        yVar.r(3);
        int i11 = 16;
        int h8 = yVar.h(16);
        int h9 = yVar.h(16);
        int h10 = yVar.h(3);
        int h11 = yVar.h(3);
        int i12 = 2;
        yVar.r(2);
        int h12 = yVar.h(8);
        int h13 = yVar.h(8);
        int h14 = yVar.h(4);
        int h15 = yVar.h(2);
        yVar.r(2);
        int i13 = i7 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i13 > 0) {
            int h16 = yVar.h(i11);
            int h17 = yVar.h(i12);
            int h18 = yVar.h(i12);
            int h19 = yVar.h(12);
            int i14 = h15;
            yVar.r(4);
            int h20 = yVar.h(12);
            int i15 = i13 - 6;
            if (h17 != 1) {
                i8 = 2;
                if (h17 != 2) {
                    i10 = 0;
                    i9 = 0;
                    i13 = i15;
                    sparseArray.put(h16, new g(h17, h18, h19, h20, i10, i9));
                    i12 = i8;
                    h15 = i14;
                    i11 = 16;
                }
            } else {
                i8 = 2;
            }
            i13 -= 8;
            i10 = yVar.h(8);
            i9 = yVar.h(8);
            sparseArray.put(h16, new g(h17, h18, h19, h20, i10, i9));
            i12 = i8;
            h15 = i14;
            i11 = 16;
        }
        return new f(h7, g7, h8, h9, h10, h11, h12, h13, h14, h15, sparseArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(y yVar, h hVar) {
        f fVar;
        SparseArray sparseArray;
        C0196a c0196a;
        int i7;
        C0196a c0196a2;
        c cVar;
        int h7 = yVar.h(8);
        int h8 = yVar.h(16);
        int h9 = yVar.h(16);
        int d7 = yVar.d() + h9;
        if (h9 * 8 > yVar.b()) {
            o.h("DvbParser", "Data field length exceeds limit");
            yVar.r(yVar.b());
            return;
        }
        switch (h7) {
            case 16:
                if (h8 == hVar.f13773a) {
                    d dVar = hVar.f13781i;
                    d s7 = s(yVar, h9);
                    if (s7.f13752c == 0) {
                        if (dVar != null && dVar.f13751b != s7.f13751b) {
                            hVar.f13781i = s7;
                            break;
                        }
                    } else {
                        hVar.f13781i = s7;
                        hVar.f13775c.clear();
                        hVar.f13776d.clear();
                        hVar.f13777e.clear();
                        break;
                    }
                }
                break;
            case 17:
                d dVar2 = hVar.f13781i;
                if (h8 == hVar.f13773a && dVar2 != null) {
                    f t7 = t(yVar, h9);
                    if (dVar2.f13752c == 0 && (fVar = (f) hVar.f13775c.get(t7.f13756a)) != null) {
                        t7.a(fVar);
                    }
                    hVar.f13775c.put(t7.f13756a, t7);
                    break;
                }
                break;
            case 18:
                if (h8 == hVar.f13773a) {
                    C0196a p7 = p(yVar, h9);
                    sparseArray = hVar.f13776d;
                    c0196a = p7;
                } else if (h8 == hVar.f13774b) {
                    C0196a p8 = p(yVar, h9);
                    sparseArray = hVar.f13778f;
                    c0196a = p8;
                }
                i7 = c0196a.f13736a;
                c0196a2 = c0196a;
                sparseArray.put(i7, c0196a2);
                break;
            case 19:
                if (h8 == hVar.f13773a) {
                    c r7 = r(yVar);
                    sparseArray = hVar.f13777e;
                    cVar = r7;
                } else if (h8 == hVar.f13774b) {
                    c r8 = r(yVar);
                    sparseArray = hVar.f13779g;
                    cVar = r8;
                }
                i7 = cVar.f13746a;
                c0196a2 = cVar;
                sparseArray.put(i7, c0196a2);
                break;
            case 20:
                if (h8 == hVar.f13773a) {
                    hVar.f13780h = q(yVar);
                    break;
                }
                break;
        }
        yVar.s(d7 - yVar.d());
    }

    @Override // c1.t
    public /* synthetic */ k a(byte[] bArr, int i7, int i8) {
        return s.a(this, bArr, i7, i8);
    }

    @Override // c1.t
    public void b() {
        this.f13734f.a();
    }

    @Override // c1.t
    public void c(byte[] bArr, int i7, int i8, t.b bVar, InterfaceC1303g interfaceC1303g) {
        y yVar = new y(bArr, i8 + i7);
        yVar.p(i7);
        interfaceC1303g.accept(o(yVar));
    }

    @Override // c1.t
    public int d() {
        return 2;
    }

    public final C0816e o(y yVar) {
        int i7;
        SparseArray sparseArray;
        while (yVar.b() >= 48 && yVar.h(8) == 15) {
            u(yVar, this.f13734f);
        }
        h hVar = this.f13734f;
        d dVar = hVar.f13781i;
        if (dVar == null) {
            return new C0816e(AbstractC0703v.Y(), -9223372036854775807L, -9223372036854775807L);
        }
        b bVar = hVar.f13780h;
        if (bVar == null) {
            bVar = this.f13732d;
        }
        Bitmap bitmap = this.f13735g;
        if (bitmap == null || bVar.f13740a + 1 != bitmap.getWidth() || bVar.f13741b + 1 != this.f13735g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f13740a + 1, bVar.f13741b + 1, Bitmap.Config.ARGB_8888);
            this.f13735g = createBitmap;
            this.f13731c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray2 = dVar.f13753d;
        for (int i8 = 0; i8 < sparseArray2.size(); i8++) {
            this.f13731c.save();
            e eVar = (e) sparseArray2.valueAt(i8);
            f fVar = (f) this.f13734f.f13775c.get(sparseArray2.keyAt(i8));
            int i9 = eVar.f13754a + bVar.f13742c;
            int i10 = eVar.f13755b + bVar.f13744e;
            this.f13731c.clipRect(i9, i10, Math.min(fVar.f13758c + i9, bVar.f13743d), Math.min(fVar.f13759d + i10, bVar.f13745f));
            C0196a c0196a = (C0196a) this.f13734f.f13776d.get(fVar.f13762g);
            if (c0196a == null && (c0196a = (C0196a) this.f13734f.f13778f.get(fVar.f13762g)) == null) {
                c0196a = this.f13733e;
            }
            SparseArray sparseArray3 = fVar.f13766k;
            int i11 = 0;
            while (i11 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i11);
                g gVar = (g) sparseArray3.valueAt(i11);
                c cVar = (c) this.f13734f.f13777e.get(keyAt);
                c cVar2 = cVar == null ? (c) this.f13734f.f13779g.get(keyAt) : cVar;
                if (cVar2 != null) {
                    i7 = i11;
                    sparseArray = sparseArray3;
                    n(cVar2, c0196a, fVar.f13761f, gVar.f13769c + i9, i10 + gVar.f13770d, cVar2.f13747b ? null : this.f13729a, this.f13731c);
                } else {
                    i7 = i11;
                    sparseArray = sparseArray3;
                }
                i11 = i7 + 1;
                sparseArray3 = sparseArray;
            }
            if (fVar.f13757b) {
                int i12 = fVar.f13761f;
                this.f13730b.setColor(i12 == 3 ? c0196a.f13739d[fVar.f13763h] : i12 == 2 ? c0196a.f13738c[fVar.f13764i] : c0196a.f13737b[fVar.f13765j]);
                this.f13731c.drawRect(i9, i10, fVar.f13758c + i9, fVar.f13759d + i10, this.f13730b);
            }
            arrayList.add(new C1280a.b().f(Bitmap.createBitmap(this.f13735g, i9, i10, fVar.f13758c, fVar.f13759d)).k(i9 / bVar.f13740a).l(0).h(i10 / bVar.f13741b, 0).i(0).n(fVar.f13758c / bVar.f13740a).g(fVar.f13759d / bVar.f13741b).a());
            this.f13731c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f13731c.restore();
        }
        return new C0816e(arrayList, -9223372036854775807L, -9223372036854775807L);
    }
}
