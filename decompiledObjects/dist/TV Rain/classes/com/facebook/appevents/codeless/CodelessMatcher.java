package com.facebook.appevents.codeless;

import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
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
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.ParameterComponent;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.appevents.codeless.internal.PathComponent.MatchBitmaskType;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.InternalSettings;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import z2;

class CodelessMatcher
{
  private static final String CURRENT_CLASS_NAME = ".";
  private static final String PARENT_CLASS_NAME = "..";
  private static final String TAG = "com.facebook.appevents.codeless.CodelessMatcher";
  private static CodelessMatcher codelessMatcher;
  private Set<Activity> activitiesSet = Collections.newSetFromMap(new WeakHashMap());
  private HashMap<Integer, HashSet<String>> activityToListenerMap = new HashMap();
  private HashSet<String> listenerSet = new HashSet();
  private final Handler uiThreadHandler = new Handler(Looper.getMainLooper());
  private Set<ViewMatcher> viewMatchers = new HashSet();
  
  /* Error */
  public static CodelessMatcher getInstance()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 86	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_0
    //   9: iload_0
    //   10: ifeq +8 -> 18
    //   13: ldc 2
    //   15: monitorexit
    //   16: aconst_null
    //   17: areturn
    //   18: getstatic 101	com/facebook/appevents/codeless/CodelessMatcher:codelessMatcher	Lcom/facebook/appevents/codeless/CodelessMatcher;
    //   21: ifnonnull +15 -> 36
    //   24: new 2	com/facebook/appevents/codeless/CodelessMatcher
    //   27: astore_1
    //   28: aload_1
    //   29: invokespecial 102	com/facebook/appevents/codeless/CodelessMatcher:<init>	()V
    //   32: aload_1
    //   33: putstatic 101	com/facebook/appevents/codeless/CodelessMatcher:codelessMatcher	Lcom/facebook/appevents/codeless/CodelessMatcher;
    //   36: getstatic 101	com/facebook/appevents/codeless/CodelessMatcher:codelessMatcher	Lcom/facebook/appevents/codeless/CodelessMatcher;
    //   39: astore_1
    //   40: ldc 2
    //   42: monitorexit
    //   43: aload_1
    //   44: areturn
    //   45: astore_1
    //   46: aload_1
    //   47: ldc 2
    //   49: invokestatic 93	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   52: ldc 2
    //   54: monitorexit
    //   55: aconst_null
    //   56: areturn
    //   57: astore_1
    //   58: ldc 2
    //   60: monitorexit
    //   61: aload_1
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	2	0	bool	boolean
    //   27	17	1	localCodelessMatcher	CodelessMatcher
    //   45	2	1	localThrowable	Throwable
    //   57	5	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   18	36	45	finally
    //   36	40	45	finally
    //   3	9	57	finally
    //   46	52	57	finally
  }
  
  @UiThread
  public static Bundle getParameters(EventBinding paramEventBinding, View paramView1, View paramView2)
  {
    if (CrashShieldHandler.isObjectCrashing(CodelessMatcher.class)) {
      return null;
    }
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (paramEventBinding == null) {
        return localBundle;
      }
      Object localObject1 = paramEventBinding.getViewParameters();
      if (localObject1 != null)
      {
        Iterator localIterator = ((List)localObject1).iterator();
        for (;;)
        {
          if (!localIterator.hasNext()) {
            break label248;
          }
          ParameterComponent localParameterComponent = (ParameterComponent)localIterator.next();
          localObject1 = value;
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            localBundle.putString(name, value);
          }
          else if (path.size() > 0)
          {
            if (pathType.equals("relative")) {
              localObject1 = ViewMatcher.findViewByPath(paramEventBinding, paramView2, path, 0, -1, paramView2.getClass().getSimpleName());
            } else {
              localObject1 = ViewMatcher.findViewByPath(paramEventBinding, paramView1, path, 0, -1, paramView1.getClass().getSimpleName());
            }
            localObject1 = ((List)localObject1).iterator();
            if (((Iterator)localObject1).hasNext())
            {
              Object localObject2 = (MatchedView)((Iterator)localObject1).next();
              if (((MatchedView)localObject2).getView() == null) {
                break;
              }
              localObject2 = ViewHierarchy.getTextOfView(((MatchedView)localObject2).getView());
              if (((String)localObject2).length() <= 0) {
                break;
              }
              localBundle.putString(name, (String)localObject2);
            }
          }
        }
      }
      label248:
      return localBundle;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramEventBinding, CodelessMatcher.class);
    }
    return null;
  }
  
  private void matchViews()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      Iterator localIterator = activitiesSet.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (Activity)localIterator.next();
        if (localObject != null)
        {
          View localView = AppEventUtility.getRootView((Activity)localObject);
          localObject = localObject.getClass().getSimpleName();
          ViewMatcher localViewMatcher = new com/facebook/appevents/codeless/CodelessMatcher$ViewMatcher;
          localViewMatcher.<init>(localView, uiThreadHandler, listenerSet, (String)localObject);
          viewMatchers.add(localViewMatcher);
        }
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  private void startTracking()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        matchViews();
      }
      else
      {
        Handler localHandler = uiThreadHandler;
        Runnable local1 = new com/facebook/appevents/codeless/CodelessMatcher$1;
        local1.<init>(this);
        localHandler.post(local1);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  @UiThread
  public void add(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (InternalSettings.isUnityApp()) {
        return;
      }
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        activitiesSet.add(paramActivity);
        listenerSet.clear();
        if (activityToListenerMap.containsKey(Integer.valueOf(paramActivity.hashCode()))) {
          listenerSet = ((HashSet)activityToListenerMap.get(Integer.valueOf(paramActivity.hashCode())));
        }
        startTracking();
        return;
      }
      paramActivity = new com/facebook/FacebookException;
      paramActivity.<init>("Can't add activity to CodelessMatcher on non-UI thread");
      throw paramActivity;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, this);
    }
  }
  
  @UiThread
  public void destroy(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      activityToListenerMap.remove(Integer.valueOf(paramActivity.hashCode()));
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, this);
    }
  }
  
  @UiThread
  public void remove(Activity paramActivity)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (InternalSettings.isUnityApp()) {
        return;
      }
      if (Thread.currentThread() == Looper.getMainLooper().getThread())
      {
        activitiesSet.remove(paramActivity);
        viewMatchers.clear();
        activityToListenerMap.put(Integer.valueOf(paramActivity.hashCode()), (HashSet)listenerSet.clone());
        listenerSet.clear();
        return;
      }
      paramActivity = new com/facebook/FacebookException;
      paramActivity.<init>("Can't remove activity from CodelessMatcher on non-UI thread");
      throw paramActivity;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramActivity, this);
    }
  }
  
  public static class MatchedView
  {
    private WeakReference<View> view;
    private String viewMapKey;
    
    public MatchedView(View paramView, String paramString)
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
  
  @UiThread
  public static class ViewMatcher
    implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable
  {
    private final String activityName;
    @Nullable
    private List<EventBinding> eventBindings;
    private final Handler handler;
    private HashSet<String> listenerSet;
    private WeakReference<View> rootView;
    
    public ViewMatcher(View paramView, Handler paramHandler, HashSet<String> paramHashSet, String paramString)
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
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.CodelessMatcher
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */