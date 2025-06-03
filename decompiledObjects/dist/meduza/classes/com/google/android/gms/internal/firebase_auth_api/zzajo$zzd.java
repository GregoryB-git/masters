package com.google.android.gms.internal.firebase_auth_api;

import f;
import java.io.IOException;
import java.util.Locale;

public final class zzajo$zzd
  extends IOException
{
  public zzajo$zzd()
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.");
  }
  
  public zzajo$zzd(int paramInt1, int paramInt2, int paramInt3, Throwable paramThrowable)
  {
    this(paramInt1, paramInt2, paramInt3, paramThrowable);
  }
  
  private zzajo$zzd(long paramLong1, long paramLong2, int paramInt, Throwable paramThrowable)
  {
    this(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2), Integer.valueOf(paramInt) }), paramThrowable);
  }
  
  private zzajo$zzd(String paramString, Throwable paramThrowable)
  {
    super(f.j("CodedOutputStream was writing to a flat byte array and ran out of space.: ", paramString), paramThrowable);
  }
  
  public zzajo$zzd(Throwable paramThrowable)
  {
    super("CodedOutputStream was writing to a flat byte array and ran out of space.", paramThrowable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajo.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */