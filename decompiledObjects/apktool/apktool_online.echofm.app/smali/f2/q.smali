.class public final Lf2/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc2/g;


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lf2/p;

.field public final c:Lf2/t;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lf2/p;Lf2/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf2/q;->a:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p2, p0, Lf2/q;->b:Lf2/p;

    .line 7
    .line 8
    iput-object p3, p0, Lf2/q;->c:Lf2/t;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;Lc2/b;Lc2/e;)Lc2/f;
    .locals 6

    .line 1
    iget-object p2, p0, Lf2/q;->a:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    new-instance p2, Lf2/s;

    .line 10
    .line 11
    iget-object v1, p0, Lf2/q;->b:Lf2/p;

    .line 12
    .line 13
    iget-object v5, p0, Lf2/q;->c:Lf2/t;

    .line 14
    .line 15
    move-object v0, p2

    .line 16
    move-object v2, p1

    .line 17
    move-object v3, p3

    .line 18
    move-object v4, p4

    .line 19
    invoke-direct/range {v0 .. v5}, Lf2/s;-><init>(Lf2/p;Ljava/lang/String;Lc2/b;Lc2/e;Lf2/t;)V

    .line 20
    .line 21
    .line 22
    return-object p2

    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    iget-object p2, p0, Lf2/q;->a:Ljava/util/Set;

    .line 26
    .line 27
    const/4 p4, 0x2

    .line 28
    new-array p4, p4, [Ljava/lang/Object;

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    aput-object p3, p4, v0

    .line 32
    .line 33
    const/4 p3, 0x1

    .line 34
    aput-object p2, p4, p3

    .line 35
    .line 36
    const-string p2, "%s is not supported byt this factory. Supported encodings are: %s."

    .line 37
    .line 38
    invoke-static {p2, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1
.end method
