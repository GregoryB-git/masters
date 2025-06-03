package com.facebook.share.internal;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

public class NativeDialogParameters
{
  private static Bundle create(ShareCameraEffectContent paramShareCameraEffectContent, Bundle paramBundle, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareCameraEffectContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "effect_id", paramShareCameraEffectContent.getEffectId());
    if (paramBundle != null) {
      localBundle.putBundle("effect_textures", paramBundle);
    }
    try
    {
      paramShareCameraEffectContent = CameraEffectJSONUtility.convertToJSON(paramShareCameraEffectContent.getArguments());
      if (paramShareCameraEffectContent != null) {
        Utility.putNonEmptyString(localBundle, "effect_arguments", paramShareCameraEffectContent.toString());
      }
      return localBundle;
    }
    catch (JSONException paramBundle)
    {
      paramShareCameraEffectContent = z2.t("Unable to create a JSON Object from the provided CameraEffectArguments: ");
      paramShareCameraEffectContent.append(paramBundle.getMessage());
      throw new FacebookException(paramShareCameraEffectContent.toString());
    }
  }
  
  private static Bundle create(ShareLinkContent paramShareLinkContent, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareLinkContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "TITLE", paramShareLinkContent.getContentTitle());
    Utility.putNonEmptyString(localBundle, "DESCRIPTION", paramShareLinkContent.getContentDescription());
    Utility.putUri(localBundle, "IMAGE", paramShareLinkContent.getImageUrl());
    Utility.putNonEmptyString(localBundle, "QUOTE", paramShareLinkContent.getQuote());
    Utility.putUri(localBundle, "MESSENGER_LINK", paramShareLinkContent.getContentUrl());
    Utility.putUri(localBundle, "TARGET_DISPLAY", paramShareLinkContent.getContentUrl());
    return localBundle;
  }
  
  private static Bundle create(ShareMediaContent paramShareMediaContent, List<Bundle> paramList, boolean paramBoolean)
  {
    paramShareMediaContent = createBaseParameters(paramShareMediaContent, paramBoolean);
    paramShareMediaContent.putParcelableArrayList("MEDIA", new ArrayList(paramList));
    return paramShareMediaContent;
  }
  
  private static Bundle create(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareMessengerGenericTemplateContent, paramBoolean);
    try
    {
      MessengerShareContentUtility.addGenericTemplateContent(localBundle, paramShareMessengerGenericTemplateContent);
      return localBundle;
    }
    catch (JSONException localJSONException)
    {
      paramShareMessengerGenericTemplateContent = z2.t("Unable to create a JSON Object from the provided ShareMessengerGenericTemplateContent: ");
      paramShareMessengerGenericTemplateContent.append(localJSONException.getMessage());
      throw new FacebookException(paramShareMessengerGenericTemplateContent.toString());
    }
  }
  
  private static Bundle create(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent, boolean paramBoolean)
  {
    Object localObject = createBaseParameters(paramShareMessengerMediaTemplateContent, paramBoolean);
    try
    {
      MessengerShareContentUtility.addMediaTemplateContent((Bundle)localObject, paramShareMessengerMediaTemplateContent);
      return (Bundle)localObject;
    }
    catch (JSONException paramShareMessengerMediaTemplateContent)
    {
      localObject = z2.t("Unable to create a JSON Object from the provided ShareMessengerMediaTemplateContent: ");
      ((StringBuilder)localObject).append(paramShareMessengerMediaTemplateContent.getMessage());
      throw new FacebookException(((StringBuilder)localObject).toString());
    }
  }
  
  private static Bundle create(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareMessengerOpenGraphMusicTemplateContent, paramBoolean);
    try
    {
      MessengerShareContentUtility.addOpenGraphMusicTemplateContent(localBundle, paramShareMessengerOpenGraphMusicTemplateContent);
      return localBundle;
    }
    catch (JSONException localJSONException)
    {
      paramShareMessengerOpenGraphMusicTemplateContent = z2.t("Unable to create a JSON Object from the provided ShareMessengerOpenGraphMusicTemplateContent: ");
      paramShareMessengerOpenGraphMusicTemplateContent.append(localJSONException.getMessage());
      throw new FacebookException(paramShareMessengerOpenGraphMusicTemplateContent.toString());
    }
  }
  
  private static Bundle create(ShareOpenGraphContent paramShareOpenGraphContent, JSONObject paramJSONObject, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareOpenGraphContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "PREVIEW_PROPERTY_NAME", (String)getFieldNameAndNamespaceFromFullNamegetPreviewPropertyNamesecond);
    Utility.putNonEmptyString(localBundle, "ACTION_TYPE", paramShareOpenGraphContent.getAction().getActionType());
    Utility.putNonEmptyString(localBundle, "ACTION", paramJSONObject.toString());
    return localBundle;
  }
  
  private static Bundle create(SharePhotoContent paramSharePhotoContent, List<String> paramList, boolean paramBoolean)
  {
    paramSharePhotoContent = createBaseParameters(paramSharePhotoContent, paramBoolean);
    paramSharePhotoContent.putStringArrayList("PHOTOS", new ArrayList(paramList));
    return paramSharePhotoContent;
  }
  
  private static Bundle create(ShareStoryContent paramShareStoryContent, @Nullable Bundle paramBundle1, @Nullable Bundle paramBundle2, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareStoryContent, paramBoolean);
    if (paramBundle1 != null) {
      localBundle.putParcelable("bg_asset", paramBundle1);
    }
    if (paramBundle2 != null) {
      localBundle.putParcelable("interactive_asset_uri", paramBundle2);
    }
    paramBundle1 = paramShareStoryContent.getBackgroundColorList();
    if (!Utility.isNullOrEmpty(paramBundle1)) {
      localBundle.putStringArrayList("top_background_color_list", new ArrayList(paramBundle1));
    }
    Utility.putNonEmptyString(localBundle, "content_url", paramShareStoryContent.getAttributionLink());
    return localBundle;
  }
  
  private static Bundle create(ShareVideoContent paramShareVideoContent, String paramString, boolean paramBoolean)
  {
    Bundle localBundle = createBaseParameters(paramShareVideoContent, paramBoolean);
    Utility.putNonEmptyString(localBundle, "TITLE", paramShareVideoContent.getContentTitle());
    Utility.putNonEmptyString(localBundle, "DESCRIPTION", paramShareVideoContent.getContentDescription());
    Utility.putNonEmptyString(localBundle, "VIDEO", paramString);
    return localBundle;
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
      paramShareContent = (ShareVideoContent)paramShareContent;
      paramUUID = create(paramShareContent, ShareInternalUtility.getVideoUrl(paramShareContent, paramUUID), paramBoolean);
    }
    else if ((paramShareContent instanceof ShareOpenGraphContent))
    {
      paramShareContent = (ShareOpenGraphContent)paramShareContent;
      try
      {
        paramUUID = create(paramShareContent, ShareInternalUtility.removeNamespacesFromOGJsonObject(ShareInternalUtility.toJSONObjectForCall(paramUUID, paramShareContent), false), paramBoolean);
      }
      catch (JSONException paramShareContent)
      {
        paramUUID = z2.t("Unable to create a JSON Object from the provided ShareOpenGraphContent: ");
        paramUUID.append(paramShareContent.getMessage());
        throw new FacebookException(paramUUID.toString());
      }
    }
    else if ((paramShareContent instanceof ShareMediaContent))
    {
      paramShareContent = (ShareMediaContent)paramShareContent;
      paramUUID = create(paramShareContent, ShareInternalUtility.getMediaInfos(paramShareContent, paramUUID), paramBoolean);
    }
    else if ((paramShareContent instanceof ShareCameraEffectContent))
    {
      paramShareContent = (ShareCameraEffectContent)paramShareContent;
      paramUUID = create(paramShareContent, ShareInternalUtility.getTextureUrlBundle(paramShareContent, paramUUID), paramBoolean);
    }
    else if ((paramShareContent instanceof ShareMessengerGenericTemplateContent))
    {
      paramUUID = create((ShareMessengerGenericTemplateContent)paramShareContent, paramBoolean);
    }
    else if ((paramShareContent instanceof ShareMessengerOpenGraphMusicTemplateContent))
    {
      paramUUID = create((ShareMessengerOpenGraphMusicTemplateContent)paramShareContent, paramBoolean);
    }
    else if ((paramShareContent instanceof ShareMessengerMediaTemplateContent))
    {
      paramUUID = create((ShareMessengerMediaTemplateContent)paramShareContent, paramBoolean);
    }
    else if ((paramShareContent instanceof ShareStoryContent))
    {
      paramShareContent = (ShareStoryContent)paramShareContent;
      paramUUID = create(paramShareContent, ShareInternalUtility.getBackgroundAssetMediaInfo(paramShareContent, paramUUID), ShareInternalUtility.getStickerUrl(paramShareContent, paramUUID), paramBoolean);
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
    Utility.putUri(localBundle, "LINK", paramShareContent.getContentUrl());
    Utility.putNonEmptyString(localBundle, "PLACE", paramShareContent.getPlaceId());
    Utility.putNonEmptyString(localBundle, "PAGE", paramShareContent.getPageId());
    Utility.putNonEmptyString(localBundle, "REF", paramShareContent.getRef());
    localBundle.putBoolean("DATA_FAILURES_FATAL", paramBoolean);
    List localList = paramShareContent.getPeopleIds();
    if (!Utility.isNullOrEmpty(localList)) {
      localBundle.putStringArrayList("FRIENDS", new ArrayList(localList));
    }
    paramShareContent = paramShareContent.getShareHashtag();
    if (paramShareContent != null) {
      Utility.putNonEmptyString(localBundle, "HASHTAG", paramShareContent.getHashtag());
    }
    return localBundle;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.NativeDialogParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */