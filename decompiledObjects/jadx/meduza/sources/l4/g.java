package l4;

import b.a0;
import c4.y;
import java.util.ArrayList;
import java.util.Arrays;
import l4.h;
import o7.t;
import p4.a;
import v3.i0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f9593o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f9594p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f9595n;

    public static boolean e(u uVar, byte[] bArr) {
        int i10 = uVar.f15976c;
        int i11 = uVar.f15975b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        uVar.d(bArr2, 0, bArr.length);
        uVar.G(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // l4.h
    public final long b(u uVar) {
        byte[] bArr = uVar.f15974a;
        return (this.f9603i * a0.v(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // l4.h
    public final boolean c(u uVar, long j10, h.a aVar) {
        i0 i0Var;
        if (e(uVar, f9593o)) {
            byte[] copyOf = Arrays.copyOf(uVar.f15974a, uVar.f15976c);
            int i10 = copyOf[9] & 255;
            ArrayList n2 = a0.n(copyOf);
            if (aVar.f9608a != null) {
                return true;
            }
            i0.a aVar2 = new i0.a();
            aVar2.f15472k = "audio/opus";
            aVar2.f15484x = i10;
            aVar2.f15485y = 48000;
            aVar2.f15474m = n2;
            i0Var = new i0(aVar2);
        } else {
            if (!e(uVar, f9594p)) {
                x6.b.K(aVar.f9608a);
                return false;
            }
            x6.b.K(aVar.f9608a);
            if (this.f9595n) {
                return true;
            }
            this.f9595n = true;
            uVar.H(8);
            p4.a a10 = y.a(t.q(y.b(uVar, false, false).f2335a));
            if (a10 == null) {
                return true;
            }
            i0 i0Var2 = aVar.f9608a;
            i0Var2.getClass();
            i0.a aVar3 = new i0.a(i0Var2);
            p4.a aVar4 = aVar.f9608a.f15455r;
            if (aVar4 != null) {
                a.b[] bVarArr = aVar4.f12996a;
                if (bVarArr.length != 0) {
                    long j11 = a10.f12997b;
                    a.b[] bVarArr2 = a10.f12996a;
                    int i11 = e0.f15881a;
                    Object[] copyOf2 = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
                    System.arraycopy(bVarArr, 0, copyOf2, bVarArr2.length, bVarArr.length);
                    a10 = new p4.a(j11, (a.b[]) copyOf2);
                }
            }
            aVar3.f15470i = a10;
            i0Var = new i0(aVar3);
        }
        aVar.f9608a = i0Var;
        return true;
    }

    @Override // l4.h
    public final void d(boolean z10) {
        super.d(z10);
        if (z10) {
            this.f9595n = false;
        }
    }
}
