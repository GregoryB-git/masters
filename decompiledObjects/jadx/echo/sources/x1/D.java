package x1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D extends C2162o {

    /* renamed from: q, reason: collision with root package name */
    public static final a f20887q = new a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: p, reason: collision with root package name */
    public final r f20888p;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(r requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f20888p = requestError;
    }

    public final r c() {
        return this.f20888p;
    }

    @Override // x1.C2162o, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f20888p.f() + ", facebookErrorCode: " + this.f20888p.b() + ", facebookErrorType: " + this.f20888p.d() + ", message: " + this.f20888p.c() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
