package sb;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class j extends va.a {
    public static final <T> List<T> j(T[] tArr) {
        ec.i.e(tArr, "<this>");
        List<T> asList = Arrays.asList(tArr);
        ec.i.d(asList, "asList(...)");
        return asList;
    }

    public static final void k(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        ec.i.e(bArr, "<this>");
        ec.i.e(bArr2, "destination");
        System.arraycopy(bArr, i11, bArr2, i10, i12 - i11);
    }

    public static final void l(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        ec.i.e(objArr, "<this>");
        ec.i.e(objArr2, "destination");
        System.arraycopy(objArr, i11, objArr2, i10, i12 - i11);
    }

    public static final void m(Object[] objArr, int i10, int i11) {
        ec.i.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, (Object) null);
    }
}
