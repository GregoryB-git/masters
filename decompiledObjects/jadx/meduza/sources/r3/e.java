package r3;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13555a;

    static {
        Long l10 = 10485760L;
        Integer num = 200;
        Integer num2 = 10000;
        Long l11 = 604800000L;
        Integer num3 = 81920;
        String str = l10 == null ? " maxStorageSizeInBytes" : "";
        if (num == null) {
            str = defpackage.g.d(str, " loadBatchSize");
        }
        if (num2 == null) {
            str = defpackage.g.d(str, " criticalSectionEnterTimeoutMs");
        }
        if (l11 == null) {
            str = defpackage.g.d(str, " eventCleanUpAge");
        }
        if (num3 == null) {
            str = defpackage.g.d(str, " maxBlobByteSizePerRow");
        }
        if (!str.isEmpty()) {
            throw new IllegalStateException(defpackage.g.d("Missing required properties:", str));
        }
        f13555a = new a(l10.longValue(), num.intValue(), num2.intValue(), l11.longValue(), num3.intValue());
    }

    public abstract int a();

    public abstract long b();

    public abstract int c();

    public abstract int d();

    public abstract long e();
}
