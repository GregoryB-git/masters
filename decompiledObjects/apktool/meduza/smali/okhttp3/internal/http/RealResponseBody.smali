.class public final Lokhttp3/internal/http/RealResponseBody;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:J

.field public final c:Lxc/h;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLxc/s;)V
    .locals 0

    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http/RealResponseBody;->a:Ljava/lang/String;

    iput-wide p2, p0, Lokhttp3/internal/http/RealResponseBody;->b:J

    iput-object p4, p0, Lokhttp3/internal/http/RealResponseBody;->c:Lxc/h;

    return-void
.end method


# virtual methods
.method public final H()Lxc/h;
    .locals 1

    iget-object v0, p0, Lokhttp3/internal/http/RealResponseBody;->c:Lxc/h;

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/internal/http/RealResponseBody;->b:J

    return-wide v0
.end method

.method public final g()Lokhttp3/MediaType;
    .locals 2

    iget-object v0, p0, Lokhttp3/internal/http/RealResponseBody;->a:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v0}, Lokhttp3/MediaType;->a(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v1, v0

    :catch_0
    :cond_0
    return-object v1
.end method
