package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@ExperimentalWindowApi
@Metadata
/* loaded from: classes.dex */
public interface EmbeddingBackend {
    @NotNull
    Set<EmbeddingRule> getSplitRules();

    boolean isSplitSupported();

    void registerRule(@NotNull EmbeddingRule embeddingRule);

    void registerSplitListenerForActivity(@NotNull Activity activity, @NotNull Executor executor, @NotNull H.a aVar);

    void setSplitRules(@NotNull Set<? extends EmbeddingRule> set);

    void unregisterRule(@NotNull EmbeddingRule embeddingRule);

    void unregisterSplitListenerForActivity(@NotNull H.a aVar);
}
