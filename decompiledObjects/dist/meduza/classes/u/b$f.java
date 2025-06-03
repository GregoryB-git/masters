package u;

import android.app.SharedElementCallback;
import android.app.SharedElementCallback.OnSharedElementsReadyListener;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.List;
import java.util.Map;

public final class b$f
  extends SharedElementCallback
{
  public final a0 a;
  
  public b$f(a0 parama0)
  {
    a = parama0;
  }
  
  public final Parcelable onCaptureSharedElementSnapshot(View paramView, Matrix paramMatrix, RectF paramRectF)
  {
    a0 locala0 = a;
    locala0.getClass();
    float f;
    if ((paramView instanceof ImageView))
    {
      ImageView localImageView = (ImageView)paramView;
      Drawable localDrawable = localImageView.getDrawable();
      Object localObject = localImageView.getBackground();
      if ((localDrawable != null) && (localObject == null))
      {
        i = localDrawable.getIntrinsicWidth();
        j = localDrawable.getIntrinsicHeight();
        if ((i > 0) && (j > 0))
        {
          f = Math.min(1.0F, 1048576.0F / (i * j));
          if (((localDrawable instanceof BitmapDrawable)) && (f == 1.0F))
          {
            localObject = ((BitmapDrawable)localDrawable).getBitmap();
          }
          else
          {
            i = (int)(i * f);
            int k = (int)(j * f);
            localObject = Bitmap.createBitmap(i, k, Bitmap.Config.ARGB_8888);
            Canvas localCanvas = new Canvas((Bitmap)localObject);
            Rect localRect = localDrawable.getBounds();
            int m = left;
            int n = top;
            j = right;
            int i1 = bottom;
            localDrawable.setBounds(0, 0, i, k);
            localDrawable.draw(localCanvas);
            localDrawable.setBounds(m, n, j, i1);
          }
        }
        else
        {
          localObject = null;
        }
        if (localObject != null)
        {
          paramMatrix = new Bundle();
          paramMatrix.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)localObject);
          paramMatrix.putString("sharedElement:snapshot:imageScaleType", localImageView.getScaleType().toString());
          paramView = paramMatrix;
          if (localImageView.getScaleType() != ImageView.ScaleType.MATRIX) {
            return paramView;
          }
          paramView = localImageView.getImageMatrix();
          paramRectF = new float[9];
          paramView.getValues(paramRectF);
          paramMatrix.putFloatArray("sharedElement:snapshot:imageMatrix", paramRectF);
          return paramMatrix;
        }
      }
    }
    int i = Math.round(paramRectF.width());
    int j = Math.round(paramRectF.height());
    if ((i > 0) && (j > 0))
    {
      f = Math.min(1.0F, 1048576.0F / (i * j));
      i = (int)(i * f);
      j = (int)(j * f);
      if (a == null) {
        a = new Matrix();
      }
      a.set(paramMatrix);
      a.postTranslate(-left, -top);
      a.postScale(f, f);
      paramMatrix = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
      paramRectF = new Canvas(paramMatrix);
      paramRectF.concat(a);
      paramView.draw(paramRectF);
      paramView = paramMatrix;
    }
    else
    {
      paramView = null;
    }
    return paramView;
  }
  
  public final View onCreateSnapshotView(Context paramContext, Parcelable paramParcelable)
  {
    a.getClass();
    boolean bool = paramParcelable instanceof Bundle;
    Object localObject = null;
    if (bool)
    {
      paramParcelable = (Bundle)paramParcelable;
      Bitmap localBitmap = (Bitmap)paramParcelable.getParcelable("sharedElement:snapshot:bitmap");
      if (localBitmap != null)
      {
        paramContext = new ImageView(paramContext);
        paramContext.setImageBitmap(localBitmap);
        paramContext.setScaleType(ImageView.ScaleType.valueOf(paramParcelable.getString("sharedElement:snapshot:imageScaleType")));
        localObject = paramContext;
        if (paramContext.getScaleType() == ImageView.ScaleType.MATRIX)
        {
          localObject = paramParcelable.getFloatArray("sharedElement:snapshot:imageMatrix");
          paramParcelable = new Matrix();
          paramParcelable.setValues((float[])localObject);
          paramContext.setImageMatrix(paramParcelable);
          localObject = paramContext;
        }
      }
    }
    else if ((paramParcelable instanceof Bitmap))
    {
      paramParcelable = (Bitmap)paramParcelable;
      localObject = new ImageView(paramContext);
      ((ImageView)localObject).setImageBitmap(paramParcelable);
    }
    return (View)localObject;
  }
  
  public final void onMapSharedElements(List<String> paramList, Map<String, View> paramMap)
  {
    a.getClass();
  }
  
  public final void onRejectSharedElements(List<View> paramList)
  {
    a.getClass();
  }
  
  public final void onSharedElementEnd(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    a.getClass();
  }
  
  public final void onSharedElementStart(List<String> paramList, List<View> paramList1, List<View> paramList2)
  {
    a.getClass();
  }
  
  public final void onSharedElementsArrived(List<String> paramList, List<View> paramList1, SharedElementCallback.OnSharedElementsReadyListener paramOnSharedElementsReadyListener)
  {
    a.getClass();
    b.b.a((SharedElementCallback.OnSharedElementsReadyListener)paramOnSharedElementsReadyListener);
  }
}

/* Location:
 * Qualified Name:     u.b.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */