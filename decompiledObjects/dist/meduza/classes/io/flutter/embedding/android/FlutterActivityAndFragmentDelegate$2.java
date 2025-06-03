package io.flutter.embedding.android;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class FlutterActivityAndFragmentDelegate$2
  implements ViewTreeObserver.OnPreDrawListener
{
  public boolean onPreDraw()
  {
    if ((FlutterActivityAndFragmentDelegate.access$100(this$0)) && (this$0.activePreDrawListener != null))
    {
      val$flutterView.getViewTreeObserver().removeOnPreDrawListener(this);
      this$0.activePreDrawListener = null;
    }
    return FlutterActivityAndFragmentDelegate.access$100(this$0);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivityAndFragmentDelegate.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */