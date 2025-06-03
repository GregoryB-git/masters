package j8;

import java.util.HashMap;

public enum g$a
{
  public static final HashMap b;
  
  static
  {
    a locala1 = new a("X86_32", 0);
    a locala2 = new a("X86_64", 1);
    a locala3 = new a("ARM_UNKNOWN", 2);
    a locala4 = new a("PPC", 3);
    a locala5 = new a("PPC64", 4);
    a locala6 = new a("ARMV6", 5);
    a locala7 = new a("ARMV7", 6);
    Object localObject = new a("UNKNOWN", 7);
    a = (a)localObject;
    a locala8 = new a("ARMV7S", 8);
    a locala9 = new a("ARM64", 9);
    c = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7, localObject, locala8, locala9 };
    localObject = new HashMap(4);
    b = (HashMap)localObject;
    ((HashMap)localObject).put("armeabi-v7a", locala7);
    ((HashMap)localObject).put("armeabi", locala6);
    ((HashMap)localObject).put("arm64-v8a", locala9);
    ((HashMap)localObject).put("x86", locala1);
  }
  
  public g$a() {}
}

/* Location:
 * Qualified Name:     j8.g.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */