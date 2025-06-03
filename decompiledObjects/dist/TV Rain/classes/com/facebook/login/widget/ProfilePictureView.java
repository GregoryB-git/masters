package com.facebook.login.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.ImageRequest.Builder;
import com.facebook.internal.ImageRequest.Callback;
import com.facebook.internal.ImageResponse;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.R.dimen;
import com.facebook.login.R.drawable;
import com.facebook.login.R.styleable;

public class ProfilePictureView
  extends FrameLayout
{
  private static final String BITMAP_HEIGHT_KEY = "ProfilePictureView_height";
  private static final String BITMAP_KEY = "ProfilePictureView_bitmap";
  private static final String BITMAP_WIDTH_KEY = "ProfilePictureView_width";
  public static final int CUSTOM = -1;
  private static final boolean IS_CROPPED_DEFAULT_VALUE = true;
  private static final String IS_CROPPED_KEY = "ProfilePictureView_isCropped";
  public static final int LARGE = -4;
  private static final int MIN_SIZE = 1;
  public static final int NORMAL = -3;
  private static final String PENDING_REFRESH_KEY = "ProfilePictureView_refresh";
  private static final String PRESET_SIZE_KEY = "ProfilePictureView_presetSize";
  private static final String PROFILE_ID_KEY = "ProfilePictureView_profileId";
  public static final int SMALL = -2;
  private static final String SUPER_STATE_KEY = "ProfilePictureView_superState";
  public static final String TAG = "ProfilePictureView";
  private Bitmap customizedDefaultProfilePicture = null;
  private ImageView image;
  private Bitmap imageContents;
  private boolean isCropped = true;
  private ImageRequest lastRequest;
  private OnErrorListener onErrorListener;
  private int presetSizeType = -1;
  private String profileId;
  private int queryHeight = 0;
  private int queryWidth = 0;
  
  public ProfilePictureView(Context paramContext)
  {
    super(paramContext);
    initialize(paramContext);
  }
  
  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initialize(paramContext);
    parseAttributes(paramAttributeSet);
  }
  
  public ProfilePictureView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    initialize(paramContext);
    parseAttributes(paramAttributeSet);
  }
  
  private int getPresetSizeInPixels(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i = presetSizeType;
      if (i != -4)
      {
        if (i != -3)
        {
          if (i != -2)
          {
            if (i != -1) {
              return 0;
            }
            if (!paramBoolean) {
              return 0;
            }
            i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
          }
          else
          {
            i = R.dimen.com_facebook_profilepictureview_preset_size_small;
          }
        }
        else {
          i = R.dimen.com_facebook_profilepictureview_preset_size_normal;
        }
      }
      else {
        i = R.dimen.com_facebook_profilepictureview_preset_size_large;
      }
      i = getResources().getDimensionPixelSize(i);
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  private void initialize(Context paramContext)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      removeAllViews();
      ImageView localImageView = new android/widget/ImageView;
      localImageView.<init>(paramContext);
      image = localImageView;
      paramContext = new android/widget/FrameLayout$LayoutParams;
      paramContext.<init>(-1, -1);
      image.setLayoutParams(paramContext);
      image.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
      addView(image);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramContext, this);
    }
  }
  
  private void parseAttributes(AttributeSet paramAttributeSet)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      paramAttributeSet = getContext().obtainStyledAttributes(paramAttributeSet, R.styleable.com_facebook_profile_picture_view);
      setPresetSize(paramAttributeSet.getInt(R.styleable.com_facebook_profile_picture_view_com_facebook_preset_size, -1));
      isCropped = paramAttributeSet.getBoolean(R.styleable.com_facebook_profile_picture_view_com_facebook_is_cropped, true);
      paramAttributeSet.recycle();
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramAttributeSet, this);
    }
  }
  
  private void processResponse(ImageResponse paramImageResponse)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (paramImageResponse.getRequest() == lastRequest)
      {
        lastRequest = null;
        Object localObject = paramImageResponse.getBitmap();
        Exception localException = paramImageResponse.getError();
        if (localException != null)
        {
          paramImageResponse = onErrorListener;
          if (paramImageResponse != null)
          {
            localObject = new com/facebook/FacebookException;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            localStringBuilder.append("Error in downloading profile picture for profileId: ");
            localStringBuilder.append(getProfileId());
            ((FacebookException)localObject).<init>(localStringBuilder.toString(), localException);
            paramImageResponse.onError((FacebookException)localObject);
          }
          else
          {
            Logger.log(LoggingBehavior.REQUESTS, 6, TAG, localException.toString());
          }
        }
        else if (localObject != null)
        {
          setImageBitmap((Bitmap)localObject);
          if (paramImageResponse.isCachedRedirect()) {
            sendImageRequest(false);
          }
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramImageResponse, this);
    }
  }
  
  private void refreshImage(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      boolean bool = updateImageQueryParameters();
      String str = profileId;
      if ((str != null) && (str.length() != 0) && ((queryWidth != 0) || (queryHeight != 0)))
      {
        if ((bool) || (paramBoolean)) {
          sendImageRequest(true);
        }
      }
      else {
        setBlankProfilePicture();
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void sendImageRequest(boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (AccessToken.isCurrentAccessTokenActive()) {
        localObject1 = AccessToken.getCurrentAccessToken().getToken();
      } else {
        localObject1 = "";
      }
      Object localObject2 = new com/facebook/internal/ImageRequest$Builder;
      ((ImageRequest.Builder)localObject2).<init>(getContext(), ImageRequest.getProfilePictureUri(profileId, queryWidth, queryHeight, (String)localObject1));
      Object localObject1 = ((ImageRequest.Builder)localObject2).setAllowCachedRedirects(paramBoolean).setCallerTag(this);
      localObject2 = new com/facebook/login/widget/ProfilePictureView$1;
      ((1)localObject2).<init>(this);
      localObject2 = ((ImageRequest.Builder)localObject1).setCallback((ImageRequest.Callback)localObject2).build();
      localObject1 = lastRequest;
      if (localObject1 != null) {
        ImageDownloader.cancelRequest((ImageRequest)localObject1);
      }
      lastRequest = ((ImageRequest)localObject2);
      ImageDownloader.downloadAsync((ImageRequest)localObject2);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void setBlankProfilePicture()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ImageRequest localImageRequest = lastRequest;
      if (localImageRequest != null) {
        ImageDownloader.cancelRequest(localImageRequest);
      }
      if (customizedDefaultProfilePicture == null)
      {
        int i;
        if (isCropped()) {
          i = R.drawable.com_facebook_profile_picture_blank_square;
        } else {
          i = R.drawable.com_facebook_profile_picture_blank_portrait;
        }
        setImageBitmap(BitmapFactory.decodeResource(getResources(), i));
      }
      else
      {
        updateImageQueryParameters();
        setImageBitmap(Bitmap.createScaledBitmap(customizedDefaultProfilePicture, queryWidth, queryHeight, false));
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void setImageBitmap(Bitmap paramBitmap)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      ImageView localImageView = image;
      if ((localImageView != null) && (paramBitmap != null))
      {
        imageContents = paramBitmap;
        localImageView.setImageBitmap(paramBitmap);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBitmap, this);
    }
  }
  
  private boolean updateImageQueryParameters()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      int i = getHeight();
      int j = getWidth();
      boolean bool1 = true;
      if ((j >= 1) && (i >= 1))
      {
        int k = getPresetSizeInPixels(false);
        if (k != 0)
        {
          i = k;
          j = i;
        }
        if (j <= i)
        {
          if (isCropped()) {
            i = j;
          } else {
            i = 0;
          }
        }
        else if (isCropped()) {
          j = i;
        } else {
          j = 0;
        }
        boolean bool2 = bool1;
        if (j == queryWidth) {
          if (i != queryHeight) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
        queryWidth = j;
        queryHeight = i;
        return bool2;
      }
      return false;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return false;
  }
  
  public final OnErrorListener getOnErrorListener()
  {
    return onErrorListener;
  }
  
  public final int getPresetSize()
  {
    return presetSizeType;
  }
  
  public final String getProfileId()
  {
    return profileId;
  }
  
  public final boolean isCropped()
  {
    return isCropped;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    lastRequest = null;
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    refreshImage(false);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    int i = View.MeasureSpec.getSize(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int k = View.MeasureSpec.getMode(paramInt2);
    int m = 1;
    if ((k != 1073741824) && (height == -2))
    {
      i = getPresetSizeInPixels(true);
      k = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
      paramInt2 = 1;
    }
    else
    {
      int n = 0;
      k = paramInt2;
      paramInt2 = n;
    }
    if ((View.MeasureSpec.getMode(paramInt1) != 1073741824) && (width == -2))
    {
      j = getPresetSizeInPixels(true);
      paramInt1 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
      paramInt2 = m;
    }
    if (paramInt2 != 0)
    {
      setMeasuredDimension(j, i);
      measureChildren(paramInt1, k);
    }
    else
    {
      super.onMeasure(paramInt1, k);
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (paramParcelable.getClass() != Bundle.class)
    {
      super.onRestoreInstanceState(paramParcelable);
    }
    else
    {
      paramParcelable = (Bundle)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getParcelable("ProfilePictureView_superState"));
      profileId = paramParcelable.getString("ProfilePictureView_profileId");
      presetSizeType = paramParcelable.getInt("ProfilePictureView_presetSize");
      isCropped = paramParcelable.getBoolean("ProfilePictureView_isCropped");
      queryWidth = paramParcelable.getInt("ProfilePictureView_width");
      queryHeight = paramParcelable.getInt("ProfilePictureView_height");
      refreshImage(true);
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    Parcelable localParcelable = super.onSaveInstanceState();
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("ProfilePictureView_superState", localParcelable);
    localBundle.putString("ProfilePictureView_profileId", profileId);
    localBundle.putInt("ProfilePictureView_presetSize", presetSizeType);
    localBundle.putBoolean("ProfilePictureView_isCropped", isCropped);
    localBundle.putInt("ProfilePictureView_width", queryWidth);
    localBundle.putInt("ProfilePictureView_height", queryHeight);
    boolean bool;
    if (lastRequest != null) {
      bool = true;
    } else {
      bool = false;
    }
    localBundle.putBoolean("ProfilePictureView_refresh", bool);
    return localBundle;
  }
  
  public final void setCropped(boolean paramBoolean)
  {
    isCropped = paramBoolean;
    refreshImage(false);
  }
  
  public final void setDefaultProfilePicture(Bitmap paramBitmap)
  {
    customizedDefaultProfilePicture = paramBitmap;
  }
  
  public final void setOnErrorListener(OnErrorListener paramOnErrorListener)
  {
    onErrorListener = paramOnErrorListener;
  }
  
  public final void setPresetSize(int paramInt)
  {
    if ((paramInt != -4) && (paramInt != -3) && (paramInt != -2) && (paramInt != -1)) {
      throw new IllegalArgumentException("Must use a predefined preset size");
    }
    presetSizeType = paramInt;
    requestLayout();
  }
  
  public final void setProfileId(@Nullable String paramString)
  {
    boolean bool;
    if ((!Utility.isNullOrEmpty(profileId)) && (profileId.equalsIgnoreCase(paramString)))
    {
      bool = false;
    }
    else
    {
      setBlankProfilePicture();
      bool = true;
    }
    profileId = paramString;
    refreshImage(bool);
  }
  
  public static abstract interface OnErrorListener
  {
    public abstract void onError(FacebookException paramFacebookException);
  }
}

/* Location:
 * Qualified Name:     com.facebook.login.widget.ProfilePictureView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */