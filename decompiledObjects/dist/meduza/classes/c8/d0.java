package c8;

import b8.s;
import com.google.android.gms.internal.firebase_auth_api.zzzp;
import java.util.HashMap;
import java.util.Map;
import p6.a;

public final class d0
{
  public static final a a = new a("GetTokenResultFactory", new String[0]);
  
  public static s a(String paramString)
  {
    HashMap localHashMap;
    try
    {
      Map localMap = c0.b(paramString);
    }
    catch (zzzp localzzzp)
    {
      a.b("Error parsing token claims", localzzzp, new Object[0]);
      localHashMap = new HashMap();
    }
    return new s(paramString, localHashMap);
  }
}

/* Location:
 * Qualified Name:     c8.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */