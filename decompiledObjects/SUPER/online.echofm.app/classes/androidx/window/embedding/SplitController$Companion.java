package androidx.window.embedding;

import V5.t;
import W5.I;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SplitController$Companion
{
  @NotNull
  public final SplitController getInstance()
  {
    if (SplitController.access$getGlobalInstance$cp() == null)
    {
      localObject1 = SplitController.access$getGlobalLock$cp();
      ((Lock)localObject1).lock();
      try
      {
        if (SplitController.access$getGlobalInstance$cp() == null)
        {
          SplitController localSplitController = new androidx/window/embedding/SplitController;
          localSplitController.<init>(null);
          SplitController.access$setGlobalInstance$cp(localSplitController);
        }
      }
      finally
      {
        break label55;
      }
      t localt = t.a;
      ((Lock)localObject1).unlock();
      break label63;
      label55:
      ((Lock)localObject1).unlock();
      throw localt;
    }
    label63:
    Object localObject1 = SplitController.access$getGlobalInstance$cp();
    Intrinsics.b(localObject1);
    return (SplitController)localObject1;
  }
  
  public final void initialize(@NotNull Context paramContext, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Set localSet = new SplitRuleParser().parseSplitRules$window_release(paramContext, paramInt);
    SplitController localSplitController = getInstance();
    paramContext = localSet;
    if (localSet == null) {
      paramContext = I.b();
    }
    SplitController.access$setStaticSplitRules(localSplitController, paramContext);
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitController.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */