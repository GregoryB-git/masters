package io.flutter.embedding.engine.loader;

public final class FlutterApplicationInfo
{
  private static final String DEFAULT_AOT_SHARED_LIBRARY_NAME = "libapp.so";
  private static final String DEFAULT_FLUTTER_ASSETS_DIR = "flutter_assets";
  private static final String DEFAULT_ISOLATE_SNAPSHOT_DATA = "isolate_snapshot_data";
  private static final String DEFAULT_VM_SNAPSHOT_DATA = "vm_snapshot_data";
  public final String aotSharedLibraryName;
  public final boolean automaticallyRegisterPlugins;
  public final String domainNetworkPolicy;
  public final String flutterAssetsDir;
  public final String isolateSnapshotData;
  public final String nativeLibraryDir;
  public final String vmSnapshotData;
  
  public FlutterApplicationInfo(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, boolean paramBoolean)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "libapp.so";
    }
    aotSharedLibraryName = str;
    paramString1 = paramString2;
    if (paramString2 == null) {
      paramString1 = "vm_snapshot_data";
    }
    vmSnapshotData = paramString1;
    paramString1 = paramString3;
    if (paramString3 == null) {
      paramString1 = "isolate_snapshot_data";
    }
    isolateSnapshotData = paramString1;
    paramString1 = paramString4;
    if (paramString4 == null) {
      paramString1 = "flutter_assets";
    }
    flutterAssetsDir = paramString1;
    nativeLibraryDir = paramString6;
    paramString1 = paramString5;
    if (paramString5 == null) {
      paramString1 = "";
    }
    domainNetworkPolicy = paramString1;
    automaticallyRegisterPlugins = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.loader.FlutterApplicationInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */