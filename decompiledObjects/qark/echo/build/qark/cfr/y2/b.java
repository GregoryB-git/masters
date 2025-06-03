/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package y2;

import com.google.android.gms.common.api.Status;

public class b
extends Exception {
    public final Status o;

    public b(Status status) {
        int n8 = status.d();
        String string2 = status.f() != null ? status.f() : "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n8);
        stringBuilder.append(": ");
        stringBuilder.append(string2);
        super(stringBuilder.toString());
        this.o = status;
    }

    public Status a() {
        return this.o;
    }
}

