package x;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class a$a
{
  public static void a(Context paramContext, Intent[] paramArrayOfIntent, Bundle paramBundle)
  {
    paramContext.startActivities(paramArrayOfIntent, paramBundle);
  }
  
  public static void b(Context paramContext, Intent paramIntent, Bundle paramBundle)
  {
    paramContext.startActivity(paramIntent, paramBundle);
  }
}

/* Location:
 * Qualified Name:     x.a.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */