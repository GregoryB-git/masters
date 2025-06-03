package io.flutter.plugins.urllauncher;

import android.util.Log;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;

public class Messages
{
  public static ArrayList<Object> wrapError(Throwable paramThrowable)
  {
    ArrayList localArrayList = new ArrayList(3);
    if ((paramThrowable instanceof FlutterError))
    {
      paramThrowable = (FlutterError)paramThrowable;
      localArrayList.add(code);
      localArrayList.add(paramThrowable.getMessage());
      paramThrowable = details;
    }
    else
    {
      localArrayList.add(paramThrowable.toString());
      localArrayList.add(paramThrowable.getClass().getSimpleName());
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Cause: ");
      localStringBuilder.append(paramThrowable.getCause());
      localStringBuilder.append(", Stacktrace: ");
      localStringBuilder.append(Log.getStackTraceString(paramThrowable));
      paramThrowable = localStringBuilder.toString();
    }
    localArrayList.add(paramThrowable);
    return localArrayList;
  }
  
  public static final class BrowserOptions
  {
    private Boolean showTitle;
    
    public static BrowserOptions fromList(ArrayList<Object> paramArrayList)
    {
      BrowserOptions localBrowserOptions = new BrowserOptions();
      localBrowserOptions.setShowTitle((Boolean)paramArrayList.get(0));
      return localBrowserOptions;
    }
    
    public Boolean getShowTitle()
    {
      return showTitle;
    }
    
    public void setShowTitle(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        showTitle = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(showTitle);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Boolean showTitle;
      
      public Messages.BrowserOptions build()
      {
        Messages.BrowserOptions localBrowserOptions = new Messages.BrowserOptions();
        localBrowserOptions.setShowTitle(showTitle);
        return localBrowserOptions;
      }
      
      public Builder setShowTitle(Boolean paramBoolean)
      {
        showTitle = paramBoolean;
        return this;
      }
    }
  }
  
  public static class FlutterError
    extends RuntimeException
  {
    public final String code;
    public final Object details;
    
    public FlutterError(String paramString1, String paramString2, Object paramObject)
    {
      super();
      code = paramString1;
      details = paramObject;
    }
  }
  
  public static abstract interface UrlLauncherApi
  {
    public abstract Boolean canLaunchUrl(String paramString);
    
    public abstract void closeWebView();
    
    public abstract Boolean launchUrl(String paramString, Map<String, String> paramMap);
    
    public abstract Boolean openUrlInApp(String paramString, Boolean paramBoolean, Messages.WebViewOptions paramWebViewOptions, Messages.BrowserOptions paramBrowserOptions);
    
    public abstract Boolean supportsCustomTabs();
  }
  
  public static class UrlLauncherApiCodec
    extends StandardMessageCodec
  {
    public static final UrlLauncherApiCodec INSTANCE = new UrlLauncherApiCodec();
    
    public Object readValueOfType(byte paramByte, ByteBuffer paramByteBuffer)
    {
      if (paramByte != Byte.MIN_VALUE)
      {
        if (paramByte != -127) {
          return super.readValueOfType(paramByte, paramByteBuffer);
        }
        return Messages.WebViewOptions.fromList((ArrayList)readValue(paramByteBuffer));
      }
      return Messages.BrowserOptions.fromList((ArrayList)readValue(paramByteBuffer));
    }
    
    public void writeValue(ByteArrayOutputStream paramByteArrayOutputStream, Object paramObject)
    {
      if ((paramObject instanceof Messages.BrowserOptions)) {
        paramByteArrayOutputStream.write(128);
      }
      for (paramObject = ((Messages.BrowserOptions)paramObject).toList();; paramObject = ((Messages.WebViewOptions)paramObject).toList())
      {
        writeValue(paramByteArrayOutputStream, paramObject);
        return;
        if (!(paramObject instanceof Messages.WebViewOptions)) {
          break;
        }
        paramByteArrayOutputStream.write(129);
      }
      super.writeValue(paramByteArrayOutputStream, paramObject);
    }
  }
  
  public static final class WebViewOptions
  {
    private Boolean enableDomStorage;
    private Boolean enableJavaScript;
    private Map<String, String> headers;
    
    public static WebViewOptions fromList(ArrayList<Object> paramArrayList)
    {
      WebViewOptions localWebViewOptions = new WebViewOptions();
      localWebViewOptions.setEnableJavaScript((Boolean)paramArrayList.get(0));
      localWebViewOptions.setEnableDomStorage((Boolean)paramArrayList.get(1));
      localWebViewOptions.setHeaders((Map)paramArrayList.get(2));
      return localWebViewOptions;
    }
    
    public Boolean getEnableDomStorage()
    {
      return enableDomStorage;
    }
    
    public Boolean getEnableJavaScript()
    {
      return enableJavaScript;
    }
    
    public Map<String, String> getHeaders()
    {
      return headers;
    }
    
    public void setEnableDomStorage(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        enableDomStorage = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
    }
    
    public void setEnableJavaScript(Boolean paramBoolean)
    {
      if (paramBoolean != null)
      {
        enableJavaScript = paramBoolean;
        return;
      }
      throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
    }
    
    public void setHeaders(Map<String, String> paramMap)
    {
      if (paramMap != null)
      {
        headers = paramMap;
        return;
      }
      throw new IllegalStateException("Nonnull field \"headers\" is null.");
    }
    
    public ArrayList<Object> toList()
    {
      ArrayList localArrayList = new ArrayList(3);
      localArrayList.add(enableJavaScript);
      localArrayList.add(enableDomStorage);
      localArrayList.add(headers);
      return localArrayList;
    }
    
    public static final class Builder
    {
      private Boolean enableDomStorage;
      private Boolean enableJavaScript;
      private Map<String, String> headers;
      
      public Messages.WebViewOptions build()
      {
        Messages.WebViewOptions localWebViewOptions = new Messages.WebViewOptions();
        localWebViewOptions.setEnableJavaScript(enableJavaScript);
        localWebViewOptions.setEnableDomStorage(enableDomStorage);
        localWebViewOptions.setHeaders(headers);
        return localWebViewOptions;
      }
      
      public Builder setEnableDomStorage(Boolean paramBoolean)
      {
        enableDomStorage = paramBoolean;
        return this;
      }
      
      public Builder setEnableJavaScript(Boolean paramBoolean)
      {
        enableJavaScript = paramBoolean;
        return this;
      }
      
      public Builder setHeaders(Map<String, String> paramMap)
      {
        headers = paramMap;
        return this;
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.urllauncher.Messages
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */