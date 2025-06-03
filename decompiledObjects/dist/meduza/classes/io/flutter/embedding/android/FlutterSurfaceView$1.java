package io.flutter.embedding.android;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import io.flutter.Log;

class FlutterSurfaceView$1
  implements SurfaceHolder.Callback
{
  public FlutterSurfaceView$1(FlutterSurfaceView paramFlutterSurfaceView) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
    if (FlutterSurfaceView.access$100(this$0)) {
      FlutterSurfaceView.access$300(this$0, paramInt2, paramInt3);
    }
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
    FlutterSurfaceView.access$002(this$0, true);
    if (FlutterSurfaceView.access$100(this$0)) {
      FlutterSurfaceView.access$200(this$0);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    Log.v("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
    FlutterSurfaceView.access$002(this$0, false);
    if (FlutterSurfaceView.access$100(this$0)) {
      FlutterSurfaceView.access$400(this$0);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterSurfaceView.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */