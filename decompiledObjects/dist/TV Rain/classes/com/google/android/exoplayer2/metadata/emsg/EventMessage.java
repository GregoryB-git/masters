package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import z2;

public final class EventMessage
  implements Metadata.Entry
{
  public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator()
  {
    public EventMessage createFromParcel(Parcel paramAnonymousParcel)
    {
      return new EventMessage(paramAnonymousParcel);
    }
    
    public EventMessage[] newArray(int paramAnonymousInt)
    {
      return new EventMessage[paramAnonymousInt];
    }
  };
  public final long durationMs;
  private int hashCode;
  public final long id;
  public final byte[] messageData;
  public final long presentationTimeUs;
  public final String schemeIdUri;
  public final String value;
  
  public EventMessage(Parcel paramParcel)
  {
    schemeIdUri = ((String)Util.castNonNull(paramParcel.readString()));
    value = ((String)Util.castNonNull(paramParcel.readString()));
    presentationTimeUs = paramParcel.readLong();
    durationMs = paramParcel.readLong();
    id = paramParcel.readLong();
    messageData = ((byte[])Util.castNonNull(paramParcel.createByteArray()));
  }
  
  public EventMessage(String paramString1, String paramString2, long paramLong1, long paramLong2, byte[] paramArrayOfByte, long paramLong3)
  {
    schemeIdUri = paramString1;
    value = paramString2;
    durationMs = paramLong1;
    id = paramLong2;
    messageData = paramArrayOfByte;
    presentationTimeUs = paramLong3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (EventMessage.class == paramObject.getClass()))
    {
      paramObject = (EventMessage)paramObject;
      if ((presentationTimeUs != presentationTimeUs) || (durationMs != durationMs) || (id != id) || (!Util.areEqual(schemeIdUri, schemeIdUri)) || (!Util.areEqual(value, value)) || (!Arrays.equals(messageData, messageData))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      String str = schemeIdUri;
      int i = 0;
      int j;
      if (str != null) {
        j = str.hashCode();
      } else {
        j = 0;
      }
      str = value;
      if (str != null) {
        i = str.hashCode();
      }
      long l = presentationTimeUs;
      int k = (int)(l ^ l >>> 32);
      l = durationMs;
      int m = (int)(l ^ l >>> 32);
      l = id;
      int n = (int)(l ^ l >>> 32);
      hashCode = (Arrays.hashCode(messageData) + (((((527 + j) * 31 + i) * 31 + k) * 31 + m) * 31 + n) * 31);
    }
    return hashCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("EMSG: scheme=");
    localStringBuilder.append(schemeIdUri);
    localStringBuilder.append(", id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", value=");
    localStringBuilder.append(value);
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(schemeIdUri);
    paramParcel.writeString(value);
    paramParcel.writeLong(presentationTimeUs);
    paramParcel.writeLong(durationMs);
    paramParcel.writeLong(id);
    paramParcel.writeByteArray(messageData);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.EventMessage
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */