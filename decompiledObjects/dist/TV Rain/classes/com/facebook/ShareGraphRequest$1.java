package com.facebook;

import android.net.Uri;
import com.facebook.share.internal.OpenGraphJSONUtility.PhotoJSONProcessor;
import com.facebook.share.model.SharePhoto;
import org.json.JSONObject;

final class ShareGraphRequest$1
  implements OpenGraphJSONUtility.PhotoJSONProcessor
{
  public JSONObject toJSONObject(SharePhoto paramSharePhoto)
  {
    Uri localUri = paramSharePhoto.getImageUrl();
    paramSharePhoto = new JSONObject();
    try
    {
      paramSharePhoto.put("url", localUri.toString());
      return paramSharePhoto;
    }
    catch (Exception paramSharePhoto)
    {
      throw new FacebookException("Unable to attach images", paramSharePhoto);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.ShareGraphRequest.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */