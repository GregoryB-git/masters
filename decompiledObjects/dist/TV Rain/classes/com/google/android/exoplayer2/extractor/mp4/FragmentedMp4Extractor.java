package com.google.android.exoplayer2.extractor.mp4;

import a;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekMap.Unseekable;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.text.cea.CeaUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import z3;

public final class FragmentedMp4Extractor
  implements Extractor
{
  private static final Format EMSG_FORMAT = Format.createSampleFormat(null, "application/x-emsg", Long.MAX_VALUE);
  public static final ExtractorsFactory FACTORY = new z3(17);
  public static final int FLAG_ENABLE_EMSG_TRACK = 4;
  private static final int FLAG_SIDELOADED = 8;
  public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
  public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
  public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
  private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE;
  private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
  private static final int STATE_READING_ATOM_HEADER = 0;
  private static final int STATE_READING_ATOM_PAYLOAD = 1;
  private static final int STATE_READING_ENCRYPTION_DATA = 2;
  private static final int STATE_READING_SAMPLE_CONTINUE = 4;
  private static final int STATE_READING_SAMPLE_START = 3;
  private static final String TAG = "FragmentedMp4Extractor";
  @Nullable
  private final TrackOutput additionalEmsgTrackOutput;
  private ParsableByteArray atomData;
  private final ParsableByteArray atomHeader;
  private int atomHeaderBytesRead;
  private long atomSize;
  private int atomType;
  private TrackOutput[] cea608TrackOutputs;
  private final List<Format> closedCaptionFormats;
  private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
  private TrackBundle currentTrackBundle;
  private long durationUs;
  private TrackOutput[] emsgTrackOutputs;
  private long endOfMdatPosition;
  private final byte[] extendedTypeScratch;
  private ExtractorOutput extractorOutput;
  private final int flags;
  private boolean haveOutputSeekMap;
  private final ParsableByteArray nalBuffer;
  private final ParsableByteArray nalPrefix;
  private final ParsableByteArray nalStartCode;
  private int parserState;
  private int pendingMetadataSampleBytes;
  private final ArrayDeque<MetadataSampleInfo> pendingMetadataSampleInfos;
  private long pendingSeekTimeUs;
  private boolean processSeiNalUnitPayload;
  private int sampleBytesWritten;
  private int sampleCurrentNalBytesRemaining;
  private int sampleSize;
  private long segmentIndexEarliestPresentationTimeUs;
  @Nullable
  private final DrmInitData sideloadedDrmInitData;
  @Nullable
  private final Track sideloadedTrack;
  @Nullable
  private final TimestampAdjuster timestampAdjuster;
  private final SparseArray<TrackBundle> trackBundles;
  
  static
  {
    PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = new byte[] { -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12 };
  }
  
  public FragmentedMp4Extractor()
  {
    this(0);
  }
  
  public FragmentedMp4Extractor(int paramInt)
  {
    this(paramInt, null);
  }
  
  public FragmentedMp4Extractor(int paramInt, @Nullable TimestampAdjuster paramTimestampAdjuster)
  {
    this(paramInt, paramTimestampAdjuster, null, null);
  }
  
  public FragmentedMp4Extractor(int paramInt, @Nullable TimestampAdjuster paramTimestampAdjuster, @Nullable Track paramTrack, @Nullable DrmInitData paramDrmInitData)
  {
    this(paramInt, paramTimestampAdjuster, paramTrack, paramDrmInitData, Collections.emptyList());
  }
  
  public FragmentedMp4Extractor(int paramInt, @Nullable TimestampAdjuster paramTimestampAdjuster, @Nullable Track paramTrack, @Nullable DrmInitData paramDrmInitData, List<Format> paramList)
  {
    this(paramInt, paramTimestampAdjuster, paramTrack, paramDrmInitData, paramList, null);
  }
  
  public FragmentedMp4Extractor(int paramInt, @Nullable TimestampAdjuster paramTimestampAdjuster, @Nullable Track paramTrack, @Nullable DrmInitData paramDrmInitData, List<Format> paramList, @Nullable TrackOutput paramTrackOutput)
  {
    int i;
    if (paramTrack != null) {
      i = 8;
    } else {
      i = 0;
    }
    flags = (paramInt | i);
    timestampAdjuster = paramTimestampAdjuster;
    sideloadedTrack = paramTrack;
    sideloadedDrmInitData = paramDrmInitData;
    closedCaptionFormats = Collections.unmodifiableList(paramList);
    additionalEmsgTrackOutput = paramTrackOutput;
    atomHeader = new ParsableByteArray(16);
    nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
    nalPrefix = new ParsableByteArray(5);
    nalBuffer = new ParsableByteArray();
    extendedTypeScratch = new byte[16];
    containerAtoms = new ArrayDeque();
    pendingMetadataSampleInfos = new ArrayDeque();
    trackBundles = new SparseArray();
    durationUs = -9223372036854775807L;
    pendingSeekTimeUs = -9223372036854775807L;
    segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
    enterReadingAtomHeaderState();
  }
  
  private void enterReadingAtomHeaderState()
  {
    parserState = 0;
    atomHeaderBytesRead = 0;
  }
  
  private DefaultSampleValues getDefaultSampleValues(SparseArray<DefaultSampleValues> paramSparseArray, int paramInt)
  {
    if (paramSparseArray.size() == 1) {
      return (DefaultSampleValues)paramSparseArray.valueAt(0);
    }
    return (DefaultSampleValues)Assertions.checkNotNull(paramSparseArray.get(paramInt));
  }
  
  private static DrmInitData getDrmInitDataFromAtoms(List<Atom.LeafAtom> paramList)
  {
    int i = paramList.size();
    Object localObject1 = null;
    int j = 0;
    Object localObject4;
    for (Object localObject2 = null; j < i; localObject2 = localObject4)
    {
      Object localObject3 = (Atom.LeafAtom)paramList.get(j);
      localObject4 = localObject2;
      if (type == Atom.TYPE_pssh)
      {
        localObject4 = localObject2;
        if (localObject2 == null) {
          localObject4 = new ArrayList();
        }
        localObject3 = data.data;
        localObject2 = PsshAtomUtil.parseUuid((byte[])localObject3);
        if (localObject2 == null) {
          Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
        } else {
          ((ArrayList)localObject4).add(new DrmInitData.SchemeData((UUID)localObject2, "video/mp4", (byte[])localObject3));
        }
      }
      j++;
    }
    if (localObject2 == null) {
      paramList = (List<Atom.LeafAtom>)localObject1;
    } else {
      paramList = new DrmInitData((List)localObject2);
    }
    return paramList;
  }
  
  private static TrackBundle getNextFragmentRun(SparseArray<TrackBundle> paramSparseArray)
  {
    int i = paramSparseArray.size();
    Object localObject = null;
    long l1 = Long.MAX_VALUE;
    int j = 0;
    while (j < i)
    {
      TrackBundle localTrackBundle = (TrackBundle)paramSparseArray.valueAt(j);
      int k = currentTrackRunIndex;
      TrackFragment localTrackFragment = fragment;
      long l2;
      if (k == trunCount)
      {
        l2 = l1;
      }
      else
      {
        long l3 = trunDataPosition[k];
        l2 = l1;
        if (l3 < l1)
        {
          localObject = localTrackBundle;
          l2 = l3;
        }
      }
      j++;
      l1 = l2;
    }
    return (TrackBundle)localObject;
  }
  
  @Nullable
  private static TrackBundle getTrackBundle(SparseArray<TrackBundle> paramSparseArray, int paramInt)
  {
    if (paramSparseArray.size() == 1) {
      return (TrackBundle)paramSparseArray.valueAt(0);
    }
    return (TrackBundle)paramSparseArray.get(paramInt);
  }
  
  private void maybeInitExtraTracks()
  {
    Object localObject = emsgTrackOutputs;
    int i = 0;
    int j;
    if (localObject == null)
    {
      TrackOutput[] arrayOfTrackOutput = new TrackOutput[2];
      emsgTrackOutputs = arrayOfTrackOutput;
      localObject = additionalEmsgTrackOutput;
      if (localObject != null)
      {
        arrayOfTrackOutput[0] = localObject;
        j = 1;
      }
      else
      {
        j = 0;
      }
      int k = j;
      if ((flags & 0x4) != 0)
      {
        arrayOfTrackOutput[j] = extractorOutput.track(trackBundles.size(), 4);
        k = j + 1;
      }
      localObject = (TrackOutput[])Arrays.copyOf(emsgTrackOutputs, k);
      emsgTrackOutputs = ((TrackOutput[])localObject);
      k = localObject.length;
      for (j = 0; j < k; j++) {
        localObject[j].format(EMSG_FORMAT);
      }
    }
    if (cea608TrackOutputs == null)
    {
      cea608TrackOutputs = new TrackOutput[closedCaptionFormats.size()];
      for (j = i; j < cea608TrackOutputs.length; j++)
      {
        localObject = extractorOutput.track(trackBundles.size() + 1 + j, 3);
        ((TrackOutput)localObject).format((Format)closedCaptionFormats.get(j));
        cea608TrackOutputs[j] = localObject;
      }
    }
  }
  
  private void onContainerAtomRead(Atom.ContainerAtom paramContainerAtom)
    throws ParserException
  {
    int i = type;
    if (i == Atom.TYPE_moov) {
      onMoovContainerAtomRead(paramContainerAtom);
    } else if (i == Atom.TYPE_moof) {
      onMoofContainerAtomRead(paramContainerAtom);
    } else if (!containerAtoms.isEmpty()) {
      ((Atom.ContainerAtom)containerAtoms.peek()).add(paramContainerAtom);
    }
  }
  
  private void onEmsgLeafAtomRead(ParsableByteArray paramParsableByteArray)
  {
    TrackOutput[] arrayOfTrackOutput1 = emsgTrackOutputs;
    if ((arrayOfTrackOutput1 != null) && (arrayOfTrackOutput1.length != 0))
    {
      paramParsableByteArray.setPosition(12);
      int i = paramParsableByteArray.bytesLeft();
      paramParsableByteArray.readNullTerminatedString();
      paramParsableByteArray.readNullTerminatedString();
      long l1 = paramParsableByteArray.readUnsignedInt();
      l1 = Util.scaleLargeTimestamp(paramParsableByteArray.readUnsignedInt(), 1000000L, l1);
      for (arrayOfTrackOutput1 : emsgTrackOutputs)
      {
        paramParsableByteArray.setPosition(12);
        arrayOfTrackOutput1.sampleData(paramParsableByteArray, i);
      }
      long l2 = segmentIndexEarliestPresentationTimeUs;
      if (l2 != -9223372036854775807L)
      {
        l2 += l1;
        paramParsableByteArray = timestampAdjuster;
        l1 = l2;
        if (paramParsableByteArray != null) {
          l1 = paramParsableByteArray.adjustSampleTimestamp(l2);
        }
        paramParsableByteArray = emsgTrackOutputs;
        ??? = paramParsableByteArray.length;
        for (??? = 0; ??? < ???; ???++) {
          paramParsableByteArray[???].sampleMetadata(l1, 1, i, 0, null);
        }
      }
      pendingMetadataSampleInfos.addLast(new MetadataSampleInfo(l1, i));
      pendingMetadataSampleBytes += i;
    }
  }
  
  private void onLeafAtomRead(Atom.LeafAtom paramLeafAtom, long paramLong)
    throws ParserException
  {
    if (!containerAtoms.isEmpty())
    {
      ((Atom.ContainerAtom)containerAtoms.peek()).add(paramLeafAtom);
    }
    else
    {
      int i = type;
      if (i == Atom.TYPE_sidx)
      {
        paramLeafAtom = parseSidx(data, paramLong);
        segmentIndexEarliestPresentationTimeUs = ((Long)first).longValue();
        extractorOutput.seekMap((SeekMap)second);
        haveOutputSeekMap = true;
      }
      else if (i == Atom.TYPE_emsg)
      {
        onEmsgLeafAtomRead(data);
      }
    }
  }
  
  private void onMoofContainerAtomRead(Atom.ContainerAtom paramContainerAtom)
    throws ParserException
  {
    parseMoof(paramContainerAtom, trackBundles, flags, extendedTypeScratch);
    if (sideloadedDrmInitData != null) {
      paramContainerAtom = null;
    } else {
      paramContainerAtom = getDrmInitDataFromAtoms(leafChildren);
    }
    int i = 0;
    int j;
    int k;
    if (paramContainerAtom != null)
    {
      j = trackBundles.size();
      for (k = 0; k < j; k++) {
        ((TrackBundle)trackBundles.valueAt(k)).updateDrmInitData(paramContainerAtom);
      }
    }
    if (pendingSeekTimeUs != -9223372036854775807L)
    {
      j = trackBundles.size();
      for (k = i; k < j; k++) {
        ((TrackBundle)trackBundles.valueAt(k)).seek(pendingSeekTimeUs);
      }
      pendingSeekTimeUs = -9223372036854775807L;
    }
  }
  
  private void onMoovContainerAtomRead(Atom.ContainerAtom paramContainerAtom)
    throws ParserException
  {
    Object localObject1 = sideloadedTrack;
    boolean bool1 = true;
    int i = 0;
    int j = 0;
    boolean bool2;
    if (localObject1 == null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    Assertions.checkState(bool2, "Unexpected moov box.");
    localObject1 = sideloadedDrmInitData;
    if (localObject1 == null) {
      localObject1 = getDrmInitDataFromAtoms(leafChildren);
    }
    Object localObject2 = paramContainerAtom.getContainerAtomOfType(Atom.TYPE_mvex);
    SparseArray localSparseArray = new SparseArray();
    int k = leafChildren.size();
    long l = -9223372036854775807L;
    Object localObject3;
    for (int m = 0; m < k; m++)
    {
      localObject3 = (Atom.LeafAtom)leafChildren.get(m);
      int n = type;
      if (n == Atom.TYPE_trex)
      {
        localObject3 = parseTrex(data);
        localSparseArray.put(((Integer)first).intValue(), second);
      }
      else if (n == Atom.TYPE_mehd)
      {
        l = parseMehd(data);
      }
    }
    localObject2 = new SparseArray();
    m = containerChildren.size();
    for (k = 0; k < m; k++)
    {
      localObject3 = (Atom.ContainerAtom)containerChildren.get(k);
      if (type == Atom.TYPE_trak)
      {
        Atom.LeafAtom localLeafAtom = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_mvhd);
        if ((flags & 0x10) != 0) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        localObject3 = AtomParsers.parseTrak((Atom.ContainerAtom)localObject3, localLeafAtom, l, (DrmInitData)localObject1, bool2, false);
        if (localObject3 != null) {
          ((SparseArray)localObject2).put(id, localObject3);
        }
      }
    }
    k = ((SparseArray)localObject2).size();
    if (trackBundles.size() == 0)
    {
      for (m = j; m < k; m++)
      {
        localObject1 = (Track)((SparseArray)localObject2).valueAt(m);
        paramContainerAtom = new TrackBundle(extractorOutput.track(m, type));
        paramContainerAtom.init((Track)localObject1, getDefaultSampleValues(localSparseArray, id));
        trackBundles.put(id, paramContainerAtom);
        durationUs = Math.max(durationUs, durationUs);
      }
      maybeInitExtraTracks();
      extractorOutput.endTracks();
    }
    else
    {
      if (trackBundles.size() == k) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
      Assertions.checkState(bool2);
      for (m = i; m < k; m++)
      {
        paramContainerAtom = (Track)((SparseArray)localObject2).valueAt(m);
        ((TrackBundle)trackBundles.get(id)).init(paramContainerAtom, getDefaultSampleValues(localSparseArray, id));
      }
    }
  }
  
  private void outputPendingMetadataSamples(long paramLong)
  {
    if (!pendingMetadataSampleInfos.isEmpty())
    {
      MetadataSampleInfo localMetadataSampleInfo = (MetadataSampleInfo)pendingMetadataSampleInfos.removeFirst();
      pendingMetadataSampleBytes -= size;
      long l1 = presentationTimeDeltaUs + paramLong;
      Object localObject = timestampAdjuster;
      long l2 = l1;
      if (localObject != null) {
        l2 = ((TimestampAdjuster)localObject).adjustSampleTimestamp(l1);
      }
      localObject = emsgTrackOutputs;
      int i = localObject.length;
      for (int j = 0; j < i; j++) {
        localObject[j].sampleMetadata(l2, 1, size, pendingMetadataSampleBytes, null);
      }
    }
  }
  
  private static long parseMehd(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.setPosition(8);
    long l;
    if (Atom.parseFullAtomVersion(paramParsableByteArray.readInt()) == 0) {
      l = paramParsableByteArray.readUnsignedInt();
    } else {
      l = paramParsableByteArray.readUnsignedLongToLong();
    }
    return l;
  }
  
  private static void parseMoof(Atom.ContainerAtom paramContainerAtom, SparseArray<TrackBundle> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
    throws ParserException
  {
    int i = containerChildren.size();
    for (int j = 0; j < i; j++)
    {
      Atom.ContainerAtom localContainerAtom = (Atom.ContainerAtom)containerChildren.get(j);
      if (type == Atom.TYPE_traf) {
        parseTraf(localContainerAtom, paramSparseArray, paramInt, paramArrayOfByte);
      }
    }
  }
  
  private static void parseSaio(ParsableByteArray paramParsableByteArray, TrackFragment paramTrackFragment)
    throws ParserException
  {
    paramParsableByteArray.setPosition(8);
    int i = paramParsableByteArray.readInt();
    if ((Atom.parseFullAtomFlags(i) & 0x1) == 1) {
      paramParsableByteArray.skipBytes(8);
    }
    int j = paramParsableByteArray.readUnsignedIntToInt();
    if (j == 1)
    {
      i = Atom.parseFullAtomVersion(i);
      long l1 = auxiliaryDataPosition;
      long l2;
      if (i == 0) {
        l2 = paramParsableByteArray.readUnsignedInt();
      } else {
        l2 = paramParsableByteArray.readUnsignedLongToLong();
      }
      auxiliaryDataPosition = (l1 + l2);
      return;
    }
    throw new ParserException(a.f("Unexpected saio entry count: ", j));
  }
  
  private static void parseSaiz(TrackEncryptionBox paramTrackEncryptionBox, ParsableByteArray paramParsableByteArray, TrackFragment paramTrackFragment)
    throws ParserException
  {
    int i = perSampleIvSize;
    paramParsableByteArray.setPosition(8);
    int j = Atom.parseFullAtomFlags(paramParsableByteArray.readInt());
    boolean bool = true;
    if ((j & 0x1) == 1) {
      paramParsableByteArray.skipBytes(8);
    }
    j = paramParsableByteArray.readUnsignedByte();
    int k = paramParsableByteArray.readUnsignedIntToInt();
    if (k == sampleCount)
    {
      if (j == 0)
      {
        paramTrackEncryptionBox = sampleHasSubsampleEncryptionTable;
        int m = 0;
        j = m;
        for (;;)
        {
          n = j;
          if (m >= k) {
            break;
          }
          n = paramParsableByteArray.readUnsignedByte();
          j += n;
          if (n > i) {
            bool = true;
          } else {
            bool = false;
          }
          paramTrackEncryptionBox[m] = bool;
          m++;
        }
      }
      if (j <= i) {
        bool = false;
      }
      int n = j * k + 0;
      Arrays.fill(sampleHasSubsampleEncryptionTable, 0, k, bool);
      paramTrackFragment.initEncryptionData(n);
      return;
    }
    paramTrackEncryptionBox = a.r("Length mismatch: ", k, ", ");
    paramTrackEncryptionBox.append(sampleCount);
    throw new ParserException(paramTrackEncryptionBox.toString());
  }
  
  private static void parseSenc(ParsableByteArray paramParsableByteArray, int paramInt, TrackFragment paramTrackFragment)
    throws ParserException
  {
    paramParsableByteArray.setPosition(paramInt + 8);
    paramInt = Atom.parseFullAtomFlags(paramParsableByteArray.readInt());
    if ((paramInt & 0x1) == 0)
    {
      boolean bool;
      if ((paramInt & 0x2) != 0) {
        bool = true;
      } else {
        bool = false;
      }
      paramInt = paramParsableByteArray.readUnsignedIntToInt();
      if (paramInt == sampleCount)
      {
        Arrays.fill(sampleHasSubsampleEncryptionTable, 0, paramInt, bool);
        paramTrackFragment.initEncryptionData(paramParsableByteArray.bytesLeft());
        paramTrackFragment.fillEncryptionData(paramParsableByteArray);
        return;
      }
      paramParsableByteArray = a.r("Length mismatch: ", paramInt, ", ");
      paramParsableByteArray.append(sampleCount);
      throw new ParserException(paramParsableByteArray.toString());
    }
    throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
  }
  
  private static void parseSenc(ParsableByteArray paramParsableByteArray, TrackFragment paramTrackFragment)
    throws ParserException
  {
    parseSenc(paramParsableByteArray, 0, paramTrackFragment);
  }
  
  private static void parseSgpd(ParsableByteArray paramParsableByteArray1, ParsableByteArray paramParsableByteArray2, String paramString, TrackFragment paramTrackFragment)
    throws ParserException
  {
    paramParsableByteArray1.setPosition(8);
    int i = paramParsableByteArray1.readInt();
    int j = paramParsableByteArray1.readInt();
    int k = SAMPLE_GROUP_TYPE_seig;
    if (j != k) {
      return;
    }
    if (Atom.parseFullAtomVersion(i) == 1) {
      paramParsableByteArray1.skipBytes(4);
    }
    if (paramParsableByteArray1.readInt() == 1)
    {
      paramParsableByteArray2.setPosition(8);
      i = paramParsableByteArray2.readInt();
      if (paramParsableByteArray2.readInt() != k) {
        return;
      }
      k = Atom.parseFullAtomVersion(i);
      if (k == 1)
      {
        if (paramParsableByteArray2.readUnsignedInt() == 0L) {
          throw new ParserException("Variable length description in sgpd found (unsupported)");
        }
      }
      else if (k >= 2) {
        paramParsableByteArray2.skipBytes(4);
      }
      if (paramParsableByteArray2.readUnsignedInt() == 1L)
      {
        paramParsableByteArray2.skipBytes(1);
        j = paramParsableByteArray2.readUnsignedByte();
        boolean bool;
        if (paramParsableByteArray2.readUnsignedByte() == 1) {
          bool = true;
        } else {
          bool = false;
        }
        if (!bool) {
          return;
        }
        i = paramParsableByteArray2.readUnsignedByte();
        byte[] arrayOfByte = new byte[16];
        paramParsableByteArray2.readBytes(arrayOfByte, 0, 16);
        if ((bool) && (i == 0))
        {
          k = paramParsableByteArray2.readUnsignedByte();
          paramParsableByteArray1 = new byte[k];
          paramParsableByteArray2.readBytes(paramParsableByteArray1, 0, k);
        }
        else
        {
          paramParsableByteArray1 = null;
        }
        definesEncryptionData = true;
        trackEncryptionBox = new TrackEncryptionBox(bool, paramString, i, arrayOfByte, (j & 0xF0) >> 4, j & 0xF, paramParsableByteArray1);
        return;
      }
      throw new ParserException("Entry count in sgpd != 1 (unsupported).");
    }
    throw new ParserException("Entry count in sbgp != 1 (unsupported).");
  }
  
  private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray paramParsableByteArray, long paramLong)
    throws ParserException
  {
    paramParsableByteArray.setPosition(8);
    int i = Atom.parseFullAtomVersion(paramParsableByteArray.readInt());
    paramParsableByteArray.skipBytes(4);
    long l1 = paramParsableByteArray.readUnsignedInt();
    long l2;
    if (i == 0)
    {
      l2 = paramParsableByteArray.readUnsignedInt();
      l3 = paramParsableByteArray.readUnsignedInt();
    }
    else
    {
      l2 = paramParsableByteArray.readUnsignedLongToLong();
      l3 = paramParsableByteArray.readUnsignedLongToLong();
    }
    paramLong = l3 + paramLong;
    long l4 = Util.scaleLargeTimestamp(l2, 1000000L, l1);
    paramParsableByteArray.skipBytes(2);
    int j = paramParsableByteArray.readUnsignedShort();
    int[] arrayOfInt = new int[j];
    long[] arrayOfLong1 = new long[j];
    long[] arrayOfLong2 = new long[j];
    long[] arrayOfLong3 = new long[j];
    long l3 = l4;
    i = 0;
    while (i < j)
    {
      int k = paramParsableByteArray.readInt();
      if ((k & 0x80000000) == 0)
      {
        long l5 = paramParsableByteArray.readUnsignedInt();
        arrayOfInt[i] = (k & 0x7FFFFFFF);
        arrayOfLong1[i] = paramLong;
        arrayOfLong3[i] = l3;
        l2 += l5;
        l3 = Util.scaleLargeTimestamp(l2, 1000000L, l1);
        arrayOfLong2[i] = (l3 - arrayOfLong3[i]);
        paramParsableByteArray.skipBytes(4);
        paramLong += arrayOfInt[i];
        i++;
      }
      else
      {
        throw new ParserException("Unhandled indirect reference");
      }
    }
    return Pair.create(Long.valueOf(l4), new ChunkIndex(arrayOfInt, arrayOfLong1, arrayOfLong2, arrayOfLong3));
  }
  
  private static long parseTfdt(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.setPosition(8);
    long l;
    if (Atom.parseFullAtomVersion(paramParsableByteArray.readInt()) == 1) {
      l = paramParsableByteArray.readUnsignedLongToLong();
    } else {
      l = paramParsableByteArray.readUnsignedInt();
    }
    return l;
  }
  
  private static TrackBundle parseTfhd(ParsableByteArray paramParsableByteArray, SparseArray<TrackBundle> paramSparseArray)
  {
    paramParsableByteArray.setPosition(8);
    int i = Atom.parseFullAtomFlags(paramParsableByteArray.readInt());
    paramSparseArray = getTrackBundle(paramSparseArray, paramParsableByteArray.readInt());
    if (paramSparseArray == null) {
      return null;
    }
    if ((i & 0x1) != 0)
    {
      long l = paramParsableByteArray.readUnsignedLongToLong();
      localObject = fragment;
      dataPosition = l;
      auxiliaryDataPosition = l;
    }
    Object localObject = defaultSampleValues;
    int j;
    if ((i & 0x2) != 0) {
      j = paramParsableByteArray.readUnsignedIntToInt() - 1;
    } else {
      j = sampleDescriptionIndex;
    }
    int k;
    if ((i & 0x8) != 0) {
      k = paramParsableByteArray.readUnsignedIntToInt();
    } else {
      k = duration;
    }
    int m;
    if ((i & 0x10) != 0) {
      m = paramParsableByteArray.readUnsignedIntToInt();
    } else {
      m = size;
    }
    if ((i & 0x20) != 0) {
      i = paramParsableByteArray.readUnsignedIntToInt();
    } else {
      i = flags;
    }
    fragment.header = new DefaultSampleValues(j, k, m, i);
    return paramSparseArray;
  }
  
  private static void parseTraf(Atom.ContainerAtom paramContainerAtom, SparseArray<TrackBundle> paramSparseArray, int paramInt, byte[] paramArrayOfByte)
    throws ParserException
  {
    paramSparseArray = parseTfhd(getLeafAtomOfTypeTYPE_tfhddata, paramSparseArray);
    if (paramSparseArray == null) {
      return;
    }
    TrackFragment localTrackFragment = fragment;
    long l1 = nextFragmentDecodeTime;
    paramSparseArray.reset();
    int i = Atom.TYPE_tfdt;
    long l2 = l1;
    if (paramContainerAtom.getLeafAtomOfType(i) != null)
    {
      l2 = l1;
      if ((paramInt & 0x2) == 0) {
        l2 = parseTfdt(getLeafAtomOfTypedata);
      }
    }
    parseTruns(paramContainerAtom, paramSparseArray, l2, paramInt);
    paramSparseArray = track.getSampleDescriptionEncryptionBox(header.sampleDescriptionIndex);
    Object localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_saiz);
    if (localObject1 != null) {
      parseSaiz(paramSparseArray, data, localTrackFragment);
    }
    localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_saio);
    if (localObject1 != null) {
      parseSaio(data, localTrackFragment);
    }
    localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_senc);
    if (localObject1 != null) {
      parseSenc(data, localTrackFragment);
    }
    localObject1 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_sbgp);
    Object localObject2 = paramContainerAtom.getLeafAtomOfType(Atom.TYPE_sgpd);
    if ((localObject1 != null) && (localObject2 != null))
    {
      localObject1 = data;
      localObject2 = data;
      if (paramSparseArray != null) {
        paramSparseArray = schemeType;
      } else {
        paramSparseArray = null;
      }
      parseSgpd((ParsableByteArray)localObject1, (ParsableByteArray)localObject2, paramSparseArray, localTrackFragment);
    }
    i = leafChildren.size();
    for (paramInt = 0; paramInt < i; paramInt++)
    {
      paramSparseArray = (Atom.LeafAtom)leafChildren.get(paramInt);
      if (type == Atom.TYPE_uuid) {
        parseUuid(data, localTrackFragment, paramArrayOfByte);
      }
    }
  }
  
  private static Pair<Integer, DefaultSampleValues> parseTrex(ParsableByteArray paramParsableByteArray)
  {
    paramParsableByteArray.setPosition(12);
    return Pair.create(Integer.valueOf(paramParsableByteArray.readInt()), new DefaultSampleValues(paramParsableByteArray.readUnsignedIntToInt() - 1, paramParsableByteArray.readUnsignedIntToInt(), paramParsableByteArray.readUnsignedIntToInt(), paramParsableByteArray.readInt()));
  }
  
  private static int parseTrun(TrackBundle paramTrackBundle, int paramInt1, long paramLong, int paramInt2, ParsableByteArray paramParsableByteArray, int paramInt3)
  {
    paramParsableByteArray.setPosition(8);
    int i = Atom.parseFullAtomFlags(paramParsableByteArray.readInt());
    Track localTrack = track;
    paramTrackBundle = fragment;
    DefaultSampleValues localDefaultSampleValues = header;
    trunLength[paramInt1] = paramParsableByteArray.readUnsignedIntToInt();
    Object localObject = trunDataPosition;
    long l1 = dataPosition;
    localObject[paramInt1] = l1;
    if ((i & 0x1) != 0) {
      localObject[paramInt1] = (l1 + paramParsableByteArray.readInt());
    }
    int j;
    if ((i & 0x4) != 0) {
      j = 1;
    } else {
      j = 0;
    }
    int k = flags;
    if (j != 0) {
      k = paramParsableByteArray.readUnsignedIntToInt();
    }
    int m;
    if ((i & 0x100) != 0) {
      m = 1;
    } else {
      m = 0;
    }
    int n;
    if ((i & 0x200) != 0) {
      n = 1;
    } else {
      n = 0;
    }
    int i1;
    if ((i & 0x400) != 0) {
      i1 = 1;
    } else {
      i1 = 0;
    }
    if ((i & 0x800) != 0) {
      i = 1;
    } else {
      i = 0;
    }
    localObject = editListDurations;
    long l2 = 0L;
    l1 = l2;
    if (localObject != null)
    {
      l1 = l2;
      if (localObject.length == 1)
      {
        l1 = l2;
        if (localObject[0] == 0L) {
          l1 = Util.scaleLargeTimestamp(editListMediaTimes[0], 1000L, timescale);
        }
      }
    }
    int[] arrayOfInt1 = sampleSizeTable;
    int[] arrayOfInt2 = sampleCompositionTimeOffsetTable;
    long[] arrayOfLong = sampleDecodingTimeTable;
    localObject = sampleIsSyncFrameTable;
    if ((type == 2) && ((paramInt2 & 0x1) != 0)) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    int i2 = paramInt3 + trunLength[paramInt1];
    long l3 = timescale;
    if (paramInt1 > 0) {
      paramLong = nextFragmentDecodeTime;
    }
    l2 = paramLong;
    paramLong = l3;
    while (paramInt3 < i2)
    {
      int i3;
      if (m != 0) {
        i3 = paramParsableByteArray.readUnsignedIntToInt();
      } else {
        i3 = duration;
      }
      int i4;
      if (n != 0) {
        i4 = paramParsableByteArray.readUnsignedIntToInt();
      } else {
        i4 = size;
      }
      if ((paramInt3 == 0) && (j != 0)) {
        paramInt1 = k;
      } else if (i1 != 0) {
        paramInt1 = paramParsableByteArray.readInt();
      } else {
        paramInt1 = flags;
      }
      if (i != 0) {
        arrayOfInt2[paramInt3] = ((int)(paramParsableByteArray.readInt() * 1000L / paramLong));
      } else {
        arrayOfInt2[paramInt3] = 0;
      }
      arrayOfLong[paramInt3] = (Util.scaleLargeTimestamp(l2, 1000L, paramLong) - l1);
      arrayOfInt1[paramInt3] = i4;
      int i5;
      if (((paramInt1 >> 16 & 0x1) == 0) && ((paramInt2 == 0) || (paramInt3 == 0))) {
        i5 = 1;
      } else {
        i5 = 0;
      }
      localObject[paramInt3] = i5;
      l3 = i3;
      paramInt3++;
      l2 += l3;
    }
    nextFragmentDecodeTime = l2;
    return i2;
  }
  
  private static void parseTruns(Atom.ContainerAtom paramContainerAtom, TrackBundle paramTrackBundle, long paramLong, int paramInt)
  {
    paramContainerAtom = leafChildren;
    int i = paramContainerAtom.size();
    int j = 0;
    int k = 0;
    int m = k;
    int n = m;
    int i1 = m;
    Object localObject;
    int i2;
    while (k < i)
    {
      localObject = (Atom.LeafAtom)paramContainerAtom.get(k);
      i2 = i1;
      m = n;
      if (type == Atom.TYPE_trun)
      {
        localObject = data;
        ((ParsableByteArray)localObject).setPosition(12);
        int i3 = ((ParsableByteArray)localObject).readUnsignedIntToInt();
        i2 = i1;
        m = n;
        if (i3 > 0)
        {
          m = n + i3;
          i2 = i1 + 1;
        }
      }
      k++;
      i1 = i2;
      n = m;
    }
    currentTrackRunIndex = 0;
    currentSampleInTrackRun = 0;
    currentSampleIndex = 0;
    fragment.initTables(i1, n);
    m = 0;
    i1 = m;
    n = j;
    while (n < i)
    {
      localObject = (Atom.LeafAtom)paramContainerAtom.get(n);
      i2 = m;
      k = i1;
      if (type == Atom.TYPE_trun)
      {
        k = parseTrun(paramTrackBundle, m, paramLong, paramInt, data, i1);
        i2 = m + 1;
      }
      n++;
      m = i2;
      i1 = k;
    }
  }
  
  private static void parseUuid(ParsableByteArray paramParsableByteArray, TrackFragment paramTrackFragment, byte[] paramArrayOfByte)
    throws ParserException
  {
    paramParsableByteArray.setPosition(8);
    paramParsableByteArray.readBytes(paramArrayOfByte, 0, 16);
    if (!Arrays.equals(paramArrayOfByte, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
      return;
    }
    parseSenc(paramParsableByteArray, 16, paramTrackFragment);
  }
  
  private void processAtomEnded(long paramLong)
    throws ParserException
  {
    while ((!containerAtoms.isEmpty()) && (containerAtoms.peek()).endPosition == paramLong)) {
      onContainerAtomRead((Atom.ContainerAtom)containerAtoms.pop());
    }
    enterReadingAtomHeaderState();
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
      l1 = paramExtractorInput.getPosition() - atomHeaderBytesRead;
      if (atomType == Atom.TYPE_moof)
      {
        int i = trackBundles.size();
        for (j = 0; j < i; j++)
        {
          TrackFragment localTrackFragment = trackBundles.valueAt(j)).fragment;
          atomPosition = l1;
          auxiliaryDataPosition = l1;
          dataPosition = l1;
        }
      }
      int j = atomType;
      if (j == Atom.TYPE_mdat)
      {
        currentTrackBundle = null;
        endOfMdatPosition = (atomSize + l1);
        if (!haveOutputSeekMap)
        {
          extractorOutput.seekMap(new SeekMap.Unseekable(durationUs, l1));
          haveOutputSeekMap = true;
        }
        parserState = 2;
        return true;
      }
      if (shouldParseContainerAtom(j))
      {
        l1 = paramExtractorInput.getPosition() + atomSize - 8L;
        containerAtoms.push(new Atom.ContainerAtom(atomType, l1));
        if (atomSize == atomHeaderBytesRead) {
          processAtomEnded(l1);
        } else {
          enterReadingAtomHeaderState();
        }
      }
      else if (shouldParseLeafAtom(atomType))
      {
        if (atomHeaderBytesRead == 8)
        {
          l1 = atomSize;
          if (l1 <= 2147483647L)
          {
            paramExtractorInput = new ParsableByteArray((int)l1);
            atomData = paramExtractorInput;
            System.arraycopy(atomHeader.data, 0, data, 0, 8);
            parserState = 1;
          }
          else
          {
            throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
          }
        }
        else
        {
          throw new ParserException("Leaf atom defines extended atom size (unsupported).");
        }
      }
      else
      {
        if (atomSize > 2147483647L) {
          break label551;
        }
        atomData = null;
        parserState = 1;
      }
      return true;
      label551:
      throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
    }
    throw new ParserException("Atom size less than header length (unsupported).");
  }
  
  private void readAtomPayload(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    int i = (int)atomSize - atomHeaderBytesRead;
    ParsableByteArray localParsableByteArray = atomData;
    if (localParsableByteArray != null)
    {
      paramExtractorInput.readFully(data, 8, i);
      onLeafAtomRead(new Atom.LeafAtom(atomType, atomData), paramExtractorInput.getPosition());
    }
    else
    {
      paramExtractorInput.skipFully(i);
    }
    processAtomEnded(paramExtractorInput.getPosition());
  }
  
  private void readEncryptionData(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    int i = trackBundles.size();
    Object localObject1 = null;
    long l1 = Long.MAX_VALUE;
    int j = 0;
    while (j < i)
    {
      TrackFragment localTrackFragment = trackBundles.valueAt(j)).fragment;
      Object localObject2 = localObject1;
      long l2 = l1;
      if (sampleEncryptionDataNeedsFill)
      {
        long l3 = auxiliaryDataPosition;
        localObject2 = localObject1;
        l2 = l1;
        if (l3 < l1)
        {
          localObject2 = (TrackBundle)trackBundles.valueAt(j);
          l2 = l3;
        }
      }
      j++;
      localObject1 = localObject2;
      l1 = l2;
    }
    if (localObject1 == null)
    {
      parserState = 3;
      return;
    }
    j = (int)(l1 - paramExtractorInput.getPosition());
    if (j >= 0)
    {
      paramExtractorInput.skipFully(j);
      fragment.fillEncryptionData(paramExtractorInput);
      return;
    }
    throw new ParserException("Offset to encryption data was negative.");
  }
  
  private boolean readSample(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    if (parserState == 3)
    {
      if (currentTrackBundle == null)
      {
        localObject1 = getNextFragmentRun(trackBundles);
        if (localObject1 == null)
        {
          i = (int)(endOfMdatPosition - paramExtractorInput.getPosition());
          if (i >= 0)
          {
            paramExtractorInput.skipFully(i);
            enterReadingAtomHeaderState();
            return false;
          }
          throw new ParserException("Offset to end of mdat was negative.");
        }
        j = (int)(fragment.trunDataPosition[currentTrackRunIndex] - paramExtractorInput.getPosition());
        i = j;
        if (j < 0)
        {
          Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
          i = 0;
        }
        paramExtractorInput.skipFully(i);
        currentTrackBundle = ((TrackBundle)localObject1);
      }
      localObject1 = currentTrackBundle;
      localObject2 = fragment.sampleSizeTable;
      j = currentSampleIndex;
      i = localObject2[j];
      sampleSize = i;
      if (j < firstSampleToOutputIndex)
      {
        paramExtractorInput.skipFully(i);
        TrackBundle.access$000(currentTrackBundle);
        if (!currentTrackBundle.next()) {
          currentTrackBundle = null;
        }
        parserState = 3;
        return true;
      }
      if (track.sampleTransformation == 1)
      {
        sampleSize = (i - 8);
        paramExtractorInput.skipFully(8);
      }
      i = currentTrackBundle.outputSampleEncryptionData();
      sampleBytesWritten = i;
      sampleSize += i;
      parserState = 4;
      sampleCurrentNalBytesRemaining = 0;
    }
    Object localObject3 = currentTrackBundle;
    TrackFragment localTrackFragment = fragment;
    Object localObject2 = track;
    Object localObject1 = output;
    int j = currentSampleIndex;
    long l1 = localTrackFragment.getSamplePresentationTime(j) * 1000L;
    localObject3 = timestampAdjuster;
    long l2 = l1;
    if (localObject3 != null) {
      l2 = ((TimestampAdjuster)localObject3).adjustSampleTimestamp(l1);
    }
    int k = nalUnitLengthFieldLength;
    int m;
    if (k != 0)
    {
      localObject3 = nalPrefix.data;
      localObject3[0] = ((byte)0);
      localObject3[1] = ((byte)0);
      localObject3[2] = ((byte)0);
      m = 4 - k;
      while (sampleBytesWritten < sampleSize)
      {
        i = sampleCurrentNalBytesRemaining;
        if (i == 0)
        {
          paramExtractorInput.readFully((byte[])localObject3, m, k + 1);
          nalPrefix.setPosition(0);
          sampleCurrentNalBytesRemaining = (nalPrefix.readUnsignedIntToInt() - 1);
          nalStartCode.setPosition(0);
          ((TrackOutput)localObject1).sampleData(nalStartCode, 4);
          ((TrackOutput)localObject1).sampleData(nalPrefix, 1);
          boolean bool;
          if ((cea608TrackOutputs.length > 0) && (NalUnitUtil.isNalUnitSei(format.sampleMimeType, localObject3[4]))) {
            bool = true;
          } else {
            bool = false;
          }
          processSeiNalUnitPayload = bool;
          sampleBytesWritten += 5;
          sampleSize += m;
        }
        else
        {
          if (processSeiNalUnitPayload)
          {
            nalBuffer.reset(i);
            paramExtractorInput.readFully(nalBuffer.data, 0, sampleCurrentNalBytesRemaining);
            ((TrackOutput)localObject1).sampleData(nalBuffer, sampleCurrentNalBytesRemaining);
            i = sampleCurrentNalBytesRemaining;
            ParsableByteArray localParsableByteArray = nalBuffer;
            int n = NalUnitUtil.unescapeStream(data, localParsableByteArray.limit());
            nalBuffer.setPosition("video/hevc".equals(format.sampleMimeType));
            nalBuffer.setLimit(n);
            CeaUtil.consume(l2, nalBuffer, cea608TrackOutputs);
          }
          else
          {
            i = ((TrackOutput)localObject1).sampleData(paramExtractorInput, i, false);
          }
          sampleBytesWritten += i;
          sampleCurrentNalBytesRemaining -= i;
        }
      }
    }
    for (;;)
    {
      m = sampleBytesWritten;
      i = sampleSize;
      if (m >= i) {
        break;
      }
      i = ((TrackOutput)localObject1).sampleData(paramExtractorInput, i - m, false);
      sampleBytesWritten += i;
    }
    int i = sampleIsSyncFrameTable[j];
    paramExtractorInput = TrackBundle.access$100(currentTrackBundle);
    if (paramExtractorInput != null)
    {
      paramExtractorInput = cryptoData;
      i |= 0x40000000;
    }
    else
    {
      paramExtractorInput = null;
    }
    ((TrackOutput)localObject1).sampleMetadata(l2, i, sampleSize, 0, paramExtractorInput);
    outputPendingMetadataSamples(l2);
    if (!currentTrackBundle.next()) {
      currentTrackBundle = null;
    }
    parserState = 3;
    return true;
  }
  
  private static boolean shouldParseContainerAtom(int paramInt)
  {
    boolean bool;
    if ((paramInt != Atom.TYPE_moov) && (paramInt != Atom.TYPE_trak) && (paramInt != Atom.TYPE_mdia) && (paramInt != Atom.TYPE_minf) && (paramInt != Atom.TYPE_stbl) && (paramInt != Atom.TYPE_moof) && (paramInt != Atom.TYPE_traf) && (paramInt != Atom.TYPE_mvex) && (paramInt != Atom.TYPE_edts)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private static boolean shouldParseLeafAtom(int paramInt)
  {
    boolean bool;
    if ((paramInt != Atom.TYPE_hdlr) && (paramInt != Atom.TYPE_mdhd) && (paramInt != Atom.TYPE_mvhd) && (paramInt != Atom.TYPE_sidx) && (paramInt != Atom.TYPE_stsd) && (paramInt != Atom.TYPE_tfdt) && (paramInt != Atom.TYPE_tfhd) && (paramInt != Atom.TYPE_tkhd) && (paramInt != Atom.TYPE_trex) && (paramInt != Atom.TYPE_trun) && (paramInt != Atom.TYPE_pssh) && (paramInt != Atom.TYPE_saiz) && (paramInt != Atom.TYPE_saio) && (paramInt != Atom.TYPE_senc) && (paramInt != Atom.TYPE_uuid) && (paramInt != Atom.TYPE_sbgp) && (paramInt != Atom.TYPE_sgpd) && (paramInt != Atom.TYPE_elst) && (paramInt != Atom.TYPE_mehd) && (paramInt != Atom.TYPE_emsg)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void init(ExtractorOutput paramExtractorOutput)
  {
    extractorOutput = paramExtractorOutput;
    Track localTrack = sideloadedTrack;
    if (localTrack != null)
    {
      paramExtractorOutput = new TrackBundle(paramExtractorOutput.track(0, type));
      paramExtractorOutput.init(sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
      trackBundles.put(0, paramExtractorOutput);
      maybeInitExtraTracks();
      extractorOutput.endTracks();
    }
  }
  
  public int read(ExtractorInput paramExtractorInput, PositionHolder paramPositionHolder)
    throws IOException, InterruptedException
  {
    do
    {
      for (;;)
      {
        int i = parserState;
        if (i == 0) {
          break;
        }
        if (i != 1)
        {
          if (i != 2)
          {
            if (readSample(paramExtractorInput)) {
              return 0;
            }
          }
          else {
            readEncryptionData(paramExtractorInput);
          }
        }
        else {
          readAtomPayload(paramExtractorInput);
        }
      }
    } while (readAtomHeader(paramExtractorInput));
    return -1;
  }
  
  public void release() {}
  
  public void seek(long paramLong1, long paramLong2)
  {
    int i = trackBundles.size();
    for (int j = 0; j < i; j++) {
      ((TrackBundle)trackBundles.valueAt(j)).reset();
    }
    pendingMetadataSampleInfos.clear();
    pendingMetadataSampleBytes = 0;
    pendingSeekTimeUs = paramLong2;
    containerAtoms.clear();
    enterReadingAtomHeaderState();
  }
  
  public boolean sniff(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    return Sniffer.sniffFragmented(paramExtractorInput);
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
  
  public static final class MetadataSampleInfo
  {
    public final long presentationTimeDeltaUs;
    public final int size;
    
    public MetadataSampleInfo(long paramLong, int paramInt)
    {
      presentationTimeDeltaUs = paramLong;
      size = paramInt;
    }
  }
  
  public static final class TrackBundle
  {
    public int currentSampleInTrackRun;
    public int currentSampleIndex;
    public int currentTrackRunIndex;
    private final ParsableByteArray defaultInitializationVector;
    public DefaultSampleValues defaultSampleValues;
    private final ParsableByteArray encryptionSignalByte;
    public int firstSampleToOutputIndex;
    public final TrackFragment fragment;
    public final TrackOutput output;
    public Track track;
    
    public TrackBundle(TrackOutput paramTrackOutput)
    {
      output = paramTrackOutput;
      fragment = new TrackFragment();
      encryptionSignalByte = new ParsableByteArray(1);
      defaultInitializationVector = new ParsableByteArray();
    }
    
    private TrackEncryptionBox getEncryptionBoxIfEncrypted()
    {
      Object localObject = fragment;
      int i = header.sampleDescriptionIndex;
      localObject = trackEncryptionBox;
      if (localObject == null) {
        localObject = track.getSampleDescriptionEncryptionBox(i);
      }
      if ((localObject == null) || (!isEncrypted)) {
        localObject = null;
      }
      return (TrackEncryptionBox)localObject;
    }
    
    private void skipSampleEncryptionData()
    {
      TrackEncryptionBox localTrackEncryptionBox = getEncryptionBoxIfEncrypted();
      if (localTrackEncryptionBox == null) {
        return;
      }
      ParsableByteArray localParsableByteArray = fragment.sampleEncryptionData;
      int i = perSampleIvSize;
      if (i != 0) {
        localParsableByteArray.skipBytes(i);
      }
      if (fragment.sampleHasSubsampleEncryptionTable(currentSampleIndex)) {
        localParsableByteArray.skipBytes(localParsableByteArray.readUnsignedShort() * 6);
      }
    }
    
    public void init(Track paramTrack, DefaultSampleValues paramDefaultSampleValues)
    {
      track = ((Track)Assertions.checkNotNull(paramTrack));
      defaultSampleValues = ((DefaultSampleValues)Assertions.checkNotNull(paramDefaultSampleValues));
      output.format(format);
      reset();
    }
    
    public boolean next()
    {
      currentSampleIndex += 1;
      int i = currentSampleInTrackRun + 1;
      currentSampleInTrackRun = i;
      int[] arrayOfInt = fragment.trunLength;
      int j = currentTrackRunIndex;
      if (i == arrayOfInt[j])
      {
        currentTrackRunIndex = (j + 1);
        currentSampleInTrackRun = 0;
        return false;
      }
      return true;
    }
    
    public int outputSampleEncryptionData()
    {
      Object localObject1 = getEncryptionBoxIfEncrypted();
      if (localObject1 == null) {
        return 0;
      }
      int i = perSampleIvSize;
      if (i != 0)
      {
        localObject1 = fragment.sampleEncryptionData;
      }
      else
      {
        localObject2 = defaultInitializationVector;
        defaultInitializationVector.reset((byte[])localObject2, localObject2.length);
        localObject1 = defaultInitializationVector;
        i = localObject2.length;
      }
      boolean bool = fragment.sampleHasSubsampleEncryptionTable(currentSampleIndex);
      Object localObject2 = encryptionSignalByte;
      byte[] arrayOfByte = data;
      if (bool) {
        j = 128;
      } else {
        j = 0;
      }
      arrayOfByte[0] = ((byte)(byte)(j | i));
      ((ParsableByteArray)localObject2).setPosition(0);
      output.sampleData(encryptionSignalByte, 1);
      output.sampleData((ParsableByteArray)localObject1, i);
      if (!bool) {
        return i + 1;
      }
      localObject1 = fragment.sampleEncryptionData;
      int j = ((ParsableByteArray)localObject1).readUnsignedShort();
      ((ParsableByteArray)localObject1).skipBytes(-2);
      j = j * 6 + 2;
      output.sampleData((ParsableByteArray)localObject1, j);
      return i + 1 + j;
    }
    
    public void reset()
    {
      fragment.reset();
      currentSampleIndex = 0;
      currentTrackRunIndex = 0;
      currentSampleInTrackRun = 0;
      firstSampleToOutputIndex = 0;
    }
    
    public void seek(long paramLong)
    {
      paramLong = C.usToMs(paramLong);
      for (int i = currentSampleIndex;; i++)
      {
        TrackFragment localTrackFragment = fragment;
        if ((i >= sampleCount) || (localTrackFragment.getSamplePresentationTime(i) >= paramLong)) {
          break;
        }
        if (fragment.sampleIsSyncFrameTable[i] != 0) {
          firstSampleToOutputIndex = i;
        }
      }
    }
    
    public void updateDrmInitData(DrmInitData paramDrmInitData)
    {
      Object localObject = track.getSampleDescriptionEncryptionBox(fragment.header.sampleDescriptionIndex);
      if (localObject != null) {
        localObject = schemeType;
      } else {
        localObject = null;
      }
      output.format(track.format.copyWithDrmInitData(paramDrmInitData.copyWithSchemeType((String)localObject)));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */