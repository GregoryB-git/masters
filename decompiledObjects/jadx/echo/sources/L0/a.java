package L0;

import F0.AbstractC0356a;
import F0.T;
import L0.e;
import d0.C1194q;
import g0.z;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3292e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f3293b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3294c;

    /* renamed from: d, reason: collision with root package name */
    public int f3295d;

    public a(T t7) {
        super(t7);
    }

    @Override // L0.e
    public boolean b(z zVar) {
        C1194q.b p02;
        if (this.f3293b) {
            zVar.U(1);
        } else {
            int G6 = zVar.G();
            int i7 = (G6 >> 4) & 15;
            this.f3295d = i7;
            if (i7 == 2) {
                p02 = new C1194q.b().o0("audio/mpeg").N(1).p0(f3292e[(G6 >> 2) & 3]);
            } else if (i7 == 7 || i7 == 8) {
                p02 = new C1194q.b().o0(i7 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").N(1).p0(8000);
            } else {
                if (i7 != 10) {
                    throw new e.a("Audio format not supported: " + this.f3295d);
                }
                this.f3293b = true;
            }
            this.f3316a.d(p02.K());
            this.f3294c = true;
            this.f3293b = true;
        }
        return true;
    }

    @Override // L0.e
    public boolean c(z zVar, long j7) {
        if (this.f3295d == 2) {
            int a7 = zVar.a();
            this.f3316a.e(zVar, a7);
            this.f3316a.b(j7, 1, a7, 0, null);
            return true;
        }
        int G6 = zVar.G();
        if (G6 != 0 || this.f3294c) {
            if (this.f3295d == 10 && G6 != 1) {
                return false;
            }
            int a8 = zVar.a();
            this.f3316a.e(zVar, a8);
            this.f3316a.b(j7, 1, a8, 0, null);
            return true;
        }
        int a9 = zVar.a();
        byte[] bArr = new byte[a9];
        zVar.l(bArr, 0, a9);
        AbstractC0356a.b e7 = AbstractC0356a.e(bArr);
        this.f3316a.d(new C1194q.b().o0("audio/mp4a-latm").O(e7.f1841c).N(e7.f1840b).p0(e7.f1839a).b0(Collections.singletonList(bArr)).K());
        this.f3294c = true;
        return false;
    }
}
