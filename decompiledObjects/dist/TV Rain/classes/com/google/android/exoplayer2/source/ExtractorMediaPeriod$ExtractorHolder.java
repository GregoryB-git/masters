package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;

final class ExtractorMediaPeriod$ExtractorHolder
{
  @Nullable
  private Extractor extractor;
  private final Extractor[] extractors;
  
  public ExtractorMediaPeriod$ExtractorHolder(Extractor[] paramArrayOfExtractor)
  {
    extractors = paramArrayOfExtractor;
  }
  
  public void release()
  {
    Extractor localExtractor = extractor;
    if (localExtractor != null)
    {
      localExtractor.release();
      extractor = null;
    }
  }
  
  /* Error */
  public Extractor selectExtractor(com.google.android.exoplayer2.extractor.ExtractorInput paramExtractorInput, com.google.android.exoplayer2.extractor.ExtractorOutput paramExtractorOutput, android.net.Uri paramUri)
    throws java.io.IOException, java.lang.InterruptedException
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   4: astore 4
    //   6: aload 4
    //   8: ifnull +6 -> 14
    //   11: aload 4
    //   13: areturn
    //   14: aload_0
    //   15: getfield 19	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractors	[Lcom/google/android/exoplayer2/extractor/Extractor;
    //   18: astore 4
    //   20: aload 4
    //   22: arraylength
    //   23: istore 5
    //   25: iconst_0
    //   26: istore 6
    //   28: iload 6
    //   30: iload 5
    //   32: if_icmpge +57 -> 89
    //   35: aload 4
    //   37: iload 6
    //   39: aaload
    //   40: astore 7
    //   42: aload 7
    //   44: aload_1
    //   45: invokeinterface 39 2 0
    //   50: ifeq +27 -> 77
    //   53: aload_0
    //   54: aload 7
    //   56: putfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   59: aload_1
    //   60: invokeinterface 44 1 0
    //   65: goto +24 -> 89
    //   68: astore_2
    //   69: aload_1
    //   70: invokeinterface 44 1 0
    //   75: aload_2
    //   76: athrow
    //   77: aload_1
    //   78: invokeinterface 44 1 0
    //   83: iinc 6 1
    //   86: goto -58 -> 28
    //   89: aload_0
    //   90: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   93: astore_1
    //   94: aload_1
    //   95: ifnull +15 -> 110
    //   98: aload_1
    //   99: aload_2
    //   100: invokeinterface 48 2 0
    //   105: aload_0
    //   106: getfield 23	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractor	Lcom/google/android/exoplayer2/extractor/Extractor;
    //   109: areturn
    //   110: new 50	com/google/android/exoplayer2/source/UnrecognizedInputFormatException
    //   113: dup
    //   114: ldc 52
    //   116: invokestatic 58	z2:t	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: aload_0
    //   120: getfield 19	com/google/android/exoplayer2/source/ExtractorMediaPeriod$ExtractorHolder:extractors	[Lcom/google/android/exoplayer2/extractor/Extractor;
    //   123: invokestatic 64	com/google/android/exoplayer2/util/Util:getCommaDelimitedSimpleClassNames	([Ljava/lang/Object;)Ljava/lang/String;
    //   126: ldc 66
    //   128: invokestatic 70	z2:s	(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   131: aload_3
    //   132: invokespecial 73	com/google/android/exoplayer2/source/UnrecognizedInputFormatException:<init>	(Ljava/lang/String;Landroid/net/Uri;)V
    //   135: athrow
    //   136: astore 7
    //   138: goto -61 -> 77
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	this	ExtractorHolder
    //   0	141	1	paramExtractorInput	com.google.android.exoplayer2.extractor.ExtractorInput
    //   0	141	2	paramExtractorOutput	com.google.android.exoplayer2.extractor.ExtractorOutput
    //   0	141	3	paramUri	android.net.Uri
    //   4	32	4	localObject	Object
    //   23	10	5	i	int
    //   26	58	6	j	int
    //   40	15	7	localExtractor	Extractor
    //   136	1	7	localEOFException	java.io.EOFException
    // Exception table:
    //   from	to	target	type
    //   42	59	68	finally
    //   42	59	136	java/io/EOFException
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.ExtractorMediaPeriod.ExtractorHolder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */