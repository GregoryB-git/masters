package com.facebook.appevents.codeless;

import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public class CodelessMatcher$MatchedView
{
  private WeakReference<View> view;
  private String viewMapKey;
  
  public CodelessMatcher$MatchedView(View paramView, String paramString)
  {
    view = new WeakReference(paramView);
    viewMapKey = paramString;
  }
  
  @Nullable
  public View getView()
  {
    Object localObject = view;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = (View)((Reference)localObject).get();
    }
    return (View)localObject;
  }
  
  public String getViewMapKey()
  {
    return viewMapKey;
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher.MatchedView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */