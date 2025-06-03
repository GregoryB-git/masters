.class public final Lp0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo0/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lo0/b<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Lo0/a;",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldc/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc/l<",
            "-",
            "Lo0/a;",
            "+TT;>;)V"
        }
    .end annotation

    const-string v0, "produceNewData"

    invoke-static {p1, v0}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/a;->a:Ldc/l;

    return-void
.end method


# virtual methods
.method public final a(Lo0/a;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lp0/a;->a:Ldc/l;

    invoke-interface {v0, p1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
