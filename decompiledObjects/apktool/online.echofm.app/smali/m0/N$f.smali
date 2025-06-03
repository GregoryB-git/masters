.class public final Lm0/N$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/N;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lm0/e;

.field public c:Le0/c;

.field public d:Z

.field public e:Z

.field public f:Z

.field public g:Lm0/N$e;

.field public h:Lm0/N$d;

.field public i:Lk0/w$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/N$f;->a:Landroid/content/Context;

    .line 5
    .line 6
    sget-object p1, Lm0/e;->c:Lm0/e;

    .line 7
    .line 8
    iput-object p1, p0, Lm0/N$f;->b:Lm0/e;

    .line 9
    .line 10
    sget-object p1, Lm0/N$e;->a:Lm0/N$e;

    .line 11
    .line 12
    iput-object p1, p0, Lm0/N$f;->g:Lm0/N$e;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic a(Lm0/N$f;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lm0/N$f;)Lk0/w$a;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->i:Lk0/w$a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lm0/N$f;)Lm0/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->b:Lm0/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Lm0/N$f;)Le0/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->c:Le0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic e(Lm0/N$f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm0/N$f;->d:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lm0/N$f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm0/N$f;->e:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lm0/N$f;)Lm0/N$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->g:Lm0/N$e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lm0/N$f;)Lm0/N$d;
    .locals 0

    .line 1
    iget-object p0, p0, Lm0/N$f;->h:Lm0/N$d;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public i()Lm0/N;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lm0/N$f;->f:Z

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
    iput-boolean v1, p0, Lm0/N$f;->f:Z

    .line 9
    .line 10
    iget-object v0, p0, Lm0/N$f;->c:Le0/c;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lm0/N$h;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    new-array v1, v1, [Le0/b;

    .line 18
    .line 19
    invoke-direct {v0, v1}, Lm0/N$h;-><init>([Le0/b;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lm0/N$f;->c:Le0/c;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lm0/N$f;->h:Lm0/N$d;

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Lm0/E;

    .line 29
    .line 30
    iget-object v1, p0, Lm0/N$f;->a:Landroid/content/Context;

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lm0/E;-><init>(Landroid/content/Context;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Lm0/N$f;->h:Lm0/N$d;

    .line 36
    .line 37
    :cond_1
    new-instance v0, Lm0/N;

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-direct {v0, p0, v1}, Lm0/N;-><init>(Lm0/N$f;Lm0/N$a;)V

    .line 41
    .line 42
    .line 43
    return-object v0
.end method

.method public j(Z)Lm0/N$f;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/N$f;->e:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public k(Z)Lm0/N$f;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm0/N$f;->d:Z

    .line 2
    .line 3
    return-object p0
.end method
