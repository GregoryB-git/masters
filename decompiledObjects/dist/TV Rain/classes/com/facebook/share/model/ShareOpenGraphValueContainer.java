package com.facebook.share.model;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends Builder>
  implements ShareModel
{
  private final Bundle bundle;
  
  public ShareOpenGraphValueContainer(Parcel paramParcel)
  {
    bundle = paramParcel.readBundle(Builder.class.getClassLoader());
  }
  
  public ShareOpenGraphValueContainer(Builder<P, E> paramBuilder)
  {
    bundle = ((Bundle)Builder.access$000(paramBuilder).clone());
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  @Nullable
  public Object get(String paramString)
  {
    return bundle.get(paramString);
  }
  
  public boolean getBoolean(String paramString, boolean paramBoolean)
  {
    return bundle.getBoolean(paramString, paramBoolean);
  }
  
  @Nullable
  public boolean[] getBooleanArray(String paramString)
  {
    return bundle.getBooleanArray(paramString);
  }
  
  public Bundle getBundle()
  {
    return (Bundle)bundle.clone();
  }
  
  public double getDouble(String paramString, double paramDouble)
  {
    return bundle.getDouble(paramString, paramDouble);
  }
  
  @Nullable
  public double[] getDoubleArray(String paramString)
  {
    return bundle.getDoubleArray(paramString);
  }
  
  public int getInt(String paramString, int paramInt)
  {
    return bundle.getInt(paramString, paramInt);
  }
  
  @Nullable
  public int[] getIntArray(String paramString)
  {
    return bundle.getIntArray(paramString);
  }
  
  public long getLong(String paramString, long paramLong)
  {
    return bundle.getLong(paramString, paramLong);
  }
  
  @Nullable
  public long[] getLongArray(String paramString)
  {
    return bundle.getLongArray(paramString);
  }
  
  public ShareOpenGraphObject getObject(String paramString)
  {
    paramString = bundle.get(paramString);
    if ((paramString instanceof ShareOpenGraphObject)) {
      paramString = (ShareOpenGraphObject)paramString;
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  @Nullable
  public ArrayList<ShareOpenGraphObject> getObjectArrayList(String paramString)
  {
    Object localObject = bundle.getParcelableArrayList(paramString);
    if (localObject == null) {
      return null;
    }
    paramString = new ArrayList();
    Iterator localIterator = ((ArrayList)localObject).iterator();
    while (localIterator.hasNext())
    {
      localObject = (Parcelable)localIterator.next();
      if ((localObject instanceof ShareOpenGraphObject)) {
        paramString.add((ShareOpenGraphObject)localObject);
      }
    }
    return paramString;
  }
  
  @Nullable
  public SharePhoto getPhoto(String paramString)
  {
    paramString = bundle.getParcelable(paramString);
    if ((paramString instanceof SharePhoto)) {
      paramString = (SharePhoto)paramString;
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  @Nullable
  public ArrayList<SharePhoto> getPhotoArrayList(String paramString)
  {
    Object localObject = bundle.getParcelableArrayList(paramString);
    if (localObject == null) {
      return null;
    }
    paramString = new ArrayList();
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      Parcelable localParcelable = (Parcelable)((Iterator)localObject).next();
      if ((localParcelable instanceof SharePhoto)) {
        paramString.add((SharePhoto)localParcelable);
      }
    }
    return paramString;
  }
  
  @Nullable
  public String getString(String paramString)
  {
    return bundle.getString(paramString);
  }
  
  @Nullable
  public ArrayList<String> getStringArrayList(String paramString)
  {
    return bundle.getStringArrayList(paramString);
  }
  
  public Set<String> keySet()
  {
    return bundle.keySet();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBundle(bundle);
  }
  
  public static abstract class Builder<P extends ShareOpenGraphValueContainer, E extends Builder>
    implements ShareModelBuilder<P, E>
  {
    private Bundle bundle = new Bundle();
    
    public E putBoolean(String paramString, boolean paramBoolean)
    {
      bundle.putBoolean(paramString, paramBoolean);
      return this;
    }
    
    public E putBooleanArray(String paramString, @Nullable boolean[] paramArrayOfBoolean)
    {
      bundle.putBooleanArray(paramString, paramArrayOfBoolean);
      return this;
    }
    
    public E putDouble(String paramString, double paramDouble)
    {
      bundle.putDouble(paramString, paramDouble);
      return this;
    }
    
    public E putDoubleArray(String paramString, @Nullable double[] paramArrayOfDouble)
    {
      bundle.putDoubleArray(paramString, paramArrayOfDouble);
      return this;
    }
    
    public E putInt(String paramString, int paramInt)
    {
      bundle.putInt(paramString, paramInt);
      return this;
    }
    
    public E putIntArray(String paramString, @Nullable int[] paramArrayOfInt)
    {
      bundle.putIntArray(paramString, paramArrayOfInt);
      return this;
    }
    
    public E putLong(String paramString, long paramLong)
    {
      bundle.putLong(paramString, paramLong);
      return this;
    }
    
    public E putLongArray(String paramString, @Nullable long[] paramArrayOfLong)
    {
      bundle.putLongArray(paramString, paramArrayOfLong);
      return this;
    }
    
    public E putObject(String paramString, @Nullable ShareOpenGraphObject paramShareOpenGraphObject)
    {
      bundle.putParcelable(paramString, paramShareOpenGraphObject);
      return this;
    }
    
    public E putObjectArrayList(String paramString, @Nullable ArrayList<ShareOpenGraphObject> paramArrayList)
    {
      bundle.putParcelableArrayList(paramString, paramArrayList);
      return this;
    }
    
    public E putPhoto(String paramString, @Nullable SharePhoto paramSharePhoto)
    {
      bundle.putParcelable(paramString, paramSharePhoto);
      return this;
    }
    
    public E putPhotoArrayList(String paramString, @Nullable ArrayList<SharePhoto> paramArrayList)
    {
      bundle.putParcelableArrayList(paramString, paramArrayList);
      return this;
    }
    
    public E putString(String paramString1, @Nullable String paramString2)
    {
      bundle.putString(paramString1, paramString2);
      return this;
    }
    
    public E putStringArrayList(String paramString, @Nullable ArrayList<String> paramArrayList)
    {
      bundle.putStringArrayList(paramString, paramArrayList);
      return this;
    }
    
    public E readFrom(P paramP)
    {
      if (paramP != null) {
        bundle.putAll(paramP.getBundle());
      }
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.share.model.ShareOpenGraphValueContainer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */