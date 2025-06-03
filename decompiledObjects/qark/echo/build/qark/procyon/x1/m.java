// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class m extends o
{
    public static final a r;
    public static final long serialVersionUID = 1L;
    public final int p;
    public final String q;
    
    static {
        r = new a(null);
    }
    
    public m(final String s, final int p3, final String q) {
        super(s);
        this.p = p3;
        this.q = q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(this.p);
        sb.append(", message: ");
        sb.append(this.getMessage());
        sb.append(", url: ");
        sb.append(this.q);
        sb.append("}");
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return string;
    }
    
    public static final class a
    {
    }
}
