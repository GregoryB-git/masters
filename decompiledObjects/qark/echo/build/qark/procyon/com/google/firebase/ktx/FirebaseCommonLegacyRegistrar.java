// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.ktx;

import org.jetbrains.annotations.NotNull;
import W5.m;
import O4.h;
import B3.c;
import java.util.List;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.google.firebase.components.ComponentRegistrar;

@Metadata
@Keep
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar
{
    @NotNull
    @Override
    public List<c> getComponents() {
        return (List<c>)m.b(h.b("fire-core-ktx", "20.4.2"));
    }
}
