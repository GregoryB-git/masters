package com.facebook.internal.instrument;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import org.json.JSONException;
import org.json.JSONObject;

final class ExceptionAnalyzer$1
  implements GraphRequest.Callback
{
  public ExceptionAnalyzer$1(InstrumentData paramInstrumentData) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    try
    {
      if ((paramGraphResponse.getError() == null) && (paramGraphResponse.getJSONObject().getBoolean("success"))) {
        val$instrumentData.clear();
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
 * Qualified Name:     com.facebook.internal.instrument.ExceptionAnalyzer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */