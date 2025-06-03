package com.google.android.exoplayer2.text.cea;

import androidx.annotation.NonNull;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.text.SubtitleInputBuffer;

final class CeaDecoder$CeaInputBuffer
  extends SubtitleInputBuffer
  implements Comparable<CeaInputBuffer>
{
  private long queuedInputBufferCount;
  
  public int compareTo(@NonNull CeaInputBuffer paramCeaInputBuffer)
  {
    boolean bool1 = isEndOfStream();
    boolean bool2 = paramCeaInputBuffer.isEndOfStream();
    int i = 1;
    int j = 1;
    if (bool1 != bool2)
    {
      if (!isEndOfStream()) {
        j = -1;
      }
      return j;
    }
    long l1 = timeUs - timeUs;
    long l2 = l1;
    if (l1 == 0L)
    {
      l1 = queuedInputBufferCount - queuedInputBufferCount;
      l2 = l1;
      if (l1 == 0L) {
        return 0;
      }
    }
    if (l2 > 0L) {
      j = i;
    } else {
      j = -1;
    }
    return j;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.text.cea.CeaDecoder.CeaInputBuffer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */