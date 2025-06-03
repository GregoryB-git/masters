// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import androidx.window.extensions.embedding.EmbeddingRule;
import java.util.Set;
import kotlin.Metadata;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;

@Metadata
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent
{
    public EmptyEmbeddingComponent() {
    }
    
    public void setEmbeddingRules(@NotNull final Set<EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "splitRules");
    }
    
    public void setSplitInfoCallback(@NotNull final Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
    }
}
