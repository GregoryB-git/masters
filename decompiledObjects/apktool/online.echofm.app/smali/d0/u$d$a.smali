.class public final Ld0/u$d$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:Z

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Ld0/u$d$a;->b:J

    return-void
.end method

.method public constructor <init>(Ld0/u$d;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Ld0/u$d;->b:J

    iput-wide v0, p0, Ld0/u$d$a;->a:J

    iget-wide v0, p1, Ld0/u$d;->d:J

    iput-wide v0, p0, Ld0/u$d$a;->b:J

    iget-boolean v0, p1, Ld0/u$d;->e:Z

    iput-boolean v0, p0, Ld0/u$d$a;->c:Z

    iget-boolean v0, p1, Ld0/u$d;->f:Z

    iput-boolean v0, p0, Ld0/u$d$a;->d:Z

    iget-boolean p1, p1, Ld0/u$d;->g:Z

    iput-boolean p1, p0, Ld0/u$d$a;->e:Z

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u$d;Ld0/u$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld0/u$d$a;-><init>(Ld0/u$d;)V

    return-void
.end method

.method public static synthetic a(Ld0/u$d$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/u$d$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic b(Ld0/u$d$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/u$d$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic c(Ld0/u$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$d$a;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Ld0/u$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$d$a;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Ld0/u$d$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/u$d$a;->e:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public f()Ld0/u$d;
    .locals 2

    .line 1
    new-instance v0, Ld0/u$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/u$d;-><init>(Ld0/u$d$a;Ld0/u$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public g()Ld0/u$e;
    .locals 2

    .line 1
    new-instance v0, Ld0/u$e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/u$e;-><init>(Ld0/u$d$a;Ld0/u$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
