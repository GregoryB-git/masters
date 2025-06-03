package com.google.ads.interactivemedia.v3.internal;

import org.json.JSONObject;

public class fc<T extends fk>
{
  private final c a;
  private final c b;
  private final boolean c;
  
  private fc(c paramc1, c paramc2, boolean paramBoolean)
  {
    a = paramc1;
    if (paramc2 == null) {
      b = c.b;
    } else {
      b = paramc2;
    }
    c = paramBoolean;
  }
  
  public static fc a(c paramc1, c paramc2, boolean paramBoolean)
  {
    h.a(paramc1, "Impression owner is null");
    h.a(paramc1);
    return new fc(paramc1, paramc2, paramBoolean);
  }
  
  public JSONObject a()
  {
    JSONObject localJSONObject = new JSONObject();
    aa.a(localJSONObject, "impressionOwner", a);
    aa.a(localJSONObject, "videoEventsOwner", b);
    aa.a(localJSONObject, "isolateVerificationScripts", Boolean.valueOf(c));
    return localJSONObject;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.fc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */