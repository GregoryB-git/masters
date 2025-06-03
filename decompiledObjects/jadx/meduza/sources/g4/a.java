package g4;

import c4.v;
import defpackage.f;
import g4.d;
import java.util.Collections;
import v3.i0;
import v5.t;
import v5.u;
import x3.a;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f5816e = {5512, 11025, 22050, 44100};

    /* renamed from: b, reason: collision with root package name */
    public boolean f5817b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5818c;

    /* renamed from: d, reason: collision with root package name */
    public int f5819d;

    public a(v vVar) {
        super(vVar);
    }

    @Override // g4.d
    public final boolean a(u uVar) {
        i0.a aVar;
        int i10;
        if (this.f5817b) {
            uVar.H(1);
        } else {
            int v10 = uVar.v();
            int i11 = (v10 >> 4) & 15;
            this.f5819d = i11;
            if (i11 == 2) {
                i10 = f5816e[(v10 >> 2) & 3];
                aVar = new i0.a();
                aVar.f15472k = "audio/mpeg";
                aVar.f15484x = 1;
            } else if (i11 == 7 || i11 == 8) {
                String str = i11 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                aVar = new i0.a();
                aVar.f15472k = str;
                aVar.f15484x = 1;
                i10 = 8000;
            } else {
                if (i11 != 10) {
                    StringBuilder l10 = f.l("Audio format not supported: ");
                    l10.append(this.f5819d);
                    throw new d.a(l10.toString());
                }
                this.f5817b = true;
            }
            aVar.f15485y = i10;
            this.f5838a.d(aVar.a());
            this.f5818c = true;
            this.f5817b = true;
        }
        return true;
    }

    @Override // g4.d
    public final boolean b(long j10, u uVar) {
        int i10;
        if (this.f5819d == 2) {
            i10 = uVar.f15976c;
        } else {
            int v10 = uVar.v();
            if (v10 == 0 && !this.f5818c) {
                int i11 = uVar.f15976c - uVar.f15975b;
                byte[] bArr = new byte[i11];
                uVar.d(bArr, 0, i11);
                a.C0259a c10 = x3.a.c(new t(bArr, i11), false);
                i0.a aVar = new i0.a();
                aVar.f15472k = "audio/mp4a-latm";
                aVar.f15469h = c10.f16892c;
                aVar.f15484x = c10.f16891b;
                aVar.f15485y = c10.f16890a;
                aVar.f15474m = Collections.singletonList(bArr);
                this.f5838a.d(new i0(aVar));
                this.f5818c = true;
                return false;
            }
            if (this.f5819d == 10 && v10 != 1) {
                return false;
            }
            i10 = uVar.f15976c;
        }
        int i12 = i10 - uVar.f15975b;
        this.f5838a.b(i12, uVar);
        this.f5838a.c(j10, 1, i12, 0, null);
        return true;
    }
}
