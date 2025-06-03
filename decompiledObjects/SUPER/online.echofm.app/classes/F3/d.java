package F3;

import E3.f;
import G3.a;
import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class d
  implements b, G3.b
{
  public a a;
  
  public static String b(String paramString, Bundle paramBundle)
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localJSONObject2.put(str, paramBundle.get(str));
    }
    localJSONObject1.put("name", paramString);
    localJSONObject1.put("parameters", localJSONObject2);
    return localJSONObject1.toString();
  }
  
  public void a(a parama)
  {
    a = parama;
    f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
  }
  
  public void t(String paramString, Bundle paramBundle)
  {
    a locala = a;
    if (locala != null) {
      try
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localStringBuilder.append("$A$:");
        localStringBuilder.append(b(paramString, paramBundle));
        locala.a(localStringBuilder.toString());
      }
      catch (JSONException paramString)
      {
        f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
      }
    }
  }
}

/* Location:
 * Qualified Name:     F3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */