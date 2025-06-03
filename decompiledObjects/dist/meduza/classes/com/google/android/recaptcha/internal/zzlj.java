package com.google.android.recaptcha.internal;

import java.nio.charset.Charset;
import java.util.List;

final class zzlj
  implements zzov
{
  private final zzli zza;
  private int zzb;
  private int zzc;
  private int zzd = 0;
  
  private zzlj(zzli paramzzli)
  {
    Charset localCharset = zznl.zza;
    zza = paramzzli;
    zzc = this;
  }
  
  private final void zzP(Object paramObject, zzow paramzzow, zzmo paramzzmo)
  {
    int i = zzc;
    zzc = (zzb >>> 3 << 3 | 0x4);
    try
    {
      paramzzow.zzh(paramObject, this, paramzzmo);
      int j = zzb;
      int k = zzc;
      if (j == k) {
        return;
      }
      paramObject = new com/google/android/recaptcha/internal/zznn;
      ((zznn)paramObject).<init>("Failed to parse the message.");
      throw ((Throwable)paramObject);
    }
    finally
    {
      zzc = i;
    }
  }
  
  private final void zzQ(Object paramObject, zzow paramzzow, zzmo paramzzmo)
  {
    zzli localzzli = zza;
    int i = localzzli.zzn();
    if (zza < zzb)
    {
      i = localzzli.zze(i);
      localzzli = zza;
      zza += 1;
      paramzzow.zzh(paramObject, this, paramzzmo);
      zza.zzz(0);
      paramObject = zza;
      zza -= 1;
      ((zzli)paramObject).zzA(i);
      return;
    }
    throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
  }
  
  private final void zzR(int paramInt)
  {
    if (zza.zzd() == paramInt) {
      return;
    }
    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
  }
  
  private final void zzS(int paramInt)
  {
    if ((zzb & 0x7) == paramInt) {
      return;
    }
    throw new zznm("Protocol message tag had invalid wire type.");
  }
  
  private static final void zzT(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw new zznn("Failed to parse the message.");
  }
  
  private static final void zzU(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw new zznn("Failed to parse the message.");
  }
  
  public static zzlj zzq(zzli paramzzli)
  {
    zzlj localzzlj = zzc;
    if (localzzlj != null) {
      return localzzlj;
    }
    return new zzlj(paramzzli);
  }
  
  public final void zzA(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = zza.zzn();
          zzU(i);
          j = zza.zzd();
          do
          {
            paramList.zzg(zza.zzo());
          } while (zza.zzd() < i + j);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzg(zza.zzo());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = zza.zzn();
          zzU(j);
          i = zza.zzd();
          do
          {
            paramList.add(Long.valueOf(zza.zzo()));
          } while (zza.zzd() < j + i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Long.valueOf(zza.zzo()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzB(List paramList)
  {
    if ((paramList instanceof zzmv))
    {
      paramList = (zzmv)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5) {
          do
          {
            paramList.zzf(zza.zzc());
            if (zza.zzC()) {
              break;
            }
            i = zza.zzm();
          } while (i == zzb);
        } else {
          throw new zznm("Protocol message tag had invalid wire type.");
        }
      }
      else
      {
        i = zza.zzn();
        zzT(i);
        j = zza.zzd();
        do
        {
          paramList.zzf(zza.zzc());
        } while (zza.zzd() < j + i);
        return;
      }
    }
    else
    {
      i = zzb & 0x7;
      if (i == 2) {
        break label207;
      }
      if (i != 5) {
        break label197;
      }
      do
      {
        paramList.add(Float.valueOf(zza.zzc()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
    return;
    label197:
    throw new zznm("Protocol message tag had invalid wire type.");
    label207:
    int i = zza.zzn();
    zzT(i);
    int j = zza.zzd();
    do
    {
      paramList.add(Float.valueOf(zza.zzc()));
    } while (zza.zzd() < j + i);
  }
  
  @Deprecated
  public final void zzC(List paramList, zzow paramzzow, zzmo paramzzmo)
  {
    int i = zzb;
    if ((i & 0x7) == 3)
    {
      int j;
      do
      {
        Object localObject = paramzzow.zze();
        zzP(localObject, paramzzow, paramzzmo);
        paramzzow.zzf(localObject);
        paramList.add(localObject);
        if ((zza.zzC()) || (zzd != 0)) {
          break;
        }
        j = zza.zzm();
      } while (j == i);
      zzd = j;
      return;
    }
    throw new zznm("Protocol message tag had invalid wire type.");
  }
  
  public final void zzD(List paramList)
  {
    Object localObject;
    int i;
    if ((paramList instanceof zzne))
    {
      localObject = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          paramList = zza;
          i = paramList.zzn();
          i = paramList.zzd() + i;
          do
          {
            ((zzne)localObject).zzh(zza.zzh());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        ((zzne)localObject).zzh(zza.zzh());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localObject = zza;
          i = ((zzli)localObject).zzn();
          i = ((zzli)localObject).zzd() + i;
          do
          {
            paramList.add(Integer.valueOf(zza.zzh()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzh()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzE(List paramList)
  {
    int i;
    zzli localzzli;
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.zzg(zza.zzp());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzg(zza.zzp());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.add(Long.valueOf(zza.zzp()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Long.valueOf(zza.zzp()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzF(List paramList, zzow paramzzow, zzmo paramzzmo)
  {
    int i = zzb;
    if ((i & 0x7) == 2)
    {
      int j;
      do
      {
        Object localObject = paramzzow.zze();
        zzQ(localObject, paramzzow, paramzzmo);
        paramzzow.zzf(localObject);
        paramList.add(localObject);
        if ((zza.zzC()) || (zzd != 0)) {
          break;
        }
        j = zza.zzm();
      } while (j == i);
      zzd = j;
      return;
    }
    throw new zznm("Protocol message tag had invalid wire type.");
  }
  
  public final void zzG(List paramList)
  {
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5) {
          do
          {
            paramList.zzh(zza.zzk());
            if (zza.zzC()) {
              break;
            }
            i = zza.zzm();
          } while (i == zzb);
        } else {
          throw new zznm("Protocol message tag had invalid wire type.");
        }
      }
      else
      {
        j = zza.zzn();
        zzT(j);
        i = zza.zzd();
        do
        {
          paramList.zzh(zza.zzk());
        } while (zza.zzd() < i + j);
        return;
      }
    }
    else
    {
      i = zzb & 0x7;
      if (i == 2) {
        break label207;
      }
      if (i != 5) {
        break label197;
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzk()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
    return;
    label197:
    throw new zznm("Protocol message tag had invalid wire type.");
    label207:
    int j = zza.zzn();
    zzT(j);
    int i = zza.zzd();
    do
    {
      paramList.add(Integer.valueOf(zza.zzk()));
    } while (zza.zzd() < i + j);
  }
  
  public final void zzH(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof zznx))
    {
      paramList = (zznx)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = zza.zzn();
          zzU(i);
          j = zza.zzd();
          do
          {
            paramList.zzg(zza.zzt());
          } while (zza.zzd() < i + j);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzg(zza.zzt());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = zza.zzn();
          zzU(j);
          i = zza.zzd();
          do
          {
            paramList.add(Long.valueOf(zza.zzt()));
          } while (zza.zzd() < j + i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Long.valueOf(zza.zzt()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzI(List paramList)
  {
    Object localObject;
    int i;
    if ((paramList instanceof zzne))
    {
      localObject = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          paramList = zza;
          i = paramList.zzn();
          i = paramList.zzd() + i;
          do
          {
            ((zzne)localObject).zzh(zza.zzl());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        ((zzne)localObject).zzh(zza.zzl());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localObject = zza;
          i = ((zzli)localObject).zzn();
          i = ((zzli)localObject).zzd() + i;
          do
          {
            paramList.add(Integer.valueOf(zza.zzl()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzl()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzJ(List paramList)
  {
    Object localObject;
    int i;
    if ((paramList instanceof zznx))
    {
      localObject = (zznx)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          paramList = zza;
          i = paramList.zzn();
          i = paramList.zzd() + i;
          do
          {
            ((zznx)localObject).zzg(zza.zzu());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        ((zznx)localObject).zzg(zza.zzu());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localObject = zza;
          i = ((zzli)localObject).zzn();
          i = ((zzli)localObject).zzd() + i;
          do
          {
            paramList.add(Long.valueOf(zza.zzu()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Long.valueOf(zza.zzu()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzK(List paramList, boolean paramBoolean)
  {
    if ((zzb & 0x7) == 2)
    {
      int i;
      if (((paramList instanceof zznu)) && (!paramBoolean))
      {
        paramList = (zznu)paramList;
        do
        {
          zzp();
          paramList.zzb();
          if (zza.zzC()) {
            break;
          }
          i = zza.zzm();
        } while (i == zzb);
      }
      else
      {
        do
        {
          String str;
          if (paramBoolean) {
            str = zzs();
          } else {
            str = zzr();
          }
          paramList.add(str);
          if (zza.zzC()) {
            return;
          }
          i = zza.zzm();
        } while (i == zzb);
      }
      zzd = i;
      return;
    }
    throw new zznm("Protocol message tag had invalid wire type.");
  }
  
  public final void zzL(List paramList)
  {
    int i;
    zzli localzzli;
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.zzh(zza.zzn());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzh(zza.zzn());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.add(Integer.valueOf(zza.zzn()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzn()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzM(List paramList)
  {
    Object localObject;
    int i;
    if ((paramList instanceof zznx))
    {
      localObject = (zznx)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          paramList = zza;
          i = paramList.zzn();
          i = paramList.zzd() + i;
          do
          {
            ((zznx)localObject).zzg(zza.zzv());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        ((zznx)localObject).zzg(zza.zzv());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localObject = zza;
          i = ((zzli)localObject).zzn();
          i = ((zzli)localObject).zzd() + i;
          do
          {
            paramList.add(Long.valueOf(zza.zzv()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Long.valueOf(zza.zzv()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final boolean zzN()
  {
    zzS(0);
    return zza.zzD();
  }
  
  public final boolean zzO()
  {
    if (!zza.zzC())
    {
      int i = zzb;
      if (i != zzc) {
        return zza.zzE(i);
      }
    }
    return false;
  }
  
  public final double zza()
  {
    zzS(1);
    return zza.zzb();
  }
  
  public final float zzb()
  {
    zzS(5);
    return zza.zzc();
  }
  
  public final int zzc()
  {
    int i = zzd;
    if (i != 0)
    {
      zzb = i;
      zzd = 0;
    }
    else
    {
      i = zza.zzm();
      zzb = i;
    }
    if ((i != 0) && (i != zzc)) {
      return i >>> 3;
    }
    return Integer.MAX_VALUE;
  }
  
  public final int zzd()
  {
    return zzb;
  }
  
  public final int zze()
  {
    zzS(0);
    return zza.zzf();
  }
  
  public final int zzf()
  {
    zzS(5);
    return zza.zzg();
  }
  
  public final int zzg()
  {
    zzS(0);
    return zza.zzh();
  }
  
  public final int zzh()
  {
    zzS(5);
    return zza.zzk();
  }
  
  public final int zzi()
  {
    zzS(0);
    return zza.zzl();
  }
  
  public final int zzj()
  {
    zzS(0);
    return zza.zzn();
  }
  
  public final long zzk()
  {
    zzS(1);
    return zza.zzo();
  }
  
  public final long zzl()
  {
    zzS(0);
    return zza.zzp();
  }
  
  public final long zzm()
  {
    zzS(1);
    return zza.zzt();
  }
  
  public final long zzn()
  {
    zzS(0);
    return zza.zzu();
  }
  
  public final long zzo()
  {
    zzS(0);
    return zza.zzv();
  }
  
  public final zzle zzp()
  {
    zzS(2);
    return zza.zzw();
  }
  
  public final String zzr()
  {
    zzS(2);
    return zza.zzx();
  }
  
  public final String zzs()
  {
    zzS(2);
    return zza.zzy();
  }
  
  public final void zzt(Object paramObject, zzow paramzzow, zzmo paramzzmo)
  {
    zzS(3);
    zzP(paramObject, paramzzow, paramzzmo);
  }
  
  public final void zzu(Object paramObject, zzow paramzzow, zzmo paramzzmo)
  {
    zzS(2);
    zzQ(paramObject, paramzzow, paramzzmo);
  }
  
  public final void zzv(List paramList)
  {
    Object localObject;
    int i;
    if ((paramList instanceof zzkv))
    {
      localObject = (zzkv)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          paramList = zza;
          i = paramList.zzn();
          i = paramList.zzd() + i;
          do
          {
            ((zzkv)localObject).zze(zza.zzD());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        ((zzkv)localObject).zze(zza.zzD());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localObject = zza;
          i = ((zzli)localObject).zzn();
          i = ((zzli)localObject).zzd() + i;
          do
          {
            paramList.add(Boolean.valueOf(zza.zzD()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Boolean.valueOf(zza.zzD()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzw(List paramList)
  {
    if ((zzb & 0x7) == 2)
    {
      int i;
      do
      {
        paramList.add(zzp());
        if (zza.zzC()) {
          return;
        }
        i = zza.zzm();
      } while (i == zzb);
      zzd = i;
      return;
    }
    throw new zznm("Protocol message tag had invalid wire type.");
  }
  
  public final void zzx(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof zzmi))
    {
      paramList = (zzmi)paramList;
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = zza.zzn();
          zzU(j);
          i = zza.zzd();
          do
          {
            paramList.zzf(zza.zzb());
          } while (zza.zzd() < j + i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzf(zza.zzb());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = zza.zzn();
          zzU(j);
          i = zza.zzd();
          do
          {
            paramList.add(Double.valueOf(zza.zzb()));
          } while (zza.zzd() < j + i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Double.valueOf(zza.zzb()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzy(List paramList)
  {
    int i;
    zzli localzzli;
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.zzh(zza.zzf());
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.zzh(zza.zzf());
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    else
    {
      i = zzb & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          localzzli = zza;
          i = localzzli.zzn();
          i = localzzli.zzd() + i;
          do
          {
            paramList.add(Integer.valueOf(zza.zzf()));
          } while (zza.zzd() < i);
          zzR(i);
          return;
        }
        throw new zznm("Protocol message tag had invalid wire type.");
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzf()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
  }
  
  public final void zzz(List paramList)
  {
    if ((paramList instanceof zzne))
    {
      paramList = (zzne)paramList;
      i = zzb & 0x7;
      if (i != 2)
      {
        if (i == 5) {
          do
          {
            paramList.zzh(zza.zzg());
            if (zza.zzC()) {
              break;
            }
            i = zza.zzm();
          } while (i == zzb);
        } else {
          throw new zznm("Protocol message tag had invalid wire type.");
        }
      }
      else
      {
        j = zza.zzn();
        zzT(j);
        i = zza.zzd();
        do
        {
          paramList.zzh(zza.zzg());
        } while (zza.zzd() < i + j);
        return;
      }
    }
    else
    {
      i = zzb & 0x7;
      if (i == 2) {
        break label207;
      }
      if (i != 5) {
        break label197;
      }
      do
      {
        paramList.add(Integer.valueOf(zza.zzg()));
        if (zza.zzC()) {
          break;
        }
        i = zza.zzm();
      } while (i == zzb);
    }
    zzd = i;
    return;
    label197:
    throw new zznm("Protocol message tag had invalid wire type.");
    label207:
    int i = zza.zzn();
    zzT(i);
    int j = zza.zzd();
    do
    {
      paramList.add(Integer.valueOf(zza.zzg()));
    } while (zza.zzd() < j + i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */