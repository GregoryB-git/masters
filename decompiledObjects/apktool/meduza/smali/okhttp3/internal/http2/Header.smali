.class public final Lokhttp3/internal/http2/Header;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http2/Header$Listener;
    }
.end annotation


# static fields
.field public static final d:Lxc/i;

.field public static final e:Lxc/i;

.field public static final f:Lxc/i;

.field public static final g:Lxc/i;

.field public static final h:Lxc/i;

.field public static final i:Lxc/i;


# instance fields
.field public final a:Lxc/i;

.field public final b:Lxc/i;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lxc/i;->d:Lxc/i;

    .line 2
    .line 3
    const-string v0, ":"

    .line 4
    .line 5
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lokhttp3/internal/http2/Header;->d:Lxc/i;

    .line 10
    .line 11
    const-string v0, ":status"

    .line 12
    .line 13
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lokhttp3/internal/http2/Header;->e:Lxc/i;

    .line 18
    .line 19
    const-string v0, ":method"

    .line 20
    .line 21
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lokhttp3/internal/http2/Header;->f:Lxc/i;

    .line 26
    .line 27
    const-string v0, ":path"

    .line 28
    .line 29
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, Lokhttp3/internal/http2/Header;->g:Lxc/i;

    .line 34
    .line 35
    const-string v0, ":scheme"

    .line 36
    .line 37
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lokhttp3/internal/http2/Header;->h:Lxc/i;

    .line 42
    .line 43
    const-string v0, ":authority"

    .line 44
    .line 45
    invoke-static {v0}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lokhttp3/internal/http2/Header;->i:Lxc/i;

    .line 50
    .line 51
    return-void
    .line 52
    .line 53
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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lxc/i;->d:Lxc/i;

    invoke-static {p1}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    move-result-object p1

    invoke-static {p2}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    move-result-object p2

    .line 2
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http2/Header;-><init>(Lxc/i;Lxc/i;)V

    return-void
.end method

.method public constructor <init>(Lxc/i;Ljava/lang/String;)V
    .locals 1

    .line 3
    sget-object v0, Lxc/i;->d:Lxc/i;

    invoke-static {p2}, Lxc/i$a;->a(Ljava/lang/String;)Lxc/i;

    move-result-object p2

    .line 4
    invoke-direct {p0, p1, p2}, Lokhttp3/internal/http2/Header;-><init>(Lxc/i;Lxc/i;)V

    return-void
.end method

.method public constructor <init>(Lxc/i;Lxc/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    iput-object p2, p0, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    .line 5
    invoke-virtual {p1}, Lxc/i;->i()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lxc/i;->i()I

    move-result p2

    add-int/2addr p2, p1

    .line 6
    iput p2, p0, Lokhttp3/internal/http2/Header;->c:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lokhttp3/internal/http2/Header;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lokhttp3/internal/http2/Header;

    iget-object v0, p0, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    iget-object v2, p1, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    invoke-virtual {v0, v2}, Lxc/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    iget-object p1, p1, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    invoke-virtual {v0, p1}, Lxc/i;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    invoke-virtual {v0}, Lxc/i;->hashCode()I

    move-result v0

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    invoke-virtual {v1}, Lxc/i;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lokhttp3/internal/http2/Header;->a:Lxc/i;

    invoke-virtual {v1}, Lxc/i;->t()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lokhttp3/internal/http2/Header;->b:Lxc/i;

    invoke-virtual {v1}, Lxc/i;->t()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%s: %s"

    invoke-static {v1, v0}, Lokhttp3/internal/Util;->l(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
