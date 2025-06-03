package androidx.core.view;

import android.os.Handler;
import android.os.Message;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;

class GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler
  extends Handler
{
  public GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat.GestureDetectorCompatImplBase paramGestureDetectorCompatImplBase) {}
  
  public GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler(GestureDetectorCompat.GestureDetectorCompatImplBase paramGestureDetectorCompatImplBase, Handler paramHandler)
  {
    super(paramHandler.getLooper());
  }
  
  public void handleMessage(Message paramMessage)
  {
    int i = what;
    if (i != 1)
    {
      if (i != 2)
      {
        Object localObject;
        if (i == 3)
        {
          localObject = this$0;
          paramMessage = mDoubleTapListener;
          if (paramMessage != null) {
            if (!mStillDown) {
              paramMessage.onSingleTapConfirmed(mCurrentDownEvent);
            } else {
              mDeferConfirmSingleTap = true;
            }
          }
        }
        else
        {
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Unknown message ");
          ((StringBuilder)localObject).append(paramMessage);
          throw new RuntimeException(((StringBuilder)localObject).toString());
        }
      }
      else
      {
        this$0.dispatchLongPress();
      }
    }
    else
    {
      paramMessage = this$0;
      mListener.onShowPress(mCurrentDownEvent);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.GestureDetectorCompat.GestureDetectorCompatImplBase.GestureHandler
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */