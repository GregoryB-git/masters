package aa;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import i6.a0;
import i6.c;
import i6.w;
import i6.z;
import m.a;
import w3.t;

public final class y
{
  public static SharedPreferences a(Context paramContext)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null) {
      paramContext = localContext;
    }
    return paramContext.getSharedPreferences("com.google.firebase.messaging", 0);
  }
  
  public static void b(Context paramContext, o arg1, boolean paramBoolean)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 0;
    if (i >= 29) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    Object localObject = a(paramContext);
    i = j;
    if (((SharedPreferences)localObject).contains("proxy_retention"))
    {
      i = j;
      if (((SharedPreferences)localObject).getBoolean("proxy_retention", false) == paramBoolean) {
        i = 1;
      }
    }
    if (i == 0)
    {
      ??? = c;
      if (c.a() >= 241100000)
      {
        localObject = new Bundle();
        ((BaseBundle)localObject).putBoolean("proxy_retention", paramBoolean);
      }
      synchronized (z.a(b))
      {
        i = d;
        d = (i + 1);
        ??? = ???.b(new w(i, 4, (Bundle)localObject));
      }
      ???.addOnSuccessListener(new a(7), new t(paramContext, paramBoolean));
    }
  }
}

/* Location:
 * Qualified Name:     aa.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */