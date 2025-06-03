package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

class AppEvent$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final boolean inBackground;
  private final boolean isImplicit;
  private final String jsonString;
  
  private AppEvent$SerializationProxyV1(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    jsonString = paramString;
    isImplicit = paramBoolean1;
    inBackground = paramBoolean2;
  }
  
  private Object readResolve()
    throws JSONException
  {
    return new AppEvent(jsonString, isImplicit, inBackground, null, null);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEvent.SerializationProxyV1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */