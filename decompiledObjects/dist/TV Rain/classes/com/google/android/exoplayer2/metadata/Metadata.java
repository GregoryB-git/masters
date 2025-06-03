package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.List;

public final class Metadata
  implements Parcelable
{
  public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator()
  {
    public Metadata createFromParcel(Parcel paramAnonymousParcel)
    {
      return new Metadata(paramAnonymousParcel);
    }
    
    public Metadata[] newArray(int paramAnonymousInt)
    {
      return new Metadata[0];
    }
  };
  private final Entry[] entries;
  
  public Metadata(Parcel paramParcel)
  {
    entries = new Entry[paramParcel.readInt()];
    for (int i = 0;; i++)
    {
      Entry[] arrayOfEntry = entries;
      if (i >= arrayOfEntry.length) {
        break;
      }
      arrayOfEntry[i] = ((Entry)paramParcel.readParcelable(Entry.class.getClassLoader()));
    }
  }
  
  public Metadata(List<? extends Entry> paramList)
  {
    if (paramList != null)
    {
      Entry[] arrayOfEntry = new Entry[paramList.size()];
      entries = arrayOfEntry;
      paramList.toArray(arrayOfEntry);
    }
    else
    {
      entries = new Entry[0];
    }
  }
  
  public Metadata(Entry... paramVarArgs)
  {
    Entry[] arrayOfEntry = paramVarArgs;
    if (paramVarArgs == null) {
      arrayOfEntry = new Entry[0];
    }
    entries = arrayOfEntry;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Metadata.class == paramObject.getClass()))
    {
      paramObject = (Metadata)paramObject;
      return Arrays.equals(entries, entries);
    }
    return false;
  }
  
  public Entry get(int paramInt)
  {
    return entries[paramInt];
  }
  
  public int hashCode()
  {
    return Arrays.hashCode(entries);
  }
  
  public int length()
  {
    return entries.length;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(entries.length);
    Entry[] arrayOfEntry = entries;
    int i = arrayOfEntry.length;
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeParcelable(arrayOfEntry[paramInt], 0);
    }
  }
  
  public static abstract interface Entry
    extends Parcelable
  {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.Metadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */