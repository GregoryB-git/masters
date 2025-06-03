package f2;

import dc.l;
import io.flutter.plugins.firebase.crashlytics.Constants;
import p2.m0;

/* loaded from: classes.dex */
public abstract class g<T> {

    public static final class a {
        public static h a(Object obj, int i10) {
            m0 m0Var = m0.f12892d;
            ec.i.e(obj, "<this>");
            a0.j.p(i10, "verificationMode");
            return new h(obj, i10, m0Var);
        }
    }

    static {
        new a();
    }

    public static String b(Object obj, String str) {
        ec.i.e(obj, "value");
        ec.i.e(str, Constants.MESSAGE);
        return str + " value: " + obj;
    }

    public abstract T a();

    public abstract g<T> c(String str, l<? super T, Boolean> lVar);
}
