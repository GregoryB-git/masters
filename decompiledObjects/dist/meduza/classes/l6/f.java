package l6;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import m6.j;
import x0.a;
import x0.i;
import x0.m;
import x0.y;

public class f
{
  public final g mLifecycleFragment;
  
  public f(g paramg)
  {
    mLifecycleFragment = paramg;
  }
  
  public static g getFragment(Activity paramActivity)
  {
    return getFragment(new e(paramActivity));
  }
  
  public static g getFragment(ContextWrapper paramContextWrapper)
  {
    throw new UnsupportedOperationException();
  }
  
  public static g getFragment(e parame)
  {
    Object localObject1 = a;
    Object localObject2;
    Object localObject3;
    if ((localObject1 instanceof m))
    {
      localObject2 = (m)localObject1;
      localObject1 = j1.b;
      parame = (WeakReference)((WeakHashMap)localObject1).get(localObject2);
      if (parame != null)
      {
        localObject3 = (j1)parame.get();
        parame = (e)localObject3;
        if (localObject3 != null) {
          break label129;
        }
      }
      try
      {
        localObject3 = (j1)((m)localObject2).getSupportFragmentManager().E("SLifecycleFragmentImpl");
        if (localObject3 != null)
        {
          parame = (e)localObject3;
          if (!((i)localObject3).isRemoving()) {}
        }
        else
        {
          parame = new j1();
          localObject3 = ((m)localObject2).getSupportFragmentManager();
          localObject3.getClass();
          localObject3 = new a((y)localObject3);
          ((a)localObject3).e(0, parame, "SLifecycleFragmentImpl");
          ((a)localObject3).d(true);
        }
        ((WeakHashMap)localObject1).put(localObject2, new WeakReference(parame));
        label129:
        return parame;
      }
      catch (ClassCastException parame)
      {
        throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", parame);
      }
    }
    if ((localObject1 instanceof Activity))
    {
      localObject2 = h1.b;
      parame = (WeakReference)((WeakHashMap)localObject2).get(localObject1);
      if (parame != null)
      {
        localObject3 = (h1)parame.get();
        parame = (e)localObject3;
        if (localObject3 != null) {
          break label246;
        }
      }
      try
      {
        localObject3 = (h1)((Activity)localObject1).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
        if (localObject3 != null)
        {
          parame = (e)localObject3;
          if (!((Fragment)localObject3).isRemoving()) {}
        }
        else
        {
          parame = new h1();
          ((Activity)localObject1).getFragmentManager().beginTransaction().add(parame, "LifecycleFragmentImpl").commitAllowingStateLoss();
        }
        ((WeakHashMap)localObject2).put(localObject1, new WeakReference(parame));
        label246:
        return parame;
      }
      catch (ClassCastException parame)
      {
        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", parame);
      }
    }
    throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
  }
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  public Activity getActivity()
  {
    Activity localActivity = mLifecycleFragment.b();
    j.i(localActivity);
    return localActivity;
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onCreate(Bundle paramBundle) {}
  
  public void onDestroy() {}
  
  public void onResume() {}
  
  public void onSaveInstanceState(Bundle paramBundle) {}
  
  public void onStart() {}
  
  public void onStop() {}
}

/* Location:
 * Qualified Name:     l6.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */