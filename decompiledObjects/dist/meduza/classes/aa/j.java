package aa;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import i7.a;
import m1.b;
import m1.c;
import r5.d;
import w3.v;

public final class j
{
  public static final Object c = new Object();
  public static o0 d;
  public final Context a;
  public final c b;
  
  public j(Context paramContext)
  {
    a = paramContext;
    b = new c(1);
  }
  
  public static Task<Integer> a(Context arg0, Intent paramIntent, boolean paramBoolean)
  {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", "Binding to service");
    }
    synchronized (c)
    {
      if (d == null)
      {
        localObject2 = new aa/o0;
        ((o0)localObject2).<init>(???);
        d = (o0)localObject2;
      }
      Object localObject2 = d;
      if (paramBoolean)
      {
        if (d0.a().c(???)) {
          synchronized (l0.b)
          {
            if (l0.c == null)
            {
              a locala = new i7/a;
              locala.<init>(???);
              l0.c = locala;
              synchronized (a)
              {
                g = true;
              }
            }
            paramBoolean = paramIntent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            paramIntent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            if (!paramBoolean) {
              l0.c.a(l0.a);
            }
            ??? = ((o0)localObject2).b(paramIntent);
            localObject2 = new e;
            ((e)localObject2).<init>(paramIntent, 0);
            ???.addOnCompleteListener((OnCompleteListener)localObject2);
          }
        }
        ((o0)localObject2).b(paramIntent);
        return Tasks.forResult(Integer.valueOf(-1));
      }
      return ((o0)localObject2).b(paramIntent).continueWith(new b(5), new v(21));
    }
  }
  
  public final Task<Integer> b(Intent paramIntent)
  {
    Object localObject = paramIntent.getStringExtra("gcm.rawData64");
    boolean bool = false;
    if (localObject != null)
    {
      paramIntent.putExtra("rawData", Base64.decode((String)localObject, 0));
      paramIntent.removeExtra("gcm.rawData64");
    }
    localObject = a;
    int i;
    if ((v6.e.a()) && (getApplicationInfotargetSdkVersion >= 26)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramIntent.getFlags() & 0x10000000) != 0) {
      bool = true;
    }
    if ((i != 0) && (!bool)) {
      paramIntent = a((Context)localObject, paramIntent, bool);
    } else {
      paramIntent = Tasks.call(b, new i((Context)localObject, paramIntent)).continueWithTask(b, new d(localObject, paramIntent, bool));
    }
    return paramIntent;
  }
}

/* Location:
 * Qualified Name:     aa.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */