.class public final Ld0/u$g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/u$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:F

.field public e:F


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Ld0/u$g$a;->a:J

    iput-wide v0, p0, Ld0/u$g$a;->b:J

    iput-wide v0, p0, Ld0/u$g$a;->c:J

    const v0, -0x800001

    iput v0, p0, Ld0/u$g$a;->d:F

    iput v0, p0, Ld0/u$g$a;->e:F

    return-void
.end method

.method public constructor <init>(Ld0/u$g;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-wide v0, p1, Ld0/u$g;->a:J

    iput-wide v0, p0, Ld0/u$g$a;->a:J

    iget-wide v0, p1, Ld0/u$g;->b:J

    iput-wide v0, p0, Ld0/u$g$a;->b:J

    iget-wide v0, p1, Ld0/u$g;->c:J

    iput-wide v0, p0, Ld0/u$g$a;->c:J

    iget v0, p1, Ld0/u$g;->d:F

    iput v0, p0, Ld0/u$g$a;->d:F

    iget p1, p1, Ld0/u$g;->e:F

    iput p1, p0, Ld0/u$g$a;->e:F

    return-void
.end method

.method public synthetic constructor <init>(Ld0/u$g;Ld0/u$a;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ld0/u$g$a;-><init>(Ld0/u$g;)V

    return-void
.end method

.method public static synthetic a(Ld0/u$g$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/u$g$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic b(Ld0/u$g$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/u$g$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic c(Ld0/u$g$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Ld0/u$g$a;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic d(Ld0/u$g$a;)F
    .locals 0

    .line 1
    iget p0, p0, Ld0/u$g$a;->d:F

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Ld0/u$g$a;)F
    .locals 0

    .line 1
    iget p0, p0, Ld0/u$g$a;->e:F

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public f()Ld0/u$g;
    .locals 2

    .line 1
    new-instance v0, Ld0/u$g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/u$g;-><init>(Ld0/u$g$a;Ld0/u$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public g(J)Ld0/u$g$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Ld0/u$g$a;->c:J

    .line 2
    .line 3
    return-object p0
.end method

.method public h(F)Ld0/u$g$a;
    .locals 0

    .line 1
    iput p1, p0, Ld0/u$g$a;->e:F

    .line 2
    .line 3
    return-object p0
.end method

.method public i(J)Ld0/u$g$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Ld0/u$g$a;->b:J

    .line 2
    .line 3
    return-object p0
.end method

.method public j(F)Ld0/u$g$a;
    .locals 0

    .line 1
    iput p1, p0, Ld0/u$g$a;->d:F

    .line 2
    .line 3
    return-object p0
.end method

.method public k(J)Ld0/u$g$a;
    .locals 0

    .line 1
    iput-wide p1, p0, Ld0/u$g$a;->a:J

    .line 2
    .line 3
    return-object p0
.end method
