package io.flutter.embedding.android;

import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import java.util.Iterator;
import java.util.Set;

class FlutterView$3
  implements FlutterUiDisplayListener
{
  public FlutterView$3(FlutterView paramFlutterView) {}
  
  public void onFlutterUiDisplayed()
  {
    FlutterView.access$202(this$0, true);
    Iterator localIterator = FlutterView.access$300(this$0).iterator();
    while (localIterator.hasNext()) {
      ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiDisplayed();
    }
  }
  
  public void onFlutterUiNoLongerDisplayed()
  {
    FlutterView.access$202(this$0, false);
    Iterator localIterator = FlutterView.access$300(this$0).iterator();
    while (localIterator.hasNext()) {
      ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiNoLongerDisplayed();
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterView.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */