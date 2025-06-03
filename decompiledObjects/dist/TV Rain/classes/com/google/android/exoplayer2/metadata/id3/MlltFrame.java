package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import java.util.Arrays;

public final class MlltFrame
  extends Id3Frame
{
  public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator()
  {
    public MlltFrame createFromParcel(Parcel paramAnonymousParcel)
    {
      return new MlltFrame(paramAnonymousParcel);
    }
    
    public MlltFrame[] newArray(int paramAnonymousInt)
    {
      return new MlltFrame[paramAnonymousInt];
    }
  };
  public static final String ID = "MLLT";
  public final int bytesBetweenReference;
  public final int[] bytesDeviations;
  public final int millisecondsBetweenReference;
  public final int[] millisecondsDeviations;
  public final int mpegFramesBetweenReference;
  
  public MlltFrame(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    super("MLLT");
    mpegFramesBetweenReference = paramInt1;
    bytesBetweenReference = paramInt2;
    millisecondsBetweenReference = paramInt3;
    bytesDeviations = paramArrayOfInt1;
    millisecondsDeviations = paramArrayOfInt2;
  }
  
  public MlltFrame(Parcel paramParcel)
  {
    super("MLLT");
    mpegFramesBetweenReference = paramParcel.readInt();
    bytesBetweenReference = paramParcel.readInt();
    millisecondsBetweenReference = paramParcel.readInt();
    bytesDeviations = paramParcel.createIntArray();
    millisecondsDeviations = paramParcel.createIntArray();
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
    if ((paramObject != null) && (MlltFrame.class == paramObject.getClass()))
    {
      paramObject = (MlltFrame)paramObject;
      if ((mpegFramesBetweenReference != mpegFramesBetweenReference) || (bytesBetweenReference != bytesBetweenReference) || (millisecondsBetweenReference != millisecondsBetweenReference) || (!Arrays.equals(bytesDeviations, bytesDeviations)) || (!Arrays.equals(millisecondsDeviations, millisecondsDeviations))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int hashCode()
  {
    int i = mpegFramesBetweenReference;
    int j = bytesBetweenReference;
    int k = millisecondsBetweenReference;
    int m = Arrays.hashCode(bytesDeviations);
    return Arrays.hashCode(millisecondsDeviations) + (m + (((527 + i) * 31 + j) * 31 + k) * 31) * 31;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(mpegFramesBetweenReference);
    paramParcel.writeInt(bytesBetweenReference);
    paramParcel.writeInt(millisecondsBetweenReference);
    paramParcel.writeIntArray(bytesDeviations);
    paramParcel.writeIntArray(millisecondsDeviations);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.id3.MlltFrame
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */