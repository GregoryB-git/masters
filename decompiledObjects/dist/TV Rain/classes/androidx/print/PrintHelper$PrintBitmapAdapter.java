package androidx.print;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
class PrintHelper$PrintBitmapAdapter
  extends PrintDocumentAdapter
{
  private PrintAttributes mAttributes;
  private final Bitmap mBitmap;
  private final PrintHelper.OnPrintFinishCallback mCallback;
  private final int mFittingMode;
  private final String mJobName;
  
  public PrintHelper$PrintBitmapAdapter(PrintHelper paramPrintHelper, String paramString, int paramInt, Bitmap paramBitmap, PrintHelper.OnPrintFinishCallback paramOnPrintFinishCallback)
  {
    mJobName = paramString;
    mFittingMode = paramInt;
    mBitmap = paramBitmap;
    mCallback = paramOnPrintFinishCallback;
  }
  
  public void onFinish()
  {
    PrintHelper.OnPrintFinishCallback localOnPrintFinishCallback = mCallback;
    if (localOnPrintFinishCallback != null) {
      localOnPrintFinishCallback.onFinish();
    }
  }
  
  public void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    mAttributes = paramPrintAttributes2;
    paramLayoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(mJobName).setContentType(1).setPageCount(1).build(), paramPrintAttributes2.equals(paramPrintAttributes1) ^ true);
  }
  
  public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    this$0.writeBitmap(mAttributes, mFittingMode, mBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
  }
}

/* Location:
 * Qualified Name:     androidx.print.PrintHelper.PrintBitmapAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */