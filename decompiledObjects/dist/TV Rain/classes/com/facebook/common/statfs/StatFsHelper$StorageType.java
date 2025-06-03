package com.facebook.common.statfs;

public enum StatFsHelper$StorageType
{
  static
  {
    StorageType localStorageType1 = new StorageType("INTERNAL", 0);
    INTERNAL = localStorageType1;
    StorageType localStorageType2 = new StorageType("EXTERNAL", 1);
    EXTERNAL = localStorageType2;
    $VALUES = new StorageType[] { localStorageType1, localStorageType2 };
  }
  
  private StatFsHelper$StorageType() {}
}

/* Location:
 * Qualified Name:     com.facebook.common.statfs.StatFsHelper.StorageType
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */