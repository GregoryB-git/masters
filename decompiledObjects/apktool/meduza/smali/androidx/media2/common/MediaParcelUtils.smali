.class public final Landroidx/media2/common/MediaParcelUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;
    }
.end annotation


# direct methods
.method public static a(Lb2/e;)Landroidx/versionedparcelable/ParcelImpl;
    .locals 1

    instance-of v0, p0, Landroidx/media2/common/MediaItem;

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;

    check-cast p0, Landroidx/media2/common/MediaItem;

    invoke-direct {v0, p0}, Landroidx/media2/common/MediaParcelUtils$MediaItemParcelImpl;-><init>(Landroidx/media2/common/MediaItem;)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/versionedparcelable/ParcelImpl;

    invoke-direct {v0, p0}, Landroidx/versionedparcelable/ParcelImpl;-><init>(Lb2/e;)V

    return-object v0
.end method
