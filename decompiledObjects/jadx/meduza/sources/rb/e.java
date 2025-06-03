package rb;

import ec.i;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class e<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13846a;

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f13847a;

        public a(Throwable th) {
            i.e(th, Constants.EXCEPTION);
            this.f13847a = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && i.a(this.f13847a, ((a) obj).f13847a);
        }

        public final int hashCode() {
            return this.f13847a.hashCode();
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("Failure(");
            l10.append(this.f13847a);
            l10.append(')');
            return l10.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f13847a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && i.a(this.f13846a, ((e) obj).f13846a);
    }

    public final int hashCode() {
        Object obj = this.f13846a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f13846a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
