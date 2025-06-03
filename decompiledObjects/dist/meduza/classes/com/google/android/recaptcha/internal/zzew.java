package com.google.android.recaptcha.internal;

import ec.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.net.UnknownServiceException;
import x6.b;

public final class zzew
{
  private final HttpURLConnection zza;
  
  public zzew(HttpURLConnection paramHttpURLConnection)
  {
    zza = paramHttpURLConnection;
  }
  
  private final InputStream zzf()
  {
    try
    {
      InputStream localInputStream = zza.getInputStream();
      return localInputStream;
    }
    catch (Exception localException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzak, localException.getMessage());
    }
    catch (IOException localIOException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzae, localIOException.getMessage());
    }
    catch (UnknownServiceException localUnknownServiceException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzaf, localUnknownServiceException.getMessage());
    }
  }
  
  private final OutputStream zzg()
  {
    try
    {
      OutputStream localOutputStream = zza.getOutputStream();
      return localOutputStream;
    }
    catch (Exception localException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzak, localException.getMessage());
    }
    catch (IOException localIOException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzae, localIOException.getMessage());
    }
    catch (UnknownServiceException localUnknownServiceException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzaf, localUnknownServiceException.getMessage());
    }
  }
  
  public final zzoi zza(zzoi paramzzoi)
  {
    try
    {
      int i = zza.getResponseCode();
      if (i != 200)
      {
        if (i != 400)
        {
          if (i != 503)
          {
            if (i != 403)
            {
              if (i != 404) {
                paramzzoi = new zzbd(zzbb.zzc, zzba.zzK, null);
              } else {
                paramzzoi = new zzbd(zzbb.zzc, zzba.zzi, null);
              }
            }
            else {
              paramzzoi = new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
          }
          else {
            paramzzoi = new zzbd(zzbb.zzi, zzba.zzJ, null);
          }
        }
        else {
          paramzzoi = new zzbd(zzbb.zzc, zzba.zzau, null);
        }
        throw paramzzoi;
      }
      Object localObject = zzf();
      i.e(localObject, "<this>");
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, ((InputStream)localObject).available()));
      b.N((InputStream)localObject, localByteArrayOutputStream, 8192);
      localObject = localByteArrayOutputStream.toByteArray();
      i.d(localObject, "toByteArray(...)");
      if (localObject.length != 0) {
        try
        {
          paramzzoi = paramzzoi.zzD().zzb((byte[])localObject);
          i.c(paramzzoi, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
          paramzzoi = (zzoi)paramzzoi;
          return paramzzoi;
        }
        catch (Exception paramzzoi)
        {
          throw new zzbd(zzbb.zzc, zzba.zzG, paramzzoi.getMessage());
        }
      }
      throw new zzbd(zzbb.zzc, zzba.zzat, null);
    }
    catch (Exception paramzzoi)
    {
      throw new zzbd(zzbb.zzc, zzba.zzah, paramzzoi.getMessage());
    }
  }
  
  public final HttpURLConnection zzb()
  {
    return zza;
  }
  
  public final void zzc()
  {
    try
    {
      zza.connect();
      return;
    }
    catch (Exception localException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzaj, localException.getMessage());
    }
    catch (IOException localIOException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzad, localIOException.getMessage());
    }
    catch (SocketTimeoutException localSocketTimeoutException)
    {
      throw new zzbd(zzbb.zzc, zzba.zzac, localSocketTimeoutException.getMessage());
    }
  }
  
  public final void zzd()
  {
    zza.disconnect();
  }
  
  public final void zze(byte[] paramArrayOfByte)
  {
    try
    {
      zzg().write(paramArrayOfByte);
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      throw new zzbd(zzbb.zzc, zzba.zzal, paramArrayOfByte.getMessage());
    }
    catch (IOException paramArrayOfByte)
    {
      throw new zzbd(zzbb.zzc, zzba.zzag, paramArrayOfByte.getMessage());
    }
    catch (zzbd paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzew
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */