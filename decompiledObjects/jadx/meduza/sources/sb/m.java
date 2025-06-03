package sb;

import java.util.Collection;

/* loaded from: classes.dex */
public class m extends va.a {
    public static final int j(Iterable iterable) {
        ec.i.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
