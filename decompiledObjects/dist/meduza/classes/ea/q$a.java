package ea;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import ec.i;
import rb.f;
import u9.d;
import u9.h;
import vb.a;

public final class q$a
{
  public final Object a(d paramd, ub.e<? super q> parame)
  {
    if ((parame instanceof a))
    {
      locala = (a)parame;
      i = d;
      if ((i & 0x80000000) != 0)
      {
        d = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    a locala = new a(this, parame);
    label48:
    Object localObject2 = b;
    a locala1 = a.a;
    int i = d;
    String str = "";
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          paramd = (String)a;
          parame = paramd;
          try
          {
            f.b(localObject2);
          }
          catch (Exception localException)
          {
            break label307;
          }
        }
        else
        {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        paramd = (d)a;
        parame = paramd;
      }
    }
    else {
      try
      {
        f.b(localObject2);
        break label198;
        f.b(localObject2);
        parame = paramd;
        localObject2 = paramd.a();
        parame = paramd;
        i.d(localObject2, "firebaseInstallations.getToken(false)");
        parame = paramd;
        a = paramd;
        parame = paramd;
        d = 1;
        parame = paramd;
        Object localObject3 = wc.c.a((Task)localObject2, localException);
        localObject2 = localObject3;
        if (localObject3 == locala1) {
          return locala1;
        }
        label198:
        parame = paramd;
        localObject2 = ((h)localObject2).a();
        parame = paramd;
        i.d(localObject2, "{\n          firebaseInst…).await().token\n        }");
        parame = paramd;
        paramd = (d)localObject2;
      }
      catch (Exception paramd)
      {
        Log.w("InstallationId", "Error getting authentication token.", paramd);
        paramd = "";
      }
    }
    Object localObject1;
    try
    {
      parame = parame.getId();
      i.d(parame, "firebaseInstallations.id");
      a = paramd;
      d = 2;
      localObject2 = wc.c.a(parame, localException);
      if (localObject2 == locala1) {
        return locala1;
      }
      parame = paramd;
      i.d(localObject2, "{\n          firebaseInst…ions.id.await()\n        }");
      parame = paramd;
      localObject1 = (String)localObject2;
      parame = (ub.e<? super q>)localObject1;
    }
    catch (Exception parame)
    {
      localObject1 = parame;
      parame = paramd;
    }
    label307:
    Log.w("InstallationId", "Error getting Firebase installation id .", (Throwable)localObject1);
    paramd = parame;
    parame = str;
    return new q(parame, paramd);
  }
  
  @wb.e(c="com.google.firebase.sessions.InstallationId$Companion", f="InstallationId.kt", l={32, 40}, m="create")
  public static final class a
    extends wb.c
  {
    public Object a;
    public int d;
    
    public a(q.a parama, ub.e<? super a> parame)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      b = paramObject;
      d |= 0x80000000;
      return c.a(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     ea.q.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */