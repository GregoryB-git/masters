package com.google.firebase.ktx;

import B3.C0342c;
import O4.h;
import W5.n;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* loaded from: classes.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0342c> getComponents() {
        return n.b(h.b("fire-core-ktx", "20.4.2"));
    }
}
