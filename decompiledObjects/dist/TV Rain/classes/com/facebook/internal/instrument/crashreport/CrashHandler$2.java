package com.facebook.internal.instrument.crashreport;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import com.facebook.internal.instrument.InstrumentData;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

final class CrashHandler$2
  implements GraphRequest.Callback
{
  public CrashHandler$2(ArrayList paramArrayList) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    try
    {
      if ((paramGraphResponse.getError() == null) && (paramGraphResponse.getJSONObject().getBoolean("success"))) {
        for (int i = 0; val$validReports.size() > i; i++) {
          ((InstrumentData)val$validReports.get(i)).clear();
        }
      }
      return;
    }
    catch (JSONException paramGraphResponse)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.crashreport.CrashHandler.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */