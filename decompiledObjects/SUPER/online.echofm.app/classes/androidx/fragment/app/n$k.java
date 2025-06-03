package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.e;
import androidx.activity.result.e.b;

public class n$k
  extends d.a
{
  public Intent d(Context paramContext, e parame)
  {
    Intent localIntent1 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
    Intent localIntent2 = parame.a();
    paramContext = parame;
    if (localIntent2 != null)
    {
      Bundle localBundle = localIntent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
      paramContext = parame;
      if (localBundle != null)
      {
        localIntent1.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", localBundle);
        localIntent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        paramContext = parame;
        if (localIntent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
          paramContext = new e.b(parame.d()).b(null).c(parame.c(), parame.b()).a();
        }
      }
    }
    localIntent1.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramContext);
    if (n.D0(2))
    {
      paramContext = new StringBuilder();
      paramContext.append("CreateIntent created the following intent: ");
      paramContext.append(localIntent1);
      Log.v("FragmentManager", paramContext.toString());
    }
    return localIntent1;
  }
  
  public androidx.activity.result.a e(int paramInt, Intent paramIntent)
  {
    return new androidx.activity.result.a(paramInt, paramIntent);
  }
}

/* Location:
 * Qualified Name:     androidx.fragment.app.n.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */