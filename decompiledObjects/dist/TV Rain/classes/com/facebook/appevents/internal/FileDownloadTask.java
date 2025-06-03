package com.facebook.appevents.internal;

import android.os.AsyncTask;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.File;

public class FileDownloadTask
  extends AsyncTask<String, Void, Boolean>
{
  private File destFile;
  private Callback onSuccess;
  private String uriStr;
  
  public FileDownloadTask(String paramString, File paramFile, Callback paramCallback)
  {
    uriStr = paramString;
    destFile = paramFile;
    onSuccess = paramCallback;
  }
  
  /* Error */
  public Boolean doInBackground(String... paramVarArgs)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 36	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   4: ifeq +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 38	java/net/URL
    //   12: astore_1
    //   13: aload_1
    //   14: aload_0
    //   15: getfield 21	com/facebook/appevents/internal/FileDownloadTask:uriStr	Ljava/lang/String;
    //   18: invokespecial 41	java/net/URL:<init>	(Ljava/lang/String;)V
    //   21: aload_1
    //   22: invokevirtual 45	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   25: invokevirtual 51	java/net/URLConnection:getContentLength	()I
    //   28: istore_2
    //   29: new 53	java/io/DataInputStream
    //   32: astore_3
    //   33: aload_3
    //   34: aload_1
    //   35: invokevirtual 57	java/net/URL:openStream	()Ljava/io/InputStream;
    //   38: invokespecial 60	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   41: iload_2
    //   42: newarray <illegal type>
    //   44: astore_1
    //   45: aload_3
    //   46: aload_1
    //   47: invokevirtual 64	java/io/DataInputStream:readFully	([B)V
    //   50: aload_3
    //   51: invokevirtual 69	java/io/InputStream:close	()V
    //   54: new 71	java/io/DataOutputStream
    //   57: astore_3
    //   58: new 73	java/io/FileOutputStream
    //   61: astore 4
    //   63: aload 4
    //   65: aload_0
    //   66: getfield 23	com/facebook/appevents/internal/FileDownloadTask:destFile	Ljava/io/File;
    //   69: invokespecial 76	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   72: aload_3
    //   73: aload 4
    //   75: invokespecial 79	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   78: aload_3
    //   79: aload_1
    //   80: invokevirtual 84	java/io/OutputStream:write	([B)V
    //   83: aload_3
    //   84: invokevirtual 87	java/io/DataOutputStream:flush	()V
    //   87: aload_3
    //   88: invokevirtual 88	java/io/OutputStream:close	()V
    //   91: getstatic 94	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   94: astore_1
    //   95: aload_1
    //   96: areturn
    //   97: astore_1
    //   98: goto +10 -> 108
    //   101: astore_1
    //   102: getstatic 97	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   105: astore_1
    //   106: aload_1
    //   107: areturn
    //   108: aload_1
    //   109: aload_0
    //   110: invokestatic 101	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   113: aconst_null
    //   114: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	115	0	this	FileDownloadTask
    //   0	115	1	paramVarArgs	String[]
    //   28	14	2	i	int
    //   32	56	3	localObject	Object
    //   61	13	4	localFileOutputStream	java.io.FileOutputStream
    // Exception table:
    //   from	to	target	type
    //   9	95	97	finally
    //   102	106	97	finally
    //   9	95	101	java/lang/Exception
  }
  
  public void onPostExecute(Boolean paramBoolean)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      if (paramBoolean.booleanValue()) {
        onSuccess.onComplete(destFile);
      }
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramBoolean, this);
    }
  }
  
  public static abstract interface Callback
  {
    public abstract void onComplete(File paramFile);
  }
}

/* Location:
 * Qualified Name:     com.facebook.appevents.internal.FileDownloadTask
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */