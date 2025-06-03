package R5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class j
{
  public static ArrayList a(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(paramThrowable.toString());
    localArrayList.add(paramThrowable.getClass().getSimpleName());
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("Cause: ");
    localStringBuilder.append(paramThrowable.getCause());
    localStringBuilder.append(", Stacktrace: ");
    localStringBuilder.append(Log.getStackTraceString(paramThrowable));
    localArrayList.add(localStringBuilder.toString());
    return localArrayList;
  }
  
  public static abstract interface a
  {
    public abstract Boolean a(String paramString, Long paramLong);
    
    public abstract Map b(String paramString, List paramList);
    
    public abstract Boolean c(String paramString1, String paramString2);
    
    public abstract Boolean d(String paramString, List paramList);
    
    public abstract Boolean e(String paramString, List paramList);
    
    public abstract Boolean f(String paramString, Boolean paramBoolean);
    
    public abstract Boolean g(String paramString, Double paramDouble);
    
    public abstract Boolean remove(String paramString);
  }
}

/* Location:
 * Qualified Name:     R5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */