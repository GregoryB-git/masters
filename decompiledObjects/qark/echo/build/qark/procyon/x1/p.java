// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import kotlin.jvm.internal.Intrinsics;

public final class p extends o
{
    public final K p;
    
    public p(final K p2, final String s) {
        super(s);
        this.p = p2;
    }
    
    @Override
    public String toString() {
        final K p = this.p;
        r b;
        if (p == null) {
            b = null;
        }
        else {
            b = p.b();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        final String message = this.getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (b != null) {
            sb.append("httpResponseCode: ");
            sb.append(b.f());
            sb.append(", facebookErrorCode: ");
            sb.append(b.b());
            sb.append(", facebookErrorType: ");
            sb.append(b.d());
            sb.append(", message: ");
            sb.append(b.c());
            sb.append("}");
        }
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "errorStringBuilder.toString()");
        return string;
    }
}
