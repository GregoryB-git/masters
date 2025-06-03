package androidx.window.embedding;

import H.a;
import V5.t;
import W5.I;
import W5.m;
import android.app.Activity;
import android.content.Context;
import androidx.window.core.ExperimentalWindowApi;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitController
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  private static volatile SplitController globalInstance;
  @NotNull
  private static final ReentrantLock globalLock = new ReentrantLock();
  public static final boolean sDebug = false;
  @NotNull
  private final EmbeddingBackend embeddingBackend = ExtensionEmbeddingBackend.Companion.getInstance();
  @NotNull
  private Set<? extends EmbeddingRule> staticSplitRules = I.b();
  
  @NotNull
  public static final SplitController getInstance()
  {
    return Companion.getInstance();
  }
  
  public static final void initialize(@NotNull Context paramContext, int paramInt)
  {
    Companion.initialize(paramContext, paramInt);
  }
  
  private final void setStaticSplitRules(Set<? extends EmbeddingRule> paramSet)
  {
    staticSplitRules = paramSet;
    embeddingBackend.setSplitRules(paramSet);
  }
  
  public final void addSplitListener(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramExecutor, "executor");
    Intrinsics.checkNotNullParameter(parama, "consumer");
    embeddingBackend.registerSplitListenerForActivity(paramActivity, paramExecutor, parama);
  }
  
  public final void clearRegisteredRules()
  {
    embeddingBackend.setSplitRules(staticSplitRules);
  }
  
  @NotNull
  public final Set<EmbeddingRule> getSplitRules()
  {
    return m.J(embeddingBackend.getSplitRules());
  }
  
  public final boolean isSplitSupported()
  {
    return embeddingBackend.isSplitSupported();
  }
  
  public final void registerRule(@NotNull EmbeddingRule paramEmbeddingRule)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingRule, "rule");
    embeddingBackend.registerRule(paramEmbeddingRule);
  }
  
  public final void removeSplitListener(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "consumer");
    embeddingBackend.unregisterSplitListenerForActivity(parama);
  }
  
  public final void unregisterRule(@NotNull EmbeddingRule paramEmbeddingRule)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingRule, "rule");
    embeddingBackend.unregisterRule(paramEmbeddingRule);
  }
  
  @Metadata
  public static final class Companion
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
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */