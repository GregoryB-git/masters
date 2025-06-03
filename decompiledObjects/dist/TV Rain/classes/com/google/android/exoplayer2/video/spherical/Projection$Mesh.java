package com.google.android.exoplayer2.video.spherical;

public final class Projection$Mesh
{
  private final Projection.SubMesh[] subMeshes;
  
  public Projection$Mesh(Projection.SubMesh... paramVarArgs)
  {
    subMeshes = paramVarArgs;
  }
  
  public Projection.SubMesh getSubMesh(int paramInt)
  {
    return subMeshes[paramInt];
  }
  
  public int getSubMeshCount()
  {
    return subMeshes.length;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.video.spherical.Projection.Mesh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */