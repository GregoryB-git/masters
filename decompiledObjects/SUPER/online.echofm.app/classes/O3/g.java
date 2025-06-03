package O3;

import E3.f;
import H3.x;
import org.json.JSONObject;

public class g
{
  public final x a;
  
  public g(x paramx)
  {
    a = paramx;
  }
  
  public static h a(int paramInt)
  {
    if (paramInt != 3)
    {
      f localf = f.f();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Could not determine SettingsJsonTransform for settings version ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(". Using default settings values.");
      localf.d(localStringBuilder.toString());
      return new b();
    }
    return new l();
  }
  
  public d b(JSONObject paramJSONObject)
  {
    return a(paramJSONObject.getInt("settings_version")).a(a, paramJSONObject);
  }
}

/* Location:
 * Qualified Name:     O3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */