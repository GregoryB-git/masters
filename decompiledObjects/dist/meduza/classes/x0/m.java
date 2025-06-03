package x0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import b1.k.a;
import b1.k.b;
import b1.p;
import b1.s0;
import b1.t0;
import d.h;
import e0.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;
import s1.e;
import u.a0;
import u.b.a;
import u.b.e;
import u.b.f;
import u.v;
import v.d;

public class m
  extends b.j
  implements b.e
{
  public static final String LIFECYCLE_TAG = "android:support:lifecycle";
  public boolean mCreated;
  public final p mFragmentLifecycleRegistry = new p(this);
  public final r mFragments = new r(new a());
  public boolean mResumed;
  public boolean mStopped = true;
  
  public m()
  {
    init();
  }
  
  public m(int paramInt)
  {
    super(paramInt);
    init();
  }
  
  private void init()
  {
    getSavedStateRegistry().c("android:support:lifecycle", new j(this, 0));
    addOnConfigurationChangedListener(new k(this, 0));
    addOnNewIntentListener(new l(this, 0));
    addOnContextAvailableListener(new b.g(this, 1));
  }
  
  private void lambda$init$3(Context paramContext)
  {
    paramContext = mFragments.a;
    d.c(paramContext, paramContext, null);
  }
  
  private static boolean markState(y paramy, k.b paramb)
  {
    k.b localb = k.b.d;
    paramy = c.g().iterator();
    boolean bool1 = false;
    while (paramy.hasNext())
    {
      i locali = (i)paramy.next();
      if (locali != null)
      {
        boolean bool2 = bool1;
        if (locali.getHost() != null) {
          bool2 = bool1 | markState(locali.getChildFragmentManager(), paramb);
        }
        o0 localo0 = mViewLifecycleOwner;
        bool1 = bool2;
        if (localo0 != null)
        {
          localo0.b();
          bool1 = bool2;
          if (d.c.f(localb))
          {
            mViewLifecycleOwner.d.h(paramb);
            bool1 = true;
          }
        }
        if (mLifecycleRegistry.c.f(localb))
        {
          mLifecycleRegistry.h(paramb);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public final View dispatchFragmentsOnCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    return mFragments.a.d.f.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    if (!shouldDumpInternalState(paramArrayOfString)) {
      return;
    }
    paramPrintWriter.print(paramString);
    paramPrintWriter.print("Local FragmentActivity ");
    paramPrintWriter.print(Integer.toHexString(System.identityHashCode(this)));
    paramPrintWriter.println(" State:");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(paramString);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    paramPrintWriter.print((String)localObject);
    paramPrintWriter.print("mCreated=");
    paramPrintWriter.print(mCreated);
    paramPrintWriter.print(" mResumed=");
    paramPrintWriter.print(mResumed);
    paramPrintWriter.print(" mStopped=");
    paramPrintWriter.print(mStopped);
    if (getApplication() != null) {
      d1.a.a(this).b((String)localObject, paramPrintWriter);
    }
    mFragments.a.d.w(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
  }
  
  public y getSupportFragmentManager()
  {
    return mFragments.a.d;
  }
  
  @Deprecated
  public d1.a getSupportLoaderManager()
  {
    return d1.a.a(this);
  }
  
  public void markFragmentsCreated()
  {
    while (markState(getSupportFragmentManager(), k.b.c)) {}
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    mFragments.a();
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  @Deprecated
  public void onAttachFragment(i parami) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    mFragmentLifecycleRegistry.f(k.a.ON_CREATE);
    paramBundle = mFragments.a.d;
    H = false;
    I = false;
    O.i = false;
    paramBundle.v(1);
  }
  
  public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(paramView, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
  {
    View localView = dispatchFragmentsOnCreateView(null, paramString, paramContext, paramAttributeSet);
    if (localView == null) {
      return super.onCreateView(paramString, paramContext, paramAttributeSet);
    }
    return localView;
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    mFragments.a.d.m();
    mFragmentLifecycleRegistry.f(k.a.ON_DESTROY);
  }
  
  public boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    if (paramInt == 6) {
      return mFragments.a.d.k(paramMenuItem);
    }
    return false;
  }
  
  public void onPause()
  {
    super.onPause();
    mResumed = false;
    mFragments.a.d.v(5);
    mFragmentLifecycleRegistry.f(k.a.ON_PAUSE);
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    onResumeFragments();
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    mFragments.a();
    super.onRequestPermissionsResult(paramInt, paramArrayOfString, paramArrayOfInt);
  }
  
  public void onResume()
  {
    mFragments.a();
    super.onResume();
    mResumed = true;
    mFragments.a.d.A(true);
  }
  
  public void onResumeFragments()
  {
    mFragmentLifecycleRegistry.f(k.a.ON_RESUME);
    z localz = mFragments.a.d;
    H = false;
    I = false;
    O.i = false;
    localz.v(7);
  }
  
  public void onStart()
  {
    mFragments.a();
    super.onStart();
    mStopped = false;
    if (!mCreated)
    {
      mCreated = true;
      localz = mFragments.a.d;
      H = false;
      I = false;
      O.i = false;
      localz.v(4);
    }
    mFragments.a.d.A(true);
    mFragmentLifecycleRegistry.f(k.a.ON_START);
    z localz = mFragments.a.d;
    H = false;
    I = false;
    O.i = false;
    localz.v(5);
  }
  
  public void onStateNotSaved()
  {
    mFragments.a();
  }
  
  public void onStop()
  {
    super.onStop();
    mStopped = true;
    markFragmentsCreated();
    z localz = mFragments.a.d;
    I = true;
    O.i = true;
    localz.v(4);
    mFragmentLifecycleRegistry.f(k.a.ON_STOP);
  }
  
  public void setEnterSharedElementCallback(a0 parama0)
  {
    int i = u.b.a;
    if (parama0 != null) {
      parama0 = new b.f(parama0);
    } else {
      parama0 = null;
    }
    b.a.c(this, parama0);
  }
  
  public void setExitSharedElementCallback(a0 parama0)
  {
    int i = u.b.a;
    if (parama0 != null) {
      parama0 = new b.f(parama0);
    } else {
      parama0 = null;
    }
    b.a.d(this, parama0);
  }
  
  public void startActivityFromFragment(i parami, Intent paramIntent, int paramInt)
  {
    startActivityFromFragment(parami, paramIntent, paramInt, null);
  }
  
  public void startActivityFromFragment(i parami, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt == -1)
    {
      paramInt = u.b.a;
      startActivityForResult(paramIntent, -1, paramBundle);
      return;
    }
    parami.startActivityForResult(paramIntent, paramInt, paramBundle);
  }
  
  @Deprecated
  public void startIntentSenderFromFragment(i parami, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (paramInt1 == -1)
    {
      int i = u.b.a;
      startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    }
    parami.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }
  
  public void supportFinishAfterTransition()
  {
    int i = u.b.a;
    b.a.a(this);
  }
  
  @Deprecated
  public void supportInvalidateOptionsMenu()
  {
    invalidateMenu();
  }
  
  public void supportPostponeEnterTransition()
  {
    int i = u.b.a;
    b.a.b(this);
  }
  
  public void supportStartPostponedEnterTransition()
  {
    int i = u.b.a;
    b.a.e(this);
  }
  
  @Deprecated
  public final void validateRequestPermissionsRequestCode(int paramInt) {}
  
  public final class a
    extends t<m>
    implements v.c, d, v, u.w, t0, b.y, h, e, c0, e0.j
  {
    public a()
    {
      super();
    }
    
    public final void a(i parami)
    {
      onAttachFragment(parami);
    }
    
    public final void addMenuProvider(o paramo)
    {
      m.this.addMenuProvider(paramo);
    }
    
    public final void addOnConfigurationChangedListener(d0.a<Configuration> parama)
    {
      m.this.addOnConfigurationChangedListener(parama);
    }
    
    public final void addOnMultiWindowModeChangedListener(d0.a<u.l> parama)
    {
      m.this.addOnMultiWindowModeChangedListener(parama);
    }
    
    public final void addOnPictureInPictureModeChangedListener(d0.a<u.y> parama)
    {
      m.this.addOnPictureInPictureModeChangedListener(parama);
    }
    
    public final void addOnTrimMemoryListener(d0.a<Integer> parama)
    {
      m.this.addOnTrimMemoryListener(parama);
    }
    
    public final View b(int paramInt)
    {
      return findViewById(paramInt);
    }
    
    public final boolean c()
    {
      Window localWindow = getWindow();
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
      dump("  ", null, paramPrintWriter, paramArrayOfString);
    }
    
    public final m e()
    {
      return m.this;
    }
    
    public final LayoutInflater f()
    {
      return getLayoutInflater().cloneInContext(m.this);
    }
    
    public final boolean g(String paramString)
    {
      return u.b.b(m.this, paramString);
    }
    
    public final d.g getActivityResultRegistry()
    {
      return m.this.getActivityResultRegistry();
    }
    
    public final b1.k getLifecycle()
    {
      return mFragmentLifecycleRegistry;
    }
    
    public final b.w getOnBackPressedDispatcher()
    {
      return m.this.getOnBackPressedDispatcher();
    }
    
    public final s1.c getSavedStateRegistry()
    {
      return m.this.getSavedStateRegistry();
    }
    
    public final s0 getViewModelStore()
    {
      return m.this.getViewModelStore();
    }
    
    public final void i()
    {
      invalidateMenu();
    }
    
    public final void removeMenuProvider(o paramo)
    {
      m.this.removeMenuProvider(paramo);
    }
    
    public final void removeOnConfigurationChangedListener(d0.a<Configuration> parama)
    {
      m.this.removeOnConfigurationChangedListener(parama);
    }
    
    public final void removeOnMultiWindowModeChangedListener(d0.a<u.l> parama)
    {
      m.this.removeOnMultiWindowModeChangedListener(parama);
    }
    
    public final void removeOnPictureInPictureModeChangedListener(d0.a<u.y> parama)
    {
      m.this.removeOnPictureInPictureModeChangedListener(parama);
    }
    
    public final void removeOnTrimMemoryListener(d0.a<Integer> parama)
    {
      m.this.removeOnTrimMemoryListener(parama);
    }
  }
}

/* Location:
 * Qualified Name:     x0.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */