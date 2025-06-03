.class public final Lk3/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/i;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lh3/c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lk3/s;

.field public final c:Lk3/v;


# direct methods
.method public constructor <init>(Ljava/util/Set;Lk3/j;Lk3/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk3/t;->a:Ljava/util/Set;

    iput-object p2, p0, Lk3/t;->b:Lk3/s;

    iput-object p3, p0, Lk3/t;->c:Lk3/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lh3/c;Lh3/g;)Lk3/u;
    .locals 7

    iget-object v0, p0, Lk3/t;->a:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lk3/u;

    iget-object v2, p0, Lk3/t;->b:Lk3/s;

    iget-object v6, p0, Lk3/t;->c:Lk3/v;

    move-object v1, v0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lk3/u;-><init>(Lk3/s;Ljava/lang/String;Lh3/c;Lh3/g;Lk3/v;)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p3, 0x2

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const/4 p2, 0x1

    iget-object v0, p0, Lk3/t;->a:Ljava/util/Set;

    aput-object v0, p3, p2

    const-string p2, "%s is not supported byt this factory. Supported encodings are: %s."

    invoke-static {p2, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
