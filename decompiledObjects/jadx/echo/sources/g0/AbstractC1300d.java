package g0;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1300d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14279a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f14280b = {"", "A", "B", "C"};

    public static String a(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    public static List b(boolean z7) {
        return Collections.singletonList(z7 ? new byte[]{1} : new byte[]{0});
    }

    public static String c(int i7, boolean z7, int i8, int i9, int[] iArr, int i10) {
        Object[] objArr = new Object[5];
        objArr[0] = f14280b[i7];
        objArr[1] = Integer.valueOf(i8);
        objArr[2] = Integer.valueOf(i9);
        objArr[3] = Character.valueOf(z7 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(i10);
        StringBuilder sb = new StringBuilder(M.G("hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    public static byte[] d(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = f14279a;
        byte[] bArr3 = new byte[bArr2.length + i8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i7, bArr3, bArr2.length, i8);
        return bArr3;
    }

    public static Pair e(byte[] bArr) {
        z zVar = new z(bArr);
        zVar.T(9);
        int G6 = zVar.G();
        zVar.T(20);
        return Pair.create(Integer.valueOf(zVar.K()), Integer.valueOf(G6));
    }

    public static boolean f(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }
}
