package D5;

import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import t5.b;
import w5.a;

public class q
{
  public final k a;
  public g b;
  public final k.c c;
  
  public q(a parama)
  {
    a locala = new a();
    c = locala;
    parama = new k(parama, "flutter/platform_views", E5.q.b);
    a = parama;
    parama.e(locala);
  }
  
  public static String c(Exception paramException)
  {
    return b.d(paramException);
  }
  
  public void d(g paramg)
  {
    b = paramg;
  }
  
  public class a
    implements k.c
  {
    public a() {}
    
    public final void b(j paramj, k.d paramd)
    {
      int i = ((Integer)paramj.b()).intValue();
      try
      {
        q.a(q.this).f(i);
        paramd.a(null);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void c(j paramj, k.d paramd)
    {
      Map localMap = (Map)paramj.b();
      boolean bool = localMap.containsKey("hybrid");
      int i = 0;
      int j;
      if ((bool) && (((Boolean)localMap.get("hybrid")).booleanValue())) {
        j = 1;
      } else {
        j = 0;
      }
      if (localMap.containsKey("params")) {
        paramj = ByteBuffer.wrap((byte[])localMap.get("params"));
      } else {
        paramj = null;
      }
      if (j != 0) {}
      for (;;)
      {
        try
        {
          localObject = new D5/q$d;
          ((q.d)localObject).<init>(((Integer)localMap.get("id")).intValue(), (String)localMap.get("viewType"), 0.0D, 0.0D, 0.0D, 0.0D, ((Integer)localMap.get("direction")).intValue(), q.d.a.q, paramj);
          q.a(q.this).h((q.d)localObject);
          paramd.a(null);
        }
        catch (IllegalStateException paramj)
        {
          break;
        }
        j = i;
        if (localMap.containsKey("hybridFallback"))
        {
          j = i;
          if (((Boolean)localMap.get("hybridFallback")).booleanValue()) {
            j = 1;
          }
        }
        if (j != 0) {}
        for (Object localObject = q.d.a.p;; localObject = q.d.a.o) {
          break;
        }
        q.d locald = new D5/q$d;
        i = ((Integer)localMap.get("id")).intValue();
        String str = (String)localMap.get("viewType");
        bool = localMap.containsKey("top");
        double d1 = 0.0D;
        double d2;
        if (bool) {
          d2 = ((Double)localMap.get("top")).doubleValue();
        } else {
          d2 = 0.0D;
        }
        if (localMap.containsKey("left")) {
          d1 = ((Double)localMap.get("left")).doubleValue();
        }
        locald.<init>(i, str, d2, d1, ((Double)localMap.get("width")).doubleValue(), ((Double)localMap.get("height")).doubleValue(), ((Integer)localMap.get("direction")).intValue(), (q.d.a)localObject, paramj);
        long l = q.a(q.this).e(locald);
        if (l == -2L)
        {
          if (j == 0)
          {
            paramj = new java/lang/AssertionError;
            paramj.<init>("Platform view attempted to fall back to hybrid mode when not requested.");
            throw paramj;
          }
        }
        else
        {
          paramd.a(Long.valueOf(l));
          return;
        }
      }
      paramd.b("error", q.b(paramj), null);
    }
    
    public final void d(j paramj, k.d paramd)
    {
      int i = ((Integer)((Map)paramj.b()).get("id")).intValue();
      try
      {
        q.a(q.this).g(i);
        paramd.a(null);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void f(j paramj, k.d paramd)
    {
      paramj = (Map)paramj.b();
      try
      {
        q.a(q.this).b(((Integer)paramj.get("id")).intValue(), ((Double)paramj.get("top")).doubleValue(), ((Double)paramj.get("left")).doubleValue());
        paramd.a(null);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void g(j paramj, k.d paramd)
    {
      paramj = (Map)paramj.b();
      paramj = new q.e(((Integer)paramj.get("id")).intValue(), ((Double)paramj.get("width")).doubleValue(), ((Double)paramj.get("height")).doubleValue());
      try
      {
        q.g localg = q.a(q.this);
        p localp = new D5/p;
        localp.<init>(paramd);
        localg.i(paramj, localp);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void h(j paramj, k.d paramd)
    {
      paramj = (Map)paramj.b();
      int i = ((Integer)paramj.get("id")).intValue();
      int j = ((Integer)paramj.get("direction")).intValue();
      try
      {
        q.a(q.this).c(i, j);
        paramd.a(null);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void i(j paramj, k.d paramd)
    {
      boolean bool = ((Boolean)paramj.b()).booleanValue();
      try
      {
        q.a(q.this).a(bool);
        paramd.a(null);
      }
      catch (IllegalStateException paramj)
      {
        paramd.b("error", q.b(paramj), null);
      }
    }
    
    public final void j(j paramj, k.d paramd)
    {
      paramj = (List)paramj.b();
      paramj = new q.f(((Integer)paramj.get(0)).intValue(), (Number)paramj.get(1), (Number)paramj.get(2), ((Integer)paramj.get(3)).intValue(), ((Integer)paramj.get(4)).intValue(), paramj.get(5), paramj.get(6), ((Integer)paramj.get(7)).intValue(), ((Integer)paramj.get(8)).intValue(), (float)((Double)paramj.get(9)).doubleValue(), (float)((Double)paramj.get(10)).doubleValue(), ((Integer)paramj.get(11)).intValue(), ((Integer)paramj.get(12)).intValue(), ((Integer)paramj.get(13)).intValue(), ((Integer)paramj.get(14)).intValue(), ((Number)paramj.get(15)).longValue());
      try
      {
        q.a(q.this).d(paramj);
        try
        {
          paramd.a(null);
        }
        catch (IllegalStateException paramj) {}
        paramd.b("error", q.b(paramj), null);
      }
      catch (IllegalStateException paramj) {}
    }
    
    public void onMethodCall(j paramj, k.d paramd)
    {
      if (q.a(q.this) == null) {
        return;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Received '");
      ((StringBuilder)localObject).append(a);
      ((StringBuilder)localObject).append("' message.");
      b.f("PlatformViewsChannel", ((StringBuilder)localObject).toString());
      localObject = a;
      ((String)localObject).hashCode();
      int i = ((String)localObject).hashCode();
      int j = -1;
      switch (i)
      {
      default: 
        break;
      case 1671767583: 
        if (((String)localObject).equals("dispose")) {
          j = 7;
        }
        break;
      case 576796989: 
        if (((String)localObject).equals("setDirection")) {
          j = 6;
        }
        break;
      case 110550847: 
        if (((String)localObject).equals("touch")) {
          j = 5;
        }
        break;
      case -308988850: 
        if (((String)localObject).equals("synchronizeToNativeViewHierarchy")) {
          j = 4;
        }
        break;
      case -756050293: 
        if (((String)localObject).equals("clearFocus")) {
          j = 3;
        }
        break;
      case -934437708: 
        if (((String)localObject).equals("resize")) {
          j = 2;
        }
        break;
      case -1019779949: 
        if (((String)localObject).equals("offset")) {
          j = 1;
        }
        break;
      case -1352294148: 
        if (((String)localObject).equals("create")) {
          j = 0;
        }
        break;
      }
      switch (j)
      {
      default: 
        paramd.c();
        break;
      case 7: 
        d(paramj, paramd);
        break;
      case 6: 
        h(paramj, paramd);
        break;
      case 5: 
        j(paramj, paramd);
        break;
      case 4: 
        i(paramj, paramd);
        break;
      case 3: 
        b(paramj, paramd);
        break;
      case 2: 
        g(paramj, paramd);
        break;
      case 1: 
        f(paramj, paramd);
        break;
      case 0: 
        c(paramj, paramd);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(q.c paramc);
  }
  
  public static class c
  {
    public final int a;
    public final int b;
    
    public c(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
    }
  }
  
  public static class d
  {
    public final int a;
    public final String b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final int g;
    public final a h;
    public final ByteBuffer i;
    
    public d(int paramInt1, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, int paramInt2, a parama, ByteBuffer paramByteBuffer)
    {
      a = paramInt1;
      b = paramString;
      e = paramDouble1;
      f = paramDouble2;
      c = paramDouble3;
      d = paramDouble4;
      g = paramInt2;
      h = parama;
      i = paramByteBuffer;
    }
    
    public static enum a {}
  }
  
  public static class e
  {
    public final int a;
    public final double b;
    public final double c;
    
    public e(int paramInt, double paramDouble1, double paramDouble2)
    {
      a = paramInt;
      b = paramDouble1;
      c = paramDouble2;
    }
  }
  
  public static class f
  {
    public final int a;
    public final Number b;
    public final Number c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final long p;
    
    public f(int paramInt1, Number paramNumber1, Number paramNumber2, int paramInt2, int paramInt3, Object paramObject1, Object paramObject2, int paramInt4, int paramInt5, float paramFloat1, float paramFloat2, int paramInt6, int paramInt7, int paramInt8, int paramInt9, long paramLong)
    {
      a = paramInt1;
      b = paramNumber1;
      c = paramNumber2;
      d = paramInt2;
      e = paramInt3;
      f = paramObject1;
      g = paramObject2;
      h = paramInt4;
      i = paramInt5;
      j = paramFloat1;
      k = paramFloat2;
      l = paramInt6;
      m = paramInt7;
      n = paramInt8;
      o = paramInt9;
      p = paramLong;
    }
  }
  
  public static abstract interface g
  {
    public abstract void a(boolean paramBoolean);
    
    public abstract void b(int paramInt, double paramDouble1, double paramDouble2);
    
    public abstract void c(int paramInt1, int paramInt2);
    
    public abstract void d(q.f paramf);
    
    public abstract long e(q.d paramd);
    
    public abstract void f(int paramInt);
    
    public abstract void g(int paramInt);
    
    public abstract void h(q.d paramd);
    
    public abstract void i(q.e parame, q.b paramb);
  }
}

/* Location:
 * Qualified Name:     D5.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */