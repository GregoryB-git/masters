package R4;

import S4.a;
import S4.b.b;
import T4.f;
import V5.t;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p6.F;
import s3.e;
import s3.m;
import s4.i;

public final class l
{
  public static final a h = new a(null);
  public final e a;
  public final b b;
  public final f c;
  public final x d;
  public final s e;
  public final h f;
  public final o g;
  
  public l(e parame, i parami, F paramF1, F paramF2, r4.b paramb)
  {
    a = parame;
    Object localObject = r.a.a(parame);
    b = ((b)localObject);
    Context localContext = parame.m();
    Intrinsics.checkNotNullExpressionValue(localContext, "firebaseApp.applicationContext");
    paramF2 = new f(localContext, paramF2, paramF1, parami, (b)localObject);
    c = paramF2;
    localObject = new w();
    d = ((x)localObject);
    paramb = new h(paramb);
    f = paramb;
    g = new o(parami, paramb);
    parami = new s(f(), (x)localObject, null, 4, null);
    e = parami;
    paramF1 = new v((x)localObject, paramF1, new c(this), paramF2, parami);
    parami = parame.m().getApplicationContext();
    if ((parami instanceof Application))
    {
      ((Application)parami).registerActivityLifecycleCallbacks(paramF1.d());
      parame.h(new k(parami, paramF1));
    }
    else
    {
      parame = new StringBuilder();
      parame.append("Failed to register lifecycle callbacks, unexpected context ");
      parame.append(parami.getClass());
      parame.append('.');
      Log.e("FirebaseSessions", parame.toString());
    }
  }
  
  public static final void b(Context paramContext, v paramv, String paramString, m paramm)
  {
    Intrinsics.checkNotNullParameter(paramv, "$sessionInitiator");
    Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will not collect session data.");
    ((Application)paramContext).unregisterActivityLifecycleCallbacks(paramv.d());
  }
  
  public final Object d(p paramp, X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localb = (b)paramd;
      i = t;
      if ((i & 0x80000000) != 0)
      {
        t = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    b localb = new b(this, paramd);
    label48:
    Object localObject1 = r;
    Object localObject2 = Y5.b.c();
    int i = t;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            try
            {
              V5.o.b(localObject1);
            }
            catch (IllegalStateException paramp)
            {
              break label521;
            }
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localMap = (Map)q;
        paramd = (p)p;
        paramp = (l)o;
        V5.o.b(localObject1);
        break label428;
      }
      paramp = (p)p;
      paramd = (l)o;
      V5.o.b(localObject1);
    }
    else
    {
      V5.o.b(localObject1);
      paramd = a.a;
      o = this;
      p = paramp;
      t = 1;
      localObject1 = paramd.c(localb);
      if (localObject1 == localObject2) {
        return localObject2;
      }
      paramd = this;
    }
    Map localMap = (Map)localObject1;
    if (localMap.isEmpty()) {
      paramp = "Sessions SDK did not have any dependent SDKs register as dependencies. Events will not be sent.";
    }
    for (;;)
    {
      Log.d("FirebaseSessions", paramp);
      return t.a;
      localObject1 = ((Iterable)localMap.values()).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((S4.b)((Iterator)localObject1).next()).b(new b.b(paramp.b()));
      }
      localObject1 = (Iterable)localMap.values();
      if ((!(localObject1 instanceof Collection)) || (!((Collection)localObject1).isEmpty()))
      {
        localObject1 = ((Iterable)localObject1).iterator();
        for (;;)
        {
          if (((Iterator)localObject1).hasNext()) {
            if (((S4.b)((Iterator)localObject1).next()).c())
            {
              Log.d("FirebaseSessions", "Data Collection is enabled for at least one Subscriber");
              localObject1 = c;
              o = paramd;
              p = paramp;
              q = localMap;
              t = 2;
              if (((f)localObject1).g(localb) == localObject2) {
                return localObject2;
              }
              localObject1 = paramd;
              paramd = paramp;
              paramp = (p)localObject1;
              label428:
              if (!c.d())
              {
                paramp = "Sessions SDK disabled. Events will not be sent.";
                break;
              }
              if (!e.c())
              {
                paramp = "Sessions SDK has dropped this session due to sampling.";
                break;
              }
              paramd = r.a.c(a, paramd, c, localMap);
              paramp = g;
              o = null;
              p = null;
              q = null;
              t = 3;
              paramp = paramp.a(paramd, localb);
              if (paramp == localObject2)
              {
                return localObject2;
                label521:
                Log.w("FirebaseSessions", "FirebaseApp is not initialized. Sessions library will not collect session data.", paramp);
              }
              return t.a;
            }
          }
        }
      }
      paramp = "Data Collection is disabled for all subscribers. Skipping this Session Event";
    }
  }
  
  public final void e(S4.b paramb)
  {
    Intrinsics.checkNotNullParameter(paramb, "subscriber");
    a.a.e(paramb);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Registering Sessions SDK subscriber with name: ");
    localStringBuilder.append(paramb.a());
    localStringBuilder.append(", data collection enabled: ");
    localStringBuilder.append(paramb.c());
    Log.d("FirebaseSessions", localStringBuilder.toString());
    if (e.e()) {
      paramb.b(new b.b(e.d().b()));
    }
  }
  
  public final boolean f()
  {
    boolean bool;
    if (Math.random() <= c.b()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static final class a {}
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public int t;
    
    public b(l paraml, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      r = paramObject;
      t |= 0x80000000;
      return l.c(s, null, this);
    }
  }
  
  public static final class c
    implements u
  {
    public c(l paraml) {}
    
    public Object a(p paramp, X5.d paramd)
    {
      paramp = l.c(a, paramp, paramd);
      if (paramp == Y5.b.c()) {
        return paramp;
      }
      return t.a;
    }
  }
}

/* Location:
 * Qualified Name:     R4.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */