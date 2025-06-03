package d6;

import c6.AbstractC0854a;
import j6.c;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1229a extends AbstractC0854a {

    /* renamed from: d6.a$a, reason: collision with other inner class name */
    public static final class C0194a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0194a f13328a = new C0194a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f13329b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f13329b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f13329b = num2;
        }
    }

    @Override // b6.AbstractC0806a
    public c b() {
        return c(34) ? new k6.a() : super.b();
    }

    public final boolean c(int i7) {
        Integer num = C0194a.f13329b;
        return num == null || num.intValue() >= i7;
    }
}
