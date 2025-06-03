// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import H.a;
import java.util.concurrent.Executor;
import android.app.Activity;
import org.jetbrains.annotations.NotNull;
import java.util.Set;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public interface EmbeddingBackend
{
    @NotNull
    Set<EmbeddingRule> getSplitRules();
    
    boolean isSplitSupported();
    
    void registerRule(@NotNull final EmbeddingRule p0);
    
    void registerSplitListenerForActivity(@NotNull final Activity p0, @NotNull final Executor p1, @NotNull final a p2);
    
    void setSplitRules(@NotNull final Set<? extends EmbeddingRule> p0);
    
    void unregisterRule(@NotNull final EmbeddingRule p0);
    
    void unregisterSplitListenerForActivity(@NotNull final a p0);
}
