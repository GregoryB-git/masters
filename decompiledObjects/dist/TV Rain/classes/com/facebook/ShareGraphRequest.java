package com.facebook;

import android.net.Uri;
import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.share.internal.OpenGraphJSONUtility;
import com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class ShareGraphRequest
{
  public static GraphRequest createOpenGraphObject(ShareOpenGraphObject paramShareOpenGraphObject)
    throws FacebookException
  {
    Object localObject1 = paramShareOpenGraphObject.getString("type");
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = paramShareOpenGraphObject.getString("og:type");
    }
    if (localObject2 != null) {
      try
      {
        localObject1 = new com/facebook/ShareGraphRequest$1;
        ((1)localObject1).<init>();
        localObject1 = (JSONObject)OpenGraphJSONUtility.toJSONValue(paramShareOpenGraphObject, (OpenGraphJSONUtility.PhotoJSONProcessor)localObject1);
        paramShareOpenGraphObject = new android/os/Bundle;
        paramShareOpenGraphObject.<init>();
        paramShareOpenGraphObject.putString("object", ((JSONObject)localObject1).toString());
        Locale localLocale = Locale.ROOT;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("objects/");
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = String.format(localLocale, "%s/%s", new Object[] { "me", ((StringBuilder)localObject1).toString() });
        paramShareOpenGraphObject = new GraphRequest(AccessToken.getCurrentAccessToken(), (String)localObject2, paramShareOpenGraphObject, HttpMethod.POST);
        return paramShareOpenGraphObject;
      }
      catch (JSONException paramShareOpenGraphObject)
      {
        throw new FacebookException(paramShareOpenGraphObject.getMessage());
      }
    }
    throw new FacebookException("Open graph object type cannot be null");
  }
}

/* Location:
 * Qualified Name:     com.facebook.ShareGraphRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */