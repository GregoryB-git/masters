package com.facebook.appevents.codeless.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class EventBinding
{
  private final String activityName;
  private final String appVersion;
  private final String componentId;
  private final String eventName;
  private final MappingMethod method;
  private final List<ParameterComponent> parameters;
  private final List<PathComponent> path;
  private final String pathType;
  private final ActionType type;
  
  public EventBinding(String paramString1, MappingMethod paramMappingMethod, ActionType paramActionType, String paramString2, List<PathComponent> paramList, List<ParameterComponent> paramList1, String paramString3, String paramString4, String paramString5)
  {
    eventName = paramString1;
    method = paramMappingMethod;
    type = paramActionType;
    appVersion = paramString2;
    path = paramList;
    parameters = paramList1;
    componentId = paramString3;
    pathType = paramString4;
    activityName = paramString5;
  }
  
  public static EventBinding getInstanceFromJson(JSONObject paramJSONObject)
    throws JSONException, IllegalArgumentException
  {
    String str1 = paramJSONObject.getString("event_name");
    Object localObject1 = paramJSONObject.getString("method");
    Object localObject2 = Locale.ENGLISH;
    localObject1 = MappingMethod.valueOf(((String)localObject1).toUpperCase((Locale)localObject2));
    ActionType localActionType = ActionType.valueOf(paramJSONObject.getString("event_type").toUpperCase((Locale)localObject2));
    localObject2 = paramJSONObject.getString("app_version");
    JSONArray localJSONArray = paramJSONObject.getJSONArray("path");
    ArrayList localArrayList1 = new ArrayList();
    int i = 0;
    for (int j = 0; j < localJSONArray.length(); j++) {
      localArrayList1.add(new PathComponent(localJSONArray.getJSONObject(j)));
    }
    String str2 = paramJSONObject.optString("path_type", "absolute");
    localJSONArray = paramJSONObject.optJSONArray("parameters");
    ArrayList localArrayList2 = new ArrayList();
    if (localJSONArray != null) {
      for (j = i; j < localJSONArray.length(); j++) {
        localArrayList2.add(new ParameterComponent(localJSONArray.getJSONObject(j)));
      }
    }
    return new EventBinding(str1, (MappingMethod)localObject1, localActionType, (String)localObject2, localArrayList1, localArrayList2, paramJSONObject.optString("component_id"), str2, paramJSONObject.optString("activity_name"));
  }
  
  public static List<EventBinding> parseArray(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    if (paramJSONArray != null) {}
    try
    {
      int j = paramJSONArray.length();
      break label24;
      j = 0;
      label24:
      while (i < j)
      {
        localArrayList.add(getInstanceFromJson(paramJSONArray.getJSONObject(i)));
        i++;
      }
    }
    catch (JSONException|IllegalArgumentException paramJSONArray)
    {
      for (;;) {}
    }
    return localArrayList;
  }
  
  public String getActivityName()
  {
    return activityName;
  }
  
  public String getAppVersion()
  {
    return appVersion;
  }
  
  public String getComponentId()
  {
    return componentId;
  }
  
  public String getEventName()
  {
    return eventName;
  }
  
  public MappingMethod getMethod()
  {
    return method;
  }
  
  public String getPathType()
  {
    return pathType;
  }
  
  public ActionType getType()
  {
    return type;
  }
  
  public List<ParameterComponent> getViewParameters()
  {
    return Collections.unmodifiableList(parameters);
  }
  
  public List<PathComponent> getViewPath()
  {
    return Collections.unmodifiableList(path);
  }
  
  public static enum ActionType
  {
    static
    {
      ActionType localActionType1 = new ActionType("CLICK", 0);
      CLICK = localActionType1;
      ActionType localActionType2 = new ActionType("SELECTED", 1);
      SELECTED = localActionType2;
      ActionType localActionType3 = new ActionType("TEXT_CHANGED", 2);
      TEXT_CHANGED = localActionType3;
      $VALUES = new ActionType[] { localActionType1, localActionType2, localActionType3 };
    }
    
    private ActionType() {}
  }
  
  public static enum MappingMethod
  {
    static
    {
      MappingMethod localMappingMethod1 = new MappingMethod("MANUAL", 0);
      MANUAL = localMappingMethod1;
      MappingMethod localMappingMethod2 = new MappingMethod("INFERENCE", 1);
      INFERENCE = localMappingMethod2;
      $VALUES = new MappingMethod[] { localMappingMethod1, localMappingMethod2 };
    }
    
    private MappingMethod() {}
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.codeless.internal.EventBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */