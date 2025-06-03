.class public final Lokhttp3/FormBody;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/FormBody$Builder;
    }
.end annotation


# static fields
.field public static final a:Lokhttp3/MediaType;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "application/x-www-form-urlencoded"

    invoke-static {v0}, Lokhttp3/MediaType;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0

    sput-object v0, Lokhttp3/FormBody;->a:Lokhttp3/MediaType;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 1

    new-instance v0, Lxc/f;

    invoke-direct {v0}, Lxc/f;-><init>()V

    const/4 v0, 0x0

    throw v0
.end method

.method public final b()Lokhttp3/MediaType;
    .locals 1

    sget-object v0, Lokhttp3/FormBody;->a:Lokhttp3/MediaType;

    return-object v0
.end method

.method public final d(Lxc/r;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
