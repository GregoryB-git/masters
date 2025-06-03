/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package R;

import Q.b;
import R.c;
import W5.m;
import X5.g;
import android.content.Context;
import g6.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;
import p6.J;
import p6.J0;
import p6.W;

public abstract class a {
    public static final i6.a a(String string2, b b8, l l8, I i8) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(l8, "produceMigrations");
        Intrinsics.checkNotNullParameter(i8, "scope");
        return new c(string2, b8, l8, i8);
    }

    public static /* synthetic */ i6.a b(String string2, b b8, l l8, I i8, int n8, Object object) {
        if ((n8 & 2) != 0) {
            b8 = null;
        }
        if ((n8 & 4) != 0) {
            l8 = .o;
        }
        if ((n8 & 8) != 0) {
            i8 = J.a(W.b().k(J0.b(null, 1, null)));
        }
        return a.a(string2, b8, l8, i8);
    }

}

