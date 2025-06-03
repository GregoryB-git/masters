/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  java.lang.Object
 *  java.util.Set
 *  java.util.concurrent.Executor
 */
package androidx.window.embedding;

import H.a;
import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingRule;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public interface EmbeddingBackend {
    @NotNull
    public Set<EmbeddingRule> getSplitRules();

    public boolean isSplitSupported();

    public void registerRule(@NotNull EmbeddingRule var1);

    public void registerSplitListenerForActivity(@NotNull Activity var1, @NotNull Executor var2, @NotNull a var3);

    public void setSplitRules(@NotNull Set<? extends EmbeddingRule> var1);

    public void unregisterRule(@NotNull EmbeddingRule var1);

    public void unregisterSplitListenerForActivity(@NotNull a var1);
}

