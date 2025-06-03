package com.google.android.gms.internal.firebase_auth_api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import n6.b;

public final class zzaib
  implements Parcelable.Creator<zzaic>
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    int i = b.u(paramParcel);
    boolean bool1 = false;
    boolean bool2 = bool1;
    boolean bool3 = bool2;
    String str1 = null;
    String str2 = str1;
    String str3 = str2;
    String str4 = str3;
    String str5 = str4;
    String str6 = str5;
    String str7 = str6;
    String str8 = str7;
    String str9 = str8;
    String str10 = str9;
    String str11 = str10;
    String str12 = str11;
    String str13 = str12;
    while (paramParcel.dataPosition() < i)
    {
      int j = paramParcel.readInt();
      switch ((char)j)
      {
      default: 
        b.t(j, paramParcel);
        break;
      case '\021': 
        str13 = b.f(j, paramParcel);
        break;
      case '\020': 
        bool3 = b.k(j, paramParcel);
        break;
      case '\017': 
        str12 = b.f(j, paramParcel);
        break;
      case '\016': 
        str11 = b.f(j, paramParcel);
        break;
      case '\r': 
        str10 = b.f(j, paramParcel);
        break;
      case '\f': 
        str9 = b.f(j, paramParcel);
        break;
      case '\013': 
        bool2 = b.k(j, paramParcel);
        break;
      case '\n': 
        bool1 = b.k(j, paramParcel);
        break;
      case '\t': 
        str8 = b.f(j, paramParcel);
        break;
      case '\b': 
        str7 = b.f(j, paramParcel);
        break;
      case '\007': 
        str6 = b.f(j, paramParcel);
        break;
      case '\006': 
        str5 = b.f(j, paramParcel);
        break;
      case '\005': 
        str4 = b.f(j, paramParcel);
        break;
      case '\004': 
        str3 = b.f(j, paramParcel);
        break;
      case '\003': 
        str2 = b.f(j, paramParcel);
        break;
      case '\002': 
        str1 = b.f(j, paramParcel);
      }
    }
    b.j(i, paramParcel);
    return new zzaic(str1, str2, str3, str4, str5, str6, str7, str8, bool1, bool2, str9, str10, str11, str12, bool3, str13);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaib
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */