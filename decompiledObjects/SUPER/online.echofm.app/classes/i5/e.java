package i5;

import A5.a.b;
import E5.j;
import E5.k;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.Objects;

public class e
  implements k.c, A5.a
{
  public k a;
  public a b;
  public HandlerThread c;
  public Handler d;
  
  public final String d(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.d);
    localStringBuilder.append("_");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public final String e(j paramj)
  {
    return d((String)((Map)b).get("key"));
  }
  
  public final String f(j paramj)
  {
    return (String)((Map)b).get("value");
  }
  
  public void g(E5.c paramc, Context paramContext)
  {
    try
    {
      a locala = new i5/a;
      locala.<init>(paramContext);
      b = locala;
      paramContext = new android/os/HandlerThread;
      paramContext.<init>("com.it_nomads.fluttersecurestorage.worker");
      c = paramContext;
      paramContext.start();
      paramContext = new android/os/Handler;
      paramContext.<init>(c.getLooper());
      d = paramContext;
      paramContext = new E5/k;
      paramContext.<init>(paramc, "plugins.it_nomads.com/flutter_secure_storage");
      a = paramContext;
      paramContext.e(this);
    }
    catch (Exception paramc)
    {
      Log.e("FlutterSecureStoragePl", "Registration failed", paramc);
    }
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    g(paramb.b(), paramb.a());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    if (a != null)
    {
      c.quitSafely();
      c = null;
      a.e(null);
      a = null;
    }
    b = null;
  }
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    paramd = new a(paramd);
    d.post(new b(paramj, paramd));
  }
  
  public static class a
    implements k.d
  {
    public final k.d a;
    public final Handler b = new Handler(Looper.getMainLooper());
    
    public a(k.d paramd)
    {
      a = paramd;
    }
    
    public void a(Object paramObject)
    {
      b.post(new c(this, paramObject));
    }
    
    public void b(String paramString1, String paramString2, Object paramObject)
    {
      b.post(new d(this, paramString1, paramString2, paramObject));
    }
    
    public void c()
    {
      Handler localHandler = b;
      k.d locald = a;
      Objects.requireNonNull(locald);
      localHandler.post(new b(locald));
    }
  }
  
  public class b
    implements Runnable
  {
    public final j o;
    public final k.d p;
    
    public b(j paramj, k.d paramd)
    {
      o = paramj;
      p = paramd;
    }
    
    public final void a(Exception paramException)
    {
      StringWriter localStringWriter = new StringWriter();
      paramException.printStackTrace(new PrintWriter(localStringWriter));
      p.b("Exception encountered", o.a, localStringWriter.toString());
    }
    
    public void run()
    {
      int i = 0;
      boolean bool1;
      try
      {
        ae = ((Map)((Map)o.b).get("options"));
        bool1 = e.a(e.this).g();
        try
        {
          str1 = o.a;
          switch (str1.hashCode())
          {
          }
        }
        catch (Exception localException1)
        {
          String str1;
          break label500;
        }
        if (str1.equals("readAll")) {
          i = 2;
        }
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        break label537;
        if (localFileNotFoundException.equals("containsKey"))
        {
          i = 3;
          break label207;
          if (localFileNotFoundException.equals("write"))
          {
            break label207;
            if (localFileNotFoundException.equals("read"))
            {
              i = 1;
              break label207;
              if (localFileNotFoundException.equals("deleteAll"))
              {
                i = 5;
                break label207;
                if (localFileNotFoundException.equals("delete"))
                {
                  i = 4;
                  break label207;
                }
              }
            }
          }
        }
        i = -1;
        Object localObject2 = null;
        Object localObject1;
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4)
                {
                  if (i != 5)
                  {
                    p.c();
                    return;
                  }
                  e.a(e.this).e();
                  localObject1 = p;
                }
              }
            }
          }
        }
        for (;;)
        {
          ((k.d)localObject1).a(localObject2);
          return;
          localObject1 = e.b(e.this, o);
          e.a(e.this).d((String)localObject1);
          localObject1 = p;
          continue;
          localObject1 = e.b(e.this, o);
          boolean bool2 = e.a(e.this).b((String)localObject1);
          localObject1 = p;
          localObject2 = Boolean.valueOf(bool2);
          for (;;)
          {
            ((k.d)localObject1).a(localObject2);
            return;
            localObject1 = p;
            localObject2 = e.a(e.this).m();
            break;
            localObject1 = e.b(e.this, o);
            if (!e.a(e.this).b((String)localObject1)) {
              break label423;
            }
            localObject2 = e.a(e.this).l((String)localObject1);
            localObject1 = p;
          }
          localObject1 = p;
          continue;
          String str2 = e.b(e.this, o);
          localObject1 = e.c(e.this, o);
          if (localObject1 == null) {
            break;
          }
          e.a(e.this).n(str2, (String)localObject1);
          localObject1 = p;
        }
        p.b("null", null, null);
        return;
      }
      catch (Exception localException2)
      {
        label207:
        label423:
        bool1 = false;
      }
      label500:
      if (bool1)
      {
        try
        {
          e.a(e.this).e();
          p.a("Data has been reset");
        }
        catch (Exception localException3) {}
      }
      else
      {
        a(localException3);
        return;
        label537:
        Log.i("Creating sharedPrefs", localException3.getLocalizedMessage());
      }
    }
  }
}

/* Location:
 * Qualified Name:     i5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */