package com.devbrackets.android.exomedia.util;

import androidx.annotation.NonNull;

public class DeviceUtil$NonCompatibleDevice
{
  private boolean ignoreModel;
  private final String manufacturer;
  private final String model;
  
  public DeviceUtil$NonCompatibleDevice(@NonNull String paramString)
  {
    manufacturer = paramString;
    model = null;
    ignoreModel = true;
  }
  
  public DeviceUtil$NonCompatibleDevice(@NonNull String paramString1, @NonNull String paramString2)
  {
    model = paramString1;
    manufacturer = paramString2;
  }
  
  public String getManufacturer()
  {
    return manufacturer;
  }
  
  public String getModel()
  {
    return model;
  }
  
  public boolean ignoreModel()
  {
    return ignoreModel;
  }
}

/* Location:
 * Qualified Name:     com.devbrackets.android.exomedia.util.DeviceUtil.NonCompatibleDevice
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */