package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
final class EmptyEmbeddingComponent
  implements ActivityEmbeddingComponent
{
  public void setEmbeddingRules(@NotNull Set<EmbeddingRule> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "splitRules");
  }
  
  public void setSplitInfoCallback(@NotNull Consumer<List<SplitInfo>> paramConsumer)
  {
    Intrinsics.checkNotNullParameter(paramConsumer, "consumer");
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmptyEmbeddingComponent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */