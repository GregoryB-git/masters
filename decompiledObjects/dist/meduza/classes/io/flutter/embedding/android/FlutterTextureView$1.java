package io.flutter.embedding.android;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView.SurfaceTextureListener;
import io.flutter.Log;

class FlutterTextureView$1
  implements TextureView.SurfaceTextureListener
{
  public FlutterTextureView$1(FlutterTextureView paramFlutterTextureView) {}
  
  public void onSurfaceTextureAvailable(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
    FlutterTextureView.access$002(this$0, true);
    if (FlutterTextureView.access$100(this$0)) {
      FlutterTextureView.access$200(this$0);
    }
  }
  
  public boolean onSurfaceTextureDestroyed(SurfaceTexture paramSurfaceTexture)
  {
    Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
    FlutterTextureView.access$002(this$0, false);
    if (FlutterTextureView.access$100(this$0)) {
      FlutterTextureView.access$400(this$0);
    }
    if (FlutterTextureView.access$500(this$0) != null)
    {
      FlutterTextureView.access$500(this$0).release();
      FlutterTextureView.access$502(this$0, null);
    }
    return true;
  }
  
  public void onSurfaceTextureSizeChanged(SurfaceTexture paramSurfaceTexture, int paramInt1, int paramInt2)
  {
    Log.v("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
    if (FlutterTextureView.access$100(this$0)) {
      FlutterTextureView.access$300(this$0, paramInt1, paramInt2);
    }
  }
  
  public void onSurfaceTextureUpdated(SurfaceTexture paramSurfaceTexture) {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterTextureView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */