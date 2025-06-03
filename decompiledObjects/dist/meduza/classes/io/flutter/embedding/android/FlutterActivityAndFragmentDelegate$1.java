package io.flutter.embedding.android;

import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

class FlutterActivityAndFragmentDelegate$1
  implements FlutterUiDisplayListener
{
  public FlutterActivityAndFragmentDelegate$1(FlutterActivityAndFragmentDelegate paramFlutterActivityAndFragmentDelegate) {}
  
  public void onFlutterUiDisplayed()
  {
    FlutterActivityAndFragmentDelegate.access$000(this$0).onFlutterUiDisplayed();
    FlutterActivityAndFragmentDelegate.access$102(this$0, true);
    FlutterActivityAndFragmentDelegate.access$202(this$0, true);
  }
  
  public void onFlutterUiNoLongerDisplayed()
  {
    FlutterActivityAndFragmentDelegate.access$000(this$0).onFlutterUiNoLongerDisplayed();
    FlutterActivityAndFragmentDelegate.access$102(this$0, false);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */