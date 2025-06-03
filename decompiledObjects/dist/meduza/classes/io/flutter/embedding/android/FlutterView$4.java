package io.flutter.embedding.android;

import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

class FlutterView$4
  implements FlutterUiDisplayListener
{
  public void onFlutterUiDisplayed()
  {
    val$renderer.removeIsDisplayingFlutterUiListener(this);
    val$onDone.run();
    FlutterView localFlutterView = this$0;
    if ((!(renderSurface instanceof FlutterImageView)) && (FlutterView.access$400(localFlutterView) != null))
    {
      FlutterView.access$400(this$0).detachFromRenderer();
      FlutterView.access$500(this$0);
    }
  }
  
  public void onFlutterUiNoLongerDisplayed() {}
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterView.4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */