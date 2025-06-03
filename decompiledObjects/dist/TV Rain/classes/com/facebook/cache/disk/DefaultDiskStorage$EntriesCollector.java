package com.facebook.cache.disk;

import com.facebook.common.file.FileTreeVisitor;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DefaultDiskStorage$EntriesCollector
  implements FileTreeVisitor
{
  private final List<DiskStorage.Entry> result = new ArrayList();
  
  private DefaultDiskStorage$EntriesCollector(DefaultDiskStorage paramDefaultDiskStorage) {}
  
  public List<DiskStorage.Entry> getEntries()
  {
    return Collections.unmodifiableList(result);
  }
  
  public void postVisitDirectory(File paramFile) {}
  
  public void preVisitDirectory(File paramFile) {}
  
  public void visitFile(File paramFile)
  {
    DefaultDiskStorage.FileInfo localFileInfo = DefaultDiskStorage.access$000(this$0, paramFile);
    if ((localFileInfo != null) && (type == ".cnt")) {
      result.add(new DefaultDiskStorage.EntryImpl(resourceId, paramFile, null));
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DefaultDiskStorage.EntriesCollector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */