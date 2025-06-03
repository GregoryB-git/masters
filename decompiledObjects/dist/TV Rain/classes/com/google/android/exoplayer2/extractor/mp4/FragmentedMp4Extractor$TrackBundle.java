package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

final class FragmentedMp4Extractor$TrackBundle
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
  
  public FragmentedMp4Extractor$TrackBundle(TrackOutput paramTrackOutput)
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

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor.TrackBundle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */