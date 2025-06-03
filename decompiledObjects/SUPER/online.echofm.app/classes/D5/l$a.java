package D5;

import E5.j;
import E5.k.c;
import E5.k.d;
import org.json.JSONException;
import org.json.JSONObject;

public class l$a
  implements k.c
{
  public l$a(l paraml) {}
  
  public void onMethodCall(j paramj, k.d paramd)
  {
    if (l.a(a) == null) {
      return;
    }
    String str = a;
    str.hashCode();
    if (!str.equals("Localization.getStringResource"))
    {
      paramd.c();
    }
    else
    {
      paramj = (JSONObject)paramj.b();
      try
      {
        str = paramj.getString("key");
        if (paramj.has("locale")) {
          paramj = paramj.getString("locale");
        }
      }
      catch (JSONException paramj)
      {
        break label102;
      }
      paramj = null;
      paramd.a(l.a(a).a(str, paramj));
      return;
      label102:
      paramd.b("error", paramj.getMessage(), null);
    }
  }
}

/* Location:
 * Qualified Name:     D5.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */