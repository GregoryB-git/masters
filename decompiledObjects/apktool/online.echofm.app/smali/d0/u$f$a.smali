.class public final Ld0/u$f$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Ljava/util/UUID;

.field public b:Landroid/net/Uri;

.field public c:LX2/w;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:LX2/v;

.field public h:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, LX2/w;->j()LX2/w;

    move-result-object v0

    iput-object v0, p0, Ld0/u$f$a;->c:LX2/w;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ld0/u$f$a;->e:Z

    invoke-static {}, LX2/v;->Y()LX2/v;

    move-result-object v0

    iput-object v0, p0, Ld0/u$f$a;->g:LX2/v;

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ld0/u$f$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Ld0/u$f;)V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Ld0/u$f;->a:Ljava/util/UUID;

    iput-object v0, p0, Ld0/u$f$a;->a:Ljava/util/UUID;

    iget-object v0, p1, Ld0/u$f;->c:Landroid/net/Uri;

    iput-object v0, p0, Ld0/u$f$a;->b:Landroid/net/Uri;

    iget-object v0, p1, Ld0/u$f;->e:LX2/w;

    iput-object v0, p0, Ld0/u$f$a;->c:LX2/w;

    iget-boolean v0, p1, Ld0/u$f;->f:Z

    iput-boolean v0, p0, Ld0/u$f$a;->d:Z

    iget-boolean v0, p1, Ld0/u$f;->g:Z

    iput-boolean v0, p0, Ld0/u$f$a;->e:Z

    iget-boolean v0, p1, Ld0/u$f;->h:Z

    iput-boolean v0, p0, Ld0/u$f$a;->f:Z

    iget-object v0, p1, Ld0/u$f;->j:LX2/v;

    iput-object v0, p0, Ld0/u$f$a;->g:LX2/v;

    invoke-static {p1}, Ld0/u$f;->a(Ld0/u$f;)[B

    move-result-object p1

    iput-object p1, p0, Ld0/u$f$a;->h:[B

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u$f;Ld0/u$a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1}, Ld0/u$f$a;-><init>(Ld0/u$f;)V

    return-void
.end method

.method public static synthetic a(Ld0/u$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$f$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ld0/u$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$f$a;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Ld0/u$f$a;)LX2/v;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$f$a;->g:LX2/v;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Ld0/u$f$a;)[B
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$f$a;->h:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Ld0/u$f$a;)Landroid/net/Uri;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$f$a;->b:Landroid/net/Uri;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic f(Ld0/u$f$a;)Ljava/util/UUID;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$f$a;->a:Ljava/util/UUID;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic g(Ld0/u$f$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$f$a;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic h(Ld0/u$f$a;)LX2/w;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/u$f$a;->c:LX2/w;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public i()Ld0/u$f;
    .locals 2

    .line 1
    new-instance v0, Ld0/u$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/u$f;-><init>(Ld0/u$f$a;Ld0/u$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
