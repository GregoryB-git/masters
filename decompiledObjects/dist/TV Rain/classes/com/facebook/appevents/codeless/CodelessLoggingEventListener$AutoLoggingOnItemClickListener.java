package com.facebook.appevents.codeless;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.annotation.Nullable;
import com.facebook.appevents.codeless.internal.EventBinding;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class CodelessLoggingEventListener$AutoLoggingOnItemClickListener
  implements AdapterView.OnItemClickListener
{
  @Nullable
  private AdapterView.OnItemClickListener existingOnItemClickListener;
  private WeakReference<AdapterView> hostView;
  private EventBinding mapping;
  private WeakReference<View> rootView;
  private boolean supportCodelessLogging = false;
  
  private CodelessLoggingEventListener$AutoLoggingOnItemClickListener(EventBinding paramEventBinding, View paramView, AdapterView paramAdapterView)
  {
    if ((paramEventBinding != null) && (paramView != null) && (paramAdapterView != null))
    {
      existingOnItemClickListener = paramAdapterView.getOnItemClickListener();
      mapping = paramEventBinding;
      hostView = new WeakReference(paramAdapterView);
      rootView = new WeakReference(paramView);
      supportCodelessLogging = true;
    }
  }
  
  public boolean getSupportCodelessLogging()
  {
    return supportCodelessLogging;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AdapterView.OnItemClickListener localOnItemClickListener = existingOnItemClickListener;
    if (localOnItemClickListener != null) {
      localOnItemClickListener.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    if ((rootView.get() != null) && (hostView.get() != null)) {
      CodelessLoggingEventListener.access$200(mapping, (View)rootView.get(), (View)hostView.get());
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */