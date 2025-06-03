package com.facebook.common.file;

import java.io.File;

public abstract interface FileTreeVisitor
{
  public abstract void postVisitDirectory(File paramFile);
  
  public abstract void preVisitDirectory(File paramFile);
  
  public abstract void visitFile(File paramFile);
}

/* Location:
 * Qualified Name:     com.facebook.common.file.FileTreeVisitor
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */