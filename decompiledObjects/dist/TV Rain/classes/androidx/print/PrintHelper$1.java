package androidx.print;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter.WriteResultCallback;
import android.util.Log;

class PrintHelper$1
  extends AsyncTask<Void, Void, Throwable>
{
  public PrintHelper$1(PrintHelper paramPrintHelper, CancellationSignal paramCancellationSignal, PrintAttributes paramPrintAttributes1, Bitmap paramBitmap, PrintAttributes paramPrintAttributes2, int paramInt, ParcelFileDescriptor paramParcelFileDescriptor, PrintDocumentAdapter.WriteResultCallback paramWriteResultCallback) {}
  
  /* Error */
  public Throwable doInBackground(Void... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
    //   4: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
    //   7: ifeq +5 -> 12
    //   10: aconst_null
    //   11: areturn
    //   12: new 64	android/print/pdf/PrintedPdfDocument
    //   15: astore_2
    //   16: aload_2
    //   17: aload_0
    //   18: getfield 29	androidx/print/PrintHelper$1:this$0	Landroidx/print/PrintHelper;
    //   21: getfield 68	androidx/print/PrintHelper:mContext	Landroid/content/Context;
    //   24: aload_0
    //   25: getfield 33	androidx/print/PrintHelper$1:val$pdfAttributes	Landroid/print/PrintAttributes;
    //   28: invokespecial 71	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   31: aload_0
    //   32: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
    //   35: aload_0
    //   36: getfield 33	androidx/print/PrintHelper$1:val$pdfAttributes	Landroid/print/PrintAttributes;
    //   39: invokevirtual 77	android/print/PrintAttributes:getColorMode	()I
    //   42: invokestatic 81	androidx/print/PrintHelper:convertBitmapForColorMode	(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    //   45: astore_3
    //   46: aload_0
    //   47: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
    //   50: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
    //   53: istore 4
    //   55: iload 4
    //   57: ifeq +5 -> 62
    //   60: aconst_null
    //   61: areturn
    //   62: aload_2
    //   63: iconst_1
    //   64: invokevirtual 85	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   67: astore 5
    //   69: getstatic 89	androidx/print/PrintHelper:IS_MIN_MARGINS_HANDLING_CORRECT	Z
    //   72: istore 4
    //   74: iload 4
    //   76: ifeq +22 -> 98
    //   79: new 91	android/graphics/RectF
    //   82: astore_1
    //   83: aload_1
    //   84: aload 5
    //   86: invokevirtual 97	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   89: invokevirtual 103	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   92: invokespecial 106	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   95: goto +60 -> 155
    //   98: new 64	android/print/pdf/PrintedPdfDocument
    //   101: astore 6
    //   103: aload 6
    //   105: aload_0
    //   106: getfield 29	androidx/print/PrintHelper$1:this$0	Landroidx/print/PrintHelper;
    //   109: getfield 68	androidx/print/PrintHelper:mContext	Landroid/content/Context;
    //   112: aload_0
    //   113: getfield 37	androidx/print/PrintHelper$1:val$attributes	Landroid/print/PrintAttributes;
    //   116: invokespecial 71	android/print/pdf/PrintedPdfDocument:<init>	(Landroid/content/Context;Landroid/print/PrintAttributes;)V
    //   119: aload 6
    //   121: iconst_1
    //   122: invokevirtual 85	android/print/pdf/PrintedPdfDocument:startPage	(I)Landroid/graphics/pdf/PdfDocument$Page;
    //   125: astore 7
    //   127: new 91	android/graphics/RectF
    //   130: astore_1
    //   131: aload_1
    //   132: aload 7
    //   134: invokevirtual 97	android/graphics/pdf/PdfDocument$Page:getInfo	()Landroid/graphics/pdf/PdfDocument$PageInfo;
    //   137: invokevirtual 103	android/graphics/pdf/PdfDocument$PageInfo:getContentRect	()Landroid/graphics/Rect;
    //   140: invokespecial 106	android/graphics/RectF:<init>	(Landroid/graphics/Rect;)V
    //   143: aload 6
    //   145: aload 7
    //   147: invokevirtual 112	android/graphics/pdf/PdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   150: aload 6
    //   152: invokevirtual 115	android/graphics/pdf/PdfDocument:close	()V
    //   155: aload_3
    //   156: invokevirtual 120	android/graphics/Bitmap:getWidth	()I
    //   159: aload_3
    //   160: invokevirtual 123	android/graphics/Bitmap:getHeight	()I
    //   163: aload_1
    //   164: aload_0
    //   165: getfield 39	androidx/print/PrintHelper$1:val$fittingMode	I
    //   168: invokestatic 127	androidx/print/PrintHelper:getMatrix	(IILandroid/graphics/RectF;I)Landroid/graphics/Matrix;
    //   171: astore 7
    //   173: iload 4
    //   175: ifeq +6 -> 181
    //   178: goto +27 -> 205
    //   181: aload 7
    //   183: aload_1
    //   184: getfield 131	android/graphics/RectF:left	F
    //   187: aload_1
    //   188: getfield 134	android/graphics/RectF:top	F
    //   191: invokevirtual 140	android/graphics/Matrix:postTranslate	(FF)Z
    //   194: pop
    //   195: aload 5
    //   197: invokevirtual 144	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   200: aload_1
    //   201: invokevirtual 150	android/graphics/Canvas:clipRect	(Landroid/graphics/RectF;)Z
    //   204: pop
    //   205: aload 5
    //   207: invokevirtual 144	android/graphics/pdf/PdfDocument$Page:getCanvas	()Landroid/graphics/Canvas;
    //   210: aload_3
    //   211: aload 7
    //   213: aconst_null
    //   214: invokevirtual 154	android/graphics/Canvas:drawBitmap	(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V
    //   217: aload_2
    //   218: aload 5
    //   220: invokevirtual 112	android/graphics/pdf/PdfDocument:finishPage	(Landroid/graphics/pdf/PdfDocument$Page;)V
    //   223: aload_0
    //   224: getfield 31	androidx/print/PrintHelper$1:val$cancellationSignal	Landroid/os/CancellationSignal;
    //   227: invokevirtual 62	android/os/CancellationSignal:isCanceled	()Z
    //   230: istore 4
    //   232: iload 4
    //   234: ifeq +34 -> 268
    //   237: aload_2
    //   238: invokevirtual 115	android/graphics/pdf/PdfDocument:close	()V
    //   241: aload_0
    //   242: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
    //   245: astore_1
    //   246: aload_1
    //   247: ifnull +7 -> 254
    //   250: aload_1
    //   251: invokevirtual 157	android/os/ParcelFileDescriptor:close	()V
    //   254: aload_3
    //   255: aload_0
    //   256: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
    //   259: if_acmpeq +7 -> 266
    //   262: aload_3
    //   263: invokevirtual 160	android/graphics/Bitmap:recycle	()V
    //   266: aconst_null
    //   267: areturn
    //   268: new 162	java/io/FileOutputStream
    //   271: astore_1
    //   272: aload_1
    //   273: aload_0
    //   274: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
    //   277: invokevirtual 166	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   280: invokespecial 169	java/io/FileOutputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   283: aload_2
    //   284: aload_1
    //   285: invokevirtual 173	android/graphics/pdf/PdfDocument:writeTo	(Ljava/io/OutputStream;)V
    //   288: aload_2
    //   289: invokevirtual 115	android/graphics/pdf/PdfDocument:close	()V
    //   292: aload_0
    //   293: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
    //   296: astore_1
    //   297: aload_1
    //   298: ifnull +7 -> 305
    //   301: aload_1
    //   302: invokevirtual 157	android/os/ParcelFileDescriptor:close	()V
    //   305: aload_3
    //   306: aload_0
    //   307: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
    //   310: if_acmpeq +7 -> 317
    //   313: aload_3
    //   314: invokevirtual 160	android/graphics/Bitmap:recycle	()V
    //   317: aconst_null
    //   318: areturn
    //   319: astore_1
    //   320: aload_2
    //   321: invokevirtual 115	android/graphics/pdf/PdfDocument:close	()V
    //   324: aload_0
    //   325: getfield 41	androidx/print/PrintHelper$1:val$fileDescriptor	Landroid/os/ParcelFileDescriptor;
    //   328: astore_2
    //   329: aload_2
    //   330: ifnull +7 -> 337
    //   333: aload_2
    //   334: invokevirtual 157	android/os/ParcelFileDescriptor:close	()V
    //   337: aload_3
    //   338: aload_0
    //   339: getfield 35	androidx/print/PrintHelper$1:val$bitmap	Landroid/graphics/Bitmap;
    //   342: if_acmpeq +7 -> 349
    //   345: aload_3
    //   346: invokevirtual 160	android/graphics/Bitmap:recycle	()V
    //   349: aload_1
    //   350: athrow
    //   351: astore_1
    //   352: aload_1
    //   353: areturn
    //   354: astore_1
    //   355: goto -101 -> 254
    //   358: astore_1
    //   359: goto -54 -> 305
    //   362: astore_2
    //   363: goto -26 -> 337
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	366	0	this	1
    //   0	366	1	paramVarArgs	Void[]
    //   15	319	2	localObject1	Object
    //   362	1	2	localIOException	java.io.IOException
    //   45	301	3	localBitmap	Bitmap
    //   53	180	4	bool	boolean
    //   67	152	5	localPage	android.graphics.pdf.PdfDocument.Page
    //   101	50	6	localPrintedPdfDocument	android.print.pdf.PrintedPdfDocument
    //   125	87	7	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   62	74	319	finally
    //   79	95	319	finally
    //   98	155	319	finally
    //   155	173	319	finally
    //   181	205	319	finally
    //   205	232	319	finally
    //   268	288	319	finally
    //   0	10	351	finally
    //   12	55	351	finally
    //   237	246	351	finally
    //   250	254	351	finally
    //   254	266	351	finally
    //   288	297	351	finally
    //   301	305	351	finally
    //   305	317	351	finally
    //   320	329	351	finally
    //   333	337	351	finally
    //   337	349	351	finally
    //   349	351	351	finally
    //   250	254	354	java/io/IOException
    //   301	305	358	java/io/IOException
    //   333	337	362	java/io/IOException
  }
  
  public void onPostExecute(Throwable paramThrowable)
  {
    if (val$cancellationSignal.isCanceled())
    {
      val$writeResultCallback.onWriteCancelled();
    }
    else if (paramThrowable == null)
    {
      val$writeResultCallback.onWriteFinished(new PageRange[] { PageRange.ALL_PAGES });
    }
    else
    {
      Log.e("PrintHelper", "Error writing printed content", paramThrowable);
      val$writeResultCallback.onWriteFailed(null);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.print.PrintHelper.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */