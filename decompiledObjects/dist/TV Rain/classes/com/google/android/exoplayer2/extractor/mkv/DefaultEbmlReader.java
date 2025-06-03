package com.google.android.exoplayer2.extractor.mkv;

import a;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;
import z2;

final class DefaultEbmlReader
  implements EbmlReader
{
  private static final int ELEMENT_STATE_READ_CONTENT = 2;
  private static final int ELEMENT_STATE_READ_CONTENT_SIZE = 1;
  private static final int ELEMENT_STATE_READ_ID = 0;
  private static final int MAX_ID_BYTES = 4;
  private static final int MAX_INTEGER_ELEMENT_SIZE_BYTES = 8;
  private static final int MAX_LENGTH_BYTES = 8;
  private static final int VALID_FLOAT32_ELEMENT_SIZE_BYTES = 4;
  private static final int VALID_FLOAT64_ELEMENT_SIZE_BYTES = 8;
  private long elementContentSize;
  private int elementId;
  private int elementState;
  private final ArrayDeque<MasterElement> masterElementsStack = new ArrayDeque();
  private EbmlReaderOutput output;
  private final byte[] scratch = new byte[8];
  private final VarintReader varintReader = new VarintReader();
  
  private long maybeResyncToNextLevel1Element(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    paramExtractorInput.resetPeekPosition();
    for (;;)
    {
      paramExtractorInput.peekFully(scratch, 0, 4);
      int i = VarintReader.parseUnsignedVarintLength(scratch[0]);
      if ((i != -1) && (i <= 4))
      {
        int j = (int)VarintReader.assembleVarint(scratch, i, false);
        if (output.isLevel1Element(j))
        {
          paramExtractorInput.skipFully(i);
          return j;
        }
      }
      paramExtractorInput.skipFully(1);
    }
  }
  
  private double readFloat(ExtractorInput paramExtractorInput, int paramInt)
    throws IOException, InterruptedException
  {
    long l = readInteger(paramExtractorInput, paramInt);
    double d;
    if (paramInt == 4) {
      d = Float.intBitsToFloat((int)l);
    } else {
      d = Double.longBitsToDouble(l);
    }
    return d;
  }
  
  private long readInteger(ExtractorInput paramExtractorInput, int paramInt)
    throws IOException, InterruptedException
  {
    byte[] arrayOfByte = scratch;
    int i = 0;
    paramExtractorInput.readFully(arrayOfByte, 0, paramInt);
    long l = 0L;
    while (i < paramInt)
    {
      l = l << 8 | scratch[i] & 0xFF;
      i++;
    }
    return l;
  }
  
  private String readString(ExtractorInput paramExtractorInput, int paramInt)
    throws IOException, InterruptedException
  {
    if (paramInt == 0) {
      return "";
    }
    byte[] arrayOfByte = new byte[paramInt];
    paramExtractorInput.readFully(arrayOfByte, 0, paramInt);
    while ((paramInt > 0) && (arrayOfByte[(paramInt - 1)] == 0)) {
      paramInt--;
    }
    return new String(arrayOfByte, 0, paramInt);
  }
  
  public void init(EbmlReaderOutput paramEbmlReaderOutput)
  {
    output = paramEbmlReaderOutput;
  }
  
  public boolean read(ExtractorInput paramExtractorInput)
    throws IOException, InterruptedException
  {
    boolean bool;
    if (output != null) {
      bool = true;
    } else {
      bool = false;
    }
    Assertions.checkState(bool);
    for (;;)
    {
      if ((!masterElementsStack.isEmpty()) && (paramExtractorInput.getPosition() >= MasterElement.access$000((MasterElement)masterElementsStack.peek())))
      {
        output.endMasterElement(MasterElement.access$100((MasterElement)masterElementsStack.pop()));
        return true;
      }
      long l1;
      long l2;
      if (elementState == 0)
      {
        l1 = varintReader.readUnsignedVarint(paramExtractorInput, true, false, 4);
        l2 = l1;
        if (l1 == -2L) {
          l2 = maybeResyncToNextLevel1Element(paramExtractorInput);
        }
        if (l2 == -1L) {
          return false;
        }
        elementId = ((int)l2);
        elementState = 1;
      }
      if (elementState == 1)
      {
        elementContentSize = varintReader.readUnsignedVarint(paramExtractorInput, false, true, 8);
        elementState = 2;
      }
      int i = output.getElementType(elementId);
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            if (i != 3)
            {
              if (i != 4)
              {
                if (i == 5)
                {
                  l2 = elementContentSize;
                  if ((l2 != 4L) && (l2 != 8L))
                  {
                    paramExtractorInput = z2.t("Invalid float size: ");
                    paramExtractorInput.append(elementContentSize);
                    throw new ParserException(paramExtractorInput.toString());
                  }
                  output.floatElement(elementId, readFloat(paramExtractorInput, (int)l2));
                  elementState = 0;
                  return true;
                }
                throw new ParserException(a.f("Invalid element type ", i));
              }
              output.binaryElement(elementId, (int)elementContentSize, paramExtractorInput);
              elementState = 0;
              return true;
            }
            l2 = elementContentSize;
            if (l2 <= 2147483647L)
            {
              output.stringElement(elementId, readString(paramExtractorInput, (int)l2));
              elementState = 0;
              return true;
            }
            paramExtractorInput = z2.t("String element size: ");
            paramExtractorInput.append(elementContentSize);
            throw new ParserException(paramExtractorInput.toString());
          }
          l2 = elementContentSize;
          if (l2 <= 8L)
          {
            output.integerElement(elementId, readInteger(paramExtractorInput, (int)l2));
            elementState = 0;
            return true;
          }
          paramExtractorInput = z2.t("Invalid integer size: ");
          paramExtractorInput.append(elementContentSize);
          throw new ParserException(paramExtractorInput.toString());
        }
        l1 = paramExtractorInput.getPosition();
        l2 = elementContentSize;
        masterElementsStack.push(new MasterElement(elementId, l2 + l1, null));
        output.startMasterElement(elementId, l1, elementContentSize);
        elementState = 0;
        return true;
      }
      paramExtractorInput.skipFully((int)elementContentSize);
      elementState = 0;
    }
  }
  
  public void reset()
  {
    elementState = 0;
    masterElementsStack.clear();
    varintReader.reset();
  }
  
  public static final class MasterElement
  {
    private final long elementEndPosition;
    private final int elementId;
    
    private MasterElement(int paramInt, long paramLong)
    {
      elementId = paramInt;
      elementEndPosition = paramLong;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mkv.DefaultEbmlReader
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */