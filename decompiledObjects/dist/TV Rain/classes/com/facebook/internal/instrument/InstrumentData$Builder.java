package com.facebook.internal.instrument;

import java.io.File;
import org.json.JSONArray;

public class InstrumentData$Builder
{
  public static InstrumentData build(Throwable paramThrowable, InstrumentData.Type paramType)
  {
    return new InstrumentData(paramThrowable, paramType, null);
  }
  
  public static InstrumentData build(JSONArray paramJSONArray)
  {
    return new InstrumentData(paramJSONArray, null);
  }
  
  public static InstrumentData load(File paramFile)
  {
    return new InstrumentData(paramFile, null);
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.instrument.InstrumentData.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */