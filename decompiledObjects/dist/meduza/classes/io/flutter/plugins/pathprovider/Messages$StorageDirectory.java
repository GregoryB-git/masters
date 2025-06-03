package io.flutter.plugins.pathprovider;

public enum Messages$StorageDirectory
{
  public final int index;
  
  static
  {
    MUSIC = new StorageDirectory("MUSIC", 1, 1);
    PODCASTS = new StorageDirectory("PODCASTS", 2, 2);
    RINGTONES = new StorageDirectory("RINGTONES", 3, 3);
    ALARMS = new StorageDirectory("ALARMS", 4, 4);
    NOTIFICATIONS = new StorageDirectory("NOTIFICATIONS", 5, 5);
    PICTURES = new StorageDirectory("PICTURES", 6, 6);
    MOVIES = new StorageDirectory("MOVIES", 7, 7);
    DOWNLOADS = new StorageDirectory("DOWNLOADS", 8, 8);
    DCIM = new StorageDirectory("DCIM", 9, 9);
    DOCUMENTS = new StorageDirectory("DOCUMENTS", 10, 10);
  }
  
  private Messages$StorageDirectory(int paramInt)
  {
    index = paramInt;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.pathprovider.Messages.StorageDirectory
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */