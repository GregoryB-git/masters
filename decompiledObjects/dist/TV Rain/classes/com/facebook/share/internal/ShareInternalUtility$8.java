package com.facebook.share.internal;

import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.share.model.SharePhoto;
import org.json.JSONException;
import org.json.JSONObject;

final class ShareInternalUtility$8
  implements OpenGraphJSONUtility.PhotoJSONProcessor
{
  public JSONObject toJSONObject(SharePhoto paramSharePhoto)
  {
    paramSharePhoto = paramSharePhoto.getImageUrl();
    if (Utility.isWebUri(paramSharePhoto))
    {
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("url", paramSharePhoto.toString());
        return localJSONObject;
      }
      catch (JSONException paramSharePhoto)
      {
        throw new FacebookException("Unable to attach images", paramSharePhoto);
      }
    }
    throw new FacebookException("Only web images may be used in OG objects shared via the web dialog");
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */