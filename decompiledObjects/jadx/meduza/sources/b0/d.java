package b0;

import com.google.android.exoplayer2.ui.b;
import i5.b;
import i9.t0;
import java.io.File;
import java.nio.charset.Charset;
import java.util.Comparator;
import o7.k0;
import q5.f;
import r5.f;
import t5.i0;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1669a;

    public /* synthetic */ d(int i10) {
        this.f1669a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1669a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b10 = bArr[i10];
                    byte b11 = bArr2[i10];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 1:
                return Integer.compare(((b.a) obj2).f7527b, ((b.a) obj).f7527b);
            case 2:
                return Integer.compare(((f.a) obj).f13307a.f13310b, ((f.a) obj2).f13307a.f13310b);
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                k0<Integer> k0Var = r5.f.f13640j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return f.i.h((f.i) obj, (f.i) obj2);
            case 5:
                return f.i.i((f.i) obj, (f.i) obj2);
            case 6:
                b.C0040b c0040b = (b.C0040b) obj;
                b.C0040b c0040b2 = (b.C0040b) obj2;
                int compare = Integer.compare(c0040b2.f2729a, c0040b.f2729a);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = c0040b2.f2731c.compareTo(c0040b.f2731c);
                return compareTo != 0 ? compareTo : c0040b2.f2732d.compareTo(c0040b.f2732d);
            case 7:
                return ((i0.a) obj).f14520a - ((i0.a) obj2).f14520a;
            case 8:
                Charset charset = p8.c.f13031e;
                String name = ((File) obj).getName();
                int i11 = p8.c.f;
                return name.substring(0, i11).compareTo(((File) obj2).getName().substring(0, i11));
            case 9:
                i9.c cVar = (i9.c) obj;
                i9.c cVar2 = (i9.c) obj2;
                int compareTo2 = cVar.f7652a.compareTo(cVar2.f7652a);
                return compareTo2 != 0 ? compareTo2 : n9.o.d(cVar.f7653b, cVar2.f7653b);
            case 10:
                j9.k kVar = (j9.k) obj;
                j9.k kVar2 = (j9.k) obj2;
                byte[] bArr3 = t0.f7797k;
                int compare2 = Long.compare(kVar.e().b(), kVar2.e().b());
                return compare2 == 0 ? kVar.b().compareTo(kVar2.b()) : compare2;
            case 11:
                return n9.o.d(((k9.g) obj).f9153a, ((k9.g) obj2).f9153a);
            default:
                return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }
}
