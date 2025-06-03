package androidx.recyclerview.widget;

final class AdapterHelper$UpdateOp
{
  public static final int ADD = 1;
  public static final int MOVE = 8;
  public static final int POOL_SIZE = 30;
  public static final int REMOVE = 2;
  public static final int UPDATE = 4;
  public int cmd;
  public int itemCount;
  public Object payload;
  public int positionStart;
  
  public AdapterHelper$UpdateOp(int paramInt1, int paramInt2, int paramInt3, Object paramObject)
  {
    cmd = paramInt1;
    positionStart = paramInt2;
    itemCount = paramInt3;
    payload = paramObject;
  }
  
  public String cmdToString()
  {
    int i = cmd;
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4)
        {
          if (i != 8) {
            return "??";
          }
          return "mv";
        }
        return "up";
      }
      return "rm";
    }
    return "add";
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof UpdateOp)) {
      return false;
    }
    paramObject = (UpdateOp)paramObject;
    int i = cmd;
    if (i != cmd) {
      return false;
    }
    if ((i == 8) && (Math.abs(itemCount - positionStart) == 1) && (itemCount == positionStart) && (positionStart == itemCount)) {
      return true;
    }
    if (itemCount != itemCount) {
      return false;
    }
    if (positionStart != positionStart) {
      return false;
    }
    Object localObject = payload;
    if (localObject != null)
    {
      if (!localObject.equals(payload)) {
        return false;
      }
    }
    else if (payload != null) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    return (cmd * 31 + positionStart) * 31 + itemCount;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append("[");
    localStringBuilder.append(cmdToString());
    localStringBuilder.append(",s:");
    localStringBuilder.append(positionStart);
    localStringBuilder.append("c:");
    localStringBuilder.append(itemCount);
    localStringBuilder.append(",p:");
    localStringBuilder.append(payload);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.AdapterHelper.UpdateOp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */