package io.flutter.embedding.engine.plugins.contentprovider;

public abstract interface ContentProviderAware
{
  public abstract void onAttachedToContentProvider(ContentProviderPluginBinding paramContentProviderPluginBinding);
  
  public abstract void onDetachedFromContentProvider();
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.plugins.contentprovider.ContentProviderAware
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */