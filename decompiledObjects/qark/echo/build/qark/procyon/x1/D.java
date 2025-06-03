// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class D extends o
{
    public static final a q;
    private static final long serialVersionUID = 1L;
    public final r p;
    
    static {
        q = new a(null);
    }
    
    public D(final r p2, final String s) {
        Intrinsics.checkNotNullParameter(p2, "requestError");
        super(s);
        this.p = p2;
    }
    
    public final r c() {
        return this.p;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{FacebookServiceException: ");
        sb.append("httpResponseCode: ");
        sb.append(this.p.f());
        sb.append(", facebookErrorCode: ");
        sb.append(this.p.b());
        sb.append(", facebookErrorType: ");
        sb.append(this.p.d());
        sb.append(", message: ");
        sb.append(this.p.c());
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return string;
    }
    
    public static final class a
    {
    }
}
