/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.List
 */
package com.google.firebase.abt.component;

import B3.c;
import B3.e;
import B3.h;
import B3.r;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import r4.b;
import u3.a;

@Keep
public class AbtRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(e e8) {
        return AbtRegistrar.lambda$getComponents$0(e8);
    }

    private static /* synthetic */ a lambda$getComponents$0(e e8) {
        return new a((Context)e8.a(Context.class), e8.g(w3.a.class));
    }

    public List<c> getComponents() {
        return Arrays.asList((Object[])new c[]{c.e(a.class).h("fire-abt").b(r.k(Context.class)).b(r.i(w3.a.class)).f(new u3.b()).d(), O4.h.b("fire-abt", "21.1.1")});
    }
}

