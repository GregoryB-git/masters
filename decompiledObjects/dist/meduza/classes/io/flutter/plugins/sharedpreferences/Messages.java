package io.flutter.plugins.sharedpreferences;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Messages
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static abstract interface SharedPreferencesApi
  {
    public abstract Boolean clear(String paramString, List<String> paramList);
    
    public abstract Map<String, Object> getAll(String paramString, List<String> paramList);
    
    public abstract Boolean remove(String paramString);
    
    public abstract Boolean setBool(String paramString, Boolean paramBoolean);
    
    public abstract Boolean setDouble(String paramString, Double paramDouble);
    
    public abstract Boolean setInt(String paramString, Long paramLong);
    
    public abstract Boolean setString(String paramString1, String paramString2);
    
    public abstract Boolean setStringList(String paramString, List<String> paramList);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.Messages
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */