package x5;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import v3.i0;
import v5.b0;
import v5.j;
import v5.m;
import v5.u;
import x5.e;

/* loaded from: classes.dex */
public final class i implements w5.i, a {

    /* renamed from: q, reason: collision with root package name */
    public int f17162q;

    /* renamed from: r, reason: collision with root package name */
    public SurfaceTexture f17163r;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f17165u;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f17155a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f17156b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f17157c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final c f17158d = new c();

    /* renamed from: e, reason: collision with root package name */
    public final b0<Long> f17159e = new b0<>();
    public final b0<e> f = new b0<>();

    /* renamed from: o, reason: collision with root package name */
    public final float[] f17160o = new float[16];

    /* renamed from: p, reason: collision with root package name */
    public final float[] f17161p = new float[16];

    /* renamed from: s, reason: collision with root package name */
    public volatile int f17164s = 0;
    public int t = -1;

    @Override // x5.a
    public final void a(long j10, float[] fArr) {
        this.f17158d.f17123c.a(fArr, j10);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            v5.j.a();
            this.f17157c.a();
            v5.j.a();
            this.f17162q = v5.j.d();
        } catch (j.a e10) {
            m.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f17162q);
        this.f17163r = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: x5.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                i.this.f17155a.set(true);
            }
        });
        return this.f17163r;
    }

    @Override // w5.i
    public final void c(long j10, long j11, i0 i0Var, MediaFormat mediaFormat) {
        float f;
        float f10;
        int i10;
        int i11;
        int i12;
        ArrayList<e.a> arrayList;
        int f11;
        this.f17159e.a(Long.valueOf(j10), j11);
        byte[] bArr = i0Var.D;
        int i13 = i0Var.E;
        byte[] bArr2 = this.f17165u;
        int i14 = this.t;
        this.f17165u = bArr;
        if (i13 == -1) {
            i13 = this.f17164s;
        }
        this.t = i13;
        if (i14 == i13 && Arrays.equals(bArr2, this.f17165u)) {
            return;
        }
        byte[] bArr3 = this.f17165u;
        e eVar = null;
        if (bArr3 != null) {
            int i15 = this.t;
            u uVar = new u(bArr3);
            try {
                uVar.H(4);
                f11 = uVar.f();
                uVar.G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (f11 == 1886547818) {
                uVar.H(8);
                int i16 = uVar.f15975b;
                int i17 = uVar.f15976c;
                while (i16 < i17) {
                    int f12 = uVar.f() + i16;
                    if (f12 <= i16 || f12 > i17) {
                        break;
                    }
                    int f13 = uVar.f();
                    if (f13 != 2037673328 && f13 != 1836279920) {
                        uVar.G(f12);
                        i16 = f12;
                    }
                    uVar.F(f12);
                    arrayList = f.a(uVar);
                    break;
                }
                arrayList = null;
            } else {
                arrayList = f.a(uVar);
            }
            if (arrayList != null) {
                int size = arrayList.size();
                if (size == 1) {
                    e.a aVar = arrayList.get(0);
                    eVar = new e(aVar, aVar, i15);
                } else if (size == 2) {
                    eVar = new e(arrayList.get(0), arrayList.get(1), i15);
                }
            }
        }
        if (eVar == null || !g.b(eVar)) {
            int i18 = this.t;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f14 = radians / 36;
            float f15 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 36; i19 < i22; i22 = 36) {
                float f16 = radians / 2.0f;
                float f17 = (i19 * f14) - f16;
                int i23 = i19 + 1;
                float f18 = (i23 * f14) - f16;
                int i24 = 0;
                while (i24 < 73) {
                    int i25 = i23;
                    int i26 = 0;
                    int i27 = 2;
                    while (i26 < i27) {
                        if (i26 == 0) {
                            f10 = f18;
                            f = f17;
                        } else {
                            f = f18;
                            f10 = f;
                        }
                        float f19 = i24 * f15;
                        float f20 = f17;
                        int i28 = i20 + 1;
                        float f21 = f15;
                        double d10 = 50.0f;
                        int i29 = i24;
                        double d11 = (f19 + 3.1415927f) - (radians2 / 2.0f);
                        int i30 = i18;
                        float f22 = radians;
                        double d12 = f;
                        float f23 = f14;
                        fArr[i20] = -((float) (Math.cos(d12) * Math.sin(d11) * d10));
                        int i31 = i28 + 1;
                        int i32 = i26;
                        fArr[i28] = (float) (Math.sin(d12) * d10);
                        int i33 = i31 + 1;
                        fArr[i31] = (float) (Math.cos(d12) * Math.cos(d11) * d10);
                        int i34 = i21 + 1;
                        fArr2[i21] = f19 / radians2;
                        int i35 = i34 + 1;
                        fArr2[i34] = ((i19 + i32) * f23) / f22;
                        if (i29 == 0 && i32 == 0) {
                            i11 = i32;
                            i10 = i29;
                        } else {
                            i10 = i29;
                            i11 = i32;
                            if (i10 != 72 || i11 != 1) {
                                i12 = 2;
                                i21 = i35;
                                i20 = i33;
                                i26 = i11 + 1;
                                i24 = i10;
                                i27 = i12;
                                f18 = f10;
                                f15 = f21;
                                f17 = f20;
                                radians = f22;
                                f14 = f23;
                                i18 = i30;
                            }
                        }
                        System.arraycopy(fArr, i33 - 3, fArr, i33, 3);
                        i33 += 3;
                        i12 = 2;
                        System.arraycopy(fArr2, i35 - 2, fArr2, i35, 2);
                        i35 += 2;
                        i21 = i35;
                        i20 = i33;
                        i26 = i11 + 1;
                        i24 = i10;
                        i27 = i12;
                        f18 = f10;
                        f15 = f21;
                        f17 = f20;
                        radians = f22;
                        f14 = f23;
                        i18 = i30;
                    }
                    i24++;
                    i23 = i25;
                    f18 = f18;
                    i18 = i18;
                }
                i19 = i23;
            }
            e.a aVar2 = new e.a(new e.b(0, fArr, fArr2, 1));
            eVar = new e(aVar2, aVar2, i18);
        }
        this.f.a(eVar, j11);
    }

    @Override // x5.a
    public final void f() {
        this.f17159e.b();
        c cVar = this.f17158d;
        cVar.f17123c.b();
        cVar.f17124d = false;
        this.f17156b.set(true);
    }
}
