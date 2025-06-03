/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.database;

import B3.c;
import B3.h;
import B3.r;
import Q3.f;
import Q3.i;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import r4.a;
import s3.e;

@Keep
public class DatabaseRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    public static /* synthetic */ i a(B3.e e8) {
        return DatabaseRegistrar.lambda$getComponents$0(e8);
    }

    private static /* synthetic */ i lambda$getComponents$0(B3.e e8) {
        return new i((e)e8.a(e.class), e8.i(A3.a.class), e8.i(z3.a.class));
    }

    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(i.class).h("fire-rtdb").b(r.k(e.class)).b(r.a(A3.a.class)).b(r.a(z3.a.class)).f(new f()).d(), O4.h.b("fire-rtdb", "20.3.0")});
    }
}

