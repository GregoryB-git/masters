package com.google.android.recaptcha.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import dc.p;
import java.util.List;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import vb.a;
import wb.i;

final class zzer
  extends i
  implements p
{
  public zzer(zzes paramzzes, zztx paramzztx, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzer(zza, zzb, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    f.b(paramObject);
    Object localObject2 = zzb;
    paramObject = zza;
    try
    {
      if (zzes.zzb((zzes)paramObject) != null)
      {
        localObject1 = new com/google/android/recaptcha/internal/zzej;
        localObject2 = ((zzko)localObject2).zzd();
        ((zzej)localObject1).<init>(zzkh.zzg().zzi((byte[])localObject2, 0, localObject2.length), System.currentTimeMillis(), 0);
        localObject2 = zzes.zzb((zzes)paramObject);
        ContentValues localContentValues = new android/content/ContentValues;
        localContentValues.<init>();
        localContentValues.put("ss", ((zzej)localObject1).zzc());
        localContentValues.put("ts", Long.valueOf(((zzej)localObject1).zzb()));
        ((SQLiteOpenHelper)localObject2).getWritableDatabase().insert("ce", null, localContentValues);
        int i = zzes.zzb((zzes)paramObject).zzb() - 500;
        if (i > 0)
        {
          localObject1 = q.q(zzes.zzb((zzes)paramObject).zzd(), i);
          zzes.zzb((zzes)paramObject).zza((List)localObject1);
        }
        if (zzes.zzb((zzes)paramObject).zzb() >= 20) {
          zzes.zze((zzes)paramObject);
        }
      }
      return h.a;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */