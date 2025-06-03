package com.google.firebase.iid;

import V2.j;
import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;
import p4.r;

public class a
{
  public final Executor a;
  public final Map b = new t.a();
  
  public a(Executor paramExecutor)
  {
    a = paramExecutor;
  }
  
  public j a(String paramString1, String paramString2, a parama)
  {
    Pair localPair;
    int i;
    try
    {
      localPair = new android/util/Pair;
      localPair.<init>(paramString1, paramString2);
      paramString1 = (j)b.get(localPair);
      if (paramString1 == null) {
        break label101;
      }
      if (Log.isLoggable("FirebaseInstanceId", 3))
      {
        parama = String.valueOf(localPair);
        i = parama.length();
        paramString2 = new java/lang/StringBuilder;
        paramString2.<init>(i + 29);
        paramString2.append("Joining ongoing request for: ");
        paramString2.append(parama);
        Log.d("FirebaseInstanceId", paramString2.toString());
      }
    }
    finally
    {
      break label205;
    }
    return paramString1;
    label101:
    if (Log.isLoggable("FirebaseInstanceId", 3))
    {
      paramString2 = String.valueOf(localPair);
      i = paramString2.length();
      paramString1 = new java/lang/StringBuilder;
      paramString1.<init>(i + 24);
      paramString1.append("Making new request for: ");
      paramString1.append(paramString2);
      Log.d("FirebaseInstanceId", paramString1.toString());
    }
    paramString1 = parama.start();
    paramString2 = a;
    parama = new p4/r;
    parama.<init>(this, localPair);
    paramString1 = paramString1.h(paramString2, parama);
    b.put(localPair, paramString1);
    return paramString1;
    label205:
    throw paramString1;
  }
  
  public static abstract interface a
  {
    public abstract j start();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.iid.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */