package androidx.work;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class Data$Builder
{
  private Map<String, Object> mValues = new HashMap();
  
  @NonNull
  public Data build()
  {
    Data localData = new Data(mValues);
    Data.toByteArrayInternal(localData);
    return localData;
  }
  
  @NonNull
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
  public Builder put(@NonNull String paramString, @Nullable Object paramObject)
  {
    if (paramObject == null)
    {
      mValues.put(paramString, null);
    }
    else
    {
      Class localClass = paramObject.getClass();
      if ((localClass != Boolean.class) && (localClass != Byte.class) && (localClass != Integer.class) && (localClass != Long.class) && (localClass != Float.class) && (localClass != Double.class) && (localClass != String.class) && (localClass != Boolean[].class) && (localClass != Byte[].class) && (localClass != Integer[].class) && (localClass != Long[].class) && (localClass != Float[].class) && (localClass != Double[].class) && (localClass != String[].class))
      {
        if (localClass == boolean[].class) {
          mValues.put(paramString, Data.convertPrimitiveBooleanArray((boolean[])paramObject));
        } else if (localClass == byte[].class) {
          mValues.put(paramString, Data.convertPrimitiveByteArray((byte[])paramObject));
        } else if (localClass == int[].class) {
          mValues.put(paramString, Data.convertPrimitiveIntArray((int[])paramObject));
        } else if (localClass == long[].class) {
          mValues.put(paramString, Data.convertPrimitiveLongArray((long[])paramObject));
        } else if (localClass == float[].class) {
          mValues.put(paramString, Data.convertPrimitiveFloatArray((float[])paramObject));
        } else if (localClass == double[].class) {
          mValues.put(paramString, Data.convertPrimitiveDoubleArray((double[])paramObject));
        } else {
          throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[] { paramString, localClass }));
        }
      }
      else {
        mValues.put(paramString, paramObject);
      }
    }
    return this;
  }
  
  @NonNull
  public Builder putAll(@NonNull Data paramData)
  {
    putAll(mValues);
    return this;
  }
  
  @NonNull
  public Builder putAll(@NonNull Map<String, Object> paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      put((String)localEntry.getKey(), localEntry.getValue());
    }
    return this;
  }
  
  @NonNull
  public Builder putBoolean(@NonNull String paramString, boolean paramBoolean)
  {
    mValues.put(paramString, Boolean.valueOf(paramBoolean));
    return this;
  }
  
  @NonNull
  public Builder putBooleanArray(@NonNull String paramString, @NonNull boolean[] paramArrayOfBoolean)
  {
    mValues.put(paramString, Data.convertPrimitiveBooleanArray(paramArrayOfBoolean));
    return this;
  }
  
  @NonNull
  public Builder putByte(@NonNull String paramString, byte paramByte)
  {
    mValues.put(paramString, Byte.valueOf(paramByte));
    return this;
  }
  
  @NonNull
  public Builder putByteArray(@NonNull String paramString, @NonNull byte[] paramArrayOfByte)
  {
    mValues.put(paramString, Data.convertPrimitiveByteArray(paramArrayOfByte));
    return this;
  }
  
  @NonNull
  public Builder putDouble(@NonNull String paramString, double paramDouble)
  {
    mValues.put(paramString, Double.valueOf(paramDouble));
    return this;
  }
  
  @NonNull
  public Builder putDoubleArray(@NonNull String paramString, @NonNull double[] paramArrayOfDouble)
  {
    mValues.put(paramString, Data.convertPrimitiveDoubleArray(paramArrayOfDouble));
    return this;
  }
  
  @NonNull
  public Builder putFloat(@NonNull String paramString, float paramFloat)
  {
    mValues.put(paramString, Float.valueOf(paramFloat));
    return this;
  }
  
  @NonNull
  public Builder putFloatArray(@NonNull String paramString, @NonNull float[] paramArrayOfFloat)
  {
    mValues.put(paramString, Data.convertPrimitiveFloatArray(paramArrayOfFloat));
    return this;
  }
  
  @NonNull
  public Builder putInt(@NonNull String paramString, int paramInt)
  {
    mValues.put(paramString, Integer.valueOf(paramInt));
    return this;
  }
  
  @NonNull
  public Builder putIntArray(@NonNull String paramString, @NonNull int[] paramArrayOfInt)
  {
    mValues.put(paramString, Data.convertPrimitiveIntArray(paramArrayOfInt));
    return this;
  }
  
  @NonNull
  public Builder putLong(@NonNull String paramString, long paramLong)
  {
    mValues.put(paramString, Long.valueOf(paramLong));
    return this;
  }
  
  @NonNull
  public Builder putLongArray(@NonNull String paramString, @NonNull long[] paramArrayOfLong)
  {
    mValues.put(paramString, Data.convertPrimitiveLongArray(paramArrayOfLong));
    return this;
  }
  
  @NonNull
  public Builder putString(@NonNull String paramString1, @Nullable String paramString2)
  {
    mValues.put(paramString1, paramString2);
    return this;
  }
  
  @NonNull
  public Builder putStringArray(@NonNull String paramString, @NonNull String[] paramArrayOfString)
  {
    mValues.put(paramString, paramArrayOfString);
    return this;
  }
}

/* Location:
 * Qualified Name:     androidx.work.Data.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */