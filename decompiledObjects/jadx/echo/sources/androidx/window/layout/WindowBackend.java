package androidx.window.layout;

import android.app.Activity;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(@NotNull Activity activity, @NotNull Executor executor, @NotNull H.a aVar);

    void unregisterLayoutChangeCallback(@NotNull H.a aVar);
}
