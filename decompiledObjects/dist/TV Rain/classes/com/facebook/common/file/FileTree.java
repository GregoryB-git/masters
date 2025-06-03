package com.facebook.common.file;

import java.io.File;

public class FileTree
{
  public static boolean deleteContents(File paramFile)
  {
    paramFile = paramFile.listFiles();
    boolean bool1 = true;
    boolean bool2 = true;
    if (paramFile != null)
    {
      int i = paramFile.length;
      for (int j = 0;; j++)
      {
        bool1 = bool2;
        if (j >= i) {
          break;
        }
        bool2 &= deleteRecursively(paramFile[j]);
      }
    }
    return bool1;
  }
  
  public static boolean deleteRecursively(File paramFile)
  {
    if (paramFile.isDirectory()) {
      deleteContents(paramFile);
    }
    return paramFile.delete();
  }
  
  public static void walkFileTree(File paramFile, FileTreeVisitor paramFileTreeVisitor)
  {
    paramFileTreeVisitor.preVisitDirectory(paramFile);
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null)
    {
      int i = arrayOfFile.length;
      for (int j = 0; j < i; j++)
      {
        File localFile = arrayOfFile[j];
        if (localFile.isDirectory()) {
          walkFileTree(localFile, paramFileTreeVisitor);
        } else {
          paramFileTreeVisitor.visitFile(localFile);
        }
      }
    }
    paramFileTreeVisitor.postVisitDirectory(paramFile);
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.file.FileTree
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */