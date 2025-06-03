package com.facebook.share.internal;

import com.facebook.FacebookException;
import com.facebook.internal.NativeAppCallAttachmentStore.Attachment;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

final class ShareInternalUtility$7
  implements OpenGraphJSONUtility.PhotoJSONProcessor
{
  public ShareInternalUtility$7(UUID paramUUID, ArrayList paramArrayList) {}
  
  public JSONObject toJSONObject(SharePhoto paramSharePhoto)
  {
    NativeAppCallAttachmentStore.Attachment localAttachment = ShareInternalUtility.access$000(val$callId, paramSharePhoto);
    if (localAttachment == null) {
      return null;
    }
    val$attachments.add(localAttachment);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", localAttachment.getAttachmentUrl());
      if (paramSharePhoto.getUserGenerated()) {
        localJSONObject.put("user_generated", true);
      }
      return localJSONObject;
    }
    catch (JSONException paramSharePhoto)
    {
      throw new FacebookException("Unable to attach images", paramSharePhoto);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.ShareInternalUtility.7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */