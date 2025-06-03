package com.facebook.share.internal;

import androidx.annotation.Nullable;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.SharePhoto;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpenGraphJSONUtility
{
  private static JSONArray toJSONArray(List paramList, PhotoJSONProcessor paramPhotoJSONProcessor)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(OpenGraphJSONUtility.class)) {
      return null;
    }
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      paramList = paramList.iterator();
      while (paramList.hasNext()) {
        localJSONArray.put(toJSONValue(paramList.next(), paramPhotoJSONProcessor));
      }
      return localJSONArray;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramList, OpenGraphJSONUtility.class);
    }
    return null;
  }
  
  public static JSONObject toJSONObject(ShareOpenGraphAction paramShareOpenGraphAction, PhotoJSONProcessor paramPhotoJSONProcessor)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(OpenGraphJSONUtility.class)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator = paramShareOpenGraphAction.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, toJSONValue(paramShareOpenGraphAction.get(str), paramPhotoJSONProcessor));
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareOpenGraphAction, OpenGraphJSONUtility.class);
    }
    return null;
  }
  
  private static JSONObject toJSONObject(ShareOpenGraphObject paramShareOpenGraphObject, PhotoJSONProcessor paramPhotoJSONProcessor)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(OpenGraphJSONUtility.class)) {
      return null;
    }
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      Iterator localIterator = paramShareOpenGraphObject.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localJSONObject.put(str, toJSONValue(paramShareOpenGraphObject.get(str), paramPhotoJSONProcessor));
      }
      return localJSONObject;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramShareOpenGraphObject, OpenGraphJSONUtility.class);
    }
    return null;
  }
  
  public static Object toJSONValue(@Nullable Object paramObject, PhotoJSONProcessor paramPhotoJSONProcessor)
    throws JSONException
  {
    if (CrashShieldHandler.isObjectCrashing(OpenGraphJSONUtility.class)) {
      return null;
    }
    if (paramObject == null) {}
    try
    {
      return JSONObject.NULL;
    }
    finally
    {
      StringBuilder localStringBuilder;
      CrashShieldHandler.handleThrowable((Throwable)paramObject, OpenGraphJSONUtility.class);
    }
    if ((!(paramObject instanceof String)) && (!(paramObject instanceof Boolean)) && (!(paramObject instanceof Double)) && (!(paramObject instanceof Float)) && (!(paramObject instanceof Integer)) && (!(paramObject instanceof Long)))
    {
      if ((paramObject instanceof SharePhoto))
      {
        if (paramPhotoJSONProcessor != null) {
          return paramPhotoJSONProcessor.toJSONObject((SharePhoto)paramObject);
        }
        return null;
      }
      if ((paramObject instanceof ShareOpenGraphObject)) {
        return toJSONObject((ShareOpenGraphObject)paramObject, paramPhotoJSONProcessor);
      }
      if ((paramObject instanceof List)) {
        return toJSONArray((List)paramObject, paramPhotoJSONProcessor);
      }
      paramPhotoJSONProcessor = new java/lang/IllegalArgumentException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("Invalid object found for JSON serialization: ");
      localStringBuilder.append(paramObject.toString());
      paramPhotoJSONProcessor.<init>(localStringBuilder.toString());
      throw paramPhotoJSONProcessor;
    }
    return paramObject;
    return null;
  }
  
  public static abstract interface PhotoJSONProcessor
  {
    public abstract JSONObject toJSONObject(SharePhoto paramSharePhoto);
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.internal.OpenGraphJSONUtility
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */