package com.facebook.appevents.codeless;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Base64;
import android.view.View;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

class ViewIndexer$ScreenshotTaker
  implements Callable<String>
{
  private WeakReference<View> rootView;
  
  public ViewIndexer$ScreenshotTaker(View paramView)
  {
    rootView = new WeakReference(paramView);
  }
  
  public String call()
  {
    Object localObject = (View)rootView.get();
    if ((localObject != null) && (((View)localObject).getWidth() != 0) && (((View)localObject).getHeight() != 0))
    {
      Bitmap localBitmap = Bitmap.createBitmap(((View)localObject).getWidth(), ((View)localObject).getHeight(), Bitmap.Config.RGB_565);
      ((View)localObject).draw(new Canvas(localBitmap));
      localObject = new ByteArrayOutputStream();
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 10, (OutputStream)localObject);
      return Base64.encodeToString(((ByteArrayOutputStream)localObject).toByteArray(), 2);
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.ViewIndexer.ScreenshotTaker
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */