package w5;

import b.a0;
import java.util.ArrayList;
import java.util.List;
import v3.a1;
import v5.q;
import v5.u;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16318a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16319b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16320c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16321d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16322e;
    public final String f;

    public a(ArrayList arrayList, int i10, int i11, int i12, float f, String str) {
        this.f16318a = arrayList;
        this.f16319b = i10;
        this.f16320c = i11;
        this.f16321d = i12;
        this.f16322e = f;
        this.f = str;
    }

    public static a a(u uVar) {
        float f;
        String str;
        int i10;
        int i11;
        try {
            uVar.H(4);
            int v10 = (uVar.v() & 3) + 1;
            if (v10 == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int v11 = uVar.v() & 31;
            for (int i12 = 0; i12 < v11; i12++) {
                int A = uVar.A();
                int i13 = uVar.f15975b;
                uVar.H(A);
                byte[] bArr = uVar.f15974a;
                byte[] bArr2 = new byte[A + 4];
                System.arraycopy(a0.f1569f0, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i13, bArr2, 4, A);
                arrayList.add(bArr2);
            }
            int v12 = uVar.v();
            for (int i14 = 0; i14 < v12; i14++) {
                int A2 = uVar.A();
                int i15 = uVar.f15975b;
                uVar.H(A2);
                byte[] bArr3 = uVar.f15974a;
                byte[] bArr4 = new byte[A2 + 4];
                System.arraycopy(a0.f1569f0, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i15, bArr4, 4, A2);
                arrayList.add(bArr4);
            }
            if (v11 > 0) {
                q.c d10 = q.d((byte[]) arrayList.get(0), v10, ((byte[]) arrayList.get(0)).length);
                int i16 = d10.f15953e;
                int i17 = d10.f;
                float f10 = d10.f15954g;
                str = a0.l(d10.f15949a, d10.f15950b, d10.f15951c);
                i10 = i16;
                i11 = i17;
                f = f10;
            } else {
                f = 1.0f;
                str = null;
                i10 = -1;
                i11 = -1;
            }
            return new a(arrayList, v10, i10, i11, f, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw a1.a("Error parsing AVC config", e10);
        }
    }
}
