package com.google.android.recaptcha.internal;

import android.content.Context;
import bc.a;
import ec.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import rb.h;
import sb.j;
import x6.b;

public final class zzcd
{
  public zzcd(Context paramContext) {}
  
  public static final byte[] zza(File paramFile)
  {
    i.e(paramFile, "<this>");
    FileInputStream localFileInputStream = new FileInputStream(paramFile);
    try
    {
      l = paramFile.length();
      if (l <= 2147483647L)
      {
        int i = (int)l;
        Object localObject1 = new byte[i];
        int j = i;
        int k = 0;
        while (j > 0)
        {
          int m = localFileInputStream.read((byte[])localObject1, k, j);
          if (m < 0) {
            break;
          }
          j -= m;
          k += m;
        }
        if (j > 0)
        {
          paramFile = Arrays.copyOf((byte[])localObject1, k);
          i.d(paramFile, "copyOf(...)");
        }
        else
        {
          k = localFileInputStream.read();
          if (k == -1)
          {
            paramFile = (File)localObject1;
          }
          else
          {
            localObject3 = new bc/a;
            ((a)localObject3).<init>();
            ((OutputStream)localObject3).write(k);
            b.N(localFileInputStream, (OutputStream)localObject3, 8192);
            k = ((ByteArrayOutputStream)localObject3).size() + i;
            if (k < 0) {
              break label208;
            }
            byte[] arrayOfByte = ((a)localObject3).f();
            paramFile = Arrays.copyOf((byte[])localObject1, k);
            i.d(paramFile, "copyOf(...)");
            j.k(arrayOfByte, i, paramFile, 0, ((ByteArrayOutputStream)localObject3).size());
          }
        }
        b.L(localFileInputStream, null);
        return paramFile;
        label208:
        localObject3 = new java/lang/OutOfMemoryError;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("File ");
        ((StringBuilder)localObject1).append(paramFile);
        ((StringBuilder)localObject1).append(" is too big to fit in memory.");
        ((OutOfMemoryError)localObject3).<init>(((StringBuilder)localObject1).toString());
        throw ((Throwable)localObject3);
      }
    }
    finally
    {
      long l;
      break label330;
      Object localObject3 = new java/lang/OutOfMemoryError;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder.append("File ");
      localStringBuilder.append(paramFile);
      localStringBuilder.append(" is too big (");
      localStringBuilder.append(l);
      localStringBuilder.append(" bytes) to fit in memory.");
      ((OutOfMemoryError)localObject3).<init>(localStringBuilder.toString());
      throw ((Throwable)localObject3);
      try
      {
        label330:
        throw localStringBuilder;
      }
      finally
      {
        b.L(localFileInputStream, localStringBuilder);
      }
    }
  }
  
  public static final void zzb(File paramFile, byte[] paramArrayOfByte)
  {
    if ((paramFile.exists()) && (!paramFile.delete())) {
      throw new IOException("Unable to delete existing encrypted file");
    }
    i.e(paramArrayOfByte, "array");
    paramFile = new FileOutputStream(paramFile);
    try
    {
      paramFile.write(paramArrayOfByte);
      paramArrayOfByte = h.a;
      b.L(paramFile, null);
      return;
    }
    finally
    {
      try
      {
        throw localThrowable;
      }
      finally
      {
        b.L(paramFile, localThrowable);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzcd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */