package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.CallSuper;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\000\f\n\002\030\002\n\002\020\000\n\002\b\021\030\0002\0020\001:\017\003\004\005\006\007\b\t\n\013\f\r\016\017\020\021B\007\b\002¢\006\002\020\002¨\006\022"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts;", "", "()V", "CaptureVideo", "CreateDocument", "GetContent", "GetMultipleContents", "OpenDocument", "OpenDocumentTree", "OpenMultipleDocuments", "PickContact", "RequestMultiplePermissions", "RequestPermission", "StartActivityForResult", "StartIntentSenderForResult", "TakePicture", "TakePicturePreview", "TakeVideo", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
public final class ActivityResultContracts
{
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\026\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J\036\020\n\032\n\022\004\022\0020\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\035\020\f\032\0020\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¢\006\002\020\020¨\006\021"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$CaptureVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class CaptureVideo
    extends ActivityResultContract<Uri, Boolean>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      paramContext = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", paramUri);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      return null;
    }
    
    @NotNull
    public final Boolean parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      boolean bool;
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\007\b\027¢\006\002\020\004B\r\022\006\020\005\032\0020\002¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\002H\027J \020\f\032\f\022\006\022\004\030\0010\003\030\0010\r2\006\020\t\032\0020\n2\006\020\013\032\0020\002J\032\020\016\032\004\030\0010\0032\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\bR\016\020\005\032\0020\002X\004¢\006\002\n\000¨\006\022"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$CreateDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "mimeType", "(Ljava/lang/String;)V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(19)
  public static class CreateDocument
    extends ActivityResultContract<String, Uri>
  {
    @NotNull
    private final String mimeType;
    
    @Deprecated(message="Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith=@ReplaceWith(expression="CreateDocument(\"todo/todo\")", imports={}))
    public CreateDocument()
    {
      this("*/*");
    }
    
    public CreateDocument(@NotNull String paramString)
    {
      mimeType = paramString;
    }
    
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      paramContext = new Intent("android.intent.action.CREATE_DOCUMENT").setType(mimeType).putExtra("android.intent.extra.TITLE", paramString);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      return null;
    }
    
    @Nullable
    public final Uri parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Uri localUri = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localUri = paramIntent.getData();
      }
      return localUri;
    }
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\026\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J \020\n\032\f\022\006\022\004\030\0010\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\032\020\f\032\004\030\0010\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¨\006\020"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetContent;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class GetContent
    extends ActivityResultContract<String, Uri>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      paramContext = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(paramString);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_GET…          .setType(input)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      return null;
    }
    
    @Nullable
    public final Uri parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Uri localUri = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localUri = paramIntent.getData();
      }
      return localUri;
    }
  }
  
  @Metadata(d1={"\000:\n\002\030\002\n\002\030\002\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\027\030\000 \0222\031\022\004\022\0020\002\022\017\022\r\022\t\022\0070\004¢\006\002\b\0050\0030\001:\001\022B\005¢\006\002\020\006J\030\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\013\032\0020\002H\027J$\020\f\032\020\022\n\022\b\022\004\022\0020\0040\003\030\0010\r2\006\020\t\032\0020\n2\006\020\013\032\0020\002J\036\020\016\032\b\022\004\022\0020\0040\0032\006\020\017\032\0020\0202\b\020\021\032\004\030\0010\b¨\006\023"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(18)
  public static class GetMultipleContents
    extends ActivityResultContract<String, List<Uri>>
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      paramContext = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(paramString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      return null;
    }
    
    @NotNull
    public final List<Uri> parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null)
      {
        paramIntent = Companion.getClipDataUris$activity_release(paramIntent);
        if (paramIntent != null) {}
      }
      else
      {
        paramIntent = CollectionsKt.emptyList();
      }
      return paramIntent;
    }
    
    @Metadata(d1={"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\027\020\003\032\b\022\004\022\0020\0050\004*\0020\006H\000¢\006\002\b\007¨\006\b"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$GetMultipleContents$Companion;", "", "()V", "getClipDataUris", "", "Landroid/net/Uri;", "Landroid/content/Intent;", "getClipDataUris$activity_release", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
    @RequiresApi(18)
    public static final class Companion
    {
      @NotNull
      public final List<Uri> getClipDataUris$activity_release(@NotNull Intent paramIntent)
      {
        Intrinsics.checkNotNullParameter(paramIntent, "<this>");
        LinkedHashSet localLinkedHashSet = new LinkedHashSet();
        Uri localUri = paramIntent.getData();
        if (localUri != null) {
          localLinkedHashSet.add(localUri);
        }
        paramIntent = paramIntent.getClipData();
        if ((paramIntent == null) && (localLinkedHashSet.isEmpty())) {
          return CollectionsKt.emptyList();
        }
        if (paramIntent != null)
        {
          int i = 0;
          int j = paramIntent.getItemCount();
          while (i < j)
          {
            localUri = paramIntent.getItemAt(i).getUri();
            if (localUri != null) {
              localLinkedHashSet.add(localUri);
            }
            i++;
          }
        }
        return new ArrayList(localLinkedHashSet);
      }
    }
  }
  
  @Metadata(d1={"\0006\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\027\030\0002\026\022\n\022\b\022\004\022\0020\0030\002\022\006\022\004\030\0010\0040\001B\005¢\006\002\020\005J#\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\0030\002H\027¢\006\002\020\013J+\020\f\032\f\022\006\022\004\030\0010\004\030\0010\r2\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\0020\0030\002¢\006\002\020\016J\032\020\017\032\004\030\0010\0042\006\020\020\032\0020\0212\b\020\022\032\004\030\0010\007¨\006\023"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocument;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(19)
  public static class OpenDocument
    extends ActivityResultContract<String[], Uri>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      paramContext = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", paramArrayOfString).setType("*/*");
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      return null;
    }
    
    @Nullable
    public final Uri parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Uri localUri = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localUri = paramIntent.getData();
      }
      return localUri;
    }
  }
  
  @Metadata(d1={"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\022\022\006\022\004\030\0010\002\022\006\022\004\030\0010\0020\001B\005¢\006\002\020\003J\032\020\004\032\0020\0052\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\002H\027J\"\020\t\032\f\022\006\022\004\030\0010\002\030\0010\n2\006\020\006\032\0020\0072\b\020\b\032\004\030\0010\002J\032\020\013\032\004\030\0010\0022\006\020\f\032\0020\r2\b\020\016\032\004\030\0010\005¨\006\017"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(21)
  public static class OpenDocumentTree
    extends ActivityResultContract<Uri, Uri>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @Nullable Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      paramContext = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
      if ((Build.VERSION.SDK_INT >= 26) && (paramUri != null)) {
        paramContext.putExtra("android.provider.extra.INITIAL_URI", paramUri);
      }
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(@NotNull Context paramContext, @Nullable Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      return null;
    }
    
    @Nullable
    public final Uri parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Uri localUri = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localUri = paramIntent.getData();
      }
      return localUri;
    }
  }
  
  @Metadata(d1={"\000>\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\b\027\030\0002\037\022\n\022\b\022\004\022\0020\0030\002\022\017\022\r\022\t\022\0070\005¢\006\002\b\0060\0040\001B\005¢\006\002\020\007J#\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\027¢\006\002\020\rJ/\020\016\032\020\022\n\022\b\022\004\022\0020\0050\004\030\0010\0172\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002¢\006\002\020\020J\036\020\021\032\b\022\004\022\0020\0050\0042\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\t¨\006\025"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$OpenMultipleDocuments;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "Landroid/net/Uri;", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  @RequiresApi(19)
  public static class OpenMultipleDocuments
    extends ActivityResultContract<String[], List<Uri>>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      paramContext = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", paramArrayOfString).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      return null;
    }
    
    @NotNull
    public final List<Uri> parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null)
      {
        paramIntent = ActivityResultContracts.GetMultipleContents.Companion.getClipDataUris$activity_release(paramIntent);
        if (paramIntent != null) {}
      }
      else
      {
        paramIntent = CollectionsKt.emptyList();
      }
      return paramIntent;
    }
  }
  
  @Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\002\030\0002\022\022\006\022\004\030\0010\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\032\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\002H\026J\034\020\n\032\004\030\0010\0032\006\020\013\032\0020\f2\b\020\r\032\004\030\0010\006H\026¨\006\016"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$PickContact;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/net/Uri;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class PickContact
    extends ActivityResultContract<Void, Uri>
  {
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @Nullable Void paramVoid)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      paramContext = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
      return paramContext;
    }
    
    @Nullable
    public Uri parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Uri localUri = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localUri = paramIntent.getData();
      }
      return localUri;
    }
  }
  
  @Metadata(d1={"\000>\n\002\030\002\n\002\030\002\n\002\020\021\n\002\020\016\n\002\020$\n\002\020\013\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \0252%\022\n\022\b\022\004\022\0020\0030\002\022\025\022\023\022\004\022\0020\003\022\t\022\0070\005¢\006\002\b\0060\0040\001:\001\025B\005¢\006\002\020\007J#\020\b\032\0020\t2\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\026¢\006\002\020\rJ7\020\016\032\026\022\020\022\016\022\004\022\0020\003\022\004\022\0020\0050\004\030\0010\0172\006\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0030\002H\026¢\006\002\020\020J&\020\021\032\016\022\004\022\0020\003\022\004\022\0020\0050\0042\006\020\022\032\0020\0232\b\020\024\032\004\030\0010\tH\026¨\006\026"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "(Landroid/content/Context;[Ljava/lang/String;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class RequestMultiplePermissions
    extends ActivityResultContract<String[], Map<String, Boolean>>
  {
    @NotNull
    public static final String ACTION_REQUEST_PERMISSIONS = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_PERMISSIONS = "androidx.activity.result.contract.extra.PERMISSIONS";
    @NotNull
    public static final String EXTRA_PERMISSION_GRANT_RESULTS = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";
    
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      return Companion.createIntent$activity_release(paramArrayOfString);
    }
    
    @Nullable
    public ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(@NotNull Context paramContext, @NotNull String[] paramArrayOfString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
      int i = paramArrayOfString.length;
      int j = 1;
      int k = 0;
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        return new ActivityResultContract.SynchronousResult(MapsKt.emptyMap());
      }
      int m = paramArrayOfString.length;
      int n;
      for (i = 0;; i++)
      {
        n = j;
        if (i >= m) {
          break;
        }
        if (ContextCompat.checkSelfPermission(paramContext, paramArrayOfString[i]) == 0) {
          n = 1;
        } else {
          n = 0;
        }
        if (n == 0)
        {
          n = 0;
          break;
        }
      }
      if (n != 0)
      {
        paramContext = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(paramArrayOfString.length), 16));
        n = paramArrayOfString.length;
        for (i = k; i < n; i++)
        {
          Pair localPair = TuplesKt.to(paramArrayOfString[i], Boolean.TRUE);
          paramContext.put(localPair.getFirst(), localPair.getSecond());
        }
        paramContext = new ActivityResultContract.SynchronousResult(paramContext);
      }
      else
      {
        paramContext = null;
      }
      return paramContext;
    }
    
    @NotNull
    public Map<String, Boolean> parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt != -1) {
        return MapsKt.emptyMap();
      }
      if (paramIntent == null) {
        return MapsKt.emptyMap();
      }
      String[] arrayOfString = paramIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
      int[] arrayOfInt = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
      if ((arrayOfInt != null) && (arrayOfString != null))
      {
        paramIntent = new ArrayList(arrayOfInt.length);
        int i = arrayOfInt.length;
        for (paramInt = 0; paramInt < i; paramInt++)
        {
          boolean bool;
          if (arrayOfInt[paramInt] == 0) {
            bool = true;
          } else {
            bool = false;
          }
          paramIntent.add(Boolean.valueOf(bool));
        }
        return MapsKt.a(CollectionsKt.r(ArraysKt.filterNotNull(arrayOfString), paramIntent));
      }
      return MapsKt.emptyMap();
    }
    
    @Metadata(d1={"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\020\021\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\007\032\0020\b2\f\020\t\032\b\022\004\022\0020\0040\nH\000¢\006\004\b\013\020\fR\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\r"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions$Companion;", "", "()V", "ACTION_REQUEST_PERMISSIONS", "", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "createIntent", "Landroid/content/Intent;", "input", "", "createIntent$activity_release", "([Ljava/lang/String;)Landroid/content/Intent;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class Companion
    {
      @NotNull
      public final Intent createIntent$activity_release(@NotNull String[] paramArrayOfString)
      {
        Intrinsics.checkNotNullParameter(paramArrayOfString, "input");
        paramArrayOfString = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", paramArrayOfString);
        Intrinsics.checkNotNullExpressionValue(paramArrayOfString, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return paramArrayOfString;
      }
    }
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\020\016\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J \020\n\032\n\022\004\022\0020\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J\037\020\f\032\0020\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006H\026¢\006\002\020\020¨\006\021"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;", "Landroidx/activity/result/contract/ActivityResultContract;", "", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class RequestPermission
    extends ActivityResultContract<String, Boolean>
  {
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      return ActivityResultContracts.RequestMultiplePermissions.Companion.createIntent$activity_release(new String[] { paramString });
    }
    
    @Nullable
    public ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context paramContext, @NotNull String paramString)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramString, "input");
      int i;
      if (ContextCompat.checkSelfPermission(paramContext, paramString) == 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        paramContext = new ActivityResultContract.SynchronousResult(Boolean.TRUE);
      } else {
        paramContext = null;
      }
      return paramContext;
    }
    
    @NotNull
    public Boolean parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if ((paramIntent != null) && (paramInt == -1))
      {
        paramIntent = paramIntent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean bool = true;
        if (paramIntent != null)
        {
          int i = paramIntent.length;
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            int j;
            if (paramIntent[paramInt] == 0) {
              j = 1;
            } else {
              j = 0;
            }
            if (j != 0)
            {
              paramInt = 1;
              break label70;
            }
          }
          paramInt = 0;
          label70:
          if (paramInt == 1) {}
        }
        else
        {
          bool = false;
        }
        return Boolean.valueOf(bool);
      }
      return Boolean.FALSE;
    }
  }
  
  @Metadata(d1={"\000$\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \r2\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\rB\005¢\006\002\020\004J\030\020\005\032\0020\0022\006\020\006\032\0020\0072\006\020\b\032\0020\002H\026J\032\020\t\032\0020\0032\006\020\n\032\0020\0132\b\020\f\032\004\030\0010\002H\026¨\006\016"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class StartActivityForResult
    extends ActivityResultContract<Intent, ActivityResult>
  {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_ACTIVITY_OPTIONS_BUNDLE = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";
    
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull Intent paramIntent)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramIntent, "input");
      return paramIntent;
    }
    
    @NotNull
    public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      return new ActivityResult(paramInt, paramIntent);
    }
    
    @Metadata(d1={"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000¨\006\005"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult$Companion;", "", "()V", "EXTRA_ACTIVITY_OPTIONS_BUNDLE", "", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class Companion {}
  }
  
  @Metadata(d1={"\000*\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\003\030\000 \0162\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\016B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\026J\032\020\n\032\0020\0032\006\020\013\032\0020\f2\b\020\r\032\004\030\0010\006H\026¨\006\017"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "parseResult", "resultCode", "", "intent", "Companion", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static final class StartIntentSenderForResult
    extends ActivityResultContract<IntentSenderRequest, ActivityResult>
  {
    @NotNull
    public static final String ACTION_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String EXTRA_INTENT_SENDER_REQUEST = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";
    @NotNull
    public static final String EXTRA_SEND_INTENT_EXCEPTION = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";
    
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull IntentSenderRequest paramIntentSenderRequest)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramIntentSenderRequest, "input");
      paramContext = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", paramIntentSenderRequest);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
      return paramContext;
    }
    
    @NotNull
    public ActivityResult parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      return new ActivityResult(paramInt, paramIntent);
    }
    
    @Metadata(d1={"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\016\020\003\032\0020\004XT¢\006\002\n\000R\016\020\005\032\0020\004XT¢\006\002\n\000R\016\020\006\032\0020\004XT¢\006\002\n\000¨\006\007"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$StartIntentSenderForResult$Companion;", "", "()V", "ACTION_INTENT_SENDER_REQUEST", "", "EXTRA_INTENT_SENDER_REQUEST", "EXTRA_SEND_INTENT_EXCEPTION", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
    public static final class Companion {}
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\b\026\030\0002\016\022\004\022\0020\002\022\004\022\0020\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J\036\020\n\032\n\022\004\022\0020\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\035\020\f\032\0020\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¢\006\002\020\020¨\006\021"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$TakePicture;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class TakePicture
    extends ActivityResultContract<Uri, Boolean>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      paramContext = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", paramUri);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      return null;
    }
    
    @NotNull
    public final Boolean parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      boolean bool;
      if (paramInt == -1) {
        bool = true;
      } else {
        bool = false;
      }
      return Boolean.valueOf(bool);
    }
  }
  
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\026\030\0002\022\022\006\022\004\030\0010\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\032\020\005\032\0020\0062\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\002H\027J\"\020\n\032\f\022\006\022\004\030\0010\003\030\0010\0132\006\020\007\032\0020\b2\b\020\t\032\004\030\0010\002J\032\020\f\032\004\030\0010\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¨\006\020"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview;", "Landroidx/activity/result/contract/ActivityResultContract;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class TakePicturePreview
    extends ActivityResultContract<Void, Bitmap>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @Nullable Void paramVoid)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      return new Intent("android.media.action.IMAGE_CAPTURE");
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context paramContext, @Nullable Void paramVoid)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      return null;
    }
    
    @Nullable
    public final Bitmap parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Bitmap localBitmap = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localBitmap = (Bitmap)paramIntent.getParcelableExtra("data");
      }
      return localBitmap;
    }
  }
  
  @Deprecated(message="The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
  @Metadata(d1={"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\002\b\027\030\0002\020\022\004\022\0020\002\022\006\022\004\030\0010\0030\001B\005¢\006\002\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\002H\027J \020\n\032\f\022\006\022\004\030\0010\003\030\0010\0132\006\020\007\032\0020\b2\006\020\t\032\0020\002J\032\020\f\032\004\030\0010\0032\006\020\r\032\0020\0162\b\020\017\032\004\030\0010\006¨\006\020"}, d2={"Landroidx/activity/result/contract/ActivityResultContracts$TakeVideo;", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "()V", "createIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "input", "getSynchronousResult", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "parseResult", "resultCode", "", "intent", "activity_release"}, k=1, mv={1, 6, 0}, xi=48)
  public static class TakeVideo
    extends ActivityResultContract<Uri, Bitmap>
  {
    @CallSuper
    @NotNull
    public Intent createIntent(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      paramContext = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", paramUri);
      Intrinsics.checkNotNullExpressionValue(paramContext, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
      return paramContext;
    }
    
    @Nullable
    public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(@NotNull Context paramContext, @NotNull Uri paramUri)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramUri, "input");
      return null;
    }
    
    @Nullable
    public final Bitmap parseResult(int paramInt, @Nullable Intent paramIntent)
    {
      if (paramInt == -1) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      Bitmap localBitmap = null;
      if (paramInt == 0) {
        paramIntent = null;
      }
      if (paramIntent != null) {
        localBitmap = (Bitmap)paramIntent.getParcelableExtra("data");
      }
      return localBitmap;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.activity.result.contract.ActivityResultContracts
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */