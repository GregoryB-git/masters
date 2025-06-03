package com.devbrackets.android.exomedia.core.video.scale;

import android.graphics.Point;
import android.util.Log;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import z2;

public class MatrixManager
{
  public static final int QUARTER_ROTATION = 90;
  private static final String TAG = "MatrixManager";
  @IntRange(from=0L, to=359L)
  public int currentRotation = 0;
  @NonNull
  public ScaleType currentScaleType = ScaleType.FIT_CENTER;
  @NonNull
  public Point intrinsicVideoSize = new Point(0, 0);
  @NonNull
  public WeakReference<View> requestedModificationView = new WeakReference(null);
  @Nullable
  public Integer requestedRotation = null;
  @Nullable
  public ScaleType requestedScaleType = null;
  
  public void applyCenter(@NonNull View paramView)
  {
    setScale(paramView, intrinsicVideoSize.x / paramView.getWidth(), intrinsicVideoSize.y / paramView.getHeight());
  }
  
  public void applyCenterCrop(@NonNull View paramView)
  {
    float f1 = paramView.getWidth() / intrinsicVideoSize.x;
    float f2 = paramView.getHeight() / intrinsicVideoSize.y;
    float f3 = Math.max(f1, f2);
    setScale(paramView, f3 / f1, f3 / f2);
  }
  
  public void applyCenterInside(@NonNull View paramView)
  {
    if ((intrinsicVideoSize.x <= paramView.getWidth()) && (intrinsicVideoSize.y <= paramView.getHeight())) {
      applyCenter(paramView);
    } else {
      applyFitCenter(paramView);
    }
  }
  
  public void applyFitCenter(@NonNull View paramView)
  {
    float f1 = paramView.getWidth() / intrinsicVideoSize.x;
    float f2 = paramView.getHeight() / intrinsicVideoSize.y;
    float f3 = Math.min(f1, f2);
    setScale(paramView, f3 / f1, f3 / f2);
  }
  
  public void applyFitXy(@NonNull View paramView)
  {
    setScale(paramView, 1.0F, 1.0F);
  }
  
  public void applyRequestedModifications()
  {
    View localView = (View)requestedModificationView.get();
    if (localView != null)
    {
      Object localObject = requestedRotation;
      if (localObject != null)
      {
        rotate(localView, ((Integer)localObject).intValue());
        requestedRotation = null;
      }
      localObject = requestedScaleType;
      if (localObject != null)
      {
        scale(localView, (ScaleType)localObject);
        requestedScaleType = null;
      }
    }
    requestedModificationView = new WeakReference(null);
  }
  
  public int getCurrentRotation()
  {
    Integer localInteger = requestedRotation;
    int i;
    if (localInteger != null) {
      i = localInteger.intValue();
    } else {
      i = currentRotation;
    }
    return i;
  }
  
  @NonNull
  public ScaleType getCurrentScaleType()
  {
    ScaleType localScaleType = requestedScaleType;
    if (localScaleType == null) {
      localScaleType = currentScaleType;
    }
    return localScaleType;
  }
  
  public boolean ready()
  {
    Point localPoint = intrinsicVideoSize;
    boolean bool;
    if ((x > 0) && (y > 0)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void reset()
  {
    setIntrinsicVideoSize(0, 0);
    currentRotation = 0;
  }
  
  public void rotate(@NonNull View paramView, @IntRange(from=0L, to=359L) int paramInt)
  {
    if (!ready())
    {
      requestedRotation = Integer.valueOf(paramInt);
      requestedModificationView = new WeakReference(paramView);
      return;
    }
    int i = paramInt / 90;
    int j = 0;
    if (i % 2 == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (currentRotation / 90 % 2 == 1) {
      j = 1;
    }
    if (i != j)
    {
      Point localPoint = intrinsicVideoSize;
      i = x;
      x = y;
      y = i;
      scale(paramView, currentScaleType);
    }
    currentRotation = paramInt;
    paramView.setRotation(paramInt);
  }
  
  public boolean scale(@NonNull View paramView, @NonNull ScaleType paramScaleType)
  {
    if (!ready())
    {
      requestedScaleType = paramScaleType;
      requestedModificationView = new WeakReference(paramView);
      return false;
    }
    if ((paramView.getHeight() != 0) && (paramView.getWidth() != 0))
    {
      currentScaleType = paramScaleType;
      switch (1.$SwitchMap$com$devbrackets$android$exomedia$core$video$scale$ScaleType[paramScaleType.ordinal()])
      {
      default: 
        break;
      case 6: 
        setScale(paramView, 1.0F, 1.0F);
        break;
      case 5: 
        applyFitXy(paramView);
        break;
      case 4: 
        applyFitCenter(paramView);
        break;
      case 3: 
        applyCenterInside(paramView);
        break;
      case 2: 
        applyCenterCrop(paramView);
        break;
      case 1: 
        applyCenter(paramView);
      }
      return true;
    }
    paramScaleType = z2.t("Unable to apply scale with a view size of (");
    paramScaleType.append(paramView.getWidth());
    paramScaleType.append(", ");
    paramScaleType.append(paramView.getHeight());
    paramScaleType.append(")");
    Log.d("MatrixManager", paramScaleType.toString());
    return false;
  }
  
  public void setIntrinsicVideoSize(@IntRange(from=0L) int paramInt1, @IntRange(from=0L) int paramInt2)
  {
    int i = currentRotation / 90;
    int j = 1;
    if (i % 2 != 1) {
      j = 0;
    }
    Point localPoint = intrinsicVideoSize;
    if (j != 0) {
      i = paramInt2;
    } else {
      i = paramInt1;
    }
    x = i;
    if (j == 0) {
      paramInt1 = paramInt2;
    }
    y = paramInt1;
    if (ready()) {
      applyRequestedModifications();
    }
  }
  
  public void setScale(@NonNull View paramView, float paramFloat1, float paramFloat2)
  {
    int i = currentRotation / 90;
    int j = 1;
    if (i % 2 != 1) {
      j = 0;
    }
    float f1 = paramFloat1;
    float f2 = paramFloat2;
    if (j != 0)
    {
      f1 = paramFloat2 * paramView.getHeight() / paramView.getWidth();
      f2 = paramFloat1 * paramView.getWidth() / paramView.getHeight();
    }
    paramView.setScaleX(f1);
    paramView.setScaleY(f2);
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.core.video.scale.MatrixManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */