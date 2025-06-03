package x3;

public final class s$g
  implements g
{
  public final f[] a;
  public final a0 b;
  public final c0 c;
  
  public s$g(f... paramVarArgs)
  {
    f[] arrayOff = new f[paramVarArgs.length + 2];
    a = arrayOff;
    System.arraycopy(paramVarArgs, 0, arrayOff, 0, paramVarArgs.length);
    b = locala0;
    c = localc0;
    arrayOff[paramVarArgs.length] = locala0;
    arrayOff[(paramVarArgs.length + 1)] = localc0;
  }
}

/* Location:
 * Qualified Name:     x3.s.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */