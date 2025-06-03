package com.facebook.appevents.codeless;

import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class CodelessLoggingEventListener
{
  private static final String TAG = "com.facebook.appevents.codeless.CodelessLoggingEventListener";
  
  public static AutoLoggingOnClickListener getOnClickListener(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
      return null;
    }
    try
    {
      paramEventBinding = new AutoLoggingOnClickListener(paramEventBinding, paramView1, paramView2, null);
      return paramEventBinding;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramEventBinding, CodelessLoggingEventListener.class);
    }
    return null;
  }
  
  public static AutoLoggingOnItemClickListener getOnItemClickListener(EventBinding paramEventBinding, View paramView, AdapterView paramAdapterView)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
      return null;
    }
    try
    {
      paramEventBinding = new AutoLoggingOnItemClickListener(paramEventBinding, paramView, paramAdapterView, null);
      return paramEventBinding;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramEventBinding, CodelessLoggingEventListener.class);
    }
    return null;
  }
  
  private static void logEvent(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
      return;
    }
    try
    {
      String str = paramEventBinding.getEventName();
      paramView1 = CodelessMatcher.getParameters(paramEventBinding, paramView1, paramView2);
      updateParameters(paramView1);
      paramView2 = FacebookSdk.getExecutor();
      paramEventBinding = new com/facebook/appevents/codeless/CodelessLoggingEventListener$1;
      paramEventBinding.<init>(str, paramView1);
      paramView2.execute(paramEventBinding);
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramEventBinding, CodelessLoggingEventListener.class);
    }
  }
  
  public static void updateParameters(Bundle paramBundle)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessLoggingEventListener.class)) {
      return;
    }
    try
    {
      String str = paramBundle.getString("_valueToSum");
      if (str != null) {
        paramBundle.putDouble("_valueToSum", AppEventUtility.normalizePrice(str));
      }
      paramBundle.putString("_is_fb_codeless", "1");
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBundle, CodelessLoggingEventListener.class);
    }
  }
  
  public static class AutoLoggingOnClickListener
    implements View.OnClickListener
  {
    @Nullable
    private View.OnClickListener existingOnClickListener;
    private WeakReference<View> hostView;
    private EventBinding mapping;
    private WeakReference<View> rootView;
    private boolean supportCodelessLogging = false;
    
    private AutoLoggingOnClickListener(EventBinding paramEventBinding, View paramView1, View paramView2)
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
  
  public static class AutoLoggingOnItemClickListener
    implements AdapterView.OnItemClickListener
  {
    @Nullable
    private AdapterView.OnItemClickListener existingOnItemClickListener;
    private WeakReference<AdapterView> hostView;
    private EventBinding mapping;
    private WeakReference<View> rootView;
    private boolean supportCodelessLogging = false;
    
    private AutoLoggingOnItemClickListener(EventBinding paramEventBinding, View paramView, AdapterView paramAdapterView)
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
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessLoggingEventListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */