package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public abstract interface s
{
  public static final s d = new z();
  public static final s e = new q();
  public static final s f = new l("continue");
  public static final s g = new l("break");
  public static final s h = new l("return");
  public static final s i = new h(Boolean.TRUE);
  public static final s j = new h(Boolean.FALSE);
  public static final s k = new u("");
  
  public abstract s c();
  
  public abstract Boolean d();
  
  public abstract Double f();
  
  public abstract String g();
  
  public abstract Iterator k();
  
  public abstract s s(String paramString, f3 paramf3, List paramList);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */