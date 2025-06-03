package o9;

import android.util.SparseArray;
import io.flutter.plugins.firebase.crashlytics.Constants;

/* loaded from: classes.dex */
public final class f extends u7.h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12102c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final a f12103a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12104b;

    public enum a {
        OK,
        CANCELLED,
        UNKNOWN,
        INVALID_ARGUMENT,
        DEADLINE_EXCEEDED,
        NOT_FOUND,
        /* JADX INFO: Fake field, exist only in values array */
        ALREADY_EXISTS,
        PERMISSION_DENIED,
        RESOURCE_EXHAUSTED,
        /* JADX INFO: Fake field, exist only in values array */
        FAILED_PRECONDITION,
        ABORTED,
        /* JADX INFO: Fake field, exist only in values array */
        OUT_OF_RANGE,
        UNIMPLEMENTED,
        INTERNAL,
        UNAVAILABLE,
        /* JADX INFO: Fake field, exist only in values array */
        DATA_LOSS,
        UNAUTHENTICATED;

        static {
            SparseArray sparseArray = new SparseArray();
            for (a aVar : values()) {
                a aVar2 = (a) sparseArray.get(aVar.ordinal());
                if (!(aVar2 == null)) {
                    throw new IllegalStateException(("Code value duplication between " + aVar2 + '&' + aVar.name()).toString());
                }
                sparseArray.put(aVar.ordinal(), aVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, a aVar, Object obj) {
        super(str);
        ec.i.e(str, Constants.MESSAGE);
        ec.i.e(aVar, "code");
        this.f12103a = aVar;
        this.f12104b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, a aVar, Throwable th) {
        super(str, th);
        ec.i.b(th);
        this.f12103a = aVar;
        this.f12104b = null;
    }
}
