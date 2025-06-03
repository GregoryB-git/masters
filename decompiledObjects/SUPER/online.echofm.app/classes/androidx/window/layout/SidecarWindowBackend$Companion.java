package androidx.window.layout;

import V5.t;
import android.content.Context;
import androidx.window.core.Version;
import androidx.window.core.Version.Companion;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
public final class SidecarWindowBackend$Companion
{
  @NotNull
  public final SidecarWindowBackend getInstance(@NotNull Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    if (SidecarWindowBackend.access$getGlobalInstance$cp() == null)
    {
      ReentrantLock localReentrantLock = SidecarWindowBackend.access$getGlobalLock$cp();
      localReentrantLock.lock();
      try
      {
        if (SidecarWindowBackend.access$getGlobalInstance$cp() == null)
        {
          paramContext = SidecarWindowBackend.Companion.initAndVerifyExtension(paramContext);
          SidecarWindowBackend localSidecarWindowBackend = new androidx/window/layout/SidecarWindowBackend;
          localSidecarWindowBackend.<init>(paramContext);
          SidecarWindowBackend.access$setGlobalInstance$cp(localSidecarWindowBackend);
        }
      }
      finally
      {
        break label69;
      }
      paramContext = t.a;
      localReentrantLock.unlock();
      break label77;
      label69:
      localReentrantLock.unlock();
      throw paramContext;
    }
    label77:
    paramContext = SidecarWindowBackend.access$getGlobalInstance$cp();
    Intrinsics.b(paramContext);
    return paramContext;
  }
  
  public final ExtensionInterfaceCompat initAndVerifyExtension(@NotNull Context paramContext)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    localObject1 = null;
    localObject2 = localObject1;
    try
    {
      if (isSidecarVersionSupported(SidecarCompat.Companion.getSidecarVersion()))
      {
        localObject2 = new androidx/window/layout/SidecarCompat;
        ((SidecarCompat)localObject2).<init>(paramContext);
        boolean bool = ((SidecarCompat)localObject2).validateExtensionInterface();
        if (!bool) {
          localObject2 = localObject1;
        }
      }
    }
    finally
    {
      for (;;)
      {
        localObject2 = localObject1;
      }
    }
    return (ExtensionInterfaceCompat)localObject2;
  }
  
  public final boolean isSidecarVersionSupported(Version paramVersion)
  {
    boolean bool = false;
    if (paramVersion == null) {
      return false;
    }
    if (paramVersion.compareTo(Version.Companion.getVERSION_0_1()) >= 0) {
      bool = true;
    }
    return bool;
  }
  
  public final void resetInstance()
  {
    SidecarWindowBackend.access$setGlobalInstance$cp(null);
  }
}

/* Location:
 * Qualified Name:     androidx.window.layout.SidecarWindowBackend.Companion
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */