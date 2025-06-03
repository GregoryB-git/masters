package com.facebook.appevents;

import java.io.Serializable;
import org.json.JSONException;

class AppEvent$SerializationProxyV2
  implements Serializable
{
  private static final long serialVersionUID = 20160803001L;
  private final String checksum;
  private final boolean inBackground;
  private final boolean isImplicit;
  private final String jsonString;
  
  private AppEvent$SerializationProxyV2(String paramString1, boolean paramBoolean1, boolean paramBoolean2, String paramString2)
  {
    jsonString = paramString1;
    isImplicit = paramBoolean1;
    inBackground = paramBoolean2;
    checksum = paramString2;
  }
  
  private Object readResolve()
    throws JSONException
  {
    return new AppEvent(jsonString, isImplicit, inBackground, checksum, null);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.AppEvent.SerializationProxyV2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */