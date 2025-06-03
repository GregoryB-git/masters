package com.pichillilorenzo.flutter_inappwebview_android.print_job;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrintJobManager
  implements Disposable
{
  public static final String LOG_TAG = "PrintJobManager";
  public final Map<String, PrintJobController> jobs = new HashMap();
  public InAppWebViewFlutterPlugin plugin;
  
  public PrintJobManager(InAppWebViewFlutterPlugin paramInAppWebViewFlutterPlugin)
  {
    plugin = paramInAppWebViewFlutterPlugin;
  }
  
  public void dispose()
  {
    Iterator localIterator = jobs.values().iterator();
    while (localIterator.hasNext())
    {
      PrintJobController localPrintJobController = (PrintJobController)localIterator.next();
      if (localPrintJobController != null) {
        localPrintJobController.dispose();
      }
    }
    jobs.clear();
    plugin = null;
  }
}

/* Location:
 * Qualified Name:     com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobManager
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */