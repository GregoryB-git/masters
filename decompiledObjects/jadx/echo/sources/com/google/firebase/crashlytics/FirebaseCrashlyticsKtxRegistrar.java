package com.google.firebase.crashlytics;

import B3.C0342c;
import W5.o;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata
/* loaded from: classes.dex */
public final class FirebaseCrashlyticsKtxRegistrar implements ComponentRegistrar {

    @NotNull
    public static final a Companion = new a(null);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<C0342c> getComponents() {
        return o.f();
    }
}
