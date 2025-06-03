/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package com.google.firebase.ktx;

import B3.c;
import O4.h;
import W5.m;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@Keep
public final class FirebaseCommonLegacyRegistrar
implements ComponentRegistrar {
    @NotNull
    public List<c> getComponents() {
        return m.b(h.b("fire-core-ktx", "20.4.2"));
    }
}

