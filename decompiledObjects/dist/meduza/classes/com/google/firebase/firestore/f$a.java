package com.google.firebase.firestore;

import android.util.SparseArray;

public enum f$a
{
  public static final SparseArray<a> u;
  public final int a;
  
  static
  {
    a locala1 = new a("OK", 0, 0);
    b = locala1;
    a locala2 = new a("CANCELLED", 1, 1);
    c = locala2;
    a locala3 = new a("UNKNOWN", 2, 2);
    d = locala3;
    a locala4 = new a("INVALID_ARGUMENT", 3, 3);
    e = locala4;
    a locala5 = new a("DEADLINE_EXCEEDED", 4, 4);
    f = locala5;
    Object localObject1 = new a("NOT_FOUND", 5, 5);
    a locala6 = new a("ALREADY_EXISTS", 6, 6);
    o = locala6;
    a locala7 = new a("PERMISSION_DENIED", 7, 7);
    a locala8 = new a("RESOURCE_EXHAUSTED", 8, 8);
    a locala9 = new a("FAILED_PRECONDITION", 9, 9);
    p = locala9;
    a locala10 = new a("ABORTED", 10, 10);
    q = locala10;
    a locala11 = new a("OUT_OF_RANGE", 11, 11);
    a locala12 = new a("UNIMPLEMENTED", 12, 12);
    a locala13 = new a("INTERNAL", 13, 13);
    r = locala13;
    Object localObject2 = new a("UNAVAILABLE", 14, 14);
    s = (a)localObject2;
    a locala14 = new a("DATA_LOSS", 15, 15);
    a locala15 = new a("UNAUTHENTICATED", 16, 16);
    t = locala15;
    v = new a[] { locala1, locala2, locala3, locala4, locala5, localObject1, locala6, locala7, locala8, locala9, locala10, locala11, locala12, locala13, localObject2, locala14, locala15 };
    localObject2 = new SparseArray();
    localObject1 = values();
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      locala10 = localObject1[j];
      locala11 = (a)((SparseArray)localObject2).get(a);
      if (locala11 == null)
      {
        ((SparseArray)localObject2).put(a, locala10);
        j++;
      }
      else
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Code value duplication between ");
        ((StringBuilder)localObject1).append(locala11);
        ((StringBuilder)localObject1).append("&");
        ((StringBuilder)localObject1).append(locala10.name());
        throw new IllegalStateException(((StringBuilder)localObject1).toString());
      }
    }
    u = (SparseArray)localObject2;
  }
  
  public f$a(int paramInt)
  {
    a = paramInt;
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.firestore.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */