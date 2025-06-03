package com.facebook.share.internal;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareMessengerActionButton;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerGenericTemplateContent.ImageAspectRatio;
import com.facebook.share.model.ShareMessengerGenericTemplateElement;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent.MediaType;
import com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import com.facebook.share.model.ShareMessengerURLActionButton.WebviewHeightRatio;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessengerShareContentUtility
{
  public static final String ATTACHMENT = "attachment";
  public static final String ATTACHMENT_ID = "attachment_id";
  public static final String ATTACHMENT_PAYLOAD = "payload";
  public static final String ATTACHMENT_TEMPLATE_TYPE = "template";
  public static final String ATTACHMENT_TYPE = "type";
  public static final String BUTTONS = "buttons";
  public static final String BUTTON_TYPE = "type";
  public static final String BUTTON_URL_TYPE = "web_url";
  public static final String DEFAULT_ACTION = "default_action";
  public static final String ELEMENTS = "elements";
  public static final Pattern FACEBOOK_DOMAIN = Pattern.compile("^(.+)\\.(facebook\\.com)$");
  public static final String FALLBACK_URL = "fallback_url";
  public static final String IMAGE_ASPECT_RATIO = "image_aspect_ratio";
  public static final String IMAGE_RATIO_HORIZONTAL = "horizontal";
  public static final String IMAGE_RATIO_SQUARE = "square";
  public static final String IMAGE_URL = "image_url";
  public static final String MEDIA_IMAGE = "image";
  public static final String MEDIA_TYPE = "media_type";
  public static final String MEDIA_VIDEO = "video";
  public static final String MESSENGER_EXTENSIONS = "messenger_extensions";
  public static final String PREVIEW_DEFAULT = "DEFAULT";
  public static final String PREVIEW_OPEN_GRAPH = "OPEN_GRAPH";
  public static final String SHARABLE = "sharable";
  public static final String SHARE_BUTTON_HIDE = "hide";
  public static final String SUBTITLE = "subtitle";
  public static final String TEMPLATE_GENERIC_TYPE = "generic";
  public static final String TEMPLATE_MEDIA_TYPE = "media";
  public static final String TEMPLATE_OPEN_GRAPH_TYPE = "open_graph";
  public static final String TEMPLATE_TYPE = "template_type";
  public static final String TITLE = "title";
  public static final String URL = "url";
  public static final String WEBVIEW_RATIO = "webview_height_ratio";
  public static final String WEBVIEW_RATIO_COMPACT = "compact";
  public static final String WEBVIEW_RATIO_FULL = "full";
  public static final String WEBVIEW_RATIO_TALL = "tall";
  public static final String WEBVIEW_SHARE_BUTTON = "webview_share_button";
  
  private static void addActionButton(Bundle paramBundle, ShareMessengerActionButton paramShareMessengerActionButton, boolean paramBoolean)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    if (paramShareMessengerActionButton == null) {
      return;
    }
    try
    {
      if ((paramShareMessengerActionButton instanceof ShareMessengerURLActionButton)) {
        addURLActionButton(paramBundle, (ShareMessengerURLActionButton)paramShareMessengerActionButton, paramBoolean);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  public static void addGenericTemplateContent(Bundle paramBundle, ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      addGenericTemplateElementForPreview(paramBundle, paramShareMessengerGenericTemplateContent.getGenericTemplateElement());
      Utility.putJSONValueInBundle(paramBundle, "MESSENGER_PLATFORM_CONTENT", serializeGenericTemplateContent(paramShareMessengerGenericTemplateContent));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  private static void addGenericTemplateElementForPreview(Bundle paramBundle, ShareMessengerGenericTemplateElement paramShareMessengerGenericTemplateElement)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      if (paramShareMessengerGenericTemplateElement.getButton() != null) {
        addActionButton(paramBundle, paramShareMessengerGenericTemplateElement.getButton(), false);
      } else if (paramShareMessengerGenericTemplateElement.getDefaultAction() != null) {
        addActionButton(paramBundle, paramShareMessengerGenericTemplateElement.getDefaultAction(), true);
      }
      Utility.putUri(paramBundle, "IMAGE", paramShareMessengerGenericTemplateElement.getImageUrl());
      Utility.putNonEmptyString(paramBundle, "PREVIEW_TYPE", "DEFAULT");
      Utility.putNonEmptyString(paramBundle, "TITLE", paramShareMessengerGenericTemplateElement.getTitle());
      Utility.putNonEmptyString(paramBundle, "SUBTITLE", paramShareMessengerGenericTemplateElement.getSubtitle());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  public static void addMediaTemplateContent(Bundle paramBundle, ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      addMediaTemplateContentForPreview(paramBundle, paramShareMessengerMediaTemplateContent);
      Utility.putJSONValueInBundle(paramBundle, "MESSENGER_PLATFORM_CONTENT", serializeMediaTemplateContent(paramShareMessengerMediaTemplateContent));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  private static void addMediaTemplateContentForPreview(Bundle paramBundle, ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      addActionButton(paramBundle, paramShareMessengerMediaTemplateContent.getButton(), false);
      Utility.putNonEmptyString(paramBundle, "PREVIEW_TYPE", "DEFAULT");
      Utility.putNonEmptyString(paramBundle, "ATTACHMENT_ID", paramShareMessengerMediaTemplateContent.getAttachmentId());
      if (paramShareMessengerMediaTemplateContent.getMediaUrl() != null) {
        Utility.putUri(paramBundle, getMediaUrlKey(paramShareMessengerMediaTemplateContent.getMediaUrl()), paramShareMessengerMediaTemplateContent.getMediaUrl());
      }
      Utility.putNonEmptyString(paramBundle, "type", getMediaType(paramShareMessengerMediaTemplateContent.getMediaType()));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  public static void addOpenGraphMusicTemplateContent(Bundle paramBundle, ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      addOpenGraphMusicTemplateContentForPreview(paramBundle, paramShareMessengerOpenGraphMusicTemplateContent);
      Utility.putJSONValueInBundle(paramBundle, "MESSENGER_PLATFORM_CONTENT", serializeOpenGraphMusicTemplateContent(paramShareMessengerOpenGraphMusicTemplateContent));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  private static void addOpenGraphMusicTemplateContentForPreview(Bundle paramBundle, ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    try
    {
      addActionButton(paramBundle, paramShareMessengerOpenGraphMusicTemplateContent.getButton(), false);
      Utility.putNonEmptyString(paramBundle, "PREVIEW_TYPE", "OPEN_GRAPH");
      Utility.putUri(paramBundle, "OPEN_GRAPH_URL", paramShareMessengerOpenGraphMusicTemplateContent.getUrl());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  private static void addURLActionButton(Bundle paramBundle, ShareMessengerURLActionButton paramShareMessengerURLActionButton, boolean paramBoolean)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return;
    }
    if (paramBoolean) {}
    try
    {
      Object localObject = Utility.getUriString(paramShareMessengerURLActionButton.getUrl());
      break label66;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append(paramShareMessengerURLActionButton.getTitle());
      ((StringBuilder)localObject).append(" - ");
      ((StringBuilder)localObject).append(Utility.getUriString(paramShareMessengerURLActionButton.getUrl()));
      localObject = ((StringBuilder)localObject).toString();
      label66:
      Utility.putNonEmptyString(paramBundle, "TARGET_DISPLAY", (String)localObject);
      Utility.putUri(paramBundle, "ITEM_URL", paramShareMessengerURLActionButton.getUrl());
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, MessengerShareContentUtility.class);
    }
  }
  
  private static String getImageRatioString(ShareMessengerGenericTemplateContent.ImageAspectRatio paramImageAspectRatio)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    if (paramImageAspectRatio == null) {
      return "horizontal";
    }
    try
    {
      if (1.$SwitchMap$com$facebook$share$model$ShareMessengerGenericTemplateContent$ImageAspectRatio[paramImageAspectRatio.ordinal()] != 1) {
        return "horizontal";
      }
      return "square";
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramImageAspectRatio, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static String getMediaType(ShareMessengerMediaTemplateContent.MediaType paramMediaType)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    if (paramMediaType == null) {
      return "image";
    }
    try
    {
      if (1.$SwitchMap$com$facebook$share$model$ShareMessengerMediaTemplateContent$MediaType[paramMediaType.ordinal()] != 1) {
        return "image";
      }
      return "video";
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramMediaType, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static String getMediaUrlKey(Uri paramUri)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      paramUri = paramUri.getHost();
      if ((!Utility.isNullOrEmpty(paramUri)) && (FACEBOOK_DOMAIN.matcher(paramUri).matches())) {
        paramUri = "uri";
      } else {
        paramUri = "IMAGE";
      }
      return paramUri;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramUri, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static String getShouldHideShareButton(ShareMessengerURLActionButton paramShareMessengerURLActionButton)
  {
    boolean bool = CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class);
    String str = null;
    if (bool) {
      return null;
    }
    try
    {
      if (paramShareMessengerURLActionButton.getShouldHideWebviewShareButton()) {
        str = "hide";
      }
      return str;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerURLActionButton, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static String getWebviewHeightRatioString(ShareMessengerURLActionButton.WebviewHeightRatio paramWebviewHeightRatio)
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    if (paramWebviewHeightRatio == null) {
      return "full";
    }
    try
    {
      int i = 1.$SwitchMap$com$facebook$share$model$ShareMessengerURLActionButton$WebviewHeightRatio[paramWebviewHeightRatio.ordinal()];
      if (i != 1)
      {
        if (i != 2) {
          return "full";
        }
        return "tall";
      }
      return "compact";
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramWebviewHeightRatio, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeActionButton(ShareMessengerActionButton paramShareMessengerActionButton)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      paramShareMessengerActionButton = serializeActionButton(paramShareMessengerActionButton, false);
      return paramShareMessengerActionButton;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerActionButton, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeActionButton(ShareMessengerActionButton paramShareMessengerActionButton, boolean paramBoolean)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      if ((paramShareMessengerActionButton instanceof ShareMessengerURLActionButton))
      {
        paramShareMessengerActionButton = serializeURLActionButton((ShareMessengerURLActionButton)paramShareMessengerActionButton, paramBoolean);
        return paramShareMessengerActionButton;
      }
      return null;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerActionButton, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeGenericTemplateContent(ShareMessengerGenericTemplateContent paramShareMessengerGenericTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONArray;
      ((JSONArray)localObject).<init>();
      JSONArray localJSONArray = ((JSONArray)localObject).put(serializeGenericTemplateElement(paramShareMessengerGenericTemplateContent.getGenericTemplateElement()));
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      localObject = ((JSONObject)localObject).put("template_type", "generic").put("sharable", paramShareMessengerGenericTemplateContent.getIsSharable()).put("image_aspect_ratio", getImageRatioString(paramShareMessengerGenericTemplateContent.getImageAspectRatio())).put("elements", localJSONArray);
      paramShareMessengerGenericTemplateContent = new org/json/JSONObject;
      paramShareMessengerGenericTemplateContent.<init>();
      localObject = paramShareMessengerGenericTemplateContent.put("type", "template").put("payload", localObject);
      paramShareMessengerGenericTemplateContent = new org/json/JSONObject;
      paramShareMessengerGenericTemplateContent.<init>();
      paramShareMessengerGenericTemplateContent = paramShareMessengerGenericTemplateContent.put("attachment", localObject);
      return paramShareMessengerGenericTemplateContent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerGenericTemplateContent, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeGenericTemplateElement(ShareMessengerGenericTemplateElement paramShareMessengerGenericTemplateElement)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      JSONObject localJSONObject = ((JSONObject)localObject).put("title", paramShareMessengerGenericTemplateElement.getTitle()).put("subtitle", paramShareMessengerGenericTemplateElement.getSubtitle()).put("image_url", Utility.getUriString(paramShareMessengerGenericTemplateElement.getImageUrl()));
      if (paramShareMessengerGenericTemplateElement.getButton() != null)
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        ((JSONArray)localObject).put(serializeActionButton(paramShareMessengerGenericTemplateElement.getButton()));
        localJSONObject.put("buttons", localObject);
      }
      if (paramShareMessengerGenericTemplateElement.getDefaultAction() != null) {
        localJSONObject.put("default_action", serializeActionButton(paramShareMessengerGenericTemplateElement.getDefaultAction(), true));
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerGenericTemplateElement, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeMediaTemplateContent(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONArray;
      ((JSONArray)localObject).<init>();
      paramShareMessengerMediaTemplateContent = ((JSONArray)localObject).put(serializeMediaTemplateElement(paramShareMessengerMediaTemplateContent));
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      localObject = ((JSONObject)localObject).put("template_type", "media").put("elements", paramShareMessengerMediaTemplateContent);
      paramShareMessengerMediaTemplateContent = new org/json/JSONObject;
      paramShareMessengerMediaTemplateContent.<init>();
      paramShareMessengerMediaTemplateContent = paramShareMessengerMediaTemplateContent.put("type", "template").put("payload", localObject);
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      paramShareMessengerMediaTemplateContent = ((JSONObject)localObject).put("attachment", paramShareMessengerMediaTemplateContent);
      return paramShareMessengerMediaTemplateContent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerMediaTemplateContent, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeMediaTemplateElement(ShareMessengerMediaTemplateContent paramShareMessengerMediaTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject = localJSONObject.put("attachment_id", paramShareMessengerMediaTemplateContent.getAttachmentId()).put("url", Utility.getUriString(paramShareMessengerMediaTemplateContent.getMediaUrl())).put("media_type", getMediaType(paramShareMessengerMediaTemplateContent.getMediaType()));
      if (paramShareMessengerMediaTemplateContent.getButton() != null)
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        localJSONArray.put(serializeActionButton(paramShareMessengerMediaTemplateContent.getButton()));
        localJSONObject.put("buttons", localJSONArray);
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerMediaTemplateContent, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeOpenGraphMusicTemplateContent(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONArray;
      ((JSONArray)localObject).<init>();
      localObject = ((JSONArray)localObject).put(serializeOpenGraphMusicTemplateElement(paramShareMessengerOpenGraphMusicTemplateContent));
      paramShareMessengerOpenGraphMusicTemplateContent = new org/json/JSONObject;
      paramShareMessengerOpenGraphMusicTemplateContent.<init>();
      paramShareMessengerOpenGraphMusicTemplateContent = paramShareMessengerOpenGraphMusicTemplateContent.put("template_type", "open_graph").put("elements", localObject);
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      localObject = ((JSONObject)localObject).put("type", "template").put("payload", paramShareMessengerOpenGraphMusicTemplateContent);
      paramShareMessengerOpenGraphMusicTemplateContent = new org/json/JSONObject;
      paramShareMessengerOpenGraphMusicTemplateContent.<init>();
      paramShareMessengerOpenGraphMusicTemplateContent = paramShareMessengerOpenGraphMusicTemplateContent.put("attachment", localObject);
      return paramShareMessengerOpenGraphMusicTemplateContent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerOpenGraphMusicTemplateContent, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeOpenGraphMusicTemplateElement(ShareMessengerOpenGraphMusicTemplateContent paramShareMessengerOpenGraphMusicTemplateContent)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      JSONObject localJSONObject = ((JSONObject)localObject).put("url", Utility.getUriString(paramShareMessengerOpenGraphMusicTemplateContent.getUrl()));
      if (paramShareMessengerOpenGraphMusicTemplateContent.getButton() != null)
      {
        localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>();
        ((JSONArray)localObject).put(serializeActionButton(paramShareMessengerOpenGraphMusicTemplateContent.getButton()));
        localJSONObject.put("buttons", localObject);
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerOpenGraphMusicTemplateContent, MessengerShareContentUtility.class);
    }
    return null;
  }
  
  private static JSONObject serializeURLActionButton(ShareMessengerURLActionButton paramShareMessengerURLActionButton, boolean paramBoolean)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(MessengerShareContentUtility.class)) {
      return null;
    }
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      JSONObject localJSONObject = ((JSONObject)localObject).put("type", "web_url");
      if (paramBoolean) {
        localObject = null;
      } else {
        localObject = paramShareMessengerURLActionButton.getTitle();
      }
      paramShareMessengerURLActionButton = localJSONObject.put("title", localObject).put("url", Utility.getUriString(paramShareMessengerURLActionButton.getUrl())).put("webview_height_ratio", getWebviewHeightRatioString(paramShareMessengerURLActionButton.getWebviewHeightRatio())).put("messenger_extensions", paramShareMessengerURLActionButton.getIsMessengerExtensionURL()).put("fallback_url", Utility.getUriString(paramShareMessengerURLActionButton.getFallbackUrl())).put("webview_share_button", getShouldHideShareButton(paramShareMessengerURLActionButton));
      return paramShareMessengerURLActionButton;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareMessengerURLActionButton, MessengerShareContentUtility.class);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.MessengerShareContentUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */