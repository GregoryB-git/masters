package io.flutter.plugins.pathprovider;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

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
  
  public static abstract interface PathProviderApi
  {
    public abstract String getApplicationCachePath();
    
    public abstract String getApplicationDocumentsPath();
    
    public abstract String getApplicationSupportPath();
    
    public abstract List<String> getExternalCachePaths();
    
    public abstract String getExternalStoragePath();
    
    public abstract List<String> getExternalStoragePaths(Messages.StorageDirectory paramStorageDirectory);
    
    public abstract String getTemporaryPath();
  }
  
  public static enum StorageDirectory
  {
    public final int index;
    
    static
    {
      MUSIC = new StorageDirectory("MUSIC", 1, 1);
      PODCASTS = new StorageDirectory("PODCASTS", 2, 2);
      RINGTONES = new StorageDirectory("RINGTONES", 3, 3);
      ALARMS = new StorageDirectory("ALARMS", 4, 4);
      NOTIFICATIONS = new StorageDirectory("NOTIFICATIONS", 5, 5);
      PICTURES = new StorageDirectory("PICTURES", 6, 6);
      MOVIES = new StorageDirectory("MOVIES", 7, 7);
      DOWNLOADS = new StorageDirectory("DOWNLOADS", 8, 8);
      DCIM = new StorageDirectory("DCIM", 9, 9);
      DOCUMENTS = new StorageDirectory("DOCUMENTS", 10, 10);
    }
    
    private StorageDirectory(int paramInt)
    {
      index = paramInt;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.pathprovider.Messages
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */