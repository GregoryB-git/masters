package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class LegacyNativeDialogParameters
{
  private static Bundle create(ShareLinkContent paramShareLinkContent, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareLinkContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.TITLE", paramShareLinkContent.getContentTitle());
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.DESCRIPTION", paramShareLinkContent.getContentDescription());
    Utility.putUri(localBundle, "com.facebook.platform.extra.IMAGE", paramShareLinkContent.getImageUrl());
    return localBundle;
  }
  
  private static Bundle create(ShareOpenGraphContent paramShareOpenGraphContent, JSONObject paramJSONObject, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareOpenGraphContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.PREVIEW_PROPERTY_NAME", paramShareOpenGraphContent.getPreviewPropertyName());
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.ACTION_TYPE", paramShareOpenGraphContent.getAction().getActionType());
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.ACTION", paramJSONObject.toString());
    return localBundle;
  }
  
  private static Bundle create(SharePhotoContent paramSharePhotoContent, List<String> paramList, boolean paramBoolean)
  {
    paramSharePhotoContent = createBaseParameters(paramSharePhotoContent, paramBoolean);
    paramSharePhotoContent.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(paramList));
    return paramSharePhotoContent;
  }
  
  private static Bundle create(ShareVideoContent paramShareVideoContent, boolean paramBoolean)
  {
    return null;
  }
  
  public static Bundle create(UUID paramUUID, ShareContent paramShareContent, boolean paramBoolean)
  {
    Validate.notNull(paramShareContent, "shareContent");
    Validate.notNull(paramUUID, "callId");
    if ((paramShareContent instanceof ShareLinkContent))
    {
      paramUUID = create((ShareLinkContent)paramShareContent, paramBoolean);
    }
    else if ((paramShareContent instanceof SharePhotoContent))
    {
      paramShareContent = (SharePhotoContent)paramShareContent;
      paramUUID = create(paramShareContent, ShareInternalUtility.getPhotoUrls(paramShareContent, paramUUID), paramBoolean);
    }
    else if ((paramShareContent instanceof ShareVideoContent))
    {
      paramUUID = create((ShareVideoContent)paramShareContent, paramBoolean);
    }
    else if ((paramShareContent instanceof ShareOpenGraphContent))
    {
      paramShareContent = (ShareOpenGraphContent)paramShareContent;
      try
      {
        paramUUID = create(paramShareContent, ShareInternalUtility.toJSONObjectForCall(paramUUID, paramShareContent), paramBoolean);
      }
      catch (JSONException paramUUID)
      {
        paramShareContent = z2.t("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
        paramShareContent.append(paramUUID.getMessage());
        throw new FacebookException(paramShareContent.toString());
      }
    }
    else
    {
      paramUUID = null;
    }
    return paramUUID;
  }
  
  private static Bundle createBaseParameters(ShareContent paramShareContent, boolean paramBoolean)
  {
    Bundle localBundle = new Bundle();
    Utility.putUri(localBundle, "com.facebook.platform.extra.LINK", paramShareContent.getContentUrl());
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.PLACE", paramShareContent.getPlaceId());
    Utility.putNonEmptyString(localBundle, "com.facebook.platform.extra.REF", paramShareContent.getRef());
    localBundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", paramBoolean);
    paramShareContent = paramShareContent.getPeopleIds();
    if (!Utility.isNullOrEmpty(paramShareContent)) {
      localBundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(paramShareContent));
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.LegacyNativeDialogParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */