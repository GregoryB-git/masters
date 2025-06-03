/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package d0;

import java.io.IOException;

public class A
extends IOException {
    public final boolean o;
    public final int p;

    public A(String string2, Throwable throwable, boolean bl, int n8) {
        super(string2, throwable);
        this.o = bl;
        this.p = n8;
    }

    public static A a(String string2, Throwable throwable) {
        return new A(string2, throwable, true, 1);
    }

    public static A b(String string2, Throwable throwable) {
        return new A(string2, throwable, true, 0);
    }

    public static A c(String string2, Throwable throwable) {
        return new A(string2, throwable, true, 4);
    }

    public static A d(String string2) {
        return new A(string2, null, false, 1);
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.getMessage());
        stringBuilder.append("{contentIsMalformed=");
        stringBuilder.append(this.o);
        stringBuilder.append(", dataType=");
        stringBuilder.append(this.p);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

