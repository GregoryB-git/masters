package S5;

import E5.p;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public abstract class a
{
  public static ArrayList a(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof a))
    {
      paramThrowable = (a)paramThrowable;
      localArrayList.add(o);
      localArrayList.add(paramThrowable.getMessage());
    }
    StringBuilder localStringBuilder;
    for (paramThrowable = p;; paramThrowable = localStringBuilder.toString())
    {
      localArrayList.add(paramThrowable);
      break;
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
    }
    return localArrayList;
  }
  
  public static class a
    extends RuntimeException
  {
    public final String o;
    public final Object p;
    
    public a(String paramString1, String paramString2, Object paramObject)
    {
      super();
      o = paramString1;
      p = paramObject;
    }
  }
  
  public static abstract interface b
  {
    public abstract Boolean a(String paramString);
    
    public abstract Boolean b(String paramString, Boolean paramBoolean, a.d paramd);
    
    public abstract void c();
    
    public abstract Boolean d(String paramString, Map paramMap);
    
    public abstract Boolean e();
  }
  
  public static class c
    extends p
  {
    public static final c d = new c();
    
    public Object g(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE) {
        return super.g(paramByte, paramByteBuffer);
      }
      return a.d.a((ArrayList)f(paramByteBuffer));
    }
    
    public void p(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof a.d))
      {
        paramByteArrayOutputStream.write(128);
        p(paramByteArrayOutputStream, ((a.d)paramObject).h());
      }
      else
      {
        super.p(paramByteArrayOutputStream, paramObject);
      }
    }
  }
  
  public static final class d
  {
    public Boolean a;
    public Boolean b;
    public Map c;
    
    public static d a(ArrayList paramArrayList)
    {
      d locald = new d();
      locald.f((Boolean)paramArrayList.get(0));
      locald.e((Boolean)paramArrayList.get(1));
      locald.g((Map)paramArrayList.get(2));
      return locald;
    }
    
    public Boolean b()
    {
      return b;
    }
    
    public Boolean c()
    {
      return a;
    }
    
    public Map d()
    {
      return c;
    }
    
    public void e(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        b = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
    }
    
    public void f(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        a = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
    }
    
    public void g(Map paramMap)
    {
      if (paramMap != null)
      {
        c = paramMap;
        return;
      }
      throw new IllegalStateException("Nonnull field \"headers\" is null.");
    }
    
    public ArrayList h()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(a);
      localArrayList.add(b);
      localArrayList.add(c);
      return localArrayList;
    }
  }
}

/* Location:
 * Qualified Name:     S5.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */