package l6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.firebase_auth_api.zzadv;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.List;
import java.util.Map;
import p.o;
import p.o.d;
import v.a;

public final class t
  implements OnCompleteListener
{
  public t(u paramu, TaskCompletionSource paramTaskCompletionSource) {}
  
  public final void onComplete(Task paramTask)
  {
    switch (a)
    {
    default: 
      break;
    case 0: 
      c).b.remove((TaskCompletionSource)b);
      return;
    }
    GenericIdpActivity localGenericIdpActivity = (GenericIdpActivity)b;
    Object localObject1 = (String)c;
    Object localObject2 = GenericIdpActivity.c;
    localObject2 = new Intent("android.intent.action.VIEW");
    PackageManager localPackageManager = localGenericIdpActivity.getPackageManager();
    int i = 0;
    int j;
    if (localPackageManager.resolveActivity((Intent)localObject2, 0) != null) {
      j = 1;
    } else {
      j = 0;
    }
    if (j != 0)
    {
      localObject2 = localGenericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
      j = i;
      if (localObject2 != null)
      {
        j = i;
        if (!((List)localObject2).isEmpty()) {
          j = 1;
        }
      }
      if (j != 0)
      {
        localObject1 = new o.d().a();
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
        paramTask = (Uri)paramTask.getResult();
        a.setData(paramTask);
        a.startActivity(localGenericIdpActivity, a, b);
      }
      else
      {
        paramTask = new Intent("android.intent.action.VIEW", (Uri)paramTask.getResult());
        paramTask.putExtra("com.android.browser.application_id", (String)localObject1);
        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
        paramTask.addFlags(1073741824);
        paramTask.addFlags(268435456);
        localGenericIdpActivity.startActivity(paramTask);
      }
    }
    else
    {
      Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
      zzadv.zzb(localGenericIdpActivity, (String)localObject1);
    }
  }
}

/* Location:
 * Qualified Name:     l6.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */