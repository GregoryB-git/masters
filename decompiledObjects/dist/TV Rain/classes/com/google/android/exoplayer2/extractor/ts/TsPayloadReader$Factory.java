package com.google.android.exoplayer2.extractor.ts;

import android.util.SparseArray;

public abstract interface TsPayloadReader$Factory
{
  public abstract SparseArray<TsPayloadReader> createInitialPayloadReaders();
  
  public abstract TsPayloadReader createPayloadReader(int paramInt, TsPayloadReader.EsInfo paramEsInfo);
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.ts.TsPayloadReader.Factory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */