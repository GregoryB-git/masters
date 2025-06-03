package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import z2;

public final class DrmInitData
  implements Comparator<SchemeData>, Parcelable
{
  public static final Parcelable.Creator<DrmInitData> CREATOR = new Parcelable.Creator()
  {
    public DrmInitData createFromParcel(Parcel paramAnonymousParcel)
    {
      return new DrmInitData(paramAnonymousParcel);
    }
    
    public DrmInitData[] newArray(int paramAnonymousInt)
    {
      return new DrmInitData[paramAnonymousInt];
    }
  };
  private int hashCode;
  public final int schemeDataCount;
  private final SchemeData[] schemeDatas;
  @Nullable
  public final String schemeType;
  
  public DrmInitData(Parcel paramParcel)
  {
    schemeType = paramParcel.readString();
    paramParcel = (SchemeData[])paramParcel.createTypedArray(SchemeData.CREATOR);
    schemeDatas = paramParcel;
    schemeDataCount = paramParcel.length;
  }
  
  public DrmInitData(String paramString, List<SchemeData> paramList)
  {
    this(paramString, false, (SchemeData[])paramList.toArray(new SchemeData[paramList.size()]));
  }
  
  private DrmInitData(@Nullable String paramString, boolean paramBoolean, SchemeData... paramVarArgs)
  {
    schemeType = paramString;
    paramString = paramVarArgs;
    if (paramBoolean) {
      paramString = (SchemeData[])paramVarArgs.clone();
    }
    Arrays.sort(paramString, this);
    schemeDatas = paramString;
    schemeDataCount = paramString.length;
  }
  
  public DrmInitData(@Nullable String paramString, SchemeData... paramVarArgs)
  {
    this(paramString, true, paramVarArgs);
  }
  
  public DrmInitData(List<SchemeData> paramList)
  {
    this(null, false, (SchemeData[])paramList.toArray(new SchemeData[paramList.size()]));
  }
  
  public DrmInitData(SchemeData... paramVarArgs)
  {
    this(null, paramVarArgs);
  }
  
  private static boolean containsSchemeDataWithUuid(ArrayList<SchemeData> paramArrayList, int paramInt, UUID paramUUID)
  {
    for (int i = 0; i < paramInt; i++) {
      if (SchemeData.access$000((SchemeData)paramArrayList.get(i)).equals(paramUUID)) {
        return true;
      }
    }
    return false;
  }
  
  @Nullable
  public static DrmInitData createSessionCreationData(@Nullable DrmInitData paramDrmInitData1, @Nullable DrmInitData paramDrmInitData2)
  {
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    Object localObject1 = null;
    Object localObject2;
    int j;
    int k;
    if (paramDrmInitData1 != null)
    {
      localObject2 = schemeType;
      localObject3 = schemeDatas;
      j = localObject3.length;
      for (k = 0;; k++)
      {
        paramDrmInitData1 = (DrmInitData)localObject2;
        if (k >= j) {
          break;
        }
        paramDrmInitData1 = localObject3[k];
        if (paramDrmInitData1.hasData()) {
          localArrayList.add(paramDrmInitData1);
        }
      }
    }
    paramDrmInitData1 = null;
    Object localObject3 = paramDrmInitData1;
    if (paramDrmInitData2 != null)
    {
      localObject2 = paramDrmInitData1;
      if (paramDrmInitData1 == null) {
        localObject2 = schemeType;
      }
      j = localArrayList.size();
      paramDrmInitData1 = schemeDatas;
      int m = paramDrmInitData1.length;
      for (k = i;; k++)
      {
        localObject3 = localObject2;
        if (k >= m) {
          break;
        }
        paramDrmInitData2 = paramDrmInitData1[k];
        if ((paramDrmInitData2.hasData()) && (!containsSchemeDataWithUuid(localArrayList, j, SchemeData.access$000(paramDrmInitData2)))) {
          localArrayList.add(paramDrmInitData2);
        }
      }
    }
    if (localArrayList.isEmpty()) {
      paramDrmInitData1 = (DrmInitData)localObject1;
    } else {
      paramDrmInitData1 = new DrmInitData((String)localObject3, localArrayList);
    }
    return paramDrmInitData1;
  }
  
  public int compare(SchemeData paramSchemeData1, SchemeData paramSchemeData2)
  {
    UUID localUUID = C.UUID_NIL;
    int i;
    if (localUUID.equals(SchemeData.access$000(paramSchemeData1)))
    {
      if (localUUID.equals(SchemeData.access$000(paramSchemeData2))) {
        i = 0;
      } else {
        i = 1;
      }
    }
    else {
      i = SchemeData.access$000(paramSchemeData1).compareTo(SchemeData.access$000(paramSchemeData2));
    }
    return i;
  }
  
  public DrmInitData copyWithSchemeType(@Nullable String paramString)
  {
    if (Util.areEqual(schemeType, paramString)) {
      return this;
    }
    return new DrmInitData(paramString, false, schemeDatas);
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
    if ((paramObject != null) && (DrmInitData.class == paramObject.getClass()))
    {
      paramObject = (DrmInitData)paramObject;
      if ((!Util.areEqual(schemeType, schemeType)) || (!Arrays.equals(schemeDatas, schemeDatas))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public SchemeData get(int paramInt)
  {
    return schemeDatas[paramInt];
  }
  
  @Deprecated
  public SchemeData get(UUID paramUUID)
  {
    for (SchemeData localSchemeData : schemeDatas) {
      if (localSchemeData.matches(paramUUID)) {
        return localSchemeData;
      }
    }
    return null;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      String str = schemeType;
      int i;
      if (str == null) {
        i = 0;
      } else {
        i = str.hashCode();
      }
      hashCode = (i * 31 + Arrays.hashCode(schemeDatas));
    }
    return hashCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(schemeType);
    paramParcel.writeTypedArray(schemeDatas, 0);
  }
  
  public static final class SchemeData
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
    
    public SchemeData(Parcel paramParcel)
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
    
    public SchemeData(UUID paramUUID, @Nullable String paramString1, String paramString2, byte[] paramArrayOfByte, boolean paramBoolean)
    {
      uuid = ((UUID)Assertions.checkNotNull(paramUUID));
      licenseServerUrl = paramString1;
      mimeType = ((String)Assertions.checkNotNull(paramString2));
      data = paramArrayOfByte;
      requiresSecureDecryption = paramBoolean;
    }
    
    public SchemeData(UUID paramUUID, String paramString, byte[] paramArrayOfByte)
    {
      this(paramUUID, paramString, paramArrayOfByte, false);
    }
    
    public SchemeData(UUID paramUUID, String paramString, byte[] paramArrayOfByte, boolean paramBoolean)
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
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.drm.DrmInitData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */