.class public final Lokhttp3/Response;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/Response$Builder;
    }
.end annotation


# instance fields
.field public final a:Lokhttp3/Request;

.field public final b:Lokhttp3/Protocol;

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Lokhttp3/Handshake;

.field public final f:Lokhttp3/Headers;

.field public final o:Lokhttp3/ResponseBody;

.field public final p:Lokhttp3/Response;

.field public final q:Lokhttp3/Response;

.field public final r:Lokhttp3/Response;

.field public final s:J

.field public final t:J

.field public volatile u:Lokhttp3/CacheControl;


# direct methods
.method public constructor <init>(Lokhttp3/Response$Builder;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lokhttp3/Response$Builder;->a:Lokhttp3/Request;

    .line 5
    .line 6
    iput-object v0, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 7
    .line 8
    iget-object v0, p1, Lokhttp3/Response$Builder;->b:Lokhttp3/Protocol;

    .line 9
    .line 10
    iput-object v0, p0, Lokhttp3/Response;->b:Lokhttp3/Protocol;

    .line 11
    .line 12
    iget v0, p1, Lokhttp3/Response$Builder;->c:I

    .line 13
    .line 14
    iput v0, p0, Lokhttp3/Response;->c:I

    .line 15
    .line 16
    iget-object v0, p1, Lokhttp3/Response$Builder;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-object v0, p0, Lokhttp3/Response;->d:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v0, p1, Lokhttp3/Response$Builder;->e:Lokhttp3/Handshake;

    .line 21
    .line 22
    iput-object v0, p0, Lokhttp3/Response;->e:Lokhttp3/Handshake;

    .line 23
    .line 24
    iget-object v0, p1, Lokhttp3/Response$Builder;->f:Lokhttp3/Headers$Builder;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v1, Lokhttp3/Headers;

    .line 30
    .line 31
    invoke-direct {v1, v0}, Lokhttp3/Headers;-><init>(Lokhttp3/Headers$Builder;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    .line 35
    .line 36
    iget-object v0, p1, Lokhttp3/Response$Builder;->g:Lokhttp3/ResponseBody;

    .line 37
    .line 38
    iput-object v0, p0, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    .line 39
    .line 40
    iget-object v0, p1, Lokhttp3/Response$Builder;->h:Lokhttp3/Response;

    .line 41
    .line 42
    iput-object v0, p0, Lokhttp3/Response;->p:Lokhttp3/Response;

    .line 43
    .line 44
    iget-object v0, p1, Lokhttp3/Response$Builder;->i:Lokhttp3/Response;

    .line 45
    .line 46
    iput-object v0, p0, Lokhttp3/Response;->q:Lokhttp3/Response;

    .line 47
    .line 48
    iget-object v0, p1, Lokhttp3/Response$Builder;->j:Lokhttp3/Response;

    .line 49
    .line 50
    iput-object v0, p0, Lokhttp3/Response;->r:Lokhttp3/Response;

    .line 51
    .line 52
    iget-wide v0, p1, Lokhttp3/Response$Builder;->k:J

    .line 53
    .line 54
    iput-wide v0, p0, Lokhttp3/Response;->s:J

    .line 55
    .line 56
    iget-wide v0, p1, Lokhttp3/Response$Builder;->l:J

    .line 57
    .line 58
    iput-wide v0, p0, Lokhttp3/Response;->t:J

    .line 59
    .line 60
    return-void
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method


# virtual methods
.method public final close()V
    .locals 2

    iget-object v0, p0, Lokhttp3/Response;->o:Lokhttp3/ResponseBody;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lokhttp3/ResponseBody;->close()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "response is not eligible for a body and must not be closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f()Lokhttp3/CacheControl;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->u:Lokhttp3/CacheControl;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    invoke-static {v0}, Lokhttp3/CacheControl;->a(Lokhttp3/Headers;)Lokhttp3/CacheControl;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/Response;->u:Lokhttp3/CacheControl;

    :goto_0
    return-object v0
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lokhttp3/Response;->f:Lokhttp3/Headers;

    invoke-virtual {v0, p1}, Lokhttp3/Headers;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "Response{protocol="

    .line 2
    .line 3
    invoke-static {v0}, Lf;->l(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lokhttp3/Response;->b:Lokhttp3/Protocol;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    const-string v1, ", code="

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    iget v1, p0, Lokhttp3/Response;->c:I

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, ", message="

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lokhttp3/Response;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v1, ", url="

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lokhttp3/Response;->a:Lokhttp3/Request;

    .line 38
    .line 39
    iget-object v1, v1, Lokhttp3/Request;->a:Lokhttp3/HttpUrl;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 v1, 0x7d

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method
