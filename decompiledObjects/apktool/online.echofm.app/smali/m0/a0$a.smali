.class public Lm0/a0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, 0x3d090

    .line 5
    .line 6
    .line 7
    iput v0, p0, Lm0/a0$a;->a:I

    .line 8
    .line 9
    const v1, 0xb71b0

    .line 10
    .line 11
    .line 12
    iput v1, p0, Lm0/a0$a;->b:I

    .line 13
    .line 14
    const/4 v1, 0x4

    .line 15
    iput v1, p0, Lm0/a0$a;->c:I

    .line 16
    .line 17
    iput v0, p0, Lm0/a0$a;->d:I

    .line 18
    .line 19
    const v0, 0x2faf080

    .line 20
    .line 21
    .line 22
    iput v0, p0, Lm0/a0$a;->e:I

    .line 23
    .line 24
    const/4 v0, 0x2

    .line 25
    iput v0, p0, Lm0/a0$a;->f:I

    .line 26
    .line 27
    iput v1, p0, Lm0/a0$a;->g:I

    .line 28
    .line 29
    return-void
.end method

.method public static synthetic a(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->d:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic e(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic g(Lm0/a0$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lm0/a0$a;->g:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public h()Lm0/a0;
    .locals 1

    .line 1
    new-instance v0, Lm0/a0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm0/a0;-><init>(Lm0/a0$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
