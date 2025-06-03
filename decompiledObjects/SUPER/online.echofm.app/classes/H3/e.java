package H3;

import E3.f;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class e
{
  public final Float a;
  public final boolean b;
  
  public e(Float paramFloat, boolean paramBoolean)
  {
    b = paramBoolean;
    a = paramFloat;
  }
  
  public static e a(Context paramContext)
  {
    boolean bool1 = false;
    boolean bool2 = false;
    Object localObject1 = null;
    boolean bool3 = bool2;
    try
    {
      Object localObject2 = new android/content/IntentFilter;
      bool3 = bool2;
      ((IntentFilter)localObject2).<init>("android.intent.action.BATTERY_CHANGED");
      bool3 = bool2;
      localObject2 = paramContext.registerReceiver(null, (IntentFilter)localObject2);
      bool3 = bool1;
      paramContext = (Context)localObject1;
      if (localObject2 != null)
      {
        bool3 = bool2;
        bool2 = e((Intent)localObject2);
        bool3 = bool2;
        paramContext = d((Intent)localObject2);
        bool3 = bool2;
      }
    }
    catch (IllegalStateException paramContext)
    {
      f.f().e("An error occurred getting battery state.", paramContext);
      paramContext = (Context)localObject1;
    }
    return new e(paramContext, bool3);
  }
  
  public static Float d(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("level", -1);
    int j = paramIntent.getIntExtra("scale", -1);
    if ((i != -1) && (j != -1)) {
      return Float.valueOf(i / j);
    }
    return null;
  }
  
  public static boolean e(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("status", -1);
    boolean bool = false;
    if (i == -1) {
      return false;
    }
    if ((i == 2) || (i == 5)) {
      bool = true;
    }
    return bool;
  }
  
  public Float b()
  {
    return a;
  }
  
  public int c()
  {
    if (b)
    {
      Float localFloat = a;
      if (localFloat != null)
      {
        if (localFloat.floatValue() < 0.99D) {
          return 2;
        }
        return 3;
      }
    }
    return 1;
  }
}

/* Location:
 * Qualified Name:     H3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */