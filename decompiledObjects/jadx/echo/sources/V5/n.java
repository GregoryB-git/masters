package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class n implements Serializable {

    /* renamed from: o, reason: collision with root package name */
    public static final a f6797o = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        public final Throwable f6798o;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f6798o = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.a(this.f6798o, ((b) obj).f6798o);
        }

        public int hashCode() {
            return this.f6798o.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f6798o + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f6798o;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
