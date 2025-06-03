.class public final Ld0/l$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld0/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public b:I

.field public c:I

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Ld0/l$b;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic a(Ld0/l$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/l$b;->a:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Ld0/l$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/l$b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Ld0/l$b;)I
    .locals 0

    .line 1
    iget p0, p0, Ld0/l$b;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Ld0/l$b;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ld0/l$b;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public e()Ld0/l;
    .locals 2

    .line 1
    iget v0, p0, Ld0/l$b;->b:I

    .line 2
    .line 3
    iget v1, p0, Ld0/l$b;->c:I

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    invoke-static {v0}, Lg0/a;->a(Z)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ld0/l;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, p0, v1}, Ld0/l;-><init>(Ld0/l$b;Ld0/l$a;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public f(I)Ld0/l$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/l$b;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public g(I)Ld0/l$b;
    .locals 0

    .line 1
    iput p1, p0, Ld0/l$b;->b:I

    .line 2
    .line 3
    return-object p0
.end method
