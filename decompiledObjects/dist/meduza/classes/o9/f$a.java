package o9;

import android.util.SparseArray;

public enum f$a
{
  static
  {
    a locala1 = new a("OK", 0);
    a = locala1;
    a locala2 = new a("CANCELLED", 1);
    b = locala2;
    a locala3 = new a("UNKNOWN", 2);
    c = locala3;
    a locala4 = new a("INVALID_ARGUMENT", 3);
    d = locala4;
    a locala5 = new a("DEADLINE_EXCEEDED", 4);
    e = locala5;
    a locala6 = new a("NOT_FOUND", 5);
    f = locala6;
    Object localObject1 = new a("ALREADY_EXISTS", 6);
    a locala7 = new a("PERMISSION_DENIED", 7);
    o = locala7;
    a locala8 = new a("RESOURCE_EXHAUSTED", 8);
    p = locala8;
    a locala9 = new a("FAILED_PRECONDITION", 9);
    a locala10 = new a("ABORTED", 10);
    q = locala10;
    a locala11 = new a("OUT_OF_RANGE", 11);
    a locala12 = new a("UNIMPLEMENTED", 12);
    r = locala12;
    a locala13 = new a("INTERNAL", 13);
    s = locala13;
    a locala14 = new a("UNAVAILABLE", 14);
    t = locala14;
    Object localObject2 = new a("DATA_LOSS", 15);
    a locala15 = new a("UNAUTHENTICATED", 16);
    u = locala15;
    v = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, localObject1, locala7, locala8, locala9, locala10, locala11, locala12, locala13, locala14, localObject2, locala15 };
    localObject2 = new SparseArray();
    localObject1 = values();
    int i = localObject1.length;
    int j = 0;
    while (j < i)
    {
      locala13 = localObject1[j];
      locala14 = (a)((SparseArray)localObject2).get(locala13.ordinal());
      int k;
      if (locala14 == null) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        ((SparseArray)localObject2).put(locala13.ordinal(), locala13);
        j++;
      }
      else
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Code value duplication between ");
        ((StringBuilder)localObject2).append(locala14);
        ((StringBuilder)localObject2).append('&');
        ((StringBuilder)localObject2).append(locala13.name());
        throw new IllegalStateException(((StringBuilder)localObject2).toString().toString());
      }
    }
  }
}

/* Location:
 * Qualified Name:     o9.f.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */