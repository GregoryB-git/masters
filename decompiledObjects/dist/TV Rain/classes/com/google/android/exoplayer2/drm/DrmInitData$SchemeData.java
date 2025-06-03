package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.UUID;
import z2;

public final class DrmInitData$SchemeData
  implements Parcelable
{
  public static final Parcelable.Creator<SchemeData> CREATOR = new Parcelable.Creator()
  {
    public DrmInitData.SchemeData createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DrmInitData.SchemeData(paramAnonymousParcel);
    }
    
    public DrmInitData.SchemeData[] newArray(int paramAnonymousInt)
    {
      return new DrmInitData.SchemeData[paramAnonymousInt];
    }
  };
  public final byte[] data;
  private int hashCode;
  @Nullable
  public final String licenseServerUrl;
  public final String mimeType;
  public final boolean requiresSecureDecryption;
  private final UUID uuid;
  
  public DrmInitData$SchemeData(Parcel paramParcel)
  {
    uuid = new UUID(paramParcel.readLong(), paramParcel.readLong());
    licenseServerUrl = paramParcel.readString();
    mimeType = paramParcel.readString();
    data = paramParcel.createByteArray();
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    requiresSecureDecryption = bool;
  }
  
  public DrmInitData$SchemeData(UUID paramUUID, @Nullable String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    uuid = ((UUID)Assertions.checkNotNull(paramUUID));
    licenseServerUrl = paramString1;
    mimeType = ((String)Assertions.checkNotNull(paramString2));
    data = paramArrayOfByte;
    requiresSecureDecryption = paramBoolean;
  }
  
  public DrmInitData$SchemeData(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
  {
    this(paramUUID, paramString, paramArrayOfByte, false);
  }
  
  public DrmInitData$SchemeData(UUID paramUUID, String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    this(paramUUID, null, paramString, paramArrayOfByte, paramBoolean);
  }
  
  public boolean canReplace(SchemeData paramSchemeData)
  {
    boolean bool;
    if ((hasData()) && (!paramSchemeData.hasData()) && (matches(uuid))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public SchemeData copyWithData(@Nullable byte[] paramArrayOfByte)
  {
    return new SchemeData(uuid, licenseServerUrl, mimeType, paramArrayOfByte, requiresSecureDecryption);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool1 = paramObject instanceof SchemeData;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (paramObject == this) {
      return true;
    }
    paramObject = (SchemeData)paramObject;
    bool1 = bool2;
    if (Util.areEqual(licenseServerUrl, licenseServerUrl))
    {
      bool1 = bool2;
      if (Util.areEqual(mimeType, mimeType))
      {
        bool1 = bool2;
        if (Util.areEqual(uuid, uuid))
        {
          bool1 = bool2;
          if (Arrays.equals(data, data)) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public boolean hasData()
  {
    boolean bool;
    if (data != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      int i = uuid.hashCode();
      String str = licenseServerUrl;
      if (str == null) {
        j = 0;
      } else {
        j = str.hashCode();
      }
      int j = z2.c(mimeType, (i * 31 + j) * 31, 31);
      hashCode = (Arrays.hashCode(data) + j);
    }
    return hashCode;
  }
  
  public boolean matches(UUID paramUUID)
  {
    boolean bool;
    if ((!C.UUID_NIL.equals(uuid)) && (!paramUUID.equals(uuid))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(uuid.getMostSignificantBits());
    paramParcel.writeLong(uuid.getLeastSignificantBits());
    paramParcel.writeString(licenseServerUrl);
    paramParcel.writeString(mimeType);
    paramParcel.writeByteArray(data);
    paramParcel.writeByte((byte)requiresSecureDecryption);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmInitData.SchemeData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */