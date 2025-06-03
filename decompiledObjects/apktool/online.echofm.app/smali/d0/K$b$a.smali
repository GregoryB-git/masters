.class public final Ld0/K$b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/K$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ld0/K$b$a;->a:I

    .line 6
    .line 7
    iput-boolean v0, p0, Ld0/K$b$a;->b:Z

    .line 8
    .line 9
    iput-boolean v0, p0, Ld0/K$b$a;->c:Z

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic a(Ld0/K$b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/K$b$a;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ld0/K$b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$b$a;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Ld0/K$b$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ld0/K$b$a;->c:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public d()Ld0/K$b;
    .locals 2

    .line 1
    new-instance v0, Ld0/K$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ld0/K$b;-><init>(Ld0/K$b$a;Ld0/K$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public e(I)Ld0/K$b$a;
    .locals 0

    .line 1
    iput p1, p0, Ld0/K$b$a;->a:I

    .line 2
    .line 3
    return-object p0
.end method

.method public f(Z)Ld0/K$b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld0/K$b$a;->b:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public g(Z)Ld0/K$b$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Ld0/K$b$a;->c:Z

    .line 2
    .line 3
    return-object p0
.end method
