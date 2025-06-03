package com.facebook.appevents.codeless;

import android.view.View;
import android.view.View.OnClickListener;
import androidx.annotation.Nullable;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class CodelessLoggingEventListener$AutoLoggingOnClickListener
  implements View.OnClickListener
{
  @Nullable
  private View.OnClickListener existingOnClickListener;
  private WeakReference<View> hostView;
  private EventBinding mapping;
  private WeakReference<View> rootView;
  private boolean supportCodelessLogging = false;
  
  private CodelessLoggingEventListener$AutoLoggingOnClickListener(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    if ((paramEventBinding != null) && (paramView1 != null) && (paramView2 != null))
    {
      existingOnClickListener = ViewHierarchy.getExistingOnClickListener(paramView2);
      mapping = paramEventBinding;
      hostView = new WeakReference(paramView2);
      rootView = new WeakReference(paramView1);
      supportCodelessLogging = true;
    }
  }
  
  public boolean getSupportCodelessLogging()
  {
    return supportCodelessLogging;
  }
  
  public void onClick(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      View.OnClickListener localOnClickListener = existingOnClickListener;
      if (localOnClickListener != null) {
        localOnClickListener.onClick(paramView);
      }
      if ((rootView.get() != null) && (hostView.get() != null)) {
        CodelessLoggingEventListener.access$200(mapping, (View)rootView.get(), (View)hostView.get());
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */