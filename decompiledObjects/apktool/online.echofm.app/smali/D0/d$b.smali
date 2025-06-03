.class public final LD0/d$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD0/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:LD0/q;

.field public c:Ld0/N$a;

.field public d:Ld0/F$a;

.field public e:Lg0/c;

.field public f:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;LD0/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LD0/d$b;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LD0/d$b;->b:LD0/q;

    .line 11
    .line 12
    sget-object p1, Lg0/c;->a:Lg0/c;

    .line 13
    .line 14
    iput-object p1, p0, LD0/d$b;->e:Lg0/c;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(LD0/d$b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(LD0/d$b;)Lg0/c;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d$b;->e:Lg0/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(LD0/d$b;)LD0/q;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d$b;->b:LD0/q;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(LD0/d$b;)Ld0/F$a;
    .locals 0

    .line 1
    iget-object p0, p0, LD0/d$b;->d:Ld0/F$a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()LD0/d;
    .locals 4

    .line 1
    iget-boolean v0, p0, LD0/d$b;->f:Z

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
    iget-object v0, p0, LD0/d$b;->d:Ld0/F$a;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, LD0/d$b;->c:Ld0/N$a;

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, LD0/d$e;

    .line 18
    .line 19
    invoke-direct {v0, v2}, LD0/d$e;-><init>(LD0/d$a;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, LD0/d$b;->c:Ld0/N$a;

    .line 23
    .line 24
    :cond_0
    new-instance v0, LD0/d$f;

    .line 25
    .line 26
    iget-object v3, p0, LD0/d$b;->c:Ld0/N$a;

    .line 27
    .line 28
    invoke-direct {v0, v3}, LD0/d$f;-><init>(Ld0/N$a;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, LD0/d$b;->d:Ld0/F$a;

    .line 32
    .line 33
    :cond_1
    new-instance v0, LD0/d;

    .line 34
    .line 35
    invoke-direct {v0, p0, v2}, LD0/d;-><init>(LD0/d$b;LD0/d$a;)V

    .line 36
    .line 37
    .line 38
    iput-boolean v1, p0, LD0/d$b;->f:Z

    .line 39
    .line 40
    return-object v0
.end method

.method public f(Lg0/c;)LD0/d$b;
    .locals 0

    .line 1
    iput-object p1, p0, LD0/d$b;->e:Lg0/c;

    .line 2
    .line 3
    return-object p0
.end method
