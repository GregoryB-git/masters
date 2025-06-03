package io.flutter.plugins.sharedpreferences;

import android.content.Context;
import ec.n;
import ec.t;
import fc.a;
import jc.h;
import o0.i;
import p2.m0;
import r0.d;

public final class SharedPreferencesPluginKt
{
  public static final String LIST_PREFIX = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu";
  public static final String SHARED_PREFERENCES_NAME = "FlutterSharedPreferences";
  public static final String TAG = "SharedPreferencesPlugin";
  private static final a sharedPreferencesDataStore$delegate = m0.Y("FlutterSharedPreferences", null, 14);
  
  static
  {
    n localn = new n(SharedPreferencesPluginKt.class, "sharedPreferencesDataStore", "getSharedPreferencesDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
    t.a.getClass();
    $$delegatedProperties = new h[] { localn };
  }
  
  private static final i<d> getSharedPreferencesDataStore(Context paramContext)
  {
    return sharedPreferencesDataStore$delegate.a(paramContext, $$delegatedProperties[0]);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPluginKt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */