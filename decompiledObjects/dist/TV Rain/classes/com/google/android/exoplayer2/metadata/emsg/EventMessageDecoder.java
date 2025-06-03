package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.MetadataDecoder;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class EventMessageDecoder
  implements MetadataDecoder
{
  public Metadata decode(MetadataInputBuffer paramMetadataInputBuffer)
  {
    Object localObject = data;
    paramMetadataInputBuffer = ((ByteBuffer)localObject).array();
    int i = ((Buffer)localObject).limit();
    ParsableByteArray localParsableByteArray = new ParsableByteArray(paramMetadataInputBuffer, i);
    String str = (String)Assertions.checkNotNull(localParsableByteArray.readNullTerminatedString());
    localObject = (String)Assertions.checkNotNull(localParsableByteArray.readNullTerminatedString());
    long l1 = localParsableByteArray.readUnsignedInt();
    long l2 = Util.scaleLargeTimestamp(localParsableByteArray.readUnsignedInt(), 1000000L, l1);
    return new Metadata(new Metadata.Entry[] { new EventMessage(str, (String)localObject, Util.scaleLargeTimestamp(localParsableByteArray.readUnsignedInt(), 1000L, l1), localParsableByteArray.readUnsignedInt(), Arrays.copyOfRange(paramMetadataInputBuffer, localParsableByteArray.getPosition(), i), l2) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */