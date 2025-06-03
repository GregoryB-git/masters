.class public Lz2/m$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Lz2/k;

.field public b:Z

.field public c:[Lx2/d;

.field public d:I


# direct methods
.method public synthetic constructor <init>(Lz2/O;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lz2/m$a;->b:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput p1, p0, Lz2/m$a;->d:I

    .line 9
    .line 10
    return-void
.end method

.method public static bridge synthetic e(Lz2/m$a;)Lz2/k;
    .locals 0

    .line 1
    iget-object p0, p0, Lz2/m$a;->a:Lz2/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Lz2/m;
    .locals 4

    .line 1
    iget-object v0, p0, Lz2/m$a;->a:Lz2/k;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "execute parameter required"

    .line 9
    .line 10
    invoke-static {v0, v1}, LA2/n;->b(ZLjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lz2/N;

    .line 14
    .line 15
    iget-object v1, p0, Lz2/m$a;->c:[Lx2/d;

    .line 16
    .line 17
    iget-boolean v2, p0, Lz2/m$a;->b:Z

    .line 18
    .line 19
    iget v3, p0, Lz2/m$a;->d:I

    .line 20
    .line 21
    invoke-direct {v0, p0, v1, v2, v3}, Lz2/N;-><init>(Lz2/m$a;[Lx2/d;ZI)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public b(Lz2/k;)Lz2/m$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/m$a;->a:Lz2/k;

    .line 2
    .line 3
    return-object p0
.end method

.method public c(Z)Lz2/m$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lz2/m$a;->b:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public varargs d([Lx2/d;)Lz2/m$a;
    .locals 0

    .line 1
    iput-object p1, p0, Lz2/m$a;->c:[Lx2/d;

    .line 2
    .line 3
    return-object p0
.end method
