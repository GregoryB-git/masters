package u7;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;
import l3.l;
import m6.h;
import m6.h.a;
import v6.g;

public final class j
{
  public final String a;
  public final String b;
  public final String c;
  public final String d;
  public final String e;
  public final String f;
  public final String g;
  
  public j(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    m6.j.k(g.b(paramString1) ^ true, "ApplicationId must be set.");
    b = paramString1;
    a = paramString2;
    c = paramString3;
    d = paramString4;
    e = paramString5;
    f = paramString6;
    g = paramString7;
  }
  
  public static j a(Context paramContext)
  {
    paramContext = new l(paramContext);
    String str = paramContext.b("google_app_id");
    if (TextUtils.isEmpty(str)) {
      return null;
    }
    return new j(str, paramContext.b("google_api_key"), paramContext.b("firebase_database_url"), paramContext.b("ga_trackingId"), paramContext.b("gcm_defaultSenderId"), paramContext.b("google_storage_bucket"), paramContext.b("project_id"));
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof j;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (j)paramObject;
    bool1 = bool2;
    if (h.a(b, b))
    {
      bool1 = bool2;
      if (h.a(a, a))
      {
        bool1 = bool2;
        if (h.a(c, c))
        {
          bool1 = bool2;
          if (h.a(d, d))
          {
            bool1 = bool2;
            if (h.a(e, e))
            {
              bool1 = bool2;
              if (h.a(f, f))
              {
                bool1 = bool2;
                if (h.a(g, g)) {
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
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { b, a, c, d, e, f, g });
  }
  
  public final String toString()
  {
    h.a locala = new h.a(this);
    locala.a(b, "applicationId");
    locala.a(a, "apiKey");
    locala.a(c, "databaseUrl");
    locala.a(e, "gcmSenderId");
    locala.a(f, "storageBucket");
    locala.a(g, "projectId");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     u7.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */