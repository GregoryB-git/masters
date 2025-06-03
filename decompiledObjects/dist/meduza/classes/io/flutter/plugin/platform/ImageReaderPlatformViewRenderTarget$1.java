package io.flutter.plugin.platform;

import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import f;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.ImageTextureEntry;

class ImageReaderPlatformViewRenderTarget$1
  implements ImageReader.OnImageAvailableListener
{
  public ImageReaderPlatformViewRenderTarget$1(ImageReaderPlatformViewRenderTarget paramImageReaderPlatformViewRenderTarget) {}
  
  public void onImageAvailable(ImageReader paramImageReader)
  {
    try
    {
      paramImageReader = paramImageReader.acquireLatestImage();
    }
    catch (IllegalStateException localIllegalStateException)
    {
      paramImageReader = f.l("onImageAvailable acquireLatestImage failed: ");
      paramImageReader.append(localIllegalStateException.toString());
      Log.e("ImageReaderPlatformViewRenderTarget", paramImageReader.toString());
      paramImageReader = null;
    }
    if (paramImageReader == null) {
      return;
    }
    ImageReaderPlatformViewRenderTarget.access$000(this$0).pushImage(paramImageReader);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */