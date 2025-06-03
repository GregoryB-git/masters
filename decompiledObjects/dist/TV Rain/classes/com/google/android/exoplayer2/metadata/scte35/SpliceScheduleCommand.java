package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SpliceScheduleCommand
  extends SpliceCommand
{
  public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator()
  {
    public SpliceScheduleCommand createFromParcel(Parcel paramAnonymousParcel)
    {
      return new SpliceScheduleCommand(paramAnonymousParcel, null);
    }
    
    public SpliceScheduleCommand[] newArray(int paramAnonymousInt)
    {
      return new SpliceScheduleCommand[paramAnonymousInt];
    }
  };
  public final List<Event> events;
  
  private SpliceScheduleCommand(Parcel paramParcel)
  {
    int i = paramParcel.readInt();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(Event.access$300(paramParcel));
    }
    events = Collections.unmodifiableList(localArrayList);
  }
  
  private SpliceScheduleCommand(List<Event> paramList)
  {
    events = Collections.unmodifiableList(paramList);
  }
  
  public static SpliceScheduleCommand parseFromSection(ParsableByteArray paramParsableByteArray)
  {
    int i = paramParsableByteArray.readUnsignedByte();
    ArrayList localArrayList = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      localArrayList.add(Event.access$400(paramParsableByteArray));
    }
    return new SpliceScheduleCommand(localArrayList);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = events.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      Event.access$500((Event)events.get(paramInt), paramParcel);
    }
  }
  
  public static final class ComponentSplice
  {
    public final int componentTag;
    public final long utcSpliceTime;
    
    private ComponentSplice(int paramInt, long paramLong)
    {
      componentTag = paramInt;
      utcSpliceTime = paramLong;
    }
    
    private static ComponentSplice createFromParcel(Parcel paramParcel)
    {
      return new ComponentSplice(paramParcel.readInt(), paramParcel.readLong());
    }
    
    private void writeToParcel(Parcel paramParcel)
    {
      paramParcel.writeInt(componentTag);
      paramParcel.writeLong(utcSpliceTime);
    }
  }
  
  public static final class Event
  {
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<SpliceScheduleCommand.ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final int uniqueProgramId;
    public final long utcSpliceTime;
    
    private Event(long paramLong1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, List<SpliceScheduleCommand.ComponentSplice> paramList, long paramLong2, boolean paramBoolean4, long paramLong3, int paramInt1, int paramInt2, int paramInt3)
    {
      spliceEventId = paramLong1;
      spliceEventCancelIndicator = paramBoolean1;
      outOfNetworkIndicator = paramBoolean2;
      programSpliceFlag = paramBoolean3;
      componentSpliceList = Collections.unmodifiableList(paramList);
      utcSpliceTime = paramLong2;
      autoReturn = paramBoolean4;
      breakDurationUs = paramLong3;
      uniqueProgramId = paramInt1;
      availNum = paramInt2;
      availsExpected = paramInt3;
    }
    
    private Event(Parcel paramParcel)
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
      int j = paramParcel.readInt();
      ArrayList localArrayList = new ArrayList(j);
      for (i = 0; i < j; i++) {
        localArrayList.add(SpliceScheduleCommand.ComponentSplice.access$000(paramParcel));
      }
      componentSpliceList = Collections.unmodifiableList(localArrayList);
      utcSpliceTime = paramParcel.readLong();
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
    
    private static Event createFromParcel(Parcel paramParcel)
    {
      return new Event(paramParcel);
    }
    
    private static Event parseFromSection(ParsableByteArray paramParsableByteArray)
    {
      long l1 = paramParsableByteArray.readUnsignedInt();
      boolean bool1;
      if ((paramParsableByteArray.readUnsignedByte() & 0x80) != 0) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      ArrayList localArrayList = new ArrayList();
      int i;
      boolean bool2;
      boolean bool3;
      long l2;
      int j;
      int k;
      long l3;
      boolean bool4;
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
          i = 1;
        } else {
          i = 0;
        }
        if (bool3) {
          l2 = paramParsableByteArray.readUnsignedInt();
        } else {
          l2 = -9223372036854775807L;
        }
        if (!bool3)
        {
          j = paramParsableByteArray.readUnsignedByte();
          localArrayList = new ArrayList(j);
          for (k = 0; k < j; k++) {
            localArrayList.add(new SpliceScheduleCommand.ComponentSplice(paramParsableByteArray.readUnsignedByte(), paramParsableByteArray.readUnsignedInt(), null));
          }
        }
        if (i != 0)
        {
          l3 = paramParsableByteArray.readUnsignedByte();
          if ((0x80 & l3) != 0L) {
            bool4 = true;
          } else {
            bool4 = false;
          }
          l3 = ((l3 & 1L) << 32 | paramParsableByteArray.readUnsignedInt()) * 1000L / 90L;
        }
        else
        {
          bool4 = false;
          l3 = -9223372036854775807L;
        }
        k = paramParsableByteArray.readUnsignedShort();
        j = paramParsableByteArray.readUnsignedByte();
        i = paramParsableByteArray.readUnsignedByte();
      }
      else
      {
        bool2 = false;
        l2 = -9223372036854775807L;
        bool4 = false;
        l3 = -9223372036854775807L;
        k = 0;
        j = 0;
        i = 0;
        bool3 = false;
      }
      return new Event(l1, bool1, bool2, bool3, localArrayList, l2, bool4, l3, k, j, i);
    }
    
    private void writeToParcel(Parcel paramParcel)
    {
      paramParcel.writeLong(spliceEventId);
      paramParcel.writeByte((byte)spliceEventCancelIndicator);
      paramParcel.writeByte((byte)outOfNetworkIndicator);
      paramParcel.writeByte((byte)programSpliceFlag);
      int i = componentSpliceList.size();
      paramParcel.writeInt(i);
      for (int j = 0; j < i; j++) {
        SpliceScheduleCommand.ComponentSplice.access$200((SpliceScheduleCommand.ComponentSplice)componentSpliceList.get(j), paramParcel);
      }
      paramParcel.writeLong(utcSpliceTime);
      paramParcel.writeByte((byte)autoReturn);
      paramParcel.writeLong(breakDurationUs);
      paramParcel.writeInt(uniqueProgramId);
      paramParcel.writeInt(availNum);
      paramParcel.writeInt(availsExpected);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */