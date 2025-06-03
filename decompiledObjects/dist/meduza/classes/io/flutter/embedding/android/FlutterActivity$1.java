package io.flutter.embedding.android;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

class FlutterActivity$1
  implements OnBackAnimationCallback
{
  public FlutterActivity$1(FlutterActivity paramFlutterActivity) {}
  
  public void onBackCancelled()
  {
    this$0.cancelBackGesture();
  }
  
  public void onBackInvoked()
  {
    this$0.commitBackGesture();
  }
  
  public void onBackProgressed(BackEvent paramBackEvent)
  {
    this$0.updateBackGestureProgress(paramBackEvent);
  }
  
  public void onBackStarted(BackEvent paramBackEvent)
  {
    this$0.startBackGesture(paramBackEvent);
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterActivity.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */