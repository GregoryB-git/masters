package io.flutter.plugin.platform;

import aa.u;
import android.media.ImageReader;
import android.media.ImageReader.Builder;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.Surface;
import f;
import io.flutter.Log;
import io.flutter.view.TextureRegistry.ImageTextureEntry;
import io.flutter.view.TextureRegistry.TextureEntry;

public class ImageReaderPlatformViewRenderTarget
  implements PlatformViewRenderTarget
{
  private static final int MAX_IMAGES = 4;
  private static final String TAG = "ImageReaderPlatformViewRenderTarget";
  private int bufferHeight = 0;
  private int bufferWidth = 0;
  private final Handler onImageAvailableHandler = new Handler();
  private final ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener()
  {
    public void onImageAvailable(ImageReader paramAnonymousImageReader)
    {
      try
      {
        paramAnonymousImageReader = paramAnonymousImageReader.acquireLatestImage();
      }
      catch (IllegalStateException localIllegalStateException)
      {
        paramAnonymousImageReader = f.l("onImageAvailable acquireLatestImage failed: ");
        paramAnonymousImageReader.append(localIllegalStateException.toString());
        Log.e("ImageReaderPlatformViewRenderTarget", paramAnonymousImageReader.toString());
        paramAnonymousImageReader = null;
      }
      if (paramAnonymousImageReader == null) {
        return;
      }
      ImageReaderPlatformViewRenderTarget.access$000(ImageReaderPlatformViewRenderTarget.this).pushImage(paramAnonymousImageReader);
    }
  };
  private ImageReader reader;
  private TextureRegistry.ImageTextureEntry textureEntry;
  
  public ImageReaderPlatformViewRenderTarget(TextureRegistry.ImageTextureEntry paramImageTextureEntry)
  {
    if (Build.VERSION.SDK_INT >= 29)
    {
      textureEntry = paramImageTextureEntry;
      return;
    }
    throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
  }
  
  private void closeReader()
  {
    if (reader != null)
    {
      textureEntry.pushImage(null);
      reader.close();
      reader = null;
    }
  }
  
  public ImageReader createImageReader()
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 33) {
      return createImageReader33();
    }
    if (i >= 29) {
      return createImageReader29();
    }
    throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
  }
  
  public ImageReader createImageReader29()
  {
    ImageReader localImageReader = u.y(bufferWidth, bufferHeight);
    localImageReader.setOnImageAvailableListener(onImageAvailableListener, onImageAvailableHandler);
    return localImageReader;
  }
  
  public ImageReader createImageReader33()
  {
    Object localObject = new ImageReader.Builder(bufferWidth, bufferHeight);
    ((ImageReader.Builder)localObject).setMaxImages(4);
    ((ImageReader.Builder)localObject).setImageFormat(34);
    ((ImageReader.Builder)localObject).setUsage(256L);
    localObject = ((ImageReader.Builder)localObject).build();
    ((ImageReader)localObject).setOnImageAvailableListener(onImageAvailableListener, onImageAvailableHandler);
    return (ImageReader)localObject;
  }
  
  public int getHeight()
  {
    return bufferHeight;
  }
  
  public long getId()
  {
    return textureEntry.id();
  }
  
  public Surface getSurface()
  {
    return reader.getSurface();
  }
  
  public int getWidth()
  {
    return bufferWidth;
  }
  
  public boolean isReleased()
  {
    boolean bool;
    if (textureEntry == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void release()
  {
    closeReader();
    textureEntry = null;
  }
  
  public void resize(int paramInt1, int paramInt2)
  {
    if ((reader != null) && (bufferWidth == paramInt1) && (bufferHeight == paramInt2)) {
      return;
    }
    closeReader();
    bufferWidth = paramInt1;
    bufferHeight = paramInt2;
    reader = createImageReader();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.ImageReaderPlatformViewRenderTarget
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */