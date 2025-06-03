package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flv.FlvExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ogg.OggExtractor;
import com.google.android.exoplayer2.extractor.ts.Ac3Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.wav.WavExtractor;
import java.lang.reflect.Constructor;

public final class DefaultExtractorsFactory
  implements ExtractorsFactory
{
  private static final Constructor<? extends Extractor> FLAC_EXTRACTOR_CONSTRUCTOR;
  private int adtsFlags;
  private int amrFlags;
  private boolean constantBitrateSeekingEnabled;
  private int fragmentedMp4Flags;
  private int matroskaFlags;
  private int mp3Flags;
  private int mp4Flags;
  private int tsFlags;
  private int tsMode = 1;
  
  static
  {
    Constructor localConstructor2;
    try
    {
      Constructor localConstructor1 = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
    }
    catch (Exception localException)
    {
      throw new RuntimeException("Error instantiating FLAC extension", localException);
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      localConstructor2 = null;
    }
    FLAC_EXTRACTOR_CONSTRUCTOR = localConstructor2;
  }
  
  public Extractor[] createExtractors()
  {
    try
    {
      Constructor localConstructor = FLAC_EXTRACTOR_CONSTRUCTOR;
      int i;
      if (localConstructor == null) {
        i = 12;
      } else {
        i = 13;
      }
      Object localObject2 = new Extractor[i];
      Object localObject3 = new com/google/android/exoplayer2/extractor/mkv/MatroskaExtractor;
      ((MatroskaExtractor)localObject3).<init>(matroskaFlags);
      localObject2[0] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/mp4/FragmentedMp4Extractor;
      ((FragmentedMp4Extractor)localObject3).<init>(fragmentedMp4Flags);
      int j = 1;
      localObject2[1] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/mp4/Mp4Extractor;
      ((Mp4Extractor)localObject3).<init>(mp4Flags);
      localObject2[2] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/mp3/Mp3Extractor;
      int k = mp3Flags;
      if (constantBitrateSeekingEnabled) {
        i = 1;
      } else {
        i = 0;
      }
      ((Mp3Extractor)localObject3).<init>(k | i);
      localObject2[3] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/ts/AdtsExtractor;
      k = adtsFlags;
      if (constantBitrateSeekingEnabled) {
        i = 1;
      } else {
        i = 0;
      }
      ((AdtsExtractor)localObject3).<init>(0L, k | i);
      localObject2[4] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/ts/Ac3Extractor;
      ((Ac3Extractor)localObject3).<init>();
      localObject2[5] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/ts/TsExtractor;
      ((TsExtractor)localObject3).<init>(tsMode, tsFlags);
      localObject2[6] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/flv/FlvExtractor;
      ((FlvExtractor)localObject3).<init>();
      localObject2[7] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/ogg/OggExtractor;
      ((OggExtractor)localObject3).<init>();
      localObject2[8] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/ts/PsExtractor;
      ((PsExtractor)localObject3).<init>();
      localObject2[9] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/wav/WavExtractor;
      ((WavExtractor)localObject3).<init>();
      localObject2[10] = localObject3;
      localObject3 = new com/google/android/exoplayer2/extractor/amr/AmrExtractor;
      k = amrFlags;
      if (constantBitrateSeekingEnabled) {
        i = j;
      } else {
        i = 0;
      }
      ((AmrExtractor)localObject3).<init>(i | k);
      localObject2[11] = localObject3;
      if (localConstructor != null) {
        try
        {
          localObject2[12] = ((Extractor)localConstructor.newInstance(new Object[0]));
        }
        catch (Exception localException)
        {
          localObject2 = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject2).<init>("Unexpected error creating FLAC extractor", localException);
          throw ((Throwable)localObject2);
        }
      }
      return (Extractor[])localObject2;
    }
    finally {}
  }
  
  public DefaultExtractorsFactory setAdtsExtractorFlags(int paramInt)
  {
    try
    {
      adtsFlags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setAmrExtractorFlags(int paramInt)
  {
    try
    {
      amrFlags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean paramBoolean)
  {
    try
    {
      constantBitrateSeekingEnabled = paramBoolean;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int paramInt)
  {
    try
    {
      fragmentedMp4Flags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setMatroskaExtractorFlags(int paramInt)
  {
    try
    {
      matroskaFlags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setMp3ExtractorFlags(int paramInt)
  {
    try
    {
      mp3Flags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setMp4ExtractorFlags(int paramInt)
  {
    try
    {
      mp4Flags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setTsExtractorFlags(int paramInt)
  {
    try
    {
      tsFlags = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public DefaultExtractorsFactory setTsExtractorMode(int paramInt)
  {
    try
    {
      tsMode = paramInt;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.DefaultExtractorsFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */