package z2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
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

public final class b0
  extends Fragment
  implements g
{
  public static final WeakHashMap r0 = new WeakHashMap();
  public final Map o0 = Collections.synchronizedMap(new a());
  public int p0 = 0;
  public Bundle q0;
  
  public static b0 J1(androidx.fragment.app.e parame)
  {
    WeakHashMap localWeakHashMap = r0;
    Object localObject = (WeakReference)localWeakHashMap.get(parame);
    if (localObject != null)
    {
      localObject = (b0)((Reference)localObject).get();
      if (localObject != null) {
        return (b0)localObject;
      }
    }
    try
    {
      b0 localb0 = (b0)parame.n().h0("SupportLifecycleFragmentImpl");
      if (localb0 != null)
      {
        localObject = localb0;
        if (!localb0.b0()) {}
      }
      else
      {
        localObject = new b0();
        parame.n().m().d((Fragment)localObject, "SupportLifecycleFragmentImpl").g();
      }
      localWeakHashMap.put(parame, new WeakReference(localObject));
      return (b0)localObject;
    }
    catch (ClassCastException parame)
    {
      throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", parame);
    }
  }
  
  public final void H0()
  {
    super.H0();
    p0 = 3;
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).h();
    }
  }
  
  public final void I0(Bundle paramBundle)
  {
    super.I0(paramBundle);
    if (paramBundle == null) {
      return;
    }
    Iterator localIterator = o0.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Bundle localBundle = new Bundle();
      ((LifecycleCallback)localEntry.getValue()).i(localBundle);
      paramBundle.putBundle((String)localEntry.getKey(), localBundle);
    }
  }
  
  public final void J0()
  {
    super.J0();
    p0 = 2;
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).j();
    }
  }
  
  public final void K0()
  {
    super.K0();
    p0 = 4;
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).k();
    }
  }
  
  public final void a(String paramString, LifecycleCallback paramLifecycleCallback)
  {
    if (!o0.containsKey(paramString))
    {
      o0.put(paramString, paramLifecycleCallback);
      if (p0 > 0) {
        new M2.e(Looper.getMainLooper()).post(new a0(this, paramLifecycleCallback, paramString));
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
    return (LifecycleCallback)paramClass.cast(o0.get(paramString));
  }
  
  public final void h(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    super.h(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).a(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
    }
  }
  
  public final void h0(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.h0(paramInt1, paramInt2, paramIntent);
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).e(paramInt1, paramInt2, paramIntent);
    }
  }
  
  public final void m0(Bundle paramBundle)
  {
    super.m0(paramBundle);
    p0 = 1;
    q0 = paramBundle;
    Iterator localIterator = o0.entrySet().iterator();
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
  
  public final void r0()
  {
    super.r0();
    p0 = 5;
    Iterator localIterator = o0.values().iterator();
    while (localIterator.hasNext()) {
      ((LifecycleCallback)localIterator.next()).g();
    }
  }
}

/* Location:
 * Qualified Name:     z2.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */