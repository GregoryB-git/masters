package androidx.window.embedding;

import H.a;
import android.app.Activity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class ExtensionEmbeddingBackend$SplitListenerWrapper
{
  @NotNull
  private final Activity activity;
  @NotNull
  private final a callback;
  @NotNull
  private final Executor executor;
  private List<SplitInfo> lastValue;
  
  public ExtensionEmbeddingBackend$SplitListenerWrapper(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    activity = paramActivity;
    executor = paramExecutor;
    callback = parama;
  }
  
  private static final void accept$lambda-1(SplitListenerWrapper paramSplitListenerWrapper, List paramList)
  {
    Intrinsics.checkNotNullParameter(paramSplitListenerWrapper, "this$0");
    Intrinsics.checkNotNullParameter(paramList, "$splitsWithActivity");
    paramSplitListenerWrapper.getCallback().accept(paramList);
  }
  
  public final void accept(@NotNull List<SplitInfo> paramList)
  {
    Intrinsics.checkNotNullParameter(paramList, "splitInfoList");
    Object localObject1 = (Iterable)paramList;
    paramList = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (((SplitInfo)localObject2).contains(activity)) {
        paramList.add(localObject2);
      }
    }
    if (Intrinsics.a(paramList, lastValue)) {
      return;
    }
    lastValue = paramList;
    executor.execute(new h(this, paramList));
  }
  
  @NotNull
  public final a getCallback()
  {
    return callback;
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend.SplitListenerWrapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */