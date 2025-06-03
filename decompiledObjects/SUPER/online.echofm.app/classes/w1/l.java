package w1;

import E5.k.c;
import E5.k.d;
import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Objects;

public final class l
  implements k.c
{
  public final Context a;
  public final a b;
  public final q c;
  public final y d;
  public Activity e;
  
  public l(Context paramContext, a parama, q paramq, y paramy)
  {
    a = paramContext;
    b = parama;
    c = paramq;
    d = paramy;
  }
  
  public void i(Activity paramActivity)
  {
    e = paramActivity;
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    Object localObject = a;
    ((String)localObject).hashCode();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1669188213: 
      if (((String)localObject).equals("requestPermissions")) {
        j = 4;
      }
      break;
    case 347240634: 
      if (((String)localObject).equals("openAppSettings")) {
        j = 3;
      }
      break;
    case -576207927: 
      if (((String)localObject).equals("checkPermissionStatus")) {
        j = 2;
      }
      break;
    case -1017315255: 
      if (((String)localObject).equals("shouldShowRequestPermissionRationale")) {
        j = 1;
      }
      break;
    case -1544053025: 
      if (((String)localObject).equals("checkServiceStatus")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      break;
    case 4: 
      localObject = (List)paramj.b();
      q localq = c;
      paramj = e;
      Objects.requireNonNull(paramd);
      localq.h((List)localObject, paramj, new f(paramd), new g(paramd));
      break;
    case 3: 
      paramj = b;
      localObject = a;
      Objects.requireNonNull(paramd);
      paramj.a((Context)localObject, new j(paramd), new k(paramd));
      break;
    case 2: 
      j = Integer.parseInt(b.toString());
      paramj = c;
      localObject = a;
      Objects.requireNonNull(paramd);
      paramj.e(j, (Context)localObject, new e(paramd));
      break;
    case 1: 
      j = Integer.parseInt(b.toString());
      paramj = c;
      localObject = e;
      Objects.requireNonNull(paramd);
      paramj.i(j, (Activity)localObject, new h(paramd), new i(paramd));
      break;
    case 0: 
      j = Integer.parseInt(b.toString());
      localObject = d;
      paramj = a;
      Objects.requireNonNull(paramd);
      ((y)localObject).a(j, paramj, new c(paramd), new d(paramd));
    }
  }
}

/* Location:
 * Qualified Name:     w1.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */