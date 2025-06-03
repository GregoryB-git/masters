/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package x1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import x1.o;
import x1.r;

public final class D
extends o {
    public static final a q = new a(null);
    private static final long serialVersionUID = 1L;
    public final r p;

    public D(r r8, String string2) {
        Intrinsics.checkNotNullParameter(r8, "requestError");
        super(string2);
        this.p = r8;
    }

    public final r c() {
        return this.p;
    }

    @Override
    public String toString() {
        Object object = new StringBuilder();
        object.append("{FacebookServiceException: ");
        object.append("httpResponseCode: ");
        object.append(this.p.f());
        object.append(", facebookErrorCode: ");
        object.append(this.p.b());
        object.append(", facebookErrorType: ");
        object.append(this.p.d());
        object.append(", message: ");
        object.append(this.p.c());
        object.append("}");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return object;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

