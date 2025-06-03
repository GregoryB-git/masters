package R4;

import V2.j;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;

public final class o
{
  public static final a c = new a(null);
  public final s4.i a;
  public final i b;
  
  public o(s4.i parami, i parami1)
  {
    a = parami;
    b = parami1;
  }
  
  public final Object a(q paramq, X5.d paramd)
  {
    if ((paramd instanceof b))
    {
      localObject1 = (b)paramd;
      i = u;
      if ((i & 0x80000000) != 0)
      {
        u = (i + Integer.MIN_VALUE);
        paramd = (X5.d)localObject1;
        break label50;
      }
    }
    paramd = new b(this, paramd);
    label50:
    Object localObject2 = s;
    Object localObject1 = Y5.b.c();
    int i = u;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject3 = (t)r;
        localObject4 = (t)q;
        paramq = (q)p;
        paramd = (o)o;
        localObject5 = paramd;
        localObject6 = localObject4;
        localObject1 = paramq;
        try
        {
          V5.o.b(localObject2);
        }
        catch (Exception paramq)
        {
          break label273;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      V5.o.b(localObject2);
      localObject3 = paramq.c();
    }
    try
    {
      localObject6 = a.a();
      Intrinsics.checkNotNullExpressionValue(localObject6, "firebaseInstallations.id");
      o = this;
      p = paramq;
      q = localObject3;
      r = localObject3;
      u = 1;
      localObject2 = z6.b.a((j)localObject6, paramd);
      if (localObject2 == localObject1) {
        return localObject1;
      }
      localObject4 = localObject3;
      paramd = this;
      localObject5 = paramd;
      localObject6 = localObject4;
      localObject1 = paramq;
      Intrinsics.checkNotNullExpressionValue(localObject2, "{\n        firebaseInstallations.id.await()\n      }");
      localObject5 = paramd;
      localObject6 = localObject4;
      localObject1 = paramq;
      localObject4 = (String)localObject2;
      localObject5 = paramd;
      paramd = (X5.d)localObject4;
    }
    catch (Exception paramd)
    {
      localObject1 = paramq;
      localObject6 = localObject3;
      paramq = paramd;
      localObject5 = this;
    }
    label273:
    paramd = new StringBuilder();
    paramd.append("Error getting Firebase Installation ID: ");
    paramd.append(paramq);
    paramd.append(". Using an empty ID");
    Log.e("SessionCoordinator", paramd.toString());
    paramd = "";
    Object localObject3 = localObject6;
    paramq = (q)localObject1;
    ((t)localObject3).g(paramd);
    try
    {
      b.a(paramq);
      paramd = new java/lang/StringBuilder;
      paramd.<init>();
      paramd.append("Successfully logged Session Start event: ");
      paramd.append(paramq.c().e());
      Log.i("SessionCoordinator", paramd.toString());
    }
    catch (RuntimeException paramq)
    {
      Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", paramq);
    }
    return V5.t.a;
  }
  
  public static final class a {}
  
  public static final class b
    extends Z5.d
  {
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public int u;
    
    public b(o paramo, X5.d paramd)
    {
      super();
    }
    
    public final Object invokeSuspend(Object paramObject)
    {
      s = paramObject;
      u |= 0x80000000;
      return t.a(null, this);
    }
  }
}

/* Location:
 * Qualified Name:     R4.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */