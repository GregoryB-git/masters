package x0;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import b.j;

public final class y$j
  extends e.a<d.i, d.a>
{
  public final Intent a(j paramj, Object paramObject)
  {
    paramObject = (d.i)paramObject;
    Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    Intent localIntent2 = b;
    paramj = (j)paramObject;
    if (localIntent2 != null)
    {
      Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      paramj = (j)paramObject;
      if (localBundle != null)
      {
        localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
        localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramj = (j)paramObject;
        if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false))
        {
          paramj = a;
          ec.i.e(paramj, "intentSender");
          int i = d;
          paramj = new d.i(paramj, null, c, i);
        }
      }
    }
    localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramj);
    if (y.L(2))
    {
      paramj = new StringBuilder();
      paramj.append("CreateIntent created the following intent: ");
      paramj.append(localIntent1);
      Log.v("FragmentManager", paramj.toString());
    }
    return localIntent1;
  }
  
  public final Object c(int paramInt, Intent paramIntent)
  {
    return new d.a(paramInt, paramIntent);
  }
}

/* Location:
 * Qualified Name:     x0.y.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */