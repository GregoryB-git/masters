package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.lifecycle.d;

@Keep
/* loaded from: classes.dex */
public class HiddenLifecycleReference {

    @NonNull
    private final d lifecycle;

    public HiddenLifecycleReference(@NonNull d dVar) {
        this.lifecycle = dVar;
    }

    @NonNull
    public d getLifecycle() {
        return this.lifecycle;
    }
}
