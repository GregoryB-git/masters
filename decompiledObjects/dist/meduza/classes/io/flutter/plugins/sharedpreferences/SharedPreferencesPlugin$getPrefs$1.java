package io.flutter.plugins.sharedpreferences;

import wb.c;

@wb.e(c="io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", f="SharedPreferencesPlugin.kt", l={203, 205}, m="getPrefs")
final class SharedPreferencesPlugin$getPrefs$1
  extends c
{
  public Object L$0;
  public Object L$1;
  public Object L$2;
  public Object L$3;
  public Object L$4;
  public int label;
  
  public SharedPreferencesPlugin$getPrefs$1(SharedPreferencesPlugin paramSharedPreferencesPlugin, ub.e<? super 1> parame)
  {
    super(parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    result = paramObject;
    label |= 0x80000000;
    return SharedPreferencesPlugin.access$getPrefs(this$0, null, this);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin.getPrefs.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */