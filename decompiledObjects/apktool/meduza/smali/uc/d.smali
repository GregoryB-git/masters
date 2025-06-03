.class public final Luc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Luc/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Q:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Luc/c<",
        "TQ;>;"
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ldc/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/q<",
            "Ljava/lang/Object;",
            "Luc/f<",
            "*>;",
            "Ljava/lang/Object;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldc/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/q<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ldc/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/q<",
            "Luc/f<",
            "*>;",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ldc/l<",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnc/r;Ldc/q;Ldc/q;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc/d;->a:Ljava/lang/Object;

    iput-object p2, p0, Luc/d;->b:Ldc/q;

    iput-object p3, p0, Luc/d;->c:Ldc/q;

    iput-object v0, p0, Luc/d;->d:Ldc/q;

    return-void
.end method
