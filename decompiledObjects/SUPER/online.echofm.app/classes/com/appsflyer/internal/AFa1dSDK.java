package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.concurrent.Executor;

final class AFa1dSDK
  extends AFb1hSDK<String>
{
  public AFa1dSDK(Context paramContext, AFc1xSDK paramAFc1xSDK)
  {
    super(paramContext, paramAFc1xSDK, "com.facebook.katana.provider.AttributionIdProvider", new String[] { "E3F9E1E0CF99D0E56A055BA65E241B3399F7CEA524326B0CDD6EC1327ED0FDC1" });
  }
  
  private String AFInAppEventParameterName()
  {
    try
    {
      Object localObject1 = AFInAppEventParameterName.getContentResolver();
      localObject4 = new java/lang/StringBuilder;
      ((StringBuilder)localObject4).<init>("content://");
      ((StringBuilder)localObject4).append(AFKeystoreWrapper);
      localObject4 = ((ContentResolver)localObject1).query(Uri.parse(localObject4.toString()), new String[] { "aid" }, null, null, null);
      if (localObject4 != null) {
        try
        {
          if (((Cursor)localObject4).moveToFirst())
          {
            localObject1 = ((Cursor)localObject4).getString(((Cursor)localObject4).getColumnIndexOrThrow("aid"));
            ((Cursor)localObject4).close();
            return (String)localObject1;
          }
        }
        finally
        {
          break label106;
        }
      }
      if (localObject4 != null) {
        ((Cursor)localObject4).close();
      }
      return null;
    }
    finally
    {
      Object localObject4 = null;
      label106:
      if (localObject4 != null) {
        ((Cursor)localObject4).close();
      }
    }
  }
  
  public final String AFInAppEventType()
  {
    AFInAppEventType.AFInAppEventType().execute(values);
    return (String)super.valueOf();
  }
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.AFa1dSDK
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */