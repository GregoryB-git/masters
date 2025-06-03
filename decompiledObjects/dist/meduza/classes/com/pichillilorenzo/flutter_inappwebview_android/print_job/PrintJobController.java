package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import android.print.PrintJob;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
import g;
import io.flutter.plugin.common.MethodChannel;
import java.util.Map;

public class PrintJobController
  implements Disposable
{
  public static final String LOG_TAG = "PrintJob";
  public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_printjobcontroller_";
  public PrintJobChannelDelegate channelDelegate;
  public String id;
  public PrintJob job;
  public InAppWebViewFlutterPlugin plugin;
  public PrintJobSettings settings;
  
  public PrintJobController(String paramString, PrintJob paramPrintJob, PrintJobSettings paramPrintJobSettings, InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    id = paramString;
    plugin = paramInAppWebViewFlutterPlugin;
    job = paramPrintJob;
    settings = paramPrintJobSettings;
    channelDelegate = new PrintJobChannelDelegate(this, new MethodChannel(messenger, g.d("com.pichillilorenzo/flutter_inappwebview_printjobcontroller_", paramString)));
  }
  
  public void cancel()
  {
    PrintJob localPrintJob = job;
    if (localPrintJob != null) {
      localPrintJob.cancel();
    }
  }
  
  public void dispose()
  {
    Object localObject = channelDelegate;
    if (localObject != null)
    {
      ((PrintJobChannelDelegate)localObject).dispose();
      channelDelegate = null;
    }
    localObject = plugin;
    if (localObject != null)
    {
      localObject = printJobManager;
      if ((localObject != null) && (jobs.containsKey(id))) {
        jobs.put(id, null);
      }
    }
    localObject = job;
    if (localObject != null)
    {
      ((PrintJob)localObject).cancel();
      job = null;
    }
    plugin = null;
  }
  
  public void disposeNoCancel()
  {
    Object localObject = channelDelegate;
    if (localObject != null)
    {
      ((PrintJobChannelDelegate)localObject).dispose();
      channelDelegate = null;
    }
    localObject = plugin;
    if (localObject != null)
    {
      localObject = printJobManager;
      if ((localObject != null) && (jobs.containsKey(id))) {
        jobs.put(id, null);
      }
    }
    if (job != null) {
      job = null;
    }
    plugin = null;
  }
  
  public PrintJobInfoExt getInfo()
  {
    PrintJob localPrintJob = job;
    if (localPrintJob != null) {
      return PrintJobInfoExt.fromPrintJobInfo(localPrintJob.getInfo());
    }
    return null;
  }
  
  public void restart()
  {
    PrintJob localPrintJob = job;
    if (localPrintJob != null) {
      localPrintJob.restart();
    }
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */