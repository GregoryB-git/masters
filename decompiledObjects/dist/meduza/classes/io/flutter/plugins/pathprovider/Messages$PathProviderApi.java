package io.flutter.plugins.pathprovider;

import java.util.List;

public abstract interface Messages$PathProviderApi
{
  public abstract String getApplicationCachePath();
  
  public abstract String getApplicationDocumentsPath();
  
  public abstract String getApplicationSupportPath();
  
  public abstract List<String> getExternalCachePaths();
  
  public abstract String getExternalStoragePath();
  
  public abstract List<String> getExternalStoragePaths(Messages.StorageDirectory paramStorageDirectory);
  
  public abstract String getTemporaryPath();
}

/* Location:
 * Qualified Name:     io.flutter.plugins.pathprovider.Messages.PathProviderApi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */