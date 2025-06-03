// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public interface EmbeddingInterfaceCompat
{
    void setEmbeddingCallback(@NotNull final EmbeddingCallbackInterface p0);
    
    void setSplitRules(@NotNull final Set<? extends EmbeddingRule> p0);
    
    @Metadata
    public interface EmbeddingCallbackInterface
    {
        void onSplitInfoChanged(@NotNull final List<SplitInfo> p0);
    }
}
