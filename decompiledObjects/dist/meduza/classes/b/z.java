package b;

import android.database.AbstractCursor;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.MatrixCursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b8.c1;
import b8.f;
import b8.i0;
import b8.n0;
import b8.t;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.Registrar;
import d8.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ma.h;
import n7.w;
import nc.s;
import p1.l;
import p2.m0;
import rb.g;
import t5.k;
import v5.e0;
import v5.p;

public class z
  implements Continuation, o0.b, e, v6.b
{
  public static final String[] a;
  public static final String[] b;
  public static final String[] c;
  public static final String[] d;
  public static final z e;
  public static final z o;
  public static final z p;
  public static final int[] q;
  
  public static void A(Parcel paramParcel, int paramInt, int[] paramArrayOfInt, boolean paramBoolean)
  {
    if (paramArrayOfInt == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt | 0x0);
      }
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeIntArray(paramArrayOfInt);
    L(paramInt, paramParcel);
  }
  
  public static void B(Parcel paramParcel, int paramInt, Integer paramInteger)
  {
    if (paramInteger == null) {
      return;
    }
    paramParcel.writeInt(paramInt | 0x40000);
    paramParcel.writeInt(paramInteger.intValue());
  }
  
  public static void C(Parcel paramParcel, int paramInt, long paramLong)
  {
    paramParcel.writeInt(paramInt | 0x80000);
    paramParcel.writeLong(paramLong);
  }
  
  public static void D(Parcel paramParcel, int paramInt, Long paramLong)
  {
    if (paramLong == null) {
      return;
    }
    paramParcel.writeInt(paramInt | 0x80000);
    paramParcel.writeLong(paramLong.longValue());
  }
  
  public static void E(Parcel paramParcel, int paramInt1, Parcelable paramParcelable, int paramInt2, boolean paramBoolean)
  {
    if (paramParcelable == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt1 | 0x0);
      }
      return;
    }
    paramInt1 = J(paramInt1, paramParcel);
    paramParcelable.writeToParcel(paramParcel, paramInt2);
    L(paramInt1, paramParcel);
  }
  
  public static void F(Parcel paramParcel, int paramInt, String paramString, boolean paramBoolean)
  {
    if (paramString == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt | 0x0);
      }
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeString(paramString);
    L(paramInt, paramParcel);
  }
  
  public static void G(Parcel paramParcel, int paramInt, List paramList)
  {
    if (paramList == null) {
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeStringList(paramList);
    L(paramInt, paramParcel);
  }
  
  public static void H(Parcel paramParcel, int paramInt1, Parcelable[] paramArrayOfParcelable, int paramInt2)
  {
    if (paramArrayOfParcelable == null) {
      return;
    }
    int i = J(paramInt1, paramParcel);
    int j = paramArrayOfParcelable.length;
    paramParcel.writeInt(j);
    for (paramInt1 = 0; paramInt1 < j; paramInt1++)
    {
      Parcelable localParcelable = paramArrayOfParcelable[paramInt1];
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        M(paramParcel, localParcelable, paramInt2);
      }
    }
    L(i, paramParcel);
  }
  
  public static void I(Parcel paramParcel, int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt | 0x0);
      }
      return;
    }
    int i = J(paramInt, paramParcel);
    int j = paramList.size();
    paramParcel.writeInt(j);
    for (paramInt = 0; paramInt < j; paramInt++)
    {
      Parcelable localParcelable = (Parcelable)paramList.get(paramInt);
      if (localParcelable == null) {
        paramParcel.writeInt(0);
      } else {
        M(paramParcel, localParcelable, 0);
      }
    }
    L(i, paramParcel);
  }
  
  public static int J(int paramInt, Parcel paramParcel)
  {
    paramParcel.writeInt(paramInt | 0xFFFF0000);
    paramParcel.writeInt(0);
    return paramParcel.dataPosition();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaic K(f paramf, String paramString)
  {
    m6.j.i(paramf);
    if (b8.u.class.isAssignableFrom(paramf.getClass()))
    {
      paramf = (b8.u)paramf;
      return new com.google.android.gms.internal.firebase_auth_api.zzaic(a, b, "google.com", null, null, null, paramString, null, null);
    }
    if (b8.i.class.isAssignableFrom(paramf.getClass())) {
      return new com.google.android.gms.internal.firebase_auth_api.zzaic(null, a, "facebook.com", null, null, null, paramString, null, null);
    }
    if (n0.class.isAssignableFrom(paramf.getClass()))
    {
      paramf = (n0)paramf;
      return new com.google.android.gms.internal.firebase_auth_api.zzaic(null, a, "twitter.com", null, b, null, paramString, null, null);
    }
    if (t.class.isAssignableFrom(paramf.getClass())) {
      return new com.google.android.gms.internal.firebase_auth_api.zzaic(null, a, "github.com", null, null, null, paramString, null, null);
    }
    if (i0.class.isAssignableFrom(paramf.getClass())) {
      return new com.google.android.gms.internal.firebase_auth_api.zzaic(null, null, "playgames.google.com", null, null, a, paramString, null, null);
    }
    if (c1.class.isAssignableFrom(paramf.getClass()))
    {
      c1 localc1 = (c1)paramf;
      paramf = d;
      if (paramf == null) {
        paramf = new com.google.android.gms.internal.firebase_auth_api.zzaic(b, c, a, null, f, null, paramString, e, o);
      }
      return paramf;
    }
    throw new IllegalArgumentException("Unsupported credential type.");
  }
  
  public static void L(int paramInt, Parcel paramParcel)
  {
    int i = paramParcel.dataPosition();
    paramParcel.setDataPosition(paramInt - 4);
    paramParcel.writeInt(i - paramInt);
    paramParcel.setDataPosition(i);
  }
  
  public static void M(Parcel paramParcel, Parcelable paramParcelable, int paramInt)
  {
    int i = paramParcel.dataPosition();
    paramParcel.writeInt(1);
    int j = paramParcel.dataPosition();
    paramParcelable.writeToParcel(paramParcel, paramInt);
    paramInt = paramParcel.dataPosition();
    paramParcel.setDataPosition(i);
    paramParcel.writeInt(paramInt - j);
    paramParcel.setDataPosition(paramInt);
  }
  
  public static s b()
  {
    return new s(null);
  }
  
  public static void d(k paramk)
  {
    if (paramk != null) {}
    try
    {
      paramk.close();
      return;
    }
    catch (IOException paramk)
    {
      for (;;) {}
    }
  }
  
  public static String e(String paramString)
  {
    int i = String.valueOf(paramString).length();
    StringBuilder localStringBuilder = new StringBuilder(String.valueOf(paramString).length() + (i + 5));
    localStringBuilder.append(".");
    localStringBuilder.append(paramString);
    localStringBuilder.append(",.");
    localStringBuilder.append(paramString);
    localStringBuilder.append(" *");
    return localStringBuilder.toString();
  }
  
  public static String i(h paramh)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramh.size());
    for (int i = 0; i < paramh.size(); i++)
    {
      int j = paramh.i(i);
      String str;
      if (j != 34)
      {
        if (j != 39)
        {
          if (j != 92)
          {
            switch (j)
            {
            default: 
              if ((j < 32) || (j > 126)) {
                break;
              }
              break;
            case 13: 
              str = "\\r";
              break;
            case 12: 
              str = "\\f";
              break;
            case 11: 
              str = "\\v";
              break;
            case 10: 
              str = "\\n";
              break;
            case 9: 
              str = "\\t";
              break;
            case 8: 
              str = "\\b";
              break;
            case 7: 
              str = "\\a";
              break;
            }
            localStringBuilder.append('\\');
            localStringBuilder.append((char)((j >>> 6 & 0x3) + 48));
            localStringBuilder.append((char)((j >>> 3 & 0x7) + 48));
            j = (j & 0x7) + 48;
            localStringBuilder.append((char)j);
            continue;
          }
          str = "\\\\";
        }
        else
        {
          str = "\\'";
        }
      }
      else {
        str = "\\\"";
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public static int j(double paramDouble1, double paramDouble2)
  {
    if (paramDouble1 < paramDouble2) {
      return -1;
    }
    boolean bool = paramDouble1 < paramDouble2;
    if (bool) {
      return 1;
    }
    if (!bool) {
      return 0;
    }
    if (!Double.isNaN(paramDouble2)) {
      return -1;
    }
    if (!Double.isNaN(paramDouble1)) {
      return 1;
    }
    return 0;
  }
  
  public static int k(String paramString)
  {
    String str = paramString;
    if (str == null) {
      return -1;
    }
    ArrayList localArrayList = p.a;
    int i = paramString.hashCode();
    int j = 2;
    switch (i)
    {
    }
    do
    {
      do
      {
        do
        {
          i = -1;
          break;
        } while (!str.equals("audio/mp3"));
        i = 2;
        break;
      } while (!str.equals("audio/x-wav"));
      i = 1;
      break;
    } while (!str.equals("audio/x-flac"));
    i = 0;
    switch (i)
    {
    default: 
      paramString = str;
      break;
    case 2: 
      paramString = "audio/mpeg";
      break;
    case 1: 
      paramString = "audio/wav";
      break;
    case 0: 
      paramString = "audio/flac";
    }
    switch (paramString.hashCode())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    do
                                    {
                                      do
                                      {
                                        do
                                        {
                                          do
                                          {
                                            do
                                            {
                                              do
                                              {
                                                do
                                                {
                                                  do
                                                  {
                                                    do
                                                    {
                                                      i = -1;
                                                      break;
                                                    } while (!paramString.equals("video/x-matroska"));
                                                    i = 25;
                                                    break;
                                                  } while (!paramString.equals("audio/webm"));
                                                  i = 24;
                                                  break;
                                                } while (!paramString.equals("audio/mpeg"));
                                                i = 23;
                                                break;
                                              } while (!paramString.equals("audio/midi"));
                                              i = 22;
                                              break;
                                            } while (!paramString.equals("audio/flac"));
                                            i = 21;
                                            break;
                                          } while (!paramString.equals("audio/eac3"));
                                          i = 20;
                                          break;
                                        } while (!paramString.equals("audio/3gpp"));
                                        i = 19;
                                        break;
                                      } while (!paramString.equals("video/mp4"));
                                      i = 18;
                                      break;
                                    } while (!paramString.equals("audio/wav"));
                                    i = 17;
                                    break;
                                  } while (!paramString.equals("audio/ogg"));
                                  i = 16;
                                  break;
                                } while (!paramString.equals("audio/mp4"));
                                i = 15;
                                break;
                              } while (!paramString.equals("audio/amr"));
                              i = 14;
                              break;
                            } while (!paramString.equals("audio/ac4"));
                            i = 13;
                            break;
                          } while (!paramString.equals("audio/ac3"));
                          i = 12;
                          break;
                        } while (!paramString.equals("video/x-flv"));
                        i = 11;
                        break;
                      } while (!paramString.equals("application/webm"));
                      i = 10;
                      break;
                    } while (!paramString.equals("audio/x-matroska"));
                    i = 9;
                    break;
                  } while (!paramString.equals("text/vtt"));
                  i = 8;
                  break;
                } while (!paramString.equals("video/x-msvideo"));
                i = 7;
                break;
              } while (!paramString.equals("application/mp4"));
              i = 6;
              break;
            } while (!paramString.equals("image/jpeg"));
            i = 5;
            break;
          } while (!paramString.equals("audio/amr-wb"));
          i = 4;
          break;
        } while (!paramString.equals("video/webm"));
        i = 3;
        break;
        i = j;
        if (paramString.equals("video/mp2t")) {
          break;
        }
      } while ((goto 384) || (!paramString.equals("video/mp2p")));
      i = 1;
      break;
    } while (!paramString.equals("audio/eac3-joc"));
    i = 0;
    switch (i)
    {
    default: 
      return -1;
    case 23: 
      return 7;
    case 22: 
      return 15;
    case 21: 
      return 4;
    case 17: 
      return 12;
    case 16: 
      return 9;
    case 13: 
      return 1;
    case 11: 
      return 5;
    case 8: 
      return 13;
    case 7: 
      return 16;
    case 6: 
    case 15: 
    case 18: 
      return 8;
    case 5: 
      return 14;
    case 4: 
    case 14: 
    case 19: 
      return 3;
    case 3: 
    case 9: 
    case 10: 
    case 24: 
    case 25: 
      return 6;
    case 2: 
      return 11;
    case 1: 
      return 10;
    }
    return 0;
  }
  
  public static int l(Map paramMap)
  {
    paramMap = (List)paramMap.get("Content-Type");
    if ((paramMap != null) && (!paramMap.isEmpty())) {
      paramMap = (String)paramMap.get(0);
    } else {
      paramMap = null;
    }
    return k(paramMap);
  }
  
  public static int m(Uri paramUri)
  {
    paramUri = paramUri.getLastPathSegment();
    if (paramUri == null) {
      return -1;
    }
    if ((!paramUri.endsWith(".ac3")) && (!paramUri.endsWith(".ec3")))
    {
      if (paramUri.endsWith(".ac4")) {
        return 1;
      }
      if ((!paramUri.endsWith(".adts")) && (!paramUri.endsWith(".aac")))
      {
        if (paramUri.endsWith(".amr")) {
          return 3;
        }
        if (paramUri.endsWith(".flac")) {
          return 4;
        }
        if (paramUri.endsWith(".flv")) {
          return 5;
        }
        if ((!paramUri.endsWith(".mid")) && (!paramUri.endsWith(".midi")) && (!paramUri.endsWith(".smf")))
        {
          if ((!paramUri.startsWith(".mk", paramUri.length() - 4)) && (!paramUri.endsWith(".webm")))
          {
            if (paramUri.endsWith(".mp3")) {
              return 7;
            }
            if ((!paramUri.endsWith(".mp4")) && (!paramUri.startsWith(".m4", paramUri.length() - 4)) && (!paramUri.startsWith(".mp4", paramUri.length() - 5)) && (!paramUri.startsWith(".cmf", paramUri.length() - 5)))
            {
              if ((!paramUri.startsWith(".og", paramUri.length() - 4)) && (!paramUri.endsWith(".opus")))
              {
                if ((!paramUri.endsWith(".ps")) && (!paramUri.endsWith(".mpeg")) && (!paramUri.endsWith(".mpg")) && (!paramUri.endsWith(".m2p")))
                {
                  if ((!paramUri.endsWith(".ts")) && (!paramUri.startsWith(".ts", paramUri.length() - 4)))
                  {
                    if ((!paramUri.endsWith(".wav")) && (!paramUri.endsWith(".wave")))
                    {
                      if ((!paramUri.endsWith(".vtt")) && (!paramUri.endsWith(".webvtt")))
                      {
                        if ((!paramUri.endsWith(".jpg")) && (!paramUri.endsWith(".jpeg")))
                        {
                          if (paramUri.endsWith(".avi")) {
                            return 16;
                          }
                          return -1;
                        }
                        return 14;
                      }
                      return 13;
                    }
                    return 12;
                  }
                  return 11;
                }
                return 10;
              }
              return 9;
            }
            return 8;
          }
          return 6;
        }
        return 15;
      }
      return 2;
    }
    return 0;
  }
  
  public static final g n(dc.a parama)
  {
    ec.i.e(parama, "initializer");
    return new g(parama);
  }
  
  public static final Cursor o(p1.j paramj, l paraml, boolean paramBoolean)
  {
    ec.i.e(paramj, "db");
    ec.i.e(paraml, "sqLiteQuery");
    paramj = paramj.l(paraml, null);
    if ((paramBoolean) && ((paramj instanceof AbstractWindowedCursor)))
    {
      paraml = (AbstractWindowedCursor)paramj;
      int i = paraml.getCount();
      int j;
      if (paraml.hasWindow()) {
        j = paraml.getWindow().getNumRows();
      } else {
        j = i;
      }
      if (j < i)
      {
        ec.i.e(paramj, "c");
        try
        {
          paraml = new android/database/MatrixCursor;
          paraml.<init>(paramj.getColumnNames(), paramj.getCount());
          while (paramj.moveToNext())
          {
            Object[] arrayOfObject = new Object[paramj.getColumnCount()];
            j = 0;
            i = paramj.getColumnCount();
            while (j < i)
            {
              int k = paramj.getType(j);
              if (k != 0)
              {
                if (k != 1)
                {
                  if (k != 2)
                  {
                    if (k != 3)
                    {
                      if (k == 4)
                      {
                        arrayOfObject[j] = paramj.getBlob(j);
                      }
                      else
                      {
                        paraml = new java/lang/IllegalStateException;
                        paraml.<init>();
                        throw paraml;
                      }
                    }
                    else {
                      arrayOfObject[j] = paramj.getString(j);
                    }
                  }
                  else {
                    arrayOfObject[j] = Double.valueOf(paramj.getDouble(j));
                  }
                }
                else {
                  arrayOfObject[j] = Long.valueOf(paramj.getLong(j));
                }
              }
              else {
                arrayOfObject[j] = null;
              }
              j++;
            }
            paraml.addRow(arrayOfObject);
          }
          x6.b.L(paramj, null);
          return paraml;
        }
        finally
        {
          try
          {
            throw paraml;
          }
          finally
          {
            x6.b.L(paramj, paraml);
          }
        }
      }
    }
    return paramj;
  }
  
  public static String p(int paramInt)
  {
    return e0.m("rgba(%d,%d,%d,%.3f)", new Object[] { Integer.valueOf(Color.red(paramInt)), Integer.valueOf(Color.green(paramInt)), Integer.valueOf(Color.blue(paramInt)), Double.valueOf(Color.alpha(paramInt) / 255.0D) });
  }
  
  public static void r(Object paramObject, String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new w(m0.X(paramString, new Object[] { paramObject }));
  }
  
  public static void t(Parcel paramParcel, int paramInt, boolean paramBoolean)
  {
    paramParcel.writeInt(paramInt | 0x40000);
    paramParcel.writeInt(paramBoolean);
  }
  
  public static void u(Parcel paramParcel, int paramInt, Boolean paramBoolean)
  {
    if (paramBoolean == null) {
      return;
    }
    paramParcel.writeInt(paramInt | 0x40000);
    paramParcel.writeInt(paramBoolean.booleanValue());
  }
  
  public static void v(Parcel paramParcel, int paramInt, Bundle paramBundle, boolean paramBoolean)
  {
    if (paramBundle == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt | 0x0);
      }
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeBundle(paramBundle);
    L(paramInt, paramParcel);
  }
  
  public static void w(Parcel paramParcel, int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    if (paramArrayOfByte == null)
    {
      if (paramBoolean) {
        paramParcel.writeInt(paramInt | 0x0);
      }
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeByteArray(paramArrayOfByte);
    L(paramInt, paramParcel);
  }
  
  public static void x(Parcel paramParcel, int paramInt, Double paramDouble)
  {
    if (paramDouble == null) {
      return;
    }
    paramParcel.writeInt(paramInt | 0x80000);
    paramParcel.writeDouble(paramDouble.doubleValue());
  }
  
  public static void y(Parcel paramParcel, int paramInt, IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return;
    }
    paramInt = J(paramInt, paramParcel);
    paramParcel.writeStrongBinder(paramIBinder);
    L(paramInt, paramParcel);
  }
  
  public static void z(Parcel paramParcel, int paramInt1, int paramInt2)
  {
    paramParcel.writeInt(paramInt1 | 0x40000);
    paramParcel.writeInt(paramInt2);
  }
  
  public Object a(o0.a parama)
  {
    throw parama;
  }
  
  public boolean c(int paramInt)
  {
    boolean bool;
    if ((4 > paramInt) && (!Log.isLoggable("FirebaseCrashlytics", paramInt))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public long f()
  {
    return System.currentTimeMillis();
  }
  
  public Object g(d8.u paramu)
  {
    return Registrar.lambda$getComponents$0$Registrar(paramu);
  }
  
  public void h(String paramString)
  {
    if (c(3)) {
      Log.d("FirebaseCrashlytics", paramString, null);
    }
  }
  
  public void q(String paramString)
  {
    if (c(2)) {
      Log.v("FirebaseCrashlytics", paramString, null);
    }
  }
  
  public void s(String paramString, Exception paramException)
  {
    if (c(5)) {
      Log.w("FirebaseCrashlytics", paramString, paramException);
    }
  }
  
  public Object then(Task paramTask)
  {
    if (paramTask.isSuccessful()) {
      return (Bundle)paramTask.getResult();
    }
    if (Log.isLoggable("Rpc", 3)) {
      Log.d("Rpc", "Error making request: ".concat(String.valueOf(paramTask.getException())));
    }
    throw new IOException("SERVICE_NOT_AVAILABLE", paramTask.getException());
  }
}

/* Location:
 * Qualified Name:     b.z
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */