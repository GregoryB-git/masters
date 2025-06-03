.class public final Lk0/w$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public A:J

.field public B:Z

.field public C:Z

.field public D:Landroid/os/Looper;

.field public E:Z

.field public F:Z

.field public G:Ljava/lang/String;

.field public H:Z

.field public final a:Landroid/content/Context;

.field public b:Lg0/c;

.field public c:J

.field public d:LW2/s;

.field public e:LW2/s;

.field public f:LW2/s;

.field public g:LW2/s;

.field public h:LW2/s;

.field public i:LW2/g;

.field public j:Landroid/os/Looper;

.field public k:I

.field public l:Ld0/b;

.field public m:Z

.field public n:I

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:I

.field public s:I

.field public t:Z

.field public u:Lk0/d1;

.field public v:J

.field public w:J

.field public x:J

.field public y:Lk0/w0;

.field public z:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    new-instance v0, Lk0/y;

    invoke-direct {v0, p1}, Lk0/y;-><init>(Landroid/content/Context;)V

    new-instance v1, Lk0/z;

    invoke-direct {v1, p1}, Lk0/z;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, p1, v0, v1}, Lk0/w$b;-><init>(Landroid/content/Context;LW2/s;LW2/s;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LW2/s;LW2/s;)V
    .locals 8

    .line 2
    new-instance v4, Lk0/A;

    invoke-direct {v4, p1}, Lk0/A;-><init>(Landroid/content/Context;)V

    new-instance v5, Lk0/B;

    invoke-direct {v5}, Lk0/B;-><init>()V

    new-instance v6, Lk0/C;

    invoke-direct {v6, p1}, Lk0/C;-><init>(Landroid/content/Context;)V

    new-instance v7, Lk0/D;

    invoke-direct {v7}, Lk0/D;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, Lk0/w$b;-><init>(Landroid/content/Context;LW2/s;LW2/s;LW2/s;LW2/s;LW2/s;LW2/g;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LW2/s;LW2/s;LW2/s;LW2/s;LW2/s;LW2/g;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    iput-object p1, p0, Lk0/w$b;->a:Landroid/content/Context;

    iput-object p2, p0, Lk0/w$b;->d:LW2/s;

    iput-object p3, p0, Lk0/w$b;->e:LW2/s;

    iput-object p4, p0, Lk0/w$b;->f:LW2/s;

    iput-object p5, p0, Lk0/w$b;->g:LW2/s;

    iput-object p6, p0, Lk0/w$b;->h:LW2/s;

    iput-object p7, p0, Lk0/w$b;->i:LW2/g;

    invoke-static {}, Lg0/M;->U()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, Lk0/w$b;->j:Landroid/os/Looper;

    sget-object p1, Ld0/b;->g:Ld0/b;

    iput-object p1, p0, Lk0/w$b;->l:Ld0/b;

    const/4 p1, 0x0

    iput p1, p0, Lk0/w$b;->n:I

    const/4 p2, 0x1

    iput p2, p0, Lk0/w$b;->r:I

    iput p1, p0, Lk0/w$b;->s:I

    iput-boolean p2, p0, Lk0/w$b;->t:Z

    sget-object p1, Lk0/d1;->g:Lk0/d1;

    iput-object p1, p0, Lk0/w$b;->u:Lk0/d1;

    const-wide/16 p3, 0x1388

    iput-wide p3, p0, Lk0/w$b;->v:J

    const-wide/16 p3, 0x3a98

    iput-wide p3, p0, Lk0/w$b;->w:J

    const-wide/16 p3, 0xbb8

    iput-wide p3, p0, Lk0/w$b;->x:J

    new-instance p1, Lk0/q$b;

    invoke-direct {p1}, Lk0/q$b;-><init>()V

    invoke-virtual {p1}, Lk0/q$b;->a()Lk0/q;

    move-result-object p1

    iput-object p1, p0, Lk0/w$b;->y:Lk0/w0;

    sget-object p1, Lg0/c;->a:Lg0/c;

    iput-object p1, p0, Lk0/w$b;->b:Lg0/c;

    const-wide/16 p3, 0x1f4

    iput-wide p3, p0, Lk0/w$b;->z:J

    const-wide/16 p3, 0x7d0

    iput-wide p3, p0, Lk0/w$b;->A:J

    iput-boolean p2, p0, Lk0/w$b;->C:Z

    const-string p1, ""

    iput-object p1, p0, Lk0/w$b;->G:Ljava/lang/String;

    const/16 p1, -0x3e8

    iput p1, p0, Lk0/w$b;->k:I

    return-void
.end method

.method public static synthetic a(Landroid/content/Context;)Lk0/c1;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/w$b;->g(Landroid/content/Context;)Lk0/c1;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;)Lx0/x$a;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/w$b;->h(Landroid/content/Context;)Lx0/x$a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Lk0/x0;)Lk0/x0;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/w$b;->k(Lk0/x0;)Lk0/x0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;)LB0/e;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/w$b;->j(Landroid/content/Context;)LB0/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;)LA0/D;
    .locals 0

    .line 1
    invoke-static {p0}, Lk0/w$b;->i(Landroid/content/Context;)LA0/D;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic g(Landroid/content/Context;)Lk0/c1;
    .locals 1

    .line 1
    new-instance v0, Lk0/t;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk0/t;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic h(Landroid/content/Context;)Lx0/x$a;
    .locals 2

    .line 1
    new-instance v0, Lx0/n;

    .line 2
    .line 3
    new-instance v1, LF0/m;

    .line 4
    .line 5
    invoke-direct {v1}, LF0/m;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lx0/n;-><init>(Landroid/content/Context;LF0/x;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic i(Landroid/content/Context;)LA0/D;
    .locals 1

    .line 1
    new-instance v0, LA0/n;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LA0/n;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic j(Landroid/content/Context;)LB0/e;
    .locals 0

    .line 1
    invoke-static {p0}, LB0/j;->n(Landroid/content/Context;)LB0/j;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k(Lk0/x0;)Lk0/x0;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public f()Lk0/w;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lk0/w$b;->E:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    xor-int/2addr v0, v1

    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    iput-boolean v1, p0, Lk0/w$b;->E:Z

    .line 9
    .line 10
    new-instance v0, Lk0/f0;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {v0, p0, v1}, Lk0/f0;-><init>(Lk0/w$b;Ld0/D;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public l(Lk0/w0;)Lk0/w$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/w$b;->E:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lk0/w0;

    .line 13
    .line 14
    iput-object p1, p0, Lk0/w$b;->y:Lk0/w0;

    .line 15
    .line 16
    return-object p0
.end method

.method public m(Lk0/x0;)Lk0/w$b;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lk0/w$b;->E:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-static {v0}, Lg0/a;->f(Z)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lg0/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    new-instance v0, Lk0/x;

    .line 12
    .line 13
    invoke-direct {v0, p1}, Lk0/x;-><init>(Lk0/x0;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lk0/w$b;->g:LW2/s;

    .line 17
    .line 18
    return-object p0
.end method
