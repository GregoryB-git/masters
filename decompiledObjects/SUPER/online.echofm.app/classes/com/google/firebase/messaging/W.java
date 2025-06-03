package com.google.firebase.messaging;

import V2.j;
import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
import t.a;

public class W
{
  public final Executor a;
  public final Map b = new a();
  
  public W(Executor paramExecutor)
  {
    a = paramExecutor;
  }
  
  public j b(String paramString, a parama)
  {
    try
    {
      localObject = (j)b.get(paramString);
      if (localObject == null) {
        break label71;
      }
      if (Log.isLoggable("FirebaseMessaging", 3))
      {
        parama = new java/lang/StringBuilder;
        parama.<init>();
        parama.append("Joining ongoing request for: ");
        parama.append(paramString);
        Log.d("FirebaseMessaging", parama.toString());
      }
    }
    finally
    {
      break label159;
    }
    return (j)localObject;
    label71:
    if (Log.isLoggable("FirebaseMessaging", 3))
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      ((StringBuilder)localObject).append("Making new request for: ");
      ((StringBuilder)localObject).append(paramString);
      Log.d("FirebaseMessaging", ((StringBuilder)localObject).toString());
    }
    parama = parama.start();
    Object localObject = a;
    V localV = new com/google/firebase/messaging/V;
    localV.<init>(this, paramString);
    parama = parama.h((Executor)localObject, localV);
    b.put(paramString, parama);
    return parama;
    label159:
    throw paramString;
  }
  
  public static abstract interface a
  {
    public abstract j start();
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.messaging.W
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */