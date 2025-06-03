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

public final class m
extends o {
    public static final a r = new a(null);
    public static final long serialVersionUID = 1L;
    public final int p;
    public final String q;

    public m(String string2, int n8, String string3) {
        super(string2);
        this.p = n8;
        this.q = string3;
    }

    @Override
    public String toString() {
        Object object = new StringBuilder();
        object.append("{FacebookDialogException: ");
        object.append("errorCode: ");
        object.append(this.p);
        object.append(", message: ");
        object.append(this.getMessage());
        object.append(", url: ");
        object.append(this.q);
        object.append("}");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
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

