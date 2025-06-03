package com.facebook.appevents.codeless;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import z2;

@UiThread
public class CodelessMatcher$ViewMatcher
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable
{
  private final String activityName;
  @Nullable
  private List<EventBinding> eventBindings;
  private final Handler handler;
  private HashSet<String> listenerSet;
  private WeakReference<View> rootView;
  
  public CodelessMatcher$ViewMatcher(View paramView, Handler paramHandler, HashSet<String> paramHashSet, String paramString)
  {
    rootView = new WeakReference(paramView);
    handler = paramHandler;
    listenerSet = paramHashSet;
    activityName = paramString;
    paramHandler.postDelayed(this, 200L);
  }
  
  private void attachListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    if (paramEventBinding == null) {
      return;
    }
    try
    {
      View localView1 = paramMatchedView.getView();
      if (localView1 == null) {
        return;
      }
      View localView2 = ViewHierarchy.findRCTRootView(localView1);
      if ((localView2 != null) && (ViewHierarchy.isRCTButton(localView1, localView2)))
      {
        attachRCTListener(paramMatchedView, paramView, paramEventBinding);
        return;
      }
      if (localView1.getClass().getName().startsWith("com.facebook.react")) {
        return;
      }
      if (!(localView1 instanceof AdapterView)) {
        attachOnClickListener(paramMatchedView, paramView, paramEventBinding);
      } else if ((localView1 instanceof ListView)) {
        attachOnItemClickListener(paramMatchedView, paramView, paramEventBinding);
      }
    }
    catch (Exception paramMatchedView)
    {
      Utility.logd(CodelessMatcher.access$100(), paramMatchedView);
    }
  }
  
  private void attachOnClickListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    View localView = paramMatchedView.getView();
    if (localView == null) {
      return;
    }
    paramMatchedView = paramMatchedView.getViewMapKey();
    View.OnClickListener localOnClickListener = ViewHierarchy.getExistingOnClickListener(localView);
    int i;
    if (((localOnClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnClickListener)) && (((CodelessLoggingEventListener.AutoLoggingOnClickListener)localOnClickListener).getSupportCodelessLogging())) {
      i = 1;
    } else {
      i = 0;
    }
    if ((!listenerSet.contains(paramMatchedView)) && (i == 0))
    {
      localView.setOnClickListener(CodelessLoggingEventListener.getOnClickListener(paramEventBinding, paramView, localView));
      listenerSet.add(paramMatchedView);
    }
  }
  
  private void attachOnItemClickListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    AdapterView localAdapterView = (AdapterView)paramMatchedView.getView();
    if (localAdapterView == null) {
      return;
    }
    paramMatchedView = paramMatchedView.getViewMapKey();
    AdapterView.OnItemClickListener localOnItemClickListener = localAdapterView.getOnItemClickListener();
    int i;
    if (((localOnItemClickListener instanceof CodelessLoggingEventListener.AutoLoggingOnItemClickListener)) && (((CodelessLoggingEventListener.AutoLoggingOnItemClickListener)localOnItemClickListener).getSupportCodelessLogging())) {
      i = 1;
    } else {
      i = 0;
    }
    if ((!listenerSet.contains(paramMatchedView)) && (i == 0))
    {
      localAdapterView.setOnItemClickListener(CodelessLoggingEventListener.getOnItemClickListener(paramEventBinding, paramView, localAdapterView));
      listenerSet.add(paramMatchedView);
    }
  }
  
  private void attachRCTListener(CodelessMatcher.MatchedView paramMatchedView, View paramView, EventBinding paramEventBinding)
  {
    View localView = paramMatchedView.getView();
    if (localView == null) {
      return;
    }
    String str = paramMatchedView.getViewMapKey();
    paramMatchedView = ViewHierarchy.getExistingOnTouchListener(localView);
    int i;
    if (((paramMatchedView instanceof RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener)) && (((RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener)paramMatchedView).getSupportCodelessLogging())) {
      i = 1;
    } else {
      i = 0;
    }
    if ((!listenerSet.contains(str)) && (i == 0))
    {
      localView.setOnTouchListener(RCTCodelessLoggingEventListener.getOnTouchListener(paramEventBinding, paramView, localView));
      listenerSet.add(str);
    }
  }
  
  public static List<CodelessMatcher.MatchedView> findViewByPath(EventBinding paramEventBinding, View paramView, List<PathComponent> paramList, int paramInt1, int paramInt2, String paramString)
  {
    paramString = z2.u(paramString, ".");
    paramString.append(String.valueOf(paramInt2));
    paramString = paramString.toString();
    ArrayList localArrayList = new ArrayList();
    if (paramView == null) {
      return localArrayList;
    }
    int i;
    if (paramInt1 >= paramList.size())
    {
      localArrayList.add(new CodelessMatcher.MatchedView(paramView, paramString));
    }
    else
    {
      PathComponent localPathComponent = (PathComponent)paramList.get(paramInt1);
      if (className.equals(".."))
      {
        paramView = paramView.getParent();
        if ((paramView instanceof ViewGroup))
        {
          paramView = findVisibleChildren((ViewGroup)paramView);
          i = paramView.size();
          for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
            localArrayList.addAll(findViewByPath(paramEventBinding, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, paramString));
          }
        }
        return localArrayList;
      }
      if (className.equals("."))
      {
        localArrayList.add(new CodelessMatcher.MatchedView(paramView, paramString));
        return localArrayList;
      }
      if (!isTheSameView(paramView, localPathComponent, paramInt2)) {
        return localArrayList;
      }
      if (paramInt1 == paramList.size() - 1) {
        localArrayList.add(new CodelessMatcher.MatchedView(paramView, paramString));
      }
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = findVisibleChildren((ViewGroup)paramView);
      i = paramView.size();
      for (paramInt2 = 0; paramInt2 < i; paramInt2++) {
        localArrayList.addAll(findViewByPath(paramEventBinding, (View)paramView.get(paramInt2), paramList, paramInt1 + 1, paramInt2, paramString));
      }
    }
    return localArrayList;
  }
  
  private static List<View> findVisibleChildren(ViewGroup paramViewGroup)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramViewGroup.getChildCount();
    for (int j = 0; j < i; j++)
    {
      View localView = paramViewGroup.getChildAt(j);
      if (localView.getVisibility() == 0) {
        localArrayList.add(localView);
      }
    }
    return localArrayList;
  }
  
  private static boolean isTheSameView(View paramView, PathComponent paramPathComponent, int paramInt)
  {
    int i = index;
    if ((i != -1) && (paramInt != i)) {
      return false;
    }
    Object localObject;
    if (!paramView.getClass().getCanonicalName().equals(className))
    {
      if (className.matches(".*android\\..*"))
      {
        localObject = className.split("\\.");
        if (localObject.length > 0)
        {
          localObject = localObject[(localObject.length - 1)];
          if (paramView.getClass().getSimpleName().equals(localObject)) {
            break label92;
          }
        }
      }
      return false;
    }
    label92:
    if (((matchBitmask & PathComponent.MatchBitmaskType.ID.getValue()) > 0) && (id != paramView.getId())) {
      return false;
    }
    String str1;
    String str2;
    if ((matchBitmask & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0)
    {
      localObject = text;
      str1 = ViewHierarchy.getTextOfView(paramView);
      str2 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(str1), "");
      if ((!((String)localObject).equals(str1)) && (!((String)localObject).equals(str2))) {
        return false;
      }
    }
    if ((matchBitmask & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0)
    {
      str2 = description;
      if (paramView.getContentDescription() == null) {
        localObject = "";
      } else {
        localObject = String.valueOf(paramView.getContentDescription());
      }
      str1 = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash((String)localObject), "");
      if ((!str2.equals(localObject)) && (!str2.equals(str1))) {
        return false;
      }
    }
    if ((matchBitmask & PathComponent.MatchBitmaskType.HINT.getValue()) > 0)
    {
      str2 = hint;
      str1 = ViewHierarchy.getHintOfView(paramView);
      localObject = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(str1), "");
      if ((!str2.equals(str1)) && (!str2.equals(localObject))) {
        return false;
      }
    }
    if ((matchBitmask & PathComponent.MatchBitmaskType.TAG.getValue()) > 0)
    {
      paramPathComponent = tag;
      if (paramView.getTag() == null) {
        paramView = "";
      } else {
        paramView = String.valueOf(paramView.getTag());
      }
      localObject = Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(paramView), "");
      if ((!paramPathComponent.equals(paramView)) && (!paramPathComponent.equals(localObject))) {
        return false;
      }
    }
    return true;
  }
  
  private void startMatch()
  {
    if ((eventBindings != null) && (rootView.get() != null)) {
      for (int i = 0; i < eventBindings.size(); i++) {
        findView((EventBinding)eventBindings.get(i), (View)rootView.get());
      }
    }
  }
  
  public void findView(EventBinding paramEventBinding, View paramView)
  {
    if ((paramEventBinding != null) && (paramView != null))
    {
      if ((!TextUtils.isEmpty(paramEventBinding.getActivityName())) && (!paramEventBinding.getActivityName().equals(activityName))) {
        return;
      }
      Object localObject = paramEventBinding.getViewPath();
      if (((List)localObject).size() > 25) {
        return;
      }
      localObject = findViewByPath(paramEventBinding, paramView, (List)localObject, 0, -1, activityName).iterator();
      while (((Iterator)localObject).hasNext()) {
        attachListener((CodelessMatcher.MatchedView)((Iterator)localObject).next(), paramView, paramEventBinding);
      }
    }
  }
  
  public void onGlobalLayout()
  {
    startMatch();
  }
  
  public void onScrollChanged()
  {
    startMatch();
  }
  
  public void run()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Object localObject = FetchedAppSettingsManager.getAppSettingsWithoutQuery(FacebookSdk.getApplicationId());
      if ((localObject != null) && (((FetchedAppSettings)localObject).getCodelessEventsEnabled()))
      {
        localObject = EventBinding.parseArray(((FetchedAppSettings)localObject).getEventBindings());
        eventBindings = ((List)localObject);
        if (localObject != null)
        {
          localObject = (View)rootView.get();
          if (localObject == null) {
            return;
          }
          localObject = ((View)localObject).getViewTreeObserver();
          if (((ViewTreeObserver)localObject).isAlive())
          {
            ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
            ((ViewTreeObserver)localObject).addOnScrollChangedListener(this);
          }
          startMatch();
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher.ViewMatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */