package s3;

import A2.q;
import android.content.Context;
import android.text.TextUtils;

public final class m
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  
  public m(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    A2.n.m(E2.n.a(paramString1) ^ true, "ApplicationId must be set.");
    b = paramString1;
    a = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
    f = paramString6;
    g = paramString7;
  }
  
  public static m a(Context paramContext)
  {
    paramContext = new q(paramContext);
    String str = paramContext.a("google_app_id");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return new m(str, paramContext.a("google_api_key"), paramContext.a("firebase_database_url"), paramContext.a("ga_trackingId"), paramContext.a("gcm_defaultSenderId"), paramContext.a("google_storage_bucket"), paramContext.a("project_id"));
  }
  
  public String b()
  {
    return a;
  }
  
  public String c()
  {
    return b;
  }
  
  public String d()
  {
    return c;
  }
  
  public String e()
  {
    return d;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof m;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (m)paramObject;
    bool1 = bool2;
    if (A2.m.a(b, b))
    {
      bool1 = bool2;
      if (A2.m.a(a, a))
      {
        bool1 = bool2;
        if (A2.m.a(c, c))
        {
          bool1 = bool2;
          if (A2.m.a(d, d))
          {
            bool1 = bool2;
            if (A2.m.a(e, e))
            {
              bool1 = bool2;
              if (A2.m.a(f, f))
              {
                bool1 = bool2;
                if (A2.m.a(g, g)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    return bool1;
  }
  
  public String f()
  {
    return e;
  }
  
  public String g()
  {
    return g;
  }
  
  public String h()
  {
    return f;
  }
  
  public int hashCode()
  {
    return A2.m.b(new Object[] { b, a, c, d, e, f, g });
  }
  
  public String toString()
  {
    return A2.m.c(this).a("applicationId", b).a("apiKey", a).a("databaseUrl", c).a("gcmSenderId", e).a("storageBucket", f).a("projectId", g).toString();
  }
  
  public static final class b
  {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    
    public m a()
    {
      return new m(b, a, c, d, e, f, g, null);
    }
    
    public b b(String paramString)
    {
      a = A2.n.f(paramString, "ApiKey must be set.");
      return this;
    }
    
    public b c(String paramString)
    {
      b = A2.n.f(paramString, "ApplicationId must be set.");
      return this;
    }
    
    public b d(String paramString)
    {
      c = paramString;
      return this;
    }
    
    public b e(String paramString)
    {
      d = paramString;
      return this;
    }
    
    public b f(String paramString)
    {
      e = paramString;
      return this;
    }
    
    public b g(String paramString)
    {
      g = paramString;
      return this;
    }
    
    public b h(String paramString)
    {
      f = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     s3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */