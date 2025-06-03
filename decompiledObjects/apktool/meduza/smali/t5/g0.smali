.class public final Lt5/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k;


# static fields
.field public static final a:Lt5/g0;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lt5/g0;

    invoke-direct {v0}, Lt5/g0;-><init>()V

    sput-object v0, Lt5/g0;->a:Lt5/g0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lt5/n;)J
    .locals 1

    new-instance p1, Ljava/io/IOException;

    const-string v0, "PlaceholderDataSource cannot be opened"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final f(Lt5/l0;)V
    .locals 0

    return-void
.end method

.method public final h()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final l()Landroid/net/Uri;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final read([BII)I
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
