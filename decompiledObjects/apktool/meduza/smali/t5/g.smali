.class public final Lt5/g;
.super Lt5/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/g$a;
    }
.end annotation


# instance fields
.field public final e:Landroid/content/ContentResolver;

.field public f:Landroid/net/Uri;

.field public g:Landroid/content/res/AssetFileDescriptor;

.field public h:Ljava/io/FileInputStream;

.field public i:J

.field public j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lt5/f;-><init>(Z)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    iput-object p1, p0, Lt5/g;->e:Landroid/content/ContentResolver;

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const/16 v2, 0x7d0

    :try_start_0
    iget-object v3, v0, Lt5/n;->a:Landroid/net/Uri;

    iput-object v3, v1, Lt5/g;->f:Landroid/net/Uri;

    invoke-virtual/range {p0 .. p1}, Lt5/f;->q(Lt5/n;)V

    const-string v4, "content"

    iget-object v5, v0, Lt5/n;->a:Landroid/net/Uri;

    invoke-virtual {v5}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_0

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v6, "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT"

    invoke-virtual {v4, v6, v5}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v6, v1, Lt5/g;->e:Landroid/content/ContentResolver;

    const-string v7, "*/*"

    invoke-virtual {v6, v3, v7, v4}, Landroid/content/ContentResolver;->openTypedAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v4

    goto :goto_0

    :cond_0
    iget-object v4, v1, Lt5/g;->e:Landroid/content/ContentResolver;

    const-string v6, "r"

    invoke-virtual {v4, v3, v6}, Landroid/content/ContentResolver;->openAssetFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    move-result-object v4

    :goto_0
    iput-object v4, v1, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getLength()J

    move-result-wide v6

    new-instance v3, Ljava/io/FileInputStream;

    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object v8

    invoke-direct {v3, v8}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V

    iput-object v3, v1, Lt5/g;->h:Ljava/io/FileInputStream;

    const-wide/16 v8, -0x1

    cmp-long v10, v6, v8

    const/16 v11, 0x7d8

    const/4 v12, 0x0

    if-eqz v10, :cond_2

    iget-wide v13, v0, Lt5/n;->f:J

    cmp-long v13, v13, v6

    if-gtz v13, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Lt5/g$a;

    invoke-direct {v0, v12, v11}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v0

    :cond_2
    :goto_1
    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v13

    move-wide v15, v6

    iget-wide v5, v0, Lt5/n;->f:J

    add-long/2addr v5, v13

    invoke-virtual {v3, v5, v6}, Ljava/io/FileInputStream;->skip(J)J

    move-result-wide v5

    sub-long/2addr v5, v13

    iget-wide v13, v0, Lt5/n;->f:J

    cmp-long v7, v5, v13

    if-nez v7, :cond_a

    const-wide/16 v13, 0x0

    if-nez v10, :cond_5

    invoke-virtual {v3}, Ljava/io/FileInputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v5

    cmp-long v7, v5, v13

    if-nez v7, :cond_3

    iput-wide v8, v1, Lt5/g;->i:J

    goto :goto_2

    :cond_3
    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->position()J

    move-result-wide v15

    sub-long/2addr v5, v15

    iput-wide v5, v1, Lt5/g;->i:J

    cmp-long v3, v5, v13

    if-ltz v3, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lt5/g$a;

    invoke-direct {v0, v12, v11}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v0

    :cond_5
    sub-long v6, v15, v5

    iput-wide v6, v1, Lt5/g;->i:J
    :try_end_0
    .catch Lt5/g$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v3, v6, v13

    if-ltz v3, :cond_9

    :goto_2
    iget-wide v2, v0, Lt5/n;->g:J

    cmp-long v5, v2, v8

    if-eqz v5, :cond_7

    iget-wide v5, v1, Lt5/g;->i:J

    cmp-long v7, v5, v8

    if-nez v7, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v5, v6, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :goto_3
    iput-wide v2, v1, Lt5/g;->i:J

    :cond_7
    const/4 v2, 0x1

    iput-boolean v2, v1, Lt5/g;->j:Z

    invoke-virtual/range {p0 .. p1}, Lt5/f;->r(Lt5/n;)V

    iget-wide v2, v0, Lt5/n;->g:J

    cmp-long v0, v2, v8

    if-eqz v0, :cond_8

    goto :goto_4

    :cond_8
    iget-wide v2, v1, Lt5/g;->i:J

    :goto_4
    return-wide v2

    :cond_9
    :try_start_1
    new-instance v0, Lt5/g$a;

    invoke-direct {v0, v12, v11}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v0

    :cond_a
    new-instance v0, Lt5/g$a;

    invoke-direct {v0, v12, v11}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v0

    :cond_b
    new-instance v0, Lt5/g$a;

    new-instance v4, Ljava/io/IOException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Could not open file descriptor for: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v4, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v4, v2}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v0
    :try_end_1
    .catch Lt5/g$a; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    new-instance v3, Lt5/g$a;

    instance-of v4, v0, Ljava/io/FileNotFoundException;

    if-eqz v4, :cond_c

    const/16 v2, 0x7d5

    :cond_c
    invoke-direct {v3, v0, v2}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v3

    :catch_1
    move-exception v0

    throw v0
.end method

.method public final close()V
    .locals 5

    const/4 v0, 0x0

    iput-object v0, p0, Lt5/g;->f:Landroid/net/Uri;

    const/16 v1, 0x7d0

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p0, Lt5/g;->h:Ljava/io/FileInputStream;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    iput-object v0, p0, Lt5/g;->h:Ljava/io/FileInputStream;

    :try_start_1
    iget-object v3, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    iput-object v0, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/g;->j:Z

    if-eqz v0, :cond_2

    iput-boolean v2, p0, Lt5/g;->j:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_2
    new-instance v4, Lt5/g$a;

    invoke-direct {v4, v3, v1}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    iput-object v0, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/g;->j:Z

    if-eqz v0, :cond_3

    iput-boolean v2, p0, Lt5/g;->j:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_3
    throw v1

    :catchall_1
    move-exception v3

    goto :goto_1

    :catch_1
    move-exception v3

    :try_start_3
    new-instance v4, Lt5/g$a;

    invoke-direct {v4, v3, v1}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    iput-object v0, p0, Lt5/g;->h:Ljava/io/FileInputStream;

    :try_start_4
    iget-object v4, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Landroid/content/res/AssetFileDescriptor;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_4
    iput-object v0, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/g;->j:Z

    if-eqz v0, :cond_5

    iput-boolean v2, p0, Lt5/g;->j:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_5
    throw v3

    :catchall_2
    move-exception v1

    goto :goto_2

    :catch_2
    move-exception v3

    :try_start_5
    new-instance v4, Lt5/g$a;

    invoke-direct {v4, v3, v1}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_2
    iput-object v0, p0, Lt5/g;->g:Landroid/content/res/AssetFileDescriptor;

    iget-boolean v0, p0, Lt5/g;->j:Z

    if-eqz v0, :cond_6

    iput-boolean v2, p0, Lt5/g;->j:Z

    invoke-virtual {p0}, Lt5/f;->p()V

    :cond_6
    throw v1
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lt5/g;->f:Landroid/net/Uri;

    return-object v0
.end method

.method public final read([BII)I
    .locals 8

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-wide v0, p0, Lt5/g;->i:J

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    const/4 v3, -0x1

    if-nez v2, :cond_1

    return v3

    :cond_1
    const-wide/16 v4, -0x1

    cmp-long v2, v0, v4

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    int-to-long v6, p3

    :try_start_0
    invoke-static {v0, v1, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p3, v0

    :goto_0
    iget-object v0, p0, Lt5/g;->h:Ljava/io/FileInputStream;

    sget v1, Lv5/e0;->a:I

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/FileInputStream;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne p1, v3, :cond_3

    return v3

    :cond_3
    iget-wide p2, p0, Lt5/g;->i:J

    cmp-long v0, p2, v4

    if-eqz v0, :cond_4

    int-to-long v0, p1

    sub-long/2addr p2, v0

    iput-wide p2, p0, Lt5/g;->i:J

    :cond_4
    invoke-virtual {p0, p1}, Lt5/f;->o(I)V

    return p1

    :catch_0
    move-exception p1

    new-instance p2, Lt5/g$a;

    const/16 p3, 0x7d0

    invoke-direct {p2, p1, p3}, Lt5/g$a;-><init>(Ljava/io/IOException;I)V

    throw p2
.end method
