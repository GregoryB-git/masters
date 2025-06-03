package com.facebook.appevents.codeless;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import androidx.annotation.Nullable;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

public class RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener
  implements View.OnTouchListener
{
  @Nullable
  private View.OnTouchListener existingOnTouchListener;
  private WeakReference<View> hostView;
  private EventBinding mapping;
  private WeakReference<View> rootView;
  private boolean supportCodelessLogging = false;
  
  public RCTCodelessLoggingEventListener$AutoLoggingOnTouchListener(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    if ((paramEventBinding != null) && (paramView1 != null) && (paramView2 != null))
    {
      existingOnTouchListener = ViewHierarchy.getExistingOnTouchListener(paramView2);
      mapping = paramEventBinding;
      hostView = new WeakReference(paramView2);
      rootView = new WeakReference(paramView1);
      supportCodelessLogging = true;
    }
  }
  
  private void logEvent()
  {
    final Object localObject = mapping;
    if (localObject == null) {
      return;
    }
    final String str = ((EventBinding)localObject).getEventName();
    localObject = CodelessMatcher.getParameters(mapping, (View)rootView.get(), (View)hostView.get());
    if (((BaseBundle)localObject).containsKey("_valueToSum")) {
      ((BaseBundle)localObject).putDouble("_valueToSum", AppEventUtility.normalizePrice(((BaseBundle)localObject).getString("_valueToSum")));
    }
    ((BaseBundle)localObject).putString("_is_fb_codeless", "1");
    FacebookSdk.getExecutor().execute(new Runnable()
    {
      public void run()
      {
        if (CrashShieldHandler.isObjectCrashing(this)) {
          return;
        }
        try
        {
          AppEventsLogger.newLogger(FacebookSdk.getApplicationContext()).logEvent(str, localObject);
          return;
        }
        finally
        {
          CrashShieldHandler.handleThrowable(localThrowable, this);
        }
      }
    });
  }
  
  public boolean getSupportCodelessLogging()
  {
    return supportCodelessLogging;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    boolean bool = true;
    if (i == 1) {
      logEvent();
    }
    View.OnTouchListener localOnTouchListener = existingOnTouchListener;
    if ((localOnTouchListener == null) || (!localOnTouchListener.onTouch(paramView, paramMotionEvent))) {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */