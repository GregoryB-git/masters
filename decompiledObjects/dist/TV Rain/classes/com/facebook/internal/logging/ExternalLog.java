package com.facebook.internal.logging;

import java.io.Serializable;
import org.json.JSONObject;

public abstract interface ExternalLog
  extends Serializable
{
  public abstract JSONObject convertToJSONObject();
  
  public abstract String getEventName();
  
  public abstract LogCategory getLogCategory();
}

/* Location:
 * Qualified Name:     com.facebook.internal.logging.ExternalLog
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */