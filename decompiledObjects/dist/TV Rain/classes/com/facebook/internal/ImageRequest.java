package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.util.Log;
import com.facebook.FacebookSdk;
import java.util.Locale;

public class ImageRequest
{
  private static final String ACCESS_TOKEN_PARAM = "access_token";
  private static final String HEIGHT_PARAM = "height";
  private static final String MIGRATION_PARAM = "migration_overrides";
  private static final String MIGRATION_VALUE = "{october_2012:true}";
  private static final String PATH = "%s/%s/picture";
  public static final int UNSPECIFIED_DIMENSION = 0;
  private static final String WIDTH_PARAM = "width";
  private boolean allowCachedRedirects;
  private Callback callback;
  private Object callerTag;
  private Context context;
  private Uri imageUri;
  
  private ImageRequest(Builder paramBuilder)
  {
    context = Builder.access$000(paramBuilder);
    imageUri = Builder.access$100(paramBuilder);
    callback = Builder.access$200(paramBuilder);
    allowCachedRedirects = Builder.access$300(paramBuilder);
    if (Builder.access$400(paramBuilder) == null) {
      paramBuilder = new Object();
    } else {
      paramBuilder = Builder.access$400(paramBuilder);
    }
    callerTag = paramBuilder;
  }
  
  public static Uri getProfilePictureUri(String paramString, int paramInt1, int paramInt2)
  {
    return getProfilePictureUri(paramString, paramInt1, paramInt2, "");
  }
  
  public static Uri getProfilePictureUri(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    Validate.notNullOrEmpty(paramString1, "userId");
    paramInt1 = Math.max(paramInt1, 0);
    paramInt2 = Math.max(paramInt2, 0);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      throw new IllegalArgumentException("Either width or height must be greater than 0");
    }
    paramString1 = Uri.parse(ServerProtocol.getGraphUrlBase()).buildUpon().path(String.format(Locale.US, "%s/%s/picture", new Object[] { FacebookSdk.getGraphApiVersion(), paramString1 }));
    if (paramInt2 != 0) {
      paramString1.appendQueryParameter("height", String.valueOf(paramInt2));
    }
    if (paramInt1 != 0) {
      paramString1.appendQueryParameter("width", String.valueOf(paramInt1));
    }
    paramString1.appendQueryParameter("migration_overrides", "{october_2012:true}");
    if (!Utility.isNullOrEmpty(paramString2))
    {
      paramString1.appendQueryParameter("access_token", paramString2);
    }
    else if ((!Utility.isNullOrEmpty(FacebookSdk.getClientToken())) && (!Utility.isNullOrEmpty(FacebookSdk.getApplicationId())))
    {
      paramString2 = new StringBuilder();
      paramString2.append(FacebookSdk.getApplicationId());
      paramString2.append("|");
      paramString2.append(FacebookSdk.getClientToken());
      paramString1.appendQueryParameter("access_token", paramString2.toString());
    }
    else
    {
      Log.d("ImageRequest", "Needs access token to fetch profile picture. Without an access token a default silhoutte picture is returned");
    }
    return paramString1.build();
  }
  
  public Callback getCallback()
  {
    return callback;
  }
  
  public Object getCallerTag()
  {
    return callerTag;
  }
  
  public Context getContext()
  {
    return context;
  }
  
  public Uri getImageUri()
  {
    return imageUri;
  }
  
  public boolean isCachedRedirectAllowed()
  {
    return allowCachedRedirects;
  }
  
  public static class Builder
  {
    private boolean allowCachedRedirects;
    private ImageRequest.Callback callback;
    private Object callerTag;
    private Context context;
    private Uri imageUrl;
    
    public Builder(Context paramContext, Uri paramUri)
    {
      Validate.notNull(paramUri, "imageUri");
      context = paramContext;
      imageUrl = paramUri;
    }
    
    public ImageRequest build()
    {
      return new ImageRequest(this, null);
    }
    
    public Builder setAllowCachedRedirects(boolean paramBoolean)
    {
      allowCachedRedirects = paramBoolean;
      return this;
    }
    
    public Builder setCallback(ImageRequest.Callback paramCallback)
    {
      callback = paramCallback;
      return this;
    }
    
    public Builder setCallerTag(Object paramObject)
    {
      callerTag = paramObject;
      return this;
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void onCompleted(ImageResponse paramImageResponse);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */