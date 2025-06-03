package okhttp3.internal.http2;

final class Huffman$Node
{
  public final Node[] a;
  public final int b;
  public final int c;
  
  public Huffman$Node()
  {
    a = new Node['Ā'];
    b = 0;
    c = 0;
  }
  
  public Huffman$Node(int paramInt1, int paramInt2)
  {
    a = null;
    b = paramInt1;
    paramInt2 &= 0x7;
    paramInt1 = paramInt2;
    if (paramInt2 == 0) {
      paramInt1 = 8;
    }
    c = paramInt1;
  }
}

/* Location:
 * Qualified Name:     okhttp3.internal.http2.Huffman.Node
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */