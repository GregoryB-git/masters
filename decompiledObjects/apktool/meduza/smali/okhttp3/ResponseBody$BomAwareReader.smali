.class final Lokhttp3/ResponseBody$BomAwareReader;
.super Ljava/io/Reader;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/ResponseBody;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "BomAwareReader"
.end annotation


# instance fields
.field public a:Z


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lokhttp3/ResponseBody$BomAwareReader;->a:Z

    const/4 v0, 0x0

    throw v0
.end method

.method public final read([CII)I
    .locals 0

    iget-boolean p1, p0, Lokhttp3/ResponseBody$BomAwareReader;->a:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1, p1}, Lokhttp3/internal/Util;->b(Lxc/h;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    throw p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Stream closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
