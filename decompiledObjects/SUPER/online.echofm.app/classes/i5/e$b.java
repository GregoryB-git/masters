package i5;

import E5.j;
import E5.k.d;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;

public class e$b
  implements Runnable
{
  public final j o;
  public final k.d p;
  
  public e$b(e parame, j paramj, k.d paramd)
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
      aq).e = ((Map)((Map)o.b).get("options"));
      bool1 = e.a(q).g();
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
                e.a(q).e();
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
        localObject1 = e.b(q, o);
        e.a(q).d((String)localObject1);
        localObject1 = p;
        continue;
        localObject1 = e.b(q, o);
        boolean bool2 = e.a(q).b((String)localObject1);
        localObject1 = p;
        localObject2 = Boolean.valueOf(bool2);
        for (;;)
        {
          ((k.d)localObject1).a(localObject2);
          return;
          localObject1 = p;
          localObject2 = e.a(q).m();
          break;
          localObject1 = e.b(q, o);
          if (!e.a(q).b((String)localObject1)) {
            break label423;
          }
          localObject2 = e.a(q).l((String)localObject1);
          localObject1 = p;
        }
        localObject1 = p;
        continue;
        String str2 = e.b(q, o);
        localObject1 = e.c(q, o);
        if (localObject1 == null) {
          break;
        }
        e.a(q).n(str2, (String)localObject1);
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
        e.a(q).e();
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

/* Location:
 * Qualified Name:     i5.e.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */