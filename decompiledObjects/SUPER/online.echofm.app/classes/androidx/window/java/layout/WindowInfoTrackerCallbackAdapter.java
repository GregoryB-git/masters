package androidx.window.java.layout;

import H.a;
import V5.o;
import V5.t;
import X5.d;
import Z5.f;
import Z5.k;
import android.app.Activity;
import androidx.window.layout.WindowInfoTracker;
import g6.p;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p6.I;
import p6.J;
import p6.g;
import p6.i0;
import p6.q0;
import p6.q0.a;
import s6.c;

@Metadata
public final class WindowInfoTrackerCallbackAdapter
  implements WindowInfoTracker
{
  @NotNull
  private final Map<a, q0> consumerToJobMap;
  @NotNull
  private final ReentrantLock lock;
  @NotNull
  private final WindowInfoTracker tracker;
  
  public WindowInfoTrackerCallbackAdapter(@NotNull WindowInfoTracker paramWindowInfoTracker)
  {
    tracker = paramWindowInfoTracker;
    lock = new ReentrantLock();
    consumerToJobMap = new LinkedHashMap();
  }
  
  private final <T> void addListener(Executor paramExecutor, a parama, s6.b paramb)
  {
    ReentrantLock localReentrantLock = lock;
    localReentrantLock.lock();
    try
    {
      if (consumerToJobMap.get(parama) == null)
      {
        paramExecutor = J.a(i0.a(paramExecutor));
        Map localMap = consumerToJobMap;
        k local1 = new androidx/window/java/layout/WindowInfoTrackerCallbackAdapter$addListener$1$1;
        local1.<init>(paramb, parama, null);
        localMap.put(parama, g.d(paramExecutor, null, null, local1, 3, null));
      }
    }
    finally
    {
      break label91;
    }
    paramExecutor = t.a;
    localReentrantLock.unlock();
    return;
    label91:
    localReentrantLock.unlock();
    throw paramExecutor;
  }
  
  private final void removeListener(a parama)
  {
    ReentrantLock localReentrantLock = lock;
    localReentrantLock.lock();
    try
    {
      q0 localq0 = (q0)consumerToJobMap.get(parama);
      if (localq0 != null) {
        q0.a.a(localq0, null, 1, null);
      }
      parama = (q0)consumerToJobMap.remove(parama);
      return;
    }
    finally
    {
      localReentrantLock.unlock();
    }
  }
  
  public final void addWindowLayoutInfoListener(@NotNull Activity paramActivity, @NotNull Executor paramExecutor, @NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    Intrinsics.checkNotNullParameter(paramExecutor, "executor");
    Intrinsics.checkNotNullParameter(parama, "consumer");
    addListener(paramExecutor, parama, tracker.windowLayoutInfo(paramActivity));
  }
  
  public final void removeWindowLayoutInfoListener(@NotNull a parama)
  {
    Intrinsics.checkNotNullParameter(parama, "consumer");
    removeListener(parama);
  }
  
  @NotNull
  public s6.b windowLayoutInfo(@NotNull Activity paramActivity)
  {
    Intrinsics.checkNotNullParameter(paramActivity, "activity");
    return tracker.windowLayoutInfo(paramActivity);
  }
}

/* Location:
 * Qualified Name:     androidx.window.java.layout.WindowInfoTrackerCallbackAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */