// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.firebase.crashlytics;

import W5.m;
import B3.c;
import java.util.List;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;
import androidx.annotation.Keep;
import kotlin.Metadata;
import com.google.firebase.components.ComponentRegistrar;

@Metadata
@Keep
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar
{
    @NotNull
    public static final a Companion;
    
    static {
        Companion = new a(null);
    }
    
    @NotNull
    @Override
    public List<c> getComponents() {
        return (List<c>)m.f();
    }
    
    public static final class a
    {
    }
}
