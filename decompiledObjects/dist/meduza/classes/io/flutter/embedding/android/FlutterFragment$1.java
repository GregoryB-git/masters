package io.flutter.embedding.android;

import android.view.ViewTreeObserver.OnWindowFocusChangeListener;

class FlutterFragment$1
  implements ViewTreeObserver.OnWindowFocusChangeListener
{
  public FlutterFragment$1(FlutterFragment paramFlutterFragment) {}
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (FlutterFragment.access$000(this$0, "onWindowFocusChanged")) {
      this$0.delegate.onWindowFocusChanged(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterFragment.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */