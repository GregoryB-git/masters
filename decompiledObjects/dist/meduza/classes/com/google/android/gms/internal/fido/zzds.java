package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.io.InputStream;
import java.util.TreeMap;

final class zzds
{
  /* Error */
  public static final zzdr zza(InputStream paramInputStream, zzdu paramzzdu)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic 11	com/google/android/gms/internal/fido/zzds:zzb	(Ljava/io/InputStream;Lcom/google/android/gms/internal/fido/zzdu;)Lcom/google/android/gms/internal/fido/zzdr;
    //   5: astore_0
    //   6: aload_1
    //   7: invokevirtual 17	com/google/android/gms/internal/fido/zzdu:close	()V
    //   10: aload_0
    //   11: areturn
    //   12: astore_0
    //   13: aload_1
    //   14: invokevirtual 17	com/google/android/gms/internal/fido/zzdu:close	()V
    //   17: aload_0
    //   18: athrow
    //   19: astore_1
    //   20: goto -10 -> 10
    //   23: astore_1
    //   24: goto -7 -> 17
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	27	0	paramInputStream	InputStream
    //   0	27	1	paramzzdu	zzdu
    // Exception table:
    //   from	to	target	type
    //   0	6	12	finally
    //   6	10	19	java/io/IOException
    //   13	17	23	java/io/IOException
  }
  
  private static final zzdr zzb(InputStream paramInputStream, zzdu paramzzdu)
  {
    try
    {
      Object localObject = paramzzdu.zzd();
      if (localObject != null)
      {
        try
        {
          byte b = ((zzdt)localObject).zza();
          int i = ((zzdt)localObject).zzb();
          int j = 0;
          int k = 0;
          if (i != -128)
          {
            if (i != -96)
            {
              if (i != -64)
              {
                if (i != -32)
                {
                  if ((i != 0) && (i != 32))
                  {
                    if (i != 64)
                    {
                      if (i == 96)
                      {
                        localObject = paramzzdu.zze();
                        zzc(b, ((String)localObject).length(), paramInputStream, paramzzdu);
                        return new zzdp((String)localObject);
                      }
                      paramInputStream = new com/google/android/gms/internal/fido/zzdl;
                      j = ((zzdt)localObject).zzc();
                      paramzzdu = new java/lang/StringBuilder;
                      paramzzdu.<init>();
                      paramzzdu.append("Unidentifiable major type: ");
                      paramzzdu.append(j);
                      paramInputStream.<init>(paramzzdu.toString());
                      throw paramInputStream;
                    }
                    localObject = paramzzdu.zzg();
                    j = localObject.length;
                    zzc(b, j, paramInputStream, paramzzdu);
                    return new zzdk(zzcz.zzl((byte[])localObject, 0, j));
                  }
                  long l1 = paramzzdu.zzb();
                  if (l1 > 0L) {
                    l2 = l1;
                  } else {
                    l2 = l1;
                  }
                  zzc(b, l2, paramInputStream, paramzzdu);
                  return new zzdm(l1);
                }
                return new zzdj(paramzzdu.zzf());
              }
              paramInputStream = new com/google/android/gms/internal/fido/zzdl;
              paramInputStream.<init>("Tags are currently unsupported");
              throw paramInputStream;
            }
            l2 = paramzzdu.zzc();
            if (l2 <= 1000L)
            {
              zzc(b, l2, paramInputStream, paramzzdu);
              i = (int)l2;
              zzdn[] arrayOfzzdn = new zzdn[i];
              localObject = null;
              j = 0;
              while (j < l2)
              {
                zzdr localzzdr = zzb(paramInputStream, paramzzdu);
                if ((localObject != null) && (localzzdr.compareTo(localObject) <= 0))
                {
                  paramInputStream = new com/google/android/gms/internal/fido/zzdh;
                  paramInputStream.<init>(String.format("Keys in CBOR Map not in strictly ascending natural order:\nPrevious key: %s\nCurrent key: %s", new Object[] { localObject.toString(), localzzdr.toString() }));
                  throw paramInputStream;
                }
                arrayOfzzdn[j] = new zzdn(localzzdr, zzb(paramInputStream, paramzzdu));
                j++;
                localObject = localzzdr;
              }
              paramInputStream = new java/util/TreeMap;
              paramInputStream.<init>();
              j = k;
              while (j < i)
              {
                paramzzdu = arrayOfzzdn[j];
                if (!paramInputStream.containsKey(paramzzdu.zza()))
                {
                  paramInputStream.put(paramzzdu.zza(), paramzzdu.zzb());
                  j++;
                }
                else
                {
                  paramInputStream = new com/google/android/gms/internal/fido/zzdh;
                  paramInputStream.<init>("Attempted to add duplicate key to canonical CBOR Map.");
                  throw paramInputStream;
                }
              }
              return new zzdo(zzbg.zzf(paramInputStream));
            }
            paramInputStream = new com/google/android/gms/internal/fido/zzdl;
            paramInputStream.<init>("Parser being asked to read a large CBOR map");
            throw paramInputStream;
          }
          long l2 = paramzzdu.zza();
          if (l2 <= 1000L)
          {
            zzc(b, l2, paramInputStream, paramzzdu);
            localObject = new zzdr[(int)l2];
            while (j < l2)
            {
              localObject[j] = zzb(paramInputStream, paramzzdu);
              j++;
            }
            return new zzdi(zzaz.zzi((Object[])localObject));
          }
          paramInputStream = new com/google/android/gms/internal/fido/zzdl;
          paramInputStream.<init>("Parser being asked to read a large CBOR array");
          throw paramInputStream;
        }
        catch (RuntimeException paramInputStream) {}catch (IOException paramInputStream) {}
        throw new zzdl("Error in decoding CborValue from bytes", paramInputStream);
      }
      throw new zzdl("Parser being asked to parse an empty input stream");
    }
    catch (IOException paramInputStream)
    {
      throw new zzdl("Error in decoding CborValue from bytes", paramInputStream);
    }
  }
  
  private static final void zzc(byte paramByte, long paramLong, InputStream paramInputStream, zzdu paramzzdu)
  {
    switch (paramByte)
    {
    default: 
      break;
    case 27: 
      if (paramLong < 4294967296L)
      {
        paramInputStream = new StringBuilder();
        paramInputStream.append("Integer value ");
        paramInputStream.append(paramLong);
        paramInputStream.append(" after add info could have been represented in 0-4 additional bytes, but used 8");
        throw new zzdh(paramInputStream.toString());
      }
      break;
    case 26: 
      if (paramLong < 65536L)
      {
        paramInputStream = new StringBuilder();
        paramInputStream.append("Integer value ");
        paramInputStream.append(paramLong);
        paramInputStream.append(" after add info could have been represented in 0-2 additional bytes, but used 4");
        throw new zzdh(paramInputStream.toString());
      }
      break;
    case 25: 
      if (paramLong < 256L)
      {
        paramInputStream = new StringBuilder();
        paramInputStream.append("Integer value ");
        paramInputStream.append(paramLong);
        paramInputStream.append(" after add info could have been represented in 0-1 additional bytes, but used 2");
        throw new zzdh(paramInputStream.toString());
      }
      break;
    case 24: 
      if (paramLong < 24L)
      {
        paramInputStream = new StringBuilder();
        paramInputStream.append("Integer value ");
        paramInputStream.append(paramLong);
        paramInputStream.append(" after add info could have been represented in 0 additional bytes, but used 1");
        throw new zzdh(paramInputStream.toString());
      }
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzds
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */