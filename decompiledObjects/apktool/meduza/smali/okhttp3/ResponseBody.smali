.class public abstract Lokhttp3/ResponseBody;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/ResponseBody$BomAwareReader;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static C([B)Lokhttp3/ResponseBody;
    .locals 3

    new-instance v0, Lxc/f;

    invoke-direct {v0}, Lxc/f;-><init>()V

    invoke-virtual {v0, p0}, Lxc/f;->write([B)V

    array-length p0, p0

    int-to-long v1, p0

    new-instance p0, Lokhttp3/ResponseBody$1;

    invoke-direct {p0, v1, v2, v0}, Lokhttp3/ResponseBody$1;-><init>(JLxc/f;)V

    return-object p0
.end method


# virtual methods
.method public abstract H()Lxc/h;
.end method

.method public final close()V
    .locals 1

    invoke-virtual {p0}, Lokhttp3/ResponseBody;->H()Lxc/h;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/Util;->e(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract f()J
.end method

.method public abstract g()Lokhttp3/MediaType;
.end method
