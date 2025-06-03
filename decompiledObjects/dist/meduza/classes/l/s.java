package l;

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
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import y.b;

public class s
{
  public static final int[] c = { 16843067, 16843068 };
  public final ProgressBar a;
  public Bitmap b;
  
  public s(ProgressBar paramProgressBar)
  {
    a = paramProgressBar;
  }
  
  public void a(AttributeSet paramAttributeSet, int paramInt)
  {
    z0 localz0 = z0.m(a.getContext(), paramAttributeSet, c, paramInt);
    Object localObject = localz0.f(0);
    if (localObject != null)
    {
      ProgressBar localProgressBar = a;
      paramAttributeSet = (AttributeSet)localObject;
      if ((localObject instanceof AnimationDrawable))
      {
        localObject = (AnimationDrawable)localObject;
        int i = ((AnimationDrawable)localObject).getNumberOfFrames();
        paramAttributeSet = new AnimationDrawable();
        paramAttributeSet.setOneShot(((AnimationDrawable)localObject).isOneShot());
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          Drawable localDrawable = b(((AnimationDrawable)localObject).getFrame(paramInt), true);
          localDrawable.setLevel(10000);
          paramAttributeSet.addFrame(localDrawable, ((AnimationDrawable)localObject).getDuration(paramInt));
        }
        paramAttributeSet.setLevel(10000);
      }
      localProgressBar.setIndeterminateDrawable(paramAttributeSet);
    }
    paramAttributeSet = localz0.f(1);
    if (paramAttributeSet != null) {
      a.setProgressDrawable(b(paramAttributeSet, false));
    }
    localz0.n();
  }
  
  public final Drawable b(Drawable paramDrawable, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if ((paramDrawable instanceof b))
    {
      localObject1 = (b)paramDrawable;
      localObject2 = ((b)localObject1).b();
      if (localObject2 != null) {
        ((b)localObject1).a(b((Drawable)localObject2, paramBoolean));
      }
    }
    else
    {
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i = paramDrawable.getNumberOfLayers();
        localObject2 = new Drawable[i];
        int j = 0;
        for (int k = 0; k < i; k++)
        {
          int m = paramDrawable.getId(k);
          localObject1 = paramDrawable.getDrawable(k);
          if ((m != 16908301) && (m != 16908303)) {
            paramBoolean = false;
          } else {
            paramBoolean = true;
          }
          localObject2[k] = b((Drawable)localObject1, paramBoolean);
        }
        localObject2 = new LayerDrawable((Drawable[])localObject2);
        for (k = j; k < i; k++)
        {
          ((LayerDrawable)localObject2).setId(k, paramDrawable.getId(k));
          ((LayerDrawable)localObject2).setLayerGravity(k, paramDrawable.getLayerGravity(k));
          ((LayerDrawable)localObject2).setLayerWidth(k, paramDrawable.getLayerWidth(k));
          ((LayerDrawable)localObject2).setLayerHeight(k, paramDrawable.getLayerHeight(k));
          ((LayerDrawable)localObject2).setLayerInsetLeft(k, paramDrawable.getLayerInsetLeft(k));
          ((LayerDrawable)localObject2).setLayerInsetRight(k, paramDrawable.getLayerInsetRight(k));
          ((LayerDrawable)localObject2).setLayerInsetTop(k, paramDrawable.getLayerInsetTop(k));
          ((LayerDrawable)localObject2).setLayerInsetBottom(k, paramDrawable.getLayerInsetBottom(k));
          ((LayerDrawable)localObject2).setLayerInsetStart(k, paramDrawable.getLayerInsetStart(k));
          ((LayerDrawable)localObject2).setLayerInsetEnd(k, paramDrawable.getLayerInsetEnd(k));
        }
        return (Drawable)localObject2;
      }
      if ((paramDrawable instanceof BitmapDrawable))
      {
        paramDrawable = (BitmapDrawable)paramDrawable;
        localObject1 = paramDrawable.getBitmap();
        if (b == null) {
          b = ((Bitmap)localObject1);
        }
        localObject2 = new ShapeDrawable(new RoundRectShape(new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F }, null, null));
        localObject1 = new BitmapShader((Bitmap)localObject1, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
        ((ShapeDrawable)localObject2).getPaint().setShader((Shader)localObject1);
        ((ShapeDrawable)localObject2).getPaint().setColorFilter(paramDrawable.getPaint().getColorFilter());
        paramDrawable = (Drawable)localObject2;
        if (paramBoolean) {
          paramDrawable = new ClipDrawable((Drawable)localObject2, 3, 1);
        }
        return paramDrawable;
      }
    }
    return paramDrawable;
  }
}

/* Location:
 * Qualified Name:     l.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */