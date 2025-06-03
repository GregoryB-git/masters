package com.google.android.exoplayer2.extractor.mkv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import java.io.IOException;

final class MatroskaExtractor$InnerEbmlReaderOutput
  implements EbmlReaderOutput
{
  private MatroskaExtractor$InnerEbmlReaderOutput(MatroskaExtractor paramMatroskaExtractor) {}
  
  public void binaryElement(int paramInt1, int paramInt2, ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    this$0.binaryElement(paramInt1, paramInt2, paramExtractorInput);
  }
  
  public void endMasterElement(int paramInt)
    throws ParserException
  {
    this$0.endMasterElement(paramInt);
  }
  
  public void floatElement(int paramInt, double paramDouble)
    throws ParserException
  {
    this$0.floatElement(paramInt, paramDouble);
  }
  
  public int getElementType(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0;
    case 181: 
    case 17545: 
    case 21969: 
    case 21970: 
    case 21971: 
    case 21972: 
    case 21973: 
    case 21974: 
    case 21975: 
    case 21976: 
    case 21977: 
    case 21978: 
      return 5;
    case 161: 
    case 163: 
    case 16981: 
    case 18402: 
    case 21419: 
    case 25506: 
    case 30322: 
      return 4;
    case 160: 
    case 174: 
    case 183: 
    case 187: 
    case 224: 
    case 225: 
    case 18407: 
    case 19899: 
    case 20532: 
    case 20533: 
    case 21936: 
    case 21968: 
    case 25152: 
    case 28032: 
    case 30320: 
    case 290298740: 
    case 357149030: 
    case 374648427: 
    case 408125543: 
    case 440786851: 
    case 475249515: 
    case 524531317: 
      return 1;
    case 134: 
    case 17026: 
    case 21358: 
    case 2274716: 
      return 3;
    }
    return 2;
  }
  
  public void integerElement(int paramInt, long paramLong)
    throws ParserException
  {
    this$0.integerElement(paramInt, paramLong);
  }
  
  public boolean isLevel1Element(int paramInt)
  {
    boolean bool;
    if ((paramInt != 357149030) && (paramInt != 524531317) && (paramInt != 475249515) && (paramInt != 374648427)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public void startMasterElement(int paramInt, long paramLong1, long paramLong2)
    throws ParserException
  {
    this$0.startMasterElement(paramInt, paramLong1, paramLong2);
  }
  
  public void stringElement(int paramInt, String paramString)
    throws ParserException
  {
    this$0.stringElement(paramInt, paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.InnerEbmlReaderOutput
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */