package O1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import x1.B;

public final class n
{
  public static final n a = new n();
  public static final Map b = new HashMap();
  
  public static final void a(final b paramb, a parama)
  {
    Intrinsics.checkNotNullParameter(paramb, "feature");
    Intrinsics.checkNotNullParameter(parama, "callback");
    q localq = q.a;
    q.h(new d(parama, paramb));
  }
  
  public static final void c(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "feature");
    B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(paramb.j(), B.B()).apply();
  }
  
  public static final b d(String paramString)
  {
    Intrinsics.checkNotNullParameter(paramString, "className");
    a.f();
    Map.Entry localEntry;
    b localb;
    do
    {
      Iterator localIterator = b.entrySet().iterator();
      String[] arrayOfString;
      int i;
      int j;
      while (j >= i)
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localEntry = (Map.Entry)localIterator.next();
        localb = (b)localEntry.getKey();
        arrayOfString = (String[])localEntry.getValue();
        i = arrayOfString.length;
        j = 0;
      }
      localEntry = arrayOfString[j];
      j++;
    } while (!i.s(paramString, localEntry, false, 2, null));
    return localb;
    return b.q;
  }
  
  public static final boolean g(b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "feature");
    Object localObject = b.q;
    boolean bool1 = false;
    if (localObject == paramb) {
      return false;
    }
    if (b.r == paramb) {
      return true;
    }
    localObject = B.l().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(paramb.j(), null);
    if ((localObject != null) && (Intrinsics.a(localObject, B.B()))) {
      return false;
    }
    localObject = paramb.h();
    boolean bool2;
    if (localObject == paramb)
    {
      bool2 = a.e(paramb);
    }
    else
    {
      bool2 = bool1;
      if (g((b)localObject))
      {
        bool2 = bool1;
        if (a.e(paramb)) {
          bool2 = true;
        }
      }
    }
    return bool2;
  }
  
  public final boolean b(b paramb)
  {
    boolean bool;
    switch (c.a[paramb.ordinal()])
    {
    default: 
      bool = true;
      break;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 14: 
    case 15: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    case 21: 
    case 22: 
    case 23: 
    case 24: 
      bool = false;
    }
    return bool;
  }
  
  public final boolean e(b paramb)
  {
    boolean bool = b(paramb);
    q localq = q.a;
    return q.d(paramb.j(), B.m(), bool);
  }
  
  public final void f()
  {
    try
    {
      Map localMap = b;
      boolean bool = localMap.isEmpty();
      if (!bool) {
        return;
      }
      localMap.put(b.w, new String[] { "com.facebook.appevents.aam." });
      localMap.put(b.t, new String[] { "com.facebook.appevents.codeless." });
      localMap.put(b.u, new String[] { "com.facebook.appevents.cloudbridge." });
      localMap.put(b.M, new String[] { "com.facebook.internal.instrument.errorreport." });
      localMap.put(b.N, new String[] { "com.facebook.internal.instrument.anrreport." });
      localMap.put(b.x, new String[] { "com.facebook.appevents.ml." });
      localMap.put(b.y, new String[] { "com.facebook.appevents.suggestedevents." });
      localMap.put(b.v, new String[] { "com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager" });
      localMap.put(b.z, new String[] { "com.facebook.appevents.integrity.IntegrityManager" });
      localMap.put(b.B, new String[] { "com.facebook.appevents.integrity.ProtectedModeManager" });
      localMap.put(b.C, new String[] { "com.facebook.appevents.integrity.MACARuleMatchingManager" });
      localMap.put(b.D, new String[] { "com.facebook.appevents.eventdeactivation." });
      localMap.put(b.E, new String[] { "com.facebook.appevents.ondeviceprocessing." });
      localMap.put(b.G, new String[] { "com.facebook.appevents.iap." });
      localMap.put(b.O, new String[] { "com.facebook.internal.logging.monitor" });
      return;
    }
    finally {}
  }
  
  public static abstract interface a
  {
    public abstract void a(boolean paramBoolean);
  }
  
  public static enum b
  {
    public static final a p = new a(null);
    public final int o;
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
    
    public final b h()
    {
      int i = o;
      Object localObject;
      int j;
      if ((i & 0xFF) > 0)
      {
        localObject = p;
        j = i & 0xFF00;
        localObject = ((a)localObject).a(j);
      }
      else
      {
        if ((0xFF00 & i) > 0) {
          localObject = p;
        }
        for (j = -65536;; j = -16777216)
        {
          j = i & j;
          break;
          if ((0xFF0000 & i) <= 0) {
            break label74;
          }
          localObject = p;
        }
        label74:
        localObject = p.a(0);
      }
      return (b)localObject;
    }
    
    public final String j()
    {
      return Intrinsics.i("FBSDKFeature", this);
    }
    
    public String toString()
    {
      String str;
      switch (b.a[ordinal()])
      {
      default: 
        str = "unknown";
        break;
      case 32: 
        str = "ShareKit";
        break;
      case 31: 
        str = "BypassAppSwitch";
        break;
      case 30: 
        str = "IgnoreAppSwitchToLoggedOut";
        break;
      case 29: 
        str = "ChromeCustomTabsPrefetching";
        break;
      case 28: 
        str = "LoginKit";
        break;
      case 27: 
        str = "ServiceUpdateCompliance";
        break;
      case 26: 
        str = "Elora";
        break;
      case 25: 
        str = "Megatron";
        break;
      case 24: 
        str = "Monitoring";
        break;
      case 23: 
        str = "IAPLoggingLib2";
        break;
      case 22: 
        str = "IAPLogging";
        break;
      case 21: 
        str = "OnDevicePostInstallEventProcessing";
        break;
      case 20: 
        str = "OnDeviceEventProcessing";
        break;
      case 19: 
        str = "EventDeactivation";
        break;
      case 18: 
        str = "ModelRequest";
        break;
      case 17: 
        str = "MACARuleMatching";
        break;
      case 16: 
        str = "ProtectedMode";
        break;
      case 15: 
        str = "IntelligentIntegrity";
        break;
      case 14: 
        str = "SuggestedEvents";
        break;
      case 13: 
        str = "PrivacyProtection";
        break;
      case 12: 
        str = "AppEventsCloudbridge";
        break;
      case 11: 
        str = "AAM";
        break;
      case 10: 
        str = "AnrReport";
        break;
      case 9: 
        str = "ErrorReport";
        break;
      case 8: 
        str = "ThreadCheck";
        break;
      case 7: 
        str = "CrashShield";
        break;
      case 6: 
        str = "CrashReport";
        break;
      case 5: 
        str = "Instrument";
        break;
      case 4: 
        str = "RestrictiveDataFiltering";
        break;
      case 3: 
        str = "CodelessEvents";
        break;
      case 2: 
        str = "AppEvents";
        break;
      case 1: 
        str = "CoreKit";
      }
      return str;
    }
    
    public static final class a
    {
      public final n.b a(int paramInt)
      {
        n.b[] arrayOfb = n.b.values();
        int i = arrayOfb.length;
        int j = 0;
        while (j < i)
        {
          n.b localb = arrayOfb[j];
          j++;
          if (n.b.e(localb) == paramInt) {
            return localb;
          }
        }
        return n.b.q;
      }
    }
  }
  
  public static final class d
    implements q.a
  {
    public d(n.a parama, n.b paramb) {}
    
    public void a()
    {
      n.a locala = a;
      n localn = n.a;
      locala.a(n.g(paramb));
    }
  }
}

/* Location:
 * Qualified Name:     O1.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */