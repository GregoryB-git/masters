package androidx.emoji2.text.flatbuffer;

import java.util.Comparator;

class FlexBuffersBuilder$1
  implements Comparator<FlexBuffersBuilder.Value>
{
  public FlexBuffersBuilder$1(FlexBuffersBuilder paramFlexBuffersBuilder) {}
  
  public int compare(FlexBuffersBuilder.Value paramValue1, FlexBuffersBuilder.Value paramValue2)
  {
    int i = key;
    int j = key;
    int k;
    int m;
    do
    {
      k = FlexBuffersBuilder.access$000(this$0).get(i);
      m = FlexBuffersBuilder.access$000(this$0).get(j);
      if (k == 0) {
        return k - m;
      }
      i++;
      j++;
    } while (k == m);
    return k - m;
  }
}

/* Location:
 * Qualified Name:     androidx.emoji2.text.flatbuffer.FlexBuffersBuilder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */