.class Lokhttp3/RequestBody$2;
.super Lokhttp3/RequestBody;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lokhttp3/MediaType;

.field public final synthetic b:I

.field public final synthetic c:[B

.field public final synthetic d:I


# direct methods
.method public constructor <init>(ILokhttp3/MediaType;[B)V
    .locals 0

    iput-object p2, p0, Lokhttp3/RequestBody$2;->a:Lokhttp3/MediaType;

    iput p1, p0, Lokhttp3/RequestBody$2;->b:I

    iput-object p3, p0, Lokhttp3/RequestBody$2;->c:[B

    const/4 p1, 0x0

    iput p1, p0, Lokhttp3/RequestBody$2;->d:I

    invoke-direct {p0}, Lokhttp3/RequestBody;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    iget v0, p0, Lokhttp3/RequestBody$2;->b:I

    int-to-long v0, v0

    return-wide v0
.end method

.method public final b()Lokhttp3/MediaType;
    .locals 1

    iget-object v0, p0, Lokhttp3/RequestBody$2;->a:Lokhttp3/MediaType;

    return-object v0
.end method

.method public final d(Lxc/r;)V
    .locals 3

    iget-object v0, p0, Lokhttp3/RequestBody$2;->c:[B

    iget v1, p0, Lokhttp3/RequestBody$2;->d:I

    iget v2, p0, Lokhttp3/RequestBody$2;->b:I

    invoke-virtual {p1, v0, v1, v2}, Lxc/r;->g([BII)Lxc/g;

    return-void
.end method
