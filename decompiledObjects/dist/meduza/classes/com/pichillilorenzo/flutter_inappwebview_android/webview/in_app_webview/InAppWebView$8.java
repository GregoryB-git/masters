package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

class InAppWebView$8
  implements Runnable
{
  public void run()
  {
    try
    {
      Object localObject1 = Bitmap.createBitmap(this$0.getMeasuredWidth(), this$0.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
      Object localObject3 = new android/graphics/Canvas;
      ((Canvas)localObject3).<init>((Bitmap)localObject1);
      ((Canvas)localObject3).translate(-this$0.getScrollX(), -this$0.getScrollY());
      this$0.draw((Canvas)localObject3);
      ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
      localByteArrayOutputStream.<init>();
      Object localObject4 = Bitmap.CompressFormat.PNG;
      int i = 100;
      localObject3 = val$screenshotConfiguration;
      Object localObject2;
      if (localObject3 != null)
      {
        localObject3 = (Map)((Map)localObject3).get("rect");
        if (localObject3 != null) {
          localObject1 = Bitmap.createBitmap((Bitmap)localObject1, (int)Math.floor(((Double)((Map)localObject3).get("x")).doubleValue() * val$pixelDensity + 0.5D), (int)Math.floor(((Double)((Map)localObject3).get("y")).doubleValue() * val$pixelDensity + 0.5D), Math.min(((Bitmap)localObject1).getWidth(), (int)Math.floor(((Double)((Map)localObject3).get("width")).doubleValue() * val$pixelDensity + 0.5D)), Math.min(((Bitmap)localObject1).getHeight(), (int)Math.floor(((Double)((Map)localObject3).get("height")).doubleValue() * val$pixelDensity + 0.5D)));
        }
        Double localDouble = (Double)val$screenshotConfiguration.get("snapshotWidth");
        localObject3 = localObject1;
        if (localDouble != null)
        {
          i = (int)Math.floor(localDouble.doubleValue() * val$pixelDensity + 0.5D);
          float f = ((Bitmap)localObject1).getWidth() / ((Bitmap)localObject1).getHeight();
          localObject3 = Bitmap.createScaledBitmap((Bitmap)localObject1, i, (int)(i / f), true);
        }
        try
        {
          localObject1 = Bitmap.CompressFormat.valueOf((String)val$screenshotConfiguration.get("compressFormat"));
        }
        catch (IllegalArgumentException localIllegalArgumentException1)
        {
          Log.e("InAppWebView", "", localIllegalArgumentException1);
          localObject2 = localObject4;
        }
        i = ((Integer)val$screenshotConfiguration.get("quality")).intValue();
        localObject4 = localObject2;
      }
      else
      {
        localObject3 = localObject2;
      }
      ((Bitmap)localObject3).compress((Bitmap.CompressFormat)localObject4, i, localByteArrayOutputStream);
      try
      {
        localByteArrayOutputStream.close();
      }
      catch (IOException localIOException)
      {
        Log.e("InAppWebView", "", localIOException);
      }
      ((Bitmap)localObject3).recycle();
      val$result.success(localByteArrayOutputStream.toByteArray());
    }
    catch (IllegalArgumentException localIllegalArgumentException2)
    {
      Log.e("InAppWebView", "", localIllegalArgumentException2);
      val$result.success(null);
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView.8
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */