.class public final Lo7/j;
.super Lo7/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/l<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">.b<",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lo7/l;


# direct methods
.method public constructor <init>(Lo7/l;)V
    .locals 0

    iput-object p1, p0, Lo7/j;->e:Lo7/l;

    invoke-direct {p0, p1}, Lo7/l$b;-><init>(Lo7/l;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lo7/l$d;

    iget-object v1, p0, Lo7/j;->e:Lo7/l;

    invoke-direct {v0, v1, p1}, Lo7/l$d;-><init>(Lo7/l;I)V

    return-object v0
.end method
