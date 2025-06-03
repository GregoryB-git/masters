package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Atom$ContainerAtom
  extends Atom
{
  public final List<ContainerAtom> containerChildren;
  public final long endPosition;
  public final List<Atom.LeafAtom> leafChildren;
  
  public Atom$ContainerAtom(int paramInt, long paramLong)
  {
    super(paramInt);
    endPosition = paramLong;
    leafChildren = new ArrayList();
    containerChildren = new ArrayList();
  }
  
  public void add(ContainerAtom paramContainerAtom)
  {
    containerChildren.add(paramContainerAtom);
  }
  
  public void add(Atom.LeafAtom paramLeafAtom)
  {
    leafChildren.add(paramLeafAtom);
  }
  
  public int getChildAtomOfTypeCount(int paramInt)
  {
    int i = leafChildren.size();
    int j = 0;
    int k = 0;
    int n;
    for (int m = k; k < i; m = n)
    {
      n = m;
      if (leafChildren.get(k)).type == paramInt) {
        n = m + 1;
      }
      k++;
    }
    i = containerChildren.size();
    k = j;
    while (k < i)
    {
      n = m;
      if (containerChildren.get(k)).type == paramInt) {
        n = m + 1;
      }
      k++;
      m = n;
    }
    return m;
  }
  
  @Nullable
  public ContainerAtom getContainerAtomOfType(int paramInt)
  {
    int i = containerChildren.size();
    for (int j = 0; j < i; j++)
    {
      ContainerAtom localContainerAtom = (ContainerAtom)containerChildren.get(j);
      if (type == paramInt) {
        return localContainerAtom;
      }
    }
    return null;
  }
  
  @Nullable
  public Atom.LeafAtom getLeafAtomOfType(int paramInt)
  {
    int i = leafChildren.size();
    for (int j = 0; j < i; j++)
    {
      Atom.LeafAtom localLeafAtom = (Atom.LeafAtom)leafChildren.get(j);
      if (type == paramInt) {
        return localLeafAtom;
      }
    }
    return null;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Atom.getAtomTypeString(type));
    localStringBuilder.append(" leaves: ");
    localStringBuilder.append(Arrays.toString(leafChildren.toArray()));
    localStringBuilder.append(" containers: ");
    localStringBuilder.append(Arrays.toString(containerChildren.toArray()));
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.extractor.mp4.Atom.ContainerAtom
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */