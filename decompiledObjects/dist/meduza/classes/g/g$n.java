package g;

import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import x6.b;

public final class g$n
  extends g.m
{
  public final w c;
  
  public g$n(g paramg, w paramw)
  {
    super(paramg);
    c = paramw;
  }
  
  public final IntentFilter b()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.TIME_SET");
    localIntentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
    localIntentFilter.addAction("android.intent.action.TIME_TICK");
    return localIntentFilter;
  }
  
  public final int c()
  {
    w localw = c;
    w.a locala1 = c;
    long l1 = b;
    long l2 = System.currentTimeMillis();
    boolean bool1 = false;
    boolean bool2 = false;
    int i = 1;
    if (l1 > l2) {
      j = 1;
    } else {
      j = 0;
    }
    if (j == 0)
    {
      j = b.F(a, "android.permission.ACCESS_COARSE_LOCATION");
      Object localObject1 = null;
      w.a locala2;
      if (j == 0) {
        try
        {
          if (b.isProviderEnabled("network")) {
            Location localLocation = b.getLastKnownLocation("network");
          }
        }
        catch (Exception localException1)
        {
          Log.d("TwilightManager", "Failed to get last known location", localException1);
          locala2 = null;
        }
      } else {
        locala2 = null;
      }
      Object localObject2 = localObject1;
      Object localObject3;
      if (b.F(a, "android.permission.ACCESS_FINE_LOCATION") == 0)
      {
        localObject2 = localObject1;
        try
        {
          if (b.isProviderEnabled("gps")) {
            localObject2 = b.getLastKnownLocation("gps");
          }
        }
        catch (Exception localException2)
        {
          Log.d("TwilightManager", "Failed to get last known location", localException2);
          localObject3 = localObject1;
        }
      }
      if ((localObject3 != null) && (locala2 != null))
      {
        localObject1 = locala2;
        if (((Location)localObject3).getTime() <= locala2.getTime()) {
          break label225;
        }
      }
      else
      {
        localObject1 = locala2;
        if (localObject3 == null) {
          break label225;
        }
      }
      localObject1 = localObject3;
      label225:
      if (localObject1 != null)
      {
        locala2 = c;
        l2 = System.currentTimeMillis();
        if (v.d == null) {
          v.d = new v();
        }
        localObject3 = v.d;
        ((v)localObject3).a(l2 - 86400000L, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
        ((v)localObject3).a(l2, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
        if (c == 1) {
          bool2 = true;
        }
        long l3 = b;
        long l4 = a;
        ((v)localObject3).a(l2 + 86400000L, ((Location)localObject1).getLatitude(), ((Location)localObject1).getLongitude());
        l1 = b;
        if ((l3 != -1L) && (l4 != -1L))
        {
          if (l2 > l4) {
            l2 = l1 + 0L;
          } else if (l2 > l3) {
            l2 = l4 + 0L;
          } else {
            l2 = l3 + 0L;
          }
          l2 += 60000L;
        }
        else
        {
          l2 = 43200000L + l2;
        }
        a = bool2;
        b = l2;
      }
    }
    else
    {
      bool2 = a;
      break label494;
    }
    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
    int j = Calendar.getInstance().get(11);
    if (j >= 6)
    {
      bool2 = bool1;
      if (j < 22) {}
    }
    else
    {
      bool2 = true;
    }
    label494:
    j = i;
    if (bool2) {
      j = 2;
    }
    return j;
  }
  
  public final void d()
  {
    d.E(true, true);
  }
}

/* Location:
 * Qualified Name:     g.g.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */