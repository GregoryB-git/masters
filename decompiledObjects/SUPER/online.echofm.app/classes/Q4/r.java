package Q4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import w3.a;

public class r
{
  public final r4.b a;
  public final Map b = Collections.synchronizedMap(new HashMap());
  
  public r(r4.b paramb)
  {
    a = paramb;
  }
  
  public void a(String paramString, com.google.firebase.remoteconfig.internal.b paramb)
  {
    a locala = (a)a.get();
    if (locala == null) {
      return;
    }
    Object localObject1 = paramb.h();
    if (((JSONObject)localObject1).length() < 1) {
      return;
    }
    paramb = paramb.f();
    if (paramb.length() < 1) {
      return;
    }
    JSONObject localJSONObject = ((JSONObject)localObject1).optJSONObject(paramString);
    if (localJSONObject == null) {
      return;
    }
    localObject1 = localJSONObject.optString("choiceId");
    if (((String)localObject1).isEmpty()) {
      return;
    }
    synchronized (b)
    {
      if (((String)localObject1).equals(b.get(paramString))) {
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     Q4.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */