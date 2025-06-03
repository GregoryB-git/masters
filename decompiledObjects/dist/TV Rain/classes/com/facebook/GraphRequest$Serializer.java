package com.facebook;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z2;

class GraphRequest$Serializer
  implements GraphRequest.KeyValueSerializer
{
  private boolean firstWrite = true;
  private final Logger logger;
  private final OutputStream outputStream;
  private boolean useUrlEncode;
  
  public GraphRequest$Serializer(OutputStream paramOutputStream, Logger paramLogger, boolean paramBoolean)
  {
    outputStream = paramOutputStream;
    logger = paramLogger;
    useUrlEncode = paramBoolean;
  }
  
  private RuntimeException getInvalidTypeError()
  {
    return new IllegalArgumentException("value is not a supported type.");
  }
  
  public void write(String paramString, Object... paramVarArgs)
    throws IOException
  {
    if (!useUrlEncode)
    {
      if (firstWrite)
      {
        outputStream.write("--".getBytes());
        outputStream.write(GraphRequest.access$200().getBytes());
        outputStream.write("\r\n".getBytes());
        firstWrite = false;
      }
      outputStream.write(String.format(paramString, paramVarArgs).getBytes());
    }
    else
    {
      outputStream.write(URLEncoder.encode(String.format(Locale.US, paramString, paramVarArgs), "UTF-8").getBytes());
    }
  }
  
  public void writeBitmap(String paramString, Bitmap paramBitmap)
    throws IOException
  {
    writeContentDisposition(paramString, paramString, "image/png");
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    paramBitmap = logger;
    if (paramBitmap != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("    ");
      localStringBuilder.append(paramString);
      paramBitmap.appendKeyValue(localStringBuilder.toString(), "<Image>");
    }
  }
  
  public void writeBytes(String paramString, byte[] paramArrayOfByte)
    throws IOException
  {
    writeContentDisposition(paramString, paramString, "content/unknown");
    outputStream.write(paramArrayOfByte);
    writeLine("", new Object[0]);
    writeRecordBoundary();
    Logger localLogger = logger;
    if (localLogger != null) {
      localLogger.appendKeyValue(z2.o("    ", paramString), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(paramArrayOfByte.length) }));
    }
  }
  
  public void writeContentDisposition(String paramString1, String paramString2, String paramString3)
    throws IOException
  {
    if (!useUrlEncode)
    {
      write("Content-Disposition: form-data; name=\"%s\"", new Object[] { paramString1 });
      if (paramString2 != null) {
        write("; filename=\"%s\"", new Object[] { paramString2 });
      }
      writeLine("", new Object[0]);
      if (paramString3 != null) {
        writeLine("%s: %s", new Object[] { "Content-Type", paramString3 });
      }
      writeLine("", new Object[0]);
    }
    else
    {
      outputStream.write(String.format("%s=", new Object[] { paramString1 }).getBytes());
    }
  }
  
  public void writeContentUri(String paramString1, Uri paramUri, String paramString2)
    throws IOException
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    writeContentDisposition(paramString1, paramString1, str);
    int i;
    if ((outputStream instanceof ProgressNoopOutputStream))
    {
      long l = Utility.getContentSize(paramUri);
      ((ProgressNoopOutputStream)outputStream).addProgress(l);
      i = 0;
    }
    else
    {
      i = Utility.copyAndCloseInputStream(FacebookSdk.getApplicationContext().getContentResolver().openInputStream(paramUri), outputStream) + 0;
    }
    writeLine("", new Object[0]);
    writeRecordBoundary();
    paramUri = logger;
    if (paramUri != null) {
      paramUri.appendKeyValue(z2.o("    ", paramString1), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
    }
  }
  
  public void writeFile(String paramString1, ParcelFileDescriptor paramParcelFileDescriptor, String paramString2)
    throws IOException
  {
    String str = paramString2;
    if (paramString2 == null) {
      str = "content/unknown";
    }
    writeContentDisposition(paramString1, paramString1, str);
    paramString2 = outputStream;
    int i;
    if ((paramString2 instanceof ProgressNoopOutputStream))
    {
      ((ProgressNoopOutputStream)paramString2).addProgress(paramParcelFileDescriptor.getStatSize());
      i = 0;
    }
    else
    {
      i = Utility.copyAndCloseInputStream(new ParcelFileDescriptor.AutoCloseInputStream(paramParcelFileDescriptor), outputStream) + 0;
    }
    writeLine("", new Object[0]);
    writeRecordBoundary();
    paramParcelFileDescriptor = logger;
    if (paramParcelFileDescriptor != null) {
      paramParcelFileDescriptor.appendKeyValue(z2.o("    ", paramString1), String.format(Locale.ROOT, "<Data: %d>", new Object[] { Integer.valueOf(i) }));
    }
  }
  
  public void writeLine(String paramString, Object... paramVarArgs)
    throws IOException
  {
    write(paramString, paramVarArgs);
    if (!useUrlEncode) {
      write("\r\n", new Object[0]);
    }
  }
  
  public void writeObject(String paramString, Object paramObject, GraphRequest paramGraphRequest)
    throws IOException
  {
    OutputStream localOutputStream = outputStream;
    if ((localOutputStream instanceof RequestOutputStream)) {
      ((RequestOutputStream)localOutputStream).setCurrentRequest(paramGraphRequest);
    }
    if (GraphRequest.access$000(paramObject))
    {
      writeString(paramString, GraphRequest.access$100(paramObject));
    }
    else if ((paramObject instanceof Bitmap))
    {
      writeBitmap(paramString, (Bitmap)paramObject);
    }
    else if ((paramObject instanceof byte[]))
    {
      writeBytes(paramString, (byte[])paramObject);
    }
    else if ((paramObject instanceof Uri))
    {
      writeContentUri(paramString, (Uri)paramObject, null);
    }
    else if ((paramObject instanceof ParcelFileDescriptor))
    {
      writeFile(paramString, (ParcelFileDescriptor)paramObject, null);
    }
    else
    {
      if (!(paramObject instanceof GraphRequest.ParcelableResourceWithMimeType)) {
        break label187;
      }
      paramGraphRequest = (GraphRequest.ParcelableResourceWithMimeType)paramObject;
      paramObject = paramGraphRequest.getResource();
      paramGraphRequest = paramGraphRequest.getMimeType();
      if ((paramObject instanceof ParcelFileDescriptor))
      {
        writeFile(paramString, (ParcelFileDescriptor)paramObject, paramGraphRequest);
      }
      else
      {
        if (!(paramObject instanceof Uri)) {
          break label182;
        }
        writeContentUri(paramString, (Uri)paramObject, paramGraphRequest);
      }
    }
    return;
    label182:
    throw getInvalidTypeError();
    label187:
    throw getInvalidTypeError();
  }
  
  public void writeRecordBoundary()
    throws IOException
  {
    if (!useUrlEncode) {
      writeLine("--%s", new Object[] { GraphRequest.access$200() });
    } else {
      outputStream.write("&".getBytes());
    }
  }
  
  public void writeRequestsAsJson(String paramString, JSONArray paramJSONArray, Collection<GraphRequest> paramCollection)
    throws IOException, JSONException
  {
    Object localObject = outputStream;
    if (!(localObject instanceof RequestOutputStream))
    {
      writeString(paramString, paramJSONArray.toString());
      return;
    }
    localObject = (RequestOutputStream)localObject;
    writeContentDisposition(paramString, null, null);
    write("[", new Object[0]);
    Iterator localIterator = paramCollection.iterator();
    for (int i = 0; localIterator.hasNext(); i++)
    {
      GraphRequest localGraphRequest = (GraphRequest)localIterator.next();
      paramCollection = paramJSONArray.getJSONObject(i);
      ((RequestOutputStream)localObject).setCurrentRequest(localGraphRequest);
      if (i > 0) {
        write(",%s", new Object[] { paramCollection.toString() });
      } else {
        write("%s", new Object[] { paramCollection.toString() });
      }
    }
    write("]", new Object[0]);
    paramCollection = logger;
    if (paramCollection != null) {
      paramCollection.appendKeyValue(z2.o("    ", paramString), paramJSONArray.toString());
    }
  }
  
  public void writeString(String paramString1, String paramString2)
    throws IOException
  {
    writeContentDisposition(paramString1, null, null);
    writeLine("%s", new Object[] { paramString2 });
    writeRecordBoundary();
    Logger localLogger = logger;
    if (localLogger != null)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("    ");
      localStringBuilder.append(paramString1);
      localLogger.appendKeyValue(localStringBuilder.toString(), paramString2);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.GraphRequest.Serializer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */