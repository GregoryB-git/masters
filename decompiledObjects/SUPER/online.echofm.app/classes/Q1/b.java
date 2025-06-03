package Q1;

import O1.P;
import O1.n;
import O1.n.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F;
import x1.F.b;
import x1.F.c;
import x1.J;
import x1.K;

public final class b
{
  public static final b a = new b();
  public static boolean b;
  
  public static final void b()
  {
    b = true;
    if (B.p()) {
      a.e();
    }
  }
  
  public static final void c(Throwable paramThrowable)
  {
    if ((b) && (!d()) && (paramThrowable != null))
    {
      HashSet localHashSet = new HashSet();
      paramThrowable = paramThrowable.getStackTrace();
      Intrinsics.checkNotNullExpressionValue(paramThrowable, "e.stackTrace");
      int i = paramThrowable.length;
      for (int j = 0; j < i; j++)
      {
        Object localObject = paramThrowable[j];
        n localn = n.a;
        localObject = ((StackTraceElement)localObject).getClassName();
        Intrinsics.checkNotNullExpressionValue(localObject, "it.className");
        localObject = n.d((String)localObject);
        if (localObject != n.b.q)
        {
          n.c((n.b)localObject);
          localHashSet.add(((n.b)localObject).toString());
        }
      }
      if ((B.p()) && ((localHashSet.isEmpty() ^ true)))
      {
        paramThrowable = c.a.a;
        c.a.c(new JSONArray(localHashSet)).g();
      }
    }
  }
  
  public static final boolean d()
  {
    return false;
  }
  
  public static final void f(c paramc, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramc, "$instrumentData");
    Intrinsics.checkNotNullParameter(paramK, "response");
    try
    {
      if (paramK.b() == null)
      {
        paramK = paramK.d();
        if (paramK == null) {
          paramK = null;
        } else {
          paramK = Boolean.valueOf(paramK.getBoolean("success"));
        }
        if (Intrinsics.a(paramK, Boolean.TRUE)) {
          paramc.a();
        }
      }
      return;
    }
    catch (JSONException paramc)
    {
      for (;;) {}
    }
  }
  
  public final void e()
  {
    if (P.Z()) {
      return;
    }
    File[] arrayOfFile = k.n();
    ArrayList localArrayList = new ArrayList();
    int i = arrayOfFile.length;
    int j = 0;
    int k;
    for (;;)
    {
      Object localObject1;
      JSONObject localJSONObject;
      if (j < i)
      {
        localObject1 = arrayOfFile[j];
        k = j + 1;
        localObject1 = c.a.d((File)localObject1);
        j = k;
        if (((c)localObject1).f()) {
          localJSONObject = new JSONObject();
        }
      }
      else
      {
        try
        {
          localJSONObject.put("crash_shield", ((c)localObject1).toString());
          F.c localc = F.n;
          Object localObject2 = x.a;
          String str = String.format("%s/instruments", Arrays.copyOf(new Object[] { B.m() }, 1));
          Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
          localObject2 = new Q1/a;
          ((a)localObject2).<init>((c)localObject1);
          localArrayList.add(localc.A(null, str, localJSONObject, (F.b)localObject2));
          j = k;
        }
        catch (JSONException localJSONException)
        {
          j = k;
        }
        if (localArrayList.isEmpty()) {
          return;
        }
        new J(localArrayList).q();
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     Q1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */