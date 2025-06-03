package W5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: W5.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0680j extends C0679i {
    public static List b(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        List a7 = AbstractC0682l.a(objArr);
        Intrinsics.checkNotNullExpressionValue(a7, "asList(...)");
        return a7;
    }

    public static final Object[] c(Object[] objArr, Object[] destination, int i7, int i8, int i9) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(objArr, i8, destination, i7, i9 - i8);
        return destination;
    }

    public static /* synthetic */ Object[] d(Object[] objArr, Object[] objArr2, int i7, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i7 = 0;
        }
        if ((i10 & 4) != 0) {
            i8 = 0;
        }
        if ((i10 & 8) != 0) {
            i9 = objArr.length;
        }
        return c(objArr, objArr2, i7, i8, i9);
    }

    public static final void e(Object[] objArr, Object obj, int i7, int i8) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, i7, i8, obj);
    }

    public static void f(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void g(Object[] objArr, Comparator comparator) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
