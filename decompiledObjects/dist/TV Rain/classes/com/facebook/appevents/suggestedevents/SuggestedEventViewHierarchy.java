package com.facebook.appevents.suggestedevents;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import com.facebook.appevents.codeless.internal.ViewHierarchy;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class SuggestedEventViewHierarchy
{
  public static final String TAG = "com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy";
  private static final List<Class<? extends View>> blacklistedViews = new ArrayList(Arrays.asList(new Class[] { Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class }));
  
  public static List<View> getAllClickableViews(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = blacklistedViews.iterator();
      while (localIterator.hasNext()) {
        if (((Class)localIterator.next()).isInstance(paramView)) {
          return localArrayList;
        }
      }
      if (paramView.isClickable()) {
        localArrayList.add(paramView);
      }
      paramView = ViewHierarchy.getChildrenOfView(paramView).iterator();
      while (paramView.hasNext()) {
        localArrayList.addAll(getAllClickableViews((View)paramView.next()));
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, SuggestedEventViewHierarchy.class);
    }
    return null;
  }
  
  public static JSONObject getDictionaryOfView(View paramView1, View paramView2)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
      return null;
    }
    for (;;)
    {
      try
      {
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        if (paramView1 != paramView2) {}
      }
      finally
      {
        JSONObject localJSONObject;
        JSONArray localJSONArray;
        CrashShieldHandler.handleThrowable(paramView1, SuggestedEventViewHierarchy.class);
        return null;
      }
      try
      {
        localJSONObject.put("is_interacted", true);
        updateBasicInfo(paramView1, localJSONObject);
        localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>();
        paramView1 = ViewHierarchy.getChildrenOfView(paramView1).iterator();
        if (paramView1.hasNext()) {
          localJSONArray.put(getDictionaryOfView((View)paramView1.next(), paramView2));
        } else {
          localJSONObject.put("childviews", localJSONArray);
        }
      }
      catch (JSONException paramView1) {}
    }
    return localJSONObject;
  }
  
  private static List<String> getTextOfChildren(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
      return null;
    }
    try
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Iterator localIterator = ViewHierarchy.getChildrenOfView(paramView).iterator();
      while (localIterator.hasNext())
      {
        View localView = (View)localIterator.next();
        paramView = ViewHierarchy.getTextOfView(localView);
        if (!paramView.isEmpty()) {
          localArrayList.add(paramView);
        }
        localArrayList.addAll(getTextOfChildren(localView));
      }
      return localArrayList;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, SuggestedEventViewHierarchy.class);
    }
    return null;
  }
  
  public static String getTextOfViewRecursively(View paramView)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
      return null;
    }
    try
    {
      String str = ViewHierarchy.getTextOfView(paramView);
      if (!str.isEmpty()) {
        return str;
      }
      paramView = TextUtils.join(" ", getTextOfChildren(paramView));
      return paramView;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramView, SuggestedEventViewHierarchy.class);
    }
    return null;
  }
  
  public static void updateBasicInfo(View paramView, JSONObject paramJSONObject)
  {
    if (CrashShieldHandler.isObjectCrashing(SuggestedEventViewHierarchy.class)) {
      return;
    }
    try
    {
      try
      {
        String str1 = ViewHierarchy.getTextOfView(paramView);
        String str2 = ViewHierarchy.getHintOfView(paramView);
        paramJSONObject.put("classname", paramView.getClass().getSimpleName());
        paramJSONObject.put("classtypebitmask", ViewHierarchy.getClassTypeBitmask(paramView));
        if (!str1.isEmpty()) {
          paramJSONObject.put("text", str1);
        }
        if (!str2.isEmpty()) {
          paramJSONObject.put("hint", str2);
        }
        if ((paramView instanceof EditText)) {
          paramJSONObject.put("inputtype", ((EditText)paramView).getInputType());
        }
      }
      finally
      {
        CrashShieldHandler.handleThrowable(paramView, SuggestedEventViewHierarchy.class);
      }
      return;
    }
    catch (JSONException paramView)
    {
      for (;;) {}
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.suggestedevents.SuggestedEventViewHierarchy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */