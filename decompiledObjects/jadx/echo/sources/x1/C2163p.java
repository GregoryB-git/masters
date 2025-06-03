package x1;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163p extends C2162o {

    /* renamed from: p, reason: collision with root package name */
    public final K f21110p;

    public C2163p(K k7, String str) {
        super(str);
        this.f21110p = k7;
    }

    @Override // x1.C2162o, java.lang.Throwable
    public String toString() {
        K k7 = this.f21110p;
        r b7 = k7 == null ? null : k7.b();
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (b7 != null) {
            sb.append("httpResponseCode: ");
            sb.append(b7.f());
            sb.append(", facebookErrorCode: ");
            sb.append(b7.b());
            sb.append(", facebookErrorType: ");
            sb.append(b7.d());
            sb.append(", message: ");
            sb.append(b7.c());
            sb.append("}");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
