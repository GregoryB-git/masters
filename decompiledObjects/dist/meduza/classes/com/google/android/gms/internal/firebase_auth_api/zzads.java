package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import t9.b;

public abstract interface zzads
{
  public static final p6.a zza = new p6.a("FirebaseAuth", new String[] { "GetAuthDomainTaskResponseHandler" });
  
  public abstract Context zza();
  
  public abstract Uri.Builder zza(Intent paramIntent, String paramString1, String paramString2);
  
  public abstract String zza(String paramString);
  
  public abstract HttpURLConnection zza(URL paramURL);
  
  public abstract void zza(Uri paramUri, String paramString, b<a8.a> paramb);
  
  public abstract void zza(String paramString, Status paramStatus);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzads
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */