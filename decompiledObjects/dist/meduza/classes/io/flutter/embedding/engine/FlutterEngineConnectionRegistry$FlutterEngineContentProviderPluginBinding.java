package io.flutter.embedding.engine;

import android.content.ContentProvider;
import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;

class FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding
  implements ContentProviderPluginBinding
{
  private final ContentProvider contentProvider;
  
  public FlutterEngineConnectionRegistry$FlutterEngineContentProviderPluginBinding(ContentProvider paramContentProvider)
  {
    contentProvider = paramContentProvider;
  }
  
  public ContentProvider getContentProvider()
  {
    return contentProvider;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.FlutterEngineConnectionRegistry.FlutterEngineContentProviderPluginBinding
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */