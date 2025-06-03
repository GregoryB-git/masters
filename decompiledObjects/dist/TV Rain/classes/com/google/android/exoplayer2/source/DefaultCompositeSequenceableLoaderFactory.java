package com.google.android.exoplayer2.source;

public final class DefaultCompositeSequenceableLoaderFactory
  implements CompositeSequenceableLoaderFactory
{
  public SequenceableLoader createCompositeSequenceableLoader(SequenceableLoader... paramVarArgs)
  {
    return new CompositeSequenceableLoader(paramVarArgs);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.source.DefaultCompositeSequenceableLoaderFactory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */