package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public abstract interface EmbeddingInterfaceCompat
{
  public abstract void setEmbeddingCallback(@NotNull EmbeddingCallbackInterface paramEmbeddingCallbackInterface);
  
  public abstract void setSplitRules(@NotNull Set<? extends EmbeddingRule> paramSet);
  
  @Metadata
  public static abstract interface EmbeddingCallbackInterface
  {
    public abstract void onSplitInfoChanged(@NotNull List<SplitInfo> paramList);
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingInterfaceCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */