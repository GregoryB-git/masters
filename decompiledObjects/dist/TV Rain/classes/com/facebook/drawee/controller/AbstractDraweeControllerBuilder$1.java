package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import javax.annotation.Nullable;

final class AbstractDraweeControllerBuilder$1
  extends BaseControllerListener<Object>
{
  public void onFinalImageSet(String paramString, @Nullable Object paramObject, @Nullable Animatable paramAnimatable)
  {
    if (paramAnimatable != null) {
      paramAnimatable.start();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.drawee.controller.AbstractDraweeControllerBuilder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */