package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.ParsableByteArray;

public final class PrivateCommand
  extends SpliceCommand
{
  public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator()
  {
    public PrivateCommand createFromParcel(Parcel paramAnonymousParcel)
    {
      return new PrivateCommand(paramAnonymousParcel, null);
    }
    
    public PrivateCommand[] newArray(int paramAnonymousInt)
    {
      return new PrivateCommand[paramAnonymousInt];
    }
  };
  public final byte[] commandBytes;
  public final long identifier;
  public final long ptsAdjustment;
  
  private PrivateCommand(long paramLong1, byte[] paramArrayOfByte, long paramLong2)
  {
    ptsAdjustment = paramLong2;
    identifier = paramLong1;
    commandBytes = paramArrayOfByte;
  }
  
  private PrivateCommand(Parcel paramParcel)
  {
    ptsAdjustment = paramParcel.readLong();
    identifier = paramParcel.readLong();
    byte[] arrayOfByte = new byte[paramParcel.readInt()];
    commandBytes = arrayOfByte;
    paramParcel.readByteArray(arrayOfByte);
  }
  
  public static PrivateCommand parseFromSection(ParsableByteArray paramParsableByteArray, int paramInt, long paramLong)
  {
    long l = paramParsableByteArray.readUnsignedInt();
    paramInt -= 4;
    byte[] arrayOfByte = new byte[paramInt];
    paramParsableByteArray.readBytes(arrayOfByte, 0, paramInt);
    return new PrivateCommand(l, arrayOfByte, paramLong);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(ptsAdjustment);
    paramParcel.writeLong(identifier);
    paramParcel.writeInt(commandBytes.length);
    paramParcel.writeByteArray(commandBytes);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.PrivateCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */