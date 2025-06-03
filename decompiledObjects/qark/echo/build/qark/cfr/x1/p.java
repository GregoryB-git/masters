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
import x1.K;
import x1.o;
import x1.r;

public final class p
extends o {
    public final K p;

    public p(K k8, String string2) {
        super(string2);
        this.p = k8;
    }

    @Override
    public String toString() {
        Object object = this.p;
        object = object == null ? null : object.b();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{FacebookGraphResponseException: ");
        String string2 = this.getMessage();
        if (string2 != null) {
            stringBuilder.append(string2);
            stringBuilder.append(" ");
        }
        if (object != null) {
            stringBuilder.append("httpResponseCode: ");
            stringBuilder.append(object.f());
            stringBuilder.append(", facebookErrorCode: ");
            stringBuilder.append(object.b());
            stringBuilder.append(", facebookErrorType: ");
            stringBuilder.append(object.d());
            stringBuilder.append(", message: ");
            stringBuilder.append(object.c());
            stringBuilder.append("}");
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "errorStringBuilder.toString()");
        return object;
    }
}

