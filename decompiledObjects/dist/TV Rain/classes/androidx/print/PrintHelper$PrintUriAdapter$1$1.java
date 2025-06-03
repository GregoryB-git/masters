package androidx.print;

import android.os.AsyncTask;
import android.os.CancellationSignal.OnCancelListener;

class PrintHelper$PrintUriAdapter$1$1
  implements CancellationSignal.OnCancelListener
{
  public PrintHelper$PrintUriAdapter$1$1(PrintHelper.PrintUriAdapter.1 param1) {}
  
  public void onCancel()
  {
    this$2.this$1.cancelLoad();
    this$2.cancel(false);
  }
}

/* Location:
 * Qualified Name:     androidx.print.PrintHelper.PrintUriAdapter.1.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */