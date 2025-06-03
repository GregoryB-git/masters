package B0;

import A0.y;
import d0.AbstractC1203z;
import g0.AbstractC1297a;
import j3.C1371a;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class g {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final Pattern f584a = Pattern.compile(".*-.*");

        public static String b(y yVar) {
            AbstractC1297a.a(yVar != null);
            int k7 = AbstractC1203z.k(yVar.m().f12726n);
            if (k7 == -1) {
                k7 = AbstractC1203z.k(yVar.m().f12725m);
            }
            if (k7 == 1) {
                return C1371a.f15434e;
            }
            if (k7 == 2) {
                return "v";
            }
            return null;
        }

        public abstract g a();

        public abstract a c(long j7);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);
    }

    public abstract i0.k a(i0.k kVar);
}
