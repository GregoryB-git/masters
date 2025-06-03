/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firebase.crashlytics.ktx;

import B3.c;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Metadata
@Keep
public final class FirebaseCrashlyticsKtxRegistrar
implements ComponentRegistrar {
    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    public List<c> getComponents() {
        return m.f();
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

