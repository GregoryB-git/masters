package x0;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import b1.k;
import b1.s0;
import b1.t0;
import d.g;
import d.h;
import d0.a;
import e0.o;
import java.io.PrintWriter;
import s1.e;
import u.b;
import u.l;
import u.v;
import v.d;

public final class m$a
  extends t<m>
  implements v.c, d, v, u.w, t0, b.y, h, e, c0, e0.j
{
  public m$a(m paramm)
  {
    super(paramm);
  }
  
  public final void a(i parami)
  {
    e.onAttachFragment(parami);
  }
  
  public final void addMenuProvider(o paramo)
  {
    e.addMenuProvider(paramo);
  }
  
  public final void addOnConfigurationChangedListener(a<Configuration> parama)
  {
    e.addOnConfigurationChangedListener(parama);
  }
  
  public final void addOnMultiWindowModeChangedListener(a<l> parama)
  {
    e.addOnMultiWindowModeChangedListener(parama);
  }
  
  public final void addOnPictureInPictureModeChangedListener(a<u.y> parama)
  {
    e.addOnPictureInPictureModeChangedListener(parama);
  }
  
  public final void addOnTrimMemoryListener(a<Integer> parama)
  {
    e.addOnTrimMemoryListener(parama);
  }
  
  public final View b(int paramInt)
  {
    return e.findViewById(paramInt);
  }
  
  public final boolean c()
  {
    Window localWindow = e.getWindow();
    boolean bool;
    if ((localWindow != null) && (localWindow.peekDecorView() != null)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void d(PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    e.dump("  ", null, paramPrintWriter, paramArrayOfString);
  }
  
  public final m e()
  {
    return e;
  }
  
  public final LayoutInflater f()
  {
    return e.getLayoutInflater().cloneInContext(e);
  }
  
  public final boolean g(String paramString)
  {
    return b.b(e, paramString);
  }
  
  public final g getActivityResultRegistry()
  {
    return e.getActivityResultRegistry();
  }
  
  public final k getLifecycle()
  {
    return e.mFragmentLifecycleRegistry;
  }
  
  public final b.w getOnBackPressedDispatcher()
  {
    return e.getOnBackPressedDispatcher();
  }
  
  public final s1.c getSavedStateRegistry()
  {
    return e.getSavedStateRegistry();
  }
  
  public final s0 getViewModelStore()
  {
    return e.getViewModelStore();
  }
  
  public final void i()
  {
    e.invalidateMenu();
  }
  
  public final void removeMenuProvider(o paramo)
  {
    e.removeMenuProvider(paramo);
  }
  
  public final void removeOnConfigurationChangedListener(a<Configuration> parama)
  {
    e.removeOnConfigurationChangedListener(parama);
  }
  
  public final void removeOnMultiWindowModeChangedListener(a<l> parama)
  {
    e.removeOnMultiWindowModeChangedListener(parama);
  }
  
  public final void removeOnPictureInPictureModeChangedListener(a<u.y> parama)
  {
    e.removeOnPictureInPictureModeChangedListener(parama);
  }
  
  public final void removeOnTrimMemoryListener(a<Integer> parama)
  {
    e.removeOnTrimMemoryListener(parama);
  }
}

/* Location:
 * Qualified Name:     x0.m.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */