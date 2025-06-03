package c8;

import b.a0;
import b8.g0;
import b8.h0;
import b8.k0;
import b8.l0;
import b8.v;
import b8.w;
import b8.z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuth.c;
import com.google.firebase.auth.FirebaseAuth.d;
import g.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m6.j;

public final class l
  extends v
{
  public final i a;
  
  public l(i parami)
  {
    j.i(parami);
    a = parami;
  }
  
  public final Task<Void> a(w paramw, String paramString)
  {
    j.i(paramw);
    i locali = a;
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(locali.K());
    localFirebaseAuth.getClass();
    if ((paramw instanceof g0)) {
      paramw = e.zza(a, (g0)paramw, locali, paramString, new FirebaseAuth.d(localFirebaseAuth));
    } else if ((paramw instanceof k0)) {
      paramw = e.zza(a, (k0)paramw, locali, paramString, k, new FirebaseAuth.d(localFirebaseAuth));
    } else {
      paramw = Tasks.forException(zzadr.zza(new Status(17499, null, null, null)));
    }
    return paramw;
  }
  
  public final ArrayList b()
  {
    Object localObject1 = a.t;
    if (localObject1 != null)
    {
      ArrayList localArrayList = new ArrayList();
      localObject2 = a.iterator();
      while (((Iterator)localObject2).hasNext()) {
        localArrayList.add((h0)((Iterator)localObject2).next());
      }
      localObject1 = b.iterator();
      for (;;)
      {
        localObject2 = localArrayList;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        localArrayList.add((l0)((Iterator)localObject1).next());
      }
    }
    Object localObject2 = new ArrayList();
    return (ArrayList)localObject2;
  }
  
  public final Task<z> c()
  {
    i locali = a;
    return FirebaseAuth.getInstance(locali.K()).j(locali, false).continueWithTask(new s(this, 4));
  }
  
  public final Task<Void> d(String paramString)
  {
    j.e(paramString);
    i locali = a;
    FirebaseAuth localFirebaseAuth = FirebaseAuth.getInstance(locali.K());
    localFirebaseAuth.getClass();
    j.e(paramString);
    return e.zza(a, locali, paramString, k, new FirebaseAuth.c(localFirebaseAuth)).continueWithTask(new a0(0));
  }
}

/* Location:
 * Qualified Name:     c8.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */