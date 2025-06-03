package com.devbrackets.android.exomedia.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.devbrackets.android.exomedia.R.layout;
import com.devbrackets.android.exomedia.R.styleable;
import com.devbrackets.android.exomedia.core.video.scale.ScaleType;

public class VideoView$AttributeContainer
{
  public int apiImplLegacyResourceId;
  public int apiImplResourceId;
  @Nullable
  public Boolean measureBasedOnAspectRatio;
  @Nullable
  public ScaleType scaleType;
  public boolean useDefaultControls = false;
  public boolean useTextureViewBacking = false;
  
  public VideoView$AttributeContainer(@NonNull VideoView paramVideoView, @Nullable Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = R.layout.exomedia_default_exo_texture_video_view;
    apiImplResourceId = i;
    int j = R.layout.exomedia_default_native_texture_video_view;
    apiImplLegacyResourceId = j;
    if (paramAttributeSet == null) {
      return;
    }
    paramVideoView = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.VideoView);
    if (paramVideoView == null) {
      return;
    }
    useDefaultControls = paramVideoView.getBoolean(R.styleable.VideoView_useDefaultControls, useDefaultControls);
    useTextureViewBacking = paramVideoView.getBoolean(R.styleable.VideoView_useTextureViewBacking, useTextureViewBacking);
    int k = R.styleable.VideoView_videoScale;
    if (paramVideoView.hasValue(k)) {
      scaleType = ScaleType.fromOrdinal(paramVideoView.getInt(k, -1));
    }
    k = R.styleable.VideoView_measureBasedOnAspectRatio;
    if (paramVideoView.hasValue(k)) {
      measureBasedOnAspectRatio = Boolean.valueOf(paramVideoView.getBoolean(k, false));
    }
    boolean bool = useTextureViewBacking;
    if (!bool) {
      i = R.layout.exomedia_default_exo_surface_video_view;
    }
    apiImplResourceId = i;
    if (!bool) {
      j = R.layout.exomedia_default_native_surface_video_view;
    }
    apiImplLegacyResourceId = j;
    apiImplResourceId = paramVideoView.getResourceId(R.styleable.VideoView_videoViewApiImpl, i);
    apiImplLegacyResourceId = paramVideoView.getResourceId(R.styleable.VideoView_videoViewApiImplLegacy, apiImplLegacyResourceId);
    paramVideoView.recycle();
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.ui.widget.VideoView.AttributeContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */