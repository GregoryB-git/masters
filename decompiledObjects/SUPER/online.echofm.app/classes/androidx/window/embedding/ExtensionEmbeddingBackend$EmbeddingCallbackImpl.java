package androidx.window.embedding;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionEmbeddingBackend$EmbeddingCallbackImpl
  implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface
{
  private List<SplitInfo> lastInfo;
  
  public final List<SplitInfo> getLastInfo()
  {
    return lastInfo;
  }
  
  public void onSplitInfoChanged(@NotNull List<SplitInfo> paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "splitInfo");
    lastInfo = paramList;
    Iterator localIterator = this$0.getSplitChangeCallbacks().iterator();
    while (localIterator.hasNext()) {
      ((ExtensionEmbeddingBackend.SplitListenerWrapper)localIterator.next()).accept(paramList);
    }
  }
  
  public final void setLastInfo(List<SplitInfo> paramList)
  {
    lastInfo = paramList;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend.EmbeddingCallbackImpl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */