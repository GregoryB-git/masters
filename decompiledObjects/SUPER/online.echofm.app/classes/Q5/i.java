package Q5;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class i
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
    public abstract String a();
    
    public abstract String b();
    
    public abstract String c();
    
    public abstract List d();
    
    public abstract String e();
    
    public abstract List f(i.b paramb);
    
    public abstract String g();
  }
  
  public static enum b
  {
    public final int o;
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
  }
}

/* Location:
 * Qualified Name:     Q5.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */