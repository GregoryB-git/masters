package androidx.core.os;

import android.os.UserHandle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@RequiresApi(17)
public class UserHandleCompat
{
  @Nullable
  private static Method sGetUserIdMethod;
  @Nullable
  private static Constructor<UserHandle> sUserHandleConstructor;
  
  private static Method getGetUserIdMethod()
    throws NoSuchMethodException
  {
    if (sGetUserIdMethod == null)
    {
      Method localMethod = UserHandle.class.getDeclaredMethod("getUserId", new Class[] { Integer.TYPE });
      sGetUserIdMethod = localMethod;
      localMethod.setAccessible(true);
    }
    return sGetUserIdMethod;
  }
  
  private static Constructor<UserHandle> getUserHandleConstructor()
    throws NoSuchMethodException
  {
    if (sUserHandleConstructor == null)
    {
      Constructor localConstructor = UserHandle.class.getDeclaredConstructor(new Class[] { Integer.TYPE });
      sUserHandleConstructor = localConstructor;
      localConstructor.setAccessible(true);
    }
    return sUserHandleConstructor;
  }
  
  @NonNull
  public static UserHandle getUserHandleForUid(int paramInt)
  {
    return Api24Impl.getUserHandleForUid(paramInt);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @NonNull
    public static UserHandle getUserHandleForUid(int paramInt)
    {
      return UserHandle.getUserHandleForUid(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.UserHandleCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */