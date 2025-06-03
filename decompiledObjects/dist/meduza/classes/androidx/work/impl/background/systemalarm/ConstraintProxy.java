package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o2.j;

public abstract class ConstraintProxy
  extends BroadcastReceiver
{
  public static final String a = j.f("ConstraintProxy");
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    j localj = j.d();
    String str = a;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("onReceive : ");
    localStringBuilder.append(paramIntent);
    localj.a(str, localStringBuilder.toString());
    paramIntent = a.f;
    paramIntent = new Intent(paramContext, SystemAlarmService.class);
    paramIntent.setAction("ACTION_CONSTRAINTS_CHANGED");
    paramContext.startService(paramIntent);
  }
  
  public static class BatteryChargingProxy
    extends ConstraintProxy
  {}
  
  public static class BatteryNotLowProxy
    extends ConstraintProxy
  {}
  
  public static class NetworkStateProxy
    extends ConstraintProxy
  {}
  
  public static class StorageNotLowProxy
    extends ConstraintProxy
  {}
}

/* Location:
 * Qualified Name:     androidx.work.impl.background.systemalarm.ConstraintProxy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */