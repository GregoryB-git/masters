.class public Ld4/u;
.super Ld4/h;
.source "SourceFile"


# static fields
.field public static final o:Ld4/u;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld4/u;

    .line 2
    .line 3
    invoke-direct {v0}, Ld4/u;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld4/u;->o:Ld4/u;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ld4/h;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static j()Ld4/u;
    .locals 1

    .line 1
    sget-object v0, Ld4/u;->o:Ld4/u;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, ".value"

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Ld4/m;

    .line 2
    .line 3
    check-cast p2, Ld4/m;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ld4/u;->i(Ld4/m;Ld4/m;)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public e(Ld4/n;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    instance-of p1, p1, Ld4/u;

    .line 2
    .line 3
    return p1
.end method

.method public f(Ld4/b;Ld4/n;)Ld4/m;
    .locals 1

    .line 1
    new-instance v0, Ld4/m;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public g()Ld4/m;
    .locals 3

    .line 1
    new-instance v0, Ld4/m;

    .line 2
    .line 3
    invoke-static {}, Ld4/b;->m()Ld4/b;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Ld4/n;->l:Ld4/c;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Ld4/m;-><init>(Ld4/b;Ld4/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public i(Ld4/m;Ld4/m;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Ld4/m;->d()Ld4/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, Ld4/m;->d()Ld4/n;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ld4/m;->c()Ld4/b;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2}, Ld4/m;->c()Ld4/b;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p1, p2}, Ld4/b;->h(Ld4/b;)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "ValueIndex"

    .line 2
    .line 3
    return-object v0
.end method
