package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

public final class zzap
{
  public static final String zza(ContentResolver paramContentResolver)
  {
    paramContentResolver = paramContentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[] { "android_id" }, null);
    if ((paramContentResolver != null) && (paramContentResolver.moveToFirst()) && (paramContentResolver.getColumnCount() >= 2))
    {
      long l = Long.parseLong(paramContentResolver.getString(1));
      paramContentResolver.close();
      return String.valueOf(l);
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzap
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */