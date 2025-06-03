package io.flutter.embedding.android;

import android.view.View;
import io.flutter.Log;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

class FlutterSurfaceView$2
  implements FlutterUiDisplayListener
{
  public FlutterSurfaceView$2(FlutterSurfaceView paramFlutterSurfaceView) {}
  
  public void onFlutterUiDisplayed()
  {
    Log.v("FlutterSurfaceView", "onFlutterUiDisplayed()");
    this$0.setAlpha(1.0F);
    if (FlutterSurfaceView.access$500(this$0) != null) {
      FlutterSurfaceView.access$500(this$0).removeIsDisplayingFlutterUiListener(this);
    }
  }
  
  public void onFlutterUiNoLongerDisplayed() {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterSurfaceView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */