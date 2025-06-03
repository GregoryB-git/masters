package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceInsertCommand
  extends SpliceCommand
{
  public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator()
  {
    public SpliceInsertCommand createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SpliceInsertCommand(paramAnonymousParcel, null);
    }
    
    public SpliceInsertCommand[] newArray(int paramAnonymousInt)
    {
      return new SpliceInsertCommand[paramAnonymousInt];
    }
  };
  public final boolean autoReturn;
  public final int availNum;
  public final int availsExpected;
  public final long breakDurationUs;
  public final List<ComponentSplice> componentSpliceList;
  public final boolean outOfNetworkIndicator;
  public final boolean programSpliceFlag;
  public final long programSplicePlaybackPositionUs;
  public final long programSplicePts;
  public final boolean spliceEventCancelIndicator;
  public final long spliceEventId;
  public final boolean spliceImmediateFlag;
  public final int uniqueProgramId;
  
  private SpliceInsertCommand(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, long paramLong2, long paramLong3, List<ComponentSplice> paramList, boolean paramBoolean5, long paramLong4, int paramInt1, int paramInt2, int paramInt3)
  {
    spliceEventId = paramLong1;
    spliceEventCancelIndicator = paramBoolean1;
    outOfNetworkIndicator = paramBoolean2;
    programSpliceFlag = paramBoolean3;
    spliceImmediateFlag = paramBoolean4;
    programSplicePts = paramLong2;
    programSplicePlaybackPositionUs = paramLong3;
    componentSpliceList = Collections.unmodifiableList(paramList);
    autoReturn = paramBoolean5;
    breakDurationUs = paramLong4;
    uniqueProgramId = paramInt1;
    availNum = paramInt2;
    availsExpected = paramInt3;
  }
  
  private SpliceInsertCommand(Parcel paramParcel)
  {
    spliceEventId = paramParcel.readLong();
    int i = paramParcel.readByte();
    boolean bool1 = false;
    if (i == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    spliceEventCancelIndicator = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    outOfNetworkIndicator = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    programSpliceFlag = bool2;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    spliceImmediateFlag = bool2;
    programSplicePts = paramParcel.readLong();
    programSplicePlaybackPositionUs = paramParcel.readLong();
    int j = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(j);
    for (i = 0; i < j; i++) {
      localArrayList.add(ComponentSplice.createFromParcel(paramParcel));
    }
    componentSpliceList = Collections.unmodifiableList(localArrayList);
    boolean bool2 = bool1;
    if (paramParcel.readByte() == 1) {
      bool2 = true;
    }
    autoReturn = bool2;
    breakDurationUs = paramParcel.readLong();
    uniqueProgramId = paramParcel.readInt();
    availNum = paramParcel.readInt();
    availsExpected = paramParcel.readInt();
  }
  
  public static SpliceInsertCommand parseFromSection(ParsableByteArray paramParsableByteArray, long paramLong, TimestampAdjuster paramTimestampAdjuster)
  {
    long l1 = paramParsableByteArray.readUnsignedInt();
    boolean bool1;
    if ((paramParsableByteArray.readUnsignedByte() & 0x80) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Object localObject = Collections.emptyList();
    int i;
    boolean bool2;
    boolean bool3;
    int j;
    boolean bool4;
    long l2;
    int k;
    boolean bool5;
    if (!bool1)
    {
      i = paramParsableByteArray.readUnsignedByte();
      if ((i & 0x80) != 0) {
        bool2 = true;
      } else {
        bool2 = false;
      }
      if ((i & 0x40) != 0) {
        bool3 = true;
      } else {
        bool3 = false;
      }
      if ((i & 0x20) != 0) {
        j = 1;
      } else {
        j = 0;
      }
      if ((i & 0x10) != 0) {
        bool4 = true;
      } else {
        bool4 = false;
      }
      if ((bool3) && (!bool4)) {
        l2 = TimeSignalCommand.parseSpliceTime(paramParsableByteArray, paramLong);
      } else {
        l2 = -9223372036854775807L;
      }
      if (!bool3)
      {
        k = paramParsableByteArray.readUnsignedByte();
        localObject = new ArrayList(k);
        for (i = 0; i < k; i++)
        {
          int m = paramParsableByteArray.readUnsignedByte();
          long l3;
          if (!bool4) {
            l3 = TimeSignalCommand.parseSpliceTime(paramParsableByteArray, paramLong);
          } else {
            l3 = -9223372036854775807L;
          }
          ((ArrayList)localObject).add(new ComponentSplice(m, l3, paramTimestampAdjuster.adjustTsTimestamp(l3), null));
        }
      }
      if (j != 0)
      {
        paramLong = paramParsableByteArray.readUnsignedByte();
        if ((0x80 & paramLong) != 0L) {
          bool5 = true;
        } else {
          bool5 = false;
        }
        paramLong = ((paramLong & 1L) << 32 | paramParsableByteArray.readUnsignedInt()) * 1000L / 90L;
      }
      else
      {
        bool5 = false;
        paramLong = -9223372036854775807L;
      }
      i = paramParsableByteArray.readUnsignedShort();
      j = paramParsableByteArray.readUnsignedByte();
      k = paramParsableByteArray.readUnsignedByte();
      paramParsableByteArray = (ParsableByteArray)localObject;
    }
    else
    {
      paramParsableByteArray = (ParsableByteArray)localObject;
      bool2 = false;
      bool4 = false;
      l2 = -9223372036854775807L;
      bool5 = false;
      paramLong = -9223372036854775807L;
      i = 0;
      j = 0;
      k = 0;
      bool3 = false;
    }
    return new SpliceInsertCommand(l1, bool1, bool2, bool3, bool4, l2, paramTimestampAdjuster.adjustTsTimestamp(l2), paramParsableByteArray, bool5, paramLong, i, j, k);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(spliceEventId);
    paramParcel.writeByte((byte)spliceEventCancelIndicator);
    paramParcel.writeByte((byte)outOfNetworkIndicator);
    paramParcel.writeByte((byte)programSpliceFlag);
    paramParcel.writeByte((byte)spliceImmediateFlag);
    paramParcel.writeLong(programSplicePts);
    paramParcel.writeLong(programSplicePlaybackPositionUs);
    int i = componentSpliceList.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      ((ComponentSplice)componentSpliceList.get(paramInt)).writeToParcel(paramParcel);
    }
    paramParcel.writeByte((byte)autoReturn);
    paramParcel.writeLong(breakDurationUs);
    paramParcel.writeInt(uniqueProgramId);
    paramParcel.writeInt(availNum);
    paramParcel.writeInt(availsExpected);
  }
  
  public static final class ComponentSplice
  {
    public final long componentSplicePlaybackPositionUs;
    public final long componentSplicePts;
    public final int componentTag;
    
    private ComponentSplice(int paramInt, long paramLong1, long paramLong2)
    {
      componentTag = paramInt;
      componentSplicePts = paramLong1;
      componentSplicePlaybackPositionUs = paramLong2;
    }
    
    public static ComponentSplice createFromParcel(Parcel paramParcel)
    {
      return new ComponentSplice(paramParcel.readInt(), paramParcel.readLong(), paramParcel.readLong());
    }
    
    public void writeToParcel(Parcel paramParcel)
    {
      paramParcel.writeInt(componentTag);
      paramParcel.writeLong(componentSplicePts);
      paramParcel.writeLong(componentSplicePlaybackPositionUs);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */