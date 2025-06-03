package T3;

import U3.a;
import c4.c;
import java.util.Map;

public class n$d
  implements n.j
{
  public n$d(n paramn, boolean paramBoolean) {}
  
  public void a(Map paramMap)
  {
    String str1 = (String)paramMap.get("s");
    if (str1.equals("ok"))
    {
      n.P(b, n.k.s);
      n.y(b, 0);
      n.A(b, a);
    }
    else
    {
      n.B(b, null);
      n.C(b, true);
      n.D(b).e(false);
      String str2 = (String)paramMap.get("d");
      c localc = n.E(b);
      paramMap = new StringBuilder();
      paramMap.append("Authentication failed: ");
      paramMap.append(str1);
      paramMap.append(" (");
      paramMap.append(str2);
      paramMap.append(")");
      localc.b(paramMap.toString(), new Object[0]);
      n.F(b).c();
      if (str1.equals("invalid_token"))
      {
        n.z(b);
        if (n.x(b) >= 3L)
        {
          n.G(b).d();
          n.E(b).i("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     T3.n.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */