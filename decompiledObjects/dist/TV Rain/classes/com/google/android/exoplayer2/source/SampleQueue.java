package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.FormatHolder;
import com.google.android.exoplayer2.decoder.Buffer;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrackOutput.CryptoData;
import com.google.android.exoplayer2.upstream.Allocation;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class SampleQueue
  implements TrackOutput
{
  public static final int ADVANCE_FAILED = -1;
  private static final int INITIAL_SCRATCH_SIZE = 32;
  private final int allocationLength;
  private final Allocator allocator;
  private Format downstreamFormat;
  private final SampleMetadataQueue.SampleExtrasHolder extrasHolder;
  private AllocationNode firstAllocationNode;
  private Format lastUnadjustedFormat;
  private final SampleMetadataQueue metadataQueue;
  private boolean pendingFormatAdjustment;
  private boolean pendingSplice;
  private AllocationNode readAllocationNode;
  private long sampleOffsetUs;
  private final ParsableByteArray scratch;
  private long totalBytesWritten;
  private UpstreamFormatChangedListener upstreamFormatChangeListener;
  private AllocationNode writeAllocationNode;
  
  public SampleQueue(Allocator paramAllocator)
  {
    allocator = paramAllocator;
    int i = paramAllocator.getIndividualAllocationLength();
    allocationLength = i;
    metadataQueue = new SampleMetadataQueue();
    extrasHolder = new SampleMetadataQueue.SampleExtrasHolder();
    scratch = new ParsableByteArray(32);
    paramAllocator = new AllocationNode(0L, i);
    firstAllocationNode = paramAllocator;
    readAllocationNode = paramAllocator;
    writeAllocationNode = paramAllocator;
  }
  
  private void advanceReadTo(long paramLong)
  {
    for (;;)
    {
      AllocationNode localAllocationNode = readAllocationNode;
      if (paramLong < endPosition) {
        break;
      }
      readAllocationNode = next;
    }
  }
  
  private void clearAllocationNodes(AllocationNode paramAllocationNode)
  {
    if (!wasInitialized) {
      return;
    }
    Object localObject = writeAllocationNode;
    int i = wasInitialized;
    int k = (int)(startPosition - startPosition) / allocationLength + i;
    localObject = new Allocation[k];
    for (int j = 0; j < k; j++)
    {
      localObject[j] = allocation;
      paramAllocationNode = paramAllocationNode.clear();
    }
    allocator.release((Allocation[])localObject);
  }
  
  private void discardDownstreamTo(long paramLong)
  {
    if (paramLong == -1L) {
      return;
    }
    AllocationNode localAllocationNode;
    for (;;)
    {
      localAllocationNode = firstAllocationNode;
      if (paramLong < endPosition) {
        break;
      }
      allocator.release(allocation);
      firstAllocationNode = firstAllocationNode.clear();
    }
    if (readAllocationNode.startPosition < startPosition) {
      readAllocationNode = localAllocationNode;
    }
  }
  
  private static Format getAdjustedSampleFormat(Format paramFormat, long paramLong)
  {
    if (paramFormat == null) {
      return null;
    }
    Format localFormat = paramFormat;
    if (paramLong != 0L)
    {
      long l = subsampleOffsetUs;
      localFormat = paramFormat;
      if (l != Long.MAX_VALUE) {
        localFormat = paramFormat.copyWithSubsampleOffsetUs(l + paramLong);
      }
    }
    return localFormat;
  }
  
  private void postAppend(int paramInt)
  {
    long l = totalBytesWritten + paramInt;
    totalBytesWritten = l;
    AllocationNode localAllocationNode = writeAllocationNode;
    if (l == endPosition) {
      writeAllocationNode = next;
    }
  }
  
  private int preAppend(int paramInt)
  {
    AllocationNode localAllocationNode = writeAllocationNode;
    if (!wasInitialized) {
      localAllocationNode.initialize(allocator.allocate(), new AllocationNode(writeAllocationNode.endPosition, allocationLength));
    }
    return Math.min(paramInt, (int)(writeAllocationNode.endPosition - totalBytesWritten));
  }
  
  private void readData(long paramLong, ByteBuffer paramByteBuffer, int paramInt)
  {
    advanceReadTo(paramLong);
    while (paramInt > 0)
    {
      int i = Math.min(paramInt, (int)(readAllocationNode.endPosition - paramLong));
      AllocationNode localAllocationNode = readAllocationNode;
      paramByteBuffer.put(allocation.data, localAllocationNode.translateOffset(paramLong), i);
      int j = paramInt - i;
      long l = paramLong + i;
      localAllocationNode = readAllocationNode;
      paramLong = l;
      paramInt = j;
      if (l == endPosition)
      {
        readAllocationNode = next;
        paramLong = l;
        paramInt = j;
      }
    }
  }
  
  private void readData(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    advanceReadTo(paramLong);
    int i = paramInt;
    while (i > 0)
    {
      int j = Math.min(i, (int)(readAllocationNode.endPosition - paramLong));
      AllocationNode localAllocationNode = readAllocationNode;
      System.arraycopy(allocation.data, localAllocationNode.translateOffset(paramLong), paramArrayOfByte, paramInt - i, j);
      int k = i - j;
      long l = paramLong + j;
      localAllocationNode = readAllocationNode;
      i = k;
      paramLong = l;
      if (l == endPosition)
      {
        readAllocationNode = next;
        i = k;
        paramLong = l;
      }
    }
  }
  
  private void readEncryptionData(DecoderInputBuffer paramDecoderInputBuffer, SampleMetadataQueue.SampleExtrasHolder paramSampleExtrasHolder)
  {
    long l1 = offset;
    Object localObject1 = scratch;
    int i = 1;
    ((ParsableByteArray)localObject1).reset(1);
    readData(l1, scratch.data, 1);
    l1 += 1L;
    localObject1 = scratch.data;
    int j = 0;
    int k = localObject1[0];
    if ((k & 0x80) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    k &= 0x7F;
    localObject1 = cryptoInfo;
    if (iv == null) {
      iv = new byte[16];
    }
    readData(l1, iv, k);
    long l2 = l1 + k;
    l1 = l2;
    if (m != 0)
    {
      scratch.reset(2);
      readData(l2, scratch.data, 2);
      l1 = l2 + 2L;
      i = scratch.readUnsignedShort();
    }
    Object localObject2 = cryptoInfo;
    Object localObject3 = numBytesOfClearData;
    if (localObject3 != null)
    {
      localObject1 = localObject3;
      if (localObject3.length >= i) {}
    }
    else
    {
      localObject1 = new int[i];
    }
    localObject2 = numBytesOfEncryptedData;
    if (localObject2 != null)
    {
      localObject3 = localObject2;
      if (localObject2.length >= i) {}
    }
    else
    {
      localObject3 = new int[i];
    }
    if (m != 0)
    {
      m = i * 6;
      scratch.reset(m);
      readData(l1, scratch.data, m);
      l2 = l1 + m;
      scratch.setPosition(0);
      for (m = j;; m++)
      {
        l1 = l2;
        if (m >= i) {
          break;
        }
        localObject1[m] = scratch.readUnsignedShort();
        localObject3[m] = scratch.readUnsignedIntToInt();
      }
    }
    localObject1[0] = 0;
    localObject3[0] = (size - (int)(l1 - offset));
    localObject2 = cryptoData;
    paramDecoderInputBuffer = cryptoInfo;
    paramDecoderInputBuffer.set(i, (int[])localObject1, (int[])localObject3, encryptionKey, iv, cryptoMode, encryptedBlocks, clearBlocks);
    l2 = offset;
    int m = (int)(l1 - l2);
    offset = (l2 + m);
    size -= m;
  }
  
  public int advanceTo(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    return metadataQueue.advanceTo(paramLong, paramBoolean1, paramBoolean2);
  }
  
  public int advanceToEnd()
  {
    return metadataQueue.advanceToEnd();
  }
  
  public void discardTo(long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    discardDownstreamTo(metadataQueue.discardTo(paramLong, paramBoolean1, paramBoolean2));
  }
  
  public void discardToEnd()
  {
    discardDownstreamTo(metadataQueue.discardToEnd());
  }
  
  public void discardToRead()
  {
    discardDownstreamTo(metadataQueue.discardToRead());
  }
  
  public void discardUpstreamSamples(int paramInt)
  {
    long l = metadataQueue.discardUpstreamSamples(paramInt);
    totalBytesWritten = l;
    if (l != 0L)
    {
      Object localObject1 = firstAllocationNode;
      localObject2 = localObject1;
      if (l != startPosition)
      {
        while (totalBytesWritten > endPosition) {
          localObject2 = next;
        }
        AllocationNode localAllocationNode1 = next;
        clearAllocationNodes(localAllocationNode1);
        AllocationNode localAllocationNode2 = new AllocationNode(endPosition, allocationLength);
        next = localAllocationNode2;
        localObject1 = localObject2;
        if (totalBytesWritten == endPosition) {
          localObject1 = localAllocationNode2;
        }
        writeAllocationNode = ((AllocationNode)localObject1);
        if (readAllocationNode != localAllocationNode1) {
          return;
        }
        readAllocationNode = localAllocationNode2;
        return;
      }
    }
    clearAllocationNodes(firstAllocationNode);
    Object localObject2 = new AllocationNode(totalBytesWritten, allocationLength);
    firstAllocationNode = ((AllocationNode)localObject2);
    readAllocationNode = ((AllocationNode)localObject2);
    writeAllocationNode = ((AllocationNode)localObject2);
  }
  
  public void format(Format paramFormat)
  {
    Format localFormat = getAdjustedSampleFormat(paramFormat, sampleOffsetUs);
    boolean bool = metadataQueue.format(localFormat);
    lastUnadjustedFormat = paramFormat;
    pendingFormatAdjustment = false;
    paramFormat = upstreamFormatChangeListener;
    if ((paramFormat != null) && (bool)) {
      paramFormat.onUpstreamFormatChanged(localFormat);
    }
  }
  
  public int getFirstIndex()
  {
    return metadataQueue.getFirstIndex();
  }
  
  public long getFirstTimestampUs()
  {
    return metadataQueue.getFirstTimestampUs();
  }
  
  public long getLargestQueuedTimestampUs()
  {
    return metadataQueue.getLargestQueuedTimestampUs();
  }
  
  public int getReadIndex()
  {
    return metadataQueue.getReadIndex();
  }
  
  public Format getUpstreamFormat()
  {
    return metadataQueue.getUpstreamFormat();
  }
  
  public int getWriteIndex()
  {
    return metadataQueue.getWriteIndex();
  }
  
  public boolean hasNextSample()
  {
    return metadataQueue.hasNextSample();
  }
  
  public int peekSourceId()
  {
    return metadataQueue.peekSourceId();
  }
  
  public int read(FormatHolder paramFormatHolder, DecoderInputBuffer paramDecoderInputBuffer, boolean paramBoolean1, boolean paramBoolean2, long paramLong)
  {
    int i = metadataQueue.read(paramFormatHolder, paramDecoderInputBuffer, paramBoolean1, paramBoolean2, downstreamFormat, extrasHolder);
    if (i != -5)
    {
      if (i != -4)
      {
        if (i == -3) {
          return -3;
        }
        throw new IllegalStateException();
      }
      if (!paramDecoderInputBuffer.isEndOfStream())
      {
        if (timeUs < paramLong) {
          paramDecoderInputBuffer.addFlag(Integer.MIN_VALUE);
        }
        if (paramDecoderInputBuffer.isEncrypted()) {
          readEncryptionData(paramDecoderInputBuffer, extrasHolder);
        }
        paramDecoderInputBuffer.ensureSpaceForWrite(extrasHolder.size);
        paramFormatHolder = extrasHolder;
        readData(offset, data, size);
      }
      return -4;
    }
    downstreamFormat = format;
    return -5;
  }
  
  public void reset()
  {
    reset(false);
  }
  
  public void reset(boolean paramBoolean)
  {
    metadataQueue.reset(paramBoolean);
    clearAllocationNodes(firstAllocationNode);
    AllocationNode localAllocationNode = new AllocationNode(0L, allocationLength);
    firstAllocationNode = localAllocationNode;
    readAllocationNode = localAllocationNode;
    writeAllocationNode = localAllocationNode;
    totalBytesWritten = 0L;
    allocator.trim();
  }
  
  public void rewind()
  {
    metadataQueue.rewind();
    readAllocationNode = firstAllocationNode;
  }
  
  public int sampleData(ExtractorInput paramExtractorInput, int paramInt, boolean paramBoolean)
    throws IOException, InterruptedException
  {
    paramInt = preAppend(paramInt);
    AllocationNode localAllocationNode = writeAllocationNode;
    paramInt = paramExtractorInput.read(allocation.data, localAllocationNode.translateOffset(totalBytesWritten), paramInt);
    if (paramInt == -1)
    {
      if (paramBoolean) {
        return -1;
      }
      throw new EOFException();
    }
    postAppend(paramInt);
    return paramInt;
  }
  
  public void sampleData(ParsableByteArray paramParsableByteArray, int paramInt)
  {
    while (paramInt > 0)
    {
      int i = preAppend(paramInt);
      AllocationNode localAllocationNode = writeAllocationNode;
      paramParsableByteArray.readBytes(allocation.data, localAllocationNode.translateOffset(totalBytesWritten), i);
      paramInt -= i;
      postAppend(i);
    }
  }
  
  public void sampleMetadata(long paramLong, int paramInt1, int paramInt2, int paramInt3, @Nullable TrackOutput.CryptoData paramCryptoData)
  {
    if (pendingFormatAdjustment) {
      format(lastUnadjustedFormat);
    }
    long l1 = paramLong + sampleOffsetUs;
    if (pendingSplice) {
      if (((paramInt1 & 0x1) != 0) && (metadataQueue.attemptSplice(l1))) {
        pendingSplice = false;
      } else {
        return;
      }
    }
    paramLong = totalBytesWritten;
    long l2 = paramInt2;
    long l3 = paramInt3;
    metadataQueue.commitSample(l1, paramInt1, paramLong - l2 - l3, paramInt2, paramCryptoData);
  }
  
  public boolean setReadPosition(int paramInt)
  {
    return metadataQueue.setReadPosition(paramInt);
  }
  
  public void setSampleOffsetUs(long paramLong)
  {
    if (sampleOffsetUs != paramLong)
    {
      sampleOffsetUs = paramLong;
      pendingFormatAdjustment = true;
    }
  }
  
  public void setUpstreamFormatChangeListener(UpstreamFormatChangedListener paramUpstreamFormatChangedListener)
  {
    upstreamFormatChangeListener = paramUpstreamFormatChangedListener;
  }
  
  public void sourceId(int paramInt)
  {
    metadataQueue.sourceId(paramInt);
  }
  
  public void splice()
  {
    pendingSplice = true;
  }
  
  public static final class AllocationNode
  {
    @Nullable
    public Allocation allocation;
    public final long endPosition;
    @Nullable
    public AllocationNode next;
    public final long startPosition;
    public boolean wasInitialized;
    
    public AllocationNode(long paramLong, int paramInt)
    {
      startPosition = paramLong;
      endPosition = (paramLong + paramInt);
    }
    
    public AllocationNode clear()
    {
      allocation = null;
      AllocationNode localAllocationNode = next;
      next = null;
      return localAllocationNode;
    }
    
    public void initialize(Allocation paramAllocation, AllocationNode paramAllocationNode)
    {
      allocation = paramAllocation;
      next = paramAllocationNode;
      wasInitialized = true;
    }
    
    public int translateOffset(long paramLong)
    {
      return (int)(paramLong - startPosition) + allocation.offset;
    }
  }
  
  public static abstract interface UpstreamFormatChangedListener
  {
    public abstract void onUpstreamFormatChanged(Format paramFormat);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.SampleQueue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */