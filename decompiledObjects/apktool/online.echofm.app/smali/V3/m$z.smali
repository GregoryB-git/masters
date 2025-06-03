.class public LV3/m$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "z"
.end annotation


# instance fields
.field public o:LV3/k;

.field public p:LQ3/r$b;

.field public q:LQ3/s;

.field public r:LV3/m$A;

.field public s:J

.field public t:Z

.field public u:I

.field public v:LQ3/c;

.field public w:J

.field public x:Ld4/n;

.field public y:Ld4/n;

.field public z:Ld4/n;


# direct methods
.method public constructor <init>(LV3/k;LQ3/r$b;LQ3/s;LV3/m$A;ZJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV3/m$z;->o:LV3/k;

    iput-object p2, p0, LV3/m$z;->p:LQ3/r$b;

    iput-object p3, p0, LV3/m$z;->q:LQ3/s;

    iput-object p4, p0, LV3/m$z;->r:LV3/m$A;

    const/4 p1, 0x0

    iput p1, p0, LV3/m$z;->u:I

    iput-boolean p5, p0, LV3/m$z;->t:Z

    iput-wide p6, p0, LV3/m$z;->s:J

    const/4 p1, 0x0

    iput-object p1, p0, LV3/m$z;->v:LQ3/c;

    iput-object p1, p0, LV3/m$z;->x:Ld4/n;

    iput-object p1, p0, LV3/m$z;->y:Ld4/n;

    iput-object p1, p0, LV3/m$z;->z:Ld4/n;

    return-void
.end method

.method public synthetic constructor <init>(LV3/k;LQ3/r$b;LQ3/s;LV3/m$A;ZJLV3/m$k;)V
    .locals 0

    .line 2
    invoke-direct/range {p0 .. p7}, LV3/m$z;-><init>(LV3/k;LQ3/r$b;LQ3/s;LV3/m$A;ZJ)V

    return-void
.end method

.method public static synthetic C(LV3/m$z;)LQ3/c;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->v:LQ3/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic D(LV3/m$z;LQ3/c;)LQ3/c;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$z;->v:LQ3/c;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic F(LV3/m$z;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LV3/m$z;->t:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(LV3/m$z;)Ld4/n;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->x:Ld4/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(LV3/m$z;Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$z;->x:Ld4/n;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic h(LV3/m$z;)Ld4/n;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->y:Ld4/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(LV3/m$z;Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$z;->y:Ld4/n;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic l(LV3/m$z;)Ld4/n;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->z:Ld4/n;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic m(LV3/m$z;Ld4/n;)Ld4/n;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$z;->z:Ld4/n;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic n(LV3/m$z;)LV3/m$A;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->r:LV3/m$A;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic o(LV3/m$z;LV3/m$A;)LV3/m$A;
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$z;->r:LV3/m$A;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic p(LV3/m$z;)J
    .locals 2

    .line 1
    iget-wide v0, p0, LV3/m$z;->w:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic r(LV3/m$z;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/m$z;->w:J

    .line 2
    .line 3
    return-wide p1
.end method

.method public static synthetic s(LV3/m$z;)I
    .locals 0

    .line 1
    iget p0, p0, LV3/m$z;->u:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic u(LV3/m$z;)I
    .locals 2

    .line 1
    iget v0, p0, LV3/m$z;->u:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, LV3/m$z;->u:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic w(LV3/m$z;)LV3/k;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->o:LV3/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic x(LV3/m$z;)LQ3/r$b;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->p:LQ3/r$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic z(LV3/m$z;)LQ3/s;
    .locals 0

    .line 1
    iget-object p0, p0, LV3/m$z;->q:LQ3/s;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public G(LV3/m$z;)I
    .locals 4

    .line 1
    iget-wide v0, p0, LV3/m$z;->s:J

    .line 2
    .line 3
    iget-wide v2, p1, LV3/m$z;->s:J

    .line 4
    .line 5
    cmp-long p1, v0, v2

    .line 6
    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    :cond_0
    cmp-long p1, v0, v2

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    const/4 p1, 0x1

    .line 18
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, LV3/m$z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LV3/m$z;->G(LV3/m$z;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
