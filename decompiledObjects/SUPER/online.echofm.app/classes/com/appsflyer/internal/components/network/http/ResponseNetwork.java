package com.appsflyer.internal.components.network.http;

import androidx.annotation.NonNull;
import java.util.List;

public abstract interface ResponseNetwork<Body>
{
  @NonNull
  public abstract Body getBody();
  
  public abstract List<String> getHeaderField(String paramString);
  
  public abstract int getStatusCode();
  
  public abstract boolean isSuccessful();
}

/* Location:
 * Qualified Name:     com.appsflyer.internal.components.network.http.ResponseNetwork
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */