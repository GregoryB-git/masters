package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.graphics.drawable.WrappedDrawable;

class AppCompatProgressBarHelper
{
  private static final int[] TINT_ATTRS = { 16843067, 16843068 };
  private Bitmap mSampleTile;
  private final ProgressBar mView;
  
  public AppCompatProgressBarHelper(ProgressBar paramProgressBar)
  {
    mView = paramProgressBar;
  }
  
  private Shape getDrawableShape()
  {
    return new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null);
  }
  
  private Drawable tileifyIndeterminate(Drawable paramDrawable)
  {
    Object localObject = paramDrawable;
    if ((paramDrawable instanceof AnimationDrawable))
    {
      AnimationDrawable localAnimationDrawable = (AnimationDrawable)paramDrawable;
      int i = localAnimationDrawable.getNumberOfFrames();
      localObject = new AnimationDrawable();
      ((AnimationDrawable)localObject).setOneShot(localAnimationDrawable.isOneShot());
      for (int j = 0; j < i; j++)
      {
        paramDrawable = tileify(localAnimationDrawable.getFrame(j), true);
        paramDrawable.setLevel(10000);
        ((AnimationDrawable)localObject).addFrame(paramDrawable, localAnimationDrawable.getDuration(j));
      }
      ((Drawable)localObject).setLevel(10000);
    }
    return (Drawable)localObject;
  }
  
  public Bitmap getSampleTile()
  {
    return mSampleTile;
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = TintTypedArray.obtainStyledAttributes(mView.getContext(), paramAttributeSet, TINT_ATTRS, paramInt, 0);
    Drawable localDrawable = paramAttributeSet.getDrawableIfKnown(0);
    if (localDrawable != null) {
      mView.setIndeterminateDrawable(tileifyIndeterminate(localDrawable));
    }
    localDrawable = paramAttributeSet.getDrawableIfKnown(1);
    if (localDrawable != null) {
      mView.setProgressDrawable(tileify(localDrawable, false));
    }
    paramAttributeSet.recycle();
  }
  
  @VisibleForTesting
  public Drawable tileify(Drawable paramDrawable, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if ((paramDrawable instanceof WrappedDrawable))
    {
      localObject1 = (WrappedDrawable)paramDrawable;
      localObject2 = ((WrappedDrawable)localObject1).getWrappedDrawable();
      if (localObject2 != null) {
        ((WrappedDrawable)localObject1).setWrappedDrawable(tileify((Drawable)localObject2, paramBoolean));
      }
    }
    else
    {
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i = paramDrawable.getNumberOfLayers();
        localObject1 = new Drawable[i];
        int j = 0;
        for (int k = 0; k < i; k++)
        {
          int m = paramDrawable.getId(k);
          localObject2 = paramDrawable.getDrawable(k);
          if ((m != 16908301) && (m != 16908303)) {
            paramBoolean = false;
          } else {
            paramBoolean = true;
          }
          localObject1[k] = tileify((Drawable)localObject2, paramBoolean);
        }
        localObject1 = new LayerDrawable((Drawable[])localObject1);
        for (k = j; k < i; k++)
        {
          ((LayerDrawable)localObject1).setId(k, paramDrawable.getId(k));
          Api23Impl.transferLayerProperties(paramDrawable, (LayerDrawable)localObject1, k);
        }
        return (Drawable)localObject1;
      }
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = (BitmapDrawable)paramDrawable;
        localObject2 = paramDrawable.getBitmap();
        if (mSampleTile == null) {
          mSampleTile = ((Bitmap)localObject2);
        }
        localObject1 = new ShapeDrawable(getDrawableShape());
        localObject2 = new BitmapShader((Bitmap)localObject2, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        ((ShapeDrawable)localObject1).getPaint().setShader((Shader)localObject2);
        ((ShapeDrawable)localObject1).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
        paramDrawable = (Drawable)localObject1;
        if (paramBoolean) {
          paramDrawable = new ClipDrawable((Drawable)localObject1, 3, 1);
        }
        return paramDrawable;
      }
    }
    return paramDrawable;
  }
  
  @RequiresApi(23)
  public static class Api23Impl
  {
    public static void transferLayerProperties(LayerDrawable paramLayerDrawable1, LayerDrawable paramLayerDrawable2, int paramInt)
    {
      paramLayerDrawable2.setLayerGravity(paramInt, paramLayerDrawable1.getLayerGravity(paramInt));
      paramLayerDrawable2.setLayerWidth(paramInt, paramLayerDrawable1.getLayerWidth(paramInt));
      paramLayerDrawable2.setLayerHeight(paramInt, paramLayerDrawable1.getLayerHeight(paramInt));
      paramLayerDrawable2.setLayerInsetLeft(paramInt, paramLayerDrawable1.getLayerInsetLeft(paramInt));
      paramLayerDrawable2.setLayerInsetRight(paramInt, paramLayerDrawable1.getLayerInsetRight(paramInt));
      paramLayerDrawable2.setLayerInsetTop(paramInt, paramLayerDrawable1.getLayerInsetTop(paramInt));
      paramLayerDrawable2.setLayerInsetBottom(paramInt, paramLayerDrawable1.getLayerInsetBottom(paramInt));
      paramLayerDrawable2.setLayerInsetStart(paramInt, paramLayerDrawable1.getLayerInsetStart(paramInt));
      paramLayerDrawable2.setLayerInsetEnd(paramInt, paramLayerDrawable1.getLayerInsetEnd(paramInt));
    }
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatProgressBarHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */