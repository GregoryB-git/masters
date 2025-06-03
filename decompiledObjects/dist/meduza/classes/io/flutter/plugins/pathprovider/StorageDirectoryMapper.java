package io.flutter.plugins.pathprovider;

import android.os.Environment;

class StorageDirectoryMapper
{
  public static String androidType(Integer paramInteger)
  {
    if (paramInteger == null) {
      return null;
    }
    switch (paramInteger.intValue())
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Unknown index: ");
      localStringBuilder.append(paramInteger);
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 9: 
      return Environment.DIRECTORY_DOCUMENTS;
    case 8: 
      return Environment.DIRECTORY_DCIM;
    case 7: 
      return Environment.DIRECTORY_DOWNLOADS;
    case 6: 
      return Environment.DIRECTORY_MOVIES;
    case 5: 
      return Environment.DIRECTORY_PICTURES;
    case 4: 
      return Environment.DIRECTORY_NOTIFICATIONS;
    case 3: 
      return Environment.DIRECTORY_ALARMS;
    case 2: 
      return Environment.DIRECTORY_RINGTONES;
    case 1: 
      return Environment.DIRECTORY_PODCASTS;
    }
    return Environment.DIRECTORY_MUSIC;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.pathprovider.StorageDirectoryMapper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */