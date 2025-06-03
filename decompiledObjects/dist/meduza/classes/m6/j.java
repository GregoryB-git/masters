package m6;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.base.zau;
import java.util.Objects;

public final class j
{
  public static void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(paramString);
  }
  
  public static void b(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void c(zau paramzau)
  {
    Object localObject = Looper.myLooper();
    if (localObject != paramzau.getLooper())
    {
      if (localObject != null) {
        localObject = ((Looper)localObject).getThread().getName();
      } else {
        localObject = "null current looper";
      }
      paramzau = paramzau.getLooper().getThread().getName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Must be called on ");
      localStringBuilder.append(paramzau);
      localStringBuilder.append(" thread, but got ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(".");
      throw new IllegalStateException(localStringBuilder.toString());
    }
  }
  
  public static void d(String paramString)
  {
    int i;
    if (Looper.getMainLooper() == Looper.myLooper()) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static void e(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      return;
    }
    throw new IllegalArgumentException("Given String is empty or null");
  }
  
  public static void f(String paramString1, String paramString2)
  {
    if (!TextUtils.isEmpty(paramString2)) {
      return;
    }
    throw new IllegalArgumentException(paramString1);
  }
  
  public static void g()
  {
    Looper localLooper = Looper.myLooper();
    if ((localLooper != null) && (Objects.equals(localLooper.getThread().getName(), "GoogleApiHandler"))) {
      throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
    }
  }
  
  public static void h(String paramString)
  {
    int i;
    if (Looper.getMainLooper() == Looper.myLooper()) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    throw new IllegalStateException(paramString);
  }
  
  public static void i(Object paramObject)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException("null reference");
  }
  
  public static void j(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return;
    }
    throw new NullPointerException(paramString);
  }
  
  public static void k(boolean paramBoolean, String paramString)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException(String.valueOf(paramString));
  }
}

/* Location:
 * Qualified Name:     m6.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */