.class public final Lo7/i;
.super Lo7/l$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo7/l<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        ">.b<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic e:Lo7/l;


# direct methods
.method public constructor <init>(Lo7/l;)V
    .locals 0

    iput-object p1, p0, Lo7/i;->e:Lo7/l;

    invoke-direct {p0, p1}, Lo7/l$b;-><init>(Lo7/l;)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lo7/i;->e:Lo7/l;

    invoke-virtual {v0, p1}, Lo7/l;->d(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
