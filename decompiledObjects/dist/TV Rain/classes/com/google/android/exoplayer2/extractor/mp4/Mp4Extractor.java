package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.GaplessInfoHolder;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.SeekPoints;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import z3;

public final class Mp4Extractor
  implements Extractor, SeekMap
{
  private static final int BRAND_QUICKTIME = Util.getIntegerCodeForString("qt  ");
  public static final ExtractorsFactory FACTORY = new z3(18);
  public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
  private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760L;
  private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144L;
  private static final int STATE_READING_ATOM_HEADER = 0;
  private static final int STATE_READING_ATOM_PAYLOAD = 1;
  private static final int STATE_READING_SAMPLE = 2;
  private long[][] accumulatedSampleSizes;
  private ParsableByteArray atomData;
  private final ParsableByteArray atomHeader;
  private int atomHeaderBytesRead;
  private long atomSize;
  private int atomType;
  private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
  private long durationUs;
  private ExtractorOutput extractorOutput;
  private int firstVideoTrackIndex;
  private final int flags;
  private boolean isQuickTime;
  private final ParsableByteArray nalLength;
  private final ParsableByteArray nalStartCode;
  private int parserState;
  private int sampleBytesWritten;
  private int sampleCurrentNalBytesRemaining;
  private int sampleTrackIndex;
  private Mp4Track[] tracks;
  
  public Mp4Extractor()
  {
    this(0);
  }
  
  public Mp4Extractor(int paramInt)
  {
    flags = paramInt;
    atomHeader = new ParsableByteArray(16);
    containerAtoms = new ArrayDeque();
    nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    nalLength = new ParsableByteArray(4);
    sampleTrackIndex = -1;
  }
  
  private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] paramArrayOfMp4Track)
  {
    long[][] arrayOfLong = new long[paramArrayOfMp4Track.length][];
    int[] arrayOfInt = new int[paramArrayOfMp4Track.length];
    long[] arrayOfLong1 = new long[paramArrayOfMp4Track.length];
    boolean[] arrayOfBoolean = new boolean[paramArrayOfMp4Track.length];
    for (int i = 0; i < paramArrayOfMp4Track.length; i++)
    {
      arrayOfLong[i] = new long[sampleTable.sampleCount];
      arrayOfLong1[i] = sampleTable.timestampsUs[0];
    }
    long l1 = 0L;
    int j = 0;
    while (j < paramArrayOfMp4Track.length)
    {
      long l2 = Long.MAX_VALUE;
      int k = -1;
      i = 0;
      while (i < paramArrayOfMp4Track.length)
      {
        long l3 = l2;
        int m = k;
        if (arrayOfBoolean[i] == 0)
        {
          long l4 = arrayOfLong1[i];
          l3 = l2;
          m = k;
          if (l4 <= l2)
          {
            m = i;
            l3 = l4;
          }
        }
        i++;
        l2 = l3;
        k = m;
      }
      i = arrayOfInt[k];
      long[] arrayOfLong2 = arrayOfLong[k];
      arrayOfLong2[i] = l1;
      TrackSampleTable localTrackSampleTable = sampleTable;
      l1 += sizes[i];
      i++;
      arrayOfInt[k] = i;
      if (i < arrayOfLong2.length)
      {
        arrayOfLong1[k] = timestampsUs[i];
      }
      else
      {
        arrayOfBoolean[k] = true;
        j++;
      }
    }
    return arrayOfLong;
  }
  
  private void enterReadingAtomHeaderState()
  {
    parserState = 0;
    atomHeaderBytesRead = 0;
  }
  
  private static int getSynchronizationSampleIndex(TrackSampleTable paramTrackSampleTable, long paramLong)
  {
    int i = paramTrackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(paramLong);
    int j = i;
    if (i == -1) {
      j = paramTrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(paramLong);
    }
    return j;
  }
  
  private int getTrackIndexOfNextReadSample(long paramLong)
  {
    int i = -1;
    int j = -1;
    int k = 0;
    long l1 = Long.MAX_VALUE;
    int m = 1;
    long l2 = Long.MAX_VALUE;
    int n = 1;
    long l3 = Long.MAX_VALUE;
    for (;;)
    {
      Object localObject = tracks;
      if (k >= localObject.length) {
        break;
      }
      localObject = localObject[k];
      int i1 = sampleIndex;
      localObject = sampleTable;
      long l4;
      if (i1 == sampleCount)
      {
        l4 = l1;
      }
      else
      {
        long l5 = offsets[i1];
        long l6 = accumulatedSampleSizes[k][i1];
        l4 = l5 - paramLong;
        if ((l4 >= 0L) && (l4 < 262144L)) {
          i1 = 0;
        } else {
          i1 = 1;
        }
        int i2;
        long l7;
        int i3;
        if ((i1 != 0) || (n == 0))
        {
          i2 = j;
          l7 = l2;
          i3 = n;
          l5 = l3;
          if (i1 == n)
          {
            i2 = j;
            l7 = l2;
            i3 = n;
            l5 = l3;
            if (l4 >= l3) {}
          }
        }
        else
        {
          i3 = i1;
          l5 = l4;
          i2 = k;
          l7 = l6;
        }
        j = i2;
        l4 = l1;
        l2 = l7;
        n = i3;
        l3 = l5;
        if (l6 < l1)
        {
          i = k;
          l3 = l5;
          n = i3;
          l2 = l7;
          m = i1;
          l4 = l6;
          j = i2;
        }
      }
      k++;
      l1 = l4;
    }
    if ((l1 == Long.MAX_VALUE) || (m == 0) || (l2 < l1 + 10485760L)) {
      i = j;
    }
    return i;
  }
  
  private ArrayList<TrackSampleTable> getTrackSampleTables(Atom.ContainerAtom paramContainerAtom, GaplessInfoHolder paramGaplessInfoHolder, boolean paramBoolean)
    throws ParserException
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < containerChildren.size(); i++)
    {
      Atom.ContainerAtom localContainerAtom = (Atom.ContainerAtom)containerChildren.get(i);
      if (type == Atom.TYPE_trak)
      {
        Object localObject = AtomParsers.parseTrak(localContainerAtom, paramContainerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), -9223372036854775807L, null, paramBoolean, isQuickTime);
        if (localObject != null)
        {
          localObject = AtomParsers.parseStbl((Track)localObject, localContainerAtom.getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl), paramGaplessInfoHolder);
          if (sampleCount != 0) {
            localArrayList.add(localObject);
          }
        }
      }
    }
    return localArrayList;
  }
  
  private static long maybeAdjustSeekOffset(TrackSampleTable paramTrackSampleTable, long paramLong1, long paramLong2)
  {
    int i = getSynchronizationSampleIndex(paramTrackSampleTable, paramLong1);
    if (i == -1) {
      return paramLong2;
    }
    return Math.min(offsets[i], paramLong2);
  }
  
  private void processAtomEnded(long paramLong)
    throws ParserException
  {
    while ((!containerAtoms.isEmpty()) && (containerAtoms.peek()).endPosition == paramLong))
    {
      Atom.ContainerAtom localContainerAtom = (Atom.ContainerAtom)containerAtoms.pop();
      if (type == Atom.TYPE_moov)
      {
        processMoovAtom(localContainerAtom);
        containerAtoms.clear();
        parserState = 2;
      }
      else if (!containerAtoms.isEmpty())
      {
        ((Atom.ContainerAtom)containerAtoms.peek()).add(localContainerAtom);
      }
    }
    if (parserState != 2) {
      enterReadingAtomHeaderState();
    }
  }
  
  private static boolean processFtypAtom(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.setPosition(8);
    if (paramParsableByteArray.readInt() == BRAND_QUICKTIME) {
      return true;
    }
    paramParsableByteArray.skipBytes(4);
    while (paramParsableByteArray.bytesLeft() > 0) {
      if (paramParsableByteArray.readInt() == BRAND_QUICKTIME) {
        return true;
      }
    }
    return false;
  }
  
  private void processMoovAtom(Atom.ContainerAtom paramContainerAtom)
    throws ParserException
  {
    ArrayList localArrayList1 = new ArrayList();
    GaplessInfoHolder localGaplessInfoHolder = new GaplessInfoHolder();
    Object localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_udta);
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = AtomParsers.parseUdta((Atom.LeafAtom)localObject1, isQuickTime);
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localGaplessInfoHolder.setFromMetadata((Metadata)localObject1);
        localObject2 = localObject1;
      }
    }
    else
    {
      localObject2 = null;
    }
    int i = flags;
    int j = 0;
    boolean bool;
    if ((i & 0x1) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    ArrayList localArrayList2 = getTrackSampleTables(paramContainerAtom, localGaplessInfoHolder, bool);
    int k = localArrayList2.size();
    i = -1;
    long l1 = -9223372036854775807L;
    while (j < k)
    {
      TrackSampleTable localTrackSampleTable = (TrackSampleTable)localArrayList2.get(j);
      Track localTrack = track;
      Mp4Track localMp4Track = new Mp4Track(localTrack, localTrackSampleTable, extractorOutput.track(j, type));
      int m = maximumSize;
      Format localFormat = format.copyWithMaxInputSize(m + 30);
      paramContainerAtom = localFormat;
      if (type == 1)
      {
        localObject1 = localFormat;
        if (localGaplessInfoHolder.hasGaplessInfo()) {
          localObject1 = localFormat.copyWithGaplessInfo(encoderDelay, encoderPadding);
        }
        paramContainerAtom = (Atom.ContainerAtom)localObject1;
        if (localObject2 != null) {
          paramContainerAtom = ((Format)localObject1).copyWithMetadata((Metadata)localObject2);
        }
      }
      trackOutput.format(paramContainerAtom);
      long l2 = durationUs;
      if (l2 == -9223372036854775807L) {
        l2 = durationUs;
      }
      l1 = Math.max(l1, l2);
      if (type == 2)
      {
        m = i;
        if (i == -1) {
          m = localArrayList1.size();
        }
      }
      else
      {
        m = i;
      }
      localArrayList1.add(localMp4Track);
      j++;
      i = m;
    }
    firstVideoTrackIndex = i;
    durationUs = l1;
    paramContainerAtom = (Mp4Track[])localArrayList1.toArray(new Mp4Track[localArrayList1.size()]);
    tracks = paramContainerAtom;
    accumulatedSampleSizes = calculateAccumulatedSampleSizes(paramContainerAtom);
    extractorOutput.endTracks();
    extractorOutput.seekMap(this);
  }
  
  private boolean readAtomHeader(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (atomHeaderBytesRead == 0)
    {
      if (!paramExtractorInput.readFully(atomHeader.data, 0, 8, true)) {
        return false;
      }
      atomHeaderBytesRead = 8;
      atomHeader.setPosition(0);
      atomSize = atomHeader.readUnsignedInt();
      atomType = atomHeader.readInt();
    }
    long l1 = atomSize;
    if (l1 == 1L)
    {
      paramExtractorInput.readFully(atomHeader.data, 8, 8);
      atomHeaderBytesRead += 8;
      atomSize = atomHeader.readUnsignedLongToLong();
    }
    else if (l1 == 0L)
    {
      long l2 = paramExtractorInput.getLength();
      l1 = l2;
      if (l2 == -1L)
      {
        l1 = l2;
        if (!containerAtoms.isEmpty()) {
          l1 = containerAtoms.peek()).endPosition;
        }
      }
      if (l1 != -1L) {
        atomSize = (l1 - paramExtractorInput.getPosition() + atomHeaderBytesRead);
      }
    }
    if (atomSize >= atomHeaderBytesRead)
    {
      if (shouldParseContainerAtom(atomType))
      {
        l1 = paramExtractorInput.getPosition() + atomSize - atomHeaderBytesRead;
        containerAtoms.push(new Atom.ContainerAtom(atomType, l1));
        if (atomSize == atomHeaderBytesRead) {
          processAtomEnded(l1);
        } else {
          enterReadingAtomHeaderState();
        }
      }
      else if (shouldParseLeafAtom(atomType))
      {
        boolean bool;
        if (atomHeaderBytesRead == 8) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        if (atomSize <= 2147483647L) {
          bool = true;
        } else {
          bool = false;
        }
        Assertions.checkState(bool);
        paramExtractorInput = new ParsableByteArray((int)atomSize);
        atomData = paramExtractorInput;
        System.arraycopy(atomHeader.data, 0, data, 0, 8);
        parserState = 1;
      }
      else
      {
        atomData = null;
        parserState = 1;
      }
      return true;
    }
    throw new ParserException("Atom size less than header length (unsupported).");
  }
  
  private boolean readAtomPayload(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    long l1 = atomSize - atomHeaderBytesRead;
    long l2 = paramExtractorInput.getPosition();
    ParsableByteArray localParsableByteArray = atomData;
    boolean bool = true;
    if (localParsableByteArray != null)
    {
      paramExtractorInput.readFully(data, atomHeaderBytesRead, (int)l1);
      if (atomType == Atom.TYPE_ftyp) {
        isQuickTime = processFtypAtom(atomData);
      } else if (!containerAtoms.isEmpty()) {
        ((Atom.ContainerAtom)containerAtoms.peek()).add(new Atom.LeafAtom(atomType, atomData));
      }
    }
    else
    {
      if (l1 >= 262144L) {
        break label137;
      }
      paramExtractorInput.skipFully((int)l1);
    }
    int i = 0;
    break label152;
    label137:
    position = (paramExtractorInput.getPosition() + l1);
    i = 1;
    label152:
    processAtomEnded(l2 + l1);
    if ((i == 0) || (parserState == 2)) {
      bool = false;
    }
    return bool;
  }
  
  private int readSample(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    long l1 = paramExtractorInput.getPosition();
    int i;
    if (sampleTrackIndex == -1)
    {
      i = getTrackIndexOfNextReadSample(l1);
      sampleTrackIndex = i;
      if (i == -1) {
        return -1;
      }
    }
    Mp4Track localMp4Track = tracks[sampleTrackIndex];
    TrackOutput localTrackOutput = trackOutput;
    int j = sampleIndex;
    TrackSampleTable localTrackSampleTable = sampleTable;
    long l2 = offsets[j];
    int k = sizes[j];
    l1 = l2 - l1 + sampleBytesWritten;
    if ((l1 >= 0L) && (l1 < 262144L))
    {
      l2 = l1;
      i = k;
      if (track.sampleTransformation == 1)
      {
        l2 = l1 + 8L;
        i = k - 8;
      }
      paramExtractorInput.skipFully((int)l2);
      int m = track.nalUnitLengthFieldLength;
      if (m != 0)
      {
        paramPositionHolder = nalLength.data;
        paramPositionHolder[0] = ((byte)0);
        paramPositionHolder[1] = ((byte)0);
        paramPositionHolder[2] = ((byte)0);
        int n = 4 - m;
        for (;;)
        {
          k = i;
          if (sampleBytesWritten >= i) {
            break;
          }
          k = sampleCurrentNalBytesRemaining;
          if (k == 0)
          {
            paramExtractorInput.readFully(nalLength.data, n, m);
            nalLength.setPosition(0);
            sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
            nalStartCode.setPosition(0);
            localTrackOutput.sampleData(nalStartCode, 4);
            sampleBytesWritten += 4;
            i += n;
          }
          else
          {
            k = localTrackOutput.sampleData(paramExtractorInput, k, false);
            sampleBytesWritten += k;
            sampleCurrentNalBytesRemaining -= k;
          }
        }
      }
      for (;;)
      {
        m = sampleBytesWritten;
        k = i;
        if (m >= i) {
          break;
        }
        k = localTrackOutput.sampleData(paramExtractorInput, i - m, false);
        sampleBytesWritten += k;
        sampleCurrentNalBytesRemaining -= k;
      }
      paramExtractorInput = sampleTable;
      localTrackOutput.sampleMetadata(timestampsUs[j], flags[j], k, 0, null);
      sampleIndex += 1;
      sampleTrackIndex = -1;
      sampleBytesWritten = 0;
      sampleCurrentNalBytesRemaining = 0;
      return 0;
    }
    position = l2;
    return 1;
  }
  
  private static boolean shouldParseContainerAtom(int paramInt)
  {
    boolean bool;
    if ((paramInt != Atom.TYPE_moov) && (paramInt != Atom.TYPE_trak) && (paramInt != Atom.TYPE_mdia) && (paramInt != Atom.TYPE_minf) && (paramInt != Atom.TYPE_stbl) && (paramInt != Atom.TYPE_edts)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean shouldParseLeafAtom(int paramInt)
  {
    boolean bool;
    if ((paramInt != Atom.TYPE_mdhd) && (paramInt != Atom.TYPE_mvhd) && (paramInt != Atom.TYPE_hdlr) && (paramInt != Atom.TYPE_stsd) && (paramInt != Atom.TYPE_stts) && (paramInt != Atom.TYPE_stss) && (paramInt != Atom.TYPE_ctts) && (paramInt != Atom.TYPE_elst) && (paramInt != Atom.TYPE_stsc) && (paramInt != Atom.TYPE_stsz) && (paramInt != Atom.TYPE_stz2) && (paramInt != Atom.TYPE_stco) && (paramInt != Atom.TYPE_co64) && (paramInt != Atom.TYPE_tkhd) && (paramInt != Atom.TYPE_ftyp) && (paramInt != Atom.TYPE_udta)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void updateSampleIndices(long paramLong)
  {
    for (Mp4Track localMp4Track : tracks)
    {
      TrackSampleTable localTrackSampleTable = sampleTable;
      int k = localTrackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(paramLong);
      int m = k;
      if (k == -1) {
        m = localTrackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(paramLong);
      }
      sampleIndex = m;
    }
  }
  
  public long getDurationUs()
  {
    return durationUs;
  }
  
  public SeekMap.SeekPoints getSeekPoints(long paramLong)
  {
    Object localObject = tracks;
    if (localObject.length == 0) {
      return new SeekMap.SeekPoints(SeekPoint.START);
    }
    int i = firstVideoTrackIndex;
    long l1;
    long l2;
    long l3;
    label150:
    long l4;
    if (i != -1)
    {
      localObject = sampleTable;
      i = getSynchronizationSampleIndex((TrackSampleTable)localObject, paramLong);
      if (i == -1) {
        return new SeekMap.SeekPoints(SeekPoint.START);
      }
      l1 = timestampsUs[i];
      l2 = offsets[i];
      if ((l1 < paramLong) && (i < sampleCount - 1))
      {
        int j = ((TrackSampleTable)localObject).getIndexOfLaterOrEqualSynchronizationSample(paramLong);
        if ((j != -1) && (j != i))
        {
          paramLong = timestampsUs[j];
          l3 = offsets[j];
          break label150;
        }
      }
      l3 = -1L;
      paramLong = -9223372036854775807L;
      l4 = paramLong;
      paramLong = l3;
      l3 = l2;
    }
    else
    {
      l3 = Long.MAX_VALUE;
      l2 = -1L;
      l4 = -9223372036854775807L;
      l1 = paramLong;
      paramLong = l2;
    }
    i = 0;
    for (;;)
    {
      localObject = tracks;
      if (i >= localObject.length) {
        break;
      }
      long l5 = paramLong;
      l2 = l3;
      if (i != firstVideoTrackIndex)
      {
        localObject = sampleTable;
        l2 = maybeAdjustSeekOffset((TrackSampleTable)localObject, l1, l3);
        l3 = paramLong;
        if (l4 != -9223372036854775807L) {
          l3 = maybeAdjustSeekOffset((TrackSampleTable)localObject, l4, paramLong);
        }
        l5 = l3;
      }
      i++;
      paramLong = l5;
      l3 = l2;
    }
    localObject = new SeekPoint(l1, l3);
    if (l4 == -9223372036854775807L) {
      return new SeekMap.SeekPoints((SeekPoint)localObject);
    }
    return new SeekMap.SeekPoints((SeekPoint)localObject, new SeekPoint(l4, paramLong));
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
  }
  
  public boolean isSeekable()
  {
    return true;
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    do
    {
      do
      {
        int i = parserState;
        if (i == 0) {
          break;
        }
        if (i != 1)
        {
          if (i == 2) {
            return readSample(paramExtractorInput, paramPositionHolder);
          }
          throw new IllegalStateException();
        }
      } while (!readAtomPayload(paramExtractorInput, paramPositionHolder));
      return 1;
    } while (readAtomHeader(paramExtractorInput));
    return -1;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    containerAtoms.clear();
    atomHeaderBytesRead = 0;
    sampleTrackIndex = -1;
    sampleBytesWritten = 0;
    sampleCurrentNalBytesRemaining = 0;
    if (paramLong1 == 0L) {
      enterReadingAtomHeaderState();
    } else if (tracks != null) {
      updateSampleIndices(paramLong2);
    }
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return Sniffer.sniffUnfragmented(paramExtractorInput);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  public static final class Mp4Track
  {
    public int sampleIndex;
    public final TrackSampleTable sampleTable;
    public final Track track;
    public final TrackOutput trackOutput;
    
    public Mp4Track(Track paramTrack, TrackSampleTable paramTrackSampleTable, TrackOutput paramTrackOutput)
    {
      track = paramTrack;
      sampleTable = paramTrackSampleTable;
      trackOutput = paramTrackOutput;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.Mp4Extractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */