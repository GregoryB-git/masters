package S3;

import java.util.Comparator;

/* loaded from: classes.dex */
public class l implements Comparator {

    /* renamed from: o, reason: collision with root package name */
    public static l f5887o = new l();

    public static l b(Class cls) {
        return f5887o;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }
}
