package com.google.firebase.firestore;

import j9.g;
import j9.i;
import java.util.HashMap;
import java.util.Map;
import x6.b;

public final class j
  extends d
{
  public j(FirebaseFirestore paramFirebaseFirestore, i parami, g paramg, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramFirebaseFirestore, parami, paramg, paramBoolean1, paramBoolean2);
  }
  
  public final HashMap a(d.a parama)
  {
    if (parama != null)
    {
      parama = super.a(parama);
      boolean bool;
      if (parama != null) {
        bool = true;
      } else {
        bool = false;
      }
      b.Z("Data in a QueryDocumentSnapshot should be non-null", bool, new Object[0]);
      return parama;
    }
    throw new NullPointerException("Provided serverTimestampBehavior value must not be null.");
  }
  
  public final Map<String, Object> b()
  {
    Map localMap = super.b();
    boolean bool;
    if (localMap != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Data in a QueryDocumentSnapshot should be non-null", bool, new Object[0]);
    return localMap;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */