package androidx.window.embedding;

import H.a;
import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public abstract interface EmbeddingBackend
{
  @NotNull
  public abstract Set<EmbeddingRule> getSplitRules();
  
  public abstract boolean isSplitSupported();
  
  public abstract void registerRule(@NotNull EmbeddingRule paramEmbeddingRule);
  
  public abstract void registerSplitListenerForActivity(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama);
  
  public abstract void setSplitRules(@NotNull Set<? extends EmbeddingRule> paramSet);
  
  public abstract void unregisterRule(@NotNull EmbeddingRule paramEmbeddingRule);
  
  public abstract void unregisterSplitListenerForActivity(@NotNull a parama);
}

/* Location:
 * Qualified Name:     androidx.window.embedding.EmbeddingBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */