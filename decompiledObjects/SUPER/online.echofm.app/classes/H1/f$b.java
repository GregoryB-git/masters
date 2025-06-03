package H1;

import G1.k;
import G1.k.a;
import android.os.AsyncTask;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.json.JSONObject;

public final class f$b
{
  public static final a i = new a(null);
  public String a;
  public String b;
  public String c;
  public int d;
  public float[] e;
  public File f;
  public b g;
  public Runnable h;
  
  public f$b(String paramString1, String paramString2, String paramString3, int paramInt, float[] paramArrayOfFloat)
  {
    a = paramString1;
    b = paramString2;
    c = paramString3;
    d = paramInt;
    e = paramArrayOfFloat;
  }
  
  public final String b()
  {
    return b;
  }
  
  public final b c()
  {
    return g;
  }
  
  public final File d()
  {
    return f;
  }
  
  public final String e()
  {
    return c;
  }
  
  public final float[] f()
  {
    return e;
  }
  
  public final String g()
  {
    return a;
  }
  
  public final int h()
  {
    return d;
  }
  
  public final void i(b paramb)
  {
    g = paramb;
  }
  
  public final b j(Runnable paramRunnable)
  {
    h = paramRunnable;
    return this;
  }
  
  public final void k(File paramFile)
  {
    f = paramFile;
  }
  
  public static final class a
  {
    public static final void g(List paramList, File paramFile)
    {
      Intrinsics.checkNotNullParameter(paramList, "$slaves");
      Intrinsics.checkNotNullParameter(paramFile, "file");
      paramFile = b.m.a(paramFile);
      if (paramFile != null)
      {
        Iterator localIterator = paramList.iterator();
        while (localIterator.hasNext())
        {
          paramList = (f.b)localIterator.next();
          Object localObject = new StringBuilder();
          ((StringBuilder)localObject).append(paramList.g());
          ((StringBuilder)localObject).append('_');
          ((StringBuilder)localObject).append(paramList.h());
          ((StringBuilder)localObject).append("_rule");
          localObject = ((StringBuilder)localObject).toString();
          f.b.i.e(paramList.e(), (String)localObject, new h(paramList, paramFile));
        }
      }
    }
    
    public static final void h(f.b paramb, b paramb1, File paramFile)
    {
      Intrinsics.checkNotNullParameter(paramb, "$slave");
      Intrinsics.checkNotNullParameter(paramFile, "file");
      paramb.i(paramb1);
      paramb.k(paramFile);
      paramb = f.b.a(paramb);
      if (paramb != null) {
        paramb.run();
      }
    }
    
    public final f.b c(JSONObject paramJSONObject)
    {
      Object localObject = null;
      if (paramJSONObject == null) {
        paramJSONObject = (JSONObject)localObject;
      }
      try
      {
        String str1 = paramJSONObject.getString("use_case");
        String str2 = paramJSONObject.getString("asset_uri");
        String str3 = paramJSONObject.optString("rules_uri", null);
        int i = paramJSONObject.getInt("version_id");
        float[] arrayOfFloat = f.d(f.a, paramJSONObject.getJSONArray("thresholds"));
        paramJSONObject = new H1/f$b;
        Intrinsics.checkNotNullExpressionValue(str1, "useCase");
        Intrinsics.checkNotNullExpressionValue(str2, "assetUri");
        paramJSONObject.<init>(str1, str2, str3, i, arrayOfFloat);
        return paramJSONObject;
      }
      catch (Exception paramJSONObject)
      {
        for (;;)
        {
          paramJSONObject = (JSONObject)localObject;
        }
      }
    }
    
    public final void d(String paramString, int paramInt)
    {
      Object localObject1 = j.a();
      if (localObject1 == null) {
        return;
      }
      localObject1 = ((File)localObject1).listFiles();
      if ((localObject1 != null) && (localObject1.length != 0))
      {
        Object localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append(paramString);
        ((StringBuilder)localObject2).append('_');
        ((StringBuilder)localObject2).append(paramInt);
        localObject2 = ((StringBuilder)localObject2).toString();
        int i = localObject1.length;
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject3 = localObject1[paramInt];
          int j = paramInt + 1;
          String str = ((File)localObject3).getName();
          Intrinsics.checkNotNullExpressionValue(str, "name");
          paramInt = j;
          if (i.s(str, paramString, false, 2, null))
          {
            paramInt = j;
            if (!i.s(str, (String)localObject2, false, 2, null))
            {
              ((File)localObject3).delete();
              paramInt = j;
            }
          }
        }
      }
    }
    
    public final void e(String paramString1, String paramString2, k.a parama)
    {
      paramString2 = new File(j.a(), paramString2);
      if ((paramString1 != null) && (!paramString2.exists()))
      {
        new k(paramString1, paramString2, parama).execute(new String[0]);
        return;
      }
      parama.a(paramString2);
    }
    
    public final void f(f.b paramb, List paramList)
    {
      Intrinsics.checkNotNullParameter(paramb, "master");
      Intrinsics.checkNotNullParameter(paramList, "slaves");
      d(paramb.g(), paramb.h());
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramb.g());
      ((StringBuilder)localObject).append('_');
      ((StringBuilder)localObject).append(paramb.h());
      localObject = ((StringBuilder)localObject).toString();
      e(paramb.b(), (String)localObject, new g(paramList));
    }
  }
}

/* Location:
 * Qualified Name:     H1.f.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */