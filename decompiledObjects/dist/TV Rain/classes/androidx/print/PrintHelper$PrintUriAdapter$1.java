package androidx.print;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import android.print.PrintAttributes;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentInfo.Builder;
import java.io.FileNotFoundException;

class PrintHelper$PrintUriAdapter$1
  extends AsyncTask<Uri, Boolean, Bitmap>
{
  public PrintHelper$PrintUriAdapter$1(PrintHelper.PrintUriAdapter paramPrintUriAdapter, CancellationSignal paramCancellationSignal, PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback) {}
  
  public Bitmap doInBackground(Uri... paramVarArgs)
  {
    try
    {
      paramVarArgs = this$1;
      paramVarArgs = this$0.loadConstrainedBitmap(mImageFile);
      return paramVarArgs;
    }
    catch (FileNotFoundException paramVarArgs) {}
    return null;
  }
  
  public void onCancelled(Bitmap paramBitmap)
  {
    val$layoutResultCallback.onLayoutCancelled();
    this$1.mLoadBitmap = null;
  }
  
  public void onPostExecute(Bitmap paramBitmap)
  {
    super.onPostExecute(paramBitmap);
    Object localObject = paramBitmap;
    if (paramBitmap != null) {
      if (PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION)
      {
        localObject = paramBitmap;
        if (this$1.this$0.mOrientation != 0) {}
      }
      else
      {
        try
        {
          PrintAttributes.MediaSize localMediaSize = this$1.mAttributes.getMediaSize();
          localObject = paramBitmap;
          if (localMediaSize != null)
          {
            localObject = paramBitmap;
            if (localMediaSize.isPortrait() != PrintHelper.isPortrait(paramBitmap))
            {
              localObject = new Matrix();
              ((Matrix)localObject).postRotate(90.0F);
              localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
            }
          }
        }
        finally {}
      }
    }
    this$1.mBitmap = ((Bitmap)localObject);
    if (localObject != null)
    {
      paramBitmap = new PrintDocumentInfo.Builder(this$1.mJobName).setContentType(1).setPageCount(1).build();
      boolean bool = val$newPrintAttributes.equals(val$oldPrintAttributes);
      val$layoutResultCallback.onLayoutFinished(paramBitmap, true ^ bool);
    }
    else
    {
      val$layoutResultCallback.onLayoutFailed(null);
    }
    this$1.mLoadBitmap = null;
  }
  
  public void onPreExecute()
  {
    val$cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
    {
      public void onCancel()
      {
        this$1.cancelLoad();
        cancel(false);
      }
    });
  }
}

/* Location:
 * Qualified Name:     androidx.print.PrintHelper.PrintUriAdapter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */