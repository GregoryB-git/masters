package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.cea.Cea708InitializationData;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class DefaultTsPayloadReaderFactory
  implements TsPayloadReader.Factory
{
  private static final int DESCRIPTOR_TAG_CAPTION_SERVICE = 134;
  public static final int FLAG_ALLOW_NON_IDR_KEYFRAMES = 1;
  public static final int FLAG_DETECT_ACCESS_UNITS = 8;
  public static final int FLAG_IGNORE_AAC_STREAM = 2;
  public static final int FLAG_IGNORE_H264_STREAM = 4;
  public static final int FLAG_IGNORE_SPLICE_INFO_STREAM = 16;
  public static final int FLAG_OVERRIDE_CAPTION_DESCRIPTORS = 32;
  private final List<Format> closedCaptionFormats;
  private final int flags;
  
  public DefaultTsPayloadReaderFactory()
  {
    this(0);
  }
  
  public DefaultTsPayloadReaderFactory(int paramInt)
  {
    this(paramInt, Collections.singletonList(Format.createTextSampleFormat(null, "application/cea-608", 0, null)));
  }
  
  public DefaultTsPayloadReaderFactory(int paramInt, List<Format> paramList)
  {
    flags = paramInt;
    closedCaptionFormats = paramList;
  }
  
  private SeiReader buildSeiReader(TsPayloadReader.EsInfo paramEsInfo)
  {
    return new SeiReader(getClosedCaptionFormats(paramEsInfo));
  }
  
  private UserDataReader buildUserDataReader(TsPayloadReader.EsInfo paramEsInfo)
  {
    return new UserDataReader(getClosedCaptionFormats(paramEsInfo));
  }
  
  private List<Format> getClosedCaptionFormats(TsPayloadReader.EsInfo paramEsInfo)
  {
    if (isSet(32)) {
      return closedCaptionFormats;
    }
    ParsableByteArray localParsableByteArray = new ParsableByteArray(descriptorBytes);
    paramEsInfo = closedCaptionFormats;
    while (localParsableByteArray.bytesLeft() > 0)
    {
      int i = localParsableByteArray.readUnsignedByte();
      int j = localParsableByteArray.readUnsignedByte();
      int k = localParsableByteArray.getPosition();
      if (i == 134)
      {
        ArrayList localArrayList = new ArrayList();
        int m = localParsableByteArray.readUnsignedByte();
        for (i = 0;; i++)
        {
          paramEsInfo = localArrayList;
          if (i >= (m & 0x1F)) {
            break;
          }
          String str = localParsableByteArray.readString(3);
          int n = localParsableByteArray.readUnsignedByte();
          boolean bool = true;
          int i1;
          if ((n & 0x80) != 0) {
            i1 = 1;
          } else {
            i1 = 0;
          }
          if (i1 != 0)
          {
            n &= 0x3F;
            paramEsInfo = "application/cea-708";
          }
          else
          {
            paramEsInfo = "application/cea-608";
            n = 1;
          }
          int i2 = (byte)localParsableByteArray.readUnsignedByte();
          localParsableByteArray.skipBytes(1);
          List localList;
          if (i1 != 0)
          {
            if ((i2 & 0x40) == 0) {
              bool = false;
            }
            localList = Cea708InitializationData.buildData(bool);
          }
          else
          {
            localList = null;
          }
          localArrayList.add(Format.createTextSampleFormat(null, paramEsInfo, null, -1, 0, str, n, null, Long.MAX_VALUE, localList));
        }
      }
      localParsableByteArray.setPosition(k + j);
    }
    return paramEsInfo;
  }
  
  private boolean isSet(int paramInt)
  {
    boolean bool;
    if ((paramInt & flags) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public SparseArray<TsPayloadReader> createInitialPayloadReaders()
  {
    return new SparseArray();
  }
  
  public TsPayloadReader createPayloadReader(int paramInt, TsPayloadReader.EsInfo paramEsInfo)
  {
    if (paramInt != 2)
    {
      if ((paramInt != 3) && (paramInt != 4))
      {
        Object localObject1 = null;
        Object localObject2 = null;
        Object localObject3 = null;
        Object localObject4 = null;
        if (paramInt != 15)
        {
          if (paramInt != 17)
          {
            if (paramInt != 21)
            {
              if (paramInt != 27)
              {
                if (paramInt != 36)
                {
                  if (paramInt != 89)
                  {
                    if (paramInt != 138)
                    {
                      if (paramInt != 129)
                      {
                        if (paramInt == 130) {
                          break label150;
                        }
                        if (paramInt != 134)
                        {
                          if (paramInt != 135) {
                            return null;
                          }
                        }
                        else
                        {
                          if (isSet(16)) {
                            paramEsInfo = (TsPayloadReader.EsInfo)localObject4;
                          } else {
                            paramEsInfo = new SectionReader(new SpliceInfoSectionReader());
                          }
                          return paramEsInfo;
                        }
                      }
                      return new PesReader(new Ac3Reader(language));
                    }
                    label150:
                    return new PesReader(new DtsReader(language));
                  }
                  return new PesReader(new DvbSubtitleReader(dvbSubtitleInfos));
                }
                return new PesReader(new H265Reader(buildSeiReader(paramEsInfo)));
              }
              if (isSet(4)) {
                paramEsInfo = (TsPayloadReader.EsInfo)localObject1;
              } else {
                paramEsInfo = new PesReader(new H264Reader(buildSeiReader(paramEsInfo), isSet(1), isSet(8)));
              }
              return paramEsInfo;
            }
            return new PesReader(new Id3Reader());
          }
          if (isSet(2)) {
            paramEsInfo = (TsPayloadReader.EsInfo)localObject2;
          } else {
            paramEsInfo = new PesReader(new LatmReader(language));
          }
          return paramEsInfo;
        }
        if (isSet(2)) {
          paramEsInfo = (TsPayloadReader.EsInfo)localObject3;
        } else {
          paramEsInfo = new PesReader(new AdtsReader(false, language));
        }
        return paramEsInfo;
      }
      return new PesReader(new MpegAudioReader(language));
    }
    return new PesReader(new H262Reader(buildUserDataReader(paramEsInfo)));
  }
  
  @Documented
  @Retention(RetentionPolicy.SOURCE)
  public static @interface Flags {}
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */