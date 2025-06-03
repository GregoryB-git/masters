package W5;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class p extends o {
    public static int l(Iterable iterable, int i7) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i7;
    }
}
