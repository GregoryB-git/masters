package io.flutter.embedding.android;

import android.database.ContentObserver;
import android.os.Handler;
import io.flutter.Log;

class FlutterView$2
  extends ContentObserver
{
  public FlutterView$2(FlutterView paramFlutterView, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public void onChange(boolean paramBoolean)
  {
    super.onChange(paramBoolean);
    if (FlutterView.access$100(this$0) == null) {
      return;
    }
    Log.v("FlutterView", "System settings changed. Sending user settings to Flutter.");
    this$0.sendUserSettingsToFlutter();
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterView.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */