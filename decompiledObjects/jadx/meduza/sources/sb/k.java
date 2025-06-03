package sb;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p2.m0;

/* loaded from: classes.dex */
public class k extends j {
    public static final boolean n(Object obj, Object[] objArr) {
        int i10;
        ec.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (ec.i.a(obj, objArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        return i10 >= 0;
    }

    public static final <T> T o(T[] tArr) {
        ec.i.e(tArr, "<this>");
        if (tArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return tArr[0];
    }

    public static String p(Object[] objArr, String str, String str2, String str3, int i10) {
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "";
        }
        int i11 = (i10 & 8) != 0 ? -1 : 0;
        String str4 = (i10 & 16) != 0 ? "..." : null;
        ec.i.e(objArr, "<this>");
        ec.i.e(str, "separator");
        ec.i.e(str2, "prefix");
        ec.i.e(str3, "postfix");
        ec.i.e(str4, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) str2);
        int i12 = 0;
        for (Object obj : objArr) {
            i12++;
            if (i12 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i11 >= 0 && i12 > i11) {
                break;
            }
            m0.g(sb2, obj, null);
        }
        if (i11 >= 0 && i12 > i11) {
            sb2.append((CharSequence) str4);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final List<Long> q(long[] jArr) {
        ec.i.e(jArr, "<this>");
        int length = jArr.length;
        if (length == 0) {
            return s.f14324a;
        }
        if (length == 1) {
            return va.a.f(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    public static final <T> List<T> r(T[] tArr) {
        ec.i.e(tArr, "<this>");
        int length = tArr.length;
        return length != 0 ? length != 1 ? new ArrayList(new h(tArr, false)) : va.a.f(tArr[0]) : s.f14324a;
    }
}
