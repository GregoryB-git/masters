.class public final Lma/w$b;
.super Lma/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lma/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lma/w<",
        "TT;*>;>",
        "Lma/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lma/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lma/w;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Lma/b;-><init>()V

    iput-object p1, p0, Lma/w$b;->a:Lma/w;

    return-void
.end method
