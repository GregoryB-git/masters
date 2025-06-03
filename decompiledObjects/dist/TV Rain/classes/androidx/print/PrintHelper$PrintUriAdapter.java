package androidx.print;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.CancellationSignal.OnCancelListener;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintAttributes.MediaSize;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentAdapter.LayoutResultCallback;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.print.PrintDocumentInfo.Builder;
import androidx.annotation.RequiresApi;
import java.io.FileNotFoundException;

@RequiresApi(19)
class PrintHelper$PrintUriAdapter
  extends PrintDocumentAdapter
{
  public PrintAttributes mAttributes;
  public Bitmap mBitmap;
  public final PrintHelper.OnPrintFinishCallback mCallback;
  public final int mFittingMode;
  public final Uri mImageFile;
  public final String mJobName;
  public AsyncTask<Uri, Boolean, Bitmap> mLoadBitmap;
  
  public PrintHelper$PrintUriAdapter(PrintHelper paramPrintHelper, String paramString, Uri paramUri, PrintHelper.OnPrintFinishCallback paramOnPrintFinishCallback, int paramInt)
  {
    mJobName = paramString;
    mImageFile = paramUri;
    mCallback = paramOnPrintFinishCallback;
    mFittingMode = paramInt;
    mBitmap = null;
  }
  
  public void cancelLoad()
  {
    synchronized (this$0.mLock)
    {
      PrintHelper localPrintHelper = this$0;
      if (mDecodeOptions != null) {
        mDecodeOptions = null;
      }
      return;
    }
  }
  
  public void onFinish()
  {
    super.onFinish();
    cancelLoad();
    Object localObject = mLoadBitmap;
    if (localObject != null) {
      ((AsyncTask)localObject).cancel(true);
    }
    localObject = mCallback;
    if (localObject != null) {
      ((PrintHelper.OnPrintFinishCallback)localObject).onFinish();
    }
    localObject = mBitmap;
    if (localObject != null)
    {
      ((Bitmap)localObject).recycle();
      mBitmap = null;
    }
  }
  
  public void onLayout(final PrintAttributes paramPrintAttributes1, final PrintAttributes paramPrintAttributes2, final CancellationSignal paramCancellationSignal, final PrintDocumentAdapter.LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle)
  {
    try
    {
      mAttributes = paramPrintAttributes2;
      if (paramCancellationSignal.isCanceled())
      {
        paramLayoutResultCallback.onLayoutCancelled();
        return;
      }
      if (mBitmap != null)
      {
        paramLayoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(mJobName).setContentType(1).setPageCount(1).build(), paramPrintAttributes2.equals(paramPrintAttributes1) ^ true);
        return;
      }
      mLoadBitmap = new AsyncTask()
      {
        public Bitmap doInBackground(Uri... paramAnonymousVarArgs)
        {
          try
          {
            paramAnonymousVarArgs = PrintHelper.PrintUriAdapter.this;
            paramAnonymousVarArgs = this$0.loadConstrainedBitmap(mImageFile);
            return paramAnonymousVarArgs;
          }
          catch (FileNotFoundException paramAnonymousVarArgs) {}
          return null;
        }
        
        public void onCancelled(Bitmap paramAnonymousBitmap)
        {
          paramLayoutResultCallback.onLayoutCancelled();
          mLoadBitmap = null;
        }
        
        public void onPostExecute(Bitmap paramAnonymousBitmap)
        {
          super.onPostExecute(paramAnonymousBitmap);
          Object localObject = paramAnonymousBitmap;
          if (paramAnonymousBitmap != null) {
            if (PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION)
            {
              localObject = paramAnonymousBitmap;
              if (this$0.mOrientation != 0) {}
            }
            else
            {
              try
              {
                PrintAttributes.MediaSize localMediaSize = mAttributes.getMediaSize();
                localObject = paramAnonymousBitmap;
                if (localMediaSize != null)
                {
                  localObject = paramAnonymousBitmap;
                  if (localMediaSize.isPortrait() != PrintHelper.isPortrait(paramAnonymousBitmap))
                  {
                    localObject = new Matrix();
                    ((Matrix)localObject).postRotate(90.0F);
                    localObject = Bitmap.createBitmap(paramAnonymousBitmap, 0, 0, paramAnonymousBitmap.getWidth(), paramAnonymousBitmap.getHeight(), (Matrix)localObject, true);
                  }
                }
              }
              finally {}
            }
          }
          mBitmap = ((Bitmap)localObject);
          if (localObject != null)
          {
            paramAnonymousBitmap = new PrintDocumentInfo.Builder(mJobName).setContentType(1).setPageCount(1).build();
            boolean bool = paramPrintAttributes2.equals(paramPrintAttributes1);
            paramLayoutResultCallback.onLayoutFinished(paramAnonymousBitmap, true ^ bool);
          }
          else
          {
            paramLayoutResultCallback.onLayoutFailed(null);
          }
          mLoadBitmap = null;
        }
        
        public void onPreExecute()
        {
          paramCancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener()
          {
            public void onCancel()
            {
              cancelLoad();
              cancel(false);
            }
          });
        }
      }.execute(new Uri[0]);
      return;
    }
    finally {}
  }
  
  public void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback)
  {
    this$0.writeBitmap(mAttributes, mFittingMode, mBitmap, paramParcelFileDescriptor, paramCancellationSignal, paramWriteResultCallback);
  }
}

/* Location:
 * Qualified Name:     androidx.print.PrintHelper.PrintUriAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */