package O1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum n$b
{
  public static final a p = new a(null);
  public final int o;
  
  public n$b(int paramInt1)
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

/* Location:
 * Qualified Name:     O1.n.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */