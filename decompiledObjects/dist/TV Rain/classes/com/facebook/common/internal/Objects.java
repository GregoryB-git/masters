package com.facebook.common.internal;

import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

public final class Objects
{
  @CheckReturnValue
  public static boolean equal(@Nullable Object paramObject1, @Nullable Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static <T> T firstNonNull(@Nullable T paramT1, @Nullable T paramT2)
  {
    if (paramT1 == null) {
      paramT1 = Preconditions.checkNotNull(paramT2);
    }
    return paramT1;
  }
  
  public static int hashCode(@Nullable Object... paramVarArgs)
  {
    return Arrays.hashCode(paramVarArgs);
  }
  
  private static String simpleName(Class<?> paramClass)
  {
    paramClass = paramClass.getName().replaceAll("\\$[0-9]+", "\\$");
    int i = paramClass.lastIndexOf('$');
    int j = i;
    if (i == -1) {
      j = paramClass.lastIndexOf('.');
    }
    return paramClass.substring(j + 1);
  }
  
  public static ToStringHelper toStringHelper(Class<?> paramClass)
  {
    return new ToStringHelper(simpleName(paramClass), null);
  }
  
  public static ToStringHelper toStringHelper(Object paramObject)
  {
    return new ToStringHelper(simpleName(paramObject.getClass()), null);
  }
  
  public static ToStringHelper toStringHelper(String paramString)
  {
    return new ToStringHelper(paramString, null);
  }
  
  public static final class ToStringHelper
  {
    private final String className;
    private ValueHolder holderHead;
    private ValueHolder holderTail;
    private boolean omitNullValues;
    
    private ToStringHelper(String paramString)
    {
      ValueHolder localValueHolder = new ValueHolder(null);
      holderHead = localValueHolder;
      holderTail = localValueHolder;
      omitNullValues = false;
      className = ((String)Preconditions.checkNotNull(paramString));
    }
    
    private ValueHolder addHolder()
    {
      ValueHolder localValueHolder = new ValueHolder(null);
      holderTail.next = localValueHolder;
      holderTail = localValueHolder;
      return localValueHolder;
    }
    
    private ToStringHelper addHolder(@Nullable Object paramObject)
    {
      addHoldervalue = paramObject;
      return this;
    }
    
    private ToStringHelper addHolder(String paramString, @Nullable Object paramObject)
    {
      ValueHolder localValueHolder = addHolder();
      value = paramObject;
      name = ((String)Preconditions.checkNotNull(paramString));
      return this;
    }
    
    public ToStringHelper add(String paramString, char paramChar)
    {
      return addHolder(paramString, String.valueOf(paramChar));
    }
    
    public ToStringHelper add(String paramString, double paramDouble)
    {
      return addHolder(paramString, String.valueOf(paramDouble));
    }
    
    public ToStringHelper add(String paramString, float paramFloat)
    {
      return addHolder(paramString, String.valueOf(paramFloat));
    }
    
    public ToStringHelper add(String paramString, int paramInt)
    {
      return addHolder(paramString, String.valueOf(paramInt));
    }
    
    public ToStringHelper add(String paramString, long paramLong)
    {
      return addHolder(paramString, String.valueOf(paramLong));
    }
    
    public ToStringHelper add(String paramString, @Nullable Object paramObject)
    {
      return addHolder(paramString, paramObject);
    }
    
    public ToStringHelper add(String paramString, boolean paramBoolean)
    {
      return addHolder(paramString, String.valueOf(paramBoolean));
    }
    
    public ToStringHelper addValue(char paramChar)
    {
      return addHolder(String.valueOf(paramChar));
    }
    
    public ToStringHelper addValue(double paramDouble)
    {
      return addHolder(String.valueOf(paramDouble));
    }
    
    public ToStringHelper addValue(float paramFloat)
    {
      return addHolder(String.valueOf(paramFloat));
    }
    
    public ToStringHelper addValue(int paramInt)
    {
      return addHolder(String.valueOf(paramInt));
    }
    
    public ToStringHelper addValue(long paramLong)
    {
      return addHolder(String.valueOf(paramLong));
    }
    
    public ToStringHelper addValue(@Nullable Object paramObject)
    {
      return addHolder(paramObject);
    }
    
    public ToStringHelper addValue(boolean paramBoolean)
    {
      return addHolder(String.valueOf(paramBoolean));
    }
    
    public ToStringHelper omitNullValues()
    {
      omitNullValues = true;
      return this;
    }
    
    public String toString()
    {
      boolean bool = omitNullValues;
      StringBuilder localStringBuilder = new StringBuilder(32);
      localStringBuilder.append(className);
      localStringBuilder.append('{');
      ValueHolder localValueHolder = holderHead.next;
      Object localObject2;
      for (Object localObject1 = ""; localValueHolder != null; localObject1 = localObject2)
      {
        if (bool)
        {
          localObject2 = localObject1;
          if (value == null) {}
        }
        else
        {
          localStringBuilder.append((String)localObject1);
          localObject2 = name;
          if (localObject2 != null)
          {
            localStringBuilder.append((String)localObject2);
            localStringBuilder.append('=');
          }
          localStringBuilder.append(value);
          localObject2 = ", ";
        }
        localValueHolder = next;
      }
      localStringBuilder.append('}');
      return localStringBuilder.toString();
    }
    
    public static final class ValueHolder
    {
      @Nullable
      public String name;
      public ValueHolder next;
      @Nullable
      public Object value;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.internal.Objects
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */