package com.facebook.internal.instrument.errorreport;

import com.facebook.GraphRequest.Callback;
import com.facebook.GraphResponse;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

final class ErrorReportHandler$2
  implements GraphRequest.Callback
{
  public ErrorReportHandler$2(ArrayList paramArrayList) {}
  
  public void onCompleted(GraphResponse paramGraphResponse)
  {
    try
    {
      if ((paramGraphResponse.getError() == null) && (paramGraphResponse.getJSONObject().getBoolean("success"))) {
        for (int i = 0; val$validReports.size() > i; i++) {
          ((ErrorReportData)val$validReports.get(i)).clear();
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
 * Qualified Name:     com.facebook.internal.instrument.errorreport.ErrorReportHandler.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */