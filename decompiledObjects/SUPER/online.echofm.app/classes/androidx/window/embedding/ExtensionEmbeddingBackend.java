package androidx.window.embedding;

import H.a;
import V5.t;
import W5.m;
import android.app.Activity;
import android.util.Log;
import androidx.window.core.ExperimentalWindowApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class ExtensionEmbeddingBackend
  implements EmbeddingBackend
{
  @NotNull
  public static final Companion Companion = new Companion(null);
  @NotNull
  private static final String TAG = "EmbeddingBackend";
  private static volatile ExtensionEmbeddingBackend globalInstance;
  @NotNull
  private static final ReentrantLock globalLock = new ReentrantLock();
  private EmbeddingInterfaceCompat embeddingExtension;
  @NotNull
  private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks;
  @NotNull
  private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
  @NotNull
  private final CopyOnWriteArraySet<EmbeddingRule> splitRules;
  
  public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat paramEmbeddingInterfaceCompat)
  {
    embeddingExtension = paramEmbeddingInterfaceCompat;
    EmbeddingCallbackImpl localEmbeddingCallbackImpl = new EmbeddingCallbackImpl();
    splitInfoEmbeddingCallback = localEmbeddingCallbackImpl;
    splitChangeCallbacks = new CopyOnWriteArrayList();
    paramEmbeddingInterfaceCompat = embeddingExtension;
    if (paramEmbeddingInterfaceCompat != null) {
      paramEmbeddingInterfaceCompat.setEmbeddingCallback(localEmbeddingCallbackImpl);
    }
    splitRules = new CopyOnWriteArraySet();
  }
  
  public final EmbeddingInterfaceCompat getEmbeddingExtension()
  {
    return embeddingExtension;
  }
  
  @NotNull
  public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks()
  {
    return splitChangeCallbacks;
  }
  
  @NotNull
  public Set<EmbeddingRule> getSplitRules()
  {
    return splitRules;
  }
  
  public boolean isSplitSupported()
  {
    boolean bool;
    if (embeddingExtension != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void registerRule(@NotNull EmbeddingRule paramEmbeddingRule)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingRule, "rule");
    if (!splitRules.contains(paramEmbeddingRule))
    {
      splitRules.add(paramEmbeddingRule);
      paramEmbeddingRule = embeddingExtension;
      if (paramEmbeddingRule != null) {
        paramEmbeddingRule.setSplitRules(splitRules);
      }
    }
  }
  
  public void registerSplitListenerForActivity(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramExecutor, "executor");
    Intrinsics.checkNotNullParameter(parama, "callback");
    ReentrantLock localReentrantLock = globalLock;
    localReentrantLock.lock();
    try
    {
      if (getEmbeddingExtension() == null)
      {
        Log.v("EmbeddingBackend", "Extension not loaded, skipping callback registration.");
        parama.accept(m.f());
        localReentrantLock.unlock();
        return;
      }
    }
    finally
    {
      break label139;
      SplitListenerWrapper localSplitListenerWrapper = new androidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;
      localSplitListenerWrapper.<init>(paramActivity, paramExecutor, parama);
      getSplitChangeCallbacks().add(localSplitListenerWrapper);
      if (splitInfoEmbeddingCallback.getLastInfo() != null)
      {
        paramActivity = splitInfoEmbeddingCallback.getLastInfo();
        Intrinsics.b(paramActivity);
      }
      for (;;)
      {
        localSplitListenerWrapper.accept(paramActivity);
        break;
        paramActivity = m.f();
      }
      paramActivity = t.a;
      localReentrantLock.unlock();
      return;
      label139:
      localReentrantLock.unlock();
    }
  }
  
  public final void setEmbeddingExtension(EmbeddingInterfaceCompat paramEmbeddingInterfaceCompat)
  {
    embeddingExtension = paramEmbeddingInterfaceCompat;
  }
  
  public void setSplitRules(@NotNull Set<? extends EmbeddingRule> paramSet)
  {
    Intrinsics.checkNotNullParameter(paramSet, "rules");
    splitRules.clear();
    splitRules.addAll(paramSet);
    paramSet = embeddingExtension;
    if (paramSet != null) {
      paramSet.setSplitRules(splitRules);
    }
  }
  
  public void unregisterRule(@NotNull EmbeddingRule paramEmbeddingRule)
  {
    Intrinsics.checkNotNullParameter(paramEmbeddingRule, "rule");
    if (splitRules.contains(paramEmbeddingRule))
    {
      splitRules.remove(paramEmbeddingRule);
      paramEmbeddingRule = embeddingExtension;
      if (paramEmbeddingRule != null) {
        paramEmbeddingRule.setSplitRules(splitRules);
      }
    }
  }
  
  public void unregisterSplitListenerForActivity(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "consumer");
    ReentrantLock localReentrantLock = globalLock;
    localReentrantLock.lock();
    try
    {
      Iterator localIterator = getSplitChangeCallbacks().iterator();
      while (localIterator.hasNext())
      {
        SplitListenerWrapper localSplitListenerWrapper = (SplitListenerWrapper)localIterator.next();
        if (Intrinsics.a(localSplitListenerWrapper.getCallback(), parama)) {
          getSplitChangeCallbacks().remove(localSplitListenerWrapper);
        }
      }
    }
    finally
    {
      break label84;
    }
    parama = t.a;
    localReentrantLock.unlock();
    return;
    label84:
    localReentrantLock.unlock();
    throw parama;
  }
  
  @Metadata
  public static final class Companion
  {
    private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension()
    {
      Object localObject1 = null;
      Object localObject4;
      try
      {
        EmbeddingCompat.Companion localCompanion = EmbeddingCompat.Companion;
        Object localObject2 = localObject1;
        if (isExtensionVersionSupported(localCompanion.getExtensionApiLevel()))
        {
          localObject2 = localObject1;
          if (localCompanion.isEmbeddingAvailable())
          {
            localObject2 = new androidx/window/embedding/EmbeddingCompat;
            ((EmbeddingCompat)localObject2).<init>();
          }
        }
      }
      finally
      {
        Log.d("EmbeddingBackend", Intrinsics.i("Failed to load embedding extension: ", localObject3));
        localObject4 = localObject1;
      }
      if (localObject4 == null) {
        Log.d("EmbeddingBackend", "No supported embedding extension found");
      }
      return (EmbeddingInterfaceCompat)localObject4;
    }
    
    @NotNull
    public final ExtensionEmbeddingBackend getInstance()
    {
      if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null)
      {
        localObject1 = ExtensionEmbeddingBackend.access$getGlobalLock$cp();
        ((Lock)localObject1).lock();
        try
        {
          if (ExtensionEmbeddingBackend.access$getGlobalInstance$cp() == null)
          {
            EmbeddingInterfaceCompat localEmbeddingInterfaceCompat = ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension();
            ExtensionEmbeddingBackend localExtensionEmbeddingBackend = new androidx/window/embedding/ExtensionEmbeddingBackend;
            localExtensionEmbeddingBackend.<init>(localEmbeddingInterfaceCompat);
            ExtensionEmbeddingBackend.access$setGlobalInstance$cp(localExtensionEmbeddingBackend);
          }
        }
        finally
        {
          break label62;
        }
        t localt = t.a;
        ((Lock)localObject1).unlock();
        break label70;
        label62:
        ((Lock)localObject1).unlock();
        throw localt;
      }
      label70:
      Object localObject1 = ExtensionEmbeddingBackend.access$getGlobalInstance$cp();
      Intrinsics.b(localObject1);
      return (ExtensionEmbeddingBackend)localObject1;
    }
    
    public final boolean isExtensionVersionSupported(Integer paramInteger)
    {
      boolean bool = false;
      if (paramInteger == null) {
        return false;
      }
      if (paramInteger.intValue() >= 1) {
        bool = true;
      }
      return bool;
    }
  }
  
  @Metadata
  public final class EmbeddingCallbackImpl
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
  
  @Metadata
  public static final class SplitListenerWrapper
  {
    @NotNull
    private final Activity activity;
    @NotNull
    private final a callback;
    @NotNull
    private final Executor executor;
    private List<SplitInfo> lastValue;
    
    public SplitListenerWrapper(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
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
}

/* Location:
 * Qualified Name:     androidx.window.embedding.ExtensionEmbeddingBackend
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */