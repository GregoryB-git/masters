package z2;

import M2.e;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import t.a;

public final class Z
  extends Fragment
  implements g
{
  public static final WeakHashMap r = new WeakHashMap();
  public final Map o = Collections.synchronizedMap(new a());
  public int p = 0;
  public Bundle q;
  
  public static Z f(Activity paramActivity)
  {
    WeakHashMap localWeakHashMap = r;
    Object localObject = (WeakReference)localWeakHashMap.get(paramActivity);
    if (localObject != null)
    {
      localObject = (Z)((Reference)localObject).get();
      if (localObject != null) {
        return (Z)localObject;
      }
    }
    try
    {
      Z localZ = (Z)paramActivity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      if (localZ != null)
      {
        localObject = localZ;
        if (!localZ.isRemoving()) {}
      }
      else
      {
        localObject = new Z();
        paramActivity.getFragmentManager().beginTransaction().add((Fragment)localObject, "LifecycleFragmentImpl").commitAllowingStateLoss();
      }
      localWeakHashMap.put(paramActivity, new WeakReference(localObject));
      return (Z)localObject;
    }
    catch (ClassCastException paramActivity)
    {
      throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", paramActivity);
    }
  }
  
  public final void a(String paramString, LifecycleCallback paramLifecycleCallback)
  {
    if (!o.containsKey(paramString))
    {
      o.put(paramString, paramLifecycleCallback);
      if (p > 0) {
        new e(Looper.getMainLooper()).post(new Y(this, paramLifecycleCallback, paramString));
      }
      return;
    }
    paramLifecycleCallback = new StringBuilder();
    paramLifecycleCallback.append("LifecycleCallback with tag ");
    paramLifecycleCallback.append(paramString);
    paramLifecycleCallback.append(" already added to this fragment.");
    throw new IllegalArgumentException(paramLifecycleCallback.toString());
  }
  
  public final LifecycleCallback b(String paramString, Class paramClass)
  {
    return (LifecycleCallback)paramClass.cast(o.get(paramString));
  }
  
  public final Activity c()
  {
    return getActivity();
  }
  
  public final void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).e(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    p = 1;
    q = paramBundle;
    Iterator localIterator = o.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      LifecycleCallback localLifecycleCallback = (LifecycleCallback)((Map.Entry)localObject).getValue();
      if (paramBundle != null) {
        localObject = paramBundle.getBundle((String)((Map.Entry)localObject).getKey());
      } else {
        localObject = null;
      }
      localLifecycleCallback.f((Bundle)localObject);
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    p = 5;
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).g();
    }
  }
  
  public final void onResume()
  {
    super.onResume();
    p = 3;
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).h();
    }
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (paramBundle == null) {
      return;
    }
    Iterator localIterator = o.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Bundle localBundle = new Bundle();
      ((LifecycleCallback)localEntry.getValue()).i(localBundle);
      paramBundle.putBundle((String)localEntry.getKey(), localBundle);
    }
  }
  
  public final void onStart()
  {
    super.onStart();
    p = 2;
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).j();
    }
  }
  
  public final void onStop()
  {
    super.onStop();
    p = 4;
    Iterator localIterator = o.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).k();
    }
  }
}

/* Location:
 * Qualified Name:     z2.Z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */