.class public final Ly2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb1/x;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lb1/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Object;"
        }
    .end annotation
.end field

.field public final synthetic b:La3/b;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lo/a;

.field public final synthetic e:Lb1/u;


# direct methods
.method public constructor <init>(La3/b;Ljava/lang/Object;Lp2/j0;Lb1/u;)V
    .locals 0

    iput-object p1, p0, Ly2/k;->b:La3/b;

    iput-object p2, p0, Ly2/k;->c:Ljava/lang/Object;

    iput-object p3, p0, Ly2/k;->d:Lo/a;

    iput-object p4, p0, Ly2/k;->e:Lb1/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-object p1, p0, Ly2/k;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Ly2/k;->b:La3/b;

    new-instance v1, Ly2/k$a;

    invoke-direct {v1, p0, p1}, Ly2/k$a;-><init>(Ly2/k;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, La3/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
