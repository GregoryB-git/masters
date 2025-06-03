package com.facebook.cache.disk;

import com.facebook.common.file.FileTreeVisitor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.time.Clock;
import java.io.File;

class DefaultDiskStorage$PurgingVisitor
  implements FileTreeVisitor
{
  private boolean insideBaseDirectory;
  
  private DefaultDiskStorage$PurgingVisitor(DefaultDiskStorage paramDefaultDiskStorage) {}
  
  private boolean isExpectedFile(File paramFile)
  {
    Object localObject = DefaultDiskStorage.access$000(this$0, paramFile);
    boolean bool = false;
    if (localObject == null) {
      return false;
    }
    localObject = type;
    if (localObject == ".tmp") {
      return isRecentFile(paramFile);
    }
    if (localObject == ".cnt") {
      bool = true;
    }
    Preconditions.checkState(bool);
    return true;
  }
  
  private boolean isRecentFile(File paramFile)
  {
    boolean bool;
    if (paramFile.lastModified() > DefaultDiskStorage.access$400(this$0).now() - DefaultDiskStorage.TEMP_FILE_LIFETIME_MS) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public void postVisitDirectory(File paramFile)
  {
    if ((!DefaultDiskStorage.access$300(this$0).equals(paramFile)) && (!insideBaseDirectory)) {
      paramFile.delete();
    }
    if ((insideBaseDirectory) && (paramFile.equals(DefaultDiskStorage.access$200(this$0)))) {
      insideBaseDirectory = false;
    }
  }
  
  public void preVisitDirectory(File paramFile)
  {
    if ((!insideBaseDirectory) && (paramFile.equals(DefaultDiskStorage.access$200(this$0)))) {
      insideBaseDirectory = true;
    }
  }
  
  public void visitFile(File paramFile)
  {
    if ((!insideBaseDirectory) || (!isExpectedFile(paramFile))) {
      paramFile.delete();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.PurgingVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */