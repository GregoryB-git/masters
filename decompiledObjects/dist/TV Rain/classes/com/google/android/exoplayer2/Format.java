package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import z2;

public final class Format
  implements Parcelable
{
  public static final Parcelable.Creator<Format> CREATOR = new Parcelable.Creator()
  {
    public Format createFromParcel(Parcel paramAnonymousParcel)
    {
      return new Format(paramAnonymousParcel);
    }
    
    public Format[] newArray(int paramAnonymousInt)
    {
      return new Format[paramAnonymousInt];
    }
  };
  public static final int NO_VALUE = -1;
  public static final long OFFSET_SAMPLE_RELATIVE = Long.MAX_VALUE;
  public final int accessibilityChannel;
  public final int bitrate;
  public final int channelCount;
  @Nullable
  public final String codecs;
  @Nullable
  public final ColorInfo colorInfo;
  @Nullable
  public final String containerMimeType;
  @Nullable
  public final DrmInitData drmInitData;
  public final int encoderDelay;
  public final int encoderPadding;
  public final float frameRate;
  private int hashCode;
  public final int height;
  @Nullable
  public final String id;
  public final List<byte[]> initializationData;
  @Nullable
  public final String label;
  @Nullable
  public final String language;
  public final int maxInputSize;
  @Nullable
  public final Metadata metadata;
  public final int pcmEncoding;
  public final float pixelWidthHeightRatio;
  @Nullable
  public final byte[] projectionData;
  public final int rotationDegrees;
  @Nullable
  public final String sampleMimeType;
  public final int sampleRate;
  public final int selectionFlags;
  public final int stereoMode;
  public final long subsampleOffsetUs;
  public final int width;
  
  public Format(Parcel paramParcel)
  {
    id = paramParcel.readString();
    label = paramParcel.readString();
    containerMimeType = paramParcel.readString();
    sampleMimeType = paramParcel.readString();
    codecs = paramParcel.readString();
    bitrate = paramParcel.readInt();
    maxInputSize = paramParcel.readInt();
    width = paramParcel.readInt();
    height = paramParcel.readInt();
    frameRate = paramParcel.readFloat();
    rotationDegrees = paramParcel.readInt();
    pixelWidthHeightRatio = paramParcel.readFloat();
    byte[] arrayOfByte;
    if (Util.readBoolean(paramParcel)) {
      arrayOfByte = paramParcel.createByteArray();
    } else {
      arrayOfByte = null;
    }
    projectionData = arrayOfByte;
    stereoMode = paramParcel.readInt();
    colorInfo = ((ColorInfo)paramParcel.readParcelable(ColorInfo.class.getClassLoader()));
    channelCount = paramParcel.readInt();
    sampleRate = paramParcel.readInt();
    pcmEncoding = paramParcel.readInt();
    encoderDelay = paramParcel.readInt();
    encoderPadding = paramParcel.readInt();
    selectionFlags = paramParcel.readInt();
    language = paramParcel.readString();
    accessibilityChannel = paramParcel.readInt();
    subsampleOffsetUs = paramParcel.readLong();
    int i = paramParcel.readInt();
    initializationData = new ArrayList(i);
    for (int j = 0; j < i; j++) {
      initializationData.add(paramParcel.createByteArray());
    }
    drmInitData = ((DrmInitData)paramParcel.readParcelable(DrmInitData.class.getClassLoader()));
    metadata = ((Metadata)paramParcel.readParcelable(Metadata.class.getClassLoader()));
  }
  
  public Format(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, int paramInt5, float paramFloat2, @Nullable byte[] paramArrayOfByte, int paramInt6, @Nullable ColorInfo paramColorInfo, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, @Nullable String paramString6, int paramInt13, long paramLong, @Nullable List<byte[]> paramList, @Nullable DrmInitData paramDrmInitData, @Nullable Metadata paramMetadata)
  {
    id = paramString1;
    label = paramString2;
    containerMimeType = paramString3;
    sampleMimeType = paramString4;
    codecs = paramString5;
    bitrate = paramInt1;
    maxInputSize = paramInt2;
    width = paramInt3;
    height = paramInt4;
    frameRate = paramFloat1;
    paramInt1 = paramInt5;
    if (paramInt5 == -1) {
      paramInt1 = 0;
    }
    rotationDegrees = paramInt1;
    if (paramFloat2 == -1.0F) {
      paramFloat1 = 1.0F;
    } else {
      paramFloat1 = paramFloat2;
    }
    pixelWidthHeightRatio = paramFloat1;
    projectionData = paramArrayOfByte;
    stereoMode = paramInt6;
    colorInfo = paramColorInfo;
    channelCount = paramInt7;
    sampleRate = paramInt8;
    pcmEncoding = paramInt9;
    paramInt1 = paramInt10;
    if (paramInt10 == -1) {
      paramInt1 = 0;
    }
    encoderDelay = paramInt1;
    paramInt1 = paramInt11;
    if (paramInt11 == -1) {
      paramInt1 = 0;
    }
    encoderPadding = paramInt1;
    selectionFlags = paramInt12;
    language = paramString6;
    accessibilityChannel = paramInt13;
    subsampleOffsetUs = paramLong;
    if (paramList == null) {
      paramList = Collections.emptyList();
    }
    initializationData = paramList;
    drmInitData = paramDrmInitData;
    metadata = paramMetadata;
  }
  
  @Deprecated
  public static Format createAudioContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, int paramInt1, int paramInt2, int paramInt3, @Nullable List<byte[]> paramList, int paramInt4, @Nullable String paramString5)
  {
    return createAudioContainerFormat(paramString1, null, paramString2, paramString3, paramString4, paramInt1, paramInt2, paramInt3, paramList, paramInt4, paramString5);
  }
  
  public static Format createAudioContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, int paramInt1, int paramInt2, int paramInt3, @Nullable List<byte[]> paramList, int paramInt4, @Nullable String paramString6)
  {
    return new Format(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt2, paramInt3, -1, -1, -1, paramInt4, paramString6, -1, Long.MAX_VALUE, paramList, null, null);
  }
  
  public static Format createAudioSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, @Nullable List<byte[]> paramList, @Nullable DrmInitData paramDrmInitData, int paramInt8, @Nullable String paramString4, @Nullable Metadata paramMetadata)
  {
    return new Format(paramString1, null, null, paramString2, paramString3, paramInt1, paramInt2, -1, -1, -1.0F, -1, -1.0F, null, -1, null, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramString4, -1, Long.MAX_VALUE, paramList, paramDrmInitData, paramMetadata);
  }
  
  public static Format createAudioSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, @Nullable List<byte[]> paramList, @Nullable DrmInitData paramDrmInitData, int paramInt6, @Nullable String paramString4)
  {
    return createAudioSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, -1, -1, paramList, paramDrmInitData, paramInt6, paramString4, null);
  }
  
  public static Format createAudioSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable List<byte[]> paramList, @Nullable DrmInitData paramDrmInitData, int paramInt5, @Nullable String paramString4)
  {
    return createAudioSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, -1, paramList, paramDrmInitData, paramInt5, paramString4);
  }
  
  @Deprecated
  public static Format createContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, int paramInt1, int paramInt2, @Nullable String paramString5)
  {
    return createContainerFormat(paramString1, null, paramString2, paramString3, paramString4, paramInt1, paramInt2, paramString5);
  }
  
  public static Format createContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, int paramInt1, int paramInt2, @Nullable String paramString6)
  {
    return new Format(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt2, paramString6, -1, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format createImageSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, @Nullable List<byte[]> paramList, @Nullable String paramString4, @Nullable DrmInitData paramDrmInitData)
  {
    return new Format(paramString1, null, null, paramString2, paramString3, paramInt1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt2, paramString4, -1, Long.MAX_VALUE, paramList, paramDrmInitData, null);
  }
  
  public static Format createSampleFormat(@Nullable String paramString1, @Nullable String paramString2, long paramLong)
  {
    return new Format(paramString1, null, null, paramString2, null, -1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, paramLong, null, null, null);
  }
  
  public static Format createSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt, @Nullable DrmInitData paramDrmInitData)
  {
    return new Format(paramString1, null, null, paramString2, paramString3, paramInt, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, paramDrmInitData, null);
  }
  
  @Deprecated
  public static Format createTextContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, int paramInt1, int paramInt2, @Nullable String paramString5)
  {
    return createTextContainerFormat(paramString1, null, paramString2, paramString3, paramString4, paramInt1, paramInt2, paramString5);
  }
  
  public static Format createTextContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, int paramInt1, int paramInt2, @Nullable String paramString6)
  {
    return createTextContainerFormat(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, paramInt2, paramString6, -1);
  }
  
  public static Format createTextContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, @Nullable String paramString5, int paramInt1, int paramInt2, @Nullable String paramString6, int paramInt3)
  {
    return new Format(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt2, paramString6, paramInt3, Long.MAX_VALUE, null, null, null);
  }
  
  public static Format createTextSampleFormat(@Nullable String paramString1, String paramString2, int paramInt, @Nullable String paramString3)
  {
    return createTextSampleFormat(paramString1, paramString2, paramInt, paramString3, null);
  }
  
  public static Format createTextSampleFormat(@Nullable String paramString1, String paramString2, int paramInt, @Nullable String paramString3, @Nullable DrmInitData paramDrmInitData)
  {
    return createTextSampleFormat(paramString1, paramString2, null, -1, paramInt, paramString3, -1, paramDrmInitData, Long.MAX_VALUE, Collections.emptyList());
  }
  
  public static Format createTextSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, @Nullable String paramString4, int paramInt3, @Nullable DrmInitData paramDrmInitData)
  {
    return createTextSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramString4, paramInt3, paramDrmInitData, Long.MAX_VALUE, Collections.emptyList());
  }
  
  public static Format createTextSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, @Nullable String paramString4, int paramInt3, @Nullable DrmInitData paramDrmInitData, long paramLong, List<byte[]> paramList)
  {
    return new Format(paramString1, null, null, paramString2, paramString3, paramInt1, -1, -1, -1, -1.0F, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt2, paramString4, paramInt3, paramLong, paramList, paramDrmInitData, null);
  }
  
  public static Format createTextSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, @Nullable String paramString4, @Nullable DrmInitData paramDrmInitData, long paramLong)
  {
    return createTextSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramString4, -1, paramDrmInitData, paramLong, Collections.emptyList());
  }
  
  @Deprecated
  public static Format createVideoContainerFormat(@Nullable String paramString1, @Nullable String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, float paramFloat, @Nullable List<byte[]> paramList, int paramInt4)
  {
    return createVideoContainerFormat(paramString1, null, paramString2, paramString3, paramString4, paramInt1, paramInt2, paramInt3, paramFloat, paramList, paramInt4);
  }
  
  public static Format createVideoContainerFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, String paramString4, String paramString5, int paramInt1, int paramInt2, int paramInt3, float paramFloat, @Nullable List<byte[]> paramList, int paramInt4)
  {
    return new Format(paramString1, paramString2, paramString3, paramString4, paramString5, paramInt1, -1, paramInt2, paramInt3, paramFloat, -1, -1.0F, null, -1, null, -1, -1, -1, -1, -1, paramInt4, null, -1, Long.MAX_VALUE, paramList, null, null);
  }
  
  public static Format createVideoSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, @Nullable List<byte[]> paramList, int paramInt5, float paramFloat2, @Nullable DrmInitData paramDrmInitData)
  {
    return createVideoSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramList, paramInt5, paramFloat2, null, -1, null, paramDrmInitData);
  }
  
  public static Format createVideoSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, @Nullable List<byte[]> paramList, int paramInt5, float paramFloat2, byte[] paramArrayOfByte, int paramInt6, @Nullable ColorInfo paramColorInfo, @Nullable DrmInitData paramDrmInitData)
  {
    return new Format(paramString1, null, null, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat1, paramInt5, paramFloat2, paramArrayOfByte, paramInt6, paramColorInfo, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, paramList, paramDrmInitData, null);
  }
  
  public static Format createVideoSampleFormat(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat, @Nullable List<byte[]> paramList, @Nullable DrmInitData paramDrmInitData)
  {
    return createVideoSampleFormat(paramString1, paramString2, paramString3, paramInt1, paramInt2, paramInt3, paramInt4, paramFloat, paramList, -1, -1.0F, paramDrmInitData);
  }
  
  public static String toLogString(@Nullable Format paramFormat)
  {
    if (paramFormat == null) {
      return "null";
    }
    StringBuilder localStringBuilder = z2.t("id=");
    localStringBuilder.append(id);
    localStringBuilder.append(", mimeType=");
    localStringBuilder.append(sampleMimeType);
    if (bitrate != -1)
    {
      localStringBuilder.append(", bitrate=");
      localStringBuilder.append(bitrate);
    }
    if (codecs != null)
    {
      localStringBuilder.append(", codecs=");
      localStringBuilder.append(codecs);
    }
    if ((width != -1) && (height != -1))
    {
      localStringBuilder.append(", res=");
      localStringBuilder.append(width);
      localStringBuilder.append("x");
      localStringBuilder.append(height);
    }
    if (frameRate != -1.0F)
    {
      localStringBuilder.append(", fps=");
      localStringBuilder.append(frameRate);
    }
    if (channelCount != -1)
    {
      localStringBuilder.append(", channels=");
      localStringBuilder.append(channelCount);
    }
    if (sampleRate != -1)
    {
      localStringBuilder.append(", sample_rate=");
      localStringBuilder.append(sampleRate);
    }
    if (language != null)
    {
      localStringBuilder.append(", language=");
      localStringBuilder.append(language);
    }
    if (label != null)
    {
      localStringBuilder.append(", label=");
      localStringBuilder.append(label);
    }
    return localStringBuilder.toString();
  }
  
  public Format copyWithContainerInfo(@Nullable String paramString1, @Nullable String paramString2, @Nullable String paramString3, @Nullable String paramString4, int paramInt1, int paramInt2, int paramInt3, int paramInt4, @Nullable String paramString5)
  {
    return new Format(paramString1, paramString2, containerMimeType, paramString3, paramString4, paramInt1, maxInputSize, paramInt2, paramInt3, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, paramInt4, paramString5, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
  }
  
  public Format copyWithDrmInitData(@Nullable DrmInitData paramDrmInitData)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, paramDrmInitData, metadata);
  }
  
  public Format copyWithGaplessInfo(int paramInt1, int paramInt2)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, paramInt1, paramInt2, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
  }
  
  public Format copyWithManifestFormatInfo(Format paramFormat)
  {
    if (this == paramFormat) {
      return this;
    }
    int i = MimeTypes.getTrackType(sampleMimeType);
    String str1 = id;
    String str2 = label;
    if (str2 == null) {
      str2 = label;
    }
    Object localObject1 = language;
    Object localObject2;
    if ((i == 3) || (i == 1))
    {
      localObject2 = language;
      if (localObject2 != null) {}
    }
    else
    {
      localObject2 = localObject1;
    }
    int j = bitrate;
    int k = j;
    if (j == -1) {
      k = bitrate;
    }
    String str3 = codecs;
    if (str3 == null)
    {
      localObject1 = Util.getCodecsOfType(codecs, i);
      if (Util.splitCodecs((String)localObject1).length == 1) {}
    }
    else
    {
      localObject1 = str3;
    }
    float f = frameRate;
    if ((f == -1.0F) && (i == 2)) {
      f = frameRate;
    }
    i = selectionFlags;
    j = selectionFlags;
    paramFormat = DrmInitData.createSessionCreationData(drmInitData, drmInitData);
    return new Format(str1, str2, containerMimeType, sampleMimeType, (String)localObject1, k, maxInputSize, width, height, f, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, i | j, (String)localObject2, accessibilityChannel, subsampleOffsetUs, initializationData, paramFormat, metadata);
  }
  
  public Format copyWithMaxInputSize(int paramInt)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, paramInt, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
  }
  
  public Format copyWithMetadata(@Nullable Metadata paramMetadata)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, paramMetadata);
  }
  
  public Format copyWithRotationDegrees(int paramInt)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, paramInt, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, subsampleOffsetUs, initializationData, drmInitData, metadata);
  }
  
  public Format copyWithSubsampleOffsetUs(long paramLong)
  {
    return new Format(id, label, containerMimeType, sampleMimeType, codecs, bitrate, maxInputSize, width, height, frameRate, rotationDegrees, pixelWidthHeightRatio, projectionData, stereoMode, colorInfo, channelCount, sampleRate, pcmEncoding, encoderDelay, encoderPadding, selectionFlags, language, accessibilityChannel, paramLong, initializationData, drmInitData, metadata);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (Format.class == paramObject.getClass()))
    {
      paramObject = (Format)paramObject;
      int i = hashCode;
      if (i != 0)
      {
        int j = hashCode;
        if ((j != 0) && (i != j)) {
          return false;
        }
      }
      if ((bitrate != bitrate) || (maxInputSize != maxInputSize) || (width != width) || (height != height) || (Float.compare(frameRate, frameRate) != 0) || (rotationDegrees != rotationDegrees) || (Float.compare(pixelWidthHeightRatio, pixelWidthHeightRatio) != 0) || (stereoMode != stereoMode) || (channelCount != channelCount) || (sampleRate != sampleRate) || (pcmEncoding != pcmEncoding) || (encoderDelay != encoderDelay) || (encoderPadding != encoderPadding) || (subsampleOffsetUs != subsampleOffsetUs) || (selectionFlags != selectionFlags) || (!Util.areEqual(id, id)) || (!Util.areEqual(label, label)) || (!Util.areEqual(language, language)) || (accessibilityChannel != accessibilityChannel) || (!Util.areEqual(containerMimeType, containerMimeType)) || (!Util.areEqual(sampleMimeType, sampleMimeType)) || (!Util.areEqual(codecs, codecs)) || (!Util.areEqual(drmInitData, drmInitData)) || (!Util.areEqual(metadata, metadata)) || (!Util.areEqual(colorInfo, colorInfo)) || (!Arrays.equals(projectionData, projectionData)) || (!initializationDataEquals((Format)paramObject))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public int getPixelCount()
  {
    int i = width;
    int j = -1;
    int k = j;
    if (i != -1)
    {
      k = height;
      if (k == -1) {
        k = j;
      } else {
        k = i * k;
      }
    }
    return k;
  }
  
  public int hashCode()
  {
    if (hashCode == 0)
    {
      Object localObject = id;
      int i = 0;
      int j;
      if (localObject == null) {
        j = 0;
      } else {
        j = ((String)localObject).hashCode();
      }
      localObject = containerMimeType;
      int k;
      if (localObject == null) {
        k = 0;
      } else {
        k = ((String)localObject).hashCode();
      }
      localObject = sampleMimeType;
      int m;
      if (localObject == null) {
        m = 0;
      } else {
        m = ((String)localObject).hashCode();
      }
      localObject = codecs;
      int n;
      if (localObject == null) {
        n = 0;
      } else {
        n = ((String)localObject).hashCode();
      }
      int i1 = bitrate;
      int i2 = width;
      int i3 = height;
      int i4 = channelCount;
      int i5 = sampleRate;
      localObject = language;
      int i6;
      if (localObject == null) {
        i6 = 0;
      } else {
        i6 = ((String)localObject).hashCode();
      }
      int i7 = accessibilityChannel;
      localObject = drmInitData;
      int i8;
      if (localObject == null) {
        i8 = 0;
      } else {
        i8 = ((DrmInitData)localObject).hashCode();
      }
      localObject = metadata;
      int i9;
      if (localObject == null) {
        i9 = 0;
      } else {
        i9 = ((Metadata)localObject).hashCode();
      }
      localObject = label;
      if (localObject != null) {
        i = ((String)localObject).hashCode();
      }
      int i10 = maxInputSize;
      int i11 = (int)subsampleOffsetUs;
      int i12 = Float.floatToIntBits(frameRate);
      hashCode = (((((((Float.floatToIntBits(pixelWidthHeightRatio) + (i12 + ((((((((((((((((527 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31 + i6) * 31 + i7) * 31 + i8) * 31 + i9) * 31 + i) * 31 + i10) * 31 + i11) * 31) * 31) * 31 + rotationDegrees) * 31 + stereoMode) * 31 + pcmEncoding) * 31 + encoderDelay) * 31 + encoderPadding) * 31 + selectionFlags);
    }
    return hashCode;
  }
  
  public boolean initializationDataEquals(Format paramFormat)
  {
    if (initializationData.size() != initializationData.size()) {
      return false;
    }
    for (int i = 0; i < initializationData.size(); i++) {
      if (!Arrays.equals((byte[])initializationData.get(i), (byte[])initializationData.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Format(");
    localStringBuilder.append(id);
    localStringBuilder.append(", ");
    localStringBuilder.append(label);
    localStringBuilder.append(", ");
    localStringBuilder.append(containerMimeType);
    localStringBuilder.append(", ");
    localStringBuilder.append(sampleMimeType);
    localStringBuilder.append(", ");
    localStringBuilder.append(codecs);
    localStringBuilder.append(", ");
    localStringBuilder.append(bitrate);
    localStringBuilder.append(", ");
    localStringBuilder.append(language);
    localStringBuilder.append(", [");
    localStringBuilder.append(width);
    localStringBuilder.append(", ");
    localStringBuilder.append(height);
    localStringBuilder.append(", ");
    localStringBuilder.append(frameRate);
    localStringBuilder.append("], [");
    localStringBuilder.append(channelCount);
    localStringBuilder.append(", ");
    return z2.q(localStringBuilder, sampleRate, "])");
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(id);
    paramParcel.writeString(label);
    paramParcel.writeString(containerMimeType);
    paramParcel.writeString(sampleMimeType);
    paramParcel.writeString(codecs);
    paramParcel.writeInt(bitrate);
    paramParcel.writeInt(maxInputSize);
    paramParcel.writeInt(width);
    paramParcel.writeInt(height);
    paramParcel.writeFloat(frameRate);
    paramParcel.writeInt(rotationDegrees);
    paramParcel.writeFloat(pixelWidthHeightRatio);
    boolean bool;
    if (projectionData != null) {
      bool = true;
    } else {
      bool = false;
    }
    Util.writeBoolean(paramParcel, bool);
    byte[] arrayOfByte = projectionData;
    if (arrayOfByte != null) {
      paramParcel.writeByteArray(arrayOfByte);
    }
    paramParcel.writeInt(stereoMode);
    paramParcel.writeParcelable(colorInfo, paramInt);
    paramParcel.writeInt(channelCount);
    paramParcel.writeInt(sampleRate);
    paramParcel.writeInt(pcmEncoding);
    paramParcel.writeInt(encoderDelay);
    paramParcel.writeInt(encoderPadding);
    paramParcel.writeInt(selectionFlags);
    paramParcel.writeString(language);
    paramParcel.writeInt(accessibilityChannel);
    paramParcel.writeLong(subsampleOffsetUs);
    int i = initializationData.size();
    paramParcel.writeInt(i);
    for (paramInt = 0; paramInt < i; paramInt++) {
      paramParcel.writeByteArray((byte[])initializationData.get(paramInt));
    }
    paramParcel.writeParcelable(drmInitData, 0);
    paramParcel.writeParcelable(metadata, 0);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.Format
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */