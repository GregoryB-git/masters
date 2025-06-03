package D5;

import org.json.JSONObject;

public class w$c
{
  public final w.g a;
  public final boolean b;
  public final boolean c;
  
  public w$c(w.g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    a = paramg;
    b = paramBoolean1;
    c = paramBoolean2;
  }
  
  public static c a(JSONObject paramJSONObject)
  {
    return new c(w.g.e(paramJSONObject.getString("name")), paramJSONObject.optBoolean("signed", false), paramJSONObject.optBoolean("decimal", false));
  }
}

/* Location:
 * Qualified Name:     D5.w.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */