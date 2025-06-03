/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.String
 *  java.lang.Throwable
 */
package P;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a
extends IOException {
    public a(String string2, Throwable throwable) {
        Intrinsics.checkNotNullParameter(string2, "message");
        super(string2, throwable);
    }

    public /* synthetic */ a(String string2, Throwable throwable, int n8, g g8) {
        if ((n8 & 2) != 0) {
            throwable = null;
        }
        this(string2, throwable);
    }
}

