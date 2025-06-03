package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;

class DefaultOggSeeker$OggSeekMap
  implements SeekMap
{
  private DefaultOggSeeker$OggSeekMap(DefaultOggSeeker paramDefaultOggSeeker) {}
  
  public long getDurationUs()
  {
    return DefaultOggSeeker.access$200(this$0).convertGranuleToTime(DefaultOggSeeker.access$400(this$0));
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    if (paramLong == 0L) {
      return new SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.access$100(this$0)));
    }
    long l = DefaultOggSeeker.access$200(this$0).convertTimeToGranule(paramLong);
    DefaultOggSeeker localDefaultOggSeeker = this$0;
    return new SeekMap.SeekPoints(new SeekPoint(paramLong, DefaultOggSeeker.access$300(localDefaultOggSeeker, DefaultOggSeeker.access$100(localDefaultOggSeeker), l, 30000L)));
  }
  
  public boolean isSeekable()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ogg.DefaultOggSeeker.OggSeekMap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */