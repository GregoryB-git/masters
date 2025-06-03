package U1;

import O1.P;
import Q1.k;
import W5.m;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.K;

public final class e
{
  public static final e a = new e();
  
  public static final void d()
  {
    if (B.p()) {
      h();
    }
  }
  
  public static final File[] e()
  {
    Object localObject = k.f();
    if (localObject == null) {
      return new File[0];
    }
    localObject = ((File)localObject).listFiles(new d());
    Intrinsics.checkNotNullExpressionValue(localObject, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
    return (File[])localObject;
  }
  
  public static final boolean f(File paramFile, String paramString)
  {
    Intrinsics.checkNotNullExpressionValue(paramString, "name");
    paramFile = x.a;
    paramFile = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[] { "error_log_" }, 1));
    Intrinsics.checkNotNullExpressionValue(paramFile, "java.lang.String.format(format, *args)");
    return new Regex(paramFile).b(paramString);
  }
  
  public static final void g(String paramString)
  {
    try
    {
      a locala = new U1/a;
      locala.<init>(paramString);
      locala.e();
      return;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
  
  public static final void h()
  {
    if (P.Z()) {
      return;
    }
    Object localObject1 = e();
    ArrayList localArrayList = new ArrayList();
    int i = localObject1.length;
    int j = 0;
    int k = 0;
    while (k < i)
    {
      localObject2 = localObject1[k];
      int m = k + 1;
      localObject2 = new a((File)localObject2);
      k = m;
      if (((a)localObject2).d())
      {
        localArrayList.add(localObject2);
        k = m;
      }
    }
    m.m(localArrayList, new b());
    Object localObject2 = new JSONArray();
    for (k = j; (k < localArrayList.size()) && (k < 1000); k++) {
      ((JSONArray)localObject2).put(localArrayList.get(k));
    }
    localObject1 = k.a;
    k.s("error_reports", (JSONArray)localObject2, new c(localArrayList));
  }
  
  public static final int i(a parama1, a parama2)
  {
    Intrinsics.checkNotNullExpressionValue(parama2, "o2");
    return parama1.b(parama2);
  }
  
  public static final void j(ArrayList paramArrayList, K paramK)
  {
    Intrinsics.checkNotNullParameter(paramArrayList, "$validReports");
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
        if (Intrinsics.a(paramK, Boolean.TRUE))
        {
          paramArrayList = paramArrayList.iterator();
          while (paramArrayList.hasNext()) {
            ((a)paramArrayList.next()).a();
          }
        }
      }
      return;
    }
    catch (JSONException paramArrayList)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     U1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */