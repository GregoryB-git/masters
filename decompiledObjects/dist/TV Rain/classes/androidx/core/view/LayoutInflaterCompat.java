package androidx.core.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import z2;

public final class LayoutInflaterCompat
{
  private static final String TAG = "LayoutInflaterCompatHC";
  private static boolean sCheckedField;
  private static Field sLayoutInflaterFactory2Field;
  
  private static void forceSetFactory2(LayoutInflater paramLayoutInflater, LayoutInflater.Factory2 paramFactory2)
  {
    if (!sCheckedField)
    {
      try
      {
        Field localField1 = LayoutInflater.class.getDeclaredField("mFactory2");
        sLayoutInflaterFactory2Field = localField1;
        localField1.setAccessible(true);
      }
      catch (NoSuchFieldException localNoSuchFieldException)
      {
        StringBuilder localStringBuilder = z2.t("forceSetFactory2 Could not find field 'mFactory2' on class ");
        localStringBuilder.append(LayoutInflater.class.getName());
        localStringBuilder.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", localStringBuilder.toString(), localNoSuchFieldException);
      }
      sCheckedField = true;
    }
    Field localField2 = sLayoutInflaterFactory2Field;
    if (localField2 != null) {
      try
      {
        localField2.set(paramLayoutInflater, paramFactory2);
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        paramFactory2 = new StringBuilder();
        paramFactory2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
        paramFactory2.append(paramLayoutInflater);
        paramFactory2.append("; inflation may have unexpected results.");
        Log.e("LayoutInflaterCompatHC", paramFactory2.toString(), localIllegalAccessException);
      }
    }
  }
  
  @Deprecated
  public static LayoutInflaterFactory getFactory(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.getFactory();
    if ((paramLayoutInflater instanceof Factory2Wrapper)) {
      return mDelegateFactory;
    }
    return null;
  }
  
  @Deprecated
  public static void setFactory(@NonNull LayoutInflater paramLayoutInflater, @NonNull LayoutInflaterFactory paramLayoutInflaterFactory)
  {
    paramLayoutInflater.setFactory2(new Factory2Wrapper(paramLayoutInflaterFactory));
  }
  
  public static void setFactory2(@NonNull LayoutInflater paramLayoutInflater, @NonNull LayoutInflater.Factory2 paramFactory2)
  {
    paramLayoutInflater.setFactory2(paramFactory2);
  }
  
  public static class Factory2Wrapper
    implements LayoutInflater.Factory2
  {
    public final LayoutInflaterFactory mDelegateFactory;
    
    public Factory2Wrapper(LayoutInflaterFactory paramLayoutInflaterFactory)
    {
      mDelegateFactory = paramLayoutInflaterFactory;
    }
    
    public View onCreateView(View paramView, String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return mDelegateFactory.onCreateView(paramView, paramString, paramContext, paramAttributeSet);
    }
    
    public View onCreateView(String paramString, Context paramContext, AttributeSet paramAttributeSet)
    {
      return mDelegateFactory.onCreateView(null, paramString, paramContext, paramAttributeSet);
    }
    
    @NonNull
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(getClass().getName());
      localStringBuilder.append("{");
      localStringBuilder.append(mDelegateFactory);
      localStringBuilder.append("}");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.view.LayoutInflaterCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */