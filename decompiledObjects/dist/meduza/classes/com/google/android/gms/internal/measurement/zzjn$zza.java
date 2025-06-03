package com.google.android.gms.internal.measurement;

import f;
import java.io.IOException;
import java.util.Locale;

public final class zzjn$zza
  extends IOException
{
  public zzjn$zza()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  public zzjn$zza(int paramInt1, int paramInt2, int paramInt3, Throwable paramThrowable)
  {
    this(paramInt1, paramInt2, paramInt3, paramThrowable);
  }
  
  private zzjn$zza(long paramLong1, long paramLong2, int paramInt, Throwable paramThrowable)
  {
    this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) }), paramThrowable);
  }
  
  private zzjn$zza(String paramString, Throwable paramThrowable)
  {
    super(f.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", paramString), paramThrowable);
  }
  
  public zzjn$zza(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjn.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */