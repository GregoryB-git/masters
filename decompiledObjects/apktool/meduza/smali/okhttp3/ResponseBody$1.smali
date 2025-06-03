.class Lokhttp3/ResponseBody$1;
.super Lokhttp3/ResponseBody;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lokhttp3/MediaType;

.field public final synthetic b:J

.field public final synthetic c:Lxc/h;


# direct methods
.method public constructor <init>(JLxc/f;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lokhttp3/ResponseBody$1;->a:Lokhttp3/MediaType;

    iput-wide p1, p0, Lokhttp3/ResponseBody$1;->b:J

    iput-object p3, p0, Lokhttp3/ResponseBody$1;->c:Lxc/h;

    invoke-direct {p0}, Lokhttp3/ResponseBody;-><init>()V

    return-void
.end method


# virtual methods
.method public final H()Lxc/h;
    .locals 1

    iget-object v0, p0, Lokhttp3/ResponseBody$1;->c:Lxc/h;

    return-object v0
.end method

.method public final f()J
    .locals 2

    iget-wide v0, p0, Lokhttp3/ResponseBody$1;->b:J

    return-wide v0
.end method

.method public final g()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lokhttp3/ResponseBody$1;->a:Lokhttp3/MediaType;

    return-object v0
.end method
