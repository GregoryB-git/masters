.class public final Landroidx/media2/common/MediaMetadataParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static read(Lb2/c;)Landroidx/media2/common/MediaMetadata;
    .locals 4

    .line 1
    new-instance v0, Landroidx/media2/common/MediaMetadata;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media2/common/MediaMetadata;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 7
    .line 8
    const/4 v2, 0x1

    .line 9
    invoke-virtual {p0, v2, v1}, Lb2/c;->h(ILandroid/os/Bundle;)Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, v0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/media2/common/MediaMetadata;->c:Landroidx/media2/common/ParcelImplListSlice;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-virtual {p0, v1, v2}, Lb2/c;->s(Landroid/os/Parcelable;I)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Landroidx/media2/common/ParcelImplListSlice;

    .line 23
    .line 24
    iput-object p0, v0, Landroidx/media2/common/MediaMetadata;->c:Landroidx/media2/common/ParcelImplListSlice;

    .line 25
    .line 26
    iget-object p0, v0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p0, Landroid/os/Bundle;

    .line 32
    .line 33
    invoke-direct {p0}, Landroid/os/Bundle;-><init>()V

    .line 34
    .line 35
    .line 36
    :goto_0
    iput-object p0, v0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 37
    .line 38
    iget-object p0, v0, Landroidx/media2/common/MediaMetadata;->c:Landroidx/media2/common/ParcelImplListSlice;

    .line 39
    .line 40
    if-eqz p0, :cond_1

    .line 41
    .line 42
    iget-object p0, p0, Landroidx/media2/common/ParcelImplListSlice;->a:Ljava/util/List;

    .line 43
    .line 44
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Landroidx/versionedparcelable/ParcelImpl;

    .line 59
    .line 60
    invoke-static {v1}, Lb2/a;->a(Landroid/os/Parcelable;)Lb2/e;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Landroidx/media2/common/MediaMetadata$BitmapEntry;

    .line 65
    .line 66
    iget-object v2, v0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 67
    .line 68
    iget-object v3, v1, Landroidx/media2/common/MediaMetadata$BitmapEntry;->a:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v1, v1, Landroidx/media2/common/MediaMetadata$BitmapEntry;->b:Landroid/graphics/Bitmap;

    .line 71
    .line 72
    invoke-virtual {v2, v3, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    return-object v0
    .line 77
.end method

.method public static write(Landroidx/media2/common/MediaMetadata;Lb2/c;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 8
    .line 9
    if-nez v1, :cond_2

    .line 10
    .line 11
    new-instance v1, Landroid/os/Bundle;

    .line 12
    .line 13
    iget-object v2, p0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 14
    .line 15
    invoke-direct {v1, v2}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, p0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 19
    .line 20
    new-instance v1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v2, p0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 26
    .line 27
    invoke-virtual {v2}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, p0, Landroidx/media2/common/MediaMetadata;->a:Landroid/os/Bundle;

    .line 48
    .line 49
    invoke-virtual {v4, v3}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    instance-of v5, v4, Landroid/graphics/Bitmap;

    .line 54
    .line 55
    if-nez v5, :cond_0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    check-cast v4, Landroid/graphics/Bitmap;

    .line 59
    .line 60
    new-instance v5, Landroidx/media2/common/MediaMetadata$BitmapEntry;

    .line 61
    .line 62
    invoke-direct {v5, v4, v3}, Landroidx/media2/common/MediaMetadata$BitmapEntry;-><init>(Landroid/graphics/Bitmap;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {v5}, Landroidx/media2/common/MediaParcelUtils;->a(Lb2/e;)Landroidx/versionedparcelable/ParcelImpl;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    iget-object v4, p0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    new-instance v2, Landroidx/media2/common/ParcelImplListSlice;

    .line 79
    .line 80
    invoke-direct {v2, v1}, Landroidx/media2/common/ParcelImplListSlice;-><init>(Ljava/util/ArrayList;)V

    .line 81
    .line 82
    .line 83
    iput-object v2, p0, Landroidx/media2/common/MediaMetadata;->c:Landroidx/media2/common/ParcelImplListSlice;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :catchall_0
    move-exception p0

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    iget-object v0, p0, Landroidx/media2/common/MediaMetadata;->b:Landroid/os/Bundle;

    .line 90
    .line 91
    const/4 v1, 0x1

    .line 92
    invoke-virtual {p1, v1, v0}, Lb2/c;->B(ILandroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    iget-object p0, p0, Landroidx/media2/common/MediaMetadata;->c:Landroidx/media2/common/ParcelImplListSlice;

    .line 96
    .line 97
    const/4 v0, 0x2

    .line 98
    invoke-virtual {p1, p0, v0}, Lb2/c;->M(Landroid/os/Parcelable;I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    throw p0
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
